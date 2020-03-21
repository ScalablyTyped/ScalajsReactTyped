package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.muiDatatables.mod.MUIDataTableColumnDef
import typingsJapgolly.muiDatatables.mod.MUIDataTableToolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableToolbar {
  def apply(
    columns: js.Array[MUIDataTableColumnDef],
    classes: js.Object = null,
    data: js.Array[_] = null,
    filterData: js.Any = null,
    filterList: js.Array[js.Array[String]] = null,
    filterUpdate: js.Any = null,
    options: js.Object = null,
    resetFilters: js.Any = null,
    searchTextUpdate: /* args */ js.Any => CallbackTo[js.Any] = null,
    setTableActions: /* args */ js.Any => CallbackTo[js.Any] = null,
    tableRef: /* args */ js.Any => CallbackTo[js.Any] = null,
    title: js.Any = null,
    toggleViewColumn: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MUIDataTableToolbar, 
    MountedWithRawType[MUIDataTableToolbar, js.Object, RawMounted[MUIDataTableToolbar, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
  
      if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (filterData != null) __obj.updateDynamic("filterData")(filterData.asInstanceOf[js.Any])
    if (filterList != null) __obj.updateDynamic("filterList")(filterList.asInstanceOf[js.Any])
    if (filterUpdate != null) __obj.updateDynamic("filterUpdate")(filterUpdate.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (resetFilters != null) __obj.updateDynamic("resetFilters")(resetFilters.asInstanceOf[js.Any])
    if (searchTextUpdate != null) __obj.updateDynamic("searchTextUpdate")(js.Any.fromFunction1((t0: /* args */ js.Any) => searchTextUpdate(t0).runNow()))
    if (setTableActions != null) __obj.updateDynamic("setTableActions")(js.Any.fromFunction1((t0: /* args */ js.Any) => setTableActions(t0).runNow()))
    if (tableRef != null) __obj.updateDynamic("tableRef")(js.Any.fromFunction1((t0: /* args */ js.Any) => tableRef(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (toggleViewColumn != null) __obj.updateDynamic("toggleViewColumn")(toggleViewColumn.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.muiDatatables.mod.MUIDataTableToolbar, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.muiDatatables.mod.MUIDataTableToolbar])(children: _*)
  }
  @JSImport("mui-datatables", "TableToolbar")
  @js.native
  object componentImport extends js.Object
  
}

