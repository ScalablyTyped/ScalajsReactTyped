package typingsJapgolly.wixUiCore

import typingsJapgolly.wixUiCore.anon.ExternalBaseUrl
import typingsJapgolly.wixUiCore.distEsSrcClientsAtlasTypesMod.ClientGeocodeRequest
import typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.AtlasMapsClient
import typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.InternalAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcClientsAtlasAtlasBasicClientMod {
  
  @JSImport("wix-ui-core/dist/es/src/clients/Atlas/AtlasBasicClient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/es/src/clients/Atlas/AtlasBasicClient", "ATLAS_WEB_BASE_URL")
  @js.native
  val ATLAS_WEB_BASE_URL: /* "/_api/wix-atlas-service-web" */ String = js.native
  
  @JSImport("wix-ui-core/dist/es/src/clients/Atlas/AtlasBasicClient", "AtlasBasicClient")
  @js.native
  open class AtlasBasicClient protected ()
    extends StObject
       with AtlasMapsClient {
    def this(hasLangLocaleInstanceExternalBaseUrl: ExternalBaseUrl) = this()
    
    /* private */ val _getPlace: Any = js.native
    
    /* private */ val _predict: Any = js.native
    
    def geocode(clientId: String, lang: String, request: ClientGeocodeRequest): js.Promise[js.Array[InternalAddress]] = js.native
  }
  
  inline def mockWixAtlasService(atlasMock: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mockWixAtlasService")(atlasMock.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
