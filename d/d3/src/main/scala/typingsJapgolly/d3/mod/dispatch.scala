package typingsJapgolly.d3.mod

import org.scalajs.dom.raw.EventTarget
import typingsJapgolly.d3Dispatch.mod.Dispatch_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "dispatch")
@js.native
object dispatch extends js.Object {
  def apply[T /* <: EventTarget */](types: String*): Dispatch_[T] = js.native
}

