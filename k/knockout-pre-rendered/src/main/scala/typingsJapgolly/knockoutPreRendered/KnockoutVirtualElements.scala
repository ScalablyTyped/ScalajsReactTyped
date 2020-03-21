package typingsJapgolly.knockoutPreRendered

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutVirtualElements extends js.Object {
  var allowedBindings: StringDictionary[Boolean]
  def childNodes(node: KnockoutVirtualElement): js.Array[Node]
  def emptyNode(node: KnockoutVirtualElement): Unit
  def firstChild(node: KnockoutVirtualElement): KnockoutVirtualElement
  def insertAfter(container: KnockoutVirtualElement, nodeToInsert: Node, insertAfter: Node): Unit
  def nextSibling(node: KnockoutVirtualElement): Node
  def prepend(node: KnockoutVirtualElement, toInsert: Node): Unit
  def setDomNodeChildren(node: KnockoutVirtualElement, newChildren: AnonDictindex): Unit
}

object KnockoutVirtualElements {
  @scala.inline
  def apply(
    allowedBindings: StringDictionary[Boolean],
    childNodes: KnockoutVirtualElement => CallbackTo[js.Array[Node]],
    emptyNode: KnockoutVirtualElement => Callback,
    firstChild: KnockoutVirtualElement => CallbackTo[KnockoutVirtualElement],
    insertAfter: (KnockoutVirtualElement, Node, Node) => Callback,
    nextSibling: KnockoutVirtualElement => CallbackTo[Node],
    prepend: (KnockoutVirtualElement, Node) => Callback,
    setDomNodeChildren: (KnockoutVirtualElement, AnonDictindex) => Callback
  ): KnockoutVirtualElements = {
    val __obj = js.Dynamic.literal(allowedBindings = allowedBindings.asInstanceOf[js.Any])
    __obj.updateDynamic("childNodes")(js.Any.fromFunction1((t0: typingsJapgolly.knockoutPreRendered.KnockoutVirtualElement) => childNodes(t0).runNow()))
    __obj.updateDynamic("emptyNode")(js.Any.fromFunction1((t0: typingsJapgolly.knockoutPreRendered.KnockoutVirtualElement) => emptyNode(t0).runNow()))
    __obj.updateDynamic("firstChild")(js.Any.fromFunction1((t0: typingsJapgolly.knockoutPreRendered.KnockoutVirtualElement) => firstChild(t0).runNow()))
    __obj.updateDynamic("insertAfter")(js.Any.fromFunction3((t0: typingsJapgolly.knockoutPreRendered.KnockoutVirtualElement, t1: org.scalajs.dom.raw.Node, t2: org.scalajs.dom.raw.Node) => insertAfter(t0, t1, t2).runNow()))
    __obj.updateDynamic("nextSibling")(js.Any.fromFunction1((t0: typingsJapgolly.knockoutPreRendered.KnockoutVirtualElement) => nextSibling(t0).runNow()))
    __obj.updateDynamic("prepend")(js.Any.fromFunction2((t0: typingsJapgolly.knockoutPreRendered.KnockoutVirtualElement, t1: org.scalajs.dom.raw.Node) => prepend(t0, t1).runNow()))
    __obj.updateDynamic("setDomNodeChildren")(js.Any.fromFunction2((t0: typingsJapgolly.knockoutPreRendered.KnockoutVirtualElement, t1: typingsJapgolly.knockoutPreRendered.AnonDictindex) => setDomNodeChildren(t0, t1).runNow()))
    __obj.asInstanceOf[KnockoutVirtualElements]
  }
}

