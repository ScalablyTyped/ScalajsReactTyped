package typingsJapgolly.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.degreeCentralityNormalized
  */
trait SearchDegreeCentralityNormalizedResultUndirected extends StObject {
  
  /** the normalised degree centrality of the specified node */
  def degree(node: NodeSingular): Any
}
object SearchDegreeCentralityNormalizedResultUndirected {
  
  inline def apply(degree: NodeSingular => Any): SearchDegreeCentralityNormalizedResultUndirected = {
    val __obj = js.Dynamic.literal(degree = js.Any.fromFunction1(degree))
    __obj.asInstanceOf[SearchDegreeCentralityNormalizedResultUndirected]
  }
  
  extension [Self <: SearchDegreeCentralityNormalizedResultUndirected](x: Self) {
    
    inline def setDegree(value: NodeSingular => Any): Self = StObject.set(x, "degree", js.Any.fromFunction1(value))
  }
}
