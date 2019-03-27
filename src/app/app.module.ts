import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {FormsModule} from '@angular/forms';
import { StatusCodeComponent } from './components/status-code/status-code.component';
import { StatusCodeTableComponent } from './components/status-code-table/status-code-table.component';


@NgModule({
  declarations: [
    AppComponent,
    StatusCodeComponent,
    StatusCodeTableComponent
  ],
  imports: [
    BrowserModule,
  FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
