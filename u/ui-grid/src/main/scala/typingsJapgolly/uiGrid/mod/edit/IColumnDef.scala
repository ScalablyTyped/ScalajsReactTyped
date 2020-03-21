package typingsJapgolly.uiGrid.mod.edit

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.FileList
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.IGridColumnOf
import typingsJapgolly.uiGrid.mod.IGridRowOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnDef[TEntity] extends js.Object {
  /**
    * If specified, either a value or function evaluated before editing cell.
    * If falsy, then editing of cell is not allowed.
    */
  var cellEditableCondition: js.UndefOr[js.Any | (js.Function1[/* $scope */ IScope, Boolean])] = js.undefined
  /** A filter that you would like to apply to the values in the options list of the dropdown */
  var editDropdownFilter: js.UndefOr[String] = js.undefined
  /** the label for the "id" field in the editDropdownOptionsArray. Defaults to 'id' */
  var editDropdownIdLabel: js.UndefOr[String] = js.undefined
  /** an array of values in the format [ {id: xxx, value: xxx} ], which is populated into the edit dropdown */
  var editDropdownOptionsArray: js.UndefOr[js.Array[IEditDropdown]] = js.undefined
  /**
    * a path to a property on row.entity containing an array of values in the format `[{id: xxx, value:
    * xxx}]`,
    * which will be used to populate the edit dropdown.  This can be used when the dropdown values are
    * dependent on the backing row entity.  If this property is set then editDropdownOptionsArray will be
    * ignored.
    */
  var editDropdownRowEntityOptionsArrayPath: js.UndefOr[String] = js.undefined
  /** the label of the 'value' field in the editDropdownOptionsArray.  Defaults to 'value' */
  var editDropdownValueLabel: js.UndefOr[String] = js.undefined
  /**
    * A function that should be called when any files have been chosen by the user.
    * You should use this to process the files appropriately for your application.
    *
    * It passes the gridCol, the gridRow (from which you can get gridRow.entity), and the files.
    * The files are in the format as returned from the file chooser, an array of files,
    * with each having useful information such as:
    *
    * * files[0].lastModifiedDate
    * * files[0].name
    * * files[0].size (appears to be in bytes)
    * * files[0].type (MIME type)
    *
    * Typically you would do something with these files.
    * Most commonly you would use the filename or read the file itself in. This example does both:
    * @example
    editFileChooserCallBack: (gridRow, gridCol, files) => {
    // ignore all but the first file, it can only choose one anyway
    // set the filename into this column
    gridRow.entity.filename = file[0].name;
    // read the file and set it into a hidden column, which we may do stuff with later
    var setFile = function(fileContent){
    gridRow.entity.file = fileContent.currentTarget.result;
    };
    var reader = new FileReader();
    reader.onload = setFile;
    reader.readAsText( files[0] );
    }
    */
  var editFileChooserCallback: js.UndefOr[
    js.Function3[
      /* gridRow */ IGridRowOf[TEntity], 
      /* gridCol */ IGridColumnOf[TEntity], 
      /* files */ FileList, 
      Unit
    ]
  ] = js.undefined
  /**
    * A bindable string value that is used when binding to edit controls instead of colDef.field
    * For example if you have a complex property on an object like:
    * ```typescript
    * state: {abbrev:'MS',name:'Mississippi'}.
    * ```
    * The grid should display `state.name` in the cell and sort/filter based on the state.name property, but
    * the editor requires the full state object. so this let's you bind to that
    * @example
    colDef.field = 'state.name';
    colDef.editModelField = 'state';
    */
  var editModelField: js.UndefOr[String] = js.undefined
  /**
    * Cell template to be used when editing this column. Can be Url or text template.
    * Defaults to gridOptions.editableCellTemplate
    */
  var editableCellTemplate: js.UndefOr[String] = js.undefined
  /** Enable editing on a column */
  var enableCellEdit: js.UndefOr[Boolean] = js.undefined
  /** If true, then editor is invoked as soon as cell receives focus. Default false.
    * _Requires both the cellNav feature and the edit feature to be enabled_
    */
  var enableCellEditOnFocus: js.UndefOr[Boolean] = js.undefined
}

object IColumnDef {
  @scala.inline
  def apply[TEntity](
    cellEditableCondition: js.Any | (js.Function1[/* $scope */ IScope, Boolean]) = null,
    editDropdownFilter: String = null,
    editDropdownIdLabel: String = null,
    editDropdownOptionsArray: js.Array[IEditDropdown] = null,
    editDropdownRowEntityOptionsArrayPath: String = null,
    editDropdownValueLabel: String = null,
    editFileChooserCallback: (/* gridRow */ IGridRowOf[TEntity], /* gridCol */ IGridColumnOf[TEntity], /* files */ FileList) => Callback = null,
    editModelField: String = null,
    editableCellTemplate: String = null,
    enableCellEdit: js.UndefOr[Boolean] = js.undefined,
    enableCellEditOnFocus: js.UndefOr[Boolean] = js.undefined
  ): IColumnDef[TEntity] = {
    val __obj = js.Dynamic.literal()
    if (cellEditableCondition != null) __obj.updateDynamic("cellEditableCondition")(cellEditableCondition.asInstanceOf[js.Any])
    if (editDropdownFilter != null) __obj.updateDynamic("editDropdownFilter")(editDropdownFilter.asInstanceOf[js.Any])
    if (editDropdownIdLabel != null) __obj.updateDynamic("editDropdownIdLabel")(editDropdownIdLabel.asInstanceOf[js.Any])
    if (editDropdownOptionsArray != null) __obj.updateDynamic("editDropdownOptionsArray")(editDropdownOptionsArray.asInstanceOf[js.Any])
    if (editDropdownRowEntityOptionsArrayPath != null) __obj.updateDynamic("editDropdownRowEntityOptionsArrayPath")(editDropdownRowEntityOptionsArrayPath.asInstanceOf[js.Any])
    if (editDropdownValueLabel != null) __obj.updateDynamic("editDropdownValueLabel")(editDropdownValueLabel.asInstanceOf[js.Any])
    if (editFileChooserCallback != null) __obj.updateDynamic("editFileChooserCallback")(js.Any.fromFunction3((t0: /* gridRow */ typingsJapgolly.uiGrid.mod.IGridRowOf[TEntity], t1: /* gridCol */ typingsJapgolly.uiGrid.mod.IGridColumnOf[TEntity], t2: /* files */ org.scalajs.dom.raw.FileList) => editFileChooserCallback(t0, t1, t2).runNow()))
    if (editModelField != null) __obj.updateDynamic("editModelField")(editModelField.asInstanceOf[js.Any])
    if (editableCellTemplate != null) __obj.updateDynamic("editableCellTemplate")(editableCellTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellEdit)) __obj.updateDynamic("enableCellEdit")(enableCellEdit.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellEditOnFocus)) __obj.updateDynamic("enableCellEditOnFocus")(enableCellEditOnFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnDef[TEntity]]
  }
}

