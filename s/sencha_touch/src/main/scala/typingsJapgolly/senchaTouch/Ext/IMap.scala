package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.util.IGeolocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMap
  extends StObject
     with IContainer {
  
  /** [Config Option] (Ext.util.Geolocation) */
  var geo: js.UndefOr[IGeolocation] = js.undefined
  
  /** [Method] Returns the value of geo
    * @returns Ext.util.Geolocation
    */
  var getGeo: js.UndefOr[js.Function0[IGeolocation]] = js.undefined
  
  /** [Method] Returns the value of map
    * @returns google.maps.Map
    */
  var getMap: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of mapListeners
    * @returns Object
    */
  var getMapListeners: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the state of the Map
    * @returns Object mapOptions
    */
  var getState: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of useCurrentLocation
    * @returns Boolean/Ext.util.Geolocation
    */
  var getUseCurrentLocation: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Config Option] (google.maps.Map) */
  var map: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var mapListeners: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var mapOptions: js.UndefOr[Any] = js.undefined
  
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
  var setMap: js.UndefOr[js.Function1[/* map */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Moves the map center to the designated coordinates hash of the form  latitude 37 381592 longitude  122 135672
    * @param coordinates Object/google.maps.LatLng Object representing the desired Latitude and longitude upon which to center the map.
    */
  var setMapCenter: js.UndefOr[js.Function1[/* coordinates */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of mapListeners
    * @param mapListeners Object The new value.
    */
  var setMapListeners: js.UndefOr[js.Function1[/* mapListeners */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of mapOptions
    * @param mapOptions Object The new value.
    */
  var setMapOptions: js.UndefOr[js.Function1[/* mapOptions */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of useCurrentLocation
    * @param useCurrentLocation Boolean/Ext.util.Geolocation The new value.
    */
  var setUseCurrentLocation: js.UndefOr[js.Function1[/* useCurrentLocation */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Moves the map center to the designated coordinates hash of the form  latitude 37 381592 longitude  122 135672
    * @param coordinates Object/google.maps.LatLng Object representing the desired Latitude and longitude upon which to center the map.
    */
  @JSName("update")
  var update_IMap: js.UndefOr[js.Function1[/* coordinates */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Boolean/Ext.util.Geolocation) */
  var useCurrentLocation: js.UndefOr[Any] = js.undefined
}
object IMap {
  
  inline def apply(): IMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMap]
  }
  
  extension [Self <: IMap](x: Self) {
    
    inline def setGeo(value: IGeolocation): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
    
    inline def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
    
    inline def setGetGeo(value: CallbackTo[IGeolocation]): Self = StObject.set(x, "getGeo", value.toJsFn)
    
    inline def setGetGeoUndefined: Self = StObject.set(x, "getGeo", js.undefined)
    
    inline def setGetMap(value: CallbackTo[Any]): Self = StObject.set(x, "getMap", value.toJsFn)
    
    inline def setGetMapListeners(value: CallbackTo[Any]): Self = StObject.set(x, "getMapListeners", value.toJsFn)
    
    inline def setGetMapListenersUndefined: Self = StObject.set(x, "getMapListeners", js.undefined)
    
    inline def setGetMapUndefined: Self = StObject.set(x, "getMap", js.undefined)
    
    inline def setGetState(value: CallbackTo[Any]): Self = StObject.set(x, "getState", value.toJsFn)
    
    inline def setGetStateUndefined: Self = StObject.set(x, "getState", js.undefined)
    
    inline def setGetUseCurrentLocation(value: CallbackTo[Any]): Self = StObject.set(x, "getUseCurrentLocation", value.toJsFn)
    
    inline def setGetUseCurrentLocationUndefined: Self = StObject.set(x, "getUseCurrentLocation", js.undefined)
    
    inline def setMap(value: Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapListeners(value: Any): Self = StObject.set(x, "mapListeners", value.asInstanceOf[js.Any])
    
    inline def setMapListenersUndefined: Self = StObject.set(x, "mapListeners", js.undefined)
    
    inline def setMapOptions(value: Any): Self = StObject.set(x, "mapOptions", value.asInstanceOf[js.Any])
    
    inline def setMapOptionsUndefined: Self = StObject.set(x, "mapOptions", js.undefined)
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setMaskMap(value: Boolean): Self = StObject.set(x, "maskMap", value.asInstanceOf[js.Any])
    
    inline def setMaskMapCls(value: java.lang.String): Self = StObject.set(x, "maskMapCls", value.asInstanceOf[js.Any])
    
    inline def setMaskMapClsUndefined: Self = StObject.set(x, "maskMapCls", js.undefined)
    
    inline def setMaskMapUndefined: Self = StObject.set(x, "maskMap", js.undefined)
    
    inline def setSetGeo(value: /* geo */ js.UndefOr[IGeolocation] => Callback): Self = StObject.set(x, "setGeo", js.Any.fromFunction1((t0: /* geo */ js.UndefOr[IGeolocation]) => value(t0).runNow()))
    
    inline def setSetGeoUndefined: Self = StObject.set(x, "setGeo", js.undefined)
    
    inline def setSetMap(value: /* map */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setMap", js.Any.fromFunction1((t0: /* map */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetMapCenter(value: /* coordinates */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setMapCenter", js.Any.fromFunction1((t0: /* coordinates */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetMapCenterUndefined: Self = StObject.set(x, "setMapCenter", js.undefined)
    
    inline def setSetMapListeners(value: /* mapListeners */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setMapListeners", js.Any.fromFunction1((t0: /* mapListeners */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetMapListenersUndefined: Self = StObject.set(x, "setMapListeners", js.undefined)
    
    inline def setSetMapOptions(value: /* mapOptions */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setMapOptions", js.Any.fromFunction1((t0: /* mapOptions */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetMapOptionsUndefined: Self = StObject.set(x, "setMapOptions", js.undefined)
    
    inline def setSetMapUndefined: Self = StObject.set(x, "setMap", js.undefined)
    
    inline def setSetUseCurrentLocation(value: /* useCurrentLocation */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setUseCurrentLocation", js.Any.fromFunction1((t0: /* useCurrentLocation */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetUseCurrentLocationUndefined: Self = StObject.set(x, "setUseCurrentLocation", js.undefined)
    
    inline def setUpdate(value: /* coordinates */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: /* coordinates */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setUseCurrentLocation(value: Any): Self = StObject.set(x, "useCurrentLocation", value.asInstanceOf[js.Any])
    
    inline def setUseCurrentLocationUndefined: Self = StObject.set(x, "useCurrentLocation", js.undefined)
  }
}
