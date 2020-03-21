package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.kendo.data.TreeListModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListDropEvent extends TreeListEvent {
  var destination: js.UndefOr[TreeListModel] = js.undefined
  var dropTarget: js.UndefOr[Element] = js.undefined
  var setValid: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[TreeListModel] = js.undefined
  var valid: js.UndefOr[Boolean] = js.undefined
}

object TreeListDropEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: TreeList,
    destination: TreeListModel = null,
    dropTarget: Element = null,
    setValid: js.UndefOr[Boolean] = js.undefined,
    source: TreeListModel = null,
    valid: js.UndefOr[Boolean] = js.undefined
  ): TreeListDropEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(setValid)) __obj.updateDynamic("setValid")(setValid.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListDropEvent]
  }
}

