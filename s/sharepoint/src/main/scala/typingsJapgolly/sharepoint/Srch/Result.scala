package typingsJapgolly.sharepoint.Srch

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Query.ResultTable
import typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Query.ResultTableCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result
  extends StObject
     with DisplayControl {
  
  def activate(
    prompt: String,
    searchBoxId: String,
    searchBoxDivId: String,
    navButtonId: String,
    suggestionsListId: String,
    navListId: String,
    searchBoxLinkId: String,
    searchBoxProgressClass: String,
    searchBoxPromptClass: String
  ): Unit
  
  def changeQueryLanguage(queryLanguage: Double): Unit
  
  def changeQueryTerm(queryTerm: Any): Unit
  
  def get_advancedSearchPageAddress(): String
  
  def get_advancedUrl(): String
  
  def get_currentPageNumber(): Double
  
  def get_currentTerm(): String
  
  def get_emptyRefinementMessageId(): String
  
  def get_groupTemplateId(): String
  
  def get_initialPrompt(): String
  
  def get_itemBodyTemplateId(): String
  
  def get_itemTemplateId(): String
  
  def get_maxPagesAfterCurrent(): Double
  
  def get_maxPagesBeforeCurrent(): Double
  
  def get_pagingInfo(): Any
  
  def get_preloadedItemTemplateIds(): js.Array[String]
  
  def get_repositionLanguageDropDown(): Boolean
  
  def get_scrollToTopOnRedraw(): Boolean
  
  def get_selectedRefinementControls(): js.Array[CSRRefinementControl]
  
  def get_showAdvancedLink(): Boolean
  
  def get_showAlertMe(): Boolean
  
  def get_showBestBets(): Boolean
  
  def get_showDefinitions(): Boolean
  
  def get_showDidYouMean(): Boolean
  
  def get_showLanguageOptions(): Boolean
  
  def get_showNavigation(): Boolean
  
  def get_showPaging(): Boolean
  
  def get_showPersonalFavorites(): Boolean
  
  def get_showPreferencesLink(): Boolean
  
  def get_showQuerySuggestions(): Boolean
  
  def get_showResultCount(): Boolean
  
  def get_showResults(): Boolean
  
  def get_showSortOptions(): Boolean
  
  def get_showUpScopeMessage(): Boolean
  
  def get_showViewDuplicates(): Boolean
  
  def get_useSimplifiedQueryBuilder(): Boolean
  
  def handleClickOnCategoryLink(id: String): Unit
  
  def page(startAt: Double): Unit
  
  def processResultReady(resultTableCollection: ResultTableCollection): Unit
  
  def setAriaCollapsed(element: HTMLElement): Unit
  
  def set_advancedUrl(value: String): String
  
  def set_currentPageNumber(value: Double): Double
  
  def set_groupTemplateId(value: String): String
  
  def set_itemBodyTemplateId(value: String): String
  
  def set_itemTemplateId(value: String): String
  
  def set_maxPagesAfterCurrent(value: Double): Double
  
  def set_maxPagesBeforeCurrent(value: Double): Double
  
  def set_preloadedItemTemplateIds(value: js.Array[String]): js.Array[String]
  
  def set_repositionLanguageDropDown(value: Boolean): Boolean
  
  def set_scrollToTopOnRedraw(value: Boolean): Boolean
  
  def set_showAdvancedLink(value: Boolean): Boolean
  
  def set_showAlertMe(value: Boolean): Boolean
  
  def set_showBestBets(value: Boolean): Boolean
  
  def set_showDefinitions(value: Boolean): Boolean
  
  def set_showDidYouMean(value: Boolean): Boolean
  
  def set_showLanguageOptions(value: Boolean): Boolean
  
  def set_showPaging(value: Boolean): Boolean
  
  def set_showPersonalFavorites(value: Boolean): Boolean
  
  def set_showPreferencesLink(value: Boolean): Boolean
  
  def set_showResultCount(value: Boolean): Boolean
  
  def set_showResults(value: Boolean): Boolean
  
  def set_showSortOptions(value: Boolean): Boolean
  
  def set_showUpScopeMessage(value: Boolean): Boolean
  
  def set_showViewDuplicates(value: Boolean): Boolean
  
  def set_useSimplifiedQueryBuilder(value: Boolean): Boolean
  
  /** Returns true if the specified table has results and is enabled to be shown by this control */
  def shouldShowTable(resultTable: ResultTable): Boolean
  
  def sort(sortName: String): Unit
  
  def sortOrRank(sortRankName: String): Unit
  
  def viewDuplicates(docId: Double): Unit
}
object Result {
  
  inline def apply(
    activate: (String, String, String, String, String, String, String, String, String) => Callback,
    addCssClass: String => Callback,
    add_disposing: js.Function => Callback,
    add_oneTimeResultRendered: Any => Callback,
    add_propertyChanged: js.Function => Callback,
    add_queryReady: Any => Callback,
    add_resultRendered: Any => Callback,
    alternateRenderContext: Any,
    alternateRenderer: Any,
    beginUpdate: Callback,
    changeQueryLanguage: Double => Callback,
    changeQueryTerm: Any => Callback,
    clickHandler: Event => Any,
    dataProvider_QueryIssuing: (Any, Any) => Callback,
    dataProvider_ResultReady: (Any, Any) => Callback,
    dispose: Callback,
    endUpdate: Callback,
    get_advancedSearchPageAddress: CallbackTo[String],
    get_advancedUrl: CallbackTo[String],
    get_alternateErrorMessage: CallbackTo[String],
    get_currentPageNumber: CallbackTo[Double],
    get_currentResultTableCollection: CallbackTo[Any],
    get_currentTerm: CallbackTo[String],
    get_dataProvider: CallbackTo[DataProvider],
    get_delayLoadTemplateScripts: CallbackTo[Boolean],
    get_element: CallbackTo[HTMLElement],
    get_emptyMessage: CallbackTo[String],
    get_emptyRefinementMessageId: CallbackTo[String],
    get_events: CallbackTo[Any],
    get_groupTemplateId: CallbackTo[String],
    get_id: CallbackTo[String],
    get_initialPrompt: CallbackTo[String],
    get_isInitialLoad: CallbackTo[Boolean],
    get_isInitialized: CallbackTo[Boolean],
    get_isUpdating: CallbackTo[Boolean],
    get_itemBodyTemplateId: CallbackTo[String],
    get_itemTemplateId: CallbackTo[String],
    get_maxPagesAfterCurrent: CallbackTo[Double],
    get_maxPagesBeforeCurrent: CallbackTo[Double],
    get_messages: CallbackTo[js.Array[Any]],
    get_nextUniqueId: CallbackTo[String],
    get_pagingInfo: CallbackTo[Any],
    get_preloadedItemTemplateIds: CallbackTo[js.Array[String]],
    get_queryGroupName: CallbackTo[String],
    get_renderTemplateId: CallbackTo[String],
    get_renderedResult: CallbackTo[Boolean],
    get_repositionLanguageDropDown: CallbackTo[Boolean],
    get_scrollToTopOnRedraw: CallbackTo[Boolean],
    get_selectedRefinementControls: CallbackTo[js.Array[CSRRefinementControl]],
    get_shouldShowNoResultMessage: CallbackTo[Boolean],
    get_showAdvancedLink: CallbackTo[Boolean],
    get_showAlertMe: CallbackTo[Boolean],
    get_showBestBets: CallbackTo[Boolean],
    get_showDataErrors: CallbackTo[Boolean],
    get_showDefinitions: CallbackTo[Boolean],
    get_showDidYouMean: CallbackTo[Boolean],
    get_showLanguageOptions: CallbackTo[Boolean],
    get_showNavigation: CallbackTo[Boolean],
    get_showPaging: CallbackTo[Boolean],
    get_showPersonalFavorites: CallbackTo[Boolean],
    get_showPreferencesLink: CallbackTo[Boolean],
    get_showQuerySuggestions: CallbackTo[Boolean],
    get_showResultCount: CallbackTo[Boolean],
    get_showResults: CallbackTo[Boolean],
    get_showSortOptions: CallbackTo[Boolean],
    get_showUpScopeMessage: CallbackTo[Boolean],
    get_showViewDuplicates: CallbackTo[Boolean],
    get_states: CallbackTo[Any],
    get_useSimplifiedQueryBuilder: CallbackTo[Boolean],
    handleClickOnCategoryLink: String => Callback,
    hasMessages: CallbackTo[Any],
    initialize: Callback,
    invokeAlternateRender: (Any, Any, Any) => Any,
    invokeClientRenderer: (Any, Any) => Any,
    loadRenderTemplateScripts: (Any, Any, Any, Any, Any) => Boolean,
    loadServerTemplateScripts: Callback,
    loaded: Boolean,
    onBubbleEvent: (Any, Any) => Boolean,
    page: Double => Callback,
    processDataErrorMessages: Any => Any,
    processDataProviderErrors: Any => Callback,
    processQueryIssuing: Any => Callback,
    processRenderingErrorMessages: Any => Any,
    processResultReady: ResultTableCollection => Callback,
    raiseBubbleEvent: (Any, Any) => Callback,
    raiseOneTimeResultRenderedEvent: Any => Callback,
    raisePropertyChanged: String => Callback,
    raiseQueryReadyEvent: Any => Callback,
    raiseResultRenderedEvent: Any => Callback,
    refresh: Any => Callback,
    removeCssClass: String => Callback,
    remove_disposing: js.Function => Callback,
    remove_oneTimeResultRendered: Any => Callback,
    remove_propertyChanged: js.Function => Callback,
    remove_queryReady: Any => Callback,
    remove_resultRendered: Any => Callback,
    render: Callback,
    renderControl: (Any, Any) => Callback,
    scriptApplication_Load: (Any, Any) => Callback,
    scriptApplication_PostLoad: (Any, Any) => Callback,
    scriptApplication_PreLoad: (Any, Any) => Callback,
    serverTemplateScriptsCallback: Callback,
    serverTemplateScriptsToLoad: js.Array[Any],
    setAriaCollapsed: HTMLElement => Callback,
    setControlElementVisibility: Boolean => Any,
    set_advancedUrl: String => String,
    set_alternateErrorMessage: String => String,
    set_currentPageNumber: Double => Double,
    set_currentResultTableCollection: Any => Any,
    set_delayLoadTemplateScripts: Boolean => Boolean,
    set_emptyMessage: String => String,
    set_groupTemplateId: String => String,
    set_id: String => Callback,
    set_itemBodyTemplateId: String => String,
    set_itemTemplateId: String => String,
    set_maxPagesAfterCurrent: Double => Double,
    set_maxPagesBeforeCurrent: Double => Double,
    set_messages: js.Array[Any] => js.Array[Any],
    set_preloadedItemTemplateIds: js.Array[String] => js.Array[String],
    set_queryGroupName: String => String,
    set_renderTemplateId: String => String,
    set_renderedResult: Boolean => Boolean,
    set_repositionLanguageDropDown: Boolean => Boolean,
    set_scrollToTopOnRedraw: Boolean => Boolean,
    set_shouldShowNoResultMessage: Boolean => Boolean,
    set_showAdvancedLink: Boolean => Boolean,
    set_showAlertMe: Boolean => Boolean,
    set_showBestBets: Boolean => Boolean,
    set_showDataErrors: Boolean => Boolean,
    set_showDefinitions: Boolean => Boolean,
    set_showDidYouMean: Boolean => Boolean,
    set_showLanguageOptions: Boolean => Boolean,
    set_showPaging: Boolean => Boolean,
    set_showPersonalFavorites: Boolean => Boolean,
    set_showPreferencesLink: Boolean => Boolean,
    set_showResultCount: Boolean => Boolean,
    set_showResults: Boolean => Boolean,
    set_showSortOptions: Boolean => Boolean,
    set_showUpScopeMessage: Boolean => Boolean,
    set_showViewDuplicates: Boolean => Boolean,
    set_states: Any => Any,
    set_useSimplifiedQueryBuilder: Boolean => Boolean,
    shouldShowTable: ResultTable => Boolean,
    sort: String => Callback,
    sortOrRank: String => Callback,
    toggleCssClass: String => Callback,
    updateDisplayControlWithNewMessages: CallbackTo[Any],
    updated: Callback,
    viewDuplicates: Double => Callback
  ): Result = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction9((t0: String, t1: String, t2: String, t3: String, t4: String, t5: String, t6: String, t7: String, t8: String) => (activate(t0, t1, t2, t3, t4, t5, t6, t7, t8)).runNow()), addCssClass = js.Any.fromFunction1((t0: String) => addCssClass(t0).runNow()), add_disposing = js.Any.fromFunction1((t0: js.Function) => add_disposing(t0).runNow()), add_oneTimeResultRendered = js.Any.fromFunction1((t0: Any) => add_oneTimeResultRendered(t0).runNow()), add_propertyChanged = js.Any.fromFunction1((t0: js.Function) => add_propertyChanged(t0).runNow()), add_queryReady = js.Any.fromFunction1((t0: Any) => add_queryReady(t0).runNow()), add_resultRendered = js.Any.fromFunction1((t0: Any) => add_resultRendered(t0).runNow()), alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], beginUpdate = beginUpdate.toJsFn, changeQueryLanguage = js.Any.fromFunction1((t0: Double) => changeQueryLanguage(t0).runNow()), changeQueryTerm = js.Any.fromFunction1((t0: Any) => changeQueryTerm(t0).runNow()), clickHandler = js.Any.fromFunction1(clickHandler), dataProvider_QueryIssuing = js.Any.fromFunction2((t0: Any, t1: Any) => (dataProvider_QueryIssuing(t0, t1)).runNow()), dataProvider_ResultReady = js.Any.fromFunction2((t0: Any, t1: Any) => (dataProvider_ResultReady(t0, t1)).runNow()), dispose = dispose.toJsFn, endUpdate = endUpdate.toJsFn, get_advancedSearchPageAddress = get_advancedSearchPageAddress.toJsFn, get_advancedUrl = get_advancedUrl.toJsFn, get_alternateErrorMessage = get_alternateErrorMessage.toJsFn, get_currentPageNumber = get_currentPageNumber.toJsFn, get_currentResultTableCollection = get_currentResultTableCollection.toJsFn, get_currentTerm = get_currentTerm.toJsFn, get_dataProvider = get_dataProvider.toJsFn, get_delayLoadTemplateScripts = get_delayLoadTemplateScripts.toJsFn, get_element = get_element.toJsFn, get_emptyMessage = get_emptyMessage.toJsFn, get_emptyRefinementMessageId = get_emptyRefinementMessageId.toJsFn, get_events = get_events.toJsFn, get_groupTemplateId = get_groupTemplateId.toJsFn, get_id = get_id.toJsFn, get_initialPrompt = get_initialPrompt.toJsFn, get_isInitialLoad = get_isInitialLoad.toJsFn, get_isInitialized = get_isInitialized.toJsFn, get_isUpdating = get_isUpdating.toJsFn, get_itemBodyTemplateId = get_itemBodyTemplateId.toJsFn, get_itemTemplateId = get_itemTemplateId.toJsFn, get_maxPagesAfterCurrent = get_maxPagesAfterCurrent.toJsFn, get_maxPagesBeforeCurrent = get_maxPagesBeforeCurrent.toJsFn, get_messages = get_messages.toJsFn, get_nextUniqueId = get_nextUniqueId.toJsFn, get_pagingInfo = get_pagingInfo.toJsFn, get_preloadedItemTemplateIds = get_preloadedItemTemplateIds.toJsFn, get_queryGroupName = get_queryGroupName.toJsFn, get_renderTemplateId = get_renderTemplateId.toJsFn, get_renderedResult = get_renderedResult.toJsFn, get_repositionLanguageDropDown = get_repositionLanguageDropDown.toJsFn, get_scrollToTopOnRedraw = get_scrollToTopOnRedraw.toJsFn, get_selectedRefinementControls = get_selectedRefinementControls.toJsFn, get_shouldShowNoResultMessage = get_shouldShowNoResultMessage.toJsFn, get_showAdvancedLink = get_showAdvancedLink.toJsFn, get_showAlertMe = get_showAlertMe.toJsFn, get_showBestBets = get_showBestBets.toJsFn, get_showDataErrors = get_showDataErrors.toJsFn, get_showDefinitions = get_showDefinitions.toJsFn, get_showDidYouMean = get_showDidYouMean.toJsFn, get_showLanguageOptions = get_showLanguageOptions.toJsFn, get_showNavigation = get_showNavigation.toJsFn, get_showPaging = get_showPaging.toJsFn, get_showPersonalFavorites = get_showPersonalFavorites.toJsFn, get_showPreferencesLink = get_showPreferencesLink.toJsFn, get_showQuerySuggestions = get_showQuerySuggestions.toJsFn, get_showResultCount = get_showResultCount.toJsFn, get_showResults = get_showResults.toJsFn, get_showSortOptions = get_showSortOptions.toJsFn, get_showUpScopeMessage = get_showUpScopeMessage.toJsFn, get_showViewDuplicates = get_showViewDuplicates.toJsFn, get_states = get_states.toJsFn, get_useSimplifiedQueryBuilder = get_useSimplifiedQueryBuilder.toJsFn, handleClickOnCategoryLink = js.Any.fromFunction1((t0: String) => handleClickOnCategoryLink(t0).runNow()), hasMessages = hasMessages.toJsFn, initialize = initialize.toJsFn, invokeAlternateRender = js.Any.fromFunction3(invokeAlternateRender), invokeClientRenderer = js.Any.fromFunction2(invokeClientRenderer), loadRenderTemplateScripts = js.Any.fromFunction5(loadRenderTemplateScripts), loadServerTemplateScripts = loadServerTemplateScripts.toJsFn, loaded = loaded.asInstanceOf[js.Any], onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), page = js.Any.fromFunction1((t0: Double) => page(t0).runNow()), processDataErrorMessages = js.Any.fromFunction1(processDataErrorMessages), processDataProviderErrors = js.Any.fromFunction1((t0: Any) => processDataProviderErrors(t0).runNow()), processQueryIssuing = js.Any.fromFunction1((t0: Any) => processQueryIssuing(t0).runNow()), processRenderingErrorMessages = js.Any.fromFunction1(processRenderingErrorMessages), processResultReady = js.Any.fromFunction1((t0: ResultTableCollection) => processResultReady(t0).runNow()), raiseBubbleEvent = js.Any.fromFunction2((t0: Any, t1: Any) => (raiseBubbleEvent(t0, t1)).runNow()), raiseOneTimeResultRenderedEvent = js.Any.fromFunction1((t0: Any) => raiseOneTimeResultRenderedEvent(t0).runNow()), raisePropertyChanged = js.Any.fromFunction1((t0: String) => raisePropertyChanged(t0).runNow()), raiseQueryReadyEvent = js.Any.fromFunction1((t0: Any) => raiseQueryReadyEvent(t0).runNow()), raiseResultRenderedEvent = js.Any.fromFunction1((t0: Any) => raiseResultRenderedEvent(t0).runNow()), refresh = js.Any.fromFunction1((t0: Any) => refresh(t0).runNow()), removeCssClass = js.Any.fromFunction1((t0: String) => removeCssClass(t0).runNow()), remove_disposing = js.Any.fromFunction1((t0: js.Function) => remove_disposing(t0).runNow()), remove_oneTimeResultRendered = js.Any.fromFunction1((t0: Any) => remove_oneTimeResultRendered(t0).runNow()), remove_propertyChanged = js.Any.fromFunction1((t0: js.Function) => remove_propertyChanged(t0).runNow()), remove_queryReady = js.Any.fromFunction1((t0: Any) => remove_queryReady(t0).runNow()), remove_resultRendered = js.Any.fromFunction1((t0: Any) => remove_resultRendered(t0).runNow()), render = render.toJsFn, renderControl = js.Any.fromFunction2((t0: Any, t1: Any) => (renderControl(t0, t1)).runNow()), scriptApplication_Load = js.Any.fromFunction2((t0: Any, t1: Any) => (scriptApplication_Load(t0, t1)).runNow()), scriptApplication_PostLoad = js.Any.fromFunction2((t0: Any, t1: Any) => (scriptApplication_PostLoad(t0, t1)).runNow()), scriptApplication_PreLoad = js.Any.fromFunction2((t0: Any, t1: Any) => (scriptApplication_PreLoad(t0, t1)).runNow()), serverTemplateScriptsCallback = serverTemplateScriptsCallback.toJsFn, serverTemplateScriptsToLoad = serverTemplateScriptsToLoad.asInstanceOf[js.Any], setAriaCollapsed = js.Any.fromFunction1((t0: HTMLElement) => setAriaCollapsed(t0).runNow()), setControlElementVisibility = js.Any.fromFunction1(setControlElementVisibility), set_advancedUrl = js.Any.fromFunction1(set_advancedUrl), set_alternateErrorMessage = js.Any.fromFunction1(set_alternateErrorMessage), set_currentPageNumber = js.Any.fromFunction1(set_currentPageNumber), set_currentResultTableCollection = js.Any.fromFunction1(set_currentResultTableCollection), set_delayLoadTemplateScripts = js.Any.fromFunction1(set_delayLoadTemplateScripts), set_emptyMessage = js.Any.fromFunction1(set_emptyMessage), set_groupTemplateId = js.Any.fromFunction1(set_groupTemplateId), set_id = js.Any.fromFunction1((t0: String) => set_id(t0).runNow()), set_itemBodyTemplateId = js.Any.fromFunction1(set_itemBodyTemplateId), set_itemTemplateId = js.Any.fromFunction1(set_itemTemplateId), set_maxPagesAfterCurrent = js.Any.fromFunction1(set_maxPagesAfterCurrent), set_maxPagesBeforeCurrent = js.Any.fromFunction1(set_maxPagesBeforeCurrent), set_messages = js.Any.fromFunction1(set_messages), set_preloadedItemTemplateIds = js.Any.fromFunction1(set_preloadedItemTemplateIds), set_queryGroupName = js.Any.fromFunction1(set_queryGroupName), set_renderTemplateId = js.Any.fromFunction1(set_renderTemplateId), set_renderedResult = js.Any.fromFunction1(set_renderedResult), set_repositionLanguageDropDown = js.Any.fromFunction1(set_repositionLanguageDropDown), set_scrollToTopOnRedraw = js.Any.fromFunction1(set_scrollToTopOnRedraw), set_shouldShowNoResultMessage = js.Any.fromFunction1(set_shouldShowNoResultMessage), set_showAdvancedLink = js.Any.fromFunction1(set_showAdvancedLink), set_showAlertMe = js.Any.fromFunction1(set_showAlertMe), set_showBestBets = js.Any.fromFunction1(set_showBestBets), set_showDataErrors = js.Any.fromFunction1(set_showDataErrors), set_showDefinitions = js.Any.fromFunction1(set_showDefinitions), set_showDidYouMean = js.Any.fromFunction1(set_showDidYouMean), set_showLanguageOptions = js.Any.fromFunction1(set_showLanguageOptions), set_showPaging = js.Any.fromFunction1(set_showPaging), set_showPersonalFavorites = js.Any.fromFunction1(set_showPersonalFavorites), set_showPreferencesLink = js.Any.fromFunction1(set_showPreferencesLink), set_showResultCount = js.Any.fromFunction1(set_showResultCount), set_showResults = js.Any.fromFunction1(set_showResults), set_showSortOptions = js.Any.fromFunction1(set_showSortOptions), set_showUpScopeMessage = js.Any.fromFunction1(set_showUpScopeMessage), set_showViewDuplicates = js.Any.fromFunction1(set_showViewDuplicates), set_states = js.Any.fromFunction1(set_states), set_useSimplifiedQueryBuilder = js.Any.fromFunction1(set_useSimplifiedQueryBuilder), shouldShowTable = js.Any.fromFunction1(shouldShowTable), sort = js.Any.fromFunction1((t0: String) => sort(t0).runNow()), sortOrRank = js.Any.fromFunction1((t0: String) => sortOrRank(t0).runNow()), toggleCssClass = js.Any.fromFunction1((t0: String) => toggleCssClass(t0).runNow()), updateDisplayControlWithNewMessages = updateDisplayControlWithNewMessages.toJsFn, updated = updated.toJsFn, viewDuplicates = js.Any.fromFunction1((t0: Double) => viewDuplicates(t0).runNow()))
    __obj.asInstanceOf[Result]
  }
  
  extension [Self <: Result](x: Self) {
    
    inline def setActivate(value: (String, String, String, String, String, String, String, String, String) => Callback): Self = StObject.set(x, "activate", js.Any.fromFunction9((t0: String, t1: String, t2: String, t3: String, t4: String, t5: String, t6: String, t7: String, t8: String) => (value(t0, t1, t2, t3, t4, t5, t6, t7, t8)).runNow()))
    
    inline def setChangeQueryLanguage(value: Double => Callback): Self = StObject.set(x, "changeQueryLanguage", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setChangeQueryTerm(value: Any => Callback): Self = StObject.set(x, "changeQueryTerm", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setGet_advancedSearchPageAddress(value: CallbackTo[String]): Self = StObject.set(x, "get_advancedSearchPageAddress", value.toJsFn)
    
    inline def setGet_advancedUrl(value: CallbackTo[String]): Self = StObject.set(x, "get_advancedUrl", value.toJsFn)
    
    inline def setGet_currentPageNumber(value: CallbackTo[Double]): Self = StObject.set(x, "get_currentPageNumber", value.toJsFn)
    
    inline def setGet_currentTerm(value: CallbackTo[String]): Self = StObject.set(x, "get_currentTerm", value.toJsFn)
    
    inline def setGet_emptyRefinementMessageId(value: CallbackTo[String]): Self = StObject.set(x, "get_emptyRefinementMessageId", value.toJsFn)
    
    inline def setGet_groupTemplateId(value: CallbackTo[String]): Self = StObject.set(x, "get_groupTemplateId", value.toJsFn)
    
    inline def setGet_initialPrompt(value: CallbackTo[String]): Self = StObject.set(x, "get_initialPrompt", value.toJsFn)
    
    inline def setGet_itemBodyTemplateId(value: CallbackTo[String]): Self = StObject.set(x, "get_itemBodyTemplateId", value.toJsFn)
    
    inline def setGet_itemTemplateId(value: CallbackTo[String]): Self = StObject.set(x, "get_itemTemplateId", value.toJsFn)
    
    inline def setGet_maxPagesAfterCurrent(value: CallbackTo[Double]): Self = StObject.set(x, "get_maxPagesAfterCurrent", value.toJsFn)
    
    inline def setGet_maxPagesBeforeCurrent(value: CallbackTo[Double]): Self = StObject.set(x, "get_maxPagesBeforeCurrent", value.toJsFn)
    
    inline def setGet_pagingInfo(value: CallbackTo[Any]): Self = StObject.set(x, "get_pagingInfo", value.toJsFn)
    
    inline def setGet_preloadedItemTemplateIds(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "get_preloadedItemTemplateIds", value.toJsFn)
    
    inline def setGet_repositionLanguageDropDown(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_repositionLanguageDropDown", value.toJsFn)
    
    inline def setGet_scrollToTopOnRedraw(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_scrollToTopOnRedraw", value.toJsFn)
    
    inline def setGet_selectedRefinementControls(value: CallbackTo[js.Array[CSRRefinementControl]]): Self = StObject.set(x, "get_selectedRefinementControls", value.toJsFn)
    
    inline def setGet_showAdvancedLink(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showAdvancedLink", value.toJsFn)
    
    inline def setGet_showAlertMe(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showAlertMe", value.toJsFn)
    
    inline def setGet_showBestBets(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showBestBets", value.toJsFn)
    
    inline def setGet_showDefinitions(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showDefinitions", value.toJsFn)
    
    inline def setGet_showDidYouMean(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showDidYouMean", value.toJsFn)
    
    inline def setGet_showLanguageOptions(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showLanguageOptions", value.toJsFn)
    
    inline def setGet_showNavigation(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showNavigation", value.toJsFn)
    
    inline def setGet_showPaging(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showPaging", value.toJsFn)
    
    inline def setGet_showPersonalFavorites(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showPersonalFavorites", value.toJsFn)
    
    inline def setGet_showPreferencesLink(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showPreferencesLink", value.toJsFn)
    
    inline def setGet_showQuerySuggestions(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showQuerySuggestions", value.toJsFn)
    
    inline def setGet_showResultCount(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showResultCount", value.toJsFn)
    
    inline def setGet_showResults(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showResults", value.toJsFn)
    
    inline def setGet_showSortOptions(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showSortOptions", value.toJsFn)
    
    inline def setGet_showUpScopeMessage(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showUpScopeMessage", value.toJsFn)
    
    inline def setGet_showViewDuplicates(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showViewDuplicates", value.toJsFn)
    
    inline def setGet_useSimplifiedQueryBuilder(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_useSimplifiedQueryBuilder", value.toJsFn)
    
    inline def setHandleClickOnCategoryLink(value: String => Callback): Self = StObject.set(x, "handleClickOnCategoryLink", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setPage(value: Double => Callback): Self = StObject.set(x, "page", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setProcessResultReady(value: ResultTableCollection => Callback): Self = StObject.set(x, "processResultReady", js.Any.fromFunction1((t0: ResultTableCollection) => value(t0).runNow()))
    
    inline def setSetAriaCollapsed(value: HTMLElement => Callback): Self = StObject.set(x, "setAriaCollapsed", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
    
    inline def setSet_advancedUrl(value: String => String): Self = StObject.set(x, "set_advancedUrl", js.Any.fromFunction1(value))
    
    inline def setSet_currentPageNumber(value: Double => Double): Self = StObject.set(x, "set_currentPageNumber", js.Any.fromFunction1(value))
    
    inline def setSet_groupTemplateId(value: String => String): Self = StObject.set(x, "set_groupTemplateId", js.Any.fromFunction1(value))
    
    inline def setSet_itemBodyTemplateId(value: String => String): Self = StObject.set(x, "set_itemBodyTemplateId", js.Any.fromFunction1(value))
    
    inline def setSet_itemTemplateId(value: String => String): Self = StObject.set(x, "set_itemTemplateId", js.Any.fromFunction1(value))
    
    inline def setSet_maxPagesAfterCurrent(value: Double => Double): Self = StObject.set(x, "set_maxPagesAfterCurrent", js.Any.fromFunction1(value))
    
    inline def setSet_maxPagesBeforeCurrent(value: Double => Double): Self = StObject.set(x, "set_maxPagesBeforeCurrent", js.Any.fromFunction1(value))
    
    inline def setSet_preloadedItemTemplateIds(value: js.Array[String] => js.Array[String]): Self = StObject.set(x, "set_preloadedItemTemplateIds", js.Any.fromFunction1(value))
    
    inline def setSet_repositionLanguageDropDown(value: Boolean => Boolean): Self = StObject.set(x, "set_repositionLanguageDropDown", js.Any.fromFunction1(value))
    
    inline def setSet_scrollToTopOnRedraw(value: Boolean => Boolean): Self = StObject.set(x, "set_scrollToTopOnRedraw", js.Any.fromFunction1(value))
    
    inline def setSet_showAdvancedLink(value: Boolean => Boolean): Self = StObject.set(x, "set_showAdvancedLink", js.Any.fromFunction1(value))
    
    inline def setSet_showAlertMe(value: Boolean => Boolean): Self = StObject.set(x, "set_showAlertMe", js.Any.fromFunction1(value))
    
    inline def setSet_showBestBets(value: Boolean => Boolean): Self = StObject.set(x, "set_showBestBets", js.Any.fromFunction1(value))
    
    inline def setSet_showDefinitions(value: Boolean => Boolean): Self = StObject.set(x, "set_showDefinitions", js.Any.fromFunction1(value))
    
    inline def setSet_showDidYouMean(value: Boolean => Boolean): Self = StObject.set(x, "set_showDidYouMean", js.Any.fromFunction1(value))
    
    inline def setSet_showLanguageOptions(value: Boolean => Boolean): Self = StObject.set(x, "set_showLanguageOptions", js.Any.fromFunction1(value))
    
    inline def setSet_showPaging(value: Boolean => Boolean): Self = StObject.set(x, "set_showPaging", js.Any.fromFunction1(value))
    
    inline def setSet_showPersonalFavorites(value: Boolean => Boolean): Self = StObject.set(x, "set_showPersonalFavorites", js.Any.fromFunction1(value))
    
    inline def setSet_showPreferencesLink(value: Boolean => Boolean): Self = StObject.set(x, "set_showPreferencesLink", js.Any.fromFunction1(value))
    
    inline def setSet_showResultCount(value: Boolean => Boolean): Self = StObject.set(x, "set_showResultCount", js.Any.fromFunction1(value))
    
    inline def setSet_showResults(value: Boolean => Boolean): Self = StObject.set(x, "set_showResults", js.Any.fromFunction1(value))
    
    inline def setSet_showSortOptions(value: Boolean => Boolean): Self = StObject.set(x, "set_showSortOptions", js.Any.fromFunction1(value))
    
    inline def setSet_showUpScopeMessage(value: Boolean => Boolean): Self = StObject.set(x, "set_showUpScopeMessage", js.Any.fromFunction1(value))
    
    inline def setSet_showViewDuplicates(value: Boolean => Boolean): Self = StObject.set(x, "set_showViewDuplicates", js.Any.fromFunction1(value))
    
    inline def setSet_useSimplifiedQueryBuilder(value: Boolean => Boolean): Self = StObject.set(x, "set_useSimplifiedQueryBuilder", js.Any.fromFunction1(value))
    
    inline def setShouldShowTable(value: ResultTable => Boolean): Self = StObject.set(x, "shouldShowTable", js.Any.fromFunction1(value))
    
    inline def setSort(value: String => Callback): Self = StObject.set(x, "sort", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSortOrRank(value: String => Callback): Self = StObject.set(x, "sortOrRank", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setViewDuplicates(value: Double => Callback): Self = StObject.set(x, "viewDuplicates", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
