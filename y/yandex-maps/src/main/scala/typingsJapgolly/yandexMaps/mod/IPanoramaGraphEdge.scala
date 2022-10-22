package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanoramaGraphEdge extends StObject {
  
  def getEndNodes(): js.Array[IPanoramaGraphNode]
}
object IPanoramaGraphEdge {
  
  inline def apply(getEndNodes: CallbackTo[js.Array[IPanoramaGraphNode]]): IPanoramaGraphEdge = {
    val __obj = js.Dynamic.literal(getEndNodes = getEndNodes.toJsFn)
    __obj.asInstanceOf[IPanoramaGraphEdge]
  }
  
  extension [Self <: IPanoramaGraphEdge](x: Self) {
    
    inline def setGetEndNodes(value: CallbackTo[js.Array[IPanoramaGraphNode]]): Self = StObject.set(x, "getEndNodes", value.toJsFn)
  }
}
