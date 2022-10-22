package typingsJapgolly.azureMsalBrowser

import typingsJapgolly.azureMsalBrowser.distEventEventMessageMod.EventCallbackFunction
import typingsJapgolly.azureMsalBrowser.distEventEventMessageMod.EventError
import typingsJapgolly.azureMsalBrowser.distEventEventMessageMod.EventPayload
import typingsJapgolly.azureMsalBrowser.distEventEventTypeMod.EventType
import typingsJapgolly.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionType
import typingsJapgolly.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typingsJapgolly.azureMsalCommon.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEventEventHandlerMod {
  
  @JSImport("@azure/msal-browser/dist/event/EventHandler", "EventHandler")
  @js.native
  open class EventHandler protected () extends StObject {
    def this(logger: Logger, browserCrypto: ICrypto) = this()
    
    /**
      * Adds event callbacks to array
      * @param callback
      */
    def addEventCallback(callback: EventCallbackFunction): String | Null = js.native
    
    /* private */ var browserCrypto: Any = js.native
    
    /**
      * Removes event listener that emits an event when a user account is added or removed from localstorage in a different browser tab or window
      */
    def disableAccountStorageEvents(): Unit = js.native
    
    /**
      * Emits events by calling callback with event message
      * @param eventType
      * @param interactionType
      * @param payload
      * @param error
      */
    def emitEvent(eventType: EventType): Unit = js.native
    def emitEvent(eventType: EventType, interactionType: Unit, payload: Unit, error: EventError): Unit = js.native
    def emitEvent(eventType: EventType, interactionType: Unit, payload: EventPayload): Unit = js.native
    def emitEvent(eventType: EventType, interactionType: Unit, payload: EventPayload, error: EventError): Unit = js.native
    def emitEvent(eventType: EventType, interactionType: InteractionType): Unit = js.native
    def emitEvent(eventType: EventType, interactionType: InteractionType, payload: Unit, error: EventError): Unit = js.native
    def emitEvent(eventType: EventType, interactionType: InteractionType, payload: EventPayload): Unit = js.native
    def emitEvent(eventType: EventType, interactionType: InteractionType, payload: EventPayload, error: EventError): Unit = js.native
    
    /**
      * Adds event listener that emits an event when a user account is added or removed from localstorage in a different browser tab or window
      */
    def enableAccountStorageEvents(): Unit = js.native
    
    /* private */ var eventCallbacks: Any = js.native
    
    /**
      * Emit account added/removed events when cached accounts are changed in a different tab or frame
      */
    /* private */ var handleAccountCacheChange: Any = js.native
    
    /* private */ var listeningToStorageEvents: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /**
      * Removes callback with provided id from callback array
      * @param callbackId
      */
    def removeEventCallback(callbackId: String): Unit = js.native
  }
}
