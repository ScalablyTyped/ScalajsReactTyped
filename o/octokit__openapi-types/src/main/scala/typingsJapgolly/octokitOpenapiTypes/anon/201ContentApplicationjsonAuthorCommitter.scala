package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonAuthorCommitter` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonAuthorCommitter
  
  var `404`: Content6
  
  var `422`: Content8
}
object `201ContentApplicationjsonAuthorCommitter` {
  
  inline def apply(`201`: ContentApplicationjsonAuthorCommitter, `404`: Content6, `422`: Content8): `201ContentApplicationjsonAuthorCommitter` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonAuthorCommitter`]
  }
  
  extension [Self <: `201ContentApplicationjsonAuthorCommitter`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonAuthorCommitter): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
