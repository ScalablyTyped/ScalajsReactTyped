package typingsJapgolly.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulesConfigData extends StObject {
  
  /**
    * Value for a rules config variable.
    */
  var value: String
}
object RulesConfigData {
  
  inline def apply(value: String): RulesConfigData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesConfigData]
  }
  
  extension [Self <: RulesConfigData](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
