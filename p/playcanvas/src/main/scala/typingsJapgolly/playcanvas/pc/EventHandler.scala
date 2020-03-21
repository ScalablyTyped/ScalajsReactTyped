package typingsJapgolly.playcanvas.pc

import typingsJapgolly.playcanvas.pc.callbacks.HandleEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.EventHandler
  * @classdesc Abstract base class that implements functionality for event handling.
  * @description Create a new event handler.
  * @example
  * var obj = new EventHandlerSubclass();
  *
  * // subscribe to an event
  * obj.on('hello', function (str) {
  *     console.log('event hello is fired', str);
  * });
  *
  * // fire event
  * obj.fire('hello', 'world');
  */
@JSGlobal("pc.EventHandler")
@js.native
class EventHandler () extends js.Object {
  /**
    * @function
    * @name pc.EventHandler#fire
    * @description Fire an event, all additional arguments are passed on to the event listener.
    * @param {object} name - Name of event to fire.
    * @param {*} [arg1] - First argument that is passed to the event handler.
    * @param {*} [arg2] - Second argument that is passed to the event handler.
    * @param {*} [arg3] - Third argument that is passed to the event handler.
    * @param {*} [arg4] - Fourth argument that is passed to the event handler.
    * @param {*} [arg5] - Fifth argument that is passed to the event handler.
    * @param {*} [arg6] - Sixth argument that is passed to the event handler.
    * @param {*} [arg7] - Seventh argument that is passed to the event handler.
    * @param {*} [arg8] - Eighth argument that is passed to the event handler.
    * @returns {pc.EventHandler} Self for chaining.
    * @example
    * obj.fire('test', 'This is the message');
    */
  def fire(
    name: js.Any,
    arg1: js.UndefOr[js.Any],
    arg2: js.UndefOr[js.Any],
    arg3: js.UndefOr[js.Any],
    arg4: js.UndefOr[js.Any],
    arg5: js.UndefOr[js.Any],
    arg6: js.UndefOr[js.Any],
    arg7: js.UndefOr[js.Any],
    arg8: js.UndefOr[js.Any]
  ): EventHandler = js.native
  /**
    * @function
    * @name pc.EventHandler#hasEvent
    * @description Test if there are any handlers bound to an event name.
    * @param {string} name - The name of the event to test.
    * @returns {boolean} True if the object has handlers bound to the specified event name.
    * @example
    * obj.on('test', function () { }); // bind an event to 'test'
    * obj.hasEvent('test'); // returns true
    * obj.hasEvent('hello'); // returns false
    */
  def hasEvent(name: String): Boolean = js.native
  /**
    * @function
    * @name pc.EventHandler#off
    * @description Detach an event handler from an event. If callback is not provided then all callbacks are unbound from the event,
    * if scope is not provided then all events with the callback will be unbound.
    * @param {string} [name] - Name of the event to unbind.
    * @param {pc.callbacks.HandleEvent} [callback] - Function to be unbound.
    * @param {object} [scope] - Scope that was used as the this when the event is fired.
    * @returns {pc.EventHandler} Self for chaining.
    * @example
    * var handler = function () {
    * };
    * obj.on('test', handler);
    *
    * obj.off(); // Removes all events
    * obj.off('test'); // Removes all events called 'test'
    * obj.off('test', handler); // Removes all handler functions, called 'test'
    * obj.off('test', handler, this); // Removes all hander functions, called 'test' with scope this
    */
  def off(): EventHandler = js.native
  def off(name: String): EventHandler = js.native
  def off(name: String, callback: HandleEvent): EventHandler = js.native
  def off(name: String, callback: HandleEvent, scope: js.Any): EventHandler = js.native
  /**
    * @function
    * @name pc.EventHandler#on
    * @description Attach an event handler to an event.
    * @param {string} name - Name of the event to bind the callback to.
    * @param {pc.callbacks.HandleEvent} callback - Function that is called when event is fired. Note the callback is limited to 8 arguments.
    * @param {object} [scope] - Object to use as 'this' when the event is fired, defaults to current this.
    * @returns {pc.EventHandler} Self for chaining.
    * @example
    * obj.on('test', function (a, b) {
    *     console.log(a + b);
    * });
    * obj.fire('test', 1, 2); // prints 3 to the console
    */
  def on(name: String, callback: HandleEvent): EventHandler = js.native
  def on(name: String, callback: HandleEvent, scope: js.Any): EventHandler = js.native
  /**
    * @function
    * @name pc.EventHandler#once
    * @description Attach an event handler to an event. This handler will be removed after being fired once.
    * @param {string} name - Name of the event to bind the callback to.
    * @param {pc.callbacks.HandleEvent} callback - Function that is called when event is fired. Note the callback is limited to 8 arguments.
    * @param {object} [scope] - Object to use as 'this' when the event is fired, defaults to current this.
    * @returns {pc.EventHandler} Self for chaining.
    * @example
    * obj.once('test', function (a, b) {
    *     console.log(a + b);
    * });
    * obj.fire('test', 1, 2); // prints 3 to the console
    * obj.fire('test', 1, 2); // not going to get handled
    */
  def once(name: String, callback: HandleEvent): EventHandler = js.native
  def once(name: String, callback: HandleEvent, scope: js.Any): EventHandler = js.native
}

