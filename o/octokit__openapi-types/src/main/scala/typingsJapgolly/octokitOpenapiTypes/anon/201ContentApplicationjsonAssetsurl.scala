package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonAssetsurl` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonAssetsurl
  
  /** Not Found if the discussion category name is invalid */
  var `404`: ContentApplicationjson
  
  var `422`: Content8
}
object `201ContentApplicationjsonAssetsurl` {
  
  inline def apply(`201`: ContentApplicationjsonAssetsurl, `404`: ContentApplicationjson, `422`: Content8): `201ContentApplicationjsonAssetsurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonAssetsurl`]
  }
  
  extension [Self <: `201ContentApplicationjsonAssetsurl`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonAssetsurl): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: ContentApplicationjson): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
