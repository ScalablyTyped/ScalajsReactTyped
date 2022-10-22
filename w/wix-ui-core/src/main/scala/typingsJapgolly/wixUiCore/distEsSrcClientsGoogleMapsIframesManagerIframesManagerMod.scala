package typingsJapgolly.wixUiCore

import org.scalajs.dom.HTMLIFrameElement
import typingsJapgolly.wixUiCore.anon.ApiKey
import typingsJapgolly.wixUiCore.anon.ClientId
import typingsJapgolly.wixUiCore.distEsSrcHocsFocusableFocusableHOCDotdriverMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcClientsGoogleMapsIframesManagerIframesManagerMod {
  
  @JSImport("wix-ui-core/dist/es/src/clients/GoogleMaps/IframesManager/IframesManager", "IframesManager")
  @js.native
  open class IframesManager () extends StObject {
    
    /* private */ val _iframeMap: Any = js.native
    
    def addIframe(hasApiKeyLangClientId: ApiKey): Window = js.native
    
    /* private */ var createGoogleMapsScript: Any = js.native
    
    /* private */ var createInitializationScript: Any = js.native
    
    def getIframe(key: String, lang: String): Window = js.native
    
    def hasIframe(key: String, lang: String): Boolean = js.native
    
    def populateIframe(iframe: HTMLIFrameElement, apiKey: String, lang: String, clientId: String): Unit = js.native
    
    def removeAllIframes(): Unit = js.native
  }
  /* static members */
  object IframesManager {
    
    @JSImport("wix-ui-core/dist/es/src/clients/GoogleMaps/IframesManager/IframesManager", "IframesManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def generateUrl(hasApiKeyClientIdLang: ClientId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUrl")(hasApiKeyClientIdLang.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("wix-ui-core/dist/es/src/clients/GoogleMaps/IframesManager/IframesManager", "IframesManager.getKey")
    @js.native
    def getKey: Any = js.native
    inline def getKey_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getKey")(x.asInstanceOf[js.Any])
  }
}
