package typingsJapgolly.firebaseFirestore.coreEventManagerMod

import typingsJapgolly.firebaseFirestore.utilMiscMod.EventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer[T] extends js.Object {
  @JSName("error")
  var error_Original: EventHandler[js.Error] = js.native
  @JSName("next")
  var next_Original: EventHandler[T] = js.native
  def error(value: js.Error): Unit = js.native
  def next(value: T): Unit = js.native
}

