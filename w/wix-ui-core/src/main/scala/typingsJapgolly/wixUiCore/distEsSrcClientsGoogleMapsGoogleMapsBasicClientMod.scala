package typingsJapgolly.wixUiCore

import typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.Address
import typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.Geocode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcClientsGoogleMapsGoogleMapsBasicClientMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped wix-ui-core.wix-ui-core/dist/es/src/clients/GoogleMaps/types.GoogleMapsClient extends any ? std.Pick<wix-ui-core.wix-ui-core/dist/es/src/clients/GoogleMaps/types.GoogleMapsClient, std.Exclude<keyof wix-ui-core.wix-ui-core/dist/es/src/clients/GoogleMaps/types.GoogleMapsClient, 'placeDetails'>> : never */ @JSImport("wix-ui-core/dist/es/src/clients/GoogleMaps/GoogleMapsBasicClient", "GoogleMapsBasicClient")
  @js.native
  open class GoogleMapsBasicClient () extends StObject {
    
    /* private */ var _autocomplete: Any = js.native
    
    /* private */ var _geocoder: Any = js.native
    
    def _initServices(): Unit = js.native
    
    /* private */ var _loadScriptPromise: Any = js.native
    
    /* private */ var _useClientId: Any = js.native
    
    def autocomplete(clientId: String, lang: String, request: Any): js.Promise[js.Array[Address]] = js.native
    
    def geocode(clientId: String, lang: String, request: Any): js.Promise[js.Array[Geocode]] = js.native
    
    def loadScript(clientId: Any, lang: Any): Any = js.native
    
    var name: Any = js.native
    
    def useClientId(): Unit = js.native
  }
}
