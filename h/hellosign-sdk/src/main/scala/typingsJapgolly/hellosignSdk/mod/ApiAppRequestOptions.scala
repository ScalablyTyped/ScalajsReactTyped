package typingsJapgolly.hellosignSdk.mod

import typingsJapgolly.hellosignSdk.anon.Scopes
import typingsJapgolly.hellosignSdk.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiAppRequestOptions extends StObject {
  
  var callback_url: js.UndefOr[String] = js.undefined
  
  var custom_logo_file: js.UndefOr[Any] = js.undefined
  
  var domain: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var oauth: js.UndefOr[Scopes] = js.undefined
  
  var options: js.UndefOr[`0`] = js.undefined
  
  var white_labeling_options: js.UndefOr[js.Array[Any]] = js.undefined
}
object ApiAppRequestOptions {
  
  inline def apply(): ApiAppRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiAppRequestOptions]
  }
  
  extension [Self <: ApiAppRequestOptions](x: Self) {
    
    inline def setCallback_url(value: String): Self = StObject.set(x, "callback_url", value.asInstanceOf[js.Any])
    
    inline def setCallback_urlUndefined: Self = StObject.set(x, "callback_url", js.undefined)
    
    inline def setCustom_logo_file(value: Any): Self = StObject.set(x, "custom_logo_file", value.asInstanceOf[js.Any])
    
    inline def setCustom_logo_fileUndefined: Self = StObject.set(x, "custom_logo_file", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOauth(value: Scopes): Self = StObject.set(x, "oauth", value.asInstanceOf[js.Any])
    
    inline def setOauthUndefined: Self = StObject.set(x, "oauth", js.undefined)
    
    inline def setOptions(value: `0`): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setWhite_labeling_options(value: js.Array[Any]): Self = StObject.set(x, "white_labeling_options", value.asInstanceOf[js.Any])
    
    inline def setWhite_labeling_optionsUndefined: Self = StObject.set(x, "white_labeling_options", js.undefined)
    
    inline def setWhite_labeling_optionsVarargs(value: Any*): Self = StObject.set(x, "white_labeling_options", js.Array(value*))
  }
}
