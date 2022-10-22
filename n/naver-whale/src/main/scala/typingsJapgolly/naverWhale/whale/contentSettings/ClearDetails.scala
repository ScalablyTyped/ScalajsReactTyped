package typingsJapgolly.naverWhale.whale.contentSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearDetails extends StObject {
  
  /**
    * Optional.
    * Where to clear the setting (default: regular).
    * The scope of the ContentSetting. One of
    * * regular: setting for regular profile (which is inherited by the incognito profile if not overridden elsewhere),
    * * incognito_session_only: setting for incognito profile that can only be set during an incognito session and is deleted when the incognito session ends (overrides regular settings).
    */
  var scope: js.UndefOr[typingsJapgolly.chrome.chrome.contentSettings.ScopeEnum] = js.undefined
}
object ClearDetails {
  
  inline def apply(): ClearDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearDetails]
  }
  
  extension [Self <: ClearDetails](x: Self) {
    
    inline def setScope(value: typingsJapgolly.chrome.chrome.contentSettings.ScopeEnum): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
