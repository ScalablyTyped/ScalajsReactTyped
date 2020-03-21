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

@JSImport("baconjs/types/filter", JSImport.Namespace)
@js.native
object filterMod extends js.Object {
  def filter[V](src: default[V], f: PredicateOrProperty[V]): default[V] = js.native
  def filterT[V](f: Predicate[V]): js.Function2[/* e */ Event[V], /* sink */ EventSink[V], Reply] = js.native
}

