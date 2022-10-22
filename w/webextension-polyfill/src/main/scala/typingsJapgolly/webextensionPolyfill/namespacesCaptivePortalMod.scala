package typingsJapgolly.webextensionPolyfill

import japgolly.scalajs.react.Callback
import typingsJapgolly.webextensionPolyfill.namespacesEventsMod.Events.Event
import typingsJapgolly.webextensionPolyfill.namespacesTypesMod.Types.Setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesCaptivePortalMod {
  
  object CaptivePortal {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.captive
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.clear
    */
    trait OnConnectivityAvailableStatusEnum extends StObject
    object OnConnectivityAvailableStatusEnum {
      
      inline def captive: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.captive = "captive".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.captive]
      
      inline def clear: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.clear = "clear".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.clear]
    }
    
    trait OnStateChangedDetailsType extends StObject {
      
      /**
        * The current captive portal state.
        */
      var state: OnStateChangedDetailsTypeStateEnum
    }
    object OnStateChangedDetailsType {
      
      inline def apply(state: OnStateChangedDetailsTypeStateEnum): OnStateChangedDetailsType = {
        val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnStateChangedDetailsType]
      }
      
      extension [Self <: OnStateChangedDetailsType](x: Self) {
        
        inline def setState(value: OnStateChangedDetailsTypeStateEnum): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The current captive portal state.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.unknown
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.not_captive
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.unlocked_portal
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.locked_portal
    */
    trait OnStateChangedDetailsTypeStateEnum extends StObject
    object OnStateChangedDetailsTypeStateEnum {
      
      inline def locked_portal: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.locked_portal = "locked_portal".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.locked_portal]
      
      inline def not_captive: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.not_captive = "not_captive".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.not_captive]
      
      inline def unknown: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.unknown = "unknown".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.unknown]
      
      inline def unlocked_portal: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.unlocked_portal = "unlocked_portal".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.unlocked_portal]
    }
    
    trait Static extends StObject {
      
      /**
        * Return the canonical captive-portal detection URL. Read-only.
        */
      var canonicalURL: Setting
      
      /**
        * Returns the time difference between NOW and the last time a request was completed in milliseconds.
        */
      def getLastChecked(): Unit
      
      /**
        * Returns the current portal state, one of `unknown`, `not_captive`, `unlocked_portal`, `locked_portal`.
        */
      def getState(): Unit
      
      /**
        * This notification will be emitted when the captive portal service has determined that we can connect to the internet.
        * The service will pass either `captive` if there is an unlocked captive portal present,
        * or `clear` if no captive portal was detected.
        *
        * @param status
        */
      var onConnectivityAvailable: Event[js.Function1[/* status */ OnConnectivityAvailableStatusEnum, Unit]]
      
      /**
        * Fired when the captive portal state changes.
        *
        * @param details
        */
      var onStateChanged: Event[js.Function1[/* details */ OnStateChangedDetailsType, Unit]]
    }
    object Static {
      
      inline def apply(
        canonicalURL: Setting,
        getLastChecked: Callback,
        getState: Callback,
        onConnectivityAvailable: Event[js.Function1[/* status */ OnConnectivityAvailableStatusEnum, Unit]],
        onStateChanged: Event[js.Function1[/* details */ OnStateChangedDetailsType, Unit]]
      ): Static = {
        val __obj = js.Dynamic.literal(canonicalURL = canonicalURL.asInstanceOf[js.Any], getLastChecked = getLastChecked.toJsFn, getState = getState.toJsFn, onConnectivityAvailable = onConnectivityAvailable.asInstanceOf[js.Any], onStateChanged = onStateChanged.asInstanceOf[js.Any])
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setCanonicalURL(value: Setting): Self = StObject.set(x, "canonicalURL", value.asInstanceOf[js.Any])
        
        inline def setGetLastChecked(value: Callback): Self = StObject.set(x, "getLastChecked", value.toJsFn)
        
        inline def setGetState(value: Callback): Self = StObject.set(x, "getState", value.toJsFn)
        
        inline def setOnConnectivityAvailable(value: Event[js.Function1[/* status */ OnConnectivityAvailableStatusEnum, Unit]]): Self = StObject.set(x, "onConnectivityAvailable", value.asInstanceOf[js.Any])
        
        inline def setOnStateChanged(value: Event[js.Function1[/* details */ OnStateChangedDetailsType, Unit]]): Self = StObject.set(x, "onStateChanged", value.asInstanceOf[js.Any])
      }
    }
  }
}
