package typingsJapgolly.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Securesettingspassword extends StObject {
  
  var secure_settings_password: js.UndefOr[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Password] = js.undefined
}
object Securesettingspassword {
  
  inline def apply(): Securesettingspassword = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Securesettingspassword]
  }
  
  extension [Self <: Securesettingspassword](x: Self) {
    
    inline def setSecure_settings_password(value: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Password): Self = StObject.set(x, "secure_settings_password", value.asInstanceOf[js.Any])
    
    inline def setSecure_settings_passwordUndefined: Self = StObject.set(x, "secure_settings_password", js.undefined)
  }
}
