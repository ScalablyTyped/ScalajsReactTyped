package typingsJapgolly.eventIterator

import typingsJapgolly.eventIterator.anon.PartialEventIteratorOptio
import typingsJapgolly.eventIterator.libEventIteratorMod.EventIteratorOptions
import typingsJapgolly.eventIterator.libEventIteratorMod.ListenHandler
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodeMod {
  
  @JSImport("event-iterator/lib/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("event-iterator/lib/node", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends typingsJapgolly.eventIterator.libEventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  @JSImport("event-iterator/lib/node", "EventIterator")
  @js.native
  open class EventIterator[T] protected ()
    extends typingsJapgolly.eventIterator.libEventIteratorMod.EventIterator[T] {
    def this(listen: ListenHandler[T]) = this()
    def this(listen: ListenHandler[T], hasHighWaterMarkLowWaterMark: PartialEventIteratorOptio) = this()
  }
  
  inline def stream(): typingsJapgolly.eventIterator.libEventIteratorMod.EventIterator[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")().asInstanceOf[typingsJapgolly.eventIterator.libEventIteratorMod.EventIterator[Buffer]]
  inline def stream(evOptions: EventIteratorOptions): typingsJapgolly.eventIterator.libEventIteratorMod.EventIterator[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(evOptions.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.eventIterator.libEventIteratorMod.EventIterator[Buffer]]
}
