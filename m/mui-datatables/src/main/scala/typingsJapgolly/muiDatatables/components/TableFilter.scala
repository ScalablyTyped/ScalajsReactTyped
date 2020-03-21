package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.muiDatatables.mod.MUIDataTableFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableFilter {
  def apply(
    filterData: js.Array[_],
    options: js.Object,
    classes: js.Object = null,
    filterList: js.Array[js.Array[String]] = null,
    onFilterRest: /* args */ js.Any => CallbackTo[js.Any] = null,
    onFilterUpdate: /* args */ js.Any => CallbackTo[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MUIDataTableFilter, 
    MountedWithRawType[MUIDataTableFilter, js.Object, RawMounted[MUIDataTableFilter, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(filterData = filterData.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
      if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (filterList != null) __obj.updateDynamic("filterList")(filterList.asInstanceOf[js.Any])
    if (onFilterRest != null) __obj.updateDynamic("onFilterRest")(js.Any.fromFunction1((t0: /* args */ js.Any) => onFilterRest(t0).runNow()))
    if (onFilterUpdate != null) __obj.updateDynamic("onFilterUpdate")(js.Any.fromFunction1((t0: /* args */ js.Any) => onFilterUpdate(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.muiDatatables.mod.MUIDataTableFilter, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.muiDatatables.mod.MUIDataTableFilter])(children: _*)
  }
  @JSImport("mui-datatables", "TableFilter")
  @js.native
  object componentImport extends js.Object
  
}

