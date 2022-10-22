package typingsJapgolly.webextensionPolyfill

import japgolly.scalajs.react.Callback
import typingsJapgolly.webextensionPolyfill.namespacesEventsMod.Events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesIdleMod {
  
  object Idle {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.active
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.idle
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.locked
    */
    trait IdleState extends StObject
    object IdleState {
      
      inline def active: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.active = "active".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.active]
      
      inline def idle: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.idle = "idle".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.idle]
      
      inline def locked: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.locked = "locked".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.locked]
    }
    
    trait Static extends StObject {
      
      /**
        * Fired when the system changes to an active or idle state. The event fires with "idle" if the the user has not generated
        * any input for a specified number of seconds, and "active" when the user generates input on an idle system.
        *
        * @param newState
        */
      var onStateChanged: Event[js.Function1[/* newState */ IdleState, Unit]]
      
      /**
        * Returns "idle" if the user has not generated any input for a specified number of seconds, or "active" otherwise.
        *
        * @param detectionIntervalInSeconds The system is considered idle if detectionIntervalInSeconds seconds have elapsed since
        * the last user input detected.
        */
      def queryState(detectionIntervalInSeconds: Double): js.Promise[IdleState]
      
      /**
        * Sets the interval, in seconds, used to determine when the system is in an idle state for onStateChanged events.
        * The default interval is 60 seconds.
        *
        * @param intervalInSeconds Threshold, in seconds, used to determine when the system is in an idle state.
        */
      def setDetectionInterval(intervalInSeconds: Double): Unit
    }
    object Static {
      
      inline def apply(
        onStateChanged: Event[js.Function1[/* newState */ IdleState, Unit]],
        queryState: Double => js.Promise[IdleState],
        setDetectionInterval: Double => Callback
      ): Static = {
        val __obj = js.Dynamic.literal(onStateChanged = onStateChanged.asInstanceOf[js.Any], queryState = js.Any.fromFunction1(queryState), setDetectionInterval = js.Any.fromFunction1((t0: Double) => setDetectionInterval(t0).runNow()))
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setOnStateChanged(value: Event[js.Function1[/* newState */ IdleState, Unit]]): Self = StObject.set(x, "onStateChanged", value.asInstanceOf[js.Any])
        
        inline def setQueryState(value: Double => js.Promise[IdleState]): Self = StObject.set(x, "queryState", js.Any.fromFunction1(value))
        
        inline def setSetDetectionInterval(value: Double => Callback): Self = StObject.set(x, "setDetectionInterval", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      }
    }
  }
}
