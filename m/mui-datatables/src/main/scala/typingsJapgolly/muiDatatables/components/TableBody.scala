package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.muiDatatables.AnonRowIndex
import typingsJapgolly.muiDatatables.mod.MUIDataTableBody
import typingsJapgolly.muiDatatables.mod.MUIDataTableColumnDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableBody {
  def apply(
    classes: js.Object,
    columns: js.Array[MUIDataTableColumnDef],
    count: Double,
    data: js.Array[js.Object | (js.Array[Double | String])],
    options: js.Object,
    filterList: js.Array[js.Array[String]] = null,
    onRowClick: (/* rowData */ js.Array[String], /* rowMeta */ AnonRowIndex) => Callback = null,
    searchText: String = null,
    selectRowUpdate: /* args */ js.Any => CallbackTo[js.Any] = null,
    selectedRows: js.Object = null,
    toggleExpandRow: /* args */ js.Any => CallbackTo[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MUIDataTableBody, 
    MountedWithRawType[MUIDataTableBody, js.Object, RawMounted[MUIDataTableBody, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
      if (filterList != null) __obj.updateDynamic("filterList")(filterList.asInstanceOf[js.Any])
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2((t0: /* rowData */ js.Array[java.lang.String], t1: /* rowMeta */ typingsJapgolly.muiDatatables.AnonRowIndex) => onRowClick(t0, t1).runNow()))
    if (searchText != null) __obj.updateDynamic("searchText")(searchText.asInstanceOf[js.Any])
    if (selectRowUpdate != null) __obj.updateDynamic("selectRowUpdate")(js.Any.fromFunction1((t0: /* args */ js.Any) => selectRowUpdate(t0).runNow()))
    if (selectedRows != null) __obj.updateDynamic("selectedRows")(selectedRows.asInstanceOf[js.Any])
    if (toggleExpandRow != null) __obj.updateDynamic("toggleExpandRow")(js.Any.fromFunction1((t0: /* args */ js.Any) => toggleExpandRow(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.muiDatatables.mod.MUIDataTableBody, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.muiDatatables.mod.MUIDataTableBody])(children: _*)
  }
  @JSImport("mui-datatables", "TableBody")
  @js.native
  object componentImport extends js.Object
  
}

