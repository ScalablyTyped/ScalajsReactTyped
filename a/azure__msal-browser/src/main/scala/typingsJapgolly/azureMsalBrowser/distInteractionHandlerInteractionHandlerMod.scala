package typingsJapgolly.azureMsalBrowser

import typingsJapgolly.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
import typingsJapgolly.azureMsalCommon.distAccountCcsCredentialMod.CcsCredential
import typingsJapgolly.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import typingsJapgolly.azureMsalCommon.distRequestCommonAuthorizationCodeRequestMod.CommonAuthorizationCodeRequest
import typingsJapgolly.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typingsJapgolly.azureMsalCommon.distResponseAuthorizationCodePayloadMod.AuthorizationCodePayload
import typingsJapgolly.azureMsalCommon.mod.Authority
import typingsJapgolly.azureMsalCommon.mod.AuthorizationCodeClient
import typingsJapgolly.azureMsalCommon.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInteractionHandlerInteractionHandlerMod {
  
  @JSImport("@azure/msal-browser/dist/interaction_handler/InteractionHandler", "InteractionHandler")
  @js.native
  open class InteractionHandler protected () extends StObject {
    def this(
      authCodeModule: AuthorizationCodeClient,
      storageImpl: BrowserCacheManager,
      authCodeRequest: CommonAuthorizationCodeRequest,
      logger: Logger
    ) = this()
    
    /* protected */ var authCodeRequest: CommonAuthorizationCodeRequest = js.native
    
    /* protected */ var authModule: AuthorizationCodeClient = js.native
    
    /* protected */ var browserStorage: BrowserCacheManager = js.native
    
    /**
      * Looks up ccs creds in the cache
      */
    /* protected */ def checkCcsCredentials(): CcsCredential | Null = js.native
    
    /**
      * Function to handle response parameters from hash.
      * @param locationHash
      */
    def handleCodeResponseFromHash(locationHash: String, state: String, authority: Authority, networkModule: INetworkModule): js.Promise[AuthenticationResult] = js.native
    
    /**
      * Process auth code response from AAD
      * @param authCodeResponse
      * @param state
      * @param authority
      * @param networkModule
      * @returns
      */
    def handleCodeResponseFromServer(
      authCodeResponse: AuthorizationCodePayload,
      state: String,
      authority: Authority,
      networkModule: INetworkModule
    ): js.Promise[AuthenticationResult] = js.native
    def handleCodeResponseFromServer(
      authCodeResponse: AuthorizationCodePayload,
      state: String,
      authority: Authority,
      networkModule: INetworkModule,
      validateNonce: Boolean
    ): js.Promise[AuthenticationResult] = js.native
    
    /* protected */ var logger: Logger = js.native
    
    /**
      * Updates authority based on cloudInstanceHostname
      * @param cloudInstanceHostname
      * @param authority
      * @param networkModule
      */
    /* protected */ def updateTokenEndpointAuthority(cloudInstanceHostname: String, authority: Authority, networkModule: INetworkModule): js.Promise[Unit] = js.native
  }
  
  type InteractionParams = js.Object
}
