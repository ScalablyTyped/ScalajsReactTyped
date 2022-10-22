package typingsJapgolly.azureMsalBrowser

import org.scalajs.dom.Window
import typingsJapgolly.azureMsalBrowser.distEventEventTypeMod.EventType
import typingsJapgolly.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus
import typingsJapgolly.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionType
import typingsJapgolly.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
import typingsJapgolly.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typingsJapgolly.azureMsalCommon.mod.AuthError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEventEventMessageMod {
  
  @JSImport("@azure/msal-browser/dist/event/EventMessage", "EventMessageUtils")
  @js.native
  open class EventMessageUtils () extends StObject
  /* static members */
  object EventMessageUtils {
    
    @JSImport("@azure/msal-browser/dist/event/EventMessage", "EventMessageUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets interaction status from event message
      * @param message
      * @param currentStatus
      */
    inline def getInteractionStatusFromEvent(message: EventMessage): InteractionStatus | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getInteractionStatusFromEvent")(message.asInstanceOf[js.Any]).asInstanceOf[InteractionStatus | Null]
    inline def getInteractionStatusFromEvent(message: EventMessage, currentStatus: InteractionStatus): InteractionStatus | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getInteractionStatusFromEvent")(message.asInstanceOf[js.Any], currentStatus.asInstanceOf[js.Any])).asInstanceOf[InteractionStatus | Null]
  }
  
  type EventCallbackFunction = js.Function1[/* message */ EventMessage, Unit]
  
  type EventError = AuthError | js.Error | Null
  
  trait EventMessage extends StObject {
    
    var error: EventError
    
    var eventType: EventType
    
    var interactionType: InteractionType | Null
    
    var payload: EventPayload
    
    var timestamp: Double
  }
  object EventMessage {
    
    inline def apply(eventType: EventType, timestamp: Double): EventMessage = {
      val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], error = null, interactionType = null, payload = null)
      __obj.asInstanceOf[EventMessage]
    }
    
    extension [Self <: EventMessage](x: Self) {
      
      inline def setError(value: EventError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setEventType(value: EventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      inline def setInteractionType(value: InteractionType): Self = StObject.set(x, "interactionType", value.asInstanceOf[js.Any])
      
      inline def setInteractionTypeNull: Self = StObject.set(x, "interactionType", null)
      
      inline def setPayload(value: EventPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadNull: Self = StObject.set(x, "payload", null)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
    - typingsJapgolly.azureMsalBrowser.distRequestPopupRequestMod.PopupRequest
    - typingsJapgolly.azureMsalBrowser.distRequestRedirectRequestMod.RedirectRequest
    - typingsJapgolly.azureMsalBrowser.distRequestSilentRequestMod.SilentRequest
    - typingsJapgolly.azureMsalBrowser.distRequestSsoSilentRequestMod.SsoSilentRequest
    - typingsJapgolly.azureMsalBrowser.distRequestEndSessionRequestMod.EndSessionRequest
    - typingsJapgolly.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
    - typingsJapgolly.azureMsalBrowser.distEventEventMessageMod.PopupEvent
    - scala.Null
  */
  type EventPayload = _EventPayload | AccountInfo | AuthenticationResult | Null
  
  trait PopupEvent
    extends StObject
       with _EventPayload {
    
    var popupWindow: Window
  }
  object PopupEvent {
    
    inline def apply(popupWindow: Window): PopupEvent = {
      val __obj = js.Dynamic.literal(popupWindow = popupWindow.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupEvent]
    }
    
    extension [Self <: PopupEvent](x: Self) {
      
      inline def setPopupWindow(value: Window): Self = StObject.set(x, "popupWindow", value.asInstanceOf[js.Any])
    }
  }
  
  trait _EventPayload extends StObject
  object _EventPayload {
    
    inline def EndSessionRequest(): typingsJapgolly.azureMsalBrowser.distRequestEndSessionRequestMod.EndSessionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.azureMsalBrowser.distRequestEndSessionRequestMod.EndSessionRequest]
    }
    
    inline def PopupEvent(popupWindow: Window): typingsJapgolly.azureMsalBrowser.distEventEventMessageMod.PopupEvent = {
      val __obj = js.Dynamic.literal(popupWindow = popupWindow.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.azureMsalBrowser.distEventEventMessageMod.PopupEvent]
    }
    
    inline def PopupRequest(scopes: js.Array[String]): typingsJapgolly.azureMsalBrowser.distRequestPopupRequestMod.PopupRequest = {
      val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.azureMsalBrowser.distRequestPopupRequestMod.PopupRequest]
    }
    
    inline def RedirectRequest(scopes: js.Array[String]): typingsJapgolly.azureMsalBrowser.distRequestRedirectRequestMod.RedirectRequest = {
      val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.azureMsalBrowser.distRequestRedirectRequestMod.RedirectRequest]
    }
    
    inline def SilentRequest(scopes: js.Array[String]): typingsJapgolly.azureMsalBrowser.distRequestSilentRequestMod.SilentRequest = {
      val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.azureMsalBrowser.distRequestSilentRequestMod.SilentRequest]
    }
    
    inline def SsoSilentRequest(): typingsJapgolly.azureMsalBrowser.distRequestSsoSilentRequestMod.SsoSilentRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.azureMsalBrowser.distRequestSsoSilentRequestMod.SsoSilentRequest]
    }
  }
}
