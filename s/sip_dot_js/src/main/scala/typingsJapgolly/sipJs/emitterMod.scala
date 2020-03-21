package typingsJapgolly.sipJs

import typingsJapgolly.events.mod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/emitter", JSImport.Namespace)
@js.native
object emitterMod extends js.Object {
  @js.native
  trait Emitter[T] extends js.Object {
    /**
      * Sets up a function that will be called whenever the target changes.
      * @param listener - Callback function.
      * @param options - An options object that specifies characteristics about the listener.
      *                  If once true, indicates that the listener should be invoked at most once after being added.
      *                  If once true, the listener would be automatically removed when invoked.
      */
    def addListener(listener: js.Function1[/* data */ T, Unit]): Unit = js.native
    def addListener(listener: js.Function1[/* data */ T, Unit], options: AnonOnce): Unit = js.native
    /**
      * Unregisters a listener.
      * @param listener - Callback function.
      * @deprecated Use removeListener.
      */
    def off(listener: js.Function1[/* data */ T, Unit]): Unit = js.native
    /**
      * Registers a listener.
      * @param listener - Callback function.
      * @deprecated Use addListener.
      */
    def on(listener: js.Function1[/* data */ T, Unit]): Unit = js.native
    /**
      * Registers a listener then unregisters the listener after one event emission.
      * @param listener - Callback function.
      * @deprecated Use addListener.
      */
    def once(listener: js.Function1[/* data */ T, Unit]): Unit = js.native
    /**
      * Removes from the listener previously registered with addListener.
      * @param listener - Callback function.
      */
    def removeListener(listener: js.Function1[/* data */ T, Unit]): Unit = js.native
  }
  
  @JSName("_makeEmitter")
  def makeEmitter[T](eventEmitter: EventEmitter): Emitter[T] = js.native
  @JSName("_makeEmitter")
  def makeEmitter[T](eventEmitter: EventEmitter, eventName: String): Emitter[T] = js.native
}

