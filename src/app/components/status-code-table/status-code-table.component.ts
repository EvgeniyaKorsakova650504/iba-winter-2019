import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-status-code-table',
  templateUrl: './status-code-table.component.html',
  styleUrls: ['./status-code-table.component.scss']
})
export class StatusCodeTableComponent implements OnInit {

 @Input() code;
  constructor() {
  }

  ngOnInit() {
  }

}
