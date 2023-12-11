import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BeerService {

  private apiUrl = 'http://localhost:8081/api/beers';


  constructor(private http: HttpClient) { }

  getBeers(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrl);
  }

  getBeer(id: number): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}/${id}`);
  }

  createBeer(beer: any): Observable<any> {
    return this.http.post<any>(this.apiUrl, beer);
  }

  updateBeer(id: number, beer: any): Observable<any> {
    return this.http.put<any>(`${this.apiUrl}/${id}`, beer);
  }

  deleteBeer(id: number): Observable<any> {
    return this.http.delete<any>(`${this.apiUrl}/${id}`);
  }
}
