package typingsJapgolly.cypress.JQuery_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Ajax {
  type CompleteCallback[TContext] = js.ThisFunction2[
    /* this */ TContext, 
    /* jqXHR */ typingsJapgolly.cypress.JQuery_.jqXHR[js.Any], 
    /* textStatus */ typingsJapgolly.cypress.JQuery_.Ajax.TextStatus, 
    scala.Unit
  ]
  type ErrorCallback[TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* jqXHR */ typingsJapgolly.cypress.JQuery_.jqXHR[js.Any], 
    /* textStatus */ typingsJapgolly.cypress.JQuery_.Ajax.ErrorTextStatus, 
    /* errorThrown */ java.lang.String, 
    scala.Unit
  ]
  type SuccessCallback[TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* data */ js.Any, 
    /* textStatus */ typingsJapgolly.cypress.JQuery_.Ajax.SuccessTextStatus, 
    /* jqXHR */ typingsJapgolly.cypress.JQuery_.jqXHR[js.Any], 
    scala.Unit
  ]
}
