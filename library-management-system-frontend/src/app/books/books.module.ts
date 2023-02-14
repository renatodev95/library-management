import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatPaginatorModule } from '@angular/material/paginator';

import { BooksRoutingModule } from './books-routing.module';
import { BooksComponent } from './books/books.component';
import {MatTableModule} from '@angular/material/table';


@NgModule({
  declarations: [
    BooksComponent
  ],
  imports: [
    CommonModule,
    BooksRoutingModule,
    MatGridListModule,
    MatCardModule,
    MatPaginatorModule,
    MatTableModule
  ]
})
export class BooksModule { }
