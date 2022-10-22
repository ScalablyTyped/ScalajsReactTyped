package typingsJapgolly.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canvas extends StObject {
  
  var edges: StringDictionary[
    js.Function4[/* edge */ Edge, /* source */ Node, /* target */ Node, /* repeated */ Any, Unit]
  ]
  
  var labels: StringDictionary[js.Function2[/* node */ Node, /* repeated */ Any, Unit]]
  
  var nodes: StringDictionary[js.Function2[/* node */ Node, /* repeated */ Any, Unit]]
}
object Canvas {
  
  inline def apply(
    edges: StringDictionary[
      js.Function4[/* edge */ Edge, /* source */ Node, /* target */ Node, /* repeated */ Any, Unit]
    ],
    labels: StringDictionary[js.Function2[/* node */ Node, /* repeated */ Any, Unit]],
    nodes: StringDictionary[js.Function2[/* node */ Node, /* repeated */ Any, Unit]]
  ): Canvas = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canvas]
  }
  
  extension [Self <: Canvas](x: Self) {
    
    inline def setEdges(
      value: StringDictionary[
          js.Function4[/* edge */ Edge, /* source */ Node, /* target */ Node, /* repeated */ Any, Unit]
        ]
    ): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: StringDictionary[js.Function2[/* node */ Node, /* repeated */ Any, Unit]]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: StringDictionary[js.Function2[/* node */ Node, /* repeated */ Any, Unit]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
  }
}
