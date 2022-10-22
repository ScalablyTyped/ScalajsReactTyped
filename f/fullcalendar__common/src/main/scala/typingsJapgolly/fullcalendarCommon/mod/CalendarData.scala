package typingsJapgolly.fullcalendarCommon.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarData
  extends StObject
     with CalendarDataBase {
  
  var calendarApi: CalendarApi
  
  def dispatch(action: Action): Unit
  
  var emitter: Emitter[CalendarListeners]
  
  def getCurrentData(): CalendarData
  
  var viewTitle: String
}
object CalendarData {
  
  inline def apply(
    availableRawLocales: Any,
    businessHours: EventStore,
    calendarApi: CalendarApi,
    calendarOptions: CalendarOptionsRefined,
    currentDate: js.Date,
    currentViewType: String,
    dateEnv: DateEnv,
    dateProfile: DateProfile,
    dateProfileGenerator: DateProfileGenerator,
    dispatch: Action => Callback,
    dynamicOptionOverrides: CalendarOptions,
    emitter: Emitter[CalendarListeners],
    eventSelection: String,
    eventSources: EventSourceHash,
    eventStore: EventStore,
    eventUiBases: EventUiHash,
    getCurrentData: CallbackTo[CalendarData],
    localeDefaults: CalendarOptions,
    options: ViewOptionsRefined,
    pluginHooks: PluginHooks,
    renderableEventStore: EventStore,
    selectionConfig: EventUi,
    theme: Theme,
    toolbarConfig: Any,
    viewApi: ViewApi,
    viewSpec: ViewSpec,
    viewSpecs: ViewSpecHash,
    viewTitle: String
  ): CalendarData = {
    val __obj = js.Dynamic.literal(availableRawLocales = availableRawLocales.asInstanceOf[js.Any], businessHours = businessHours.asInstanceOf[js.Any], calendarApi = calendarApi.asInstanceOf[js.Any], calendarOptions = calendarOptions.asInstanceOf[js.Any], currentDate = currentDate.asInstanceOf[js.Any], currentViewType = currentViewType.asInstanceOf[js.Any], dateEnv = dateEnv.asInstanceOf[js.Any], dateProfile = dateProfile.asInstanceOf[js.Any], dateProfileGenerator = dateProfileGenerator.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1((t0: Action) => dispatch(t0).runNow()), dynamicOptionOverrides = dynamicOptionOverrides.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], eventSelection = eventSelection.asInstanceOf[js.Any], eventSources = eventSources.asInstanceOf[js.Any], eventStore = eventStore.asInstanceOf[js.Any], eventUiBases = eventUiBases.asInstanceOf[js.Any], getCurrentData = getCurrentData.toJsFn, localeDefaults = localeDefaults.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pluginHooks = pluginHooks.asInstanceOf[js.Any], renderableEventStore = renderableEventStore.asInstanceOf[js.Any], selectionConfig = selectionConfig.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], toolbarConfig = toolbarConfig.asInstanceOf[js.Any], viewApi = viewApi.asInstanceOf[js.Any], viewSpec = viewSpec.asInstanceOf[js.Any], viewSpecs = viewSpecs.asInstanceOf[js.Any], viewTitle = viewTitle.asInstanceOf[js.Any], dateSelection = null, eventDrag = null, eventResize = null)
    __obj.asInstanceOf[CalendarData]
  }
  
  extension [Self <: CalendarData](x: Self) {
    
    inline def setCalendarApi(value: CalendarApi): Self = StObject.set(x, "calendarApi", value.asInstanceOf[js.Any])
    
    inline def setDispatch(value: Action => Callback): Self = StObject.set(x, "dispatch", js.Any.fromFunction1((t0: Action) => value(t0).runNow()))
    
    inline def setEmitter(value: Emitter[CalendarListeners]): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentData(value: CallbackTo[CalendarData]): Self = StObject.set(x, "getCurrentData", value.toJsFn)
    
    inline def setViewTitle(value: String): Self = StObject.set(x, "viewTitle", value.asInstanceOf[js.Any])
  }
}
