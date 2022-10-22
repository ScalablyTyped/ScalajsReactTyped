package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.yandexMaps.mod.data.Manager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanoramaMarker extends StObject {
  
  def getIconSet(): js.Promise[IPanoramaMarkerIconSet]
  
  def getPanorama(): IPanorama
  
  def getPosition(): js.Array[Double]
  
  var properties: Manager
}
object IPanoramaMarker {
  
  inline def apply(
    getIconSet: CallbackTo[js.Promise[IPanoramaMarkerIconSet]],
    getPanorama: CallbackTo[IPanorama],
    getPosition: CallbackTo[js.Array[Double]],
    properties: Manager
  ): IPanoramaMarker = {
    val __obj = js.Dynamic.literal(getIconSet = getIconSet.toJsFn, getPanorama = getPanorama.toJsFn, getPosition = getPosition.toJsFn, properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanoramaMarker]
  }
  
  extension [Self <: IPanoramaMarker](x: Self) {
    
    inline def setGetIconSet(value: CallbackTo[js.Promise[IPanoramaMarkerIconSet]]): Self = StObject.set(x, "getIconSet", value.toJsFn)
    
    inline def setGetPanorama(value: CallbackTo[IPanorama]): Self = StObject.set(x, "getPanorama", value.toJsFn)
    
    inline def setGetPosition(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setProperties(value: Manager): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
