package typingsJapgolly.baidumapWebSdk.BMap

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrivingRouteOptions extends js.Object {
  var onInfoHtmlSet: js.UndefOr[js.Function2[/* poi */ LocalResultPoi, /* html */ HTMLElement, Unit]] = js.undefined
  var onMarkersSet: js.UndefOr[js.Function1[/* pois */ js.Array[LocalResultPoi], Unit]] = js.undefined
  var onPolylinesSet: js.UndefOr[js.Function1[/* routes */ js.Array[Route], Unit]] = js.undefined
  var onResultsHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.undefined
  var onSearchComplete: js.UndefOr[js.Function1[/* results */ DrivingRouteResult, Unit]] = js.undefined
  var policy: js.UndefOr[DrivingPolicy] = js.undefined
  var renderOptions: js.UndefOr[RenderOptions] = js.undefined
}

object DrivingRouteOptions {
  @scala.inline
  def apply(
    onInfoHtmlSet: (/* poi */ LocalResultPoi, /* html */ HTMLElement) => japgolly.scalajs.react.Callback = null,
    onMarkersSet: /* pois */ js.Array[LocalResultPoi] => japgolly.scalajs.react.Callback = null,
    onPolylinesSet: /* routes */ js.Array[Route] => japgolly.scalajs.react.Callback = null,
    onResultsHtmlSet: /* container */ HTMLElement => japgolly.scalajs.react.Callback = null,
    onSearchComplete: /* results */ DrivingRouteResult => japgolly.scalajs.react.Callback = null,
    policy: Int | Double = null,
    renderOptions: RenderOptions = null
  ): DrivingRouteOptions = {
    val __obj = js.Dynamic.literal()
    if (onInfoHtmlSet != null) __obj.updateDynamic("onInfoHtmlSet")(js.Any.fromFunction2((t0: /* poi */ typingsJapgolly.baidumapWebSdk.BMap.LocalResultPoi, t1: /* html */ org.scalajs.dom.raw.HTMLElement) => onInfoHtmlSet(t0, t1).runNow()))
    if (onMarkersSet != null) __obj.updateDynamic("onMarkersSet")(js.Any.fromFunction1((t0: /* pois */ js.Array[typingsJapgolly.baidumapWebSdk.BMap.LocalResultPoi]) => onMarkersSet(t0).runNow()))
    if (onPolylinesSet != null) __obj.updateDynamic("onPolylinesSet")(js.Any.fromFunction1((t0: /* routes */ js.Array[typingsJapgolly.baidumapWebSdk.BMap.Route]) => onPolylinesSet(t0).runNow()))
    if (onResultsHtmlSet != null) __obj.updateDynamic("onResultsHtmlSet")(js.Any.fromFunction1((t0: /* container */ org.scalajs.dom.raw.HTMLElement) => onResultsHtmlSet(t0).runNow()))
    if (onSearchComplete != null) __obj.updateDynamic("onSearchComplete")(js.Any.fromFunction1((t0: /* results */ typingsJapgolly.baidumapWebSdk.BMap.DrivingRouteResult) => onSearchComplete(t0).runNow()))
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (renderOptions != null) __obj.updateDynamic("renderOptions")(renderOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrivingRouteOptions]
  }
}

