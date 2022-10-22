package typingsJapgolly.naverWhale.whale.contentSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDetails extends StObject {
  
  /** The pattern for the primary URL. For details on the format of a pattern, see Content Setting Patterns. */
  var primaryPattern: String
  
  /** Optional. The resource identifier for the content type.  */
  var resourceIdentifier: js.UndefOr[typingsJapgolly.chrome.chrome.contentSettings.ResourceIdentifier] = js.undefined
  
  /** Optional. Where to set the setting (default: regular).  */
  var scope: js.UndefOr[typingsJapgolly.chrome.chrome.contentSettings.ScopeEnum] = js.undefined
  
  /** Optional. The pattern for the secondary URL. Defaults to matching all URLs. For details on the format of a pattern, see Content Setting Patterns.  */
  var secondaryPattern: js.UndefOr[String] = js.undefined
  
  /** The setting applied by this rule. See the description of the individual ContentSetting objects for the possible values. */
  var setting: typingsJapgolly.chrome.chrome.contentSettings.DefaultContentSettingDetails
}
object SetDetails {
  
  inline def apply(
    primaryPattern: String,
    setting: typingsJapgolly.chrome.chrome.contentSettings.DefaultContentSettingDetails
  ): SetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDetails]
  }
  
  extension [Self <: SetDetails](x: Self) {
    
    inline def setPrimaryPattern(value: String): Self = StObject.set(x, "primaryPattern", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifier(value: typingsJapgolly.chrome.chrome.contentSettings.ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifierUndefined: Self = StObject.set(x, "resourceIdentifier", js.undefined)
    
    inline def setScope(value: typingsJapgolly.chrome.chrome.contentSettings.ScopeEnum): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSecondaryPattern(value: String): Self = StObject.set(x, "secondaryPattern", value.asInstanceOf[js.Any])
    
    inline def setSecondaryPatternUndefined: Self = StObject.set(x, "secondaryPattern", js.undefined)
    
    inline def setSetting(value: typingsJapgolly.chrome.chrome.contentSettings.DefaultContentSettingDetails): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
