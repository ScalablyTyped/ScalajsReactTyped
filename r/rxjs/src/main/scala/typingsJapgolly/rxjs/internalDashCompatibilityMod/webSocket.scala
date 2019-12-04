package typingsJapgolly.rxjs.internalDashCompatibilityMod

import typingsJapgolly.rxjs.internalObservableDomWebSocketSubjectMod.WebSocketSubjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "webSocket")
@js.native
object webSocket extends js.Object {
  def apply[T](urlConfigOrSource: String): typingsJapgolly.rxjs.internalObservableDomWebSocketSubjectMod.WebSocketSubject[T] = js.native
  def apply[T](urlConfigOrSource: WebSocketSubjectConfig[T]): typingsJapgolly.rxjs.internalObservableDomWebSocketSubjectMod.WebSocketSubject[T] = js.native
}

