package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlLatLonBox
  extends StObject
     with KmlObject {
  
  /**
    * Specifies the longitude of the east edge of the bounding box, in decimal degrees from -180 to 180.
    * (For overlays that overlap the meridian of 180 degrees longitude, values can extend beyond that range.)
    */
  def getEast(): Double
  
  /**
    * Specifies the latitude of the north edge of the bounding box, in decimal degrees from -90 to 90.
    */
  def getNorth(): Double
  
  /**
    * Specifies a rotation of the overlay about its center, in degrees.
    * Values can be +/-180. The default is 0 (north).
    * Rotations are specified in a counterclockwise direction.
    */
  def getRotation(): Double
  
  /**
    * Specifies the latitude of the south edge of the bounding box, in decimal degrees from -90 to 90.
    */
  def getSouth(): Double
  
  /**
    * Specifies the longitude of the west edge of the bounding box, in decimal degrees from -180 to 180.
    * (For overlays that overlap the meridian of 180 degrees longitude, values can extend beyond that range.)
    */
  def getWest(): Double
  
  /**
    * Sets the north, south, east, and west edges of the bounding box, as well as the rotation of the overlay.
    */
  def setBox(north: Double, south: Double, east: Double, west: Double, rotation: Double): Unit
  
  /**
    * Specifies the longitude of the east edge of the bounding box, in decimal degrees from -180 to 180.
    * (For overlays that overlap the meridian of 180 degrees longitude, values can extend beyond that range.)
    */
  def setEast(east: Double): Unit
  
  /**
    * Specifies the latitude of the north edge of the bounding box, in decimal degrees from -90 to 90.
    */
  def setNorth(north: Double): Unit
  
  /**
    * Specifies a rotation of the overlay about its center, in degrees.
    * Values can be +/-180. The default is 0 (north).
    * Rotations are specified in a counterclockwise direction.
    */
  def setRotation(rotation: Double): Unit
  
  /**
    * Specifies the latitude of the south edge of the bounding box, in decimal degrees from -90 to 90.
    */
  def setSouth(south: Double): Unit
  
  /**
    * Specifies the longitude of the west edge of the bounding box, in decimal degrees from -180 to 180.
    * (For overlays that overlap the meridian of 180 degrees longitude, values can extend beyond that range.)
    */
  def setWest(west: Double): Unit
}
object KmlLatLonBox {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getEast: CallbackTo[Double],
    getId: CallbackTo[String],
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
    setBox: (Double, Double, Double, Double, Double) => Callback,
    setEast: Double => Callback,
    setNorth: Double => Callback,
    setRotation: Double => Callback,
    setSouth: Double => Callback,
    setWest: Double => Callback
  ): KmlLatLonBox = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getEast = getEast.toJsFn, getId = getId.toJsFn, getNorth = getNorth.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getRotation = getRotation.toJsFn, getSouth = getSouth.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, getWest = getWest.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setBox = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setBox(t0, t1, t2, t3, t4)).runNow()), setEast = js.Any.fromFunction1((t0: Double) => setEast(t0).runNow()), setNorth = js.Any.fromFunction1((t0: Double) => setNorth(t0).runNow()), setRotation = js.Any.fromFunction1((t0: Double) => setRotation(t0).runNow()), setSouth = js.Any.fromFunction1((t0: Double) => setSouth(t0).runNow()), setWest = js.Any.fromFunction1((t0: Double) => setWest(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlLatLonBox]
  }
  
  extension [Self <: KmlLatLonBox](x: Self) {
    
    inline def setGetEast(value: CallbackTo[Double]): Self = StObject.set(x, "getEast", value.toJsFn)
    
    inline def setGetNorth(value: CallbackTo[Double]): Self = StObject.set(x, "getNorth", value.toJsFn)
    
    inline def setGetRotation(value: CallbackTo[Double]): Self = StObject.set(x, "getRotation", value.toJsFn)
    
    inline def setGetSouth(value: CallbackTo[Double]): Self = StObject.set(x, "getSouth", value.toJsFn)
    
    inline def setGetWest(value: CallbackTo[Double]): Self = StObject.set(x, "getWest", value.toJsFn)
    
    inline def setSetBox(value: (Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "setBox", js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setSetEast(value: Double => Callback): Self = StObject.set(x, "setEast", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetNorth(value: Double => Callback): Self = StObject.set(x, "setNorth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetRotation(value: Double => Callback): Self = StObject.set(x, "setRotation", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetSouth(value: Double => Callback): Self = StObject.set(x, "setSouth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetWest(value: Double => Callback): Self = StObject.set(x, "setWest", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
