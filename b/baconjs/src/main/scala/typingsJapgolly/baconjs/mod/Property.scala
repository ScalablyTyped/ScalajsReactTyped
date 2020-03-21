package typingsJapgolly.baconjs.mod

import typingsJapgolly.baconjs.typesMod.EventSink
import typingsJapgolly.baconjs.typesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "Property")
@js.native
class Property[V] protected ()
  extends typingsJapgolly.baconjs.observableMod.Property[V] {
  def this(desc: typingsJapgolly.baconjs.describeMod.Desc, subscribe: Subscribe[V]) = this()
  def this(desc: typingsJapgolly.baconjs.describeMod.Desc, subscribe: Subscribe[V], handler: EventSink[V]) = this()
}

