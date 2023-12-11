import { Component } from '@angular/core';
import { BeerService } from '../services/beer.service';

@Component({
  selector: 'app-dashbord',
  templateUrl: './dashbord.component.html',
  styleUrls: ['./dashbord.component.css']
})
export class DashbordComponent {
  beers: any[] = [];

  constructor(private beerService: BeerService) { }

  ngOnInit(): void {
    this.getBeers();
  }

  getBeers(): void {
    this.beerService.getBeers()
      .subscribe(beers => {
        this.beers = beers;
        console.log(beers);

      });
  }

}
