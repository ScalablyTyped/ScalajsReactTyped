package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlPoint
  extends StObject
     with KmlExtrudableGeometry {
  
  /**
    * The point's altitude, in meters.
    */
  def getAltitude(): Double
  
  /**
    * The point's latitude, in degrees.
    */
  def getLatitude(): Double
  
  /**
    * The point's longitude, in degrees.
    */
  def getLongitude(): Double
  
  /**
    * Sets altitudeMode, extrude, tessellate, latitude, longitude, and altitude values.
    */
  def set(
    latitude: Double,
    longitude: Double,
    altitude: Double,
    altitudeMode: KmlAltitudeModeEnum,
    extrude: Boolean,
    tessellate: Boolean
  ): Unit
  
  /**
    * The point's altitude, in meters.
    */
  def setAltitude(altitude: Double): Unit
  
  /**
    * Sets the latitude and longitude.
    */
  def setLatLng(latitude: Double, longitude: Double): Unit
  
  /**
    * Sets the latitude, longitude, and altitide.
    */
  def setLatLngAlt(latitude: Double, longitude: Double, altitude: Double): Unit
  
  /**
    * The point's latitude, in degrees.
    */
  def setLatitude(latitude: Double): Unit
  
  /**
    * The point's longitude, in degrees.
    */
  def setLongitude(longitude: Double): Unit
}
object KmlPoint {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getAltitude: CallbackTo[Double],
    getAltitudeMode: CallbackTo[KmlAltitudeModeEnum],
    getExtrude: CallbackTo[Boolean],
    getId: CallbackTo[String],
    getLatitude: CallbackTo[Double],
    getLongitude: CallbackTo[Double],
    getOwnerDocument: CallbackTo[KmlDocument],
    getParentNode: CallbackTo[KmlObject],
    getTessellate: CallbackTo[Boolean],
    getType: CallbackTo[String],
    getUrl: CallbackTo[String],
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback,
    release: Callback,
    set: (Double, Double, Double, KmlAltitudeModeEnum, Boolean, Boolean) => Callback,
    setAltitude: Double => Callback,
    setAltitudeMode: KmlAltitudeModeEnum => Callback,
    setExtrude: Boolean => Callback,
    setLatLng: (Double, Double) => Callback,
    setLatLngAlt: (Double, Double, Double) => Callback,
    setLatitude: Double => Callback,
    setLongitude: Double => Callback,
    setTessellate: Boolean => Callback
  ): KmlPoint = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getAltitude = getAltitude.toJsFn, getAltitudeMode = getAltitudeMode.toJsFn, getExtrude = getExtrude.toJsFn, getId = getId.toJsFn, getLatitude = getLatitude.toJsFn, getLongitude = getLongitude.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getTessellate = getTessellate.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, set = js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: KmlAltitudeModeEnum, t4: Boolean, t5: Boolean) => (set(t0, t1, t2, t3, t4, t5)).runNow()), setAltitude = js.Any.fromFunction1((t0: Double) => setAltitude(t0).runNow()), setAltitudeMode = js.Any.fromFunction1((t0: KmlAltitudeModeEnum) => setAltitudeMode(t0).runNow()), setExtrude = js.Any.fromFunction1((t0: Boolean) => setExtrude(t0).runNow()), setLatLng = js.Any.fromFunction2((t0: Double, t1: Double) => (setLatLng(t0, t1)).runNow()), setLatLngAlt = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (setLatLngAlt(t0, t1, t2)).runNow()), setLatitude = js.Any.fromFunction1((t0: Double) => setLatitude(t0).runNow()), setLongitude = js.Any.fromFunction1((t0: Double) => setLongitude(t0).runNow()), setTessellate = js.Any.fromFunction1((t0: Boolean) => setTessellate(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlPoint]
  }
  
  extension [Self <: KmlPoint](x: Self) {
    
    inline def setGetAltitude(value: CallbackTo[Double]): Self = StObject.set(x, "getAltitude", value.toJsFn)
    
    inline def setGetLatitude(value: CallbackTo[Double]): Self = StObject.set(x, "getLatitude", value.toJsFn)
    
    inline def setGetLongitude(value: CallbackTo[Double]): Self = StObject.set(x, "getLongitude", value.toJsFn)
    
    inline def setSet(value: (Double, Double, Double, KmlAltitudeModeEnum, Boolean, Boolean) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: KmlAltitudeModeEnum, t4: Boolean, t5: Boolean) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setSetAltitude(value: Double => Callback): Self = StObject.set(x, "setAltitude", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetLatLng(value: (Double, Double) => Callback): Self = StObject.set(x, "setLatLng", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetLatLngAlt(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "setLatLngAlt", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetLatitude(value: Double => Callback): Self = StObject.set(x, "setLatitude", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetLongitude(value: Double => Callback): Self = StObject.set(x, "setLongitude", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
