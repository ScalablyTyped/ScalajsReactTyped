package typingsJapgolly.reactCalendarTimeline.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCalendarTimeline.mod.SidebarHeaderChildrenFnProps
import typingsJapgolly.reactCalendarTimeline.mod.SidebarHeaderProps
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SidebarHeader {
  
  inline def apply[Data](children: SidebarHeaderChildrenFnProps[Data] => Node): Builder[Data] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder[Data](js.Array(this.component, __props.asInstanceOf[SidebarHeaderProps[Data]]))
  }
  
  @JSImport("react-calendar-timeline", "SidebarHeader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Data] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactCalendarTimeline.mod.SidebarHeader[Data]] {
    
    inline def headerData(value: Data): this.type = set("headerData", value.asInstanceOf[js.Any])
    
    inline def variant(value: left | right): this.type = set("variant", value.asInstanceOf[js.Any])
  }
  
  def withProps[Data](p: SidebarHeaderProps[Data]): Builder[Data] = new Builder[Data](js.Array(this.component, p.asInstanceOf[js.Any]))
}
