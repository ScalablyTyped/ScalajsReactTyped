package typingsJapgolly.webcola

import org.scalajs.dom.raw.EventTarget
import typingsJapgolly.d3Dispatch.mod.Dispatch_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallTypes extends js.Object {
  def apply[T /* <: EventTarget */](types: String*): Dispatch_[T] = js.native
}

