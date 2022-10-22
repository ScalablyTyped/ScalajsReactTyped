package typingsJapgolly.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFrameTreeResponse extends StObject {
  
  /**
    * Present frame tree structure.
    */
  var frameTree: FrameTree
}
object GetFrameTreeResponse {
  
  inline def apply(frameTree: FrameTree): GetFrameTreeResponse = {
    val __obj = js.Dynamic.literal(frameTree = frameTree.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFrameTreeResponse]
  }
  
  extension [Self <: GetFrameTreeResponse](x: Self) {
    
    inline def setFrameTree(value: FrameTree): Self = StObject.set(x, "frameTree", value.asInstanceOf[js.Any])
  }
}
