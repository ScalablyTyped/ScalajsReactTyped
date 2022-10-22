package typingsJapgolly.antvDataSet

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiHierarchyMod {
  
  trait HierarchyApi extends StObject {
    
    def getAllEdges(): js.Array[Any]
    
    def getAllLinks(): js.Array[Any]
    
    def getAllNodes(): js.Array[Any]
    
    var root: js.UndefOr[Any] = js.undefined
  }
  object HierarchyApi {
    
    inline def apply(
      getAllEdges: CallbackTo[js.Array[Any]],
      getAllLinks: CallbackTo[js.Array[Any]],
      getAllNodes: CallbackTo[js.Array[Any]]
    ): HierarchyApi = {
      val __obj = js.Dynamic.literal(getAllEdges = getAllEdges.toJsFn, getAllLinks = getAllLinks.toJsFn, getAllNodes = getAllNodes.toJsFn)
      __obj.asInstanceOf[HierarchyApi]
    }
    
    extension [Self <: HierarchyApi](x: Self) {
      
      inline def setGetAllEdges(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getAllEdges", value.toJsFn)
      
      inline def setGetAllLinks(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getAllLinks", value.toJsFn)
      
      inline def setGetAllNodes(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getAllNodes", value.toJsFn)
      
      inline def setRoot(value: Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
