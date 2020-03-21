package typingsJapgolly.dom4

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * https://dom.spec.whatwg.org/#childnode
  */
trait ChildNode extends js.Object {
  /**
    * Inserts `nodes` just after this node, while replacing strings with equivalent `Text` nodes.
    */
  def after(nodes: (Node | String)*): Unit
  /**
    * Inserts `nodes` just before this node, while replacing strings with equivalent `Text` nodes.
    */
  def before(nodes: (Node | String)*): Unit
  /**
    * Removes this node.
    */
  def remove(): Unit
  /**
    * Replaces this node with `nodes`, while replacing strings in nodes with equivalent Text nodes.
    */
  def replaceWith(nodes: (Node | String)*): Unit
}

object ChildNode {
  @scala.inline
  def apply(
    after: /* repeated */ Node | String => Callback,
    before: /* repeated */ Node | String => Callback,
    remove: Callback,
    replaceWith: /* repeated */ Node | String => Callback
  ): ChildNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => after(t0).runNow()))
    __obj.updateDynamic("before")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => before(t0).runNow()))
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("replaceWith")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => replaceWith(t0).runNow()))
    __obj.asInstanceOf[ChildNode]
  }
}

