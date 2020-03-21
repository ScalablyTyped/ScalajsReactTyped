package typingsJapgolly.naja.mod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteEvent[T /* <: js.Object */] extends Event_ {
  val error: js.UndefOr[js.Error] = js.native
  val options: NajaOptions = js.native
  val response: js.UndefOr[T] = js.native
  val xhr: XMLHttpRequest = js.native
}

