package typingsJapgolly.esquery.mod

import typingsJapgolly.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esquery", "matches")
@js.native
object matches extends js.Object {
  /** Given a `node` and its ancestors, determine if `node` is matched by `selector`. */
  def apply(node: Node, selector: Selector, ancestry: js.Array[Node]): Boolean = js.native
}

