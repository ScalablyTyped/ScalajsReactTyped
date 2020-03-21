package typingsJapgolly.stormReactDiagrams.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsJapgolly.stormReactDiagrams.nodeLayerWidgetMod.NodeLayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NodeLayerWidget {
  def apply(
    diagramEngine: DiagramEngine,
    baseClass: String = null,
    className: String = null,
    extraProps: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    NodeLayerProps, 
    typingsJapgolly.stormReactDiagrams.mod.NodeLayerWidget, 
    Unit, 
    NodeLayerProps
  ] = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any])
  
      if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.stormReactDiagrams.nodeLayerWidgetMod.NodeLayerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.stormReactDiagrams.mod.NodeLayerWidget](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.stormReactDiagrams.nodeLayerWidgetMod.NodeLayerProps])(children: _*)
  }
  @JSImport("storm-react-diagrams", "NodeLayerWidget")
  @js.native
  object componentImport extends js.Object
  
}

