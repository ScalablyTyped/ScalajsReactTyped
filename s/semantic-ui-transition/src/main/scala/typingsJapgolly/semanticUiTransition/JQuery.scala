package typingsJapgolly.semanticUiTransition

import typingsJapgolly.semanticUiTransition.SemanticUI.Transition
import typingsJapgolly.semanticUiTransition.SemanticUI.Transition.ClassNameSettings
import typingsJapgolly.semanticUiTransition.SemanticUI.Transition.ErrorSettings
import typingsJapgolly.semanticUiTransition.SemanticUI.TransitionSettings
import typingsJapgolly.semanticUiTransition.semanticUiTransitionBooleans.`false`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`clear queue`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`force repaint`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`get animation event`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`get animation name`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`is animating`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`is looping`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`is supported`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`is visible`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`remove looping`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`restore conditions`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`save conditions`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`set duration`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.`stop all`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.allowRepeats
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.animation
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.auto
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.className
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.debug
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.destroy
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.disable
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.displayType
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.duration
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.enable
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.error
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.hide
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.interval
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.looping
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.name
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.namespace
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.onComplete
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.onHide
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.onShow
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.onStart
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.performance
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.queue
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.repaint
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.reset
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.reverse
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.setting
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.show
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.silent
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.stop
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.toggle
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.useFailSafe
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("transition")
  var transition_Original: Transition = js.native
  def transition(): JQuery = js.native
  def transition(behavior: setting, name: allowRepeats): Boolean = js.native
  def transition(behavior: setting, name: allowRepeats, value: Boolean): JQuery = js.native
  def transition(behavior: setting, name: animation): String = js.native
  def transition(behavior: setting, name: animation, value: String): JQuery = js.native
  def transition(behavior: setting, name: className): ClassNameSettings = js.native
  def transition(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def transition(behavior: setting, name: debug): Boolean = js.native
  def transition(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def transition(behavior: setting, name: displayType): `false` | String = js.native
  def transition(behavior: setting, name: displayType, value: String): JQuery = js.native
  def transition(behavior: setting, name: displayType, value: `false`): JQuery = js.native
  def transition(behavior: setting, name: duration): Double = js.native
  def transition(behavior: setting, name: duration, value: Double): JQuery = js.native
  def transition(behavior: setting, name: error): ErrorSettings = js.native
  def transition(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def transition(behavior: setting, name: interval): Double = js.native
  def transition(behavior: setting, name: interval, value: Double): JQuery = js.native
  def transition(behavior: setting, name: name): String = js.native
  def transition(behavior: setting, name: namespace): String = js.native
  def transition(behavior: setting, name: namespace, value: String): JQuery = js.native
  def transition(behavior: setting, name: name, value: String): JQuery = js.native
  def transition(behavior: setting, name: onComplete): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def transition(behavior: setting, name: onComplete, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def transition(behavior: setting, name: onHide): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def transition(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def transition(behavior: setting, name: onShow): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def transition(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def transition(behavior: setting, name: onStart): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def transition(behavior: setting, name: onStart, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def transition(behavior: setting, name: performance): Boolean = js.native
  def transition(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def transition(behavior: setting, name: queue): Boolean = js.native
  def transition(behavior: setting, name: queue, value: Boolean): JQuery = js.native
  def transition(behavior: setting, name: reverse): auto | Boolean = js.native
  def transition(behavior: setting, name: reverse, value: Boolean): JQuery = js.native
  def transition(behavior: setting, name: reverse, value: auto): JQuery = js.native
  def transition(behavior: setting, name: silent): Boolean = js.native
  def transition(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def transition(behavior: setting, name: useFailSafe): Boolean = js.native
  def transition(behavior: setting, name: useFailSafe, value: Boolean): JQuery = js.native
  def transition(behavior: setting, name: verbose): Boolean = js.native
  def transition(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def transition(settings: TransitionSettings): JQuery = js.native
  def transition(transition: String): JQuery = js.native
  /**
    * Clears all queued animations
    */
  @JSName("transition")
  def transition_clearqueue(behavior: `clear queue`): JQuery = js.native
  @JSName("transition")
  def transition_destroy(behavior: destroy): JQuery = js.native
  /**
    * Adds disabled state (stops ability to animate)
    */
  @JSName("transition")
  def transition_disable(behavior: disable): JQuery = js.native
  /**
    * Removes disabled state
    */
  @JSName("transition")
  def transition_enable(behavior: enable): JQuery = js.native
  /**
    * Forces reflow using a more expensive but stable method
    */
  @JSName("transition")
  def transition_forcerepaint(behavior: `force repaint`): JQuery = js.native
  /**
    * Returns vendor prefixed animation property for animationend
    */
  @JSName("transition")
  def transition_getanimationevent(behavior: `get animation event`): String = js.native
  /**
    * Returns vendor prefixed animation property for animationname
    */
  @JSName("transition")
  def transition_getanimationname(behavior: `get animation name`): String = js.native
  /**
    * Stop current animation and hide element
    */
  @JSName("transition")
  def transition_hide(behavior: hide): JQuery = js.native
  /**
    * Returns whether transition is currently occurring
    */
  @JSName("transition")
  def transition_isanimating(behavior: `is animating`): Boolean = js.native
  /**
    * Returns whether animation looping is set
    */
  @JSName("transition")
  def transition_islooping(behavior: `is looping`): Boolean = js.native
  /**
    * Returns whether animations are supported
    */
  @JSName("transition")
  def transition_issupported(behavior: `is supported`): Boolean = js.native
  /**
    * Returns whether element is currently visible
    */
  @JSName("transition")
  def transition_isvisible(behavior: `is visible`): Boolean = js.native
  /**
    * Enables animation looping
    */
  @JSName("transition")
  def transition_looping(behavior: looping): JQuery = js.native
  /**
    * Removes looping state from element
    */
  @JSName("transition")
  def transition_removelooping(behavior: `remove looping`): JQuery = js.native
  /**
    * Triggers reflow on element
    */
  @JSName("transition")
  def transition_repaint(behavior: repaint): JQuery = js.native
  /**
    * Resets all conditions changes during transition
    */
  @JSName("transition")
  def transition_reset(behavior: reset): JQuery = js.native
  /**
    * Adds back cached names and styles to element
    */
  @JSName("transition")
  def transition_restoreconditions(behavior: `restore conditions`): JQuery = js.native
  /**
    * Saves all class names and styles to cache to be retrieved after animation
    */
  @JSName("transition")
  def transition_saveconditions(behavior: `save conditions`): JQuery = js.native
  /**
    * Modifies element animation duration
    */
  @JSName("transition")
  def transition_setduration(behavior: `set duration`, duration: Double): JQuery = js.native
  @JSName("transition")
  def transition_setting(behavior: setting, value: TransitionSettings): JQuery = js.native
  /**
    * Stop current animation and show element
    */
  @JSName("transition")
  def transition_show(behavior: show): JQuery = js.native
  /**
    * Stop current animation and preserve queue
    */
  @JSName("transition")
  def transition_stop(behavior: stop): JQuery = js.native
  /**
    * Stop current animation and queued animations
    */
  @JSName("transition")
  def transition_stopall(behavior: `stop all`): JQuery = js.native
  /**
    * Toggles between hide and show
    */
  @JSName("transition")
  def transition_toggle(behavior: toggle): JQuery = js.native
}

