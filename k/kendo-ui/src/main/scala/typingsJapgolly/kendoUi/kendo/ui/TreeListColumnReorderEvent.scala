package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListColumnReorderEvent extends TreeListEvent {
  var column: js.UndefOr[js.Any] = js.undefined
  var newIndex: js.UndefOr[Double] = js.undefined
  var oldIndex: js.UndefOr[Double] = js.undefined
}

object TreeListColumnReorderEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: TreeList,
    column: js.Any = null,
    newIndex: Int | Double = null,
    oldIndex: Int | Double = null
  ): TreeListColumnReorderEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (newIndex != null) __obj.updateDynamic("newIndex")(newIndex.asInstanceOf[js.Any])
    if (oldIndex != null) __obj.updateDynamic("oldIndex")(oldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListColumnReorderEvent]
  }
}

