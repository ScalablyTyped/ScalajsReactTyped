package typingsJapgolly.webextensionPolyfill.namespacesManifestMod.Manifest

import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.contextmenu
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.homepage
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.keyword
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.newtab
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.pref
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.purpose
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.searchbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestChromeSettingsOverridesSearchProviderParamsItemType extends StObject {
  
  /**
    * The type of param can be either "purpose" or "pref".
    * Optional.
    */
  var condition: js.UndefOr[purpose | pref] = js.undefined
  
  /**
    * A url parameter name
    */
  var name: String
  
  /**
    * The preference to retrieve the value from.
    * Optional.
    */
  var pref: js.UndefOr[String] = js.undefined
  
  /**
    * The context that initiates a search, required if condition is "purpose".
    * Optional.
    */
  var purpose: js.UndefOr[contextmenu | searchbar | homepage | keyword | newtab] = js.undefined
  
  /**
    * A url parameter value.
    * Optional.
    */
  var value: js.UndefOr[String] = js.undefined
}
object WebExtensionManifestChromeSettingsOverridesSearchProviderParamsItemType {
  
  inline def apply(name: String): WebExtensionManifestChromeSettingsOverridesSearchProviderParamsItemType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestChromeSettingsOverridesSearchProviderParamsItemType]
  }
  
  extension [Self <: WebExtensionManifestChromeSettingsOverridesSearchProviderParamsItemType](x: Self) {
    
    inline def setCondition(value: purpose | pref): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPref(value: String): Self = StObject.set(x, "pref", value.asInstanceOf[js.Any])
    
    inline def setPrefUndefined: Self = StObject.set(x, "pref", js.undefined)
    
    inline def setPurpose(value: contextmenu | searchbar | homepage | keyword | newtab): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
