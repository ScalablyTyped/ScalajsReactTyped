package typingsJapgolly.sharepoint.Srch

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProvider
  extends StObject
     with ClientControl {
  
  def add_queryIssuing(value: Any): Unit
  
  def add_queryStateChanged(value: Any): Unit
  
  def add_resultReady(value: Any): Unit
  
  def displayControlMessages(): Unit
  
  def displayControl_QueryReady(sender: Any, e: Any): Unit
  
  def getSortName(): String
  
  def getSortRankName(): String
  
  def get_active(): Boolean
  
  def get_availableSorts(): Any
  
  def get_batched(): Boolean
  
  def get_bypassResultTypes(): Boolean
  
  def get_clientType(): String
  
  def get_collapseSpecification(): String
  
  def get_contextualScopeUrl(): String
  
  def get_currentQueryState(): Any
  
  def get_desiredSnippetLength(): Double
  
  def get_effectiveQueryLanguage(): Any
  
  def get_enableInterleaving(): Boolean
  
  def get_enableNicknames(): Boolean
  
  def get_enableOrderingHitHighlightedProperty(): Boolean
  
  def get_enablePhonetic(): Boolean
  
  def get_enableQueryRules(): Boolean
  
  def get_enableStemming(): Boolean
  
  def get_entityInfo(): Any
  
  def get_fallbackLanguage(): Any
  
  def get_fallbackRankingModelID(): String
  
  def get_fallbackRefinementFilters(): Any
  
  def get_fallbackSort(): Any
  
  def get_hitHighlightedMultivaluePropertyLimit(): Double
  
  def get_hitHighlightedProperties(): Any
  
  def get_initialQueryState(): Any
  
  def get_initialResult(): String
  
  def get_initialResultObject(): Any
  
  def get_initialResultRef(): Any
  
  def get_maxPagesAfterCurrent(): Double
  
  def get_parentImpressionID(): Any
  
  def get_personalizedQuery(): Boolean
  
  def get_processBestBets(): Boolean
  
  def get_processPersonalFavorites(): Boolean
  
  def get_properties(): Any
  
  def get_queryCount(): Double
  
  def get_queryGroupName(): String
  
  def get_queryPropertiesTemplateUrl(): String
  
  def get_queryTemplate(): Any
  
  def get_rankRules(): Any
  
  def get_refinementInfo(): StringDictionary[js.Array[RefinementInfo]]
  
  /** Number of results displayed per page. 10 by default */
  def get_resultsPerPage(): Double
  
  def get_resultsUrl(): Any
  
  def get_rowCount(): Double
  
  def get_selectedProperties(): Any
  
  def get_selectedRefiners(): Any
  
  def get_sourceID(): String
  
  def get_sourceLevel(): String
  
  def get_sourceName(): String
  
  def get_summaryLength(): Double
  
  def get_totalRows(): Double
  
  def get_trimDuplicates(): Boolean
  
  def get_upScopeUrl(): Any
  
  def get_updateAjaxNavigate(): Boolean
  
  def get_userAction(): Any
  
  def issueQuery(): Unit
  
  def processInitial(): Unit
  
  def raiseEmptyResultReadyEvent(): Unit
  
  def raiseQueryIssuingEvent(arg: Any): Unit
  
  def raiseQueryStateChangedEvent(arg: Any): Unit
  
  def raiseResultReadyEvent(arg: Any): Unit
  
  def remove_queryIssuing(value: Any): Unit
  
  def remove_resultReady(value: Any): Unit
  
  def searchBox_BatchQueryIssuing(sender: Any, e: Any): Unit
  
  def searchBox_BatchResultReady(sender: Any, e: Any): Unit
  
  def searchBox_QueryReady(sender: Any, e: Any): Unit
  
  def set_active(value: Boolean): Boolean
  
  def set_availableSorts(value: Any): Any
  
  def set_batched(value: Boolean): Boolean
  
  def set_bypassResultTypes(value: Boolean): Boolean
  
  def set_clientType(value: String): String
  
  def set_collapseSpecification(value: String): String
  
  def set_contextualScopeUrl(value: String): String
  
  def set_desiredSnippetLength(value: Double): Double
  
  def set_enableInterleaving(value: Boolean): Boolean
  
  def set_enableNicknames(value: Boolean): Boolean
  
  def set_enableOrderingHitHighlightedProperty(value: Boolean): Boolean
  
  def set_enablePhonetic(value: Boolean): Boolean
  
  def set_enableQueryRules(value: Boolean): Boolean
  
  def set_enableStemming(value: Boolean): Boolean
  
  def set_fallbackLanguage(value: Any): Any
  
  def set_fallbackRankingModelID(value: String): String
  
  def set_fallbackRefinementFilters(value: Any): Any
  
  def set_fallbackSort(value: Any): Any
  
  def set_hitHighlightedMultivaluePropertyLimit(value: Double): Double
  
  def set_hitHighlightedProperties(value: Any): Any
  
  def set_initialQueryState(value: Any): Any
  
  def set_initialResult(value: String): String
  
  def set_initialResultRef(value: Any): Any
  
  def set_maxPagesAfterCurrent(value: Double): Double
  
  def set_parentImpressionID(value: Any): Any
  
  def set_personalizedQuery(value: Boolean): Boolean
  
  def set_processBestBets(value: Boolean): Boolean
  
  def set_processPersonalFavorites(value: Boolean): Boolean
  
  def set_properties(value: Any): Any
  
  def set_queryCount(value: Double): Double
  
  def set_queryGroupName(value: String): String
  
  def set_queryPropertiesTemplateUrl(value: String): String
  
  def set_queryTemplate(value: Any): Any
  
  def set_rankRules(value: Any): Any
  
  /** Number of results displayed per page. 10 by default */
  def set_resultsPerPage(value: Double): Double
  
  def set_resultsUrl(value: Any): Any
  
  def set_rowCount(value: Double): Double
  
  def set_selectedProperties(value: Any): Any
  
  def set_selectedRefiners(value: Any): Any
  
  def set_sourceID(value: String): String
  
  def set_sourceLevel(value: String): String
  
  def set_sourceName(value: String): String
  
  def set_summaryLength(value: Double): Double
  
  def set_totalRows(value: Double): Double
  
  def set_trimDuplicates(value: Boolean): Boolean
  
  def set_updateAjaxNavigate(value: Boolean): Boolean
  
  def set_userAction(value: Any): Any
}
object DataProvider {
  
  inline def apply(
    addCssClass: String => Callback,
    add_disposing: js.Function => Callback,
    add_propertyChanged: js.Function => Callback,
    add_queryIssuing: Any => Callback,
    add_queryStateChanged: Any => Callback,
    add_resultReady: Any => Callback,
    alternateRenderContext: Any,
    alternateRenderer: Any,
    beginUpdate: Callback,
    clickHandler: Event => Any,
    displayControlMessages: Callback,
    displayControl_QueryReady: (Any, Any) => Callback,
    dispose: Callback,
    endUpdate: Callback,
    getSortName: CallbackTo[String],
    getSortRankName: CallbackTo[String],
    get_active: CallbackTo[Boolean],
    get_alternateErrorMessage: CallbackTo[String],
    get_availableSorts: CallbackTo[Any],
    get_batched: CallbackTo[Boolean],
    get_bypassResultTypes: CallbackTo[Boolean],
    get_clientType: CallbackTo[String],
    get_collapseSpecification: CallbackTo[String],
    get_contextualScopeUrl: CallbackTo[String],
    get_currentQueryState: CallbackTo[Any],
    get_delayLoadTemplateScripts: CallbackTo[Boolean],
    get_desiredSnippetLength: CallbackTo[Double],
    get_effectiveQueryLanguage: CallbackTo[Any],
    get_element: CallbackTo[HTMLElement],
    get_enableInterleaving: CallbackTo[Boolean],
    get_enableNicknames: CallbackTo[Boolean],
    get_enableOrderingHitHighlightedProperty: CallbackTo[Boolean],
    get_enablePhonetic: CallbackTo[Boolean],
    get_enableQueryRules: CallbackTo[Boolean],
    get_enableStemming: CallbackTo[Boolean],
    get_entityInfo: CallbackTo[Any],
    get_events: CallbackTo[Any],
    get_fallbackLanguage: CallbackTo[Any],
    get_fallbackRankingModelID: CallbackTo[String],
    get_fallbackRefinementFilters: CallbackTo[Any],
    get_fallbackSort: CallbackTo[Any],
    get_hitHighlightedMultivaluePropertyLimit: CallbackTo[Double],
    get_hitHighlightedProperties: CallbackTo[Any],
    get_id: CallbackTo[String],
    get_initialQueryState: CallbackTo[Any],
    get_initialResult: CallbackTo[String],
    get_initialResultObject: CallbackTo[Any],
    get_initialResultRef: CallbackTo[Any],
    get_isInitialLoad: CallbackTo[Boolean],
    get_isInitialized: CallbackTo[Boolean],
    get_isUpdating: CallbackTo[Boolean],
    get_maxPagesAfterCurrent: CallbackTo[Double],
    get_messages: CallbackTo[js.Array[Any]],
    get_nextUniqueId: CallbackTo[String],
    get_parentImpressionID: CallbackTo[Any],
    get_personalizedQuery: CallbackTo[Boolean],
    get_processBestBets: CallbackTo[Boolean],
    get_processPersonalFavorites: CallbackTo[Boolean],
    get_properties: CallbackTo[Any],
    get_queryCount: CallbackTo[Double],
    get_queryGroupName: CallbackTo[String],
    get_queryPropertiesTemplateUrl: CallbackTo[String],
    get_queryTemplate: CallbackTo[Any],
    get_rankRules: CallbackTo[Any],
    get_refinementInfo: CallbackTo[StringDictionary[js.Array[RefinementInfo]]],
    get_renderTemplateId: CallbackTo[String],
    get_resultsPerPage: CallbackTo[Double],
    get_resultsUrl: CallbackTo[Any],
    get_rowCount: CallbackTo[Double],
    get_selectedProperties: CallbackTo[Any],
    get_selectedRefiners: CallbackTo[Any],
    get_showDataErrors: CallbackTo[Boolean],
    get_sourceID: CallbackTo[String],
    get_sourceLevel: CallbackTo[String],
    get_sourceName: CallbackTo[String],
    get_states: CallbackTo[Any],
    get_summaryLength: CallbackTo[Double],
    get_totalRows: CallbackTo[Double],
    get_trimDuplicates: CallbackTo[Boolean],
    get_upScopeUrl: CallbackTo[Any],
    get_updateAjaxNavigate: CallbackTo[Boolean],
    get_userAction: CallbackTo[Any],
    hasMessages: CallbackTo[Any],
    initialize: Callback,
    invokeAlternateRender: (Any, Any, Any) => Any,
    invokeClientRenderer: (Any, Any) => Any,
    issueQuery: Callback,
    loadRenderTemplateScripts: (Any, Any, Any, Any, Any) => Boolean,
    loadServerTemplateScripts: Callback,
    loaded: Boolean,
    onBubbleEvent: (Any, Any) => Boolean,
    processDataErrorMessages: Any => Any,
    processDataProviderErrors: Any => Callback,
    processInitial: Callback,
    processRenderingErrorMessages: Any => Any,
    raiseBubbleEvent: (Any, Any) => Callback,
    raiseEmptyResultReadyEvent: Callback,
    raisePropertyChanged: String => Callback,
    raiseQueryIssuingEvent: Any => Callback,
    raiseQueryStateChangedEvent: Any => Callback,
    raiseResultReadyEvent: Any => Callback,
    removeCssClass: String => Callback,
    remove_disposing: js.Function => Callback,
    remove_propertyChanged: js.Function => Callback,
    remove_queryIssuing: Any => Callback,
    remove_resultReady: Any => Callback,
    renderControl: (Any, Any) => Callback,
    scriptApplication_Load: (Any, Any) => Callback,
    scriptApplication_PostLoad: (Any, Any) => Callback,
    scriptApplication_PreLoad: (Any, Any) => Callback,
    searchBox_BatchQueryIssuing: (Any, Any) => Callback,
    searchBox_BatchResultReady: (Any, Any) => Callback,
    searchBox_QueryReady: (Any, Any) => Callback,
    serverTemplateScriptsCallback: Callback,
    serverTemplateScriptsToLoad: js.Array[Any],
    setControlElementVisibility: Boolean => Any,
    set_active: Boolean => Boolean,
    set_alternateErrorMessage: String => String,
    set_availableSorts: Any => Any,
    set_batched: Boolean => Boolean,
    set_bypassResultTypes: Boolean => Boolean,
    set_clientType: String => String,
    set_collapseSpecification: String => String,
    set_contextualScopeUrl: String => String,
    set_delayLoadTemplateScripts: Boolean => Boolean,
    set_desiredSnippetLength: Double => Double,
    set_enableInterleaving: Boolean => Boolean,
    set_enableNicknames: Boolean => Boolean,
    set_enableOrderingHitHighlightedProperty: Boolean => Boolean,
    set_enablePhonetic: Boolean => Boolean,
    set_enableQueryRules: Boolean => Boolean,
    set_enableStemming: Boolean => Boolean,
    set_fallbackLanguage: Any => Any,
    set_fallbackRankingModelID: String => String,
    set_fallbackRefinementFilters: Any => Any,
    set_fallbackSort: Any => Any,
    set_hitHighlightedMultivaluePropertyLimit: Double => Double,
    set_hitHighlightedProperties: Any => Any,
    set_id: String => Callback,
    set_initialQueryState: Any => Any,
    set_initialResult: String => String,
    set_initialResultRef: Any => Any,
    set_maxPagesAfterCurrent: Double => Double,
    set_messages: js.Array[Any] => js.Array[Any],
    set_parentImpressionID: Any => Any,
    set_personalizedQuery: Boolean => Boolean,
    set_processBestBets: Boolean => Boolean,
    set_processPersonalFavorites: Boolean => Boolean,
    set_properties: Any => Any,
    set_queryCount: Double => Double,
    set_queryGroupName: String => String,
    set_queryPropertiesTemplateUrl: String => String,
    set_queryTemplate: Any => Any,
    set_rankRules: Any => Any,
    set_renderTemplateId: String => String,
    set_resultsPerPage: Double => Double,
    set_resultsUrl: Any => Any,
    set_rowCount: Double => Double,
    set_selectedProperties: Any => Any,
    set_selectedRefiners: Any => Any,
    set_showDataErrors: Boolean => Boolean,
    set_sourceID: String => String,
    set_sourceLevel: String => String,
    set_sourceName: String => String,
    set_states: Any => Any,
    set_summaryLength: Double => Double,
    set_totalRows: Double => Double,
    set_trimDuplicates: Boolean => Boolean,
    set_updateAjaxNavigate: Boolean => Boolean,
    set_userAction: Any => Any,
    toggleCssClass: String => Callback,
    updateDisplayControlWithNewMessages: CallbackTo[Any],
    updated: Callback
  ): DataProvider = {
    val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1((t0: String) => addCssClass(t0).runNow()), add_disposing = js.Any.fromFunction1((t0: js.Function) => add_disposing(t0).runNow()), add_propertyChanged = js.Any.fromFunction1((t0: js.Function) => add_propertyChanged(t0).runNow()), add_queryIssuing = js.Any.fromFunction1((t0: Any) => add_queryIssuing(t0).runNow()), add_queryStateChanged = js.Any.fromFunction1((t0: Any) => add_queryStateChanged(t0).runNow()), add_resultReady = js.Any.fromFunction1((t0: Any) => add_resultReady(t0).runNow()), alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], beginUpdate = beginUpdate.toJsFn, clickHandler = js.Any.fromFunction1(clickHandler), displayControlMessages = displayControlMessages.toJsFn, displayControl_QueryReady = js.Any.fromFunction2((t0: Any, t1: Any) => (displayControl_QueryReady(t0, t1)).runNow()), dispose = dispose.toJsFn, endUpdate = endUpdate.toJsFn, getSortName = getSortName.toJsFn, getSortRankName = getSortRankName.toJsFn, get_active = get_active.toJsFn, get_alternateErrorMessage = get_alternateErrorMessage.toJsFn, get_availableSorts = get_availableSorts.toJsFn, get_batched = get_batched.toJsFn, get_bypassResultTypes = get_bypassResultTypes.toJsFn, get_clientType = get_clientType.toJsFn, get_collapseSpecification = get_collapseSpecification.toJsFn, get_contextualScopeUrl = get_contextualScopeUrl.toJsFn, get_currentQueryState = get_currentQueryState.toJsFn, get_delayLoadTemplateScripts = get_delayLoadTemplateScripts.toJsFn, get_desiredSnippetLength = get_desiredSnippetLength.toJsFn, get_effectiveQueryLanguage = get_effectiveQueryLanguage.toJsFn, get_element = get_element.toJsFn, get_enableInterleaving = get_enableInterleaving.toJsFn, get_enableNicknames = get_enableNicknames.toJsFn, get_enableOrderingHitHighlightedProperty = get_enableOrderingHitHighlightedProperty.toJsFn, get_enablePhonetic = get_enablePhonetic.toJsFn, get_enableQueryRules = get_enableQueryRules.toJsFn, get_enableStemming = get_enableStemming.toJsFn, get_entityInfo = get_entityInfo.toJsFn, get_events = get_events.toJsFn, get_fallbackLanguage = get_fallbackLanguage.toJsFn, get_fallbackRankingModelID = get_fallbackRankingModelID.toJsFn, get_fallbackRefinementFilters = get_fallbackRefinementFilters.toJsFn, get_fallbackSort = get_fallbackSort.toJsFn, get_hitHighlightedMultivaluePropertyLimit = get_hitHighlightedMultivaluePropertyLimit.toJsFn, get_hitHighlightedProperties = get_hitHighlightedProperties.toJsFn, get_id = get_id.toJsFn, get_initialQueryState = get_initialQueryState.toJsFn, get_initialResult = get_initialResult.toJsFn, get_initialResultObject = get_initialResultObject.toJsFn, get_initialResultRef = get_initialResultRef.toJsFn, get_isInitialLoad = get_isInitialLoad.toJsFn, get_isInitialized = get_isInitialized.toJsFn, get_isUpdating = get_isUpdating.toJsFn, get_maxPagesAfterCurrent = get_maxPagesAfterCurrent.toJsFn, get_messages = get_messages.toJsFn, get_nextUniqueId = get_nextUniqueId.toJsFn, get_parentImpressionID = get_parentImpressionID.toJsFn, get_personalizedQuery = get_personalizedQuery.toJsFn, get_processBestBets = get_processBestBets.toJsFn, get_processPersonalFavorites = get_processPersonalFavorites.toJsFn, get_properties = get_properties.toJsFn, get_queryCount = get_queryCount.toJsFn, get_queryGroupName = get_queryGroupName.toJsFn, get_queryPropertiesTemplateUrl = get_queryPropertiesTemplateUrl.toJsFn, get_queryTemplate = get_queryTemplate.toJsFn, get_rankRules = get_rankRules.toJsFn, get_refinementInfo = get_refinementInfo.toJsFn, get_renderTemplateId = get_renderTemplateId.toJsFn, get_resultsPerPage = get_resultsPerPage.toJsFn, get_resultsUrl = get_resultsUrl.toJsFn, get_rowCount = get_rowCount.toJsFn, get_selectedProperties = get_selectedProperties.toJsFn, get_selectedRefiners = get_selectedRefiners.toJsFn, get_showDataErrors = get_showDataErrors.toJsFn, get_sourceID = get_sourceID.toJsFn, get_sourceLevel = get_sourceLevel.toJsFn, get_sourceName = get_sourceName.toJsFn, get_states = get_states.toJsFn, get_summaryLength = get_summaryLength.toJsFn, get_totalRows = get_totalRows.toJsFn, get_trimDuplicates = get_trimDuplicates.toJsFn, get_upScopeUrl = get_upScopeUrl.toJsFn, get_updateAjaxNavigate = get_updateAjaxNavigate.toJsFn, get_userAction = get_userAction.toJsFn, hasMessages = hasMessages.toJsFn, initialize = initialize.toJsFn, invokeAlternateRender = js.Any.fromFunction3(invokeAlternateRender), invokeClientRenderer = js.Any.fromFunction2(invokeClientRenderer), issueQuery = issueQuery.toJsFn, loadRenderTemplateScripts = js.Any.fromFunction5(loadRenderTemplateScripts), loadServerTemplateScripts = loadServerTemplateScripts.toJsFn, loaded = loaded.asInstanceOf[js.Any], onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), processDataErrorMessages = js.Any.fromFunction1(processDataErrorMessages), processDataProviderErrors = js.Any.fromFunction1((t0: Any) => processDataProviderErrors(t0).runNow()), processInitial = processInitial.toJsFn, processRenderingErrorMessages = js.Any.fromFunction1(processRenderingErrorMessages), raiseBubbleEvent = js.Any.fromFunction2((t0: Any, t1: Any) => (raiseBubbleEvent(t0, t1)).runNow()), raiseEmptyResultReadyEvent = raiseEmptyResultReadyEvent.toJsFn, raisePropertyChanged = js.Any.fromFunction1((t0: String) => raisePropertyChanged(t0).runNow()), raiseQueryIssuingEvent = js.Any.fromFunction1((t0: Any) => raiseQueryIssuingEvent(t0).runNow()), raiseQueryStateChangedEvent = js.Any.fromFunction1((t0: Any) => raiseQueryStateChangedEvent(t0).runNow()), raiseResultReadyEvent = js.Any.fromFunction1((t0: Any) => raiseResultReadyEvent(t0).runNow()), removeCssClass = js.Any.fromFunction1((t0: String) => removeCssClass(t0).runNow()), remove_disposing = js.Any.fromFunction1((t0: js.Function) => remove_disposing(t0).runNow()), remove_propertyChanged = js.Any.fromFunction1((t0: js.Function) => remove_propertyChanged(t0).runNow()), remove_queryIssuing = js.Any.fromFunction1((t0: Any) => remove_queryIssuing(t0).runNow()), remove_resultReady = js.Any.fromFunction1((t0: Any) => remove_resultReady(t0).runNow()), renderControl = js.Any.fromFunction2((t0: Any, t1: Any) => (renderControl(t0, t1)).runNow()), scriptApplication_Load = js.Any.fromFunction2((t0: Any, t1: Any) => (scriptApplication_Load(t0, t1)).runNow()), scriptApplication_PostLoad = js.Any.fromFunction2((t0: Any, t1: Any) => (scriptApplication_PostLoad(t0, t1)).runNow()), scriptApplication_PreLoad = js.Any.fromFunction2((t0: Any, t1: Any) => (scriptApplication_PreLoad(t0, t1)).runNow()), searchBox_BatchQueryIssuing = js.Any.fromFunction2((t0: Any, t1: Any) => (searchBox_BatchQueryIssuing(t0, t1)).runNow()), searchBox_BatchResultReady = js.Any.fromFunction2((t0: Any, t1: Any) => (searchBox_BatchResultReady(t0, t1)).runNow()), searchBox_QueryReady = js.Any.fromFunction2((t0: Any, t1: Any) => (searchBox_QueryReady(t0, t1)).runNow()), serverTemplateScriptsCallback = serverTemplateScriptsCallback.toJsFn, serverTemplateScriptsToLoad = serverTemplateScriptsToLoad.asInstanceOf[js.Any], setControlElementVisibility = js.Any.fromFunction1(setControlElementVisibility), set_active = js.Any.fromFunction1(set_active), set_alternateErrorMessage = js.Any.fromFunction1(set_alternateErrorMessage), set_availableSorts = js.Any.fromFunction1(set_availableSorts), set_batched = js.Any.fromFunction1(set_batched), set_bypassResultTypes = js.Any.fromFunction1(set_bypassResultTypes), set_clientType = js.Any.fromFunction1(set_clientType), set_collapseSpecification = js.Any.fromFunction1(set_collapseSpecification), set_contextualScopeUrl = js.Any.fromFunction1(set_contextualScopeUrl), set_delayLoadTemplateScripts = js.Any.fromFunction1(set_delayLoadTemplateScripts), set_desiredSnippetLength = js.Any.fromFunction1(set_desiredSnippetLength), set_enableInterleaving = js.Any.fromFunction1(set_enableInterleaving), set_enableNicknames = js.Any.fromFunction1(set_enableNicknames), set_enableOrderingHitHighlightedProperty = js.Any.fromFunction1(set_enableOrderingHitHighlightedProperty), set_enablePhonetic = js.Any.fromFunction1(set_enablePhonetic), set_enableQueryRules = js.Any.fromFunction1(set_enableQueryRules), set_enableStemming = js.Any.fromFunction1(set_enableStemming), set_fallbackLanguage = js.Any.fromFunction1(set_fallbackLanguage), set_fallbackRankingModelID = js.Any.fromFunction1(set_fallbackRankingModelID), set_fallbackRefinementFilters = js.Any.fromFunction1(set_fallbackRefinementFilters), set_fallbackSort = js.Any.fromFunction1(set_fallbackSort), set_hitHighlightedMultivaluePropertyLimit = js.Any.fromFunction1(set_hitHighlightedMultivaluePropertyLimit), set_hitHighlightedProperties = js.Any.fromFunction1(set_hitHighlightedProperties), set_id = js.Any.fromFunction1((t0: String) => set_id(t0).runNow()), set_initialQueryState = js.Any.fromFunction1(set_initialQueryState), set_initialResult = js.Any.fromFunction1(set_initialResult), set_initialResultRef = js.Any.fromFunction1(set_initialResultRef), set_maxPagesAfterCurrent = js.Any.fromFunction1(set_maxPagesAfterCurrent), set_messages = js.Any.fromFunction1(set_messages), set_parentImpressionID = js.Any.fromFunction1(set_parentImpressionID), set_personalizedQuery = js.Any.fromFunction1(set_personalizedQuery), set_processBestBets = js.Any.fromFunction1(set_processBestBets), set_processPersonalFavorites = js.Any.fromFunction1(set_processPersonalFavorites), set_properties = js.Any.fromFunction1(set_properties), set_queryCount = js.Any.fromFunction1(set_queryCount), set_queryGroupName = js.Any.fromFunction1(set_queryGroupName), set_queryPropertiesTemplateUrl = js.Any.fromFunction1(set_queryPropertiesTemplateUrl), set_queryTemplate = js.Any.fromFunction1(set_queryTemplate), set_rankRules = js.Any.fromFunction1(set_rankRules), set_renderTemplateId = js.Any.fromFunction1(set_renderTemplateId), set_resultsPerPage = js.Any.fromFunction1(set_resultsPerPage), set_resultsUrl = js.Any.fromFunction1(set_resultsUrl), set_rowCount = js.Any.fromFunction1(set_rowCount), set_selectedProperties = js.Any.fromFunction1(set_selectedProperties), set_selectedRefiners = js.Any.fromFunction1(set_selectedRefiners), set_showDataErrors = js.Any.fromFunction1(set_showDataErrors), set_sourceID = js.Any.fromFunction1(set_sourceID), set_sourceLevel = js.Any.fromFunction1(set_sourceLevel), set_sourceName = js.Any.fromFunction1(set_sourceName), set_states = js.Any.fromFunction1(set_states), set_summaryLength = js.Any.fromFunction1(set_summaryLength), set_totalRows = js.Any.fromFunction1(set_totalRows), set_trimDuplicates = js.Any.fromFunction1(set_trimDuplicates), set_updateAjaxNavigate = js.Any.fromFunction1(set_updateAjaxNavigate), set_userAction = js.Any.fromFunction1(set_userAction), toggleCssClass = js.Any.fromFunction1((t0: String) => toggleCssClass(t0).runNow()), updateDisplayControlWithNewMessages = updateDisplayControlWithNewMessages.toJsFn, updated = updated.toJsFn)
    __obj.asInstanceOf[DataProvider]
  }
  
  extension [Self <: DataProvider](x: Self) {
    
    inline def setAdd_queryIssuing(value: Any => Callback): Self = StObject.set(x, "add_queryIssuing", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setAdd_queryStateChanged(value: Any => Callback): Self = StObject.set(x, "add_queryStateChanged", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setAdd_resultReady(value: Any => Callback): Self = StObject.set(x, "add_resultReady", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setDisplayControlMessages(value: Callback): Self = StObject.set(x, "displayControlMessages", value.toJsFn)
    
    inline def setDisplayControl_QueryReady(value: (Any, Any) => Callback): Self = StObject.set(x, "displayControl_QueryReady", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setGetSortName(value: CallbackTo[String]): Self = StObject.set(x, "getSortName", value.toJsFn)
    
    inline def setGetSortRankName(value: CallbackTo[String]): Self = StObject.set(x, "getSortRankName", value.toJsFn)
    
    inline def setGet_active(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_active", value.toJsFn)
    
    inline def setGet_availableSorts(value: CallbackTo[Any]): Self = StObject.set(x, "get_availableSorts", value.toJsFn)
    
    inline def setGet_batched(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_batched", value.toJsFn)
    
    inline def setGet_bypassResultTypes(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_bypassResultTypes", value.toJsFn)
    
    inline def setGet_clientType(value: CallbackTo[String]): Self = StObject.set(x, "get_clientType", value.toJsFn)
    
    inline def setGet_collapseSpecification(value: CallbackTo[String]): Self = StObject.set(x, "get_collapseSpecification", value.toJsFn)
    
    inline def setGet_contextualScopeUrl(value: CallbackTo[String]): Self = StObject.set(x, "get_contextualScopeUrl", value.toJsFn)
    
    inline def setGet_currentQueryState(value: CallbackTo[Any]): Self = StObject.set(x, "get_currentQueryState", value.toJsFn)
    
    inline def setGet_desiredSnippetLength(value: CallbackTo[Double]): Self = StObject.set(x, "get_desiredSnippetLength", value.toJsFn)
    
    inline def setGet_effectiveQueryLanguage(value: CallbackTo[Any]): Self = StObject.set(x, "get_effectiveQueryLanguage", value.toJsFn)
    
    inline def setGet_enableInterleaving(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_enableInterleaving", value.toJsFn)
    
    inline def setGet_enableNicknames(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_enableNicknames", value.toJsFn)
    
    inline def setGet_enableOrderingHitHighlightedProperty(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_enableOrderingHitHighlightedProperty", value.toJsFn)
    
    inline def setGet_enablePhonetic(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_enablePhonetic", value.toJsFn)
    
    inline def setGet_enableQueryRules(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_enableQueryRules", value.toJsFn)
    
    inline def setGet_enableStemming(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_enableStemming", value.toJsFn)
    
    inline def setGet_entityInfo(value: CallbackTo[Any]): Self = StObject.set(x, "get_entityInfo", value.toJsFn)
    
    inline def setGet_fallbackLanguage(value: CallbackTo[Any]): Self = StObject.set(x, "get_fallbackLanguage", value.toJsFn)
    
    inline def setGet_fallbackRankingModelID(value: CallbackTo[String]): Self = StObject.set(x, "get_fallbackRankingModelID", value.toJsFn)
    
    inline def setGet_fallbackRefinementFilters(value: CallbackTo[Any]): Self = StObject.set(x, "get_fallbackRefinementFilters", value.toJsFn)
    
    inline def setGet_fallbackSort(value: CallbackTo[Any]): Self = StObject.set(x, "get_fallbackSort", value.toJsFn)
    
    inline def setGet_hitHighlightedMultivaluePropertyLimit(value: CallbackTo[Double]): Self = StObject.set(x, "get_hitHighlightedMultivaluePropertyLimit", value.toJsFn)
    
    inline def setGet_hitHighlightedProperties(value: CallbackTo[Any]): Self = StObject.set(x, "get_hitHighlightedProperties", value.toJsFn)
    
    inline def setGet_initialQueryState(value: CallbackTo[Any]): Self = StObject.set(x, "get_initialQueryState", value.toJsFn)
    
    inline def setGet_initialResult(value: CallbackTo[String]): Self = StObject.set(x, "get_initialResult", value.toJsFn)
    
    inline def setGet_initialResultObject(value: CallbackTo[Any]): Self = StObject.set(x, "get_initialResultObject", value.toJsFn)
    
    inline def setGet_initialResultRef(value: CallbackTo[Any]): Self = StObject.set(x, "get_initialResultRef", value.toJsFn)
    
    inline def setGet_maxPagesAfterCurrent(value: CallbackTo[Double]): Self = StObject.set(x, "get_maxPagesAfterCurrent", value.toJsFn)
    
    inline def setGet_parentImpressionID(value: CallbackTo[Any]): Self = StObject.set(x, "get_parentImpressionID", value.toJsFn)
    
    inline def setGet_personalizedQuery(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_personalizedQuery", value.toJsFn)
    
    inline def setGet_processBestBets(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_processBestBets", value.toJsFn)
    
    inline def setGet_processPersonalFavorites(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_processPersonalFavorites", value.toJsFn)
    
    inline def setGet_properties(value: CallbackTo[Any]): Self = StObject.set(x, "get_properties", value.toJsFn)
    
    inline def setGet_queryCount(value: CallbackTo[Double]): Self = StObject.set(x, "get_queryCount", value.toJsFn)
    
    inline def setGet_queryGroupName(value: CallbackTo[String]): Self = StObject.set(x, "get_queryGroupName", value.toJsFn)
    
    inline def setGet_queryPropertiesTemplateUrl(value: CallbackTo[String]): Self = StObject.set(x, "get_queryPropertiesTemplateUrl", value.toJsFn)
    
    inline def setGet_queryTemplate(value: CallbackTo[Any]): Self = StObject.set(x, "get_queryTemplate", value.toJsFn)
    
    inline def setGet_rankRules(value: CallbackTo[Any]): Self = StObject.set(x, "get_rankRules", value.toJsFn)
    
    inline def setGet_refinementInfo(value: CallbackTo[StringDictionary[js.Array[RefinementInfo]]]): Self = StObject.set(x, "get_refinementInfo", value.toJsFn)
    
    inline def setGet_resultsPerPage(value: CallbackTo[Double]): Self = StObject.set(x, "get_resultsPerPage", value.toJsFn)
    
    inline def setGet_resultsUrl(value: CallbackTo[Any]): Self = StObject.set(x, "get_resultsUrl", value.toJsFn)
    
    inline def setGet_rowCount(value: CallbackTo[Double]): Self = StObject.set(x, "get_rowCount", value.toJsFn)
    
    inline def setGet_selectedProperties(value: CallbackTo[Any]): Self = StObject.set(x, "get_selectedProperties", value.toJsFn)
    
    inline def setGet_selectedRefiners(value: CallbackTo[Any]): Self = StObject.set(x, "get_selectedRefiners", value.toJsFn)
    
    inline def setGet_sourceID(value: CallbackTo[String]): Self = StObject.set(x, "get_sourceID", value.toJsFn)
    
    inline def setGet_sourceLevel(value: CallbackTo[String]): Self = StObject.set(x, "get_sourceLevel", value.toJsFn)
    
    inline def setGet_sourceName(value: CallbackTo[String]): Self = StObject.set(x, "get_sourceName", value.toJsFn)
    
    inline def setGet_summaryLength(value: CallbackTo[Double]): Self = StObject.set(x, "get_summaryLength", value.toJsFn)
    
    inline def setGet_totalRows(value: CallbackTo[Double]): Self = StObject.set(x, "get_totalRows", value.toJsFn)
    
    inline def setGet_trimDuplicates(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_trimDuplicates", value.toJsFn)
    
    inline def setGet_upScopeUrl(value: CallbackTo[Any]): Self = StObject.set(x, "get_upScopeUrl", value.toJsFn)
    
    inline def setGet_updateAjaxNavigate(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_updateAjaxNavigate", value.toJsFn)
    
    inline def setGet_userAction(value: CallbackTo[Any]): Self = StObject.set(x, "get_userAction", value.toJsFn)
    
    inline def setIssueQuery(value: Callback): Self = StObject.set(x, "issueQuery", value.toJsFn)
    
    inline def setProcessInitial(value: Callback): Self = StObject.set(x, "processInitial", value.toJsFn)
    
    inline def setRaiseEmptyResultReadyEvent(value: Callback): Self = StObject.set(x, "raiseEmptyResultReadyEvent", value.toJsFn)
    
    inline def setRaiseQueryIssuingEvent(value: Any => Callback): Self = StObject.set(x, "raiseQueryIssuingEvent", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRaiseQueryStateChangedEvent(value: Any => Callback): Self = StObject.set(x, "raiseQueryStateChangedEvent", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRaiseResultReadyEvent(value: Any => Callback): Self = StObject.set(x, "raiseResultReadyEvent", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRemove_queryIssuing(value: Any => Callback): Self = StObject.set(x, "remove_queryIssuing", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRemove_resultReady(value: Any => Callback): Self = StObject.set(x, "remove_resultReady", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSearchBox_BatchQueryIssuing(value: (Any, Any) => Callback): Self = StObject.set(x, "searchBox_BatchQueryIssuing", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSearchBox_BatchResultReady(value: (Any, Any) => Callback): Self = StObject.set(x, "searchBox_BatchResultReady", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSearchBox_QueryReady(value: (Any, Any) => Callback): Self = StObject.set(x, "searchBox_QueryReady", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSet_active(value: Boolean => Boolean): Self = StObject.set(x, "set_active", js.Any.fromFunction1(value))
    
    inline def setSet_availableSorts(value: Any => Any): Self = StObject.set(x, "set_availableSorts", js.Any.fromFunction1(value))
    
    inline def setSet_batched(value: Boolean => Boolean): Self = StObject.set(x, "set_batched", js.Any.fromFunction1(value))
    
    inline def setSet_bypassResultTypes(value: Boolean => Boolean): Self = StObject.set(x, "set_bypassResultTypes", js.Any.fromFunction1(value))
    
    inline def setSet_clientType(value: String => String): Self = StObject.set(x, "set_clientType", js.Any.fromFunction1(value))
    
    inline def setSet_collapseSpecification(value: String => String): Self = StObject.set(x, "set_collapseSpecification", js.Any.fromFunction1(value))
    
    inline def setSet_contextualScopeUrl(value: String => String): Self = StObject.set(x, "set_contextualScopeUrl", js.Any.fromFunction1(value))
    
    inline def setSet_desiredSnippetLength(value: Double => Double): Self = StObject.set(x, "set_desiredSnippetLength", js.Any.fromFunction1(value))
    
    inline def setSet_enableInterleaving(value: Boolean => Boolean): Self = StObject.set(x, "set_enableInterleaving", js.Any.fromFunction1(value))
    
    inline def setSet_enableNicknames(value: Boolean => Boolean): Self = StObject.set(x, "set_enableNicknames", js.Any.fromFunction1(value))
    
    inline def setSet_enableOrderingHitHighlightedProperty(value: Boolean => Boolean): Self = StObject.set(x, "set_enableOrderingHitHighlightedProperty", js.Any.fromFunction1(value))
    
    inline def setSet_enablePhonetic(value: Boolean => Boolean): Self = StObject.set(x, "set_enablePhonetic", js.Any.fromFunction1(value))
    
    inline def setSet_enableQueryRules(value: Boolean => Boolean): Self = StObject.set(x, "set_enableQueryRules", js.Any.fromFunction1(value))
    
    inline def setSet_enableStemming(value: Boolean => Boolean): Self = StObject.set(x, "set_enableStemming", js.Any.fromFunction1(value))
    
    inline def setSet_fallbackLanguage(value: Any => Any): Self = StObject.set(x, "set_fallbackLanguage", js.Any.fromFunction1(value))
    
    inline def setSet_fallbackRankingModelID(value: String => String): Self = StObject.set(x, "set_fallbackRankingModelID", js.Any.fromFunction1(value))
    
    inline def setSet_fallbackRefinementFilters(value: Any => Any): Self = StObject.set(x, "set_fallbackRefinementFilters", js.Any.fromFunction1(value))
    
    inline def setSet_fallbackSort(value: Any => Any): Self = StObject.set(x, "set_fallbackSort", js.Any.fromFunction1(value))
    
    inline def setSet_hitHighlightedMultivaluePropertyLimit(value: Double => Double): Self = StObject.set(x, "set_hitHighlightedMultivaluePropertyLimit", js.Any.fromFunction1(value))
    
    inline def setSet_hitHighlightedProperties(value: Any => Any): Self = StObject.set(x, "set_hitHighlightedProperties", js.Any.fromFunction1(value))
    
    inline def setSet_initialQueryState(value: Any => Any): Self = StObject.set(x, "set_initialQueryState", js.Any.fromFunction1(value))
    
    inline def setSet_initialResult(value: String => String): Self = StObject.set(x, "set_initialResult", js.Any.fromFunction1(value))
    
    inline def setSet_initialResultRef(value: Any => Any): Self = StObject.set(x, "set_initialResultRef", js.Any.fromFunction1(value))
    
    inline def setSet_maxPagesAfterCurrent(value: Double => Double): Self = StObject.set(x, "set_maxPagesAfterCurrent", js.Any.fromFunction1(value))
    
    inline def setSet_parentImpressionID(value: Any => Any): Self = StObject.set(x, "set_parentImpressionID", js.Any.fromFunction1(value))
    
    inline def setSet_personalizedQuery(value: Boolean => Boolean): Self = StObject.set(x, "set_personalizedQuery", js.Any.fromFunction1(value))
    
    inline def setSet_processBestBets(value: Boolean => Boolean): Self = StObject.set(x, "set_processBestBets", js.Any.fromFunction1(value))
    
    inline def setSet_processPersonalFavorites(value: Boolean => Boolean): Self = StObject.set(x, "set_processPersonalFavorites", js.Any.fromFunction1(value))
    
    inline def setSet_properties(value: Any => Any): Self = StObject.set(x, "set_properties", js.Any.fromFunction1(value))
    
    inline def setSet_queryCount(value: Double => Double): Self = StObject.set(x, "set_queryCount", js.Any.fromFunction1(value))
    
    inline def setSet_queryGroupName(value: String => String): Self = StObject.set(x, "set_queryGroupName", js.Any.fromFunction1(value))
    
    inline def setSet_queryPropertiesTemplateUrl(value: String => String): Self = StObject.set(x, "set_queryPropertiesTemplateUrl", js.Any.fromFunction1(value))
    
    inline def setSet_queryTemplate(value: Any => Any): Self = StObject.set(x, "set_queryTemplate", js.Any.fromFunction1(value))
    
    inline def setSet_rankRules(value: Any => Any): Self = StObject.set(x, "set_rankRules", js.Any.fromFunction1(value))
    
    inline def setSet_resultsPerPage(value: Double => Double): Self = StObject.set(x, "set_resultsPerPage", js.Any.fromFunction1(value))
    
    inline def setSet_resultsUrl(value: Any => Any): Self = StObject.set(x, "set_resultsUrl", js.Any.fromFunction1(value))
    
    inline def setSet_rowCount(value: Double => Double): Self = StObject.set(x, "set_rowCount", js.Any.fromFunction1(value))
    
    inline def setSet_selectedProperties(value: Any => Any): Self = StObject.set(x, "set_selectedProperties", js.Any.fromFunction1(value))
    
    inline def setSet_selectedRefiners(value: Any => Any): Self = StObject.set(x, "set_selectedRefiners", js.Any.fromFunction1(value))
    
    inline def setSet_sourceID(value: String => String): Self = StObject.set(x, "set_sourceID", js.Any.fromFunction1(value))
    
    inline def setSet_sourceLevel(value: String => String): Self = StObject.set(x, "set_sourceLevel", js.Any.fromFunction1(value))
    
    inline def setSet_sourceName(value: String => String): Self = StObject.set(x, "set_sourceName", js.Any.fromFunction1(value))
    
    inline def setSet_summaryLength(value: Double => Double): Self = StObject.set(x, "set_summaryLength", js.Any.fromFunction1(value))
    
    inline def setSet_totalRows(value: Double => Double): Self = StObject.set(x, "set_totalRows", js.Any.fromFunction1(value))
    
    inline def setSet_trimDuplicates(value: Boolean => Boolean): Self = StObject.set(x, "set_trimDuplicates", js.Any.fromFunction1(value))
    
    inline def setSet_updateAjaxNavigate(value: Boolean => Boolean): Self = StObject.set(x, "set_updateAjaxNavigate", js.Any.fromFunction1(value))
    
    inline def setSet_userAction(value: Any => Any): Self = StObject.set(x, "set_userAction", js.Any.fromFunction1(value))
  }
}
