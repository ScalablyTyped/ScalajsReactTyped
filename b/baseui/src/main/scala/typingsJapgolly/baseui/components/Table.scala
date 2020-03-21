package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.tableMod.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table {
  def apply(
    columns: js.Array[String | Node],
    data: js.Array[js.Array[Node]],
    horizontalScrollWidth: String = null,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TableProps, typingsJapgolly.baseui.tableMod.Table, Unit, TableProps] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
      if (horizontalScrollWidth != null) __obj.updateDynamic("horizontalScrollWidth")(horizontalScrollWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.tableMod.TableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.tableMod.Table](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.tableMod.TableProps])(children: _*)
  }
  @JSImport("baseui/table", "Table")
  @js.native
  object componentImport extends js.Object
  
}

