package typingsJapgolly.reactBigScheduler.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.reactBigScheduler.mod.Event
import typingsJapgolly.reactBigScheduler.mod.SchedulerData
import typingsJapgolly.reactBigScheduler.mod.SchedulerProps
import typingsJapgolly.reactBigScheduler.mod.View
import typingsJapgolly.reactBigScheduler.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactBigScheduler {
  
  inline def apply(
    nextClick: SchedulerData => Callback,
    onSelectDate: (SchedulerData, String) => Callback,
    onViewChange: (SchedulerData, View) => Callback,
    prevClick: SchedulerData => Callback,
    schedulerData: SchedulerData
  ): Builder = {
    val __props = js.Dynamic.literal(nextClick = js.Any.fromFunction1((t0: SchedulerData) => nextClick(t0).runNow()), onSelectDate = js.Any.fromFunction2((t0: SchedulerData, t1: String) => (onSelectDate(t0, t1)).runNow()), onViewChange = js.Any.fromFunction2((t0: SchedulerData, t1: View) => (onViewChange(t0, t1)).runNow()), prevClick = js.Any.fromFunction1((t0: SchedulerData) => prevClick(t0).runNow()), schedulerData = schedulerData.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SchedulerProps]))
  }
  
  @JSImport("react-big-scheduler", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def eventItemClick(value: (/* schedulerData */ SchedulerData, /* event */ Event) => Callback): this.type = set("eventItemClick", js.Any.fromFunction2((t0: /* schedulerData */ SchedulerData, t1: /* event */ Event) => (value(t0, t1)).runNow()))
    
    inline def eventItemPopoverTemplateResolver(
      value: (/* schedulerData */ SchedulerData, /* eventItem */ Event, /* title */ String, /* start */ Moment, /* end */ Moment, /* statusColor */ String) => Callback
    ): this.type = set("eventItemPopoverTemplateResolver", js.Any.fromFunction6((t0: /* schedulerData */ SchedulerData, t1: /* eventItem */ Event, t2: /* title */ String, t3: /* start */ Moment, t4: /* end */ Moment, t5: /* statusColor */ String) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def eventItemTemplateResolver(
      value: (/* schedulerData */ SchedulerData, /* event */ Event, /* bgColor */ String, /* isStart */ Boolean, /* isEnd */ Boolean, /* mustAddCssClass */ String, /* mustBeHeight */ Double, /* agendaMaxEventWidth */ Double) => Callback
    ): this.type = set("eventItemTemplateResolver", js.Any.fromFunction8((t0: /* schedulerData */ SchedulerData, t1: /* event */ Event, t2: /* bgColor */ String, t3: /* isStart */ Boolean, t4: /* isEnd */ Boolean, t5: /* mustAddCssClass */ String, t6: /* mustBeHeight */ Double, t7: /* agendaMaxEventWidth */ Double) => (value(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()))
  }
  
  def withProps(p: SchedulerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
