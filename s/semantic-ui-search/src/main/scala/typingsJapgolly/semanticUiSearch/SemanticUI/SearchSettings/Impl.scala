package typingsJapgolly.semanticUiSearch.SemanticUI.SearchSettings

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.semanticUiApi.SemanticUI.ApiSettings
import typingsJapgolly.semanticUiSearch.SemanticUI.Search.ClassNameSettings
import typingsJapgolly.semanticUiSearch.SemanticUI.Search.ErrorSettings
import typingsJapgolly.semanticUiSearch.SemanticUI.Search.FieldsSettings
import typingsJapgolly.semanticUiSearch.SemanticUI.Search.MetadataSettings
import typingsJapgolly.semanticUiSearch.SemanticUI.Search.RegExpSettings
import typingsJapgolly.semanticUiSearch.SemanticUI.Search.SelectorSettings
import typingsJapgolly.semanticUiSearch.SemanticUI.Search.TemplatesSettings
import typingsJapgolly.semanticUiSearch.semanticUiSearchBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  // region Behavior
  /**
    * Settings for API call.
    *
    * @see {@link http://semantic-ui.com/behaviors/api.html#/usage}
    */
  var apiSettings: ApiSettings
  /**
    * Caches results locally to avoid requerying server
    *
    * @default true
    */
  var cache: Boolean
  /**
    * Class names used to determine element state
    */
  var className: ClassNameSettings
  /**
    * Debug output to console
    */
  var debug: Boolean
  /**
    * Duration of animation events
    *
    * @default 300
    */
  var duration: Double
  /**
    * Easing equation when using fallback Javascript animation
    *
    * @default 'easeOutExpo'
    */
  var easing: String
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  /**
    * List mapping display content to JSON property, either with API or source.
    */
  var fields: FieldsSettings
  /**
    * Delay before hiding results after search blur
    *
    * @default 0
    */
  var hideDelay: Double
  /**
    * Maximum results to display when using local and simple search, maximum category count for category search
    *
    * @default 7
    */
  var maxResults: Double
  /**
    * HTML5 metadata attributes used internally
    */
  var metadata: MetadataSettings
  /**
    * Minimum characters to query for results
    *
    * @default 1
    */
  var minCharacters: Double
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
  /**
    * Regular expressions used for matching
    */
  var regExp: RegExpSettings
  /**
    * Delay before querying results on inputchange
    *
    * @default 100
    */
  var searchDelay: Double
  /**
    * Specify object properties inside local source object which will be searched
    */
  var searchFields: js.Array[String]
  /**
    * Return local results that match anywhere inside your content
    *
    * @default true
    */
  var searchFullText: Boolean
  /**
    * Whether the search should automatically select the first search result after searching
    *
    * @default false
    */
  var selectFirstResult: Boolean
  /**
    * Selectors used to find parts of a module
    */
  var selector: SelectorSettings
  /**
    * Whether a "no results" message should be shown if no results are found. (These messages can be modified using the template object specified below)
    *
    * @default false
    */
  var showNoResults: Boolean
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  /**
    * Specify a Javascript object which will be searched locally
    *
    * @default false
    */
  var source: `false` | js.Any
  // endregion
  // region Templates
  var templates: TemplatesSettings
  /**
    * Named transition to use when animating menu in and out. Fade and slide down are available without including ui transitions
    *
    * @default 'fade'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: String
  var `type`: String
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  /**
    * Callback on server response
    */
  def onResults(response: js.Any): Unit
  /**
    * Callback after processing element template to add HTML to results. Function should return false to prevent default actions.
    */
  def onResultsAdd(html: String): `false` | Unit
  /**
    * Callback when results are closed
    */
  def onResultsClose(): Unit
  /**
    * Callback when results are opened
    */
  def onResultsOpen(): Unit
  /**
    * Callback on search query
    */
  def onSearchQuery(query: String): Unit
  // endregion
  // region Callbacks
  /**
    * Callback on element selection by user.
    * The first parameter includes the filtered response results for that element.
    * The function should return false to prevent default action (closing search results and selecting value).
    */
  def onSelect(result: js.Any, response: js.Any): `false` | Unit
}

object Impl {
  @scala.inline
  def apply(
    apiSettings: ApiSettings,
    cache: Boolean,
    className: ClassNameSettings,
    debug: Boolean,
    duration: Double,
    easing: String,
    error: ErrorSettings,
    fields: FieldsSettings,
    hideDelay: Double,
    maxResults: Double,
    metadata: MetadataSettings,
    minCharacters: Double,
    name: String,
    namespace: String,
    onResults: js.Any => Callback,
    onResultsAdd: String => CallbackTo[`false` | Unit],
    onResultsClose: Callback,
    onResultsOpen: Callback,
    onSearchQuery: String => Callback,
    onSelect: (js.Any, js.Any) => CallbackTo[`false` | Unit],
    performance: Boolean,
    regExp: RegExpSettings,
    searchDelay: Double,
    searchFields: js.Array[String],
    searchFullText: Boolean,
    selectFirstResult: Boolean,
    selector: SelectorSettings,
    showNoResults: Boolean,
    silent: Boolean,
    source: `false` | js.Any,
    templates: TemplatesSettings,
    transition: String,
    `type`: String,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(apiSettings = apiSettings.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], hideDelay = hideDelay.asInstanceOf[js.Any], maxResults = maxResults.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], minCharacters = minCharacters.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], searchDelay = searchDelay.asInstanceOf[js.Any], searchFields = searchFields.asInstanceOf[js.Any], searchFullText = searchFullText.asInstanceOf[js.Any], selectFirstResult = selectFirstResult.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], showNoResults = showNoResults.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("onResults")(js.Any.fromFunction1((t0: js.Any) => onResults(t0).runNow()))
    __obj.updateDynamic("onResultsAdd")(js.Any.fromFunction1((t0: java.lang.String) => onResultsAdd(t0).runNow()))
    __obj.updateDynamic("onResultsClose")(onResultsClose.toJsFn)
    __obj.updateDynamic("onResultsOpen")(onResultsOpen.toJsFn)
    __obj.updateDynamic("onSearchQuery")(js.Any.fromFunction1((t0: java.lang.String) => onSearchQuery(t0).runNow()))
    __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => onSelect(t0, t1).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

