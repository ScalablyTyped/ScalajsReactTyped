package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.muiDatatables.mod.MUIDataTableResize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableResize {
  def apply(
    classes: js.Object = null,
    options: js.Object = null,
    rowSelected: js.UndefOr[Boolean] = js.undefined,
    setResizeable: /* args */ js.Any => CallbackTo[js.Any] = null,
    updateDividers: /* args */ js.Any => CallbackTo[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MUIDataTableResize, 
    MountedWithRawType[MUIDataTableResize, js.Object, RawMounted[MUIDataTableResize, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSelected)) __obj.updateDynamic("rowSelected")(rowSelected.asInstanceOf[js.Any])
    if (setResizeable != null) __obj.updateDynamic("setResizeable")(js.Any.fromFunction1((t0: /* args */ js.Any) => setResizeable(t0).runNow()))
    if (updateDividers != null) __obj.updateDynamic("updateDividers")(js.Any.fromFunction1((t0: /* args */ js.Any) => updateDividers(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.muiDatatables.mod.MUIDataTableResize, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.muiDatatables.mod.MUIDataTableResize])(children: _*)
  }
  @JSImport("mui-datatables", "TableResize")
  @js.native
  object componentImport extends js.Object
  
}

