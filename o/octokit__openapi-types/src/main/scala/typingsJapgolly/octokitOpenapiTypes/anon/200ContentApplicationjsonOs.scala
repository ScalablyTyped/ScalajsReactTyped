package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonOs` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonOs
}
object `200ContentApplicationjsonOs` {
  
  inline def apply(`200`: ContentApplicationjsonOs): `200ContentApplicationjsonOs` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonOs`]
  }
  
  extension [Self <: `200ContentApplicationjsonOs`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonOs): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
