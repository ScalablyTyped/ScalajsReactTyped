package typingsJapgolly.semanticUiDimmer.SemanticUI.DimmerSettings

import japgolly.scalajs.react.Callback
import typingsJapgolly.semanticUiDimmer.SemanticUI.Dimmer.ClassNameSettings
import typingsJapgolly.semanticUiDimmer.SemanticUI.Dimmer.DurationSettings
import typingsJapgolly.semanticUiDimmer.SemanticUI.Dimmer.ErrorSettings
import typingsJapgolly.semanticUiDimmer.SemanticUI.Dimmer.SelectorSettings
import typingsJapgolly.semanticUiDimmer.SemanticUI.Dimmer.TemplateSettings
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerBooleans.`false`
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.auto
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.click
import typingsJapgolly.semanticUiDimmer.semanticUiDimmerStrings.hover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings
  /**
    * Whether clicking on the dimmer should hide the dimmer (Defaults to auto, closable only when settings.on is not hover
    *
    * @default 'auto'
    */
  var closable: auto | Boolean
  /**
    * Debug output to console
    */
  var debug: Boolean
  /**
    * If initializing a dimmer on a dimmable context, you can use dimmerName to distinguish between multiple dimmers in that context.
    *
    * @default false
    */
  var dimmerName: `false` | String
  /**
    * Animation duration of dimming. If an integer is used, that value will apply to both show and hide animations.
    */
  var duration: Double | DurationSettings
  // endregion
  // region Debug Settings
  /**
    * Error messages displayed to console
    */
  var error: ErrorSettings
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
    * Can be set to hover or click to show/hide dimmer on dimmable event
    *
    * @default false
    */
  var on: `false` | hover | click
  // region Behavior
  /**
    * Dimmers opacity from 0-1. Defaults to auto which uses the CSS specified opacity.
    *
    * @default 'auto'
    */
  var opacity: auto | Double
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  // endregion
  // region DOM Settings
  /**
    * Object containing selectors used by module.
    */
  var selector: SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  /**
    * Templates used to generate dimmer content
    */
  var template: TemplateSettings
  /**
    * Named transition to use when animating menu in and out. Fade and slide down are available without including ui transitions
    *
    * @default 'fade'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: String
  /**
    * Whether to dim dimmers using CSS transitions.
    *
    * @default true
    */
  var useCSS: Boolean
  /**
    * Specify a variation to add when generating dimmer, like inverted
    *
    * @default false
    */
  var variation: `false` | String
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  /**
    * Callback on element show or hide
    */
  def onChange(): Unit
  /**
    * Callback on element hide
    */
  def onHide(): Unit
  // endregion
  // region Callbacks
  /**
    * Callback on element show
    */
  def onShow(): Unit
}

object Impl {
  @scala.inline
  def apply(
    className: ClassNameSettings,
    closable: auto | Boolean,
    debug: Boolean,
    dimmerName: `false` | String,
    duration: Double | DurationSettings,
    error: ErrorSettings,
    name: String,
    namespace: String,
    on: `false` | hover | click,
    onChange: Callback,
    onHide: Callback,
    onShow: Callback,
    opacity: auto | Double,
    performance: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    template: TemplateSettings,
    transition: String,
    useCSS: Boolean,
    variation: `false` | String,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], dimmerName = dimmerName.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], useCSS = useCSS.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.updateDynamic("onHide")(onHide.toJsFn)
    __obj.updateDynamic("onShow")(onShow.toJsFn)
    __obj.asInstanceOf[Impl]
  }
}

