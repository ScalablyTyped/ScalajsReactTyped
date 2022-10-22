package typingsJapgolly.reactCalendarTimeline.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactCalendarTimeline.mod.DateHeaderProps
import typingsJapgolly.reactCalendarTimeline.mod.IntervalRenderer
import typingsJapgolly.reactCalendarTimeline.mod.SidebarHeaderChildrenFnProps
import typingsJapgolly.reactCalendarTimeline.mod.Unit
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.primaryHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateHeader {
  
  inline def apply[Data](): Builder[Data] = {
    val __props = js.Dynamic.literal()
    new Builder[Data](js.Array(this.component, __props.asInstanceOf[DateHeaderProps[Data]]))
  }
  
  @JSImport("react-calendar-timeline", "DateHeader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Data] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactCalendarTimeline.mod.DateHeader[Data]] {
    
    inline def children(value: /* props */ SidebarHeaderChildrenFnProps[Data] => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def headerData(value: Data): this.type = set("headerData", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def intervalRenderer(value: /* props */ js.UndefOr[IntervalRenderer[Data]] => Node): this.type = set("intervalRenderer", js.Any.fromFunction1(value))
    
    inline def labelFormat(
      value: String | (js.Function3[
          /* hasStartTimeEndTime */ js.Tuple2[Moment, Moment], 
          /* unit */ Unit, 
          /* labelWidth */ Double, 
          String
        ])
    ): this.type = set("labelFormat", value.asInstanceOf[js.Any])
    
    inline def labelFormatFunction3(
      value: (/* hasStartTimeEndTime */ js.Tuple2[Moment, Moment], /* unit */ Unit, /* labelWidth */ Double) => String
    ): this.type = set("labelFormat", js.Any.fromFunction3(value))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def unit(value: Unit | primaryHeader): this.type = set("unit", value.asInstanceOf[js.Any])
  }
  
  implicit def make[Data](companion: DateHeader.type): Builder[Data] = new Builder[Data](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[Data](p: DateHeaderProps[Data]): Builder[Data] = new Builder[Data](js.Array(this.component, p.asInstanceOf[js.Any]))
}
