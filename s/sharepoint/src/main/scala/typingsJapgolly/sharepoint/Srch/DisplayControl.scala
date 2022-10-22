package typingsJapgolly.sharepoint.Srch

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayControl
  extends StObject
     with ClientControl {
  
  def add_oneTimeResultRendered(value: Any): Unit
  
  def add_queryReady(value: Any): Unit
  
  def add_resultRendered(value: Any): Unit
  
  def dataProvider_QueryIssuing(sender: Any, e: Any): Unit
  
  def dataProvider_ResultReady(sender: Any, e: Any): Unit
  
  def get_currentResultTableCollection(): Any
  
  def get_dataProvider(): DataProvider
  
  def get_emptyMessage(): String
  
  def get_queryGroupName(): String
  
  def get_renderedResult(): Boolean
  
  def get_shouldShowNoResultMessage(): Boolean
  
  def processQueryIssuing(queryState: Any): Unit
  
  def processResultReady(resultTableCollection: Any): Unit
  
  def raiseOneTimeResultRenderedEvent(arg: Any): Unit
  
  def raiseQueryReadyEvent(arg: Any): Unit
  
  def raiseResultRenderedEvent(arg: Any): Unit
  
  def refresh(queryState: Any): Unit
  
  def remove_oneTimeResultRendered(value: Any): Unit
  
  def remove_queryReady(value: Any): Unit
  
  def remove_resultRendered(value: Any): Unit
  
  def render(): Unit
  
  def set_currentResultTableCollection(value: Any): Any
  
  def set_emptyMessage(value: String): String
  
  def set_queryGroupName(value: String): String
  
  def set_renderedResult(value: Boolean): Boolean
  
  def set_shouldShowNoResultMessage(value: Boolean): Boolean
}
object DisplayControl {
  
  inline def apply(
    addCssClass: String => Callback,
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
    get_alternateErrorMessage: CallbackTo[String],
    get_currentResultTableCollection: CallbackTo[Any],
    get_dataProvider: CallbackTo[DataProvider],
    get_delayLoadTemplateScripts: CallbackTo[Boolean],
    get_element: CallbackTo[HTMLElement],
    get_emptyMessage: CallbackTo[String],
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
    get_shouldShowNoResultMessage: CallbackTo[Boolean],
    get_showDataErrors: CallbackTo[Boolean],
    get_states: CallbackTo[Any],
    hasMessages: CallbackTo[Any],
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
    setControlElementVisibility: Boolean => Any,
    set_alternateErrorMessage: String => String,
    set_currentResultTableCollection: Any => Any,
    set_delayLoadTemplateScripts: Boolean => Boolean,
    set_emptyMessage: String => String,
    set_id: String => Callback,
    set_messages: js.Array[Any] => js.Array[Any],
    set_queryGroupName: String => String,
    set_renderTemplateId: String => String,
    set_renderedResult: Boolean => Boolean,
    set_shouldShowNoResultMessage: Boolean => Boolean,
    set_showDataErrors: Boolean => Boolean,
    set_states: Any => Any,
    toggleCssClass: String => Callback,
    updateDisplayControlWithNewMessages: CallbackTo[Any],
    updated: Callback
  ): DisplayControl = {
    val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1((t0: String) => addCssClass(t0).runNow()), add_disposing = js.Any.fromFunction1((t0: js.Function) => add_disposing(t0).runNow()), add_oneTimeResultRendered = js.Any.fromFunction1((t0: Any) => add_oneTimeResultRendered(t0).runNow()), add_propertyChanged = js.Any.fromFunction1((t0: js.Function) => add_propertyChanged(t0).runNow()), add_queryReady = js.Any.fromFunction1((t0: Any) => add_queryReady(t0).runNow()), add_resultRendered = js.Any.fromFunction1((t0: Any) => add_resultRendered(t0).runNow()), alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], beginUpdate = beginUpdate.toJsFn, clickHandler = js.Any.fromFunction1(clickHandler), dataProvider_QueryIssuing = js.Any.fromFunction2((t0: Any, t1: Any) => (dataProvider_QueryIssuing(t0, t1)).runNow()), dataProvider_ResultReady = js.Any.fromFunction2((t0: Any, t1: Any) => (dataProvider_ResultReady(t0, t1)).runNow()), dispose = dispose.toJsFn, endUpdate = endUpdate.toJsFn, get_alternateErrorMessage = get_alternateErrorMessage.toJsFn, get_currentResultTableCollection = get_currentResultTableCollection.toJsFn, get_dataProvider = get_dataProvider.toJsFn, get_delayLoadTemplateScripts = get_delayLoadTemplateScripts.toJsFn, get_element = get_element.toJsFn, get_emptyMessage = get_emptyMessage.toJsFn, get_events = get_events.toJsFn, get_id = get_id.toJsFn, get_isInitialLoad = get_isInitialLoad.toJsFn, get_isInitialized = get_isInitialized.toJsFn, get_isUpdating = get_isUpdating.toJsFn, get_messages = get_messages.toJsFn, get_nextUniqueId = get_nextUniqueId.toJsFn, get_queryGroupName = get_queryGroupName.toJsFn, get_renderTemplateId = get_renderTemplateId.toJsFn, get_renderedResult = get_renderedResult.toJsFn, get_shouldShowNoResultMessage = get_shouldShowNoResultMessage.toJsFn, get_showDataErrors = get_showDataErrors.toJsFn, get_states = get_states.toJsFn, hasMessages = hasMessages.toJsFn, initialize = initialize.toJsFn, invokeAlternateRender = js.Any.fromFunction3(invokeAlternateRender), invokeClientRenderer = js.Any.fromFunction2(invokeClientRenderer), loadRenderTemplateScripts = js.Any.fromFunction5(loadRenderTemplateScripts), loadServerTemplateScripts = loadServerTemplateScripts.toJsFn, loaded = loaded.asInstanceOf[js.Any], onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), processDataErrorMessages = js.Any.fromFunction1(processDataErrorMessages), processDataProviderErrors = js.Any.fromFunction1((t0: Any) => processDataProviderErrors(t0).runNow()), processQueryIssuing = js.Any.fromFunction1((t0: Any) => processQueryIssuing(t0).runNow()), processRenderingErrorMessages = js.Any.fromFunction1(processRenderingErrorMessages), processResultReady = js.Any.fromFunction1((t0: Any) => processResultReady(t0).runNow()), raiseBubbleEvent = js.Any.fromFunction2((t0: Any, t1: Any) => (raiseBubbleEvent(t0, t1)).runNow()), raiseOneTimeResultRenderedEvent = js.Any.fromFunction1((t0: Any) => raiseOneTimeResultRenderedEvent(t0).runNow()), raisePropertyChanged = js.Any.fromFunction1((t0: String) => raisePropertyChanged(t0).runNow()), raiseQueryReadyEvent = js.Any.fromFunction1((t0: Any) => raiseQueryReadyEvent(t0).runNow()), raiseResultRenderedEvent = js.Any.fromFunction1((t0: Any) => raiseResultRenderedEvent(t0).runNow()), refresh = js.Any.fromFunction1((t0: Any) => refresh(t0).runNow()), removeCssClass = js.Any.fromFunction1((t0: String) => removeCssClass(t0).runNow()), remove_disposing = js.Any.fromFunction1((t0: js.Function) => remove_disposing(t0).runNow()), remove_oneTimeResultRendered = js.Any.fromFunction1((t0: Any) => remove_oneTimeResultRendered(t0).runNow()), remove_propertyChanged = js.Any.fromFunction1((t0: js.Function) => remove_propertyChanged(t0).runNow()), remove_queryReady = js.Any.fromFunction1((t0: Any) => remove_queryReady(t0).runNow()), remove_resultRendered = js.Any.fromFunction1((t0: Any) => remove_resultRendered(t0).runNow()), render = render.toJsFn, renderControl = js.Any.fromFunction2((t0: Any, t1: Any) => (renderControl(t0, t1)).runNow()), scriptApplication_Load = js.Any.fromFunction2((t0: Any, t1: Any) => (scriptApplication_Load(t0, t1)).runNow()), scriptApplication_PostLoad = js.Any.fromFunction2((t0: Any, t1: Any) => (scriptApplication_PostLoad(t0, t1)).runNow()), scriptApplication_PreLoad = js.Any.fromFunction2((t0: Any, t1: Any) => (scriptApplication_PreLoad(t0, t1)).runNow()), serverTemplateScriptsCallback = serverTemplateScriptsCallback.toJsFn, serverTemplateScriptsToLoad = serverTemplateScriptsToLoad.asInstanceOf[js.Any], setControlElementVisibility = js.Any.fromFunction1(setControlElementVisibility), set_alternateErrorMessage = js.Any.fromFunction1(set_alternateErrorMessage), set_currentResultTableCollection = js.Any.fromFunction1(set_currentResultTableCollection), set_delayLoadTemplateScripts = js.Any.fromFunction1(set_delayLoadTemplateScripts), set_emptyMessage = js.Any.fromFunction1(set_emptyMessage), set_id = js.Any.fromFunction1((t0: String) => set_id(t0).runNow()), set_messages = js.Any.fromFunction1(set_messages), set_queryGroupName = js.Any.fromFunction1(set_queryGroupName), set_renderTemplateId = js.Any.fromFunction1(set_renderTemplateId), set_renderedResult = js.Any.fromFunction1(set_renderedResult), set_shouldShowNoResultMessage = js.Any.fromFunction1(set_shouldShowNoResultMessage), set_showDataErrors = js.Any.fromFunction1(set_showDataErrors), set_states = js.Any.fromFunction1(set_states), toggleCssClass = js.Any.fromFunction1((t0: String) => toggleCssClass(t0).runNow()), updateDisplayControlWithNewMessages = updateDisplayControlWithNewMessages.toJsFn, updated = updated.toJsFn)
    __obj.asInstanceOf[DisplayControl]
  }
  
  extension [Self <: DisplayControl](x: Self) {
    
    inline def setAdd_oneTimeResultRendered(value: Any => Callback): Self = StObject.set(x, "add_oneTimeResultRendered", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setAdd_queryReady(value: Any => Callback): Self = StObject.set(x, "add_queryReady", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setAdd_resultRendered(value: Any => Callback): Self = StObject.set(x, "add_resultRendered", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setDataProvider_QueryIssuing(value: (Any, Any) => Callback): Self = StObject.set(x, "dataProvider_QueryIssuing", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setDataProvider_ResultReady(value: (Any, Any) => Callback): Self = StObject.set(x, "dataProvider_ResultReady", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setGet_currentResultTableCollection(value: CallbackTo[Any]): Self = StObject.set(x, "get_currentResultTableCollection", value.toJsFn)
    
    inline def setGet_dataProvider(value: CallbackTo[DataProvider]): Self = StObject.set(x, "get_dataProvider", value.toJsFn)
    
    inline def setGet_emptyMessage(value: CallbackTo[String]): Self = StObject.set(x, "get_emptyMessage", value.toJsFn)
    
    inline def setGet_queryGroupName(value: CallbackTo[String]): Self = StObject.set(x, "get_queryGroupName", value.toJsFn)
    
    inline def setGet_renderedResult(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_renderedResult", value.toJsFn)
    
    inline def setGet_shouldShowNoResultMessage(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_shouldShowNoResultMessage", value.toJsFn)
    
    inline def setProcessQueryIssuing(value: Any => Callback): Self = StObject.set(x, "processQueryIssuing", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setProcessResultReady(value: Any => Callback): Self = StObject.set(x, "processResultReady", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRaiseOneTimeResultRenderedEvent(value: Any => Callback): Self = StObject.set(x, "raiseOneTimeResultRenderedEvent", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRaiseQueryReadyEvent(value: Any => Callback): Self = StObject.set(x, "raiseQueryReadyEvent", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRaiseResultRenderedEvent(value: Any => Callback): Self = StObject.set(x, "raiseResultRenderedEvent", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRefresh(value: Any => Callback): Self = StObject.set(x, "refresh", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRemove_oneTimeResultRendered(value: Any => Callback): Self = StObject.set(x, "remove_oneTimeResultRendered", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRemove_queryReady(value: Any => Callback): Self = StObject.set(x, "remove_queryReady", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRemove_resultRendered(value: Any => Callback): Self = StObject.set(x, "remove_resultRendered", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRender(value: Callback): Self = StObject.set(x, "render", value.toJsFn)
    
    inline def setSet_currentResultTableCollection(value: Any => Any): Self = StObject.set(x, "set_currentResultTableCollection", js.Any.fromFunction1(value))
    
    inline def setSet_emptyMessage(value: String => String): Self = StObject.set(x, "set_emptyMessage", js.Any.fromFunction1(value))
    
    inline def setSet_queryGroupName(value: String => String): Self = StObject.set(x, "set_queryGroupName", js.Any.fromFunction1(value))
    
    inline def setSet_renderedResult(value: Boolean => Boolean): Self = StObject.set(x, "set_renderedResult", js.Any.fromFunction1(value))
    
    inline def setSet_shouldShowNoResultMessage(value: Boolean => Boolean): Self = StObject.set(x, "set_shouldShowNoResultMessage", js.Any.fromFunction1(value))
  }
}
