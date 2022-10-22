package typingsJapgolly.cspHtmlWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha256
import typingsJapgolly.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha384
import typingsJapgolly.cspHtmlWebpackPlugin.cspHtmlWebpackPluginStrings.sha512
import typingsJapgolly.cspHtmlWebpackPlugin.mod.HtmlPluginData
import typingsJapgolly.cspHtmlWebpackPlugin.mod.Policy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined csp-html-webpack-plugin.csp-html-webpack-plugin.AdditionalOptions & {  policy :csp-html-webpack-plugin.csp-html-webpack-plugin.Policy | undefined} */
  trait AdditionalOptionspolicyPo extends StObject {
    
    /**
      * If false, or the function returns false, the empty CSP tag will be
      * stripped from the html output.
      *
      * * The `htmlPluginData` is passed into the function as its first
      *   param.
      * * If `enabled` is set the false, it will disable generating a CSP for
      *   all instances of HtmlWebpackPlugin in your webpack config.
      */
    var enabled: js.UndefOr[Boolean | (js.Function1[/* htmlPluginData */ HtmlPluginData, Boolean])] = js.undefined
    
    /**
      * A `<string, boolean>` entry for which policy rules are allowed to
      * include hashes.
      */
    var hashEnabled: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    /**
      * The hashing method. Your node version must also accept this hashing
      * method.
      */
    var hashingMethod: js.UndefOr[sha256 | sha384 | sha512] = js.undefined
    
    /**
      * A `<string, boolean>` entry for which policy rules are allowed to
      * include nonces.
      */
    var nonceEnabled: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var policy: js.UndefOr[Policy] = js.undefined
  }
  object AdditionalOptionspolicyPo {
    
    inline def apply(): AdditionalOptionspolicyPo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdditionalOptionspolicyPo]
    }
    
    extension [Self <: AdditionalOptionspolicyPo](x: Self) {
      
      inline def setEnabled(value: Boolean | (js.Function1[/* htmlPluginData */ HtmlPluginData, Boolean])): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledFunction1(value: /* htmlPluginData */ HtmlPluginData => Boolean): Self = StObject.set(x, "enabled", js.Any.fromFunction1(value))
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHashEnabled(value: StringDictionary[Boolean]): Self = StObject.set(x, "hashEnabled", value.asInstanceOf[js.Any])
      
      inline def setHashEnabledUndefined: Self = StObject.set(x, "hashEnabled", js.undefined)
      
      inline def setHashingMethod(value: sha256 | sha384 | sha512): Self = StObject.set(x, "hashingMethod", value.asInstanceOf[js.Any])
      
      inline def setHashingMethodUndefined: Self = StObject.set(x, "hashingMethod", js.undefined)
      
      inline def setNonceEnabled(value: StringDictionary[Boolean]): Self = StObject.set(x, "nonceEnabled", value.asInstanceOf[js.Any])
      
      inline def setNonceEnabledUndefined: Self = StObject.set(x, "nonceEnabled", js.undefined)
      
      inline def setPolicy(value: Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
}
