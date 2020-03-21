package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.webSocketSubjectMod.WebSocketSubject
import typingsJapgolly.rxjs.webSocketSubjectMod.WebSocketSubjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/dom/webSocket", JSImport.Namespace)
@js.native
object webSocketMod extends js.Object {
  def webSocket[T](urlConfigOrSource: String): WebSocketSubject[T] = js.native
  def webSocket[T](urlConfigOrSource: WebSocketSubjectConfig[T]): WebSocketSubject[T] = js.native
}

