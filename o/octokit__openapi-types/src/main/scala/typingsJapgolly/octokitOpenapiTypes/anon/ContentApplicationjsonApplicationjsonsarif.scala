package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonApplicationjsonsarif extends StObject {
  
  var content: ApplicationjsonApplicationjsonsarif
}
object ContentApplicationjsonApplicationjsonsarif {
  
  inline def apply(content: ApplicationjsonApplicationjsonsarif): ContentApplicationjsonApplicationjsonsarif = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonApplicationjsonsarif]
  }
  
  extension [Self <: ContentApplicationjsonApplicationjsonsarif](x: Self) {
    
    inline def setContent(value: ApplicationjsonApplicationjsonsarif): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
