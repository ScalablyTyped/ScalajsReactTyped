package typingsJapgolly.rxjs

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/dom/fetch", JSImport.Namespace)
@js.native
object domFetchMod extends js.Object {
  def fromFetch(input: String): Observable[Response] = js.native
  def fromFetch(input: String, init: RequestInit): Observable[Response] = js.native
  def fromFetch(input: Request): Observable[Response] = js.native
  def fromFetch(input: Request, init: RequestInit): Observable[Response] = js.native
}

