package typingsJapgolly.expoLocation

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expoLocation.buildLocationDottypesMod.LocationCallback
import typingsJapgolly.expoLocation.buildLocationDottypesMod.LocationHeadingCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLocationSubscribersMod {
  
  @JSImport("expo-location/build/LocationSubscribers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expo-location/build/LocationSubscribers", "HeadingSubscriber")
  @js.native
  val HeadingSubscriber: Subscriber[LocationHeadingCallback] = js.native
  
  @JSImport("expo-location/build/LocationSubscribers", "LocationSubscriber")
  @js.native
  val LocationSubscriber: Subscriber[LocationCallback] = js.native
  
  inline def getCurrentWatchId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_getCurrentWatchId")().asInstanceOf[Double]
  
  trait EventObject
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var watchId: Double
  }
  object EventObject {
    
    inline def apply(watchId: Double): EventObject = {
      val __obj = js.Dynamic.literal(watchId = watchId.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventObject]
    }
    
    extension [Self <: EventObject](x: Self) {
      
      inline def setWatchId(value: Double): Self = StObject.set(x, "watchId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Subscriber[CallbackType /* <: LocationCallback | LocationHeadingCallback */] extends StObject {
    
    /* private */ var callbacks: Any
    
    /* private */ var eventDataField: Any
    
    /* private */ var eventName: Any
    
    /* private */ var eventSubscription: Any
    
    def maybeInitializeSubscription(): Unit
    
    /**
      * Registers given callback under new id which is then returned.
      */
    def registerCallback(callback: CallbackType): Double
    
    def trigger(event: EventObject): Unit
    
    /**
      * Unregisters a callback with given id and revokes the subscription if possible.
      */
    def unregisterCallback(id: Double): Unit
  }
  object Subscriber {
    
    inline def apply[CallbackType /* <: LocationCallback | LocationHeadingCallback */](
      callbacks: Any,
      eventDataField: Any,
      eventName: Any,
      eventSubscription: Any,
      maybeInitializeSubscription: Callback,
      registerCallback: CallbackType => Double,
      trigger: EventObject => Callback,
      unregisterCallback: Double => Callback
    ): Subscriber[CallbackType] = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], eventDataField = eventDataField.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventSubscription = eventSubscription.asInstanceOf[js.Any], maybeInitializeSubscription = maybeInitializeSubscription.toJsFn, registerCallback = js.Any.fromFunction1(registerCallback), trigger = js.Any.fromFunction1((t0: EventObject) => trigger(t0).runNow()), unregisterCallback = js.Any.fromFunction1((t0: Double) => unregisterCallback(t0).runNow()))
      __obj.asInstanceOf[Subscriber[CallbackType]]
    }
    
    extension [Self <: Subscriber[?], CallbackType /* <: LocationCallback | LocationHeadingCallback */](x: Self & Subscriber[CallbackType]) {
      
      inline def setCallbacks(value: Any): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setEventDataField(value: Any): Self = StObject.set(x, "eventDataField", value.asInstanceOf[js.Any])
      
      inline def setEventName(value: Any): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setEventSubscription(value: Any): Self = StObject.set(x, "eventSubscription", value.asInstanceOf[js.Any])
      
      inline def setMaybeInitializeSubscription(value: Callback): Self = StObject.set(x, "maybeInitializeSubscription", value.toJsFn)
      
      inline def setRegisterCallback(value: CallbackType => Double): Self = StObject.set(x, "registerCallback", js.Any.fromFunction1(value))
      
      inline def setTrigger(value: EventObject => Callback): Self = StObject.set(x, "trigger", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
      
      inline def setUnregisterCallback(value: Double => Callback): Self = StObject.set(x, "unregisterCallback", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
}
