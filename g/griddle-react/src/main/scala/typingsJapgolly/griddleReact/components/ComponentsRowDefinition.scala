package typingsJapgolly.griddleReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.griddleReact.mod.components.RowDefinition
import typingsJapgolly.griddleReact.mod.components.RowDefinitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsRowDefinition {
  def apply(
    StringDictionary: // Allow custom plugin props
  /* x */ StringDictionary[js.Any] = null,
    childColumnName: String = null,
    cssClassName: String | (js.Function1[/* props */ js.Any, String]) = null,
    rowKey: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RowDefinitionProps, RowDefinition, Unit, RowDefinitionProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (childColumnName != null) __obj.updateDynamic("childColumnName")(childColumnName.asInstanceOf[js.Any])
    if (cssClassName != null) __obj.updateDynamic("cssClassName")(cssClassName.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.griddleReact.mod.components.RowDefinitionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.griddleReact.mod.components.RowDefinition](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.griddleReact.mod.components.RowDefinitionProps])(children: _*)
  }
  @JSImport("griddle-react", "components.RowDefinition")
  @js.native
  object componentImport extends js.Object
  
}

