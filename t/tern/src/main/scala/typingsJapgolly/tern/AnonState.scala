package typingsJapgolly.tern

import typingsJapgolly.estree.mod.Node
import typingsJapgolly.tern.inferMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonState extends js.Object {
  var node: Node
  var state: Scope | Null
}

object AnonState {
  @scala.inline
  def apply(node: Node, state: Scope = null): AnonState = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonState]
  }
}

