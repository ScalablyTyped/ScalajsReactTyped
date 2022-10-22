package typingsJapgolly.azureMsalBrowser

import org.scalajs.dom.HTMLIFrameElement
import typingsJapgolly.azureMsalBrowser.distCacheBrowserCacheManagerMod.BrowserCacheManager
import typingsJapgolly.azureMsalBrowser.distInteractionHandlerInteractionHandlerMod.InteractionHandler
import typingsJapgolly.azureMsalCommon.distRequestCommonAuthorizationCodeRequestMod.CommonAuthorizationCodeRequest
import typingsJapgolly.azureMsalCommon.mod.AuthorizationCodeClient
import typingsJapgolly.azureMsalCommon.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInteractionHandlerSilentHandlerMod {
  
  @JSImport("@azure/msal-browser/dist/interaction_handler/SilentHandler", "SilentHandler")
  @js.native
  open class SilentHandler protected () extends InteractionHandler {
    def this(
      authCodeModule: AuthorizationCodeClient,
      storageImpl: BrowserCacheManager,
      authCodeRequest: CommonAuthorizationCodeRequest,
      logger: Logger,
      navigateFrameWait: Double
    ) = this()
    
    /**
      * @hidden
      * Creates a new hidden iframe or gets an existing one for silent token renewal.
      * @ignore
      */
    /* private */ var createHiddenIframe: Any = js.native
    
    /**
      * Creates a hidden iframe to given URL using user-requested scopes as an id.
      * @param urlNavigate
      * @param userRequestScopes
      */
    def initiateAuthRequest(requestUrl: String): js.Promise[HTMLIFrameElement] = js.native
    
    /**
      * @hidden
      * Loads iframe with authorization endpoint URL
      * @ignore
      */
    /* private */ var loadFrame: Any = js.native
    
    /**
      * @hidden
      * Loads the iframe synchronously when the navigateTimeFrame is set to `0`
      * @param urlNavigate
      * @param frameName
      * @param logger
      */
    /* private */ var loadFrameSync: Any = js.native
    
    /**
      * Monitors an iframe content window until it loads a url with a known hash, or hits a specified timeout.
      * @param iframe
      * @param timeout
      */
    def monitorIframeForHash(iframe: HTMLIFrameElement, timeout: Double): js.Promise[String] = js.native
    
    /* private */ var navigateFrameWait: Any = js.native
    
    /**
      * @hidden
      * Removes a hidden iframe from the page.
      * @ignore
      */
    /* private */ var removeHiddenIframe: Any = js.native
  }
}
