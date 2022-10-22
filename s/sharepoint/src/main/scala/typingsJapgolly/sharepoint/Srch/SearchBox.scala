package typingsJapgolly.sharepoint.Srch

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the search box control */
trait SearchBox
  extends StObject
     with ClientControl {
  
  def activate(
    prompt: String,
    searchBoxInputId: String,
    searchBoxContainerId: String,
    navigationButtonId: String,
    suggestionsListId: String,
    navigationListId: String,
    searchBoxLinkId: String,
    searchBoxProgressClass: String,
    searchBoxPromptClass: String
  ): Unit
  
  def activateDefaultNavigationBehavior(): Unit
  
  def activateDefaultQuerySuggestionBehavior(): Unit
  
  def add_batchQueryIssuing(value: Any): Unit
  
  def add_batchResultReady(value: Any): Unit
  
  def add_queryReady(value: Any): Unit
  
  def dataProvider_QueryIssuing(sender: Any, e: Any): Unit
  
  def dataProvider_QueryStateChanged(sender: Any, e: Any): Unit
  
  def dataProvider_ResultReady(sender: Any, e: Any): Unit
  
  def focus(): Unit
  
  def get_advancedSearchPageAddress(): String
  
  def get_allowEmptySearch(): Boolean
  
  /** Gets the search input placeholder text */
  def get_currentPrompt(): String
  
  /** Returns the current search term */
  def get_currentTerm(): String
  
  def get_initialPrompt(): String
  
  def get_maintainQueryState(): Boolean
  
  def get_msBeforeShowingProgress(): Double
  
  def get_navigationButtonId(): String
  
  def get_navigationListId(): String
  
  def get_navigationNodes(): Any
  
  def get_pageTitlePrefix(): String
  
  def get_personalResultCount(): Double
  
  /** Gets the css class/classes of the placeholder text. Default is 'ms-srch-sb-prompt ms-helperText' */
  def get_promptCssClass(): String
  
  def get_queryGroupNames(): js.Array[String]
  
  /** Gets the interval in milliseconds, if user is idle during this interval, suggestions retrieval will be initiated.
    * Default value is 250.
    */
  def get_querySuggestionCompletionInterval(): Double
  
  /** Gets number of suggestions to display. Default is 5. */
  def get_querySuggestionCount(): Double
  
  /** Gets minimum length of the search term for suggestions to be retrieved. Default is 2 letters. */
  def get_querySuggestionMinimumPrefixLength(): Double
  
  def get_querySuggestionsSourceID(): String
  
  /** Gets the results page address, e.g. '~site/_layouts/15/osssearchresults.aspx?u={contexturl}' */
  def get_resultsPageAddress(): String
  
  def get_searchBoxContainerElement(): Element
  
  def get_searchBoxContainerId(): String
  
  def get_searchBoxInputElement(): Element
  
  /** Gets the id of the search box input element */
  def get_searchBoxInputId(): String
  
  def get_searchBoxLinkElement(): Element
  
  def get_searchBoxLinkId(): String
  
  def get_searchBoxProgressClass(): String
  
  def get_serverInitialRender(): Boolean
  
  def get_setFocusOnPageLoad(): Boolean
  
  def get_showAdvancedLink(): Boolean
  
  def get_showNavigation(): Boolean
  
  def get_showPeopleNameSuggestions(): Boolean
  
  def get_showPreferencesLink(): Boolean
  
  def get_showQuerySuggestions(): Boolean
  
  def get_suggestionsListId(): String
  
  def get_tryInplaceQuery(): Boolean
  
  def get_updatePageTitle(): Boolean
  
  def hidePrompt(): Unit
  
  def raiseBatchQueryIssuingEvent(arg: Any): Unit
  
  def raiseBatchResultReadyEvent(arg: Any): Unit
  
  def raiseQueryReadyEvent(arg: Any): Unit
  
  def remove_batchQueryIssuing(value: Any): Unit
  
  def remove_batchResultReady(value: Any): Unit
  
  def remove_queryReady(value: Any): Unit
  
  def search(term: String): Unit
  
  def setBorder(focused: Boolean): Unit
  
  def set_advancedSearchPageAddress(value: String): String
  
  def set_allowEmptySearch(value: Boolean): Boolean
  
  /** Sets the search input placeholder text */
  def set_currentPrompt(value: String): String
  
  /** Sets the current search term.
    * Does not update results or even re-render control automatically, only sets the value.
    * You can call .renderControl() method to re-render control.
    */
  def set_currentTerm(value: String): String
  
  def set_initialPrompt(value: String): String
  
  def set_maintainQueryState(value: Boolean): Boolean
  
  def set_msBeforeShowingProgress(value: Double): Double
  
  def set_navigationButtonId(value: String): String
  
  def set_navigationListId(value: String): String
  
  def set_navigationNodes(value: Any): Any
  
  def set_pageTitlePrefix(value: String): String
  
  def set_personalResultCount(value: Double): Double
  
  /** Sets the css class/classes of the placeholder text. Default is 'ms-srch-sb-prompt ms-helperText' */
  def set_promptCssClass(value: String): String
  
  def set_queryGroupNames(value: Any): js.Array[String]
  
  /** Sets the interval in milliseconds, if user is idle during this interval, suggestions retrieval will be initiated.
    * Default value is 250.
    */
  def set_querySuggestionCompletionInterval(value: Double): Double
  
  /** Sets number of suggestions to display. Default is 5. */
  def set_querySuggestionCount(value: Double): Double
  
  /** Sets minimum length of the search term for suggestions to be retrieved. Default is 2 letters. */
  def set_querySuggestionMinimumPrefixLength(value: Double): Double
  
  def set_querySuggestionsSourceID(value: String): String
  
  /** Sets the results page address, e.g. '~site/_layouts/15/osssearchresults.aspx?u={contexturl}'
    * Parameter u is used for setting the url filter for the search, so that only results within
    * e.g. specified site are returned. Omit this parameter if you want to search everywhere.
    */
  def set_resultsPageAddress(value: String): String
  
  def set_searchBoxContainerId(value: String): String
  
  /** Sets the id of the search box input element */
  def set_searchBoxInputId(value: String): String
  
  def set_searchBoxLinkId(value: String): String
  
  def set_searchBoxProgressClass(value: String): String
  
  def set_serverInitialRender(value: Boolean): Boolean
  
  def set_setFocusOnPageLoad(value: Boolean): Boolean
  
  def set_showAdvancedLink(value: Boolean): Boolean
  
  def set_showNavigation(value: Boolean): Boolean
  
  def set_showPeopleNameSuggestions(value: Boolean): Boolean
  
  def set_showPreferencesLink(value: Boolean): Boolean
  
  def set_showQuerySuggestions(value: Boolean): Boolean
  
  def set_suggestionsListId(value: String): String
  
  def set_tryInplaceQuery(value: Boolean): Boolean
  
  def set_updatePageTitle(value: Boolean): Boolean
  
  def showPrompt(): Unit
}
object SearchBox {
  
  inline def apply(
    activate: (String, String, String, String, String, String, String, String, String) => Callback,
    activateDefaultNavigationBehavior: Callback,
    activateDefaultQuerySuggestionBehavior: Callback,
    addCssClass: String => Callback,
    add_batchQueryIssuing: Any => Callback,
    add_batchResultReady: Any => Callback,
    add_disposing: js.Function => Callback,
    add_propertyChanged: js.Function => Callback,
    add_queryReady: Any => Callback,
    alternateRenderContext: Any,
    alternateRenderer: Any,
    beginUpdate: Callback,
    clickHandler: Event => Any,
    dataProvider_QueryIssuing: (Any, Any) => Callback,
    dataProvider_QueryStateChanged: (Any, Any) => Callback,
    dataProvider_ResultReady: (Any, Any) => Callback,
    dispose: Callback,
    endUpdate: Callback,
    focus: Callback,
    get_advancedSearchPageAddress: CallbackTo[String],
    get_allowEmptySearch: CallbackTo[Boolean],
    get_alternateErrorMessage: CallbackTo[String],
    get_currentPrompt: CallbackTo[String],
    get_currentTerm: CallbackTo[String],
    get_delayLoadTemplateScripts: CallbackTo[Boolean],
    get_element: CallbackTo[HTMLElement],
    get_events: CallbackTo[Any],
    get_id: CallbackTo[String],
    get_initialPrompt: CallbackTo[String],
    get_isInitialLoad: CallbackTo[Boolean],
    get_isInitialized: CallbackTo[Boolean],
    get_isUpdating: CallbackTo[Boolean],
    get_maintainQueryState: CallbackTo[Boolean],
    get_messages: CallbackTo[js.Array[Any]],
    get_msBeforeShowingProgress: CallbackTo[Double],
    get_navigationButtonId: CallbackTo[String],
    get_navigationListId: CallbackTo[String],
    get_navigationNodes: CallbackTo[Any],
    get_nextUniqueId: CallbackTo[String],
    get_pageTitlePrefix: CallbackTo[String],
    get_personalResultCount: CallbackTo[Double],
    get_promptCssClass: CallbackTo[String],
    get_queryGroupNames: CallbackTo[js.Array[String]],
    get_querySuggestionCompletionInterval: CallbackTo[Double],
    get_querySuggestionCount: CallbackTo[Double],
    get_querySuggestionMinimumPrefixLength: CallbackTo[Double],
    get_querySuggestionsSourceID: CallbackTo[String],
    get_renderTemplateId: CallbackTo[String],
    get_resultsPageAddress: CallbackTo[String],
    get_searchBoxContainerElement: CallbackTo[Element],
    get_searchBoxContainerId: CallbackTo[String],
    get_searchBoxInputElement: CallbackTo[Element],
    get_searchBoxInputId: CallbackTo[String],
    get_searchBoxLinkElement: CallbackTo[Element],
    get_searchBoxLinkId: CallbackTo[String],
    get_searchBoxProgressClass: CallbackTo[String],
    get_serverInitialRender: CallbackTo[Boolean],
    get_setFocusOnPageLoad: CallbackTo[Boolean],
    get_showAdvancedLink: CallbackTo[Boolean],
    get_showDataErrors: CallbackTo[Boolean],
    get_showNavigation: CallbackTo[Boolean],
    get_showPeopleNameSuggestions: CallbackTo[Boolean],
    get_showPreferencesLink: CallbackTo[Boolean],
    get_showQuerySuggestions: CallbackTo[Boolean],
    get_states: CallbackTo[Any],
    get_suggestionsListId: CallbackTo[String],
    get_tryInplaceQuery: CallbackTo[Boolean],
    get_updatePageTitle: CallbackTo[Boolean],
    hasMessages: CallbackTo[Any],
    hidePrompt: Callback,
    initialize: Callback,
    invokeAlternateRender: (Any, Any, Any) => Any,
    invokeClientRenderer: (Any, Any) => Any,
    loadRenderTemplateScripts: (Any, Any, Any, Any, Any) => Boolean,
    loadServerTemplateScripts: Callback,
    loaded: Boolean,
    onBubbleEvent: (Any, Any) => Boolean,
    processDataErrorMessages: Any => Any,
    processDataProviderErrors: Any => Callback,
    processRenderingErrorMessages: Any => Any,
    raiseBatchQueryIssuingEvent: Any => Callback,
    raiseBatchResultReadyEvent: Any => Callback,
    raiseBubbleEvent: (Any, Any) => Callback,
    raisePropertyChanged: String => Callback,
    raiseQueryReadyEvent: Any => Callback,
    removeCssClass: String => Callback,
    remove_batchQueryIssuing: Any => Callback,
    remove_batchResultReady: Any => Callback,
    remove_disposing: js.Function => Callback,
    remove_propertyChanged: js.Function => Callback,
    remove_queryReady: Any => Callback,
    renderControl: (Any, Any) => Callback,
    scriptApplication_Load: (Any, Any) => Callback,
    scriptApplication_PostLoad: (Any, Any) => Callback,
    scriptApplication_PreLoad: (Any, Any) => Callback,
    search: String => Callback,
    serverTemplateScriptsCallback: Callback,
    serverTemplateScriptsToLoad: js.Array[Any],
    setBorder: Boolean => Callback,
    setControlElementVisibility: Boolean => Any,
    set_advancedSearchPageAddress: String => String,
    set_allowEmptySearch: Boolean => Boolean,
    set_alternateErrorMessage: String => String,
    set_currentPrompt: String => String,
    set_currentTerm: String => String,
    set_delayLoadTemplateScripts: Boolean => Boolean,
    set_id: String => Callback,
    set_initialPrompt: String => String,
    set_maintainQueryState: Boolean => Boolean,
    set_messages: js.Array[Any] => js.Array[Any],
    set_msBeforeShowingProgress: Double => Double,
    set_navigationButtonId: String => String,
    set_navigationListId: String => String,
    set_navigationNodes: Any => Any,
    set_pageTitlePrefix: String => String,
    set_personalResultCount: Double => Double,
    set_promptCssClass: String => String,
    set_queryGroupNames: Any => js.Array[String],
    set_querySuggestionCompletionInterval: Double => Double,
    set_querySuggestionCount: Double => Double,
    set_querySuggestionMinimumPrefixLength: Double => Double,
    set_querySuggestionsSourceID: String => String,
    set_renderTemplateId: String => String,
    set_resultsPageAddress: String => String,
    set_searchBoxContainerId: String => String,
    set_searchBoxInputId: String => String,
    set_searchBoxLinkId: String => String,
    set_searchBoxProgressClass: String => String,
    set_serverInitialRender: Boolean => Boolean,
    set_setFocusOnPageLoad: Boolean => Boolean,
    set_showAdvancedLink: Boolean => Boolean,
    set_showDataErrors: Boolean => Boolean,
    set_showNavigation: Boolean => Boolean,
    set_showPeopleNameSuggestions: Boolean => Boolean,
    set_showPreferencesLink: Boolean => Boolean,
    set_showQuerySuggestions: Boolean => Boolean,
    set_states: Any => Any,
    set_suggestionsListId: String => String,
    set_tryInplaceQuery: Boolean => Boolean,
    set_updatePageTitle: Boolean => Boolean,
    showPrompt: Callback,
    toggleCssClass: String => Callback,
    updateDisplayControlWithNewMessages: CallbackTo[Any],
    updated: Callback
  ): SearchBox = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction9((t0: String, t1: String, t2: String, t3: String, t4: String, t5: String, t6: String, t7: String, t8: String) => (activate(t0, t1, t2, t3, t4, t5, t6, t7, t8)).runNow()), activateDefaultNavigationBehavior = activateDefaultNavigationBehavior.toJsFn, activateDefaultQuerySuggestionBehavior = activateDefaultQuerySuggestionBehavior.toJsFn, addCssClass = js.Any.fromFunction1((t0: String) => addCssClass(t0).runNow()), add_batchQueryIssuing = js.Any.fromFunction1((t0: Any) => add_batchQueryIssuing(t0).runNow()), add_batchResultReady = js.Any.fromFunction1((t0: Any) => add_batchResultReady(t0).runNow()), add_disposing = js.Any.fromFunction1((t0: js.Function) => add_disposing(t0).runNow()), add_propertyChanged = js.Any.fromFunction1((t0: js.Function) => add_propertyChanged(t0).runNow()), add_queryReady = js.Any.fromFunction1((t0: Any) => add_queryReady(t0).runNow()), alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], beginUpdate = beginUpdate.toJsFn, clickHandler = js.Any.fromFunction1(clickHandler), dataProvider_QueryIssuing = js.Any.fromFunction2((t0: Any, t1: Any) => (dataProvider_QueryIssuing(t0, t1)).runNow()), dataProvider_QueryStateChanged = js.Any.fromFunction2((t0: Any, t1: Any) => (dataProvider_QueryStateChanged(t0, t1)).runNow()), dataProvider_ResultReady = js.Any.fromFunction2((t0: Any, t1: Any) => (dataProvider_ResultReady(t0, t1)).runNow()), dispose = dispose.toJsFn, endUpdate = endUpdate.toJsFn, focus = focus.toJsFn, get_advancedSearchPageAddress = get_advancedSearchPageAddress.toJsFn, get_allowEmptySearch = get_allowEmptySearch.toJsFn, get_alternateErrorMessage = get_alternateErrorMessage.toJsFn, get_currentPrompt = get_currentPrompt.toJsFn, get_currentTerm = get_currentTerm.toJsFn, get_delayLoadTemplateScripts = get_delayLoadTemplateScripts.toJsFn, get_element = get_element.toJsFn, get_events = get_events.toJsFn, get_id = get_id.toJsFn, get_initialPrompt = get_initialPrompt.toJsFn, get_isInitialLoad = get_isInitialLoad.toJsFn, get_isInitialized = get_isInitialized.toJsFn, get_isUpdating = get_isUpdating.toJsFn, get_maintainQueryState = get_maintainQueryState.toJsFn, get_messages = get_messages.toJsFn, get_msBeforeShowingProgress = get_msBeforeShowingProgress.toJsFn, get_navigationButtonId = get_navigationButtonId.toJsFn, get_navigationListId = get_navigationListId.toJsFn, get_navigationNodes = get_navigationNodes.toJsFn, get_nextUniqueId = get_nextUniqueId.toJsFn, get_pageTitlePrefix = get_pageTitlePrefix.toJsFn, get_personalResultCount = get_personalResultCount.toJsFn, get_promptCssClass = get_promptCssClass.toJsFn, get_queryGroupNames = get_queryGroupNames.toJsFn, get_querySuggestionCompletionInterval = get_querySuggestionCompletionInterval.toJsFn, get_querySuggestionCount = get_querySuggestionCount.toJsFn, get_querySuggestionMinimumPrefixLength = get_querySuggestionMinimumPrefixLength.toJsFn, get_querySuggestionsSourceID = get_querySuggestionsSourceID.toJsFn, get_renderTemplateId = get_renderTemplateId.toJsFn, get_resultsPageAddress = get_resultsPageAddress.toJsFn, get_searchBoxContainerElement = get_searchBoxContainerElement.toJsFn, get_searchBoxContainerId = get_searchBoxContainerId.toJsFn, get_searchBoxInputElement = get_searchBoxInputElement.toJsFn, get_searchBoxInputId = get_searchBoxInputId.toJsFn, get_searchBoxLinkElement = get_searchBoxLinkElement.toJsFn, get_searchBoxLinkId = get_searchBoxLinkId.toJsFn, get_searchBoxProgressClass = get_searchBoxProgressClass.toJsFn, get_serverInitialRender = get_serverInitialRender.toJsFn, get_setFocusOnPageLoad = get_setFocusOnPageLoad.toJsFn, get_showAdvancedLink = get_showAdvancedLink.toJsFn, get_showDataErrors = get_showDataErrors.toJsFn, get_showNavigation = get_showNavigation.toJsFn, get_showPeopleNameSuggestions = get_showPeopleNameSuggestions.toJsFn, get_showPreferencesLink = get_showPreferencesLink.toJsFn, get_showQuerySuggestions = get_showQuerySuggestions.toJsFn, get_states = get_states.toJsFn, get_suggestionsListId = get_suggestionsListId.toJsFn, get_tryInplaceQuery = get_tryInplaceQuery.toJsFn, get_updatePageTitle = get_updatePageTitle.toJsFn, hasMessages = hasMessages.toJsFn, hidePrompt = hidePrompt.toJsFn, initialize = initialize.toJsFn, invokeAlternateRender = js.Any.fromFunction3(invokeAlternateRender), invokeClientRenderer = js.Any.fromFunction2(invokeClientRenderer), loadRenderTemplateScripts = js.Any.fromFunction5(loadRenderTemplateScripts), loadServerTemplateScripts = loadServerTemplateScripts.toJsFn, loaded = loaded.asInstanceOf[js.Any], onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), processDataErrorMessages = js.Any.fromFunction1(processDataErrorMessages), processDataProviderErrors = js.Any.fromFunction1((t0: Any) => processDataProviderErrors(t0).runNow()), processRenderingErrorMessages = js.Any.fromFunction1(processRenderingErrorMessages), raiseBatchQueryIssuingEvent = js.Any.fromFunction1((t0: Any) => raiseBatchQueryIssuingEvent(t0).runNow()), raiseBatchResultReadyEvent = js.Any.fromFunction1((t0: Any) => raiseBatchResultReadyEvent(t0).runNow()), raiseBubbleEvent = js.Any.fromFunction2((t0: Any, t1: Any) => (raiseBubbleEvent(t0, t1)).runNow()), raisePropertyChanged = js.Any.fromFunction1((t0: String) => raisePropertyChanged(t0).runNow()), raiseQueryReadyEvent = js.Any.fromFunction1((t0: Any) => raiseQueryReadyEvent(t0).runNow()), removeCssClass = js.Any.fromFunction1((t0: String) => removeCssClass(t0).runNow()), remove_batchQueryIssuing = js.Any.fromFunction1((t0: Any) => remove_batchQueryIssuing(t0).runNow()), remove_batchResultReady = js.Any.fromFunction1((t0: Any) => remove_batchResultReady(t0).runNow()), remove_disposing = js.Any.fromFunction1((t0: js.Function) => remove_disposing(t0).runNow()), remove_propertyChanged = js.Any.fromFunction1((t0: js.Function) => remove_propertyChanged(t0).runNow()), remove_queryReady = js.Any.fromFunction1((t0: Any) => remove_queryReady(t0).runNow()), renderControl = js.Any.fromFunction2((t0: Any, t1: Any) => (renderControl(t0, t1)).runNow()), scriptApplication_Load = js.Any.fromFunction2((t0: Any, t1: Any) => (scriptApplication_Load(t0, t1)).runNow()), scriptApplication_PostLoad = js.Any.fromFunction2((t0: Any, t1: Any) => (scriptApplication_PostLoad(t0, t1)).runNow()), scriptApplication_PreLoad = js.Any.fromFunction2((t0: Any, t1: Any) => (scriptApplication_PreLoad(t0, t1)).runNow()), search = js.Any.fromFunction1((t0: String) => search(t0).runNow()), serverTemplateScriptsCallback = serverTemplateScriptsCallback.toJsFn, serverTemplateScriptsToLoad = serverTemplateScriptsToLoad.asInstanceOf[js.Any], setBorder = js.Any.fromFunction1((t0: Boolean) => setBorder(t0).runNow()), setControlElementVisibility = js.Any.fromFunction1(setControlElementVisibility), set_advancedSearchPageAddress = js.Any.fromFunction1(set_advancedSearchPageAddress), set_allowEmptySearch = js.Any.fromFunction1(set_allowEmptySearch), set_alternateErrorMessage = js.Any.fromFunction1(set_alternateErrorMessage), set_currentPrompt = js.Any.fromFunction1(set_currentPrompt), set_currentTerm = js.Any.fromFunction1(set_currentTerm), set_delayLoadTemplateScripts = js.Any.fromFunction1(set_delayLoadTemplateScripts), set_id = js.Any.fromFunction1((t0: String) => set_id(t0).runNow()), set_initialPrompt = js.Any.fromFunction1(set_initialPrompt), set_maintainQueryState = js.Any.fromFunction1(set_maintainQueryState), set_messages = js.Any.fromFunction1(set_messages), set_msBeforeShowingProgress = js.Any.fromFunction1(set_msBeforeShowingProgress), set_navigationButtonId = js.Any.fromFunction1(set_navigationButtonId), set_navigationListId = js.Any.fromFunction1(set_navigationListId), set_navigationNodes = js.Any.fromFunction1(set_navigationNodes), set_pageTitlePrefix = js.Any.fromFunction1(set_pageTitlePrefix), set_personalResultCount = js.Any.fromFunction1(set_personalResultCount), set_promptCssClass = js.Any.fromFunction1(set_promptCssClass), set_queryGroupNames = js.Any.fromFunction1(set_queryGroupNames), set_querySuggestionCompletionInterval = js.Any.fromFunction1(set_querySuggestionCompletionInterval), set_querySuggestionCount = js.Any.fromFunction1(set_querySuggestionCount), set_querySuggestionMinimumPrefixLength = js.Any.fromFunction1(set_querySuggestionMinimumPrefixLength), set_querySuggestionsSourceID = js.Any.fromFunction1(set_querySuggestionsSourceID), set_renderTemplateId = js.Any.fromFunction1(set_renderTemplateId), set_resultsPageAddress = js.Any.fromFunction1(set_resultsPageAddress), set_searchBoxContainerId = js.Any.fromFunction1(set_searchBoxContainerId), set_searchBoxInputId = js.Any.fromFunction1(set_searchBoxInputId), set_searchBoxLinkId = js.Any.fromFunction1(set_searchBoxLinkId), set_searchBoxProgressClass = js.Any.fromFunction1(set_searchBoxProgressClass), set_serverInitialRender = js.Any.fromFunction1(set_serverInitialRender), set_setFocusOnPageLoad = js.Any.fromFunction1(set_setFocusOnPageLoad), set_showAdvancedLink = js.Any.fromFunction1(set_showAdvancedLink), set_showDataErrors = js.Any.fromFunction1(set_showDataErrors), set_showNavigation = js.Any.fromFunction1(set_showNavigation), set_showPeopleNameSuggestions = js.Any.fromFunction1(set_showPeopleNameSuggestions), set_showPreferencesLink = js.Any.fromFunction1(set_showPreferencesLink), set_showQuerySuggestions = js.Any.fromFunction1(set_showQuerySuggestions), set_states = js.Any.fromFunction1(set_states), set_suggestionsListId = js.Any.fromFunction1(set_suggestionsListId), set_tryInplaceQuery = js.Any.fromFunction1(set_tryInplaceQuery), set_updatePageTitle = js.Any.fromFunction1(set_updatePageTitle), showPrompt = showPrompt.toJsFn, toggleCssClass = js.Any.fromFunction1((t0: String) => toggleCssClass(t0).runNow()), updateDisplayControlWithNewMessages = updateDisplayControlWithNewMessages.toJsFn, updated = updated.toJsFn)
    __obj.asInstanceOf[SearchBox]
  }
  
  extension [Self <: SearchBox](x: Self) {
    
    inline def setActivate(value: (String, String, String, String, String, String, String, String, String) => Callback): Self = StObject.set(x, "activate", js.Any.fromFunction9((t0: String, t1: String, t2: String, t3: String, t4: String, t5: String, t6: String, t7: String, t8: String) => (value(t0, t1, t2, t3, t4, t5, t6, t7, t8)).runNow()))
    
    inline def setActivateDefaultNavigationBehavior(value: Callback): Self = StObject.set(x, "activateDefaultNavigationBehavior", value.toJsFn)
    
    inline def setActivateDefaultQuerySuggestionBehavior(value: Callback): Self = StObject.set(x, "activateDefaultQuerySuggestionBehavior", value.toJsFn)
    
    inline def setAdd_batchQueryIssuing(value: Any => Callback): Self = StObject.set(x, "add_batchQueryIssuing", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setAdd_batchResultReady(value: Any => Callback): Self = StObject.set(x, "add_batchResultReady", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setAdd_queryReady(value: Any => Callback): Self = StObject.set(x, "add_queryReady", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setDataProvider_QueryIssuing(value: (Any, Any) => Callback): Self = StObject.set(x, "dataProvider_QueryIssuing", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setDataProvider_QueryStateChanged(value: (Any, Any) => Callback): Self = StObject.set(x, "dataProvider_QueryStateChanged", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setDataProvider_ResultReady(value: (Any, Any) => Callback): Self = StObject.set(x, "dataProvider_ResultReady", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
    
    inline def setGet_advancedSearchPageAddress(value: CallbackTo[String]): Self = StObject.set(x, "get_advancedSearchPageAddress", value.toJsFn)
    
    inline def setGet_allowEmptySearch(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_allowEmptySearch", value.toJsFn)
    
    inline def setGet_currentPrompt(value: CallbackTo[String]): Self = StObject.set(x, "get_currentPrompt", value.toJsFn)
    
    inline def setGet_currentTerm(value: CallbackTo[String]): Self = StObject.set(x, "get_currentTerm", value.toJsFn)
    
    inline def setGet_initialPrompt(value: CallbackTo[String]): Self = StObject.set(x, "get_initialPrompt", value.toJsFn)
    
    inline def setGet_maintainQueryState(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_maintainQueryState", value.toJsFn)
    
    inline def setGet_msBeforeShowingProgress(value: CallbackTo[Double]): Self = StObject.set(x, "get_msBeforeShowingProgress", value.toJsFn)
    
    inline def setGet_navigationButtonId(value: CallbackTo[String]): Self = StObject.set(x, "get_navigationButtonId", value.toJsFn)
    
    inline def setGet_navigationListId(value: CallbackTo[String]): Self = StObject.set(x, "get_navigationListId", value.toJsFn)
    
    inline def setGet_navigationNodes(value: CallbackTo[Any]): Self = StObject.set(x, "get_navigationNodes", value.toJsFn)
    
    inline def setGet_pageTitlePrefix(value: CallbackTo[String]): Self = StObject.set(x, "get_pageTitlePrefix", value.toJsFn)
    
    inline def setGet_personalResultCount(value: CallbackTo[Double]): Self = StObject.set(x, "get_personalResultCount", value.toJsFn)
    
    inline def setGet_promptCssClass(value: CallbackTo[String]): Self = StObject.set(x, "get_promptCssClass", value.toJsFn)
    
    inline def setGet_queryGroupNames(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "get_queryGroupNames", value.toJsFn)
    
    inline def setGet_querySuggestionCompletionInterval(value: CallbackTo[Double]): Self = StObject.set(x, "get_querySuggestionCompletionInterval", value.toJsFn)
    
    inline def setGet_querySuggestionCount(value: CallbackTo[Double]): Self = StObject.set(x, "get_querySuggestionCount", value.toJsFn)
    
    inline def setGet_querySuggestionMinimumPrefixLength(value: CallbackTo[Double]): Self = StObject.set(x, "get_querySuggestionMinimumPrefixLength", value.toJsFn)
    
    inline def setGet_querySuggestionsSourceID(value: CallbackTo[String]): Self = StObject.set(x, "get_querySuggestionsSourceID", value.toJsFn)
    
    inline def setGet_resultsPageAddress(value: CallbackTo[String]): Self = StObject.set(x, "get_resultsPageAddress", value.toJsFn)
    
    inline def setGet_searchBoxContainerElement(value: CallbackTo[Element]): Self = StObject.set(x, "get_searchBoxContainerElement", value.toJsFn)
    
    inline def setGet_searchBoxContainerId(value: CallbackTo[String]): Self = StObject.set(x, "get_searchBoxContainerId", value.toJsFn)
    
    inline def setGet_searchBoxInputElement(value: CallbackTo[Element]): Self = StObject.set(x, "get_searchBoxInputElement", value.toJsFn)
    
    inline def setGet_searchBoxInputId(value: CallbackTo[String]): Self = StObject.set(x, "get_searchBoxInputId", value.toJsFn)
    
    inline def setGet_searchBoxLinkElement(value: CallbackTo[Element]): Self = StObject.set(x, "get_searchBoxLinkElement", value.toJsFn)
    
    inline def setGet_searchBoxLinkId(value: CallbackTo[String]): Self = StObject.set(x, "get_searchBoxLinkId", value.toJsFn)
    
    inline def setGet_searchBoxProgressClass(value: CallbackTo[String]): Self = StObject.set(x, "get_searchBoxProgressClass", value.toJsFn)
    
    inline def setGet_serverInitialRender(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_serverInitialRender", value.toJsFn)
    
    inline def setGet_setFocusOnPageLoad(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_setFocusOnPageLoad", value.toJsFn)
    
    inline def setGet_showAdvancedLink(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showAdvancedLink", value.toJsFn)
    
    inline def setGet_showNavigation(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showNavigation", value.toJsFn)
    
    inline def setGet_showPeopleNameSuggestions(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showPeopleNameSuggestions", value.toJsFn)
    
    inline def setGet_showPreferencesLink(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showPreferencesLink", value.toJsFn)
    
    inline def setGet_showQuerySuggestions(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showQuerySuggestions", value.toJsFn)
    
    inline def setGet_suggestionsListId(value: CallbackTo[String]): Self = StObject.set(x, "get_suggestionsListId", value.toJsFn)
    
    inline def setGet_tryInplaceQuery(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_tryInplaceQuery", value.toJsFn)
    
    inline def setGet_updatePageTitle(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_updatePageTitle", value.toJsFn)
    
    inline def setHidePrompt(value: Callback): Self = StObject.set(x, "hidePrompt", value.toJsFn)
    
    inline def setRaiseBatchQueryIssuingEvent(value: Any => Callback): Self = StObject.set(x, "raiseBatchQueryIssuingEvent", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRaiseBatchResultReadyEvent(value: Any => Callback): Self = StObject.set(x, "raiseBatchResultReadyEvent", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRaiseQueryReadyEvent(value: Any => Callback): Self = StObject.set(x, "raiseQueryReadyEvent", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRemove_batchQueryIssuing(value: Any => Callback): Self = StObject.set(x, "remove_batchQueryIssuing", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRemove_batchResultReady(value: Any => Callback): Self = StObject.set(x, "remove_batchResultReady", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRemove_queryReady(value: Any => Callback): Self = StObject.set(x, "remove_queryReady", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSearch(value: String => Callback): Self = StObject.set(x, "search", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetBorder(value: Boolean => Callback): Self = StObject.set(x, "setBorder", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_advancedSearchPageAddress(value: String => String): Self = StObject.set(x, "set_advancedSearchPageAddress", js.Any.fromFunction1(value))
    
    inline def setSet_allowEmptySearch(value: Boolean => Boolean): Self = StObject.set(x, "set_allowEmptySearch", js.Any.fromFunction1(value))
    
    inline def setSet_currentPrompt(value: String => String): Self = StObject.set(x, "set_currentPrompt", js.Any.fromFunction1(value))
    
    inline def setSet_currentTerm(value: String => String): Self = StObject.set(x, "set_currentTerm", js.Any.fromFunction1(value))
    
    inline def setSet_initialPrompt(value: String => String): Self = StObject.set(x, "set_initialPrompt", js.Any.fromFunction1(value))
    
    inline def setSet_maintainQueryState(value: Boolean => Boolean): Self = StObject.set(x, "set_maintainQueryState", js.Any.fromFunction1(value))
    
    inline def setSet_msBeforeShowingProgress(value: Double => Double): Self = StObject.set(x, "set_msBeforeShowingProgress", js.Any.fromFunction1(value))
    
    inline def setSet_navigationButtonId(value: String => String): Self = StObject.set(x, "set_navigationButtonId", js.Any.fromFunction1(value))
    
    inline def setSet_navigationListId(value: String => String): Self = StObject.set(x, "set_navigationListId", js.Any.fromFunction1(value))
    
    inline def setSet_navigationNodes(value: Any => Any): Self = StObject.set(x, "set_navigationNodes", js.Any.fromFunction1(value))
    
    inline def setSet_pageTitlePrefix(value: String => String): Self = StObject.set(x, "set_pageTitlePrefix", js.Any.fromFunction1(value))
    
    inline def setSet_personalResultCount(value: Double => Double): Self = StObject.set(x, "set_personalResultCount", js.Any.fromFunction1(value))
    
    inline def setSet_promptCssClass(value: String => String): Self = StObject.set(x, "set_promptCssClass", js.Any.fromFunction1(value))
    
    inline def setSet_queryGroupNames(value: Any => js.Array[String]): Self = StObject.set(x, "set_queryGroupNames", js.Any.fromFunction1(value))
    
    inline def setSet_querySuggestionCompletionInterval(value: Double => Double): Self = StObject.set(x, "set_querySuggestionCompletionInterval", js.Any.fromFunction1(value))
    
    inline def setSet_querySuggestionCount(value: Double => Double): Self = StObject.set(x, "set_querySuggestionCount", js.Any.fromFunction1(value))
    
    inline def setSet_querySuggestionMinimumPrefixLength(value: Double => Double): Self = StObject.set(x, "set_querySuggestionMinimumPrefixLength", js.Any.fromFunction1(value))
    
    inline def setSet_querySuggestionsSourceID(value: String => String): Self = StObject.set(x, "set_querySuggestionsSourceID", js.Any.fromFunction1(value))
    
    inline def setSet_resultsPageAddress(value: String => String): Self = StObject.set(x, "set_resultsPageAddress", js.Any.fromFunction1(value))
    
    inline def setSet_searchBoxContainerId(value: String => String): Self = StObject.set(x, "set_searchBoxContainerId", js.Any.fromFunction1(value))
    
    inline def setSet_searchBoxInputId(value: String => String): Self = StObject.set(x, "set_searchBoxInputId", js.Any.fromFunction1(value))
    
    inline def setSet_searchBoxLinkId(value: String => String): Self = StObject.set(x, "set_searchBoxLinkId", js.Any.fromFunction1(value))
    
    inline def setSet_searchBoxProgressClass(value: String => String): Self = StObject.set(x, "set_searchBoxProgressClass", js.Any.fromFunction1(value))
    
    inline def setSet_serverInitialRender(value: Boolean => Boolean): Self = StObject.set(x, "set_serverInitialRender", js.Any.fromFunction1(value))
    
    inline def setSet_setFocusOnPageLoad(value: Boolean => Boolean): Self = StObject.set(x, "set_setFocusOnPageLoad", js.Any.fromFunction1(value))
    
    inline def setSet_showAdvancedLink(value: Boolean => Boolean): Self = StObject.set(x, "set_showAdvancedLink", js.Any.fromFunction1(value))
    
    inline def setSet_showNavigation(value: Boolean => Boolean): Self = StObject.set(x, "set_showNavigation", js.Any.fromFunction1(value))
    
    inline def setSet_showPeopleNameSuggestions(value: Boolean => Boolean): Self = StObject.set(x, "set_showPeopleNameSuggestions", js.Any.fromFunction1(value))
    
    inline def setSet_showPreferencesLink(value: Boolean => Boolean): Self = StObject.set(x, "set_showPreferencesLink", js.Any.fromFunction1(value))
    
    inline def setSet_showQuerySuggestions(value: Boolean => Boolean): Self = StObject.set(x, "set_showQuerySuggestions", js.Any.fromFunction1(value))
    
    inline def setSet_suggestionsListId(value: String => String): Self = StObject.set(x, "set_suggestionsListId", js.Any.fromFunction1(value))
    
    inline def setSet_tryInplaceQuery(value: Boolean => Boolean): Self = StObject.set(x, "set_tryInplaceQuery", js.Any.fromFunction1(value))
    
    inline def setSet_updatePageTitle(value: Boolean => Boolean): Self = StObject.set(x, "set_updatePageTitle", js.Any.fromFunction1(value))
    
    inline def setShowPrompt(value: Callback): Self = StObject.set(x, "showPrompt", value.toJsFn)
  }
}
