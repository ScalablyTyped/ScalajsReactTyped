package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlLineString
  extends StObject
     with KmlExtrudableGeometry {
  
  /**
    * Returns the altitudeOffset, or 0 if not set.
    */
  def getAltitudeOffset(): Double
  
  /**
    * Two or more coordinate tuples, each consisting of floating point values for longitude, latitude, and altitude.
    * The altitude component is optional.
    */
  def getCoordinates(): KmlCoordArray
  
  /**
    * Added to the altitude values for all points on the line string.
    * Adjusts the altitude of the feature as a whole, without the need to update each coordinate set.
    */
  def setAltitudeOffset(altitudeOffset: Double): Unit
}
object KmlLineString {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getAltitudeMode: CallbackTo[KmlAltitudeModeEnum],
    getAltitudeOffset: CallbackTo[Double],
    getCoordinates: CallbackTo[KmlCoordArray],
    getExtrude: CallbackTo[Boolean],
    getId: CallbackTo[String],
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
    setAltitudeMode: KmlAltitudeModeEnum => Callback,
    setAltitudeOffset: Double => Callback,
    setExtrude: Boolean => Callback,
    setTessellate: Boolean => Callback
  ): KmlLineString = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getAltitudeMode = getAltitudeMode.toJsFn, getAltitudeOffset = getAltitudeOffset.toJsFn, getCoordinates = getCoordinates.toJsFn, getExtrude = getExtrude.toJsFn, getId = getId.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getTessellate = getTessellate.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setAltitudeMode = js.Any.fromFunction1((t0: KmlAltitudeModeEnum) => setAltitudeMode(t0).runNow()), setAltitudeOffset = js.Any.fromFunction1((t0: Double) => setAltitudeOffset(t0).runNow()), setExtrude = js.Any.fromFunction1((t0: Boolean) => setExtrude(t0).runNow()), setTessellate = js.Any.fromFunction1((t0: Boolean) => setTessellate(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlLineString]
  }
  
  extension [Self <: KmlLineString](x: Self) {
    
    inline def setGetAltitudeOffset(value: CallbackTo[Double]): Self = StObject.set(x, "getAltitudeOffset", value.toJsFn)
    
    inline def setGetCoordinates(value: CallbackTo[KmlCoordArray]): Self = StObject.set(x, "getCoordinates", value.toJsFn)
    
    inline def setSetAltitudeOffset(value: Double => Callback): Self = StObject.set(x, "setAltitudeOffset", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
