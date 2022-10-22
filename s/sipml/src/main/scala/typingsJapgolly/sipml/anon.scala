package typingsJapgolly.sipml

import japgolly.scalajs.react.Callback
import typingsJapgolly.sipml.SIPml.Session.Event
import typingsJapgolly.sipml.SIPml.Session.EventSubscriptionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Audio extends StObject {
    
    var audio: Double
    
    var video: Double
  }
  object Audio {
    
    inline def apply(audio: Double, video: Double): Audio = {
      val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[Audio]
    }
    
    extension [Self <: Audio](x: Self) {
      
      inline def setAudio(value: Double): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setVideo(value: Double): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    }
  }
  
  trait Events extends StObject {
    
    var events: EventSubscriptionType | js.Array[EventSubscriptionType]
    
    def listener(e: Event): Unit
  }
  object Events {
    
    inline def apply(events: EventSubscriptionType | js.Array[EventSubscriptionType], listener: Event => Callback): Events = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], listener = js.Any.fromFunction1((t0: Event) => listener(t0).runNow()))
      __obj.asInstanceOf[Events]
    }
    
    extension [Self <: Events](x: Self) {
      
      inline def setEvents(value: EventSubscriptionType | js.Array[EventSubscriptionType]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: EventSubscriptionType*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setListener(value: Event => Callback): Self = StObject.set(x, "listener", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    }
  }
  
  trait Listener extends StObject {
    
    var events: typingsJapgolly.sipml.SIPml.Stack.EventSubscriptionType | js.Array[typingsJapgolly.sipml.SIPml.Stack.EventSubscriptionType]
    
    def listener(e: typingsJapgolly.sipml.SIPml.Stack.Event): Unit
  }
  object Listener {
    
    inline def apply(
      events: typingsJapgolly.sipml.SIPml.Stack.EventSubscriptionType | js.Array[typingsJapgolly.sipml.SIPml.Stack.EventSubscriptionType],
      listener: typingsJapgolly.sipml.SIPml.Stack.Event => Callback
    ): Listener = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], listener = js.Any.fromFunction1((t0: typingsJapgolly.sipml.SIPml.Stack.Event) => listener(t0).runNow()))
      __obj.asInstanceOf[Listener]
    }
    
    extension [Self <: Listener](x: Self) {
      
      inline def setEvents(
        value: typingsJapgolly.sipml.SIPml.Stack.EventSubscriptionType | js.Array[typingsJapgolly.sipml.SIPml.Stack.EventSubscriptionType]
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: typingsJapgolly.sipml.SIPml.Stack.EventSubscriptionType*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setListener(value: typingsJapgolly.sipml.SIPml.Stack.Event => Callback): Self = StObject.set(x, "listener", js.Any.fromFunction1((t0: typingsJapgolly.sipml.SIPml.Stack.Event) => value(t0).runNow()))
    }
  }
  
  trait MaxHeight extends StObject {
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var minHeight: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
  }
  object MaxHeight {
    
    inline def apply(): MaxHeight = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxHeight]
    }
    
    extension [Self <: MaxHeight](x: Self) {
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    }
  }
}
