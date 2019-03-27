import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StatusCodeTableComponent } from './status-code-table.component';

describe('StatusCodeTableComponent', () => {
  let component: StatusCodeTableComponent;
  let fixture: ComponentFixture<StatusCodeTableComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StatusCodeTableComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StatusCodeTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
