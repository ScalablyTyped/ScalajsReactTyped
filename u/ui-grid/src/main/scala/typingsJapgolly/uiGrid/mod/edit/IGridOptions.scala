package typingsJapgolly.uiGrid.mod.edit

import typingsJapgolly.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions extends js.Object {
  /**
    * If specified, either a value or function to be used by all columns before editing.
    * If falsy, then editing of cell is not allowed
    */
  var cellEditableCondition: js.UndefOr[js.Any | (js.Function1[/* $scope */ IScope, Boolean])] = js.undefined
  /**
    * If specified, cellTemplate to use as the editor for all columns.
    * defaults to 'ui-grid/cellTextEditor'
    * @default 'ui-grid/cellTextEditor'
    */
  var editableCellTemplate: js.UndefOr[String] = js.undefined
  /**
    * If defined, sets the default value for the editable flag on each individual colDefs if their individual
    * enableCellEdit configuration is not defined.
    * Defaults to undefined.
    * @default undefined
    */
  var enableCellEdit: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, then editor is invoked as soon as cell receives focus.
    * Default false.
    * _requires cellNav feature and the edit feature to be enabled_
    * @default false
    */
  var enableCellEditOnFocus: js.UndefOr[Boolean] = js.undefined
}

object IGridOptions {
  @scala.inline
  def apply(
    cellEditableCondition: js.Any | (js.Function1[/* $scope */ IScope, Boolean]) = null,
    editableCellTemplate: String = null,
    enableCellEdit: js.UndefOr[Boolean] = js.undefined,
    enableCellEditOnFocus: js.UndefOr[Boolean] = js.undefined
  ): IGridOptions = {
    val __obj = js.Dynamic.literal()
    if (cellEditableCondition != null) __obj.updateDynamic("cellEditableCondition")(cellEditableCondition.asInstanceOf[js.Any])
    if (editableCellTemplate != null) __obj.updateDynamic("editableCellTemplate")(editableCellTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellEdit)) __obj.updateDynamic("enableCellEdit")(enableCellEdit.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellEditOnFocus)) __obj.updateDynamic("enableCellEditOnFocus")(enableCellEditOnFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridOptions]
  }
}

