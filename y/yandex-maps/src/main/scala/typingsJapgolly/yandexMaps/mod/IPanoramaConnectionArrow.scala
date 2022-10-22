package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.yandexMaps.mod.data.Manager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanoramaConnectionArrow
  extends StObject
     with IPanoramaConnection {
  
  def getDirection(): js.Array[Double]
  
  def getPanorama(): IPanorama
  
  var properties: Manager
}
object IPanoramaConnectionArrow {
  
  inline def apply(
    getConnectedPanorama: CallbackTo[js.Promise[IPanorama]],
    getDirection: CallbackTo[js.Array[Double]],
    getPanorama: CallbackTo[IPanorama],
    properties: Manager
  ): IPanoramaConnectionArrow = {
    val __obj = js.Dynamic.literal(getConnectedPanorama = getConnectedPanorama.toJsFn, getDirection = getDirection.toJsFn, getPanorama = getPanorama.toJsFn, properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanoramaConnectionArrow]
  }
  
  extension [Self <: IPanoramaConnectionArrow](x: Self) {
    
    inline def setGetDirection(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getDirection", value.toJsFn)
    
    inline def setGetPanorama(value: CallbackTo[IPanorama]): Self = StObject.set(x, "getPanorama", value.toJsFn)
    
    inline def setProperties(value: Manager): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
