package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlPolygon
  extends StObject
     with KmlExtrudableGeometry {
  
  /**
    * Contains a LinearRing element.
    * You can specify multiple innerBoundary properties, which create multiple cut-outs inside the Polygon.
    */
  def getInnerBoundaries(): GELinearRingContainer
  
  /**
    * Contains a LinearRing element.
    */
  def getOuterBoundary(): KmlLinearRing
  
  /**
    * Contains a LinearRing element.
    */
  def setOuterBoundary(outerBoundary: KmlLinearRing): Unit
}
object KmlPolygon {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getAltitudeMode: CallbackTo[KmlAltitudeModeEnum],
    getExtrude: CallbackTo[Boolean],
    getId: CallbackTo[String],
    getInnerBoundaries: CallbackTo[GELinearRingContainer],
    getOuterBoundary: CallbackTo[KmlLinearRing],
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
    setExtrude: Boolean => Callback,
    setOuterBoundary: KmlLinearRing => Callback,
    setTessellate: Boolean => Callback
  ): KmlPolygon = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getAltitudeMode = getAltitudeMode.toJsFn, getExtrude = getExtrude.toJsFn, getId = getId.toJsFn, getInnerBoundaries = getInnerBoundaries.toJsFn, getOuterBoundary = getOuterBoundary.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getTessellate = getTessellate.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setAltitudeMode = js.Any.fromFunction1((t0: KmlAltitudeModeEnum) => setAltitudeMode(t0).runNow()), setExtrude = js.Any.fromFunction1((t0: Boolean) => setExtrude(t0).runNow()), setOuterBoundary = js.Any.fromFunction1((t0: KmlLinearRing) => setOuterBoundary(t0).runNow()), setTessellate = js.Any.fromFunction1((t0: Boolean) => setTessellate(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlPolygon]
  }
  
  extension [Self <: KmlPolygon](x: Self) {
    
    inline def setGetInnerBoundaries(value: CallbackTo[GELinearRingContainer]): Self = StObject.set(x, "getInnerBoundaries", value.toJsFn)
    
    inline def setGetOuterBoundary(value: CallbackTo[KmlLinearRing]): Self = StObject.set(x, "getOuterBoundary", value.toJsFn)
    
    inline def setSetOuterBoundary(value: KmlLinearRing => Callback): Self = StObject.set(x, "setOuterBoundary", js.Any.fromFunction1((t0: KmlLinearRing) => value(t0).runNow()))
  }
}
