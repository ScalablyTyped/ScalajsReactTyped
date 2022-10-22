package typingsJapgolly.sharepoint.Srch

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.microsoftAjax.Sys.UI.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientControl
  extends StObject
     with Control {
  
  var alternateRenderContext: Any
  
  var alternateRenderer: Any
  
  def clickHandler(e: Event): Any
  
  def get_alternateErrorMessage(): String
  
  /** Returns true if control will load scripts defined by the serverTemplateScriptsToLoad field after control load. True by default. */
  def get_delayLoadTemplateScripts(): Boolean
  
  /** returns true if control has already been loaded at least once */
  def get_isInitialLoad(): Boolean
  
  def get_messages(): js.Array[Any]
  
  /** returns next unique identifier for nested controls */
  def get_nextUniqueId(): String
  
  /** Gets the id of View display template that is used to render this control.
    * Example: '~sitecollection/_catalogs/masterpage/Display Templates/Search/Control_SearchResults.js'
    */
  def get_renderTemplateId(): String
  
  def get_showDataErrors(): Boolean
  
  def get_states(): Any
  
  def hasMessages(): Any
  
  def invokeAlternateRender(callback: Any, container: Any, ctx: Any): Any
  
  def invokeClientRenderer(node: Any, ctx: Any): Any
  
  def loadRenderTemplateScripts(scriptReferences: Any, success: Any, failure: Any, timeout: Any, loadStandAloneCustomScripts: Any): Boolean
  
  def loadServerTemplateScripts(): Unit
  
  var loaded: Boolean
  
  def processDataErrorMessages(dataErrorsList: Any): Any
  
  def processDataProviderErrors(dataProviderToProcess: Any): Unit
  
  def processRenderingErrorMessages(ctx: Any): Any
  
  def renderControl(listData: Any, dataProvider: Any): Unit
  
  def scriptApplication_Load(sender: Any, e: Any): Unit
  
  def scriptApplication_PostLoad(sender: Any, e: Any): Unit
  
  def scriptApplication_PreLoad(sender: Any, e: Any): Unit
  
  def serverTemplateScriptsCallback(): Unit
  
  var serverTemplateScriptsToLoad: js.Array[Any]
  
  /** show/hide the DOM element associated with control */
  def setControlElementVisibility(showElement: Boolean): Any
  
  def set_alternateErrorMessage(value: String): String
  
  /** If set to true, control will load scripts defined by the serverTemplateScriptsToLoad field after control load. True by default. */
  def set_delayLoadTemplateScripts(value: Boolean): Boolean
  
  def set_messages(value: js.Array[Any]): js.Array[Any]
  
  def set_renderTemplateId(value: String): String
  
  /** False by default. */
  def set_showDataErrors(value: Boolean): Boolean
  
  def set_states(value: Any): Any
  
  def updateDisplayControlWithNewMessages(): Any
}
object ClientControl {
  
  inline def apply(
    addCssClass: String => Callback,
    add_disposing: js.Function => Callback,
    add_propertyChanged: js.Function => Callback,
    alternateRenderContext: Any,
    alternateRenderer: Any,
    beginUpdate: Callback,
    clickHandler: Event => Any,
    dispose: Callback,
    endUpdate: Callback,
    get_alternateErrorMessage: CallbackTo[String],
    get_delayLoadTemplateScripts: CallbackTo[Boolean],
    get_element: CallbackTo[HTMLElement],
    get_events: CallbackTo[Any],
    get_id: CallbackTo[String],
    get_isInitialLoad: CallbackTo[Boolean],
    get_isInitialized: CallbackTo[Boolean],
    get_isUpdating: CallbackTo[Boolean],
    get_messages: CallbackTo[js.Array[Any]],
    get_nextUniqueId: CallbackTo[String],
    get_renderTemplateId: CallbackTo[String],
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
    processRenderingErrorMessages: Any => Any,
    raiseBubbleEvent: (Any, Any) => Callback,
    raisePropertyChanged: String => Callback,
    removeCssClass: String => Callback,
    remove_disposing: js.Function => Callback,
    remove_propertyChanged: js.Function => Callback,
    renderControl: (Any, Any) => Callback,
    scriptApplication_Load: (Any, Any) => Callback,
    scriptApplication_PostLoad: (Any, Any) => Callback,
    scriptApplication_PreLoad: (Any, Any) => Callback,
    serverTemplateScriptsCallback: Callback,
    serverTemplateScriptsToLoad: js.Array[Any],
    setControlElementVisibility: Boolean => Any,
    set_alternateErrorMessage: String => String,
    set_delayLoadTemplateScripts: Boolean => Boolean,
    set_id: String => Callback,
    set_messages: js.Array[Any] => js.Array[Any],
    set_renderTemplateId: String => String,
    set_showDataErrors: Boolean => Boolean,
    set_states: Any => Any,
    toggleCssClass: String => Callback,
    updateDisplayControlWithNewMessages: CallbackTo[Any],
    updated: Callback
  ): ClientControl = {
    val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1((t0: String) => addCssClass(t0).runNow()), add_disposing = js.Any.fromFunction1((t0: js.Function) => add_disposing(t0).runNow()), add_propertyChanged = js.Any.fromFunction1((t0: js.Function) => add_propertyChanged(t0).runNow()), alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], beginUpdate = beginUpdate.toJsFn, clickHandler = js.Any.fromFunction1(clickHandler), dispose = dispose.toJsFn, endUpdate = endUpdate.toJsFn, get_alternateErrorMessage = get_alternateErrorMessage.toJsFn, get_delayLoadTemplateScripts = get_delayLoadTemplateScripts.toJsFn, get_element = get_element.toJsFn, get_events = get_events.toJsFn, get_id = get_id.toJsFn, get_isInitialLoad = get_isInitialLoad.toJsFn, get_isInitialized = get_isInitialized.toJsFn, get_isUpdating = get_isUpdating.toJsFn, get_messages = get_messages.toJsFn, get_nextUniqueId = get_nextUniqueId.toJsFn, get_renderTemplateId = get_renderTemplateId.toJsFn, get_showDataErrors = get_showDataErrors.toJsFn, get_states = get_states.toJsFn, hasMessages = hasMessages.toJsFn, initialize = initialize.toJsFn, invokeAlternateRender = js.Any.fromFunction3(invokeAlternateRender), invokeClientRenderer = js.Any.fromFunction2(invokeClientRenderer), loadRenderTemplateScripts = js.Any.fromFunction5(loadRenderTemplateScripts), loadServerTemplateScripts = loadServerTemplateScripts.toJsFn, loaded = loaded.asInstanceOf[js.Any], onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), processDataErrorMessages = js.Any.fromFunction1(processDataErrorMessages), processDataProviderErrors = js.Any.fromFunction1((t0: Any) => processDataProviderErrors(t0).runNow()), processRenderingErrorMessages = js.Any.fromFunction1(processRenderingErrorMessages), raiseBubbleEvent = js.Any.fromFunction2((t0: Any, t1: Any) => (raiseBubbleEvent(t0, t1)).runNow()), raisePropertyChanged = js.Any.fromFunction1((t0: String) => raisePropertyChanged(t0).runNow()), removeCssClass = js.Any.fromFunction1((t0: String) => removeCssClass(t0).runNow()), remove_disposing = js.Any.fromFunction1((t0: js.Function) => remove_disposing(t0).runNow()), remove_propertyChanged = js.Any.fromFunction1((t0: js.Function) => remove_propertyChanged(t0).runNow()), renderControl = js.Any.fromFunction2((t0: Any, t1: Any) => (renderControl(t0, t1)).runNow()), scriptApplication_Load = js.Any.fromFunction2((t0: Any, t1: Any) => (scriptApplication_Load(t0, t1)).runNow()), scriptApplication_PostLoad = js.Any.fromFunction2((t0: Any, t1: Any) => (scriptApplication_PostLoad(t0, t1)).runNow()), scriptApplication_PreLoad = js.Any.fromFunction2((t0: Any, t1: Any) => (scriptApplication_PreLoad(t0, t1)).runNow()), serverTemplateScriptsCallback = serverTemplateScriptsCallback.toJsFn, serverTemplateScriptsToLoad = serverTemplateScriptsToLoad.asInstanceOf[js.Any], setControlElementVisibility = js.Any.fromFunction1(setControlElementVisibility), set_alternateErrorMessage = js.Any.fromFunction1(set_alternateErrorMessage), set_delayLoadTemplateScripts = js.Any.fromFunction1(set_delayLoadTemplateScripts), set_id = js.Any.fromFunction1((t0: String) => set_id(t0).runNow()), set_messages = js.Any.fromFunction1(set_messages), set_renderTemplateId = js.Any.fromFunction1(set_renderTemplateId), set_showDataErrors = js.Any.fromFunction1(set_showDataErrors), set_states = js.Any.fromFunction1(set_states), toggleCssClass = js.Any.fromFunction1((t0: String) => toggleCssClass(t0).runNow()), updateDisplayControlWithNewMessages = updateDisplayControlWithNewMessages.toJsFn, updated = updated.toJsFn)
    __obj.asInstanceOf[ClientControl]
  }
  
  extension [Self <: ClientControl](x: Self) {
    
    inline def setAlternateRenderContext(value: Any): Self = StObject.set(x, "alternateRenderContext", value.asInstanceOf[js.Any])
    
    inline def setAlternateRenderer(value: Any): Self = StObject.set(x, "alternateRenderer", value.asInstanceOf[js.Any])
    
    inline def setClickHandler(value: Event => Any): Self = StObject.set(x, "clickHandler", js.Any.fromFunction1(value))
    
    inline def setGet_alternateErrorMessage(value: CallbackTo[String]): Self = StObject.set(x, "get_alternateErrorMessage", value.toJsFn)
    
    inline def setGet_delayLoadTemplateScripts(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_delayLoadTemplateScripts", value.toJsFn)
    
    inline def setGet_isInitialLoad(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_isInitialLoad", value.toJsFn)
    
    inline def setGet_messages(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "get_messages", value.toJsFn)
    
    inline def setGet_nextUniqueId(value: CallbackTo[String]): Self = StObject.set(x, "get_nextUniqueId", value.toJsFn)
    
    inline def setGet_renderTemplateId(value: CallbackTo[String]): Self = StObject.set(x, "get_renderTemplateId", value.toJsFn)
    
    inline def setGet_showDataErrors(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_showDataErrors", value.toJsFn)
    
    inline def setGet_states(value: CallbackTo[Any]): Self = StObject.set(x, "get_states", value.toJsFn)
    
    inline def setHasMessages(value: CallbackTo[Any]): Self = StObject.set(x, "hasMessages", value.toJsFn)
    
    inline def setInvokeAlternateRender(value: (Any, Any, Any) => Any): Self = StObject.set(x, "invokeAlternateRender", js.Any.fromFunction3(value))
    
    inline def setInvokeClientRenderer(value: (Any, Any) => Any): Self = StObject.set(x, "invokeClientRenderer", js.Any.fromFunction2(value))
    
    inline def setLoadRenderTemplateScripts(value: (Any, Any, Any, Any, Any) => Boolean): Self = StObject.set(x, "loadRenderTemplateScripts", js.Any.fromFunction5(value))
    
    inline def setLoadServerTemplateScripts(value: Callback): Self = StObject.set(x, "loadServerTemplateScripts", value.toJsFn)
    
    inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setProcessDataErrorMessages(value: Any => Any): Self = StObject.set(x, "processDataErrorMessages", js.Any.fromFunction1(value))
    
    inline def setProcessDataProviderErrors(value: Any => Callback): Self = StObject.set(x, "processDataProviderErrors", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setProcessRenderingErrorMessages(value: Any => Any): Self = StObject.set(x, "processRenderingErrorMessages", js.Any.fromFunction1(value))
    
    inline def setRenderControl(value: (Any, Any) => Callback): Self = StObject.set(x, "renderControl", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setScriptApplication_Load(value: (Any, Any) => Callback): Self = StObject.set(x, "scriptApplication_Load", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setScriptApplication_PostLoad(value: (Any, Any) => Callback): Self = StObject.set(x, "scriptApplication_PostLoad", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setScriptApplication_PreLoad(value: (Any, Any) => Callback): Self = StObject.set(x, "scriptApplication_PreLoad", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setServerTemplateScriptsCallback(value: Callback): Self = StObject.set(x, "serverTemplateScriptsCallback", value.toJsFn)
    
    inline def setServerTemplateScriptsToLoad(value: js.Array[Any]): Self = StObject.set(x, "serverTemplateScriptsToLoad", value.asInstanceOf[js.Any])
    
    inline def setServerTemplateScriptsToLoadVarargs(value: Any*): Self = StObject.set(x, "serverTemplateScriptsToLoad", js.Array(value*))
    
    inline def setSetControlElementVisibility(value: Boolean => Any): Self = StObject.set(x, "setControlElementVisibility", js.Any.fromFunction1(value))
    
    inline def setSet_alternateErrorMessage(value: String => String): Self = StObject.set(x, "set_alternateErrorMessage", js.Any.fromFunction1(value))
    
    inline def setSet_delayLoadTemplateScripts(value: Boolean => Boolean): Self = StObject.set(x, "set_delayLoadTemplateScripts", js.Any.fromFunction1(value))
    
    inline def setSet_messages(value: js.Array[Any] => js.Array[Any]): Self = StObject.set(x, "set_messages", js.Any.fromFunction1(value))
    
    inline def setSet_renderTemplateId(value: String => String): Self = StObject.set(x, "set_renderTemplateId", js.Any.fromFunction1(value))
    
    inline def setSet_showDataErrors(value: Boolean => Boolean): Self = StObject.set(x, "set_showDataErrors", js.Any.fromFunction1(value))
    
    inline def setSet_states(value: Any => Any): Self = StObject.set(x, "set_states", js.Any.fromFunction1(value))
    
    inline def setUpdateDisplayControlWithNewMessages(value: CallbackTo[Any]): Self = StObject.set(x, "updateDisplayControlWithNewMessages", value.toJsFn)
  }
}
