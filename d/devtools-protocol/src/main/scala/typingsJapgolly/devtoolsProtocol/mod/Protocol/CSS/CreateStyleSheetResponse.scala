package typingsJapgolly.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStyleSheetResponse extends StObject {
  
  /**
    * Identifier of the created "via-inspector" stylesheet.
    */
  var styleSheetId: StyleSheetId
}
object CreateStyleSheetResponse {
  
  inline def apply(styleSheetId: StyleSheetId): CreateStyleSheetResponse = {
    val __obj = js.Dynamic.literal(styleSheetId = styleSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStyleSheetResponse]
  }
  
  extension [Self <: CreateStyleSheetResponse](x: Self) {
    
    inline def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
  }
}
