package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content32` extends StObject {
  
  /** Response */
  var `200`: Content32
  
  var `401`: Content6
}
object `200Content32` {
  
  inline def apply(`200`: Content32, `401`: Content6): `200Content32` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content32`]
  }
  
  extension [Self <: `200Content32`](x: Self) {
    
    inline def set200(value: Content32): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content6): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
  }
}
