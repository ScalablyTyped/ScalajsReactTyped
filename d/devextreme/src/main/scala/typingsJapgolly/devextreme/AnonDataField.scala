package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataField extends js.Object {
  var component: js.UndefOr[dxDataGrid] = js.undefined
  var dataField: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var editorElement: js.UndefOr[dxElement] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var parentType: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var row: js.UndefOr[dxDataGridRowObject] = js.undefined
  var rtlEnabled: js.UndefOr[Boolean] = js.undefined
  var setValue: js.UndefOr[js.Any] = js.undefined
  var updateValueTimeout: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonDataField {
  @scala.inline
  def apply(
    component: dxDataGrid = null,
    dataField: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editorElement: dxElement = null,
    element: dxElement = null,
    model: js.Any = null,
    parentType: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    row: dxDataGridRowObject = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    setValue: js.Any = null,
    updateValueTimeout: Int | Double = null,
    value: js.Any = null,
    width: Int | Double = null
  ): AnonDataField = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (editorElement != null) __obj.updateDynamic("editorElement")(editorElement.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (parentType != null) __obj.updateDynamic("parentType")(parentType.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (setValue != null) __obj.updateDynamic("setValue")(setValue.asInstanceOf[js.Any])
    if (updateValueTimeout != null) __obj.updateDynamic("updateValueTimeout")(updateValueTimeout.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataField]
  }
}

