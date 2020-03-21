package typingsJapgolly.rxDom.mod.rxAugmentingMod.DOM

import typingsJapgolly.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.fromEvent")
@js.native
object fromEvent extends js.Object {
  // Events
  def apply[T](element: js.Any, eventName: String): Observable[T] = js.native
  def apply[T](element: js.Any, eventName: String, selector: js.Function): Observable[T] = js.native
  def apply[T](element: js.Any, eventName: String, selector: js.Function, useCapture: Boolean): Observable[T] = js.native
}

