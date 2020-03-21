package typingsJapgolly.signalsJs

import typingsJapgolly.signalsJs.ieventMod.IEvent
import typingsJapgolly.signalsJs.iprioritysignalMod.IPrioritySignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("signals.js/lib/org/osflash/signals/events/GenericEvent", JSImport.Namespace)
@js.native
object genericEventMod extends js.Object {
  @js.native
  class GenericEvent () extends IEvent {
    def this(bubbles: Boolean) = this()
    var _bubbles: Boolean = js.native
    var _currentTarget: js.Object = js.native
    var _signal: IPrioritySignal = js.native
    var _target: js.Object = js.native
    /** Indicates whether the event is a bubbling event. */
    /* CompleteClass */
    override var bubbles: Boolean = js.native
    /** The object that added the listener for the event. */
    /* CompleteClass */
    override var currentTarget: js.Object = js.native
    /** The signal that dispatched the event. */
    /* CompleteClass */
    override var signal: IPrioritySignal = js.native
    /** The object that originally dispatched the event.
      *  When dispatched from an signal, the target is the object containing the signal. */
    /* CompleteClass */
    override var target: js.Object = js.native
  }
  
}

