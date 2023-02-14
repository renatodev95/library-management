import { NgModule } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatTableModule } from '@angular/material/table';
import { MatToolbarModule } from '@angular/material/toolbar';


@NgModule({
  exports: [
    MatGridListModule,
    MatCardModule,
    MatPaginatorModule,
    MatTableModule,
    MatToolbarModule
  ]
})
export class AppMaterialModule { }
