package typingsJapgolly.semanticUiTransition.SemanticUI

import typingsJapgolly.semanticUiTransition.JQuery
import typingsJapgolly.semanticUiTransition.SemanticUI.Transition.ClassNameSettings
import typingsJapgolly.semanticUiTransition.SemanticUI.Transition.ErrorSettings
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
trait Transition_ extends js.Object {
  var settings: TransitionSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Clears all queued animations
    */
  def apply(behavior: `clear queue`): JQuery = js.native
  /**
    * Forces reflow using a more expensive but stable method
    */
  def apply(behavior: `force repaint`): JQuery = js.native
  /**
    * Returns vendor prefixed animation property for animationend
    */
  def apply(behavior: `get animation event`): String = js.native
  /**
    * Returns vendor prefixed animation property for animationname
    */
  def apply(behavior: `get animation name`): String = js.native
  /**
    * Returns whether transition is currently occurring
    */
  def apply(behavior: `is animating`): Boolean = js.native
  /**
    * Returns whether animation looping is set
    */
  def apply(behavior: `is looping`): Boolean = js.native
  /**
    * Returns whether animations are supported
    */
  def apply(behavior: `is supported`): Boolean = js.native
  /**
    * Returns whether element is currently visible
    */
  def apply(behavior: `is visible`): Boolean = js.native
  /**
    * Removes looping state from element
    */
  def apply(behavior: `remove looping`): JQuery = js.native
  /**
    * Adds back cached names and styles to element
    */
  def apply(behavior: `restore conditions`): JQuery = js.native
  /**
    * Saves all class names and styles to cache to be retrieved after animation
    */
  def apply(behavior: `save conditions`): JQuery = js.native
  /**
    * Modifies element animation duration
    */
  def apply(behavior: `set duration`, duration: Double): JQuery = js.native
  /**
    * Stop current animation and queued animations
    */
  def apply(behavior: `stop all`): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Adds disabled state (stops ability to animate)
    */
  def apply(behavior: disable): JQuery = js.native
  /**
    * Removes disabled state
    */
  def apply(behavior: enable): JQuery = js.native
  /**
    * Stop current animation and hide element
    */
  def apply(behavior: hide): JQuery = js.native
  /**
    * Enables animation looping
    */
  def apply(behavior: looping): JQuery = js.native
  /**
    * Triggers reflow on element
    */
  def apply(behavior: repaint): JQuery = js.native
  /**
    * Resets all conditions changes during transition
    */
  def apply(behavior: reset): JQuery = js.native
  def apply(behavior: setting, name: allowRepeats): Boolean = js.native
  def apply(behavior: setting, name: allowRepeats, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: animation): String = js.native
  def apply(behavior: setting, name: animation, value: String): JQuery = js.native
  def apply(behavior: setting, name: className): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: debug): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: displayType): `false` | String = js.native
  def apply(behavior: setting, name: displayType, value: String): JQuery = js.native
  def apply(behavior: setting, name: displayType, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: duration): Double = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: error): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: interval): Double = js.native
  def apply(behavior: setting, name: interval, value: Double): JQuery = js.native
  def apply(behavior: setting, name: name): String = js.native
  def apply(behavior: setting, name: namespace): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onComplete): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onComplete, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onHide): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onShow): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onStart): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onStart, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: performance): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: queue): Boolean = js.native
  def apply(behavior: setting, name: queue, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: reverse): auto | Boolean = js.native
  def apply(behavior: setting, name: reverse, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: reverse, value: auto): JQuery = js.native
  def apply(behavior: setting, name: silent): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: useFailSafe): Boolean = js.native
  def apply(behavior: setting, name: useFailSafe, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: verbose): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: TransitionSettings): JQuery = js.native
  /**
    * Stop current animation and show element
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Stop current animation and preserve queue
    */
  def apply(behavior: stop): JQuery = js.native
  /**
    * Toggles between hide and show
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: TransitionSettings): JQuery = js.native
  def apply(transition: String): JQuery = js.native
}

