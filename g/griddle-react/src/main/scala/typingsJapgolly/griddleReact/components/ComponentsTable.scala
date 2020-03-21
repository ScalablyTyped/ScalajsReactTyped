package typingsJapgolly.griddleReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.griddleReact.mod.components.Table
import typingsJapgolly.griddleReact.mod.components.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsTable {
  def apply(
    NoResults: js.Any = null,
    TableBody: js.Any = null,
    TableHeading: js.Any = null,
    visibleRows: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TableProps, Table, Unit, TableProps] = {
    val __obj = js.Dynamic.literal()
  
      if (NoResults != null) __obj.updateDynamic("NoResults")(NoResults.asInstanceOf[js.Any])
    if (TableBody != null) __obj.updateDynamic("TableBody")(TableBody.asInstanceOf[js.Any])
    if (TableHeading != null) __obj.updateDynamic("TableHeading")(TableHeading.asInstanceOf[js.Any])
    if (visibleRows != null) __obj.updateDynamic("visibleRows")(visibleRows.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.griddleReact.mod.components.TableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.griddleReact.mod.components.Table](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.griddleReact.mod.components.TableProps])(children: _*)
  }
  @JSImport("griddle-react", "components.Table")
  @js.native
  object componentImport extends js.Object
  
}

