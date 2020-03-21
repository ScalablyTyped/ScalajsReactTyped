package typingsJapgolly.googleMapReact.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleMapReact.AnonPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  // Any options from https://developers.google.com/maps/documentation/javascript/reference/3/#MapOptions
  // excluding 'zoom' and 'center' which get set via props.
  var backgroundColor: js.UndefOr[String] = js.undefined
  var clickableIcons: js.UndefOr[Boolean] = js.undefined
  var controlSize: js.UndefOr[Double] = js.undefined
  var disableDefaultUI: js.UndefOr[Boolean] = js.undefined
  var disableDoubleClickZoom: js.UndefOr[Boolean] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var draggableCursor: js.UndefOr[String] = js.undefined
  var draggingCursor: js.UndefOr[String] = js.undefined
  var fullscreenControl: js.UndefOr[Boolean] = js.undefined
  var fullscreenControlOptions: js.UndefOr[AnonPosition] = js.undefined
  var gestureHandling: js.UndefOr[String] = js.undefined
  var heading: js.UndefOr[Double] = js.undefined
  var keyboardShortcuts: js.UndefOr[Boolean] = js.undefined
  var mapTypeControl: js.UndefOr[Boolean] = js.undefined
  var mapTypeControlOptions: js.UndefOr[js.Any] = js.undefined
  var mapTypeId: js.UndefOr[String] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var minZoomOverride: js.UndefOr[Boolean] = js.undefined
  var noClear: js.UndefOr[Boolean] = js.undefined
  var options: js.UndefOr[js.Function1[/* maps */ Maps, Props]] = js.undefined
  var panControl: js.UndefOr[Boolean] = js.undefined
  var panControlOptions: js.UndefOr[AnonPosition] = js.undefined
  var rotateControl: js.UndefOr[Boolean] = js.undefined
  var rotateControlOptions: js.UndefOr[AnonPosition] = js.undefined
  var scaleControl: js.UndefOr[Boolean] = js.undefined
  var scaleControlOptions: js.UndefOr[js.Any] = js.undefined
  var scrollwheel: js.UndefOr[Boolean] = js.undefined
  var streetView: js.UndefOr[js.Any] = js.undefined
  var streetViewControl: js.UndefOr[Boolean] = js.undefined
  var streetViewControlOptions: js.UndefOr[AnonPosition] = js.undefined
  var styles: js.UndefOr[js.Array[MapTypeStyle]] = js.undefined
  var tilt: js.UndefOr[Double] = js.undefined
  var zoomControl: js.UndefOr[Boolean] = js.undefined
  var zoomControlOptions: js.UndefOr[AnonPosition] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    clickableIcons: js.UndefOr[Boolean] = js.undefined,
    controlSize: Int | Double = null,
    disableDefaultUI: js.UndefOr[Boolean] = js.undefined,
    disableDoubleClickZoom: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    draggableCursor: String = null,
    draggingCursor: String = null,
    fullscreenControl: js.UndefOr[Boolean] = js.undefined,
    fullscreenControlOptions: AnonPosition = null,
    gestureHandling: String = null,
    heading: Int | Double = null,
    keyboardShortcuts: js.UndefOr[Boolean] = js.undefined,
    mapTypeControl: js.UndefOr[Boolean] = js.undefined,
    mapTypeControlOptions: js.Any = null,
    mapTypeId: String = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    minZoomOverride: js.UndefOr[Boolean] = js.undefined,
    noClear: js.UndefOr[Boolean] = js.undefined,
    options: /* maps */ Maps => CallbackTo[Props] = null,
    panControl: js.UndefOr[Boolean] = js.undefined,
    panControlOptions: AnonPosition = null,
    rotateControl: js.UndefOr[Boolean] = js.undefined,
    rotateControlOptions: AnonPosition = null,
    scaleControl: js.UndefOr[Boolean] = js.undefined,
    scaleControlOptions: js.Any = null,
    scrollwheel: js.UndefOr[Boolean] = js.undefined,
    streetView: js.Any = null,
    streetViewControl: js.UndefOr[Boolean] = js.undefined,
    streetViewControlOptions: AnonPosition = null,
    styles: js.Array[MapTypeStyle] = null,
    tilt: Int | Double = null,
    zoomControl: js.UndefOr[Boolean] = js.undefined,
    zoomControlOptions: AnonPosition = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(clickableIcons)) __obj.updateDynamic("clickableIcons")(clickableIcons.asInstanceOf[js.Any])
    if (controlSize != null) __obj.updateDynamic("controlSize")(controlSize.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDefaultUI)) __obj.updateDynamic("disableDefaultUI")(disableDefaultUI.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDoubleClickZoom)) __obj.updateDynamic("disableDoubleClickZoom")(disableDoubleClickZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (draggableCursor != null) __obj.updateDynamic("draggableCursor")(draggableCursor.asInstanceOf[js.Any])
    if (draggingCursor != null) __obj.updateDynamic("draggingCursor")(draggingCursor.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreenControl)) __obj.updateDynamic("fullscreenControl")(fullscreenControl.asInstanceOf[js.Any])
    if (fullscreenControlOptions != null) __obj.updateDynamic("fullscreenControlOptions")(fullscreenControlOptions.asInstanceOf[js.Any])
    if (gestureHandling != null) __obj.updateDynamic("gestureHandling")(gestureHandling.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardShortcuts)) __obj.updateDynamic("keyboardShortcuts")(keyboardShortcuts.asInstanceOf[js.Any])
    if (!js.isUndefined(mapTypeControl)) __obj.updateDynamic("mapTypeControl")(mapTypeControl.asInstanceOf[js.Any])
    if (mapTypeControlOptions != null) __obj.updateDynamic("mapTypeControlOptions")(mapTypeControlOptions.asInstanceOf[js.Any])
    if (mapTypeId != null) __obj.updateDynamic("mapTypeId")(mapTypeId.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoomOverride)) __obj.updateDynamic("minZoomOverride")(minZoomOverride.asInstanceOf[js.Any])
    if (!js.isUndefined(noClear)) __obj.updateDynamic("noClear")(noClear.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(js.Any.fromFunction1((t0: /* maps */ typingsJapgolly.googleMapReact.mod.Maps) => options(t0).runNow()))
    if (!js.isUndefined(panControl)) __obj.updateDynamic("panControl")(panControl.asInstanceOf[js.Any])
    if (panControlOptions != null) __obj.updateDynamic("panControlOptions")(panControlOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateControl)) __obj.updateDynamic("rotateControl")(rotateControl.asInstanceOf[js.Any])
    if (rotateControlOptions != null) __obj.updateDynamic("rotateControlOptions")(rotateControlOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleControl)) __obj.updateDynamic("scaleControl")(scaleControl.asInstanceOf[js.Any])
    if (scaleControlOptions != null) __obj.updateDynamic("scaleControlOptions")(scaleControlOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollwheel)) __obj.updateDynamic("scrollwheel")(scrollwheel.asInstanceOf[js.Any])
    if (streetView != null) __obj.updateDynamic("streetView")(streetView.asInstanceOf[js.Any])
    if (!js.isUndefined(streetViewControl)) __obj.updateDynamic("streetViewControl")(streetViewControl.asInstanceOf[js.Any])
    if (streetViewControlOptions != null) __obj.updateDynamic("streetViewControlOptions")(streetViewControlOptions.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tilt != null) __obj.updateDynamic("tilt")(tilt.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomControl)) __obj.updateDynamic("zoomControl")(zoomControl.asInstanceOf[js.Any])
    if (zoomControlOptions != null) __obj.updateDynamic("zoomControlOptions")(zoomControlOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

