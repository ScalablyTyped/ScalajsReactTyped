package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlLatLonAltBox
  extends StObject
     with KmlLatLonBox {
  
  /**
    * Specifies how the altitude property is interpreted.
    *
    * See also:
    *
    * * GEPlugin.ALTITUDE_CLAMP_TO_GROUND
    * * GEPlugin.ALTITUDE_RELATIVE_TO_GROUND
    * * GEPlugin.ALTITUDE_ABSOLUTE
    * * GEPlugin.ALTITUDE_CLAMP_TO_SEA_FLOOR
    * * GEPlugin.ALTITUDE_RELATIVE_TO_SEA_FLOOR
    */
  def getAltitudeMode(): KmlAltitudeModeEnum
  
  /**
    * Maximim altitude, specified in meters above sea level.
    */
  def getMaxAltitude(): Double
  
  /**
    * Minimum altitude, specified in meters above sea level.
    */
  def getMinAltitude(): Double
  
  /**
    * Sets the north, south, east, west, rotation, minAltitude, maxAltitude, and altitudeMode of bounding box.
    */
  def setAltBox(
    north: Double,
    south: Double,
    east: Double,
    west: Double,
    rotation: Double,
    minAltitude: Double,
    maxAltitude: Double,
    altitudeMode: KmlAltitudeModeEnum
  ): Unit
  
  /**
    * Specifies how the altitude property is interpreted.
    *
    * See also:
    *
    * * GEPlugin.ALTITUDE_CLAMP_TO_GROUND
    * * GEPlugin.ALTITUDE_RELATIVE_TO_GROUND
    * * GEPlugin.ALTITUDE_ABSOLUTE
    * * GEPlugin.ALTITUDE_CLAMP_TO_SEA_FLOOR
    * * GEPlugin.ALTITUDE_RELATIVE_TO_SEA_FLOOR
    */
  def setAltitudeMode(altitudeMode: KmlAltitudeModeEnum): Double
  
  /**
    * Maximim altitude, specified in meters above sea level.
    */
  def setMaxAltitude(maxAltitude: Double): Unit
  
  /**
    * Minimum altitude, specified in meters above sea level.
    */
  def setMinAltitude(minAltitude: Double): Unit
}
object KmlLatLonAltBox {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getAltitudeMode: CallbackTo[KmlAltitudeModeEnum],
    getEast: CallbackTo[Double],
    getId: CallbackTo[String],
    getMaxAltitude: CallbackTo[Double],
    getMinAltitude: CallbackTo[Double],
    getNorth: CallbackTo[Double],
    getOwnerDocument: CallbackTo[KmlDocument],
    getParentNode: CallbackTo[KmlObject],
    getRotation: CallbackTo[Double],
    getSouth: CallbackTo[Double],
    getType: CallbackTo[String],
    getUrl: CallbackTo[String],
    getWest: CallbackTo[Double],
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback,
    release: Callback,
    setAltBox: (Double, Double, Double, Double, Double, Double, Double, KmlAltitudeModeEnum) => Callback,
    setAltitudeMode: KmlAltitudeModeEnum => Double,
    setBox: (Double, Double, Double, Double, Double) => Callback,
    setEast: Double => Callback,
    setMaxAltitude: Double => Callback,
    setMinAltitude: Double => Callback,
    setNorth: Double => Callback,
    setRotation: Double => Callback,
    setSouth: Double => Callback,
    setWest: Double => Callback
  ): KmlLatLonAltBox = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getAltitudeMode = getAltitudeMode.toJsFn, getEast = getEast.toJsFn, getId = getId.toJsFn, getMaxAltitude = getMaxAltitude.toJsFn, getMinAltitude = getMinAltitude.toJsFn, getNorth = getNorth.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getRotation = getRotation.toJsFn, getSouth = getSouth.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, getWest = getWest.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setAltBox = js.Any.fromFunction8((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: KmlAltitudeModeEnum) => (setAltBox(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()), setAltitudeMode = js.Any.fromFunction1(setAltitudeMode), setBox = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setBox(t0, t1, t2, t3, t4)).runNow()), setEast = js.Any.fromFunction1((t0: Double) => setEast(t0).runNow()), setMaxAltitude = js.Any.fromFunction1((t0: Double) => setMaxAltitude(t0).runNow()), setMinAltitude = js.Any.fromFunction1((t0: Double) => setMinAltitude(t0).runNow()), setNorth = js.Any.fromFunction1((t0: Double) => setNorth(t0).runNow()), setRotation = js.Any.fromFunction1((t0: Double) => setRotation(t0).runNow()), setSouth = js.Any.fromFunction1((t0: Double) => setSouth(t0).runNow()), setWest = js.Any.fromFunction1((t0: Double) => setWest(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlLatLonAltBox]
  }
  
  extension [Self <: KmlLatLonAltBox](x: Self) {
    
    inline def setGetAltitudeMode(value: CallbackTo[KmlAltitudeModeEnum]): Self = StObject.set(x, "getAltitudeMode", value.toJsFn)
    
    inline def setGetMaxAltitude(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxAltitude", value.toJsFn)
    
    inline def setGetMinAltitude(value: CallbackTo[Double]): Self = StObject.set(x, "getMinAltitude", value.toJsFn)
    
    inline def setSetAltBox(value: (Double, Double, Double, Double, Double, Double, Double, KmlAltitudeModeEnum) => Callback): Self = StObject.set(x, "setAltBox", js.Any.fromFunction8((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: KmlAltitudeModeEnum) => (value(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()))
    
    inline def setSetAltitudeMode(value: KmlAltitudeModeEnum => Double): Self = StObject.set(x, "setAltitudeMode", js.Any.fromFunction1(value))
    
    inline def setSetMaxAltitude(value: Double => Callback): Self = StObject.set(x, "setMaxAltitude", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMinAltitude(value: Double => Callback): Self = StObject.set(x, "setMinAltitude", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
