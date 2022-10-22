package typingsJapgolly.fullcalendarCommon.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewContext
  extends StObject
     with CalendarContext {
  
  def addResizeHandler(handler: ResizeHandler): Unit
  
  def createScrollResponder(execFunc: ScrollRequestHandler): ScrollResponder
  
  var dateProfileGenerator: DateProfileGenerator
  
  var isRtl: Boolean
  
  @JSName("options")
  var options_ViewContext: ViewOptionsRefined
  
  def registerInteractiveComponent(component: DateComponent[Any, Dictionary], settingsInput: InteractionSettingsInput): Unit
  
  def removeResizeHandler(handler: ResizeHandler): Unit
  
  var theme: Theme
  
  def unregisterInteractiveComponent(component: DateComponent[Any, Dictionary]): Unit
  
  var viewApi: ViewApi
  
  var viewSpec: ViewSpec
}
object ViewContext {
  
  inline def apply(
    addResizeHandler: ResizeHandler => Callback,
    calendarApi: CalendarApi,
    createScrollResponder: ScrollRequestHandler => ScrollResponder,
    dateEnv: DateEnv,
    dateProfileGenerator: DateProfileGenerator,
    dispatch: Action => Callback,
    emitter: Emitter[CalendarListeners],
    getCurrentData: CallbackTo[CalendarData],
    isRtl: Boolean,
    options: ViewOptionsRefined,
    pluginHooks: PluginHooks,
    registerInteractiveComponent: (DateComponent[Any, Dictionary], InteractionSettingsInput) => Callback,
    removeResizeHandler: ResizeHandler => Callback,
    theme: Theme,
    unregisterInteractiveComponent: DateComponent[Any, Dictionary] => Callback,
    viewApi: ViewApi,
    viewSpec: ViewSpec
  ): ViewContext = {
    val __obj = js.Dynamic.literal(addResizeHandler = js.Any.fromFunction1((t0: ResizeHandler) => addResizeHandler(t0).runNow()), calendarApi = calendarApi.asInstanceOf[js.Any], createScrollResponder = js.Any.fromFunction1(createScrollResponder), dateEnv = dateEnv.asInstanceOf[js.Any], dateProfileGenerator = dateProfileGenerator.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1((t0: Action) => dispatch(t0).runNow()), emitter = emitter.asInstanceOf[js.Any], getCurrentData = getCurrentData.toJsFn, isRtl = isRtl.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pluginHooks = pluginHooks.asInstanceOf[js.Any], registerInteractiveComponent = js.Any.fromFunction2((t0: DateComponent[Any, Dictionary], t1: InteractionSettingsInput) => (registerInteractiveComponent(t0, t1)).runNow()), removeResizeHandler = js.Any.fromFunction1((t0: ResizeHandler) => removeResizeHandler(t0).runNow()), theme = theme.asInstanceOf[js.Any], unregisterInteractiveComponent = js.Any.fromFunction1((t0: DateComponent[Any, Dictionary]) => unregisterInteractiveComponent(t0).runNow()), viewApi = viewApi.asInstanceOf[js.Any], viewSpec = viewSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewContext]
  }
  
  extension [Self <: ViewContext](x: Self) {
    
    inline def setAddResizeHandler(value: ResizeHandler => Callback): Self = StObject.set(x, "addResizeHandler", js.Any.fromFunction1((t0: ResizeHandler) => value(t0).runNow()))
    
    inline def setCreateScrollResponder(value: ScrollRequestHandler => ScrollResponder): Self = StObject.set(x, "createScrollResponder", js.Any.fromFunction1(value))
    
    inline def setDateProfileGenerator(value: DateProfileGenerator): Self = StObject.set(x, "dateProfileGenerator", value.asInstanceOf[js.Any])
    
    inline def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ViewOptionsRefined): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRegisterInteractiveComponent(value: (DateComponent[Any, Dictionary], InteractionSettingsInput) => Callback): Self = StObject.set(x, "registerInteractiveComponent", js.Any.fromFunction2((t0: DateComponent[Any, Dictionary], t1: InteractionSettingsInput) => (value(t0, t1)).runNow()))
    
    inline def setRemoveResizeHandler(value: ResizeHandler => Callback): Self = StObject.set(x, "removeResizeHandler", js.Any.fromFunction1((t0: ResizeHandler) => value(t0).runNow()))
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setUnregisterInteractiveComponent(value: DateComponent[Any, Dictionary] => Callback): Self = StObject.set(x, "unregisterInteractiveComponent", js.Any.fromFunction1((t0: DateComponent[Any, Dictionary]) => value(t0).runNow()))
    
    inline def setViewApi(value: ViewApi): Self = StObject.set(x, "viewApi", value.asInstanceOf[js.Any])
    
    inline def setViewSpec(value: ViewSpec): Self = StObject.set(x, "viewSpec", value.asInstanceOf[js.Any])
  }
}
