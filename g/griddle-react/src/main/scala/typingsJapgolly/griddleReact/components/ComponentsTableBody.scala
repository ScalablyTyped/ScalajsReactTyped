package typingsJapgolly.griddleReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.griddleReact.mod.components.TableBody
import typingsJapgolly.griddleReact.mod.components.TableBodyProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsTableBody {
  def apply(
    Row: js.Any = null,
    className: String = null,
    rowIds: js.Array[Double] = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TableBodyProps, TableBody, Unit, TableBodyProps] = {
    val __obj = js.Dynamic.literal()
  
      if (Row != null) __obj.updateDynamic("Row")(Row.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (rowIds != null) __obj.updateDynamic("rowIds")(rowIds.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.griddleReact.mod.components.TableBodyProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.griddleReact.mod.components.TableBody](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.griddleReact.mod.components.TableBodyProps])(children: _*)
  }
  @JSImport("griddle-react", "components.TableBody")
  @js.native
  object componentImport extends js.Object
  
}

