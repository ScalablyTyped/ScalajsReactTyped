package typingsJapgolly.algoliasearch.anon

import typingsJapgolly.algoliasearch.algoliasearchStrings.de
import typingsJapgolly.algoliasearch.algoliasearchStrings.us
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined algoliasearch.algoliasearch/dist/algoliasearch.OptionalCredentials<@algolia/client-analytics.@algolia/client-analytics.AnalyticsClientOptions> */
trait OptionalCredentialsAnalyt extends StObject {
  
  var apiKey: js.UndefOr[String] = js.undefined
  
  var appId: js.UndefOr[String] = js.undefined
  
  var region: js.UndefOr[de | us] = js.undefined
}
object OptionalCredentialsAnalyt {
  
  inline def apply(): OptionalCredentialsAnalyt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalCredentialsAnalyt]
  }
  
  extension [Self <: OptionalCredentialsAnalyt](x: Self) {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setRegion(value: de | us): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
