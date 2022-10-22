package typingsJapgolly.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sigmajs.anon.DictrenderType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVG extends StObject {
  
  var edges: DictrenderType
  
  var labels: StringDictionary[SVGObject[Node]]
  
  var nodes: StringDictionary[SVGObject[Node]]
}
object SVG {
  
  inline def apply(
    edges: DictrenderType,
    labels: StringDictionary[SVGObject[Node]],
    nodes: StringDictionary[SVGObject[Node]]
  ): SVG = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVG]
  }
  
  extension [Self <: SVG](x: Self) {
    
    inline def setEdges(value: DictrenderType): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: StringDictionary[SVGObject[Node]]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: StringDictionary[SVGObject[Node]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
  }
}
