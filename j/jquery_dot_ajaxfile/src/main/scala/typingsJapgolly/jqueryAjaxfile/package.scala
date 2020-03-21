package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jqueryAjaxfile {
  type IAjaxFileResultCallback[T] = js.Function1[/* result */ typingsJapgolly.jqueryAjaxfile.IAjaxFileResult[T], js.Any]
  /**
    * Interface for the JQuery promise/deferred callbacks
    */
  type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, scala.Unit]
  type JQueryPromiseOperator[T, U] = js.Function2[
    /* callback1 */ typingsJapgolly.jqueryAjaxfile.JQueryPromiseCallback[T] | js.Array[typingsJapgolly.jqueryAjaxfile.JQueryPromiseCallback[T]], 
    /* repeated */ typingsJapgolly.jqueryAjaxfile.JQueryPromiseCallback[js.Any] | js.Array[typingsJapgolly.jqueryAjaxfile.JQueryPromiseCallback[js.Any]], 
    typingsJapgolly.jqueryAjaxfile.JQueryPromise[U]
  ]
  type MochaDone = js.Function1[/* error */ js.UndefOr[js.Error], scala.Unit]
  type Mocha_ = typingsJapgolly.jqueryAjaxfile.Mocha__
}
