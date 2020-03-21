package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.muiDatatables.mod.MUIDataTableColumnDef
import typingsJapgolly.muiDatatables.mod.MUIDataTableHead
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableHead {
  def apply(
    classes: js.Object = null,
    columns: js.Array[MUIDataTableColumnDef] = null,
    count: Int | Double = null,
    data: js.Array[_] = null,
    options: js.Object = null,
    page: js.Any = null,
    selectedRows: js.Any = null,
    setCellRef: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MUIDataTableHead, 
    MountedWithRawType[MUIDataTableHead, js.Object, RawMounted[MUIDataTableHead, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (selectedRows != null) __obj.updateDynamic("selectedRows")(selectedRows.asInstanceOf[js.Any])
    if (setCellRef != null) __obj.updateDynamic("setCellRef")(setCellRef.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.muiDatatables.mod.MUIDataTableHead, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.muiDatatables.mod.MUIDataTableHead])(children: _*)
  }
  @JSImport("mui-datatables", "TableHead")
  @js.native
  object componentImport extends js.Object
  
}

