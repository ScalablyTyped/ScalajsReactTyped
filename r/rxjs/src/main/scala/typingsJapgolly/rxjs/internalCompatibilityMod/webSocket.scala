package typingsJapgolly.rxjs.internalCompatibilityMod

import typingsJapgolly.rxjs.webSocketSubjectMod.WebSocketSubjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "webSocket")
@js.native
object webSocket extends js.Object {
  def apply[T](urlConfigOrSource: String): typingsJapgolly.rxjs.webSocketSubjectMod.WebSocketSubject[T] = js.native
  def apply[T](urlConfigOrSource: WebSocketSubjectConfig[T]): typingsJapgolly.rxjs.webSocketSubjectMod.WebSocketSubject[T] = js.native
}

