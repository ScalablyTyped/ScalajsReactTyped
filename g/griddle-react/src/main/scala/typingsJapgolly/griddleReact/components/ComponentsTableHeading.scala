package typingsJapgolly.griddleReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.griddleReact.mod.components.TableHeading
import typingsJapgolly.griddleReact.mod.components.TableHeadingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsTableHeading {
  def apply(
    TableHeadingCell: js.Any,
    columnIds: js.Array[Double] = null,
    columnTitles: js.Array[String] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TableHeadingProps, TableHeading, Unit, TableHeadingProps] = {
    val __obj = js.Dynamic.literal(TableHeadingCell = TableHeadingCell.asInstanceOf[js.Any])
  
      if (columnIds != null) __obj.updateDynamic("columnIds")(columnIds.asInstanceOf[js.Any])
    if (columnTitles != null) __obj.updateDynamic("columnTitles")(columnTitles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.griddleReact.mod.components.TableHeadingProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.griddleReact.mod.components.TableHeading](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.griddleReact.mod.components.TableHeadingProps])(children: _*)
  }
  @JSImport("griddle-react", "components.TableHeading")
  @js.native
  object componentImport extends js.Object
  
}

