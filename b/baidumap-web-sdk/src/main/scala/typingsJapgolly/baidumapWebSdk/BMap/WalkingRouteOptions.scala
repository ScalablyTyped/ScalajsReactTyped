package typingsJapgolly.baidumapWebSdk.BMap

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkingRouteOptions extends js.Object {
  var onInfoHtmlSet: js.UndefOr[js.Function2[/* poi */ LocalResultPoi, /* html */ HTMLElement, Unit]] = js.undefined
  var onMarkersSet: js.UndefOr[js.Function1[/* pois */ js.Array[LocalResultPoi], Unit]] = js.undefined
  var onPolylinesSet: js.UndefOr[js.Function1[/* routes */ js.Array[Route], Unit]] = js.undefined
  var onResultsHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.undefined
  var onSearchComplete: js.UndefOr[js.Function1[/* result */ WalkingRouteResult, Unit]] = js.undefined
  var renderOptions: js.UndefOr[RenderOptions] = js.undefined
}

object WalkingRouteOptions {
  @scala.inline
  def apply(
    onInfoHtmlSet: (/* poi */ LocalResultPoi, /* html */ HTMLElement) => japgolly.scalajs.react.Callback = null,
    onMarkersSet: /* pois */ js.Array[LocalResultPoi] => japgolly.scalajs.react.Callback = null,
    onPolylinesSet: /* routes */ js.Array[Route] => japgolly.scalajs.react.Callback = null,
    onResultsHtmlSet: /* container */ HTMLElement => japgolly.scalajs.react.Callback = null,
    onSearchComplete: /* result */ WalkingRouteResult => japgolly.scalajs.react.Callback = null,
    renderOptions: RenderOptions = null
  ): WalkingRouteOptions = {
    val __obj = js.Dynamic.literal()
    if (onInfoHtmlSet != null) __obj.updateDynamic("onInfoHtmlSet")(js.Any.fromFunction2((t0: /* poi */ typingsJapgolly.baidumapWebSdk.BMap.LocalResultPoi, t1: /* html */ org.scalajs.dom.raw.HTMLElement) => onInfoHtmlSet(t0, t1).runNow()))
    if (onMarkersSet != null) __obj.updateDynamic("onMarkersSet")(js.Any.fromFunction1((t0: /* pois */ js.Array[typingsJapgolly.baidumapWebSdk.BMap.LocalResultPoi]) => onMarkersSet(t0).runNow()))
    if (onPolylinesSet != null) __obj.updateDynamic("onPolylinesSet")(js.Any.fromFunction1((t0: /* routes */ js.Array[typingsJapgolly.baidumapWebSdk.BMap.Route]) => onPolylinesSet(t0).runNow()))
    if (onResultsHtmlSet != null) __obj.updateDynamic("onResultsHtmlSet")(js.Any.fromFunction1((t0: /* container */ org.scalajs.dom.raw.HTMLElement) => onResultsHtmlSet(t0).runNow()))
    if (onSearchComplete != null) __obj.updateDynamic("onSearchComplete")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.baidumapWebSdk.BMap.WalkingRouteResult) => onSearchComplete(t0).runNow()))
    if (renderOptions != null) __obj.updateDynamic("renderOptions")(renderOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkingRouteOptions]
  }
}

