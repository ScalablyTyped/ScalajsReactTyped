package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.muiDatatables.mod.MUIDataTableToolbarSelect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableToolbarSelect {
  def apply(
    options: js.Object,
    classes: js.Object = null,
    displayData: js.Any = null,
    onRowsDelete: /* args */ js.Any => CallbackTo[js.Any] = null,
    rowSelected: js.UndefOr[Boolean] = js.undefined,
    selectRowUpdate: /* args */ js.Any => CallbackTo[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MUIDataTableToolbarSelect, 
    MountedWithRawType[
      MUIDataTableToolbarSelect, 
      js.Object, 
      RawMounted[MUIDataTableToolbarSelect, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
  
      if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (displayData != null) __obj.updateDynamic("displayData")(displayData.asInstanceOf[js.Any])
    if (onRowsDelete != null) __obj.updateDynamic("onRowsDelete")(js.Any.fromFunction1((t0: /* args */ js.Any) => onRowsDelete(t0).runNow()))
    if (!js.isUndefined(rowSelected)) __obj.updateDynamic("rowSelected")(rowSelected.asInstanceOf[js.Any])
    if (selectRowUpdate != null) __obj.updateDynamic("selectRowUpdate")(js.Any.fromFunction1((t0: /* args */ js.Any) => selectRowUpdate(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.muiDatatables.mod.MUIDataTableToolbarSelect, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.muiDatatables.mod.MUIDataTableToolbarSelect])(children: _*)
  }
  @JSImport("mui-datatables", "TableToolbarSelect")
  @js.native
  object componentImport extends js.Object
  
}

