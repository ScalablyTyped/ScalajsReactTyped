package typingsJapgolly.devextreme.mod.DevExpress.ui

import typingsJapgolly.devextreme.AnonComponentRow
import typingsJapgolly.devextreme.devextremeStrings.batch
import typingsJapgolly.devextreme.devextremeStrings.cell
import typingsJapgolly.devextreme.devextremeStrings.click
import typingsJapgolly.devextreme.devextremeStrings.dblClick
import typingsJapgolly.devextreme.devextremeStrings.form
import typingsJapgolly.devextreme.devextremeStrings.full
import typingsJapgolly.devextreme.devextremeStrings.popup
import typingsJapgolly.devextreme.devextremeStrings.repaint
import typingsJapgolly.devextreme.devextremeStrings.reshape
import typingsJapgolly.devextreme.devextremeStrings.row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDataGridEditing extends GridBaseEditing {
  /** Specifies whether a user can add new rows. */
  var allowAdding: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether a user can delete rows. It is called for each data row when defined as a function. */
  var allowDeleting: js.UndefOr[Boolean | (js.Function1[/* options */ AnonComponentRow, Boolean])] = js.undefined
  /** Specifies whether a user can update rows. It is called for each data row when defined as a function. */
  var allowUpdating: js.UndefOr[Boolean | (js.Function1[/* options */ AnonComponentRow, Boolean])] = js.undefined
  /** Contains options that specify texts for editing-related UI elements. */
  @JSName("texts")
  var texts_dxDataGridEditing: js.UndefOr[js.Any] = js.undefined
}

object dxDataGridEditing {
  @scala.inline
  def apply(
    allowAdding: js.UndefOr[Boolean] = js.undefined,
    allowDeleting: Boolean | (js.Function1[/* options */ AnonComponentRow, Boolean]) = null,
    allowUpdating: Boolean | (js.Function1[/* options */ AnonComponentRow, Boolean]) = null,
    form: dxFormOptions = null,
    mode: batch | cell | row | form | popup = null,
    popup: dxPopupOptions[dxPopup] = null,
    refreshMode: full | reshape | repaint = null,
    selectTextOnEditStart: js.UndefOr[Boolean] = js.undefined,
    startEditAction: click | dblClick = null,
    texts: js.Any = null,
    useIcons: js.UndefOr[Boolean] = js.undefined
  ): dxDataGridEditing = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAdding)) __obj.updateDynamic("allowAdding")(allowAdding.asInstanceOf[js.Any])
    if (allowDeleting != null) __obj.updateDynamic("allowDeleting")(allowDeleting.asInstanceOf[js.Any])
    if (allowUpdating != null) __obj.updateDynamic("allowUpdating")(allowUpdating.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (refreshMode != null) __obj.updateDynamic("refreshMode")(refreshMode.asInstanceOf[js.Any])
    if (!js.isUndefined(selectTextOnEditStart)) __obj.updateDynamic("selectTextOnEditStart")(selectTextOnEditStart.asInstanceOf[js.Any])
    if (startEditAction != null) __obj.updateDynamic("startEditAction")(startEditAction.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (!js.isUndefined(useIcons)) __obj.updateDynamic("useIcons")(useIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDataGridEditing]
  }
}

