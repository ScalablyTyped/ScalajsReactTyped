package typingsJapgolly.maquette.interfacesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  /**
    * The DOM node that is used as the root of this [[Projection]].
    */
  val domNode: Element
  def getLastRender(): VNode
  /**
    * Updates the real DOM to match the new virtual DOM tree.
    * @param updatedVnode The updated virtual DOM tree. Note: The selector for the root of the [[VNode]] tree may not change.
    */
  def update(updatedVnode: VNode): Unit
}

object Projection {
  @scala.inline
  def apply(domNode: Element, getLastRender: CallbackTo[VNode], update: VNode => Callback): Projection = {
    val __obj = js.Dynamic.literal(domNode = domNode.asInstanceOf[js.Any])
    __obj.updateDynamic("getLastRender")(getLastRender.toJsFn)
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.maquette.interfacesMod.VNode) => update(t0).runNow()))
    __obj.asInstanceOf[Projection]
  }
}

