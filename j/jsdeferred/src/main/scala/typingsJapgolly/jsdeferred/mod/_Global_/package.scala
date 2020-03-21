package typingsJapgolly.jsdeferred.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object _Global_ {
  type DeferredizedFunction = js.Function1[/* repeated */ js.Any, typingsJapgolly.jsdeferred.mod._Global_.Deferred]
  type DeferredizedFunctionWithNumber = js.Function1[/* n */ scala.Double, typingsJapgolly.jsdeferred.mod._Global_.Deferred]
  type ErrorCallback = js.Function2[
    /* d */ typingsJapgolly.jsdeferred.mod._Global_.Deferred, 
    /* repeated */ js.Any, 
    js.Any
  ]
  type FunctionWithNumber = js.Function2[/* i */ scala.Double, /* o */ js.UndefOr[js.Any], js.Any]
}
