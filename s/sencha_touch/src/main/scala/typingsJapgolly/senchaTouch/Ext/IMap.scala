package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.util.IGeolocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMap extends IContainer {
  /** [Config Option] (Ext.util.Geolocation) */
  var geo: js.UndefOr[IGeolocation] = js.undefined
  /** [Method] Returns the value of geo
  		* @returns Ext.util.Geolocation
  		*/
  var getGeo: js.UndefOr[js.Function0[IGeolocation]] = js.undefined
  /** [Method] Returns the value of map
  		* @returns google.maps.Map
  		*/
  var getMap: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of mapListeners
  		* @returns Object
  		*/
  var getMapListeners: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the state of the Map
  		* @returns Object mapOptions
  		*/
  var getState: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of useCurrentLocation
  		* @returns Boolean/Ext.util.Geolocation
  		*/
  var getUseCurrentLocation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (google.maps.Map) */
  var map: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var mapListeners: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var mapOptions: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var maskMap: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var maskMapCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of geo
  		* @param geo Ext.util.Geolocation The new value.
  		*/
  var setGeo: js.UndefOr[js.Function1[/* geo */ js.UndefOr[IGeolocation], Unit]] = js.undefined
  /** [Method] Sets the value of map
  		* @param map google.maps.Map The new value.
  		*/
  var setMap: js.UndefOr[js.Function1[/* map */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Moves the map center to the designated coordinates hash of the form  latitude 37 381592 longitude  122 135672
  		* @param coordinates Object/google.maps.LatLng Object representing the desired Latitude and longitude upon which to center the map.
  		*/
  var setMapCenter: js.UndefOr[js.Function1[/* coordinates */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of mapListeners
  		* @param mapListeners Object The new value.
  		*/
  var setMapListeners: js.UndefOr[js.Function1[/* mapListeners */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of mapOptions
  		* @param mapOptions Object The new value.
  		*/
  var setMapOptions: js.UndefOr[js.Function1[/* mapOptions */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of useCurrentLocation
  		* @param useCurrentLocation Boolean/Ext.util.Geolocation The new value.
  		*/
  var setUseCurrentLocation: js.UndefOr[js.Function1[/* useCurrentLocation */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Moves the map center to the designated coordinates hash of the form  latitude 37 381592 longitude  122 135672
  		* @param coordinates Object/google.maps.LatLng Object representing the desired Latitude and longitude upon which to center the map.
  		*/
  @JSName("update")
  var update_IMap: js.UndefOr[js.Function1[/* coordinates */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Boolean/Ext.util.Geolocation) */
  var useCurrentLocation: js.UndefOr[js.Any] = js.undefined
}

object IMap {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    geo: IGeolocation = null,
    getGeo: js.UndefOr[CallbackTo[IGeolocation]] = js.undefined,
    getMap: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMapListeners: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getState: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getUseCurrentLocation: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    map: js.Any = null,
    mapListeners: js.Any = null,
    mapOptions: js.Any = null,
    maskMap: js.UndefOr[Boolean] = js.undefined,
    maskMapCls: java.lang.String = null,
    setGeo: /* geo */ js.UndefOr[IGeolocation] => Callback = null,
    setMap: /* map */ js.UndefOr[js.Any] => Callback = null,
    setMapCenter: /* coordinates */ js.UndefOr[js.Any] => Callback = null,
    setMapListeners: /* mapListeners */ js.UndefOr[js.Any] => Callback = null,
    setMapOptions: /* mapOptions */ js.UndefOr[js.Any] => Callback = null,
    setUseCurrentLocation: /* useCurrentLocation */ js.UndefOr[js.Any] => Callback = null,
    update: /* coordinates */ js.UndefOr[js.Any] => Callback = null,
    useCurrentLocation: js.Any = null
  ): IMap = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (geo != null) __obj.updateDynamic("geo")(geo.asInstanceOf[js.Any])
    getGeo.foreach(p => __obj.updateDynamic("getGeo")(p.toJsFn))
    getMap.foreach(p => __obj.updateDynamic("getMap")(p.toJsFn))
    getMapListeners.foreach(p => __obj.updateDynamic("getMapListeners")(p.toJsFn))
    getState.foreach(p => __obj.updateDynamic("getState")(p.toJsFn))
    getUseCurrentLocation.foreach(p => __obj.updateDynamic("getUseCurrentLocation")(p.toJsFn))
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (mapListeners != null) __obj.updateDynamic("mapListeners")(mapListeners.asInstanceOf[js.Any])
    if (mapOptions != null) __obj.updateDynamic("mapOptions")(mapOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(maskMap)) __obj.updateDynamic("maskMap")(maskMap.asInstanceOf[js.Any])
    if (maskMapCls != null) __obj.updateDynamic("maskMapCls")(maskMapCls.asInstanceOf[js.Any])
    if (setGeo != null) __obj.updateDynamic("setGeo")(js.Any.fromFunction1((t0: /* geo */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.util.IGeolocation]) => setGeo(t0).runNow()))
    if (setMap != null) __obj.updateDynamic("setMap")(js.Any.fromFunction1((t0: /* map */ js.UndefOr[js.Any]) => setMap(t0).runNow()))
    if (setMapCenter != null) __obj.updateDynamic("setMapCenter")(js.Any.fromFunction1((t0: /* coordinates */ js.UndefOr[js.Any]) => setMapCenter(t0).runNow()))
    if (setMapListeners != null) __obj.updateDynamic("setMapListeners")(js.Any.fromFunction1((t0: /* mapListeners */ js.UndefOr[js.Any]) => setMapListeners(t0).runNow()))
    if (setMapOptions != null) __obj.updateDynamic("setMapOptions")(js.Any.fromFunction1((t0: /* mapOptions */ js.UndefOr[js.Any]) => setMapOptions(t0).runNow()))
    if (setUseCurrentLocation != null) __obj.updateDynamic("setUseCurrentLocation")(js.Any.fromFunction1((t0: /* useCurrentLocation */ js.UndefOr[js.Any]) => setUseCurrentLocation(t0).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1((t0: /* coordinates */ js.UndefOr[js.Any]) => update(t0).runNow()))
    if (useCurrentLocation != null) __obj.updateDynamic("useCurrentLocation")(useCurrentLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMap]
  }
}

