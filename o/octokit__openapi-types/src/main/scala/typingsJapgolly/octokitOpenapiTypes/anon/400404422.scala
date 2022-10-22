package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `400404422` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonPushprotectionbypassedby
  
  /** Bad request, resolution comment is invalid or the resolution was not changed. */
  var `400`: Any
  
  /** Repository is public, or secret scanning is disabled for the repository, or the resource is not found */
  var `404`: Any
  
  /** State does not match the resolution or resolution comment */
  var `422`: Any
  
  var `503`: ContentApplicationjsonCodeDocumentationurl
}
object `400404422` {
  
  inline def apply(
    `200`: ContentApplicationjsonPushprotectionbypassedby,
    `400`: Any,
    `404`: Any,
    `422`: Any,
    `503`: ContentApplicationjsonCodeDocumentationurl
  ): `400404422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`400404422`]
  }
  
  extension [Self <: `400404422`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonPushprotectionbypassedby): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(value: Any): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Any): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurl): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
