package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromDataItemData extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  var event: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.event] = js.undefined
  var fromData: js.UndefOr[js.Any] = js.undefined
  var itemData: js.UndefOr[js.Any] = js.undefined
  var itemElement: js.UndefOr[dxElement] = js.undefined
}

object AnonFromDataItemData {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    event: event = null,
    fromData: js.Any = null,
    itemData: js.Any = null,
    itemElement: dxElement = null
  ): AnonFromDataItemData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (fromData != null) __obj.updateDynamic("fromData")(fromData.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (itemElement != null) __obj.updateDynamic("itemElement")(itemElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFromDataItemData]
  }
}

