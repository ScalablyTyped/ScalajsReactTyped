package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonInreplytoid` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonInreplytoid
  
  var `404`: Content6
}
object `200ContentApplicationjsonInreplytoid` {
  
  inline def apply(`200`: ContentApplicationjsonInreplytoid, `404`: Content6): `200ContentApplicationjsonInreplytoid` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonInreplytoid`]
  }
  
  extension [Self <: `200ContentApplicationjsonInreplytoid`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonInreplytoid): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
