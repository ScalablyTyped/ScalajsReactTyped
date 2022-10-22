package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GEGlobe
  extends StObject
     with KmlObject {
  
  /**
    * The top-level features currently in the Earth instance.
    */
  def getFeatures(): GEFeatureContainer
  
  /**
    * Returns the altitude for a given location on the globe.
    * If the altitude data for the location has not yet been loaded, the return value is 0.
    */
  def getGroundAltitude(lat: Double, lon: Double): Double
}
object GEGlobe {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getFeatures: CallbackTo[GEFeatureContainer],
    getGroundAltitude: (Double, Double) => Double,
    getId: CallbackTo[String],
    getOwnerDocument: CallbackTo[KmlDocument],
    getParentNode: CallbackTo[KmlObject],
    getType: CallbackTo[String],
    getUrl: CallbackTo[String],
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback,
    release: Callback
  ): GEGlobe = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getFeatures = getFeatures.toJsFn, getGroundAltitude = js.Any.fromFunction2(getGroundAltitude), getId = getId.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn)
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[GEGlobe]
  }
  
  extension [Self <: GEGlobe](x: Self) {
    
    inline def setGetFeatures(value: CallbackTo[GEFeatureContainer]): Self = StObject.set(x, "getFeatures", value.toJsFn)
    
    inline def setGetGroundAltitude(value: (Double, Double) => Double): Self = StObject.set(x, "getGroundAltitude", js.Any.fromFunction2(value))
  }
}
