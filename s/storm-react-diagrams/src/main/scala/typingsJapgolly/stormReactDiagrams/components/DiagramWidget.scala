package typingsJapgolly.stormReactDiagrams.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.stormReactDiagrams.baseActionMod.BaseAction
import typingsJapgolly.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsJapgolly.stormReactDiagrams.diagramWidgetMod.DiagramProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DiagramWidget {
  def apply(
    diagramEngine: DiagramEngine,
    actionStartedFiring: /* action */ BaseAction => CallbackTo[Boolean] = null,
    actionStillFiring: /* action */ BaseAction => Callback = null,
    actionStoppedFiring: /* action */ BaseAction => Callback = null,
    allowCanvasTranslation: js.UndefOr[Boolean] = js.undefined,
    allowCanvasZoom: js.UndefOr[Boolean] = js.undefined,
    allowLooseLinks: js.UndefOr[Boolean] = js.undefined,
    baseClass: String = null,
    className: String = null,
    deleteKeys: js.Array[Double] = null,
    extraProps: js.Any = null,
    inverseZoom: js.UndefOr[Boolean] = js.undefined,
    maxNumberPointsPerLink: Int | Double = null,
    smartRouting: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DiagramProps, typingsJapgolly.stormReactDiagrams.mod.DiagramWidget, Unit, DiagramProps] = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any])
  
      if (actionStartedFiring != null) __obj.updateDynamic("actionStartedFiring")(js.Any.fromFunction1((t0: /* action */ typingsJapgolly.stormReactDiagrams.baseActionMod.BaseAction) => actionStartedFiring(t0).runNow()))
    if (actionStillFiring != null) __obj.updateDynamic("actionStillFiring")(js.Any.fromFunction1((t0: /* action */ typingsJapgolly.stormReactDiagrams.baseActionMod.BaseAction) => actionStillFiring(t0).runNow()))
    if (actionStoppedFiring != null) __obj.updateDynamic("actionStoppedFiring")(js.Any.fromFunction1((t0: /* action */ typingsJapgolly.stormReactDiagrams.baseActionMod.BaseAction) => actionStoppedFiring(t0).runNow()))
    if (!js.isUndefined(allowCanvasTranslation)) __obj.updateDynamic("allowCanvasTranslation")(allowCanvasTranslation.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCanvasZoom)) __obj.updateDynamic("allowCanvasZoom")(allowCanvasZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(allowLooseLinks)) __obj.updateDynamic("allowLooseLinks")(allowLooseLinks.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (deleteKeys != null) __obj.updateDynamic("deleteKeys")(deleteKeys.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    if (!js.isUndefined(inverseZoom)) __obj.updateDynamic("inverseZoom")(inverseZoom.asInstanceOf[js.Any])
    if (maxNumberPointsPerLink != null) __obj.updateDynamic("maxNumberPointsPerLink")(maxNumberPointsPerLink.asInstanceOf[js.Any])
    if (!js.isUndefined(smartRouting)) __obj.updateDynamic("smartRouting")(smartRouting.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.stormReactDiagrams.diagramWidgetMod.DiagramProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.stormReactDiagrams.mod.DiagramWidget](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.stormReactDiagrams.diagramWidgetMod.DiagramProps])(children: _*)
  }
  @JSImport("storm-react-diagrams", "DiagramWidget")
  @js.native
  object componentImport extends js.Object
  
}

