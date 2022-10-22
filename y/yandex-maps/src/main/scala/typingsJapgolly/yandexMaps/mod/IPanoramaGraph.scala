package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanoramaGraph extends StObject {
  
  def getEdges(): js.Array[IPanoramaGraphEdge]
  
  def getNodes(): js.Array[IPanoramaGraphEdge]
  
  def getPanorama(): IPanorama
}
object IPanoramaGraph {
  
  inline def apply(
    getEdges: CallbackTo[js.Array[IPanoramaGraphEdge]],
    getNodes: CallbackTo[js.Array[IPanoramaGraphEdge]],
    getPanorama: CallbackTo[IPanorama]
  ): IPanoramaGraph = {
    val __obj = js.Dynamic.literal(getEdges = getEdges.toJsFn, getNodes = getNodes.toJsFn, getPanorama = getPanorama.toJsFn)
    __obj.asInstanceOf[IPanoramaGraph]
  }
  
  extension [Self <: IPanoramaGraph](x: Self) {
    
    inline def setGetEdges(value: CallbackTo[js.Array[IPanoramaGraphEdge]]): Self = StObject.set(x, "getEdges", value.toJsFn)
    
    inline def setGetNodes(value: CallbackTo[js.Array[IPanoramaGraphEdge]]): Self = StObject.set(x, "getNodes", value.toJsFn)
    
    inline def setGetPanorama(value: CallbackTo[IPanorama]): Self = StObject.set(x, "getPanorama", value.toJsFn)
  }
}
