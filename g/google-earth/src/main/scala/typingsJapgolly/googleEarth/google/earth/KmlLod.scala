package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlLod
  extends StObject
     with KmlObject {
  
  /**
    * Distance over which the geometry fades, from fully transparent to fully opaque.
    * This ramp value, expressed in screen pixels, is applied at the maximum end of the LOD (visibility) limits.
    */
  def getMaxFadeExtent(): Double
  
  /**
    * Measurement in screen pixels that represents the maximum limit of the visibility range for a given Region.
    * A value of -1, the default, indicates "active to infinite size."
    */
  def getMaxLodPixels(): Double
  
  /**
    * Distance over which the geometry fades, from fully opaque to fully transparent.
    * This ramp value, expressed in screen pixels, is applied at the minimum end of the LOD (visibility) limits.
    */
  def getMinFadeExtent(): Double
  
  /**
    * Specifies measurement in screen pixels that represents the minimum limit of the visibility range for a given Region.
    * Google Earth calculates the size of the region when projected onto screen space.
    * Then it computes the square root of the region's area (if, for example, the Region is square and the viewpoint is directly above the Region, and the Region is not tilted, this measurement is equal to the width of the projected Region).
    * If this measurement falls within the limits defined by minLodPixels and maxLodPixels (and if the LatLonAltBox is in view), the region is active.
    * If this limit is not reached, the associated geometry is considered to be too far from the user's viewpoint to be drawn.
    */
  def getMinLodPixels(): Double
  
  /**
    * Sets the minLodPixels, maxLodPixels, minFadeExtent, and maxFadeExtent for the projected region on the screen.
    */
  def set(minLodPixels: Double, maxLodPixels: Double, minFadeExtent: Double, maxFadeExtent: Double): Unit
  
  /**
    * Distance over which the geometry fades, from fully transparent to fully opaque.
    * This ramp value, expressed in screen pixels, is applied at the maximum end of the LOD (visibility) limits.
    */
  def setMaxFadeExtent(maxFadeExtent: Double): Unit
  
  /**
    * Measurement in screen pixels that represents the maximum limit of the visibility range for a given Region.
    * A value of -1, the default, indicates "active to infinite size."
    */
  def setMaxLodPixels(maxLogPixels: Double): Unit
  
  /**
    * Distance over which the geometry fades, from fully opaque to fully transparent.
    * This ramp value, expressed in screen pixels, is applied at the minimum end of the LOD (visibility) limits.
    */
  def setMinFadeExtent(minFadeExtent: Double): Unit
  
  /**
    * Specifies measurement in screen pixels that represents the minimum limit of the visibility range for a given Region.
    * Google Earth calculates the size of the region when projected onto screen space.
    * Then it computes the square root of the region's area (if, for example, the Region is square and the viewpoint is directly above the Region, and the Region is not tilted, this measurement is equal to the width of the projected Region).
    * If this measurement falls within the limits defined by minLodPixels and maxLodPixels (and if the LatLonAltBox is in view), the region is active.
    * If this limit is not reached, the associated geometry is considered to be too far from the user's viewpoint to be drawn.
    */
  def setMinLodPixels(minLodPixels: Double): Unit
}
object KmlLod {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getId: CallbackTo[String],
    getMaxFadeExtent: CallbackTo[Double],
    getMaxLodPixels: CallbackTo[Double],
    getMinFadeExtent: CallbackTo[Double],
    getMinLodPixels: CallbackTo[Double],
    getOwnerDocument: CallbackTo[KmlDocument],
    getParentNode: CallbackTo[KmlObject],
    getType: CallbackTo[String],
    getUrl: CallbackTo[String],
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback,
    release: Callback,
    set: (Double, Double, Double, Double) => Callback,
    setMaxFadeExtent: Double => Callback,
    setMaxLodPixels: Double => Callback,
    setMinFadeExtent: Double => Callback,
    setMinLodPixels: Double => Callback
  ): KmlLod = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getId = getId.toJsFn, getMaxFadeExtent = getMaxFadeExtent.toJsFn, getMaxLodPixels = getMaxLodPixels.toJsFn, getMinFadeExtent = getMinFadeExtent.toJsFn, getMinLodPixels = getMinLodPixels.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, set = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (set(t0, t1, t2, t3)).runNow()), setMaxFadeExtent = js.Any.fromFunction1((t0: Double) => setMaxFadeExtent(t0).runNow()), setMaxLodPixels = js.Any.fromFunction1((t0: Double) => setMaxLodPixels(t0).runNow()), setMinFadeExtent = js.Any.fromFunction1((t0: Double) => setMinFadeExtent(t0).runNow()), setMinLodPixels = js.Any.fromFunction1((t0: Double) => setMinLodPixels(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlLod]
  }
  
  extension [Self <: KmlLod](x: Self) {
    
    inline def setGetMaxFadeExtent(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxFadeExtent", value.toJsFn)
    
    inline def setGetMaxLodPixels(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxLodPixels", value.toJsFn)
    
    inline def setGetMinFadeExtent(value: CallbackTo[Double]): Self = StObject.set(x, "getMinFadeExtent", value.toJsFn)
    
    inline def setGetMinLodPixels(value: CallbackTo[Double]): Self = StObject.set(x, "getMinLodPixels", value.toJsFn)
    
    inline def setSet(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setSetMaxFadeExtent(value: Double => Callback): Self = StObject.set(x, "setMaxFadeExtent", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMaxLodPixels(value: Double => Callback): Self = StObject.set(x, "setMaxLodPixels", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMinFadeExtent(value: Double => Callback): Self = StObject.set(x, "setMinFadeExtent", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMinLodPixels(value: Double => Callback): Self = StObject.set(x, "setMinLodPixels", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
