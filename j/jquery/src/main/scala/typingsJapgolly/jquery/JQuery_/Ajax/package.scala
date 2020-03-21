package typingsJapgolly.jquery.JQuery_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Ajax {
  type CompleteCallback[TContext] = js.ThisFunction2[
    /* this */ TContext, 
    /* jqXHR */ typingsJapgolly.jquery.JQuery_.jqXHR[js.Any], 
    /* textStatus */ typingsJapgolly.jquery.JQuery_.Ajax.TextStatus, 
    scala.Unit
  ]
  type ErrorCallback[TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* jqXHR */ typingsJapgolly.jquery.JQuery_.jqXHR[js.Any], 
    /* textStatus */ typingsJapgolly.jquery.JQuery_.Ajax.ErrorTextStatus, 
    /* errorThrown */ java.lang.String, 
    scala.Unit
  ]
  type SuccessCallback[TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* data */ js.Any, 
    /* textStatus */ typingsJapgolly.jquery.JQuery_.Ajax.SuccessTextStatus, 
    /* jqXHR */ typingsJapgolly.jquery.JQuery_.jqXHR[js.Any], 
    scala.Unit
  ]
}
