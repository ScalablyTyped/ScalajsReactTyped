package typingsJapgolly.fullcalendarCommon.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fullcalendarCommon.mod.Action
import typingsJapgolly.fullcalendarCommon.mod.BaseOptionsRefined
import typingsJapgolly.fullcalendarCommon.mod.CalendarApi
import typingsJapgolly.fullcalendarCommon.mod.CalendarData
import typingsJapgolly.fullcalendarCommon.mod.CalendarListeners
import typingsJapgolly.fullcalendarCommon.mod.DateEnv
import typingsJapgolly.fullcalendarCommon.mod.Emitter
import typingsJapgolly.fullcalendarCommon.mod.PluginHooks
import typingsJapgolly.fullcalendarCommon.mod.ViewApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @fullcalendar/common.@fullcalendar/common.CalendarContext & {  viewApi :@fullcalendar/common.@fullcalendar/common.ViewApi | undefined} */
trait CalendarContextviewApiVie extends StObject {
  
  var calendarApi: CalendarApi
  
  var dateEnv: DateEnv
  
  def dispatch(action: Action): scala.Unit
  
  var emitter: Emitter[CalendarListeners]
  
  def getCurrentData(): CalendarData
  
  var options: BaseOptionsRefined
  
  var pluginHooks: PluginHooks
  
  var viewApi: js.UndefOr[ViewApi] = js.undefined
}
object CalendarContextviewApiVie {
  
  inline def apply(
    calendarApi: CalendarApi,
    dateEnv: DateEnv,
    dispatch: Action => Callback,
    emitter: Emitter[CalendarListeners],
    getCurrentData: CallbackTo[CalendarData],
    options: BaseOptionsRefined,
    pluginHooks: PluginHooks
  ): CalendarContextviewApiVie = {
    val __obj = js.Dynamic.literal(calendarApi = calendarApi.asInstanceOf[js.Any], dateEnv = dateEnv.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1((t0: Action) => dispatch(t0).runNow()), emitter = emitter.asInstanceOf[js.Any], getCurrentData = getCurrentData.toJsFn, options = options.asInstanceOf[js.Any], pluginHooks = pluginHooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarContextviewApiVie]
  }
  
  extension [Self <: CalendarContextviewApiVie](x: Self) {
    
    inline def setCalendarApi(value: CalendarApi): Self = StObject.set(x, "calendarApi", value.asInstanceOf[js.Any])
    
    inline def setDateEnv(value: DateEnv): Self = StObject.set(x, "dateEnv", value.asInstanceOf[js.Any])
    
    inline def setDispatch(value: Action => Callback): Self = StObject.set(x, "dispatch", js.Any.fromFunction1((t0: Action) => value(t0).runNow()))
    
    inline def setEmitter(value: Emitter[CalendarListeners]): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentData(value: CallbackTo[CalendarData]): Self = StObject.set(x, "getCurrentData", value.toJsFn)
    
    inline def setOptions(value: BaseOptionsRefined): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPluginHooks(value: PluginHooks): Self = StObject.set(x, "pluginHooks", value.asInstanceOf[js.Any])
    
    inline def setViewApi(value: ViewApi): Self = StObject.set(x, "viewApi", value.asInstanceOf[js.Any])
    
    inline def setViewApiUndefined: Self = StObject.set(x, "viewApi", js.undefined)
  }
}
