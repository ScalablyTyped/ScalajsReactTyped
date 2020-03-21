package typingsJapgolly.stormReactDiagrams.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsJapgolly.stormReactDiagrams.linkLayerWidgetMod.LinkLayerProps
import typingsJapgolly.stormReactDiagrams.pointModelMod.PointModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LinkLayerWidget {
  def apply(
    diagramEngine: DiagramEngine,
    pointAdded: (PointModel, MouseEvent) => CallbackTo[js.Any],
    baseClass: String = null,
    className: String = null,
    extraProps: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    LinkLayerProps, 
    typingsJapgolly.stormReactDiagrams.mod.LinkLayerWidget, 
    Unit, 
    LinkLayerProps
  ] = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any])
  
      __obj.updateDynamic("pointAdded")(js.Any.fromFunction2((t0: typingsJapgolly.stormReactDiagrams.pointModelMod.PointModel, t1: org.scalajs.dom.raw.MouseEvent) => pointAdded(t0, t1).runNow()))
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.stormReactDiagrams.linkLayerWidgetMod.LinkLayerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.stormReactDiagrams.mod.LinkLayerWidget](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.stormReactDiagrams.linkLayerWidgetMod.LinkLayerProps])(children: _*)
  }
  @JSImport("storm-react-diagrams", "LinkLayerWidget")
  @js.native
  object componentImport extends js.Object
  
}

