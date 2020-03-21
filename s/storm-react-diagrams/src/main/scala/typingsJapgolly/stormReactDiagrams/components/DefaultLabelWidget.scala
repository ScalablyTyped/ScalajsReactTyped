package typingsJapgolly.stormReactDiagrams.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.stormReactDiagrams.defaultLabelModelMod.DefaultLabelModel
import typingsJapgolly.stormReactDiagrams.defaultLabelWidgetMod.DefaultLabelWidgetProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DefaultLabelWidget {
  def apply(
    model: DefaultLabelModel,
    baseClass: String = null,
    className: String = null,
    extraProps: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DefaultLabelWidgetProps, 
    typingsJapgolly.stormReactDiagrams.mod.DefaultLabelWidget, 
    Unit, 
    DefaultLabelWidgetProps
  ] = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
  
      if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.stormReactDiagrams.defaultLabelWidgetMod.DefaultLabelWidgetProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.stormReactDiagrams.mod.DefaultLabelWidget](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.stormReactDiagrams.defaultLabelWidgetMod.DefaultLabelWidgetProps])(children: _*)
  }
  @JSImport("storm-react-diagrams", "DefaultLabelWidget")
  @js.native
  object componentImport extends js.Object
  
}

