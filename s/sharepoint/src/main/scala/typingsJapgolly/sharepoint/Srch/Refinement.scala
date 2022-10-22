package typingsJapgolly.sharepoint.Srch

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Refinement
  extends StObject
     with DisplayControl {
  
  def addRefinementFilter(filterName: String, filterToken: Any): Unit
  
  def addRefinementFilters(refiners: js.Array[Any]): Unit
  
  def addRefinementFiltersJSON(refinersJSON: String): Unit
  
  def addRefinementFiltersJSONWithOr(refinersJSON: String): Unit
  
  def addRefinementFiltersWithOp(refiners: js.Array[Any], op: String): Unit
  
  def getCurrentRefinementCategory(refinementName: String): Any
  
  /** Gets refinement control with the specified propertyName */
  def getRefinementControl(refinerName: String): RefinementControl
  
  def get_emptyRefinementMessageId(): String
  
  def get_selectedRefinementControls(): js.Array[RefinementControl]
  
  def get_useManagedNavigationRefiners(): Boolean
  
  def hasAllRefinementFilters(filterName: String, filterTokens: js.Array[String]): Boolean
  
  def hasRefinementCategory(refinementName: String): Boolean
  
  def hasRefinementFilter(filterName: String, filterToken: String): Boolean
  
  /** Returns true if selected refinement controls collection contains a control with the specified propertyName */
  def hasRefiner(refinerName: String): Boolean
  
  def removeRefinementCategory(rcs: Any, filterName: String): Unit
  
  def removeRefinementFilter(filterName: String, filterToken: String): Unit
  
  def removeRefinementFiltersJSON(refinersJSON: String): Unit
  
  def replaceRefinementFilter(oldRefinementFilter: Any, newRefinementFilter: Any): Unit
  
  def set_emptyRefinementMessageId(value: String): String
  
  def set_selectedRefinementControls(value: js.Array[RefinementControl]): js.Array[RefinementControl]
  
  def set_useManagedNavigationRefiners(value: Boolean): Boolean
  
  /** Replaces the refinement controls */
  def updateRefinementControls(newControls: js.Array[RefinementControl]): Unit
  
  def updateRefinementFilters(
    filterName: String,
    filterTokens: js.Array[String],
    op: String,
    useKQL: Boolean,
    tokenToDisplayValueMap: Any
  ): Unit
  
  def updateRefiners(refiners: js.Array[Any], op: String, useKQL: Boolean, tokenToDisplayValueMap: Any): Unit
  
  def updateRefinersJSON(refinersJSON: String): Unit
}
object Refinement {
  
  inline def apply(
    addCssClass: String => Callback,
    addRefinementFilter: (String, Any) => Callback,
    addRefinementFilters: js.Array[Any] => Callback,
    addRefinementFiltersJSON: String => Callback,
    addRefinementFiltersJSONWithOr: String => Callback,
    addRefinementFiltersWithOp: (js.Array[Any], String) => Callback,
    add_disposing: js.Function => Callback,
    add_oneTimeResultRendered: Any => Callback,
    add_propertyChanged: js.Function => Callback,
    add_queryReady: Any => Callback,
    add_resultRendered: Any => Callback,
    alternateRenderContext: Any,
    alternateRenderer: Any,
    beginUpdate: Callback,
    clickHandler: Event => Any,
    dataProvider_QueryIssuing: (Any, Any) => Callback,
    dataProvider_ResultReady: (Any, Any) => Callback,
    dispose: Callback,
    endUpdate: Callback,
    getCurrentRefinementCategory: String => Any,
    getRefinementControl: String => RefinementControl,
    get_alternateErrorMessage: CallbackTo[String],
    get_currentResultTableCollection: CallbackTo[Any],
    get_dataProvider: CallbackTo[DataProvider],
    get_delayLoadTemplateScripts: CallbackTo[Boolean],
    get_element: CallbackTo[HTMLElement],
    get_emptyMessage: CallbackTo[String],
    get_emptyRefinementMessageId: CallbackTo[String],
    get_events: CallbackTo[Any],
    get_id: CallbackTo[String],
    get_isInitialLoad: CallbackTo[Boolean],
    get_isInitialized: CallbackTo[Boolean],
    get_isUpdating: CallbackTo[Boolean],
    get_messages: CallbackTo[js.Array[Any]],
    get_nextUniqueId: CallbackTo[String],
    get_queryGroupName: CallbackTo[String],
    get_renderTemplateId: CallbackTo[String],
    get_renderedResult: CallbackTo[Boolean],
    get_selectedRefinementControls: CallbackTo[js.Array[RefinementControl]],
    get_shouldShowNoResultMessage: CallbackTo[Boolean],
    get_showDataErrors: CallbackTo[Boolean],
    get_states: CallbackTo[Any],
    get_useManagedNavigationRefiners: CallbackTo[Boolean],
    hasAllRefinementFilters: (String, js.Array[String]) => Boolean,
    hasMessages: CallbackTo[Any],
    hasRefinementCategory: String => Boolean,
    hasRefinementFilter: (String, String) => Boolean,
    hasRefiner: String => Boolean,
    initialize: Callback,
    invokeAlternateRender: (Any, Any, Any) => Any,
    invokeClientRenderer: (Any, Any) => Any,
    loadRenderTemplateScripts: (Any, Any, Any, Any, Any) => Boolean,
    loadServerTemplateScripts: Callback,
    loaded: Boolean,
    onBubbleEvent: (Any, Any) => Boolean,
    processDataErrorMessages: Any => Any,
    processDataProviderErrors: Any => Callback,
    processQueryIssuing: Any => Callback,
    processRenderingErrorMessages: Any => Any,
    processResultReady: Any => Callback,
    raiseBubbleEvent: (Any, Any) => Callback,
    raiseOneTimeResultRenderedEvent: Any => Callback,
    raisePropertyChanged: String => Callback,
    raiseQueryReadyEvent: Any => Callback,
    raiseResultRenderedEvent: Any => Callback,
    refresh: Any => Callback,
    removeCssClass: String => Callback,
    removeRefinementCategory: (Any, String) => Callback,
    removeRefinementFilter: (String, String) => Callback,
    removeRefinementFiltersJSON: String => Callback,
    remove_disposing: js.Function => Callback,
    remove_oneTimeResultRendered: Any => Callback,
    remove_propertyChanged: js.Function => Callback,
    remove_queryReady: Any => Callback,
    remove_resultRendered: Any => Callback,
    render: Callback,
    renderControl: (Any, Any) => Callback,
    replaceRefinementFilter: (Any, Any) => Callback,
    scriptApplication_Load: (Any, Any) => Callback,
    scriptApplication_PostLoad: (Any, Any) => Callback,
    scriptApplication_PreLoad: (Any, Any) => Callback,
    serverTemplateScriptsCallback: Callback,
    serverTemplateScriptsToLoad: js.Array[Any],
    setControlElementVisibility: Boolean => Any,
    set_alternateErrorMessage: String => String,
    set_currentResultTableCollection: Any => Any,
    set_delayLoadTemplateScripts: Boolean => Boolean,
    set_emptyMessage: String => String,
    set_emptyRefinementMessageId: String => String,
    set_id: String => Callback,
    set_messages: js.Array[Any] => js.Array[Any],
    set_queryGroupName: String => String,
    set_renderTemplateId: String => String,
    set_renderedResult: Boolean => Boolean,
    set_selectedRefinementControls: js.Array[RefinementControl] => js.Array[RefinementControl],
    set_shouldShowNoResultMessage: Boolean => Boolean,
    set_showDataErrors: Boolean => Boolean,
    set_states: Any => Any,
    set_useManagedNavigationRefiners: Boolean => Boolean,
    toggleCssClass: String => Callback,
    updateDisplayControlWithNewMessages: CallbackTo[Any],
    updateRefinementControls: js.Array[RefinementControl] => Callback,
    updateRefinementFilters: (String, js.Array[String], String, Boolean, Any) => Callback,
    updateRefiners: (js.Array[Any], String, Boolean, Any) => Callback,
    updateRefinersJSON: String => Callback,
    updated: Callback
  ): Refinement = {
    val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1((t0: String) => addCssClass(t0).runNow()), addRefinementFilter = js.Any.fromFunction2((t0: String, t1: Any) => (addRefinementFilter(t0, t1)).runNow()), addRefinementFilters = js.Any.fromFunction1((t0: js.Array[Any]) => addRefinementFilters(t0).runNow()), addRefinementFiltersJSON = js.Any.fromFunction1((t0: String) => addRefinementFiltersJSON(t0).runNow()), addRefinementFiltersJSONWithOr = js.Any.fromFunction1((t0: String) => addRefinementFiltersJSONWithOr(t0).runNow()), addRefinementFiltersWithOp = js.Any.fromFunction2((t0: js.Array[Any], t1: String) => (addRefinementFiltersWithOp(t0, t1)).runNow()), add_disposing = js.Any.fromFunction1((t0: js.Function) => add_disposing(t0).runNow()), add_oneTimeResultRendered = js.Any.fromFunction1((t0: Any) => add_oneTimeResultRendered(t0).runNow()), add_propertyChanged = js.Any.fromFunction1((t0: js.Function) => add_propertyChanged(t0).runNow()), add_queryReady = js.Any.fromFunction1((t0: Any) => add_queryReady(t0).runNow()), add_resultRendered = js.Any.fromFunction1((t0: Any) => add_resultRendered(t0).runNow()), alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], beginUpdate = beginUpdate.toJsFn, clickHandler = js.Any.fromFunction1(clickHandler), dataProvider_QueryIssuing = js.Any.fromFunction2((t0: Any, t1: Any) => (dataProvider_QueryIssuing(t0, t1)).runNow()), dataProvider_ResultReady = js.Any.fromFunction2((t0: Any, t1: Any) => (dataProvider_ResultReady(t0, t1)).runNow()), dispose = dispose.toJsFn, endUpdate = endUpdate.toJsFn, getCurrentRefinementCategory = js.Any.fromFunction1(getCurrentRefinementCategory), getRefinementControl = js.Any.fromFunction1(getRefinementControl), get_alternateErrorMessage = get_alternateErrorMessage.toJsFn, get_currentResultTableCollection = get_currentResultTableCollection.toJsFn, get_dataProvider = get_dataProvider.toJsFn, get_delayLoadTemplateScripts = get_delayLoadTemplateScripts.toJsFn, get_element = get_element.toJsFn, get_emptyMessage = get_emptyMessage.toJsFn, get_emptyRefinementMessageId = get_emptyRefinementMessageId.toJsFn, get_events = get_events.toJsFn, get_id = get_id.toJsFn, get_isInitialLoad = get_isInitialLoad.toJsFn, get_isInitialized = get_isInitialized.toJsFn, get_isUpdating = get_isUpdating.toJsFn, get_messages = get_messages.toJsFn, get_nextUniqueId = get_nextUniqueId.toJsFn, get_queryGroupName = get_queryGroupName.toJsFn, get_renderTemplateId = get_renderTemplateId.toJsFn, get_renderedResult = get_renderedResult.toJsFn, get_selectedRefinementControls = get_selectedRefinementControls.toJsFn, get_shouldShowNoResultMessage = get_shouldShowNoResultMessage.toJsFn, get_showDataErrors = get_showDataErrors.toJsFn, get_states = get_states.toJsFn, get_useManagedNavigationRefiners = get_useManagedNavigationRefiners.toJsFn, hasAllRefinementFilters = js.Any.fromFunction2(hasAllRefinementFilters), hasMessages = hasMessages.toJsFn, hasRefinementCategory = js.Any.fromFunction1(hasRefinementCategory), hasRefinementFilter = js.Any.fromFunction2(hasRefinementFilter), hasRefiner = js.Any.fromFunction1(hasRefiner), initialize = initialize.toJsFn, invokeAlternateRender = js.Any.fromFunction3(invokeAlternateRender), invokeClientRenderer = js.Any.fromFunction2(invokeClientRenderer), loadRenderTemplateScripts = js.Any.fromFunction5(loadRenderTemplateScripts), loadServerTemplateScripts = loadServerTemplateScripts.toJsFn, loaded = loaded.asInstanceOf[js.Any], onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), processDataErrorMessages = js.Any.fromFunction1(processDataErrorMessages), processDataProviderErrors = js.Any.fromFunction1((t0: Any) => processDataProviderErrors(t0).runNow()), processQueryIssuing = js.Any.fromFunction1((t0: Any) => processQueryIssuing(t0).runNow()), processRenderingErrorMessages = js.Any.fromFunction1(processRenderingErrorMessages), processResultReady = js.Any.fromFunction1((t0: Any) => processResultReady(t0).runNow()), raiseBubbleEvent = js.Any.fromFunction2((t0: Any, t1: Any) => (raiseBubbleEvent(t0, t1)).runNow()), raiseOneTimeResultRenderedEvent = js.Any.fromFunction1((t0: Any) => raiseOneTimeResultRenderedEvent(t0).runNow()), raisePropertyChanged = js.Any.fromFunction1((t0: String) => raisePropertyChanged(t0).runNow()), raiseQueryReadyEvent = js.Any.fromFunction1((t0: Any) => raiseQueryReadyEvent(t0).runNow()), raiseResultRenderedEvent = js.Any.fromFunction1((t0: Any) => raiseResultRenderedEvent(t0).runNow()), refresh = js.Any.fromFunction1((t0: Any) => refresh(t0).runNow()), removeCssClass = js.Any.fromFunction1((t0: String) => removeCssClass(t0).runNow()), removeRefinementCategory = js.Any.fromFunction2((t0: Any, t1: String) => (removeRefinementCategory(t0, t1)).runNow()), removeRefinementFilter = js.Any.fromFunction2((t0: String, t1: String) => (removeRefinementFilter(t0, t1)).runNow()), removeRefinementFiltersJSON = js.Any.fromFunction1((t0: String) => removeRefinementFiltersJSON(t0).runNow()), remove_disposing = js.Any.fromFunction1((t0: js.Function) => remove_disposing(t0).runNow()), remove_oneTimeResultRendered = js.Any.fromFunction1((t0: Any) => remove_oneTimeResultRendered(t0).runNow()), remove_propertyChanged = js.Any.fromFunction1((t0: js.Function) => remove_propertyChanged(t0).runNow()), remove_queryReady = js.Any.fromFunction1((t0: Any) => remove_queryReady(t0).runNow()), remove_resultRendered = js.Any.fromFunction1((t0: Any) => remove_resultRendered(t0).runNow()), render = render.toJsFn, renderControl = js.Any.fromFunction2((t0: Any, t1: Any) => (renderControl(t0, t1)).runNow()), replaceRefinementFilter = js.Any.fromFunction2((t0: Any, t1: Any) => (replaceRefinementFilter(t0, t1)).runNow()), scriptApplication_Load = js.Any.fromFunction2((t0: Any, t1: Any) => (scriptApplication_Load(t0, t1)).runNow()), scriptApplication_PostLoad = js.Any.fromFunction2((t0: Any, t1: Any) => (scriptApplication_PostLoad(t0, t1)).runNow()), scriptApplication_PreLoad = js.Any.fromFunction2((t0: Any, t1: Any) => (scriptApplication_PreLoad(t0, t1)).runNow()), serverTemplateScriptsCallback = serverTemplateScriptsCallback.toJsFn, serverTemplateScriptsToLoad = serverTemplateScriptsToLoad.asInstanceOf[js.Any], setControlElementVisibility = js.Any.fromFunction1(setControlElementVisibility), set_alternateErrorMessage = js.Any.fromFunction1(set_alternateErrorMessage), set_currentResultTableCollection = js.Any.fromFunction1(set_currentResultTableCollection), set_delayLoadTemplateScripts = js.Any.fromFunction1(set_delayLoadTemplateScripts), set_emptyMessage = js.Any.fromFunction1(set_emptyMessage), set_emptyRefinementMessageId = js.Any.fromFunction1(set_emptyRefinementMessageId), set_id = js.Any.fromFunction1((t0: String) => set_id(t0).runNow()), set_messages = js.Any.fromFunction1(set_messages), set_queryGroupName = js.Any.fromFunction1(set_queryGroupName), set_renderTemplateId = js.Any.fromFunction1(set_renderTemplateId), set_renderedResult = js.Any.fromFunction1(set_renderedResult), set_selectedRefinementControls = js.Any.fromFunction1(set_selectedRefinementControls), set_shouldShowNoResultMessage = js.Any.fromFunction1(set_shouldShowNoResultMessage), set_showDataErrors = js.Any.fromFunction1(set_showDataErrors), set_states = js.Any.fromFunction1(set_states), set_useManagedNavigationRefiners = js.Any.fromFunction1(set_useManagedNavigationRefiners), toggleCssClass = js.Any.fromFunction1((t0: String) => toggleCssClass(t0).runNow()), updateDisplayControlWithNewMessages = updateDisplayControlWithNewMessages.toJsFn, updateRefinementControls = js.Any.fromFunction1((t0: js.Array[RefinementControl]) => updateRefinementControls(t0).runNow()), updateRefinementFilters = js.Any.fromFunction5((t0: String, t1: js.Array[String], t2: String, t3: Boolean, t4: Any) => (updateRefinementFilters(t0, t1, t2, t3, t4)).runNow()), updateRefiners = js.Any.fromFunction4((t0: js.Array[Any], t1: String, t2: Boolean, t3: Any) => (updateRefiners(t0, t1, t2, t3)).runNow()), updateRefinersJSON = js.Any.fromFunction1((t0: String) => updateRefinersJSON(t0).runNow()), updated = updated.toJsFn)
    __obj.asInstanceOf[Refinement]
  }
  
  extension [Self <: Refinement](x: Self) {
    
    inline def setAddRefinementFilter(value: (String, Any) => Callback): Self = StObject.set(x, "addRefinementFilter", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setAddRefinementFilters(value: js.Array[Any] => Callback): Self = StObject.set(x, "addRefinementFilters", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
    
    inline def setAddRefinementFiltersJSON(value: String => Callback): Self = StObject.set(x, "addRefinementFiltersJSON", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setAddRefinementFiltersJSONWithOr(value: String => Callback): Self = StObject.set(x, "addRefinementFiltersJSONWithOr", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setAddRefinementFiltersWithOp(value: (js.Array[Any], String) => Callback): Self = StObject.set(x, "addRefinementFiltersWithOp", js.Any.fromFunction2((t0: js.Array[Any], t1: String) => (value(t0, t1)).runNow()))
    
    inline def setGetCurrentRefinementCategory(value: String => Any): Self = StObject.set(x, "getCurrentRefinementCategory", js.Any.fromFunction1(value))
    
    inline def setGetRefinementControl(value: String => RefinementControl): Self = StObject.set(x, "getRefinementControl", js.Any.fromFunction1(value))
    
    inline def setGet_emptyRefinementMessageId(value: CallbackTo[String]): Self = StObject.set(x, "get_emptyRefinementMessageId", value.toJsFn)
    
    inline def setGet_selectedRefinementControls(value: CallbackTo[js.Array[RefinementControl]]): Self = StObject.set(x, "get_selectedRefinementControls", value.toJsFn)
    
    inline def setGet_useManagedNavigationRefiners(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_useManagedNavigationRefiners", value.toJsFn)
    
    inline def setHasAllRefinementFilters(value: (String, js.Array[String]) => Boolean): Self = StObject.set(x, "hasAllRefinementFilters", js.Any.fromFunction2(value))
    
    inline def setHasRefinementCategory(value: String => Boolean): Self = StObject.set(x, "hasRefinementCategory", js.Any.fromFunction1(value))
    
    inline def setHasRefinementFilter(value: (String, String) => Boolean): Self = StObject.set(x, "hasRefinementFilter", js.Any.fromFunction2(value))
    
    inline def setHasRefiner(value: String => Boolean): Self = StObject.set(x, "hasRefiner", js.Any.fromFunction1(value))
    
    inline def setRemoveRefinementCategory(value: (Any, String) => Callback): Self = StObject.set(x, "removeRefinementCategory", js.Any.fromFunction2((t0: Any, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setRemoveRefinementFilter(value: (String, String) => Callback): Self = StObject.set(x, "removeRefinementFilter", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setRemoveRefinementFiltersJSON(value: String => Callback): Self = StObject.set(x, "removeRefinementFiltersJSON", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setReplaceRefinementFilter(value: (Any, Any) => Callback): Self = StObject.set(x, "replaceRefinementFilter", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSet_emptyRefinementMessageId(value: String => String): Self = StObject.set(x, "set_emptyRefinementMessageId", js.Any.fromFunction1(value))
    
    inline def setSet_selectedRefinementControls(value: js.Array[RefinementControl] => js.Array[RefinementControl]): Self = StObject.set(x, "set_selectedRefinementControls", js.Any.fromFunction1(value))
    
    inline def setSet_useManagedNavigationRefiners(value: Boolean => Boolean): Self = StObject.set(x, "set_useManagedNavigationRefiners", js.Any.fromFunction1(value))
    
    inline def setUpdateRefinementControls(value: js.Array[RefinementControl] => Callback): Self = StObject.set(x, "updateRefinementControls", js.Any.fromFunction1((t0: js.Array[RefinementControl]) => value(t0).runNow()))
    
    inline def setUpdateRefinementFilters(value: (String, js.Array[String], String, Boolean, Any) => Callback): Self = StObject.set(x, "updateRefinementFilters", js.Any.fromFunction5((t0: String, t1: js.Array[String], t2: String, t3: Boolean, t4: Any) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setUpdateRefiners(value: (js.Array[Any], String, Boolean, Any) => Callback): Self = StObject.set(x, "updateRefiners", js.Any.fromFunction4((t0: js.Array[Any], t1: String, t2: Boolean, t3: Any) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setUpdateRefinersJSON(value: String => Callback): Self = StObject.set(x, "updateRefinersJSON", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
