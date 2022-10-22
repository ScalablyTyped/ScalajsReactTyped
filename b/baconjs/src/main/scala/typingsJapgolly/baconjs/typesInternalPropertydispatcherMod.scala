package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesEventMod.Value
import typingsJapgolly.baconjs.typesOptionalMod.Option
import typingsJapgolly.baconjs.typesTypesMod.EventSink
import typingsJapgolly.baconjs.typesTypesMod.Subscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInternalPropertydispatcherMod {
  
  @JSImport("baconjs/types/internal/propertydispatcher", JSImport.Default)
  @js.native
  open class default[V, O /* <: typingsJapgolly.baconjs.typesObservableMod.default[V] */] protected () extends PropertyDispatcher[V, O] {
    def this(property: O, subscribe: Subscribe[V]) = this()
    def this(property: O, subscribe: Subscribe[V], handleEvent: EventSink[V]) = this()
  }
  
  @js.native
  trait PropertyDispatcher[V, O /* <: typingsJapgolly.baconjs.typesObservableMod.default[V] */]
    extends typingsJapgolly.baconjs.typesInternalDispatcherMod.default[V, O] {
    
    var current: Option[Value[V]] = js.native
    
    var currentValueRootId: js.UndefOr[Double] = js.native
    
    def maybeSubSource(sink: EventSink[V], reply: Any): js.Function0[Unit] = js.native
    
    var propertyEnded: Boolean = js.native
  }
}
