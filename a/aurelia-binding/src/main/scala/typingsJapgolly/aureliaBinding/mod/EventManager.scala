package typingsJapgolly.aureliaBinding.mod

import org.scalajs.dom.raw.EventTarget
import typingsJapgolly.aureliaBinding.AnonProperties
import typingsJapgolly.aureliaBinding.aureliaBindingBooleans.`true`
import typingsJapgolly.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-binding", "EventManager")
@js.native
class EventManager () extends js.Object {
  def this(escapeShadowRoot: Boolean) = this()
  var escapeShadowRoot: Boolean = js.native
  def addEventListener(
    target: EventTarget,
    targetEvent: String,
    callback: EventListenerOrEventListenerObject,
    delegate: delegationStrategy
  ): js.Function0[Unit] = js.native
  /**
    * Subscribes to specified event on the target element.
    * @param target Target element.
    * @param targetEvent Name of event to subscribe.
    * @param callback Event listener callback.
    * @param delegate True to use event delegation mechanism.
    * @param disposable True to return a disposable object with dispose() method instead of a function
    * @returns function which removes event listener.
    */
  @JSName("addEventListener")
  def addEventListener_true(
    target: EventTarget,
    targetEvent: String,
    callback: EventListenerOrEventListenerObject,
    delegate: delegationStrategy,
    disposable: `true`
  ): Disposable = js.native
  def registerElementConfig(config: AnonProperties): Unit = js.native
}

