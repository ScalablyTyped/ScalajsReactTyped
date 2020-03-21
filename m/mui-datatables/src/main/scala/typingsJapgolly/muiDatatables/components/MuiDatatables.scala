package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.muiDatatables.mod.MUIDataTableColumnDef
import typingsJapgolly.muiDatatables.mod.MUIDataTableOptions
import typingsJapgolly.muiDatatables.mod.MUIDataTableProps
import typingsJapgolly.muiDatatables.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MuiDatatables {
  def apply(
    columns: js.Array[MUIDataTableColumnDef],
    data: js.Array[js.Object | (js.Array[Double | String])],
    options: MUIDataTableOptions = null,
    title: String | Node = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MUIDataTableProps, default, Unit, MUIDataTableProps] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
      if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.muiDatatables.mod.MUIDataTableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.muiDatatables.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.muiDatatables.mod.MUIDataTableProps])(children: _*)
  }
  @JSImport("mui-datatables", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

