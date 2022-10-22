package typingsJapgolly.reactCalendarTimeline.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCalendarTimeline.mod.CustomHeaderProps
import typingsJapgolly.reactCalendarTimeline.mod.CustomHeaderPropsChildrenFnProps
import typingsJapgolly.reactCalendarTimeline.mod.Unit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CustomHeader {
  
  inline def apply[Data](children: js.UndefOr[CustomHeaderPropsChildrenFnProps[Data]] => Node): Builder[Data] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder[Data](js.Array(this.component, __props.asInstanceOf[CustomHeaderProps[Data]]))
  }
  
  @JSImport("react-calendar-timeline", "CustomHeader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Data] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactCalendarTimeline.mod.CustomHeader[Data]] {
    
    inline def headerData(value: Data): this.type = set("headerData", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def unit(value: Unit): this.type = set("unit", value.asInstanceOf[js.Any])
  }
  
  def withProps[Data](p: CustomHeaderProps[Data]): Builder[Data] = new Builder[Data](js.Array(this.component, p.asInstanceOf[js.Any]))
}
