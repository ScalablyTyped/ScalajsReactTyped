package typingsJapgolly.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockstrapModalDefaultsAttributes extends StObject {
  
  var role: String
}
object KnockstrapModalDefaultsAttributes {
  
  inline def apply(role: String): KnockstrapModalDefaultsAttributes = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapModalDefaultsAttributes]
  }
  
  extension [Self <: KnockstrapModalDefaultsAttributes](x: Self) {
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
