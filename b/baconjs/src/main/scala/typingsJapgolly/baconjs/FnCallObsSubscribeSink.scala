package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesMod.Subscribe
import typingsJapgolly.baconjs.updatebarrierMod.EventSink
import typingsJapgolly.baconjs.updatebarrierMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallObsSubscribeSink extends js.Object {
  def apply[V](obs: Observable, subscribe: Subscribe[V], sink: EventSink[V]): js.Function0[Unit] = js.native
}

