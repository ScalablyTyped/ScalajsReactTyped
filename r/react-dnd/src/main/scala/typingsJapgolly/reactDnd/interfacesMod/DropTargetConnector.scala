package typingsJapgolly.reactDnd.interfacesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactDnd.connectorsMod.ConnectDropTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTargetConnector extends js.Object {
  /**
    * Returns a function that must be used inside the component to assign the drop target role to a node.
    * By returning { connectDropTarget: connect.dropTarget() } from your collecting function, you can mark any React element
    * as the droppable node. To do that, replace any element with this.props.connectDropTarget(element) inside the render function.
    */
  def dropTarget(): ConnectDropTarget
}

object DropTargetConnector {
  @scala.inline
  def apply(dropTarget: CallbackTo[ConnectDropTarget]): DropTargetConnector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dropTarget")(dropTarget.toJsFn)
    __obj.asInstanceOf[DropTargetConnector]
  }
}

