package typingsJapgolly.fabric.fabricImplMod

import org.scalajs.dom.Event
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.fabric.fabricStrings.mouseColondblclick
import typingsJapgolly.fabric.fabricStrings.mouseColondown
import typingsJapgolly.fabric.fabricStrings.mouseColondownColonbefore
import typingsJapgolly.fabric.fabricStrings.mouseColonmove
import typingsJapgolly.fabric.fabricStrings.mouseColonmoveColonbefore
import typingsJapgolly.fabric.fabricStrings.mouseColonout
import typingsJapgolly.fabric.fabricStrings.mouseColonover
import typingsJapgolly.fabric.fabricStrings.mouseColonup
import typingsJapgolly.fabric.fabricStrings.mouseColonupColonbefore
import typingsJapgolly.fabric.fabricStrings.mouseColonwheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObservable[T] extends StObject {
  
  /**
    * Fires event with an optional options object
    * @memberOf fabric.Observable
    * @param {String} eventName Event name to fire
    * @param {Object} [options] Options object
    * @return {Self} thisArg
    * @chainable
    */
  def fire(eventName: String): T = js.native
  def fire(eventName: String, options: Any): T = js.native
  
  /**
    * Stops event observing for a particular event handler. Calling this method
    * without arguments removes all handlers for all events
    * @param eventName Event name (eg. 'after:render') or object with key/value pairs (eg. {'after:render': handler, 'selection:cleared': handler})
    * @param handler Function to be deleted from EventListeners
    */
  def off(): T = js.native
  def off(eventName: String): T = js.native
  def off(eventName: String, handler: js.Function1[/* e */ IEvent[Event], Unit]): T = js.native
  def off(eventName: Any): T = js.native
  def off(eventName: Any, handler: js.Function1[/* e */ IEvent[Event], Unit]): T = js.native
  def off(eventName: Unit, handler: js.Function1[/* e */ IEvent[Event], Unit]): T = js.native
  
  /**
    * Observes specified event
    * @param eventName Event name (eg. 'after:render')
    * @param handler Function that receives a notification when an event of the specified type occurs
    */
  def on(
    eventName: mouseColonup | mouseColondown | mouseColonmove | mouseColonupColonbefore | mouseColondownColonbefore | mouseColonmoveColonbefore | mouseColondblclick | mouseColonover | mouseColonout,
    handler: js.Function1[/* e */ IEvent[MouseEvent], Unit]
  ): T = js.native
  def on(eventName: String, handler: js.Function1[/* e */ IEvent[Event], Unit]): T = js.native
  @JSName("on")
  def on_mousewheel(eventName: mouseColonwheel, handler: js.Function1[/* e */ IEvent[WheelEvent], Unit]): T = js.native
}
