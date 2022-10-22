package typingsJapgolly.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Link extends StObject {
  
  var link: js.UndefOr[js.Object] = js.undefined
  
  var nodes: js.Array[js.Object]
}
object Link {
  
  inline def apply(nodes: js.Array[js.Object]): Link = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
  
  extension [Self <: Link](x: Self) {
    
    inline def setLink(value: js.Object): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setNodes(value: js.Array[js.Object]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: js.Object*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
