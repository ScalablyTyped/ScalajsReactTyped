package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.muiDatatables.mod.MUIDataTableViewCol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableViewCol {
  def apply(
    columns: js.Array[_],
    `object`: js.Object,
    onColumnUpdate: js.Any => CallbackTo[js.Any],
    classes: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MUIDataTableViewCol, 
    MountedWithRawType[MUIDataTableViewCol, js.Object, RawMounted[MUIDataTableViewCol, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
  
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("onColumnUpdate")(js.Any.fromFunction1((t0: js.Any) => onColumnUpdate(t0).runNow()))
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.muiDatatables.mod.MUIDataTableViewCol, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.muiDatatables.mod.MUIDataTableViewCol])(children: _*)
  }
  @JSImport("mui-datatables", "TableViewCol")
  @js.native
  object componentImport extends js.Object
  
}

