package typingsJapgolly.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event[T] extends StObject {
  
  def notify(args: T): Any = js.native
  def notify(args: T, e: org.scalajs.dom.Event): Any = js.native
  def notify(args: T, e: org.scalajs.dom.Event, scope: Any): Any = js.native
  def notify(args: T, e: Unit, scope: Any): Any = js.native
  def notify(args: T, e: EventData): Any = js.native
  def notify(args: T, e: EventData, scope: Any): Any = js.native
  def notify(args: Unit, e: org.scalajs.dom.Event): Any = js.native
  def notify(args: Unit, e: org.scalajs.dom.Event, scope: Any): Any = js.native
  def notify(args: Unit, e: Unit, scope: Any): Any = js.native
  def notify(args: Unit, e: EventData): Any = js.native
  def notify(args: Unit, e: EventData, scope: Any): Any = js.native
  
  /***
    * Adds an event handler to be called when the event is fired.
    * <p>Event handler will receive two arguments - an <code>EventData</code> and the <code>data</code>
    * object the event was fired with.<p>
    * @method subscribe
    * @param fn {Function} Event handler.
    */
  def subscribe(fn: js.Function2[org.scalajs.dom.Event | (/* e */ EventData), /* data */ T, Unit]): Unit = js.native
  
  /***
    * Removes an event handler added with <code>subscribe(fn)</code>.
    * @method unsubscribe
    * @param fn {Function} Event handler to be removed.
    */
  def unsubscribe(fn: js.Function2[org.scalajs.dom.Event | (/* e */ EventData), /* data */ T, Unit]): Unit = js.native
}
