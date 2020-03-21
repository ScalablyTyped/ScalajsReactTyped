package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInsertNewView extends js.Object {
  var isInitial: Boolean
  var newViewModel: js.Object
  var newViewParent: Node
  var node: Node
  var oldDomNodes: js.Array[_]
  var oldViewModel: js.Object
  var oldViewParent: Node
  def insertNewView(): js.UndefOr[scala.Nothing]
  def removeOldView(): js.UndefOr[scala.Nothing]
}

object AnonInsertNewView {
  @scala.inline
  def apply(
    insertNewView: CallbackTo[js.UndefOr[scala.Nothing]],
    isInitial: Boolean,
    newViewModel: js.Object,
    newViewParent: Node,
    node: Node,
    oldDomNodes: js.Array[_],
    oldViewModel: js.Object,
    oldViewParent: Node,
    removeOldView: CallbackTo[js.UndefOr[scala.Nothing]]
  ): AnonInsertNewView = {
    val __obj = js.Dynamic.literal(isInitial = isInitial.asInstanceOf[js.Any], newViewModel = newViewModel.asInstanceOf[js.Any], newViewParent = newViewParent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldDomNodes = oldDomNodes.asInstanceOf[js.Any], oldViewModel = oldViewModel.asInstanceOf[js.Any], oldViewParent = oldViewParent.asInstanceOf[js.Any])
    __obj.updateDynamic("insertNewView")(insertNewView.toJsFn)
    __obj.updateDynamic("removeOldView")(removeOldView.toJsFn)
    __obj.asInstanceOf[AnonInsertNewView]
  }
}

