package typingsJapgolly.jqueryCycle2

import org.scalajs.dom.raw.Element
import typingsJapgolly.jquery.JQueryEventObject
import typingsJapgolly.jqueryCycle2.JQueryCycle2.API
import typingsJapgolly.jqueryCycle2.JQueryCycle2.Cycle2
import typingsJapgolly.jqueryCycle2.JQueryCycle2.Options
import typingsJapgolly.jqueryCycle2.JQueryCycle2.OptionsWithState
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.`cycle-after`
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.`cycle-before`
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.`cycle-bootstrap`
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.`cycle-destroyed`
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.`cycle-finished`
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.`cycle-initialized`
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.`cycle-next`
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.`cycle-pager-activated`
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.`cycle-paused`
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.`cycle-post-initialize`
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.`cycle-pre-initialize`
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.`cycle-prev`
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.`cycle-resumed`
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.`cycle-slide-added`
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.`cycle-slide-removed`
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.`cycle-stopped`
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.`cycle-transition-stopped`
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.`cycle-update-view`
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.add
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.destroy
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.goto
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.next
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.pause
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.prev
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.reinit
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.remove
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.resume
import typingsJapgolly.jqueryCycle2.jqueryCycle2Strings.stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("cycle")
  var cycle_Original: Cycle2 = js.native
  def cycle(): JQuery = js.native
  def cycle(methodNameDontCallMe: String, arg1DontCallMe: js.Any, arg2DontCallMe: js.Any): JQuery = js.native
  def cycle(options: Options): JQuery = js.native
  @JSName("cycle")
  def cycle_add(methodName: add, newSlide: js.Any): JQuery = js.native
   // string or JQuery
  @JSName("cycle")
  def cycle_destroy(methodName: destroy): JQuery = js.native
  @JSName("cycle")
  def cycle_goto(methodName: goto, index: Double): JQuery = js.native
  @JSName("cycle")
  def cycle_next(methodName: next): JQuery = js.native
  @JSName("cycle")
  def cycle_pause(methodName: pause): JQuery = js.native
  @JSName("cycle")
  def cycle_prev(methodName: prev): JQuery = js.native
  @JSName("cycle")
  def cycle_reinit(methodName: reinit): JQuery = js.native
  @JSName("cycle")
  def cycle_remove(methodName: remove, index: Double): JQuery = js.native
  @JSName("cycle")
  def cycle_resume(methodName: resume): JQuery = js.native
  @JSName("cycle")
  def cycle_stop(methodName: stop): JQuery = js.native
  @JSName("on")
  def on_cycleafter(
    methodName: `cycle-after`,
    callback: js.Function5[
      /* event */ JQueryEventObject, 
      /* optionHash */ OptionsWithState, 
      /* outgoingSlideEl */ Element, 
      /* incomingSlideEl */ Element, 
      /* forwardFlag */ Boolean, 
      Unit
    ]
  ): JQuery = js.native
  @JSName("on")
  def on_cyclebefore(
    methodName: `cycle-before`,
    callback: js.Function5[
      /* event */ JQueryEventObject, 
      /* optionHash */ OptionsWithState, 
      /* outgoingSlideEl */ Element, 
      /* incomingSlideEl */ Element, 
      /* forwardFlag */ Boolean, 
      Unit
    ]
  ): JQuery = js.native
  @JSName("on")
  def on_cyclebootstrap(
    methodName: `cycle-bootstrap`,
    callback: js.Function3[/* event */ JQueryEventObject, /* optionHash */ OptionsWithState, /* API */ API, Unit]
  ): JQuery = js.native
  @JSName("on")
  def on_cycledestroyed(
    methodName: `cycle-destroyed`,
    callback: js.Function2[/* event */ JQueryEventObject, /* optionHash */ OptionsWithState, Unit]
  ): JQuery = js.native
  @JSName("on")
  def on_cyclefinished(
    methodName: `cycle-finished`,
    callback: js.Function2[/* event */ JQueryEventObject, /* optionHash */ OptionsWithState, Unit]
  ): JQuery = js.native
  @JSName("on")
  def on_cycleinitialized(
    methodName: `cycle-initialized`,
    callback: js.Function2[/* event */ JQueryEventObject, /* optionHash */ OptionsWithState, Unit]
  ): JQuery = js.native
  @JSName("on")
  def on_cyclenext(
    methodName: `cycle-next`,
    callback: js.Function2[/* event */ JQueryEventObject, /* optionHash */ OptionsWithState, Unit]
  ): JQuery = js.native
  @JSName("on")
  def on_cyclepageractivated(
    methodName: `cycle-pager-activated`,
    callback: js.Function2[/* event */ JQueryEventObject, /* optionHash */ OptionsWithState, Unit]
  ): JQuery = js.native
  @JSName("on")
  def on_cyclepaused(
    methodName: `cycle-paused`,
    callback: js.Function2[/* event */ JQueryEventObject, /* optionHash */ OptionsWithState, Unit]
  ): JQuery = js.native
  @JSName("on")
  def on_cyclepostinitialize(
    methodName: `cycle-post-initialize`,
    callback: js.Function2[/* event */ JQueryEventObject, /* optionHash */ OptionsWithState, Unit]
  ): JQuery = js.native
  @JSName("on")
  def on_cyclepreinitialize(
    methodName: `cycle-pre-initialize`,
    callback: js.Function2[/* event */ JQueryEventObject, /* optionHash */ OptionsWithState, Unit]
  ): JQuery = js.native
  @JSName("on")
  def on_cycleprev(
    methodName: `cycle-prev`,
    callback: js.Function2[/* event */ JQueryEventObject, /* optionHash */ OptionsWithState, Unit]
  ): JQuery = js.native
  @JSName("on")
  def on_cycleresumed(
    methodName: `cycle-resumed`,
    callback: js.Function2[/* event */ JQueryEventObject, /* optionHash */ OptionsWithState, Unit]
  ): JQuery = js.native
  @JSName("on")
  def on_cycleslideadded(
    methodName: `cycle-slide-added`,
    callback: js.Function2[/* event */ JQueryEventObject, /* jQueryWrappedSlideEl */ this.type, Unit]
  ): JQuery = js.native
  @JSName("on")
  def on_cycleslideremoved(
    methodName: `cycle-slide-removed`,
    callback: js.Function3[
      /* event */ JQueryEventObject, 
      /* indexOfSlideRemoved */ Double, 
      /* removedSlideEl */ Element, 
      Unit
    ]
  ): JQuery = js.native
  @JSName("on")
  def on_cyclestopped(
    methodName: `cycle-stopped`,
    callback: js.Function2[/* event */ JQueryEventObject, /* optionHash */ OptionsWithState, Unit]
  ): JQuery = js.native
  @JSName("on")
  def on_cycletransitionstopped(
    methodName: `cycle-transition-stopped`,
    callback: js.Function2[/* event */ JQueryEventObject, /* optionHash */ OptionsWithState, Unit]
  ): JQuery = js.native
  @JSName("on")
  def on_cycleupdateview(
    methodName: `cycle-update-view`,
    callback: js.Function4[
      /* event */ JQueryEventObject, 
      /* optionHash */ OptionsWithState, 
      /* slideOptionsHash */ OptionsWithState, 
      /* currentSlideEl */ Element, 
      Unit
    ]
  ): JQuery = js.native
}

