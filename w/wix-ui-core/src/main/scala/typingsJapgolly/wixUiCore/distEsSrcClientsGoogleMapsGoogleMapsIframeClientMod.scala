package typingsJapgolly.wixUiCore

import org.scalajs.dom.MessageEvent
import typingsJapgolly.std.Map
import typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsIframesManagerIframesManagerMod.IframesManager
import typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.GoogleMapsClient
import typingsJapgolly.wixUiCore.distEsSrcHocsFocusableFocusableHOCDotdriverMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcClientsGoogleMapsGoogleMapsIframeClientMod {
  
  @JSImport("wix-ui-core/dist/es/src/clients/GoogleMaps/GoogleMapsIframeClient", "GoogleMapsIframeClient")
  @js.native
  open class GoogleMapsIframeClient ()
    extends StObject
       with GoogleMapsClient {
    
    var _iframesManager: IframesManager = js.native
    
    var _promisesMap: Map[Any, Any] = js.native
    
    var _useClientId: Boolean = js.native
    
    def autocomplete(key: String, lang: String, request: String): js.Promise[Any] = js.native
    
    def geocode(key: String, lang: String, request: String): js.Promise[Any] = js.native
    
    def getOrAddIframe(key: String, lang: String): Window = js.native
    
    def handleMessage(event: MessageEvent): Unit = js.native
    
    def placeDetails(key: String, lang: String, request: String): js.Promise[Any] = js.native
  }
}
