package typingsJapgolly.semanticUiSearch.SemanticUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.semanticUiApi.SemanticUI.ApiSettings
import typingsJapgolly.semanticUiSearch.JQuery
import typingsJapgolly.semanticUiSearch.SemanticUI.Search.ClassNameSettings
import typingsJapgolly.semanticUiSearch.SemanticUI.Search.ErrorSettings
import typingsJapgolly.semanticUiSearch.SemanticUI.Search.FieldsSettings
import typingsJapgolly.semanticUiSearch.SemanticUI.Search.MetadataSettings
import typingsJapgolly.semanticUiSearch.SemanticUI.Search.RegExpSettings
import typingsJapgolly.semanticUiSearch.SemanticUI.Search.SelectorSettings
import typingsJapgolly.semanticUiSearch.SemanticUI.Search.TemplatesSettings
import typingsJapgolly.semanticUiSearch.semanticUiSearchBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchSettings {
  
  trait Impl extends StObject {
    
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
      * Callback on server response
      */
    def onResults(response: Any): Unit
    
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
    def onSelect(result: Any, response: Any): `false` | Unit
    
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
    var source: `false` | Any
    
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
  }
  object Impl {
    
    inline def apply(
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
      onResults: Any => Callback,
      onResultsAdd: String => `false` | Unit,
      onResultsClose: Callback,
      onResultsOpen: Callback,
      onSearchQuery: String => Callback,
      onSelect: (Any, Any) => `false` | Unit,
      performance: Boolean,
      regExp: RegExpSettings,
      searchDelay: Double,
      searchFields: js.Array[String],
      searchFullText: Boolean,
      selectFirstResult: Boolean,
      selector: SelectorSettings,
      showNoResults: Boolean,
      silent: Boolean,
      source: `false` | Any,
      templates: TemplatesSettings,
      transition: String,
      `type`: String,
      verbose: Boolean
    ): Impl = {
      val __obj = js.Dynamic.literal(apiSettings = apiSettings.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], hideDelay = hideDelay.asInstanceOf[js.Any], maxResults = maxResults.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], minCharacters = minCharacters.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onResults = js.Any.fromFunction1((t0: Any) => onResults(t0).runNow()), onResultsAdd = js.Any.fromFunction1(onResultsAdd), onResultsClose = onResultsClose.toJsFn, onResultsOpen = onResultsOpen.toJsFn, onSearchQuery = js.Any.fromFunction1((t0: String) => onSearchQuery(t0).runNow()), onSelect = js.Any.fromFunction2(onSelect), performance = performance.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], searchDelay = searchDelay.asInstanceOf[js.Any], searchFields = searchFields.asInstanceOf[js.Any], searchFullText = searchFullText.asInstanceOf[js.Any], selectFirstResult = selectFirstResult.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], showNoResults = showNoResults.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Impl]
    }
    
    extension [Self <: Impl](x: Self) {
      
      inline def setApiSettings(value: ApiSettings): Self = StObject.set(x, "apiSettings", value.asInstanceOf[js.Any])
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFields(value: FieldsSettings): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMinCharacters(value: Double): Self = StObject.set(x, "minCharacters", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setOnResults(value: Any => Callback): Self = StObject.set(x, "onResults", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setOnResultsAdd(value: String => `false` | Unit): Self = StObject.set(x, "onResultsAdd", js.Any.fromFunction1(value))
      
      inline def setOnResultsClose(value: Callback): Self = StObject.set(x, "onResultsClose", value.toJsFn)
      
      inline def setOnResultsOpen(value: Callback): Self = StObject.set(x, "onResultsOpen", value.toJsFn)
      
      inline def setOnSearchQuery(value: String => Callback): Self = StObject.set(x, "onSearchQuery", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setOnSelect(value: (Any, Any) => `false` | Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
      
      inline def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
      
      inline def setSearchDelay(value: Double): Self = StObject.set(x, "searchDelay", value.asInstanceOf[js.Any])
      
      inline def setSearchFields(value: js.Array[String]): Self = StObject.set(x, "searchFields", value.asInstanceOf[js.Any])
      
      inline def setSearchFieldsVarargs(value: String*): Self = StObject.set(x, "searchFields", js.Array(value*))
      
      inline def setSearchFullText(value: Boolean): Self = StObject.set(x, "searchFullText", value.asInstanceOf[js.Any])
      
      inline def setSelectFirstResult(value: Boolean): Self = StObject.set(x, "selectFirstResult", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setShowNoResults(value: Boolean): Self = StObject.set(x, "showNoResults", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSource(value: `false` | Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTemplates(value: TemplatesSettings): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.semanticUiSearch.anon.PickImplapiSettingsPartia
    - typingsJapgolly.semanticUiSearch.anon.PickImpltypePartialPickIm
    - typingsJapgolly.semanticUiSearch.anon.PickImplminCharactersPart
    - typingsJapgolly.semanticUiSearch.anon.PickImpltransitionPartial
    - typingsJapgolly.semanticUiSearch.anon.PickImpldurationPartialPi
    - typingsJapgolly.semanticUiSearch.anon.PickImplmaxResultsPartial
    - typingsJapgolly.semanticUiSearch.anon.PickImplcachePartialPickI
    - typingsJapgolly.semanticUiSearch.anon.PickImplsourcePartialPick
    - typingsJapgolly.semanticUiSearch.anon.PickImplselectFirstResult
    - typingsJapgolly.semanticUiSearch.anon.PickImplshowNoResultsPart
    - typingsJapgolly.semanticUiSearch.anon.PickImplsearchFullTextPar
    - typingsJapgolly.semanticUiSearch.anon.PickImplfieldsPartialPick
    - typingsJapgolly.semanticUiSearch.anon.PickImplsearchFieldsParti
    - typingsJapgolly.semanticUiSearch.anon.PickImplhideDelayPartialP
    - typingsJapgolly.semanticUiSearch.anon.PickImplsearchDelayPartia
    - typingsJapgolly.semanticUiSearch.anon.PickImpleasingPartialPick
    - typingsJapgolly.semanticUiSearch.anon.PickImplonSelectPartialPi
    - typingsJapgolly.semanticUiSearch.anon.PickImplonResultsAddParti
    - typingsJapgolly.semanticUiSearch.anon.PickImplonSearchQueryPart
    - typingsJapgolly.semanticUiSearch.anon.PickImplonResultsPartialP
    - typingsJapgolly.semanticUiSearch.anon.PickImplonResultsOpenPart
    - typingsJapgolly.semanticUiSearch.anon.PickImplonResultsClosePar
    - typingsJapgolly.semanticUiSearch.anon.PickImpltemplatesPartialP
    - typingsJapgolly.semanticUiSearch.anon.PickImplregExpPartialPick
    - typingsJapgolly.semanticUiSearch.anon.PickImplselectorPartialPi
    - typingsJapgolly.semanticUiSearch.anon.PickImplmetadataPartialPi
    - typingsJapgolly.semanticUiSearch.anon.PickImplclassNamePartialP
    - typingsJapgolly.semanticUiSearch.anon.PickImplerrorPartialPickI
    - typingsJapgolly.semanticUiSearch.anon.PickImplnamespacePartialP
    - typingsJapgolly.semanticUiSearch.anon.PickImplnamePartialPickIm
    - typingsJapgolly.semanticUiSearch.anon.PickImplsilentPartialPick
    - typingsJapgolly.semanticUiSearch.anon.PickImpldebugPartialPickI
    - typingsJapgolly.semanticUiSearch.anon.PickImplperformancePartia
    - typingsJapgolly.semanticUiSearch.anon.PickImplverbosePartialPic
  */
  trait Param extends StObject
  object Param {
    
    inline def PickImplapiSettingsPartia(apiSettings: ApiSettings & js.UndefOr[ApiSettings]): typingsJapgolly.semanticUiSearch.anon.PickImplapiSettingsPartia = {
      val __obj = js.Dynamic.literal(apiSettings = apiSettings.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplapiSettingsPartia]
    }
    
    inline def PickImplcachePartialPickI(cache: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSearch.anon.PickImplcachePartialPickI = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplcachePartialPickI]
    }
    
    inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typingsJapgolly.semanticUiSearch.anon.PickImplclassNamePartialP = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplclassNamePartialP]
    }
    
    inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSearch.anon.PickImpldebugPartialPickI = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImpldebugPartialPickI]
    }
    
    inline def PickImpldurationPartialPi(duration: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiSearch.anon.PickImpldurationPartialPi = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImpldurationPartialPi]
    }
    
    inline def PickImpleasingPartialPick(easing: String & js.UndefOr[String]): typingsJapgolly.semanticUiSearch.anon.PickImpleasingPartialPick = {
      val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImpleasingPartialPick]
    }
    
    inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typingsJapgolly.semanticUiSearch.anon.PickImplerrorPartialPickI = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplerrorPartialPickI]
    }
    
    inline def PickImplfieldsPartialPick(fields: FieldsSettings & js.UndefOr[FieldsSettings]): typingsJapgolly.semanticUiSearch.anon.PickImplfieldsPartialPick = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplfieldsPartialPick]
    }
    
    inline def PickImplhideDelayPartialP(hideDelay: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiSearch.anon.PickImplhideDelayPartialP = {
      val __obj = js.Dynamic.literal(hideDelay = hideDelay.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplhideDelayPartialP]
    }
    
    inline def PickImplmaxResultsPartial(maxResults: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiSearch.anon.PickImplmaxResultsPartial = {
      val __obj = js.Dynamic.literal(maxResults = maxResults.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplmaxResultsPartial]
    }
    
    inline def PickImplmetadataPartialPi(metadata: MetadataSettings & js.UndefOr[MetadataSettings]): typingsJapgolly.semanticUiSearch.anon.PickImplmetadataPartialPi = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplmetadataPartialPi]
    }
    
    inline def PickImplminCharactersPart(minCharacters: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiSearch.anon.PickImplminCharactersPart = {
      val __obj = js.Dynamic.literal(minCharacters = minCharacters.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplminCharactersPart]
    }
    
    inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typingsJapgolly.semanticUiSearch.anon.PickImplnamePartialPickIm = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplnamePartialPickIm]
    }
    
    inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typingsJapgolly.semanticUiSearch.anon.PickImplnamespacePartialP = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplnamespacePartialP]
    }
    
    inline def PickImplonResultsAddParti(
      onResultsAdd: (js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit]])
    ): typingsJapgolly.semanticUiSearch.anon.PickImplonResultsAddParti = {
      val __obj = js.Dynamic.literal(onResultsAdd = onResultsAdd.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplonResultsAddParti]
    }
    
    inline def PickImplonResultsClosePar(
      onResultsClose: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
    ): typingsJapgolly.semanticUiSearch.anon.PickImplonResultsClosePar = {
      val __obj = js.Dynamic.literal(onResultsClose = onResultsClose.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplonResultsClosePar]
    }
    
    inline def PickImplonResultsOpenPart(
      onResultsOpen: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
    ): typingsJapgolly.semanticUiSearch.anon.PickImplonResultsOpenPart = {
      val __obj = js.Dynamic.literal(onResultsOpen = onResultsOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplonResultsOpenPart]
    }
    
    inline def PickImplonResultsPartialP(
      onResults: (js.ThisFunction1[/* this */ JQuery, /* response */ Any, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* response */ Any, Unit]])
    ): typingsJapgolly.semanticUiSearch.anon.PickImplonResultsPartialP = {
      val __obj = js.Dynamic.literal(onResults = onResults.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplonResultsPartialP]
    }
    
    inline def PickImplonSearchQueryPart(
      onSearchQuery: (js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit]])
    ): typingsJapgolly.semanticUiSearch.anon.PickImplonSearchQueryPart = {
      val __obj = js.Dynamic.literal(onSearchQuery = onSearchQuery.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplonSearchQueryPart]
    }
    
    inline def PickImplonSelectPartialPi(
      onSelect: (js.ThisFunction2[/* this */ JQuery, /* result */ Any, /* response */ Any, `false` | Unit]) & (js.UndefOr[
          js.ThisFunction2[/* this */ JQuery, /* result */ Any, /* response */ Any, `false` | Unit]
        ])
    ): typingsJapgolly.semanticUiSearch.anon.PickImplonSelectPartialPi = {
      val __obj = js.Dynamic.literal(onSelect = onSelect.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplonSelectPartialPi]
    }
    
    inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSearch.anon.PickImplperformancePartia = {
      val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplperformancePartia]
    }
    
    inline def PickImplregExpPartialPick(regExp: RegExpSettings & js.UndefOr[RegExpSettings]): typingsJapgolly.semanticUiSearch.anon.PickImplregExpPartialPick = {
      val __obj = js.Dynamic.literal(regExp = regExp.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplregExpPartialPick]
    }
    
    inline def PickImplsearchDelayPartia(searchDelay: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiSearch.anon.PickImplsearchDelayPartia = {
      val __obj = js.Dynamic.literal(searchDelay = searchDelay.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplsearchDelayPartia]
    }
    
    inline def PickImplsearchFieldsParti(searchFields: js.Array[String] & js.UndefOr[js.Array[String]]): typingsJapgolly.semanticUiSearch.anon.PickImplsearchFieldsParti = {
      val __obj = js.Dynamic.literal(searchFields = searchFields.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplsearchFieldsParti]
    }
    
    inline def PickImplsearchFullTextPar(searchFullText: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSearch.anon.PickImplsearchFullTextPar = {
      val __obj = js.Dynamic.literal(searchFullText = searchFullText.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplsearchFullTextPar]
    }
    
    inline def PickImplselectFirstResult(selectFirstResult: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSearch.anon.PickImplselectFirstResult = {
      val __obj = js.Dynamic.literal(selectFirstResult = selectFirstResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplselectFirstResult]
    }
    
    inline def PickImplselectorPartialPi(selector: SelectorSettings & js.UndefOr[SelectorSettings]): typingsJapgolly.semanticUiSearch.anon.PickImplselectorPartialPi = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplselectorPartialPi]
    }
    
    inline def PickImplshowNoResultsPart(showNoResults: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSearch.anon.PickImplshowNoResultsPart = {
      val __obj = js.Dynamic.literal(showNoResults = showNoResults.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplshowNoResultsPart]
    }
    
    inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSearch.anon.PickImplsilentPartialPick = {
      val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplsilentPartialPick]
    }
    
    inline def PickImplsourcePartialPick(source: (`false` | Any) & (js.UndefOr[`false` | Any])): typingsJapgolly.semanticUiSearch.anon.PickImplsourcePartialPick = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplsourcePartialPick]
    }
    
    inline def PickImpltemplatesPartialP(templates: TemplatesSettings & js.UndefOr[TemplatesSettings]): typingsJapgolly.semanticUiSearch.anon.PickImpltemplatesPartialP = {
      val __obj = js.Dynamic.literal(templates = templates.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImpltemplatesPartialP]
    }
    
    inline def PickImpltransitionPartial(transition: String & js.UndefOr[String]): typingsJapgolly.semanticUiSearch.anon.PickImpltransitionPartial = {
      val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImpltransitionPartial]
    }
    
    inline def PickImpltypePartialPickIm(`type`: String & js.UndefOr[String]): typingsJapgolly.semanticUiSearch.anon.PickImpltypePartialPickIm = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImpltypePartialPickIm]
    }
    
    inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSearch.anon.PickImplverbosePartialPic = {
      val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSearch.anon.PickImplverbosePartialPic]
    }
  }
}
