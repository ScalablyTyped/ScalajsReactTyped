package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.muiDatatables.mod.MUIDataTableSearch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableSearch {
  def apply(
    classes: js.Object = null,
    onHide: /* args */ js.Any => CallbackTo[js.Any] = null,
    onSearch: /* args */ js.Any => CallbackTo[js.Any] = null,
    options: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MUIDataTableSearch, 
    MountedWithRawType[MUIDataTableSearch, js.Object, RawMounted[MUIDataTableSearch, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1((t0: /* args */ js.Any) => onHide(t0).runNow()))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1((t0: /* args */ js.Any) => onSearch(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.muiDatatables.mod.MUIDataTableSearch, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.muiDatatables.mod.MUIDataTableSearch])(children: _*)
  }
  @JSImport("mui-datatables", "TableSearch")
  @js.native
  object componentImport extends js.Object
  
}

