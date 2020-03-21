package typingsJapgolly.stormReactDiagrams.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.stormReactDiagrams.defaultPortLabelWidgetMod.DefaultPortLabelProps
import typingsJapgolly.stormReactDiagrams.defaultPortModelMod.DefaultPortModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DefaultPortLabel {
  def apply(
    model: DefaultPortModel,
    baseClass: String = null,
    className: String = null,
    extraProps: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DefaultPortLabelProps, 
    typingsJapgolly.stormReactDiagrams.mod.DefaultPortLabel, 
    Unit, 
    DefaultPortLabelProps
  ] = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
  
      if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.stormReactDiagrams.defaultPortLabelWidgetMod.DefaultPortLabelProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.stormReactDiagrams.mod.DefaultPortLabel](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.stormReactDiagrams.defaultPortLabelWidgetMod.DefaultPortLabelProps])(children: _*)
  }
  @JSImport("storm-react-diagrams", "DefaultPortLabel")
  @js.native
  object componentImport extends js.Object
  
}

