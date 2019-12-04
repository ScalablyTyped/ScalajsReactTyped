package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableDomWebSocketSubjectMod.WebSocketSubject
import typingsJapgolly.rxjs.internalObservableDomWebSocketSubjectMod.WebSocketSubjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/dom/webSocket", JSImport.Namespace)
@js.native
object internalObservableDomWebSocketMod extends js.Object {
  def webSocket[T](urlConfigOrSource: String): WebSocketSubject[T] = js.native
  def webSocket[T](urlConfigOrSource: WebSocketSubjectConfig[T]): WebSocketSubject[T] = js.native
}

