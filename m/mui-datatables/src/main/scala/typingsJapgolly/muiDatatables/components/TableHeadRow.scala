package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.muiDatatables.mod.MUIDataTableHeadRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableHeadRow {
  def apply(
    classes: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MUIDataTableHeadRow, 
    MountedWithRawType[MUIDataTableHeadRow, js.Object, RawMounted[MUIDataTableHeadRow, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.muiDatatables.mod.MUIDataTableHeadRow, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.muiDatatables.mod.MUIDataTableHeadRow])(children: _*)
  }
  @JSImport("mui-datatables", "TableHeadRow")
  @js.native
  object componentImport extends js.Object
  
}

