package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonNames404Content6` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonNames
  
  var `404`: Content6
  
  var `422`: Content7
}
object `200ContentApplicationjsonNames404Content6` {
  
  inline def apply(`200`: ContentApplicationjsonNames, `404`: Content6, `422`: Content7): `200ContentApplicationjsonNames404Content6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonNames404Content6`]
  }
  
  extension [Self <: `200ContentApplicationjsonNames404Content6`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonNames): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content7): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
