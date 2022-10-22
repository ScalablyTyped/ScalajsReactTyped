package typingsJapgolly.senchaTouch.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IEvented
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeolocation
  extends StObject
     with IEvented {
  
  /** [Property] (Number) */
  var accuracy: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean) */
  var allowHighAccuracy: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Number) */
  var altitude: js.UndefOr[Double] = js.undefined
  
  /** [Property] (Number) */
  var altitudeAccuracy: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean) */
  var autoUpdate: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var frequency: js.UndefOr[Double] = js.undefined
  
  /** [Method] Returns the value of allowHighAccuracy
    * @returns Boolean
    */
  var getAllowHighAccuracy: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of autoUpdate
    * @returns Boolean
    */
  var getAutoUpdate: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of frequency
    * @returns Number
    */
  var getFrequency: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of maximumAge
    * @returns Number
    */
  var getMaximumAge: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of timeout
    * @returns Number
    */
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Property] (Number) */
  var heading: js.UndefOr[Double] = js.undefined
  
  /** [Property] (Number) */
  var latitude: js.UndefOr[Double] = js.undefined
  
  /** [Property] (Number) */
  var longitude: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var maximumAge: js.UndefOr[Double] = js.undefined
  
  /** [Method] Sets the value of allowHighAccuracy
    * @param allowHighAccuracy Boolean The new value.
    */
  var setAllowHighAccuracy: js.UndefOr[js.Function1[/* allowHighAccuracy */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of autoUpdate
    * @param autoUpdate Boolean The new value.
    */
  var setAutoUpdate: js.UndefOr[js.Function1[/* autoUpdate */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of frequency
    * @param frequency Number The new value.
    */
  var setFrequency: js.UndefOr[js.Function1[/* frequency */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of maximumAge
    * @param maximumAge Number The new value.
    */
  var setMaximumAge: js.UndefOr[js.Function1[/* maximumAge */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of timeout
    * @param timeout Number The new value.
    */
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Property] (Number) */
  var speed: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** [Property] (Date) */
  var timestamp: js.UndefOr[Any] = js.undefined
  
  /** [Method] Executes a onetime location update operation raising either a locationupdate or locationerror event
    * @param callback Function A callback method to be called when the location retrieval has been completed. Will be called on both success and failure. The method will be passed one parameter, Ext.util.Geolocation (this reference), set to null on failure. geo.updateLocation(function (geo) {  alert('Latitude: ' + (geo !== null ? geo.latitude : 'failed')); });
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    */
  var updateLocation: js.UndefOr[js.Function2[/* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Unit]] = js.undefined
}
object IGeolocation {
  
  inline def apply(): IGeolocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeolocation]
  }
  
  extension [Self <: IGeolocation](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    inline def setAllowHighAccuracy(value: Boolean): Self = StObject.set(x, "allowHighAccuracy", value.asInstanceOf[js.Any])
    
    inline def setAllowHighAccuracyUndefined: Self = StObject.set(x, "allowHighAccuracy", js.undefined)
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeAccuracy(value: Double): Self = StObject.set(x, "altitudeAccuracy", value.asInstanceOf[js.Any])
    
    inline def setAltitudeAccuracyUndefined: Self = StObject.set(x, "altitudeAccuracy", js.undefined)
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setAutoUpdate(value: Boolean): Self = StObject.set(x, "autoUpdate", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateUndefined: Self = StObject.set(x, "autoUpdate", js.undefined)
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setGetAllowHighAccuracy(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAllowHighAccuracy", value.toJsFn)
    
    inline def setGetAllowHighAccuracyUndefined: Self = StObject.set(x, "getAllowHighAccuracy", js.undefined)
    
    inline def setGetAutoUpdate(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAutoUpdate", value.toJsFn)
    
    inline def setGetAutoUpdateUndefined: Self = StObject.set(x, "getAutoUpdate", js.undefined)
    
    inline def setGetFrequency(value: CallbackTo[Double]): Self = StObject.set(x, "getFrequency", value.toJsFn)
    
    inline def setGetFrequencyUndefined: Self = StObject.set(x, "getFrequency", js.undefined)
    
    inline def setGetMaximumAge(value: CallbackTo[Double]): Self = StObject.set(x, "getMaximumAge", value.toJsFn)
    
    inline def setGetMaximumAgeUndefined: Self = StObject.set(x, "getMaximumAge", js.undefined)
    
    inline def setGetTimeout(value: CallbackTo[Double]): Self = StObject.set(x, "getTimeout", value.toJsFn)
    
    inline def setGetTimeoutUndefined: Self = StObject.set(x, "getTimeout", js.undefined)
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    inline def setMaximumAge(value: Double): Self = StObject.set(x, "maximumAge", value.asInstanceOf[js.Any])
    
    inline def setMaximumAgeUndefined: Self = StObject.set(x, "maximumAge", js.undefined)
    
    inline def setSetAllowHighAccuracy(value: /* allowHighAccuracy */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setAllowHighAccuracy", js.Any.fromFunction1((t0: /* allowHighAccuracy */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetAllowHighAccuracyUndefined: Self = StObject.set(x, "setAllowHighAccuracy", js.undefined)
    
    inline def setSetAutoUpdate(value: /* autoUpdate */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setAutoUpdate", js.Any.fromFunction1((t0: /* autoUpdate */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetAutoUpdateUndefined: Self = StObject.set(x, "setAutoUpdate", js.undefined)
    
    inline def setSetFrequency(value: /* frequency */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setFrequency", js.Any.fromFunction1((t0: /* frequency */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetFrequencyUndefined: Self = StObject.set(x, "setFrequency", js.undefined)
    
    inline def setSetMaximumAge(value: /* maximumAge */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setMaximumAge", js.Any.fromFunction1((t0: /* maximumAge */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetMaximumAgeUndefined: Self = StObject.set(x, "setMaximumAge", js.undefined)
    
    inline def setSetTimeout(value: /* timeout */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1((t0: /* timeout */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetTimeoutUndefined: Self = StObject.set(x, "setTimeout", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTimestamp(value: Any): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setUpdateLocation(value: (/* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "updateLocation", js.Any.fromFunction2((t0: /* callback */ js.UndefOr[Any], t1: /* scope */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setUpdateLocationUndefined: Self = StObject.set(x, "updateLocation", js.undefined)
  }
}
