package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonAuthorizationsurl
}
object `200` {
  
  inline def apply(`200`: ContentApplicationjsonAuthorizationsurl): `200` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200`]
  }
  
  extension [Self <: `200`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonAuthorizationsurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
