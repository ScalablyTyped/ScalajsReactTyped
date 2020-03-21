package typingsJapgolly.rxDom.mod.rxAugmentingMod.DOM

import org.scalajs.dom.raw.MutationObserverInit
import org.scalajs.dom.raw.Node
import typingsJapgolly.rxLiteAggregates.Rx.Observable
import typingsJapgolly.std.MutationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.fromMutationObserver")
@js.native
object fromMutationObserver extends js.Object {
  // Mutation Observers
  def apply(target: Node, options: MutationObserverInit): Observable[MutationEvent] = js.native
}

