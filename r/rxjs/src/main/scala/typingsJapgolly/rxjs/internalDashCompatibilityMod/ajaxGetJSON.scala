package typingsJapgolly.rxjs.internalDashCompatibilityMod

import typingsJapgolly.rxjs.internalObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "ajaxGetJSON")
@js.native
object ajaxGetJSON extends js.Object {
  def apply[T](url: String): Observable[T] = js.native
  def apply[T](url: String, headers: js.Object): Observable[T] = js.native
}

