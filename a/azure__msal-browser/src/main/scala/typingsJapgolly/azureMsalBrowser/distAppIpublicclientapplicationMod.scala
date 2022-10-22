package typingsJapgolly.azureMsalBrowser

import typingsJapgolly.azureMsalBrowser.distCacheItokencacheMod.ITokenCache
import typingsJapgolly.azureMsalBrowser.distConfigConfigurationMod.BrowserConfiguration
import typingsJapgolly.azureMsalBrowser.distNavigationInavigationclientMod.INavigationClient
import typingsJapgolly.azureMsalBrowser.distRequestAuthorizationCodeRequestMod.AuthorizationCodeRequest
import typingsJapgolly.azureMsalBrowser.distRequestEndSessionPopupRequestMod.EndSessionPopupRequest
import typingsJapgolly.azureMsalBrowser.distRequestEndSessionRequestMod.EndSessionRequest
import typingsJapgolly.azureMsalBrowser.distRequestPopupRequestMod.PopupRequest
import typingsJapgolly.azureMsalBrowser.distRequestRedirectRequestMod.RedirectRequest
import typingsJapgolly.azureMsalBrowser.distRequestSilentRequestMod.SilentRequest
import typingsJapgolly.azureMsalBrowser.distRequestSsoSilentRequestMod.SsoSilentRequest
import typingsJapgolly.azureMsalBrowser.distUtilsBrowserConstantsMod.WrapperSKU
import typingsJapgolly.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
import typingsJapgolly.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typingsJapgolly.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.PerformanceCallbackFunction
import typingsJapgolly.azureMsalCommon.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAppIpublicclientapplicationMod {
  
  @JSImport("@azure/msal-browser/dist/app/IPublicClientApplication", "stubbedPublicClientApplication")
  @js.native
  val stubbedPublicClientApplication: IPublicClientApplication = js.native
  
  @js.native
  trait IPublicClientApplication extends StObject {
    
    def acquireTokenByCode(request: AuthorizationCodeRequest): js.Promise[AuthenticationResult] = js.native
    
    def acquireTokenPopup(request: PopupRequest): js.Promise[AuthenticationResult] = js.native
    
    def acquireTokenRedirect(request: RedirectRequest): js.Promise[Unit] = js.native
    
    def acquireTokenSilent(silentRequest: SilentRequest): js.Promise[AuthenticationResult] = js.native
    
    def addEventCallback(callback: js.Function): String | Null = js.native
    
    def addPerformanceCallback(callback: PerformanceCallbackFunction): String = js.native
    
    def disableAccountStorageEvents(): Unit = js.native
    
    def enableAccountStorageEvents(): Unit = js.native
    
    def getAccountByHomeId(homeAccountId: String): AccountInfo | Null = js.native
    
    def getAccountByLocalId(localId: String): AccountInfo | Null = js.native
    
    def getAccountByUsername(userName: String): AccountInfo | Null = js.native
    
    def getActiveAccount(): AccountInfo | Null = js.native
    
    def getAllAccounts(): js.Array[AccountInfo] = js.native
    
    def getConfiguration(): BrowserConfiguration = js.native
    
    def getLogger(): Logger = js.native
    
    def getTokenCache(): ITokenCache = js.native
    
    def handleRedirectPromise(): js.Promise[AuthenticationResult | Null] = js.native
    def handleRedirectPromise(hash: String): js.Promise[AuthenticationResult | Null] = js.native
    
    def initialize(): js.Promise[Unit] = js.native
    
    def initializeWrapperLibrary(sku: WrapperSKU, version: String): Unit = js.native
    
    def loginPopup(): js.Promise[AuthenticationResult] = js.native
    def loginPopup(request: PopupRequest): js.Promise[AuthenticationResult] = js.native
    
    def loginRedirect(): js.Promise[Unit] = js.native
    def loginRedirect(request: RedirectRequest): js.Promise[Unit] = js.native
    
    def logout(): js.Promise[Unit] = js.native
    def logout(logoutRequest: EndSessionRequest): js.Promise[Unit] = js.native
    
    def logoutPopup(): js.Promise[Unit] = js.native
    def logoutPopup(logoutRequest: EndSessionPopupRequest): js.Promise[Unit] = js.native
    
    def logoutRedirect(): js.Promise[Unit] = js.native
    def logoutRedirect(logoutRequest: EndSessionRequest): js.Promise[Unit] = js.native
    
    def removeEventCallback(callbackId: String): Unit = js.native
    
    def removePerformanceCallback(callbackId: String): Boolean = js.native
    
    def setActiveAccount(): Unit = js.native
    def setActiveAccount(account: AccountInfo): Unit = js.native
    
    def setLogger(logger: Logger): Unit = js.native
    
    def setNavigationClient(navigationClient: INavigationClient): Unit = js.native
    
    def ssoSilent(request: SsoSilentRequest): js.Promise[AuthenticationResult] = js.native
  }
}
