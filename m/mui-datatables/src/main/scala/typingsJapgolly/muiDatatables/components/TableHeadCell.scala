package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.muiDatatables.mod.MUIDataTableHeadCell
import typingsJapgolly.muiDatatables.mod.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableHeadCell {
  def apply(
    hint: String,
    options: js.Object,
    sort: Boolean,
    toggleSort: js.Any => CallbackTo[js.Any],
    classes: js.Object = null,
    sortDirection: SortDirection = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Any = null
  ): UnmountedSimple[
    MUIDataTableHeadCell, 
    MountedWithRawType[MUIDataTableHeadCell, js.Object, RawMounted[MUIDataTableHeadCell, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.updateDynamic("toggleSort")(js.Any.fromFunction1((t0: js.Any) => toggleSort(t0).runNow()))
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.muiDatatables.mod.MUIDataTableHeadCell, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.muiDatatables.mod.MUIDataTableHeadCell])
  }
  @JSImport("mui-datatables", "TableHeadCell")
  @js.native
  object componentImport extends js.Object
  
}

