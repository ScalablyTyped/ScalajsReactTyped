package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content27404Content6422Content8` extends StObject {
  
  /** Response */
  var `200`: Content27
  
  var `404`: Content6
  
  var `422`: Content8
}
object `200Content27404Content6422Content8` {
  
  inline def apply(`200`: Content27, `404`: Content6, `422`: Content8): `200Content27404Content6422Content8` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content27404Content6422Content8`]
  }
  
  extension [Self <: `200Content27404Content6422Content8`](x: Self) {
    
    inline def set200(value: Content27): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
