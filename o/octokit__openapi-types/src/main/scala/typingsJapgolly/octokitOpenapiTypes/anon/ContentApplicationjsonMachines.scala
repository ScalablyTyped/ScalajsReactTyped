package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonMachines extends StObject {
  
  var content: ApplicationjsonMachines
}
object ContentApplicationjsonMachines {
  
  inline def apply(content: ApplicationjsonMachines): ContentApplicationjsonMachines = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonMachines]
  }
  
  extension [Self <: ContentApplicationjsonMachines](x: Self) {
    
    inline def setContent(value: ApplicationjsonMachines): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
