package typingsJapgolly.dom4

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLCollection
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentNode extends js.Object {
  /**
    * Returns the child elements.
    */
  val children: HTMLCollection
  /**
    * Inserts `nodes` after the last child of this node, while replacing strings with equivalent `Text` nodes.
    */
  def append(nodes: (Node | String)*): Unit
  /**
    * Inserts `nodes` before the first child of this node, while replacing strings with equivalent `Text` nodes.
    */
  def prepend(nodes: (Node | String)*): Unit
}

object ParentNode {
  @scala.inline
  def apply(
    append: /* repeated */ Node | String => Callback,
    children: HTMLCollection,
    prepend: /* repeated */ Node | String => Callback
  ): ParentNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("append")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => append(t0).runNow()))
    __obj.updateDynamic("prepend")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => prepend(t0).runNow()))
    __obj.asInstanceOf[ParentNode]
  }
}

