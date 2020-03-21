package typingsJapgolly.semanticUiRating.SemanticUI.RatingSettings

import japgolly.scalajs.react.Callback
import typingsJapgolly.semanticUiRating.SemanticUI.Rating.ClassNameSettings
import typingsJapgolly.semanticUiRating.SemanticUI.Rating.ErrorSettings
import typingsJapgolly.semanticUiRating.SemanticUI.Rating.SelectorSettings
import typingsJapgolly.semanticUiRating.semanticUiRatingStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  var className: ClassNameSettings
  /**
    * By default a rating will be only clearable if there is 1 icon. Setting to true/false will allow or disallow a user to clear their rating
    *
    * @default 'auto'
    */
  var clearable: auto | Boolean
  /**
    * Debug output to console
    */
  var debug: Boolean
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  /**
    * Whether callbacks like onRate should fire immediately after initializing with the current value.
    *
    * @default false
    */
  var fireOnInit: Boolean
  // region Rating Settings
  /**
    * A number representing the default rating to apply
    *
    * @default 0
    */
  var initialRating: Double
  /**
    * Whether to enable user's ability to rate
    *
    * @default true
    */
  var interactive: Boolean
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
  // endregion
  // region DOM Settings
  var selector: SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  // endregion
  // region Callbacks
  /**
    * Is called after user selects a new rating
    */
  def onRate(value: Double): Unit
}

object Impl {
  @scala.inline
  def apply(
    className: ClassNameSettings,
    clearable: auto | Boolean,
    debug: Boolean,
    error: ErrorSettings,
    fireOnInit: Boolean,
    initialRating: Double,
    interactive: Boolean,
    name: String,
    namespace: String,
    onRate: Double => Callback,
    performance: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], clearable = clearable.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fireOnInit = fireOnInit.asInstanceOf[js.Any], initialRating = initialRating.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("onRate")(js.Any.fromFunction1((t0: scala.Double) => onRate(t0).runNow()))
    __obj.asInstanceOf[Impl]
  }
}

