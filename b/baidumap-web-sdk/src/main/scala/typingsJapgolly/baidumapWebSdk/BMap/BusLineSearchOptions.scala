package typingsJapgolly.baidumapWebSdk.BMap

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusLineSearchOptions extends js.Object {
  var onBusLineHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.undefined
  var onBusListHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.undefined
  var onGetBusLineComplete: js.UndefOr[js.Function1[/* rs */ BusLine, Unit]] = js.undefined
  var onGetBusListComplete: js.UndefOr[js.Function1[/* rs */ BusListResult, Unit]] = js.undefined
  var onMarkersSet: js.UndefOr[js.Function1[/* sts */ js.Array[Marker], Unit]] = js.undefined
  var onPolylinesSet: js.UndefOr[js.Function1[/* ply */ Polyline, Unit]] = js.undefined
  var renderOptions: js.UndefOr[RenderOptions] = js.undefined
}

object BusLineSearchOptions {
  @scala.inline
  def apply(
    onBusLineHtmlSet: /* container */ HTMLElement => japgolly.scalajs.react.Callback = null,
    onBusListHtmlSet: /* container */ HTMLElement => japgolly.scalajs.react.Callback = null,
    onGetBusLineComplete: /* rs */ BusLine => japgolly.scalajs.react.Callback = null,
    onGetBusListComplete: /* rs */ BusListResult => japgolly.scalajs.react.Callback = null,
    onMarkersSet: /* sts */ js.Array[Marker] => japgolly.scalajs.react.Callback = null,
    onPolylinesSet: /* ply */ Polyline => japgolly.scalajs.react.Callback = null,
    renderOptions: RenderOptions = null
  ): BusLineSearchOptions = {
    val __obj = js.Dynamic.literal()
    if (onBusLineHtmlSet != null) __obj.updateDynamic("onBusLineHtmlSet")(js.Any.fromFunction1((t0: /* container */ org.scalajs.dom.raw.HTMLElement) => onBusLineHtmlSet(t0).runNow()))
    if (onBusListHtmlSet != null) __obj.updateDynamic("onBusListHtmlSet")(js.Any.fromFunction1((t0: /* container */ org.scalajs.dom.raw.HTMLElement) => onBusListHtmlSet(t0).runNow()))
    if (onGetBusLineComplete != null) __obj.updateDynamic("onGetBusLineComplete")(js.Any.fromFunction1((t0: /* rs */ typingsJapgolly.baidumapWebSdk.BMap.BusLine) => onGetBusLineComplete(t0).runNow()))
    if (onGetBusListComplete != null) __obj.updateDynamic("onGetBusListComplete")(js.Any.fromFunction1((t0: /* rs */ typingsJapgolly.baidumapWebSdk.BMap.BusListResult) => onGetBusListComplete(t0).runNow()))
    if (onMarkersSet != null) __obj.updateDynamic("onMarkersSet")(js.Any.fromFunction1((t0: /* sts */ js.Array[typingsJapgolly.baidumapWebSdk.BMap.Marker]) => onMarkersSet(t0).runNow()))
    if (onPolylinesSet != null) __obj.updateDynamic("onPolylinesSet")(js.Any.fromFunction1((t0: /* ply */ typingsJapgolly.baidumapWebSdk.BMap.Polyline) => onPolylinesSet(t0).runNow()))
    if (renderOptions != null) __obj.updateDynamic("renderOptions")(renderOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusLineSearchOptions]
  }
}

