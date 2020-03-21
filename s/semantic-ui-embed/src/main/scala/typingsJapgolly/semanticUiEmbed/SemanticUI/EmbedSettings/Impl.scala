package typingsJapgolly.semanticUiEmbed.SemanticUI.EmbedSettings

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.ClassNameSettings
import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.ErrorSettings
import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.MetadataSettings
import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.ParametersSettings
import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.SelectorSettings
import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedBooleans.`false`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  // endregion
  // region Video Settings
  /**
    * Default setting auto will only autoplay content when a placeholder is specified. Setting to true or false will force autoplay.
    *
    * @default 'auto'
    */
  var autoplay: auto | Boolean
  /**
    * Whether to show networks branded UI like title cards, or after video calls to action.
    *
    * @default false
    */
  var brandedUI: Boolean
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings
  /**
    * Specifies a default chrome color with Vimeo or YouTube.
    *
    * @default '#444444'
    */
  var color: String
  /**
    * Debug output to console
    */
  var debug: Boolean
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  /**
    * Whether to prefer HD content
    *
    * @default true
    */
  var hd: Boolean
  // region Embed Settings
  /**
    * Specifies an icon to use with placeholder content
    *
    * @default false
    */
  var icon: `false` | String
  /**
    * Specifies an id value to replace with the {id} value found in templated urls
    *
    * @default false
    */
  var id: `false` | String
  /**
    * HTML Data attributes used to store data
    */
  var metadata: MetadataSettings
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
    * Specify an object containing key/value pairs to add to the iframes GET parameters
    *
    * @default false
    */
  var parameters: `false` | ParametersSettings
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  // endregion
  // region DOM Settings
  /**
    * DOM Selectors used internally
    */
  var selector: SelectorSettings
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  /**
    * Specifies a source to use, if no source is provided it will be determined from the domain of a specified url.
    *
    * @default false
    */
  var source: `false` | String
  var templates: TemplatesSettings
  /**
    * Specifies a url to use for embed
    *
    * @default false
    */
  var url: `false` | String
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  // endregion
  // region Callbacks
  /**
    * Callback when iframe is generated
    */
  def onCreate(url: String): Unit
  /**
    * Whenever an iframe contents is shown
    */
  def onDisplay(): Unit
  /**
    * Callback when module parameters are determined. Allows you to adjust parameters at run time by returning a new parameters object.
    */
  def onEmbed(parameters: ParametersSettings): ParametersSettings
  /**
    * Callback immediately before Embed is removed from DOM
    */
  def onPlaceholderDisplay(): Unit
}

object Impl {
  @scala.inline
  def apply(
    autoplay: auto | Boolean,
    brandedUI: Boolean,
    className: ClassNameSettings,
    color: String,
    debug: Boolean,
    error: ErrorSettings,
    hd: Boolean,
    icon: `false` | String,
    id: `false` | String,
    metadata: MetadataSettings,
    name: String,
    namespace: String,
    onCreate: String => Callback,
    onDisplay: Callback,
    onEmbed: ParametersSettings => CallbackTo[ParametersSettings],
    onPlaceholderDisplay: Callback,
    parameters: `false` | ParametersSettings,
    performance: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    source: `false` | String,
    templates: TemplatesSettings,
    url: `false` | String,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(autoplay = autoplay.asInstanceOf[js.Any], brandedUI = brandedUI.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], hd = hd.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("onCreate")(js.Any.fromFunction1((t0: java.lang.String) => onCreate(t0).runNow()))
    __obj.updateDynamic("onDisplay")(onDisplay.toJsFn)
    __obj.updateDynamic("onEmbed")(js.Any.fromFunction1((t0: typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.ParametersSettings) => onEmbed(t0).runNow()))
    __obj.updateDynamic("onPlaceholderDisplay")(onPlaceholderDisplay.toJsFn)
    __obj.asInstanceOf[Impl]
  }
}

