package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonInstallationsTotalcount extends StObject {
  
  var content: ApplicationjsonInstallationsTotalcount
}
object ContentApplicationjsonInstallationsTotalcount {
  
  inline def apply(content: ApplicationjsonInstallationsTotalcount): ContentApplicationjsonInstallationsTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonInstallationsTotalcount]
  }
  
  extension [Self <: ContentApplicationjsonInstallationsTotalcount](x: Self) {
    
    inline def setContent(value: ApplicationjsonInstallationsTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
