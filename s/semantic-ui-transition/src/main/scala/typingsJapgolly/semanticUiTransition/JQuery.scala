package typingsJapgolly.semanticUiTransition

import typingsJapgolly.semanticUiTransition.SemanticUI.Transition
import typingsJapgolly.semanticUiTransition.SemanticUI.TransitionSettings
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
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.destroy
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.disable
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.enable
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.hide
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.looping
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.repaint
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.reset
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.setting
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.show
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.stop
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def transition(): JQuery
  def transition(settings: TransitionSettings): JQuery
  def transition(transition: String): JQuery
  @JSName("transition")
  var transition_Original: Transition
  /**
    * Clears all queued animations
    */
  @JSName("transition")
  def transition_clearqueue(behavior: `clear queue`): JQuery
  @JSName("transition")
  def transition_destroy(behavior: destroy): JQuery
  /**
    * Adds disabled state (stops ability to animate)
    */
  @JSName("transition")
  def transition_disable(behavior: disable): JQuery
  /**
    * Removes disabled state
    */
  @JSName("transition")
  def transition_enable(behavior: enable): JQuery
  /**
    * Forces reflow using a more expensive but stable method
    */
  @JSName("transition")
  def transition_forcerepaint(behavior: `force repaint`): JQuery
  /**
    * Returns vendor prefixed animation property for animationend
    */
  @JSName("transition")
  def transition_getanimationevent(behavior: `get animation event`): String
  /**
    * Returns vendor prefixed animation property for animationname
    */
  @JSName("transition")
  def transition_getanimationname(behavior: `get animation name`): String
  /**
    * Stop current animation and hide element
    */
  @JSName("transition")
  def transition_hide(behavior: hide): JQuery
  /**
    * Returns whether transition is currently occurring
    */
  @JSName("transition")
  def transition_isanimating(behavior: `is animating`): Boolean
  /**
    * Returns whether animation looping is set
    */
  @JSName("transition")
  def transition_islooping(behavior: `is looping`): Boolean
  /**
    * Returns whether animations are supported
    */
  @JSName("transition")
  def transition_issupported(behavior: `is supported`): Boolean
  /**
    * Returns whether element is currently visible
    */
  @JSName("transition")
  def transition_isvisible(behavior: `is visible`): Boolean
  /**
    * Enables animation looping
    */
  @JSName("transition")
  def transition_looping(behavior: looping): JQuery
  /**
    * Removes looping state from element
    */
  @JSName("transition")
  def transition_removelooping(behavior: `remove looping`): JQuery
  /**
    * Triggers reflow on element
    */
  @JSName("transition")
  def transition_repaint(behavior: repaint): JQuery
  /**
    * Resets all conditions changes during transition
    */
  @JSName("transition")
  def transition_reset(behavior: reset): JQuery
  /**
    * Adds back cached names and styles to element
    */
  @JSName("transition")
  def transition_restoreconditions(behavior: `restore conditions`): JQuery
  /**
    * Saves all class names and styles to cache to be retrieved after animation
    */
  @JSName("transition")
  def transition_saveconditions(behavior: `save conditions`): JQuery
  /**
    * Modifies element animation duration
    */
  @JSName("transition")
  def transition_setduration(behavior: `set duration`, duration: Double): JQuery
  @JSName("transition")
  def transition_setting(behavior: setting, value: TransitionSettings): JQuery
  @JSName("transition")
  def transition_setting[K /* <: /* keyof semantic-ui-transition.SemanticUI.TransitionSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-transition.SemanticUI.TransitionSettings._Impl[K] */ js.Any
  ): JQuery
  @JSName("transition")
  def transition_setting[K /* <: /* keyof semantic-ui-transition.SemanticUI.TransitionSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-transition.SemanticUI.TransitionSettings._Impl[K] */ js.Any
  /**
    * Stop current animation and show element
    */
  @JSName("transition")
  def transition_show(behavior: show): JQuery
  /**
    * Stop current animation and preserve queue
    */
  @JSName("transition")
  def transition_stop(behavior: stop): JQuery
  /**
    * Stop current animation and queued animations
    */
  @JSName("transition")
  def transition_stopall(behavior: `stop all`): JQuery
  /**
    * Toggles between hide and show
    */
  @JSName("transition")
  def transition_toggle(behavior: toggle): JQuery
}
object JQuery {
  
  inline def apply(transition: Transition): JQuery = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
  }
}
