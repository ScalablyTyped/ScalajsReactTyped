package typingsJapgolly.reactCalendarTimeline.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCalendarTimeline.mod.CustomMarkerChildrenProps
import typingsJapgolly.reactCalendarTimeline.mod.TodayMarkerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TodayMarker {
  
  inline def apply(date: js.Date | Double): Builder = {
    val __props = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TodayMarkerProps]))
  }
  
  @JSImport("react-calendar-timeline", "TodayMarker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactCalendarTimeline.mod.TodayMarker] {
    
    inline def children(value: /* props */ CustomMarkerChildrenProps => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def interval(value: Double): this.type = set("interval", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TodayMarkerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
