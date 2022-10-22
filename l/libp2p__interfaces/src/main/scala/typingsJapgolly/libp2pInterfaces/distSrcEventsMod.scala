package typingsJapgolly.libp2pInterfaces

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.CustomEventInit
import typingsJapgolly.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEventsMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@libp2p/interfaces/dist/src/events", "CustomEvent")
  @js.native
  open class CustomEvent[T] protected ()
    extends StObject
       with typingsJapgolly.std.CustomEvent[T] {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: CustomEventInit[T]) = this()
  }
  
  @JSImport("@libp2p/interfaces/dist/src/events", "EventEmitter")
  @js.native
  open class EventEmitter[EventMap /* <: StringDictionary[Any] */] ()
    extends StObject
       with EventTarget {
    
    def addEventListener[K /* <: /* keyof EventMap */ String */](`type`: K): Unit = js.native
    def addEventListener[K /* <: /* keyof EventMap */ String */](`type`: K, listener: Null, options: Boolean): Unit = js.native
    def addEventListener[K /* <: /* keyof EventMap */ String */](`type`: K, listener: Null, options: AddEventListenerOptions): Unit = js.native
    def addEventListener[K /* <: /* keyof EventMap */ String */](
      `type`: K,
      listener: EventHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[K] */ js.Any
        ]
    ): Unit = js.native
    def addEventListener[K /* <: /* keyof EventMap */ String */](
      `type`: K,
      listener: EventHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[K] */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener[K /* <: /* keyof EventMap */ String */](
      `type`: K,
      listener: EventHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[K] */ js.Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    def listenerCount(`type`: String): Double = js.native
    
    /* private */ var `private`: Any = js.native
    
    def removeEventListener[K /* <: /* keyof EventMap */ String */](`type`: K): Unit = js.native
    def removeEventListener[K /* <: /* keyof EventMap */ String */](`type`: K, listener: Null, options: EventListenerOptions): Unit = js.native
    def removeEventListener[K /* <: /* keyof EventMap */ String */](`type`: K, listener: Null, options: Boolean): Unit = js.native
    def removeEventListener[K /* <: /* keyof EventMap */ String */](`type`: K, listener: Unit, options: EventListenerOptions): Unit = js.native
    def removeEventListener[K /* <: /* keyof EventMap */ String */](`type`: K, listener: Unit, options: Boolean): Unit = js.native
    def removeEventListener[K /* <: /* keyof EventMap */ String */](
      `type`: K,
      listener: EventHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[K] */ js.Any
        ]
    ): Unit = js.native
    def removeEventListener[K /* <: /* keyof EventMap */ String */](
      `type`: K,
      listener: EventHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[K] */ js.Any
        ],
      options: EventListenerOptions
    ): Unit = js.native
    def removeEventListener[K /* <: /* keyof EventMap */ String */](
      `type`: K,
      listener: EventHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[K] */ js.Any
        ],
      options: Boolean
    ): Unit = js.native
  }
  
  type EventCallback[EventType] = js.Function1[/* evt */ EventType, Unit]
  
  type EventHandler[EventType] = EventCallback[EventType] | EventObject[EventType]
  
  trait EventObject[EventType] extends StObject {
    
    def handleEvent(evt: EventType): Unit
    @JSName("handleEvent")
    var handleEvent_Original: EventCallback[EventType]
  }
  object EventObject {
    
    inline def apply[EventType](handleEvent: EventType => Callback): EventObject[EventType] = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1((t0: EventType) => handleEvent(t0).runNow()))
      __obj.asInstanceOf[EventObject[EventType]]
    }
    
    extension [Self <: EventObject[?], EventType](x: Self & EventObject[EventType]) {
      
      inline def setHandleEvent(value: EventType => Callback): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1((t0: EventType) => value(t0).runNow()))
    }
  }
}
