FROM node:18.17.0 AS builder
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build --prod


FROM nginx:alpine
COPY --from=builder /app/dist /usr/share/nginx/html
RUN rm /etc/nginx/conf.d/default.conf
COPY nginx/custom.conf /etc/nginx/conf.d
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]