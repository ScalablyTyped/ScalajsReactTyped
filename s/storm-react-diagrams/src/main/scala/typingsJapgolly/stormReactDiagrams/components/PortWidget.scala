package typingsJapgolly.stormReactDiagrams.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.stormReactDiagrams.nodeModelMod.NodeModel
import typingsJapgolly.stormReactDiagrams.portWidgetMod.PortProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PortWidget {
  def apply(
    name: String,
    node: NodeModel,
    baseClass: String = null,
    className: String = null,
    extraProps: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PortProps, typingsJapgolly.stormReactDiagrams.mod.PortWidget, Unit, PortProps] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
      if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.stormReactDiagrams.portWidgetMod.PortProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.stormReactDiagrams.mod.PortWidget](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.stormReactDiagrams.portWidgetMod.PortProps])(children: _*)
  }
  @JSImport("storm-react-diagrams", "PortWidget")
  @js.native
  object componentImport extends js.Object
  
}

