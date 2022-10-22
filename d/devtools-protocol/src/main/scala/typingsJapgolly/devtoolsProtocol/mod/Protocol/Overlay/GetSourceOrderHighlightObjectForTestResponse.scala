package typingsJapgolly.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSourceOrderHighlightObjectForTestResponse extends StObject {
  
  /**
    * Source order highlight data for the node id provided.
    */
  var highlight: Any
}
object GetSourceOrderHighlightObjectForTestResponse {
  
  inline def apply(highlight: Any): GetSourceOrderHighlightObjectForTestResponse = {
    val __obj = js.Dynamic.literal(highlight = highlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSourceOrderHighlightObjectForTestResponse]
  }
  
  extension [Self <: GetSourceOrderHighlightObjectForTestResponse](x: Self) {
    
    inline def setHighlight(value: Any): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
  }
}
