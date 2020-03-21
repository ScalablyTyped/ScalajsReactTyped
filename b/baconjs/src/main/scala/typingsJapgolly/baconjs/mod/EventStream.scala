package typingsJapgolly.baconjs.mod

import typingsJapgolly.baconjs.observableMod.EventStreamOptions
import typingsJapgolly.baconjs.typesMod.EventSink
import typingsJapgolly.baconjs.typesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "EventStream")
@js.native
class EventStream[V] protected ()
  extends typingsJapgolly.baconjs.observableMod.EventStream[V] {
  def this(desc: typingsJapgolly.baconjs.describeMod.Desc, subscribe: Subscribe[V]) = this()
  def this(desc: typingsJapgolly.baconjs.describeMod.Desc, subscribe: Subscribe[V], handler: EventSink[V]) = this()
  def this(
    desc: typingsJapgolly.baconjs.describeMod.Desc,
    subscribe: Subscribe[V],
    handler: EventSink[V],
    options: EventStreamOptions
  ) = this()
}

