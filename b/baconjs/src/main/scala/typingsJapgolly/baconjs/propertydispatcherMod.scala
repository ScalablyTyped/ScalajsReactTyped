package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.eventMod.Value
import typingsJapgolly.baconjs.optionalMod.Option
import typingsJapgolly.baconjs.typesMod.EventSink
import typingsJapgolly.baconjs.typesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/internal/propertydispatcher", JSImport.Namespace)
@js.native
object propertydispatcherMod extends js.Object {
  @js.native
  trait PropertyDispatcher[V, O /* <: typingsJapgolly.baconjs.observableMod.default[V] */]
    extends typingsJapgolly.baconjs.dispatcherMod.default[V, O] {
    var current: Option[Value[V]] = js.native
    var currentValueRootId: js.UndefOr[Double] = js.native
    var propertyEnded: Boolean = js.native
    def maybeSubSource(sink: EventSink[V], reply: js.Any): js.Function0[Unit] = js.native
  }
  
  @js.native
  class default[V, O /* <: typingsJapgolly.baconjs.observableMod.default[V] */] protected () extends PropertyDispatcher[V, O] {
    def this(property: O, subscribe: Subscribe[V]) = this()
    def this(property: O, subscribe: Subscribe[V], handleEvent: EventSink[V]) = this()
  }
  
}

