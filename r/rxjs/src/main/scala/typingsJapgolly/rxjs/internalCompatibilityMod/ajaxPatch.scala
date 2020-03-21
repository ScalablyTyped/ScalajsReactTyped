package typingsJapgolly.rxjs.internalCompatibilityMod

import typingsJapgolly.rxjs.internalObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "ajaxPatch")
@js.native
object ajaxPatch extends js.Object {
  def apply(url: String): Observable[typingsJapgolly.rxjs.ajaxObservableMod.AjaxResponse] = js.native
  def apply(url: String, body: js.Any): Observable[typingsJapgolly.rxjs.ajaxObservableMod.AjaxResponse] = js.native
  def apply(url: String, body: js.Any, headers: js.Object): Observable[typingsJapgolly.rxjs.ajaxObservableMod.AjaxResponse] = js.native
}

