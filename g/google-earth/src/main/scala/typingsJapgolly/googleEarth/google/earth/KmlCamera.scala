package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlCamera
  extends StObject
     with KmlAbstractView {
  
  /**
    * Distance from the earth's surface.
    */
  def getAltitude(): Double
  
  /**
    * Specifies how altitude components in the coordinates are interpreted.
    */
  def getAltitudeMode(): KmlAltitudeModeEnum
  
  /**
    * Direction (that is, North, South, East, West), in degrees. Default=0 (North). Values range from 0 to 360 degrees.
    */
  def getHeading(): Double
  
  /**
    * Latitude of the camera location. Degrees north or south of the Equator (0 degrees). Values range from -90 degrees to 90 degrees.
    */
  def getLatitude(): Double
  
  /**
    * Longitude of the camera location. Angular distance in degrees, relative to the Prime Meridian. Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  def getLongitude(): Double
  
  /**
    * Rotation, in degrees, of the camera around the Z axis. Values range from -180 to +180 degrees.
    */
  def getRoll(): Double
  
  /**
    * Angle between the direction of the camera position and the normal to the surface of the earth. Values range from 0 to 360 degrees.
    * A tilt value of 0 degrees indicates viewing from directly above, 90 degrees indicates viewing along the horizon, and 180 degrees indicates viewing straight up at the sky.
    */
  def getTilt(): Double
  
  /**
    * Sets the latitude, longitude, altitude, alitudeMode, heading, tilt, and roll values.
    */
  def set(
    latitude: Double,
    longitude: Double,
    altitude: Double,
    altitudeMode: KmlAltitudeModeEnum,
    heading: Double,
    tilt: Double,
    roll: Double
  ): Unit
  
  /**
    * Distance from the earth's surface.
    */
  def setAltitude(altitude: Double): Unit
  
  /**
    * Specifies how altitude components in the coordinates are interpreted.
    */
  def setAltitudeMode(altitudeMode: KmlAltitudeModeEnum): Unit
  
  /**
    * Direction (that is, North, South, East, West), in degrees. Default=0 (North). Values range from 0 to 360 degrees.
    */
  def setHeading(heading: Double): Unit
  
  /**
    * Latitude of the camera location. Degrees north or south of the Equator (0 degrees). Values range from -90 degrees to 90 degrees.
    */
  def setLatitude(latitude: Double): Unit
  
  /**
    * Longitude of the camera location. Angular distance in degrees, relative to the Prime Meridian. Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  def setLongitude(longitude: Double): Unit
  
  /**
    * Rotation, in degrees, of the camera around the Z axis. Values range from -180 to +180 degrees.
    */
  def setRoll(roll: Double): Unit
  
  /**
    * Angle between the direction of the camera position and the normal to the surface of the earth. Values range from 0 to 360 degrees.
    * A tilt value of 0 degrees indicates viewing from directly above, 90 degrees indicates viewing along the horizon, and 180 degrees indicates viewing straight up at the sky.
    */
  def setTilt(tilt: Double): Unit
}
object KmlCamera {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    copyAsCamera: CallbackTo[KmlCamera],
    copyAsLookAt: CallbackTo[KmlLookAt],
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getAltitude: CallbackTo[Double],
    getAltitudeMode: CallbackTo[KmlAltitudeModeEnum],
    getHeading: CallbackTo[Double],
    getId: CallbackTo[String],
    getLatitude: CallbackTo[Double],
    getLongitude: CallbackTo[Double],
    getOwnerDocument: CallbackTo[KmlDocument],
    getParentNode: CallbackTo[KmlObject],
    getRoll: CallbackTo[Double],
    getTilt: CallbackTo[Double],
    getTimePrimitive: CallbackTo[KmlTimePrimitive],
    getType: CallbackTo[String],
    getUrl: CallbackTo[String],
    getViewerOptions: CallbackTo[KmlViewerOptions],
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback,
    release: Callback,
    set: (Double, Double, Double, KmlAltitudeModeEnum, Double, Double, Double) => Callback,
    setAltitude: Double => Callback,
    setAltitudeMode: KmlAltitudeModeEnum => Callback,
    setHeading: Double => Callback,
    setLatitude: Double => Callback,
    setLongitude: Double => Callback,
    setRoll: Double => Callback,
    setTilt: Double => Callback,
    setTimePrimitive: KmlTimePrimitive => Callback,
    setViewerOptions: KmlViewerOptions => Callback
  ): KmlCamera = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), copyAsCamera = copyAsCamera.toJsFn, copyAsLookAt = copyAsLookAt.toJsFn, dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getAltitude = getAltitude.toJsFn, getAltitudeMode = getAltitudeMode.toJsFn, getHeading = getHeading.toJsFn, getId = getId.toJsFn, getLatitude = getLatitude.toJsFn, getLongitude = getLongitude.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getRoll = getRoll.toJsFn, getTilt = getTilt.toJsFn, getTimePrimitive = getTimePrimitive.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, getViewerOptions = getViewerOptions.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, set = js.Any.fromFunction7((t0: Double, t1: Double, t2: Double, t3: KmlAltitudeModeEnum, t4: Double, t5: Double, t6: Double) => (set(t0, t1, t2, t3, t4, t5, t6)).runNow()), setAltitude = js.Any.fromFunction1((t0: Double) => setAltitude(t0).runNow()), setAltitudeMode = js.Any.fromFunction1((t0: KmlAltitudeModeEnum) => setAltitudeMode(t0).runNow()), setHeading = js.Any.fromFunction1((t0: Double) => setHeading(t0).runNow()), setLatitude = js.Any.fromFunction1((t0: Double) => setLatitude(t0).runNow()), setLongitude = js.Any.fromFunction1((t0: Double) => setLongitude(t0).runNow()), setRoll = js.Any.fromFunction1((t0: Double) => setRoll(t0).runNow()), setTilt = js.Any.fromFunction1((t0: Double) => setTilt(t0).runNow()), setTimePrimitive = js.Any.fromFunction1((t0: KmlTimePrimitive) => setTimePrimitive(t0).runNow()), setViewerOptions = js.Any.fromFunction1((t0: KmlViewerOptions) => setViewerOptions(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlCamera]
  }
  
  extension [Self <: KmlCamera](x: Self) {
    
    inline def setGetAltitude(value: CallbackTo[Double]): Self = StObject.set(x, "getAltitude", value.toJsFn)
    
    inline def setGetAltitudeMode(value: CallbackTo[KmlAltitudeModeEnum]): Self = StObject.set(x, "getAltitudeMode", value.toJsFn)
    
    inline def setGetHeading(value: CallbackTo[Double]): Self = StObject.set(x, "getHeading", value.toJsFn)
    
    inline def setGetLatitude(value: CallbackTo[Double]): Self = StObject.set(x, "getLatitude", value.toJsFn)
    
    inline def setGetLongitude(value: CallbackTo[Double]): Self = StObject.set(x, "getLongitude", value.toJsFn)
    
    inline def setGetRoll(value: CallbackTo[Double]): Self = StObject.set(x, "getRoll", value.toJsFn)
    
    inline def setGetTilt(value: CallbackTo[Double]): Self = StObject.set(x, "getTilt", value.toJsFn)
    
    inline def setSet(value: (Double, Double, Double, KmlAltitudeModeEnum, Double, Double, Double) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction7((t0: Double, t1: Double, t2: Double, t3: KmlAltitudeModeEnum, t4: Double, t5: Double, t6: Double) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    
    inline def setSetAltitude(value: Double => Callback): Self = StObject.set(x, "setAltitude", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetAltitudeMode(value: KmlAltitudeModeEnum => Callback): Self = StObject.set(x, "setAltitudeMode", js.Any.fromFunction1((t0: KmlAltitudeModeEnum) => value(t0).runNow()))
    
    inline def setSetHeading(value: Double => Callback): Self = StObject.set(x, "setHeading", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetLatitude(value: Double => Callback): Self = StObject.set(x, "setLatitude", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetLongitude(value: Double => Callback): Self = StObject.set(x, "setLongitude", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetRoll(value: Double => Callback): Self = StObject.set(x, "setRoll", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetTilt(value: Double => Callback): Self = StObject.set(x, "setTilt", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
