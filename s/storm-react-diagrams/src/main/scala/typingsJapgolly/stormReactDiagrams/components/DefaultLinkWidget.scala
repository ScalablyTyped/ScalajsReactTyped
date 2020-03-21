package typingsJapgolly.stormReactDiagrams.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.stormReactDiagrams.defaultLinkModelMod.DefaultLinkModel
import typingsJapgolly.stormReactDiagrams.defaultLinkWidgetMod.DefaultLinkProps
import typingsJapgolly.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsJapgolly.stormReactDiagrams.pointModelMod.PointModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DefaultLinkWidget {
  def apply(
    diagramEngine: DiagramEngine,
    link: DefaultLinkModel,
    baseClass: String = null,
    className: String = null,
    color: String = null,
    extraProps: js.Any = null,
    pointAdded: (/* point */ PointModel, /* event */ MouseEvent) => CallbackTo[js.Any] = null,
    smooth: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DefaultLinkProps, 
    typingsJapgolly.stormReactDiagrams.mod.DefaultLinkWidget, 
    Unit, 
    DefaultLinkProps
  ] = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
  
      if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    if (pointAdded != null) __obj.updateDynamic("pointAdded")(js.Any.fromFunction2((t0: /* point */ typingsJapgolly.stormReactDiagrams.pointModelMod.PointModel, t1: /* event */ org.scalajs.dom.raw.MouseEvent) => pointAdded(t0, t1).runNow()))
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.stormReactDiagrams.defaultLinkWidgetMod.DefaultLinkProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.stormReactDiagrams.mod.DefaultLinkWidget](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.stormReactDiagrams.defaultLinkWidgetMod.DefaultLinkProps])(children: _*)
  }
  @JSImport("storm-react-diagrams", "DefaultLinkWidget")
  @js.native
  object componentImport extends js.Object
  
}

