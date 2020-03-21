package typingsJapgolly.baidumapWebSdk.BMap

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitRouteOptions extends js.Object {
  var onInfoHtmlSet: js.UndefOr[js.Function2[/* poi */ LocalResultPoi, /* html */ HTMLElement, Unit]] = js.undefined
  var onMarkersSet: js.UndefOr[
    js.Function2[/* pois */ js.Array[LocalResultPoi], /* transfers */ js.Array[LocalResultPoi], Unit]
  ] = js.undefined
  var onPolylinesSet: js.UndefOr[js.Function1[/* lines */ js.Array[Line], Unit]] = js.undefined
  var onResultsHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.undefined
  var onSearchComplete: js.UndefOr[js.Function1[/* result */ TransitRouteResult, Unit]] = js.undefined
  var pageCapacity: js.UndefOr[Double] = js.undefined
  var policy: js.UndefOr[TransitPolicy] = js.undefined
  var renderOptions: js.UndefOr[RenderOptions] = js.undefined
}

object TransitRouteOptions {
  @scala.inline
  def apply(
    onInfoHtmlSet: (/* poi */ LocalResultPoi, /* html */ HTMLElement) => japgolly.scalajs.react.Callback = null,
    onMarkersSet: (/* pois */ js.Array[LocalResultPoi], /* transfers */ js.Array[LocalResultPoi]) => japgolly.scalajs.react.Callback = null,
    onPolylinesSet: /* lines */ js.Array[Line] => japgolly.scalajs.react.Callback = null,
    onResultsHtmlSet: /* container */ HTMLElement => japgolly.scalajs.react.Callback = null,
    onSearchComplete: /* result */ TransitRouteResult => japgolly.scalajs.react.Callback = null,
    pageCapacity: Int | Double = null,
    policy: Int | Double = null,
    renderOptions: RenderOptions = null
  ): TransitRouteOptions = {
    val __obj = js.Dynamic.literal()
    if (onInfoHtmlSet != null) __obj.updateDynamic("onInfoHtmlSet")(js.Any.fromFunction2((t0: /* poi */ typingsJapgolly.baidumapWebSdk.BMap.LocalResultPoi, t1: /* html */ org.scalajs.dom.raw.HTMLElement) => onInfoHtmlSet(t0, t1).runNow()))
    if (onMarkersSet != null) __obj.updateDynamic("onMarkersSet")(js.Any.fromFunction2((t0: /* pois */ js.Array[typingsJapgolly.baidumapWebSdk.BMap.LocalResultPoi], t1: /* transfers */ js.Array[typingsJapgolly.baidumapWebSdk.BMap.LocalResultPoi]) => onMarkersSet(t0, t1).runNow()))
    if (onPolylinesSet != null) __obj.updateDynamic("onPolylinesSet")(js.Any.fromFunction1((t0: /* lines */ js.Array[typingsJapgolly.baidumapWebSdk.BMap.Line]) => onPolylinesSet(t0).runNow()))
    if (onResultsHtmlSet != null) __obj.updateDynamic("onResultsHtmlSet")(js.Any.fromFunction1((t0: /* container */ org.scalajs.dom.raw.HTMLElement) => onResultsHtmlSet(t0).runNow()))
    if (onSearchComplete != null) __obj.updateDynamic("onSearchComplete")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.baidumapWebSdk.BMap.TransitRouteResult) => onSearchComplete(t0).runNow()))
    if (pageCapacity != null) __obj.updateDynamic("pageCapacity")(pageCapacity.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (renderOptions != null) __obj.updateDynamic("renderOptions")(renderOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitRouteOptions]
  }
}

