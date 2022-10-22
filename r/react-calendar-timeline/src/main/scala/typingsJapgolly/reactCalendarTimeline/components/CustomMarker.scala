package typingsJapgolly.reactCalendarTimeline.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCalendarTimeline.mod.CustomMarkerChildrenProps
import typingsJapgolly.reactCalendarTimeline.mod.MarkerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CustomMarker {
  
  inline def apply(date: js.Date | Double): Builder = {
    val __props = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MarkerProps]))
  }
  
  @JSImport("react-calendar-timeline", "CustomMarker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactCalendarTimeline.mod.CustomMarker] {
    
    inline def children(value: /* props */ CustomMarkerChildrenProps => Node): this.type = set("children", js.Any.fromFunction1(value))
  }
  
  def withProps(p: MarkerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
