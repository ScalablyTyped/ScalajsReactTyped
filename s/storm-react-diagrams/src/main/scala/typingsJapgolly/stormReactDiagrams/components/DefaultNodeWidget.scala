package typingsJapgolly.stormReactDiagrams.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.stormReactDiagrams.defaultNodeModelMod.DefaultNodeModel
import typingsJapgolly.stormReactDiagrams.defaultNodeWidgetMod.DefaultNodeProps
import typingsJapgolly.stormReactDiagrams.diagramEngineMod.DiagramEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DefaultNodeWidget {
  def apply(
    diagramEngine: DiagramEngine,
    node: DefaultNodeModel,
    baseClass: String = null,
    className: String = null,
    extraProps: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DefaultNodeProps, 
    typingsJapgolly.stormReactDiagrams.mod.DefaultNodeWidget, 
    Unit, 
    DefaultNodeProps
  ] = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
      if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.stormReactDiagrams.defaultNodeWidgetMod.DefaultNodeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.stormReactDiagrams.mod.DefaultNodeWidget](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.stormReactDiagrams.defaultNodeWidgetMod.DefaultNodeProps])(children: _*)
  }
  @JSImport("storm-react-diagrams", "DefaultNodeWidget")
  @js.native
  object componentImport extends js.Object
  
}

