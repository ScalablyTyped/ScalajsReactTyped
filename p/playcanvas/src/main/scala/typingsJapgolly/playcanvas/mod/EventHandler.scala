package typingsJapgolly.playcanvas.mod

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
@JSImport("playcanvas", "EventHandler")
@js.native
class EventHandler ()
  extends typingsJapgolly.playcanvas.pc.EventHandler

