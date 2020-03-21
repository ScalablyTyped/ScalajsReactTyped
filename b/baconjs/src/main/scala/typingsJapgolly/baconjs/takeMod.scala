package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.describeMod.Desc
import typingsJapgolly.baconjs.eventMod.Event
import typingsJapgolly.baconjs.observableMod.default
import typingsJapgolly.baconjs.replyMod.Reply
import typingsJapgolly.baconjs.typesMod.EventSink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/take", JSImport.Namespace)
@js.native
object takeMod extends js.Object {
  def take[V](count: Double, src: default[V]): default[V] = js.native
  def take[V](count: Double, src: default[V], desc: Desc): default[V] = js.native
  def takeT[V](count: Double): js.Function2[/* e */ Event[V], /* sink */ EventSink[V], Reply] = js.native
}

