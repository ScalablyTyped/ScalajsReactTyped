package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content496` extends StObject {
  
  /** Response */
  var `200`: Content496
  
  /** Not Found or `deployment_branch_policy.custom_branch_policies` property for the environment is set to false */
  var `404`: Any
}
object `200Content496` {
  
  inline def apply(`200`: Content496, `404`: Any): `200Content496` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content496`]
  }
  
  extension [Self <: `200Content496`](x: Self) {
    
    inline def set200(value: Content496): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
