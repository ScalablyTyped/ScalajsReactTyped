package typingsJapgolly.next.anon

import typingsJapgolly.next.distServerAppRenderMod.FlightRouterState
import typingsJapgolly.next.distSharedLibAppRouterContextMod.ChildSegmentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tree extends StObject {
  
  var childNodes: typingsJapgolly.std.Map[String, ChildSegmentMap]
  
  var tree: FlightRouterState
  
  var url: String
}
object Tree {
  
  inline def apply(childNodes: typingsJapgolly.std.Map[String, ChildSegmentMap], tree: FlightRouterState, url: String): Tree = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tree]
  }
  
  extension [Self <: Tree](x: Self) {
    
    inline def setChildNodes(value: typingsJapgolly.std.Map[String, ChildSegmentMap]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    inline def setTree(value: FlightRouterState): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
