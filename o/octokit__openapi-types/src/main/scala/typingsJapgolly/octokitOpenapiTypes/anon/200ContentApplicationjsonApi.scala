package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonApi` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonApi
  
  var `304`: Any
}
object `200ContentApplicationjsonApi` {
  
  inline def apply(`200`: ContentApplicationjsonApi, `304`: Any): `200ContentApplicationjsonApi` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonApi`]
  }
  
  extension [Self <: `200ContentApplicationjsonApi`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonApi): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
  }
}
