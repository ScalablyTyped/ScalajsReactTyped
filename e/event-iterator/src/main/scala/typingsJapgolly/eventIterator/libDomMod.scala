package typingsJapgolly.eventIterator

import org.scalajs.dom.Event
import typingsJapgolly.eventIterator.anon.PartialEventIteratorOptio
import typingsJapgolly.eventIterator.libEventIteratorMod.EventIteratorOptions
import typingsJapgolly.eventIterator.libEventIteratorMod.ListenHandler
import typingsJapgolly.std.AddEventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomMod {
  
  @JSImport("event-iterator/lib/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("event-iterator/lib/dom", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends typingsJapgolly.eventIterator.libEventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  @JSImport("event-iterator/lib/dom", "EventIterator")
  @js.native
  open class EventIterator[T] protected ()
    extends typingsJapgolly.eventIterator.libEventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  inline def subscribe(event: String): typingsJapgolly.eventIterator.libEventIteratorMod.EventIterator[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(event.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.eventIterator.libEventIteratorMod.EventIterator[Event]]
  inline def subscribe(event: String, options: Unit, evOptions: EventIteratorOptions): typingsJapgolly.eventIterator.libEventIteratorMod.EventIterator[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any], evOptions.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.eventIterator.libEventIteratorMod.EventIterator[Event]]
  inline def subscribe(event: String, options: AddEventListenerOptions): typingsJapgolly.eventIterator.libEventIteratorMod.EventIterator[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.eventIterator.libEventIteratorMod.EventIterator[Event]]
  inline def subscribe(event: String, options: AddEventListenerOptions, evOptions: EventIteratorOptions): typingsJapgolly.eventIterator.libEventIteratorMod.EventIterator[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(event.asInstanceOf[js.Any], options.asInstanceOf[js.Any], evOptions.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.eventIterator.libEventIteratorMod.EventIterator[Event]]
}
