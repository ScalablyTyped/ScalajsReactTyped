package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonIncompleteresultsBoolean` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonIncompleteresultsBoolean
  
  var `304`: Any
}
object `200ContentApplicationjsonIncompleteresultsBoolean` {
  
  inline def apply(`200`: ContentApplicationjsonIncompleteresultsBoolean, `304`: Any): `200ContentApplicationjsonIncompleteresultsBoolean` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonIncompleteresultsBoolean`]
  }
  
  extension [Self <: `200ContentApplicationjsonIncompleteresultsBoolean`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonIncompleteresultsBoolean): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
  }
}
