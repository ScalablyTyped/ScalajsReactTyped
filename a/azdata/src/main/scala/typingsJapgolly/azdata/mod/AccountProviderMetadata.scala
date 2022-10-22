package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountProviderMetadata extends StObject {
  
  /**
    * Any arguments that identify an instantiation of the provider
    */
  var args: js.UndefOr[Any] = js.undefined
  
  /**
    * Display name of the provider
    */
  var displayName: String
  
  /**
    * The identifier of the provider
    */
  var id: String
  
  /**
    * Optional settings that identify an instantiation of a provider
    */
  var settings: js.UndefOr[js.Object] = js.undefined
}
object AccountProviderMetadata {
  
  inline def apply(displayName: String, id: String): AccountProviderMetadata = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountProviderMetadata]
  }
  
  extension [Self <: AccountProviderMetadata](x: Self) {
    
    inline def setArgs(value: Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: js.Object): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
