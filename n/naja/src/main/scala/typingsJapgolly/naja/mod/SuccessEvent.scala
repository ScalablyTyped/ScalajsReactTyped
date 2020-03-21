package typingsJapgolly.naja.mod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuccessEvent[T /* <: js.Object */] extends Event_ {
  val options: NajaOptions = js.native
  val response: T = js.native
  val xhr: XMLHttpRequest = js.native
}

