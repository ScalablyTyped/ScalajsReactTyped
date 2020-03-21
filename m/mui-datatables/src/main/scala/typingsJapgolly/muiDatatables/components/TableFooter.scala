package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.muiDatatables.mod.MUIDataTableFooter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableFooter {
  def apply(
    changePage: js.Any = null,
    changeRowsPerPage: /* args */ js.Any => CallbackTo[js.Any] = null,
    options: js.Object = null,
    page: Int | Double = null,
    rowCount: Int | Double = null,
    rowsPerPage: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MUIDataTableFooter, 
    MountedWithRawType[MUIDataTableFooter, js.Object, RawMounted[MUIDataTableFooter, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (changePage != null) __obj.updateDynamic("changePage")(changePage.asInstanceOf[js.Any])
    if (changeRowsPerPage != null) __obj.updateDynamic("changeRowsPerPage")(js.Any.fromFunction1((t0: /* args */ js.Any) => changeRowsPerPage(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (rowsPerPage != null) __obj.updateDynamic("rowsPerPage")(rowsPerPage.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.muiDatatables.mod.MUIDataTableFooter, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.muiDatatables.mod.MUIDataTableFooter])(children: _*)
  }
  @JSImport("mui-datatables", "TableFooter")
  @js.native
  object componentImport extends js.Object
  
}

