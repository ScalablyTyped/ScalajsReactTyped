package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanoramaGraphNode extends StObject {
  
  def getConnectedPanorama(): js.Promise[IPanorama]
}
object IPanoramaGraphNode {
  
  inline def apply(getConnectedPanorama: CallbackTo[js.Promise[IPanorama]]): IPanoramaGraphNode = {
    val __obj = js.Dynamic.literal(getConnectedPanorama = getConnectedPanorama.toJsFn)
    __obj.asInstanceOf[IPanoramaGraphNode]
  }
  
  extension [Self <: IPanoramaGraphNode](x: Self) {
    
    inline def setGetConnectedPanorama(value: CallbackTo[js.Promise[IPanorama]]): Self = StObject.set(x, "getConnectedPanorama", value.toJsFn)
  }
}
