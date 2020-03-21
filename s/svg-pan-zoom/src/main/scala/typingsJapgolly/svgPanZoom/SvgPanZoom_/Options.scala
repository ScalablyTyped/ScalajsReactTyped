package typingsJapgolly.svgPanZoom.SvgPanZoom_

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGMatrix
import typingsJapgolly.svgPanZoom.svgPanZoomStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var beforePan: js.UndefOr[
    js.Function2[/* oldPan */ Point, /* newPan */ Point, Unit | Boolean | PointModifier]
  ] = js.undefined
   // (default 'auto')
  var beforeZoom: js.UndefOr[js.Function2[/* oldScale */ Double, /* newScale */ Double, Unit | Boolean]] = js.undefined
   // (default true)
  var center: js.UndefOr[Boolean] = js.undefined
   // enable or disable viewport fit in SVG (default true)
  var contain: js.UndefOr[Boolean] = js.undefined
  /**
    * insert icons to give user an option in addition to mouse events to control pan/zoom (default disabled)
    * @type {boolean}
    */
  var controlIconsEnabled: js.UndefOr[Boolean] = js.undefined
  var customEventsHandler: js.UndefOr[CustomEventHandler] = js.undefined
  /**
    * enable or disable zooming by double clicking (default enabled)
    * @type {boolean}
    */
  var dblClickZoomEnabled: js.UndefOr[Boolean] = js.undefined
   // (default null)
  var eventsListenerElement: js.UndefOr[SVGElement] = js.undefined
   // Maximum Zoom level  (Default 10)
  var fit: js.UndefOr[Boolean] = js.undefined
   // Minimum Zoom level (Default 0.5)
  var maxZoom: js.UndefOr[Double] = js.undefined
   // Zoom sensitivity (Default 0.2)
  var minZoom: js.UndefOr[Double] = js.undefined
  /**
    * enable or disable zooming by scrolling (default enabled)
    * @type {boolean}
    */
  var mouseWheelZoomEnabled: js.UndefOr[Boolean] = js.undefined
  var onPan: js.UndefOr[js.Function1[/* newPan */ Point, Unit]] = js.undefined
  var onUpdatedCTM: js.UndefOr[js.Function1[/* newCTM */ SVGMatrix, Unit]] = js.undefined
  var onZoom: js.UndefOr[js.Function1[/* newScale */ Double, Unit]] = js.undefined
  /**
    * enable or disable panning (default enabled)
    * @type {boolean}
    */
  var panEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * prevent mouse events to bubble up (default enabled)
    * @type {boolean}
    */
  var preventMouseEventsDefault: js.UndefOr[Boolean] = js.undefined
   // enable or disable viewport centering in SVG (default true)
  var refreshRate: js.UndefOr[Double | auto] = js.undefined
  /**
    * can be querySelector string or SVGElement (default enabled)
    * @type {string|HTMLElement|SVGElement}
    */
  var viewportSelector: js.UndefOr[String | HTMLElement | SVGElement] = js.undefined
  /**
    * enable or disable zooming (default enabled)
    * @type {boolean}
    */
  var zoomEnabled: js.UndefOr[Boolean] = js.undefined
  var zoomScaleSensitivity: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    beforePan: (/* oldPan */ Point, /* newPan */ Point) => CallbackTo[Unit | Boolean | PointModifier] = null,
    beforeZoom: (/* oldScale */ Double, /* newScale */ Double) => CallbackTo[Unit | Boolean] = null,
    center: js.UndefOr[Boolean] = js.undefined,
    contain: js.UndefOr[Boolean] = js.undefined,
    controlIconsEnabled: js.UndefOr[Boolean] = js.undefined,
    customEventsHandler: CustomEventHandler = null,
    dblClickZoomEnabled: js.UndefOr[Boolean] = js.undefined,
    eventsListenerElement: SVGElement = null,
    fit: js.UndefOr[Boolean] = js.undefined,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    mouseWheelZoomEnabled: js.UndefOr[Boolean] = js.undefined,
    onPan: /* newPan */ Point => Callback = null,
    onUpdatedCTM: /* newCTM */ SVGMatrix => Callback = null,
    onZoom: /* newScale */ Double => Callback = null,
    panEnabled: js.UndefOr[Boolean] = js.undefined,
    preventMouseEventsDefault: js.UndefOr[Boolean] = js.undefined,
    refreshRate: Double | auto = null,
    viewportSelector: String | HTMLElement | SVGElement = null,
    zoomEnabled: js.UndefOr[Boolean] = js.undefined,
    zoomScaleSensitivity: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (beforePan != null) __obj.updateDynamic("beforePan")(js.Any.fromFunction2((t0: /* oldPan */ typingsJapgolly.svgPanZoom.SvgPanZoom_.Point, t1: /* newPan */ typingsJapgolly.svgPanZoom.SvgPanZoom_.Point) => beforePan(t0, t1).runNow()))
    if (beforeZoom != null) __obj.updateDynamic("beforeZoom")(js.Any.fromFunction2((t0: /* oldScale */ scala.Double, t1: /* newScale */ scala.Double) => beforeZoom(t0, t1).runNow()))
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(contain)) __obj.updateDynamic("contain")(contain.asInstanceOf[js.Any])
    if (!js.isUndefined(controlIconsEnabled)) __obj.updateDynamic("controlIconsEnabled")(controlIconsEnabled.asInstanceOf[js.Any])
    if (customEventsHandler != null) __obj.updateDynamic("customEventsHandler")(customEventsHandler.asInstanceOf[js.Any])
    if (!js.isUndefined(dblClickZoomEnabled)) __obj.updateDynamic("dblClickZoomEnabled")(dblClickZoomEnabled.asInstanceOf[js.Any])
    if (eventsListenerElement != null) __obj.updateDynamic("eventsListenerElement")(eventsListenerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseWheelZoomEnabled)) __obj.updateDynamic("mouseWheelZoomEnabled")(mouseWheelZoomEnabled.asInstanceOf[js.Any])
    if (onPan != null) __obj.updateDynamic("onPan")(js.Any.fromFunction1((t0: /* newPan */ typingsJapgolly.svgPanZoom.SvgPanZoom_.Point) => onPan(t0).runNow()))
    if (onUpdatedCTM != null) __obj.updateDynamic("onUpdatedCTM")(js.Any.fromFunction1((t0: /* newCTM */ org.scalajs.dom.raw.SVGMatrix) => onUpdatedCTM(t0).runNow()))
    if (onZoom != null) __obj.updateDynamic("onZoom")(js.Any.fromFunction1((t0: /* newScale */ scala.Double) => onZoom(t0).runNow()))
    if (!js.isUndefined(panEnabled)) __obj.updateDynamic("panEnabled")(panEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(preventMouseEventsDefault)) __obj.updateDynamic("preventMouseEventsDefault")(preventMouseEventsDefault.asInstanceOf[js.Any])
    if (refreshRate != null) __obj.updateDynamic("refreshRate")(refreshRate.asInstanceOf[js.Any])
    if (viewportSelector != null) __obj.updateDynamic("viewportSelector")(viewportSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomEnabled)) __obj.updateDynamic("zoomEnabled")(zoomEnabled.asInstanceOf[js.Any])
    if (zoomScaleSensitivity != null) __obj.updateDynamic("zoomScaleSensitivity")(zoomScaleSensitivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

