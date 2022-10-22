package typingsJapgolly.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStyleSheetTextResponse extends StObject {
  
  /**
    * The stylesheet text.
    */
  var text: String
}
object GetStyleSheetTextResponse {
  
  inline def apply(text: String): GetStyleSheetTextResponse = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStyleSheetTextResponse]
  }
  
  extension [Self <: GetStyleSheetTextResponse](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
