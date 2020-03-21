package typingsJapgolly.semanticUiTransition.SemanticUI.TransitionSettings

import japgolly.scalajs.react.Callback
import typingsJapgolly.semanticUiTransition.SemanticUI.Transition.ClassNameSettings
import typingsJapgolly.semanticUiTransition.SemanticUI.Transition.ErrorSettings
import typingsJapgolly.semanticUiTransition.semanticUiTransitionBooleans.`false`
import typingsJapgolly.semanticUiTransition.semanticUiTransitionStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * If enabled will allow same animation to be queued while it is already occurring
    */
  var allowRepeats: Boolean
  // region Transition Settings
  /**
    * Named animation event to used. Must be defined in CSS.
    *
    * @default 'fade'
    */
  var animation: String
  // endregion
  // region DOM Settings
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings
  /**
    * Debug output to console
    */
  var debug: Boolean
  /**
    * Specify the final display type (block, inline-block etc) so that it doesn't have to be calculated.
    *
    * @default false
    */
  var displayType: `false` | String
  /**
    * Duration of the CSS transition animation
    *
    * @default 500
    */
  var duration: Double
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  /**
    * Interval in MS between each elements transition
    *
    * @default 0
    */
  var interval: Double
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  /**
    * Whether to automatically queue animation if another is occurring
    */
  var queue: Boolean
  /**
    * When an interval is specified, sets order of animations. auto reverses only animations that are hiding.
    *
    * @default 'auto'
    */
  var reverse: auto | Boolean
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  /**
    * If enabled a timeout will be added to ensure animationend callback occurs even if element is hidden
    */
  var useFailSafe: Boolean
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  /**
    * Callback on each transition complete
    */
  def onComplete(): Unit
  /**
    * Callback on each transition that changes visibility to hidden
    */
  def onHide(): Unit
  // endregion
  // region Callbacks
  /**
    * Callback on each transition that changes visibility to shown
    */
  def onShow(): Unit
  /**
    * Callback on animation start, useful for queued animations
    */
  def onStart(): Unit
}

object Impl {
  @scala.inline
  def apply(
    allowRepeats: Boolean,
    animation: String,
    className: ClassNameSettings,
    debug: Boolean,
    displayType: `false` | String,
    duration: Double,
    error: ErrorSettings,
    interval: Double,
    name: String,
    namespace: String,
    onComplete: Callback,
    onHide: Callback,
    onShow: Callback,
    onStart: Callback,
    performance: Boolean,
    queue: Boolean,
    reverse: auto | Boolean,
    silent: Boolean,
    useFailSafe: Boolean,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(allowRepeats = allowRepeats.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], displayType = displayType.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], useFailSafe = useFailSafe.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("onComplete")(onComplete.toJsFn)
    __obj.updateDynamic("onHide")(onHide.toJsFn)
    __obj.updateDynamic("onShow")(onShow.toJsFn)
    __obj.updateDynamic("onStart")(onStart.toJsFn)
    __obj.asInstanceOf[Impl]
  }
}

