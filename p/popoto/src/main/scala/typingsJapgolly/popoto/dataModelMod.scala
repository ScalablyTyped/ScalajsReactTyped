package typingsJapgolly.popoto

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataModelMod {
  
  trait DataModel extends StObject {
    
    def generateId(): Double
    
    def getRootNode(): Any
    
    var idGen: Double
    
    var links: js.Array[Any]
    
    var nodes: js.Array[Any]
  }
  object DataModel {
    
    inline def apply(
      generateId: CallbackTo[Double],
      getRootNode: CallbackTo[Any],
      idGen: Double,
      links: js.Array[Any],
      nodes: js.Array[Any]
    ): DataModel = {
      val __obj = js.Dynamic.literal(generateId = generateId.toJsFn, getRootNode = getRootNode.toJsFn, idGen = idGen.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataModel]
    }
    
    extension [Self <: DataModel](x: Self) {
      
      inline def setGenerateId(value: CallbackTo[Double]): Self = StObject.set(x, "generateId", value.toJsFn)
      
      inline def setGetRootNode(value: CallbackTo[Any]): Self = StObject.set(x, "getRootNode", value.toJsFn)
      
      inline def setIdGen(value: Double): Self = StObject.set(x, "idGen", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: js.Array[Any]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: Any*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setNodes(value: js.Array[Any]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: Any*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
}
