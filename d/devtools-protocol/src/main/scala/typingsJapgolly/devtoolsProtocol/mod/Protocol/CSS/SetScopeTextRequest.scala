package typingsJapgolly.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetScopeTextRequest extends StObject {
  
  var range: SourceRange
  
  var styleSheetId: StyleSheetId
  
  var text: String
}
object SetScopeTextRequest {
  
  inline def apply(range: SourceRange, styleSheetId: StyleSheetId, text: String): SetScopeTextRequest = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], styleSheetId = styleSheetId.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetScopeTextRequest]
  }
  
  extension [Self <: SetScopeTextRequest](x: Self) {
    
    inline def setRange(value: SourceRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
