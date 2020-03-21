package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentDeselectedRowKeys[T] extends js.Object {
  var component: js.UndefOr[T] = js.undefined
  var currentDeselectedRowKeys: js.UndefOr[js.Array[_]] = js.undefined
  var currentSelectedRowKeys: js.UndefOr[js.Array[_]] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var selectedRowKeys: js.UndefOr[js.Array[_]] = js.undefined
  var selectedRowsData: js.UndefOr[js.Array[_]] = js.undefined
}

object AnonCurrentDeselectedRowKeys {
  @scala.inline
  def apply[T](
    component: T = null,
    currentDeselectedRowKeys: js.Array[_] = null,
    currentSelectedRowKeys: js.Array[_] = null,
    element: dxElement = null,
    model: js.Any = null,
    selectedRowKeys: js.Array[_] = null,
    selectedRowsData: js.Array[_] = null
  ): AnonCurrentDeselectedRowKeys[T] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (currentDeselectedRowKeys != null) __obj.updateDynamic("currentDeselectedRowKeys")(currentDeselectedRowKeys.asInstanceOf[js.Any])
    if (currentSelectedRowKeys != null) __obj.updateDynamic("currentSelectedRowKeys")(currentSelectedRowKeys.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (selectedRowKeys != null) __obj.updateDynamic("selectedRowKeys")(selectedRowKeys.asInstanceOf[js.Any])
    if (selectedRowsData != null) __obj.updateDynamic("selectedRowsData")(selectedRowsData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrentDeselectedRowKeys[T]]
  }
}

