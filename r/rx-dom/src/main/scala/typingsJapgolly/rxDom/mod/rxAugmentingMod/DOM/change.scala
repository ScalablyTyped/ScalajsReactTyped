package typingsJapgolly.rxDom.mod.rxAugmentingMod.DOM

import org.scalajs.dom.raw.Element
import typingsJapgolly.rxLiteAggregates.Rx.Observable
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.change")
@js.native
object change extends js.Object {
  def apply(element: Element): Observable[Event_] = js.native
  def apply(element: Element, selector: js.Function): Observable[Event_] = js.native
}

