package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content514 extends StObject {
  
  var content: `514`
  
  var headers: Location
}
object Content514 {
  
  inline def apply(content: `514`, headers: Location): Content514 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content514]
  }
  
  extension [Self <: Content514](x: Self) {
    
    inline def setContent(value: `514`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
