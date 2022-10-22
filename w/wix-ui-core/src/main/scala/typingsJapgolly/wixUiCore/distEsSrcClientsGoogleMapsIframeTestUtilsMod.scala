package typingsJapgolly.wixUiCore

import org.scalajs.dom.HTMLIFrameElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.wixUiCore.anon.Maps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcClientsGoogleMapsIframeTestUtilsMod {
  
  @JSImport("wix-ui-core/dist/es/src/clients/GoogleMaps/IframeTestUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/es/src/clients/GoogleMaps/IframeTestUtils", "EventEmitterMock")
  @js.native
  open class EventEmitterMock () extends StObject {
    
    def addEventListener(eventName: Any, callback: Any): Unit = js.native
    
    var eventListeners: js.Array[Any] = js.native
    
    def triggerMessage(event: Any): Unit = js.native
  }
  
  inline def GoogleMapsMock(): Maps = ^.asInstanceOf[js.Dynamic].applyDynamic("GoogleMapsMock")().asInstanceOf[Maps]
  inline def GoogleMapsMock(autocompleteInstance: Any): Maps = ^.asInstanceOf[js.Dynamic].applyDynamic("GoogleMapsMock")(autocompleteInstance.asInstanceOf[js.Any]).asInstanceOf[Maps]
  inline def GoogleMapsMock(autocompleteInstance: Any, geocoderInstance: Any): Maps = (^.asInstanceOf[js.Dynamic].applyDynamic("GoogleMapsMock")(autocompleteInstance.asInstanceOf[js.Any], geocoderInstance.asInstanceOf[js.Any])).asInstanceOf[Maps]
  inline def GoogleMapsMock(autocompleteInstance: Any, geocoderInstance: Any, placesServiceInstance: Any): Maps = (^.asInstanceOf[js.Dynamic].applyDynamic("GoogleMapsMock")(autocompleteInstance.asInstanceOf[js.Any], geocoderInstance.asInstanceOf[js.Any], placesServiceInstance.asInstanceOf[js.Any])).asInstanceOf[Maps]
  inline def GoogleMapsMock(autocompleteInstance: Any, geocoderInstance: Unit, placesServiceInstance: Any): Maps = (^.asInstanceOf[js.Dynamic].applyDynamic("GoogleMapsMock")(autocompleteInstance.asInstanceOf[js.Any], geocoderInstance.asInstanceOf[js.Any], placesServiceInstance.asInstanceOf[js.Any])).asInstanceOf[Maps]
  inline def GoogleMapsMock(autocompleteInstance: Unit, geocoderInstance: Any): Maps = (^.asInstanceOf[js.Dynamic].applyDynamic("GoogleMapsMock")(autocompleteInstance.asInstanceOf[js.Any], geocoderInstance.asInstanceOf[js.Any])).asInstanceOf[Maps]
  inline def GoogleMapsMock(autocompleteInstance: Unit, geocoderInstance: Any, placesServiceInstance: Any): Maps = (^.asInstanceOf[js.Dynamic].applyDynamic("GoogleMapsMock")(autocompleteInstance.asInstanceOf[js.Any], geocoderInstance.asInstanceOf[js.Any], placesServiceInstance.asInstanceOf[js.Any])).asInstanceOf[Maps]
  inline def GoogleMapsMock(autocompleteInstance: Unit, geocoderInstance: Unit, placesServiceInstance: Any): Maps = (^.asInstanceOf[js.Dynamic].applyDynamic("GoogleMapsMock")(autocompleteInstance.asInstanceOf[js.Any], geocoderInstance.asInstanceOf[js.Any], placesServiceInstance.asInstanceOf[js.Any])).asInstanceOf[Maps]
  
  inline def IframesManagerMock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("IframesManagerMock")().asInstanceOf[Unit]
  
  inline def getIframeWithLangAndApiKey(lang: Any, apiKey: Any): HTMLIFrameElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getIframeWithLangAndApiKey")(lang.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[HTMLIFrameElement | Null]
  
  inline def getIframes(): NodeList[HTMLIFrameElement & Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIframes")().asInstanceOf[NodeList[HTMLIFrameElement & Node]]
  
  inline def isIframeVisible(iframe: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIframeVisible")(iframe.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def triggerIframeInitAutocomplete(mockedGoogleInstance: Any, lang: Any, apiKey: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerIframeInitAutocomplete")(mockedGoogleInstance.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
