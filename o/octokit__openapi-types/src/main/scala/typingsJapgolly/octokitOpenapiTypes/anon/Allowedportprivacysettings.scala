package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allowedportprivacysettings extends StObject {
  
  /** @description The privacy settings a user can select from when forwarding a port. */
  var allowed_port_privacy_settings: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object Allowedportprivacysettings {
  
  inline def apply(): Allowedportprivacysettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allowedportprivacysettings]
  }
  
  extension [Self <: Allowedportprivacysettings](x: Self) {
    
    inline def setAllowed_port_privacy_settings(value: js.Array[String]): Self = StObject.set(x, "allowed_port_privacy_settings", value.asInstanceOf[js.Any])
    
    inline def setAllowed_port_privacy_settingsNull: Self = StObject.set(x, "allowed_port_privacy_settings", null)
    
    inline def setAllowed_port_privacy_settingsUndefined: Self = StObject.set(x, "allowed_port_privacy_settings", js.undefined)
    
    inline def setAllowed_port_privacy_settingsVarargs(value: String*): Self = StObject.set(x, "allowed_port_privacy_settings", js.Array(value*))
  }
}
