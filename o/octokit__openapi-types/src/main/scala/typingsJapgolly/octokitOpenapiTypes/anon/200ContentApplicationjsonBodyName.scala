package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonBodyName` extends StObject {
  
  /** Name and body of generated release notes */
  var `200`: ContentApplicationjsonBodyName
  
  var `404`: Content6
}
object `200ContentApplicationjsonBodyName` {
  
  inline def apply(`200`: ContentApplicationjsonBodyName, `404`: Content6): `200ContentApplicationjsonBodyName` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonBodyName`]
  }
  
  extension [Self <: `200ContentApplicationjsonBodyName`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonBodyName): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
