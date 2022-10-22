package typingsJapgolly.reactBigScheduler.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerProps extends StObject {
  
  var eventItemClick: js.UndefOr[js.Function2[/* schedulerData */ SchedulerData, /* event */ Event, Unit]] = js.undefined
  
  var eventItemPopoverTemplateResolver: js.UndefOr[
    js.Function6[
      /* schedulerData */ SchedulerData, 
      /* eventItem */ Event, 
      /* title */ String, 
      /* start */ Moment, 
      /* end */ Moment, 
      /* statusColor */ String, 
      Unit
    ]
  ] = js.undefined
  
  var eventItemTemplateResolver: js.UndefOr[
    js.Function8[
      /* schedulerData */ SchedulerData, 
      /* event */ Event, 
      /* bgColor */ String, 
      /* isStart */ Boolean, 
      /* isEnd */ Boolean, 
      /* mustAddCssClass */ String, 
      /* mustBeHeight */ Double, 
      /* agendaMaxEventWidth */ Double, 
      Unit
    ]
  ] = js.undefined
  
  def nextClick(schedulerData: SchedulerData): Unit
  
  def onSelectDate(schedulerData: SchedulerData, date: String): Unit
  
  def onViewChange(schedulerData: SchedulerData, view: View): Unit
  
  def prevClick(schedulerData: SchedulerData): Unit
  
  var schedulerData: SchedulerData
}
object SchedulerProps {
  
  inline def apply(
    nextClick: SchedulerData => Callback,
    onSelectDate: (SchedulerData, String) => Callback,
    onViewChange: (SchedulerData, View) => Callback,
    prevClick: SchedulerData => Callback,
    schedulerData: SchedulerData
  ): SchedulerProps = {
    val __obj = js.Dynamic.literal(nextClick = js.Any.fromFunction1((t0: SchedulerData) => nextClick(t0).runNow()), onSelectDate = js.Any.fromFunction2((t0: SchedulerData, t1: String) => (onSelectDate(t0, t1)).runNow()), onViewChange = js.Any.fromFunction2((t0: SchedulerData, t1: View) => (onViewChange(t0, t1)).runNow()), prevClick = js.Any.fromFunction1((t0: SchedulerData) => prevClick(t0).runNow()), schedulerData = schedulerData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerProps]
  }
  
  extension [Self <: SchedulerProps](x: Self) {
    
    inline def setEventItemClick(value: (/* schedulerData */ SchedulerData, /* event */ Event) => Callback): Self = StObject.set(x, "eventItemClick", js.Any.fromFunction2((t0: /* schedulerData */ SchedulerData, t1: /* event */ Event) => (value(t0, t1)).runNow()))
    
    inline def setEventItemClickUndefined: Self = StObject.set(x, "eventItemClick", js.undefined)
    
    inline def setEventItemPopoverTemplateResolver(
      value: (/* schedulerData */ SchedulerData, /* eventItem */ Event, /* title */ String, /* start */ Moment, /* end */ Moment, /* statusColor */ String) => Callback
    ): Self = StObject.set(x, "eventItemPopoverTemplateResolver", js.Any.fromFunction6((t0: /* schedulerData */ SchedulerData, t1: /* eventItem */ Event, t2: /* title */ String, t3: /* start */ Moment, t4: /* end */ Moment, t5: /* statusColor */ String) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setEventItemPopoverTemplateResolverUndefined: Self = StObject.set(x, "eventItemPopoverTemplateResolver", js.undefined)
    
    inline def setEventItemTemplateResolver(
      value: (/* schedulerData */ SchedulerData, /* event */ Event, /* bgColor */ String, /* isStart */ Boolean, /* isEnd */ Boolean, /* mustAddCssClass */ String, /* mustBeHeight */ Double, /* agendaMaxEventWidth */ Double) => Callback
    ): Self = StObject.set(x, "eventItemTemplateResolver", js.Any.fromFunction8((t0: /* schedulerData */ SchedulerData, t1: /* event */ Event, t2: /* bgColor */ String, t3: /* isStart */ Boolean, t4: /* isEnd */ Boolean, t5: /* mustAddCssClass */ String, t6: /* mustBeHeight */ Double, t7: /* agendaMaxEventWidth */ Double) => (value(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()))
    
    inline def setEventItemTemplateResolverUndefined: Self = StObject.set(x, "eventItemTemplateResolver", js.undefined)
    
    inline def setNextClick(value: SchedulerData => Callback): Self = StObject.set(x, "nextClick", js.Any.fromFunction1((t0: SchedulerData) => value(t0).runNow()))
    
    inline def setOnSelectDate(value: (SchedulerData, String) => Callback): Self = StObject.set(x, "onSelectDate", js.Any.fromFunction2((t0: SchedulerData, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setOnViewChange(value: (SchedulerData, View) => Callback): Self = StObject.set(x, "onViewChange", js.Any.fromFunction2((t0: SchedulerData, t1: View) => (value(t0, t1)).runNow()))
    
    inline def setPrevClick(value: SchedulerData => Callback): Self = StObject.set(x, "prevClick", js.Any.fromFunction1((t0: SchedulerData) => value(t0).runNow()))
    
    inline def setSchedulerData(value: SchedulerData): Self = StObject.set(x, "schedulerData", value.asInstanceOf[js.Any])
  }
}
