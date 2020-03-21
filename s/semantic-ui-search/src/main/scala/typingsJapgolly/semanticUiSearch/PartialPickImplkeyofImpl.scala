package typingsJapgolly.semanticUiSearch

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

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, keyof semantic-ui-search.SemanticUI.SearchSettings._Impl>> */
trait PartialPickImplkeyofImpl extends js.Object {
  var apiSettings: js.UndefOr[ApiSettings] = js.undefined
  var cache: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[ErrorSettings] = js.undefined
  var fields: js.UndefOr[FieldsSettings] = js.undefined
  var hideDelay: js.UndefOr[Double] = js.undefined
  var maxResults: js.UndefOr[Double] = js.undefined
  var metadata: js.UndefOr[MetadataSettings] = js.undefined
  var minCharacters: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var onResults: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* response */ js.Any, Unit]] = js.undefined
  var onResultsAdd: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit]] = js.undefined
  var onResultsClose: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onResultsOpen: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onSearchQuery: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit]] = js.undefined
  var onSelect: js.UndefOr[
    js.ThisFunction2[/* this */ JQuery, /* result */ js.Any, /* response */ js.Any, `false` | Unit]
  ] = js.undefined
  var performance: js.UndefOr[Boolean] = js.undefined
  var regExp: js.UndefOr[RegExpSettings] = js.undefined
  var searchDelay: js.UndefOr[Double] = js.undefined
  var searchFields: js.UndefOr[js.Array[String]] = js.undefined
  var searchFullText: js.UndefOr[Boolean] = js.undefined
  var selectFirstResult: js.UndefOr[Boolean] = js.undefined
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  var showNoResults: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[`false` | js.Any] = js.undefined
  var templates: js.UndefOr[TemplatesSettings] = js.undefined
  var transition: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(
    apiSettings: ApiSettings = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    className: ClassNameSettings = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    easing: String = null,
    error: ErrorSettings = null,
    fields: FieldsSettings = null,
    hideDelay: Int | Double = null,
    maxResults: Int | Double = null,
    metadata: MetadataSettings = null,
    minCharacters: Int | Double = null,
    name: String = null,
    namespace: String = null,
    onResults: js.ThisFunction1[/* this */ JQuery, /* response */ js.Any, Unit] = null,
    onResultsAdd: js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit] = null,
    onResultsClose: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onResultsOpen: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onSearchQuery: js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit] = null,
    onSelect: js.ThisFunction2[/* this */ JQuery, /* result */ js.Any, /* response */ js.Any, `false` | Unit] = null,
    performance: js.UndefOr[Boolean] = js.undefined,
    regExp: RegExpSettings = null,
    searchDelay: Int | Double = null,
    searchFields: js.Array[String] = null,
    searchFullText: js.UndefOr[Boolean] = js.undefined,
    selectFirstResult: js.UndefOr[Boolean] = js.undefined,
    selector: SelectorSettings = null,
    showNoResults: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    source: `false` | js.Any = null,
    templates: TemplatesSettings = null,
    transition: String = null,
    `type`: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    if (apiSettings != null) __obj.updateDynamic("apiSettings")(apiSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (hideDelay != null) __obj.updateDynamic("hideDelay")(hideDelay.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (minCharacters != null) __obj.updateDynamic("minCharacters")(minCharacters.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (onResults != null) __obj.updateDynamic("onResults")(onResults.asInstanceOf[js.Any])
    if (onResultsAdd != null) __obj.updateDynamic("onResultsAdd")(onResultsAdd.asInstanceOf[js.Any])
    if (onResultsClose != null) __obj.updateDynamic("onResultsClose")(onResultsClose.asInstanceOf[js.Any])
    if (onResultsOpen != null) __obj.updateDynamic("onResultsOpen")(onResultsOpen.asInstanceOf[js.Any])
    if (onSearchQuery != null) __obj.updateDynamic("onSearchQuery")(onSearchQuery.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.asInstanceOf[js.Any])
    if (regExp != null) __obj.updateDynamic("regExp")(regExp.asInstanceOf[js.Any])
    if (searchDelay != null) __obj.updateDynamic("searchDelay")(searchDelay.asInstanceOf[js.Any])
    if (searchFields != null) __obj.updateDynamic("searchFields")(searchFields.asInstanceOf[js.Any])
    if (!js.isUndefined(searchFullText)) __obj.updateDynamic("searchFullText")(searchFullText.asInstanceOf[js.Any])
    if (!js.isUndefined(selectFirstResult)) __obj.updateDynamic("selectFirstResult")(selectFirstResult.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(showNoResults)) __obj.updateDynamic("showNoResults")(showNoResults.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
}

