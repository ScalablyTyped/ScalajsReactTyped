package typingsJapgolly.stormReactDiagrams.diagramWidgetMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.stormReactDiagrams.baseActionMod.BaseAction
import typingsJapgolly.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typingsJapgolly.stormReactDiagrams.diagramEngineMod.DiagramEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramProps extends BaseWidgetProps {
  var actionStartedFiring: js.UndefOr[js.Function1[/* action */ BaseAction, Boolean]] = js.undefined
  var actionStillFiring: js.UndefOr[js.Function1[/* action */ BaseAction, Unit]] = js.undefined
  var actionStoppedFiring: js.UndefOr[js.Function1[/* action */ BaseAction, Unit]] = js.undefined
  var allowCanvasTranslation: js.UndefOr[Boolean] = js.undefined
  var allowCanvasZoom: js.UndefOr[Boolean] = js.undefined
  var allowLooseLinks: js.UndefOr[Boolean] = js.undefined
  var deleteKeys: js.UndefOr[js.Array[Double]] = js.undefined
  var diagramEngine: DiagramEngine
  var inverseZoom: js.UndefOr[Boolean] = js.undefined
  var maxNumberPointsPerLink: js.UndefOr[Double] = js.undefined
  var smartRouting: js.UndefOr[Boolean] = js.undefined
}

object DiagramProps {
  @scala.inline
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
    smartRouting: js.UndefOr[Boolean] = js.undefined
  ): DiagramProps = {
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
    __obj.asInstanceOf[DiagramProps]
  }
}

