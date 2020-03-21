package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.muiDatatables.mod.MUIDataTablePagination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TablePagination {
  def apply(
    count: Double,
    options: js.Object,
    page: Double,
    rowsPerPage: Double,
    changeRowsPerPage: js.Any => CallbackTo[js.Any],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MUIDataTablePagination, 
    MountedWithRawType[MUIDataTablePagination, js.Object, RawMounted[MUIDataTablePagination, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], rowsPerPage = rowsPerPage.asInstanceOf[js.Any])
  
      __obj.updateDynamic("changeRowsPerPage")(js.Any.fromFunction1((t0: js.Any) => changeRowsPerPage(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.muiDatatables.mod.MUIDataTablePagination, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.muiDatatables.mod.MUIDataTablePagination])(children: _*)
  }
  @JSImport("mui-datatables", "TablePagination")
  @js.native
  object componentImport extends js.Object
  
}

