package typingsJapgolly.destroyOnHwm

import typingsJapgolly.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("destroy-on-hwm", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[T /* <: Writable */](stream: T): T = js.native
  def apply[T /* <: Writable */](stream: T, callback: js.ThisFunction1[/* this */ T, /* stream */ T, Unit]): T = js.native
}

