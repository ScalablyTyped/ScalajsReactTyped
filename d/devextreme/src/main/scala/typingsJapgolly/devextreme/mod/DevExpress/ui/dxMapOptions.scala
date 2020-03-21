package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonBing
import typingsJapgolly.devextreme.AnonColor
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonIconSrc
import typingsJapgolly.devextreme.AnonJQueryEventLocation
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonModelOptions
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.AnonOptions
import typingsJapgolly.devextreme.AnonOriginalMap
import typingsJapgolly.devextreme.AnonOriginalRoute
import typingsJapgolly.devextreme.devextremeStrings.bing
import typingsJapgolly.devextreme.devextremeStrings.google
import typingsJapgolly.devextreme.devextremeStrings.googleStatic
import typingsJapgolly.devextreme.devextremeStrings.hybrid
import typingsJapgolly.devextreme.devextremeStrings.roadmap
import typingsJapgolly.devextreme.devextremeStrings.satellite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxMapOptions extends WidgetOptions[dxMap] {
  /** Specifies whether the widget automatically adjusts center and zoom option values when adding a new marker or route, or if a new widget contains markers or routes by default. */
  var autoAdjust: js.UndefOr[Boolean] = js.undefined
  /** An object, a string, or an array specifying which part of the map is displayed at the widget's center using coordinates. The widget can change this value if autoAdjust is enabled. */
  var center: js.UndefOr[js.Any | String | js.Array[Double]] = js.undefined
  /** Specifies whether or not map widget controls are available. */
  var controls: js.UndefOr[Boolean] = js.undefined
  /** A key used to authenticate the application within the required map provider. */
  var key: js.UndefOr[String | AnonBing] = js.undefined
  /** A URL pointing to the custom icon to be used for map markers. */
  var markerIconSrc: js.UndefOr[String] = js.undefined
  /** An array of markers displayed on a map. */
  var markers: js.UndefOr[js.Array[AnonIconSrc]] = js.undefined
  /** A function that is executed when any location on the map is clicked or tapped. */
  var onClick: js.UndefOr[(js.Function1[/* e */ AnonJQueryEventLocation, _]) | String] = js.undefined
  /** A function that is executed when a marker is created on the map. */
  var onMarkerAdded: js.UndefOr[js.Function1[/* e */ AnonOptions, _]] = js.undefined
  /** A function that is executed when a marker is removed from the map. */
  var onMarkerRemoved: js.UndefOr[js.Function1[/* e */ AnonModelOptions, _]] = js.undefined
  /** A function that is executed when the map is ready. */
  var onReady: js.UndefOr[js.Function1[/* e */ AnonOriginalMap, _]] = js.undefined
  /** A function that is executed when a route is created on the map. */
  var onRouteAdded: js.UndefOr[js.Function1[/* e */ AnonOriginalRoute, _]] = js.undefined
  /** A function that is executed when a route is removed from the map. */
  var onRouteRemoved: js.UndefOr[js.Function1[/* e */ AnonModelOptions, _]] = js.undefined
  /** The name of the current map data provider. */
  var provider: js.UndefOr[bing | google | googleStatic] = js.undefined
  /** An array of routes shown on the map. */
  var routes: js.UndefOr[js.Array[AnonColor]] = js.undefined
  /** The type of a map to display. */
  var `type`: js.UndefOr[hybrid | roadmap | satellite] = js.undefined
  /** The map's zoom level. The widget can change this value if autoAdjust is enabled. */
  var zoom: js.UndefOr[Double] = js.undefined
}

object dxMapOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    autoAdjust: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    center: js.Any | String | js.Array[Double] = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    key: String | AnonBing = null,
    markerIconSrc: String = null,
    markers: js.Array[AnonIconSrc] = null,
    onClick: (js.Function1[/* e */ AnonJQueryEventLocation, _]) | String = null,
    onContentReady: /* e */ AnonComponentElement[dxMap] => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxMap] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxMap] => CallbackTo[js.Any] = null,
    onMarkerAdded: /* e */ AnonOptions => CallbackTo[js.Any] = null,
    onMarkerRemoved: /* e */ AnonModelOptions => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxMap] => CallbackTo[js.Any] = null,
    onReady: /* e */ AnonOriginalMap => CallbackTo[js.Any] = null,
    onRouteAdded: /* e */ AnonOriginalRoute => CallbackTo[js.Any] = null,
    onRouteRemoved: /* e */ AnonModelOptions => CallbackTo[js.Any] = null,
    provider: bing | google | googleStatic = null,
    routes: js.Array[AnonColor] = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    `type`: hybrid | roadmap | satellite = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null,
    zoom: Int | Double = null
  ): dxMapOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAdjust)) __obj.updateDynamic("autoAdjust")(autoAdjust.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (markerIconSrc != null) __obj.updateDynamic("markerIconSrc")(markerIconSrc.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxMap]) => onContentReady(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxMap]) => onDisposing(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxMap]) => onInitialized(t0).runNow()))
    if (onMarkerAdded != null) __obj.updateDynamic("onMarkerAdded")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonOptions) => onMarkerAdded(t0).runNow()))
    if (onMarkerRemoved != null) __obj.updateDynamic("onMarkerRemoved")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModelOptions) => onMarkerRemoved(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxMap]) => onOptionChanged(t0).runNow()))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonOriginalMap) => onReady(t0).runNow()))
    if (onRouteAdded != null) __obj.updateDynamic("onRouteAdded")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonOriginalRoute) => onRouteAdded(t0).runNow()))
    if (onRouteRemoved != null) __obj.updateDynamic("onRouteRemoved")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModelOptions) => onRouteRemoved(t0).runNow()))
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxMapOptions]
  }
}

