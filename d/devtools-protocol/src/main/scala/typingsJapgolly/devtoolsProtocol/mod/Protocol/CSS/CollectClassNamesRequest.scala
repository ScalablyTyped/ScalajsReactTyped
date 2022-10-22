package typingsJapgolly.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectClassNamesRequest extends StObject {
  
  var styleSheetId: StyleSheetId
}
object CollectClassNamesRequest {
  
  inline def apply(styleSheetId: StyleSheetId): CollectClassNamesRequest = {
    val __obj = js.Dynamic.literal(styleSheetId = styleSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectClassNamesRequest]
  }
  
  extension [Self <: CollectClassNamesRequest](x: Self) {
    
    inline def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
  }
}
