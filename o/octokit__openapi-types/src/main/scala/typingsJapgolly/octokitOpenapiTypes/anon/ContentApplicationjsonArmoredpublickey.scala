package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonArmoredpublickey extends StObject {
  
  var content: ApplicationjsonArmoredpublickey
}
object ContentApplicationjsonArmoredpublickey {
  
  inline def apply(content: ApplicationjsonArmoredpublickey): ContentApplicationjsonArmoredpublickey = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonArmoredpublickey]
  }
  
  extension [Self <: ContentApplicationjsonArmoredpublickey](x: Self) {
    
    inline def setContent(value: ApplicationjsonArmoredpublickey): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
