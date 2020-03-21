package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.eventMod.Event
import typingsJapgolly.baconjs.observableMod.default
import typingsJapgolly.baconjs.predicateMod.Predicate
import typingsJapgolly.baconjs.predicateMod.PredicateOrProperty
import typingsJapgolly.baconjs.replyMod.Reply
import typingsJapgolly.baconjs.typesMod.EventSink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/skipwhile", JSImport.Namespace)
@js.native
object skipwhileMod extends js.Object {
  def default[V](src: typingsJapgolly.baconjs.observableMod.default[V], f: PredicateOrProperty[V]): typingsJapgolly.baconjs.observableMod.default[V] = js.native
  def skipWhile[V](src: default[V], f: PredicateOrProperty[V]): default[V] = js.native
  def skipWhileT[V](f: Predicate[V]): js.Function2[/* event */ Event[V], /* sink */ EventSink[V], Reply] = js.native
}

