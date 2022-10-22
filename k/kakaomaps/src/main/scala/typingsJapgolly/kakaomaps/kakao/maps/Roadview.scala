package typingsJapgolly.kakaomaps.kakao.maps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Roadview extends StObject {
  
  def getPanoId(): Double
  
  def getPosition(): LatLng
  
  def getViewpoint(): Viewpoint
  
  def getViewpointWithPanoId(): Viewpoint
  
  def relayout(): Unit
  
  def setPanoId(panoId: Double, position: LatLng): Unit
  
  def setViewpoint(viewpoint: Viewpoint): Unit
}
object Roadview {
  
  inline def apply(
    getPanoId: CallbackTo[Double],
    getPosition: CallbackTo[LatLng],
    getViewpoint: CallbackTo[Viewpoint],
    getViewpointWithPanoId: CallbackTo[Viewpoint],
    relayout: Callback,
    setPanoId: (Double, LatLng) => Callback,
    setViewpoint: Viewpoint => Callback
  ): Roadview = {
    val __obj = js.Dynamic.literal(getPanoId = getPanoId.toJsFn, getPosition = getPosition.toJsFn, getViewpoint = getViewpoint.toJsFn, getViewpointWithPanoId = getViewpointWithPanoId.toJsFn, relayout = relayout.toJsFn, setPanoId = js.Any.fromFunction2((t0: Double, t1: LatLng) => (setPanoId(t0, t1)).runNow()), setViewpoint = js.Any.fromFunction1((t0: Viewpoint) => setViewpoint(t0).runNow()))
    __obj.asInstanceOf[Roadview]
  }
  
  extension [Self <: Roadview](x: Self) {
    
    inline def setGetPanoId(value: CallbackTo[Double]): Self = StObject.set(x, "getPanoId", value.toJsFn)
    
    inline def setGetPosition(value: CallbackTo[LatLng]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setGetViewpoint(value: CallbackTo[Viewpoint]): Self = StObject.set(x, "getViewpoint", value.toJsFn)
    
    inline def setGetViewpointWithPanoId(value: CallbackTo[Viewpoint]): Self = StObject.set(x, "getViewpointWithPanoId", value.toJsFn)
    
    inline def setRelayout(value: Callback): Self = StObject.set(x, "relayout", value.toJsFn)
    
    inline def setSetPanoId(value: (Double, LatLng) => Callback): Self = StObject.set(x, "setPanoId", js.Any.fromFunction2((t0: Double, t1: LatLng) => (value(t0, t1)).runNow()))
    
    inline def setSetViewpoint(value: Viewpoint => Callback): Self = StObject.set(x, "setViewpoint", js.Any.fromFunction1((t0: Viewpoint) => value(t0).runNow()))
  }
}
