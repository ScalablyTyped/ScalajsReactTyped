package typingsJapgolly.eventsOnce

import typingsJapgolly.node.eventsMod.DOMEventTarget
import typingsJapgolly.node.eventsMod.NodeEventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("events.once", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(emitter: DOMEventTarget, event: String): js.Promise[js.Array[_]] = js.native
  def apply(emitter: NodeEventTarget, event: String): js.Promise[js.Array[_]] = js.native
  def apply(emitter: NodeEventTarget, event: js.Symbol): js.Promise[js.Array[_]] = js.native
}

