package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.muiDatatables.mod.MUIDataTableFilterList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableFilterList {
  def apply(
    filterList: js.Array[js.Array[String]],
    classes: js.Object = null,
    onFilterUpdate: /* args */ js.Any => CallbackTo[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MUIDataTableFilterList, 
    MountedWithRawType[MUIDataTableFilterList, js.Object, RawMounted[MUIDataTableFilterList, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(filterList = filterList.asInstanceOf[js.Any])
  
      if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (onFilterUpdate != null) __obj.updateDynamic("onFilterUpdate")(js.Any.fromFunction1((t0: /* args */ js.Any) => onFilterUpdate(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.muiDatatables.mod.MUIDataTableFilterList, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.muiDatatables.mod.MUIDataTableFilterList])(children: _*)
  }
  @JSImport("mui-datatables", "TableFilterList")
  @js.native
  object componentImport extends js.Object
  
}

