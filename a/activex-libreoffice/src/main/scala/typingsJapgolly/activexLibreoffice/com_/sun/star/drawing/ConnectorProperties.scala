package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is a set of properties to describe the style for rendering connector. */
trait ConnectorProperties extends StObject {
  
  /** This property contains the kind of the connector. */
  var EdgeKind: ConnectorType
  
  /** This property contains the horizontal distance of node 1. */
  var EdgeNode1HorzDist: Double
  
  /** This property contains the vertical distance of node 1. */
  var EdgeNode1VertDist: Double
  
  /** This property contains the horizontal distance of node 2. */
  var EdgeNode2HorzDist: Double
  
  /** This property contains the vertical distance of node 2. */
  var EdgeNode2VertDist: Double
}
object ConnectorProperties {
  
  inline def apply(
    EdgeKind: ConnectorType,
    EdgeNode1HorzDist: Double,
    EdgeNode1VertDist: Double,
    EdgeNode2HorzDist: Double,
    EdgeNode2VertDist: Double
  ): ConnectorProperties = {
    val __obj = js.Dynamic.literal(EdgeKind = EdgeKind.asInstanceOf[js.Any], EdgeNode1HorzDist = EdgeNode1HorzDist.asInstanceOf[js.Any], EdgeNode1VertDist = EdgeNode1VertDist.asInstanceOf[js.Any], EdgeNode2HorzDist = EdgeNode2HorzDist.asInstanceOf[js.Any], EdgeNode2VertDist = EdgeNode2VertDist.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorProperties]
  }
  
  extension [Self <: ConnectorProperties](x: Self) {
    
    inline def setEdgeKind(value: ConnectorType): Self = StObject.set(x, "EdgeKind", value.asInstanceOf[js.Any])
    
    inline def setEdgeNode1HorzDist(value: Double): Self = StObject.set(x, "EdgeNode1HorzDist", value.asInstanceOf[js.Any])
    
    inline def setEdgeNode1VertDist(value: Double): Self = StObject.set(x, "EdgeNode1VertDist", value.asInstanceOf[js.Any])
    
    inline def setEdgeNode2HorzDist(value: Double): Self = StObject.set(x, "EdgeNode2HorzDist", value.asInstanceOf[js.Any])
    
    inline def setEdgeNode2VertDist(value: Double): Self = StObject.set(x, "EdgeNode2VertDist", value.asInstanceOf[js.Any])
  }
}
