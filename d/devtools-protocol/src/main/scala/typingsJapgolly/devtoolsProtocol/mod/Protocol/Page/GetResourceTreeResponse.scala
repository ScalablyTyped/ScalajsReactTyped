package typingsJapgolly.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceTreeResponse extends StObject {
  
  /**
    * Present frame / resource tree structure.
    */
  var frameTree: FrameResourceTree
}
object GetResourceTreeResponse {
  
  inline def apply(frameTree: FrameResourceTree): GetResourceTreeResponse = {
    val __obj = js.Dynamic.literal(frameTree = frameTree.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceTreeResponse]
  }
  
  extension [Self <: GetResourceTreeResponse](x: Self) {
    
    inline def setFrameTree(value: FrameResourceTree): Self = StObject.set(x, "frameTree", value.asInstanceOf[js.Any])
  }
}
