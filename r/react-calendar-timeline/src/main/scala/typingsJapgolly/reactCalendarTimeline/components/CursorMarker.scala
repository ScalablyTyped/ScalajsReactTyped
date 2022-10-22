package typingsJapgolly.reactCalendarTimeline.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCalendarTimeline.mod.CursorMarkerProps
import typingsJapgolly.reactCalendarTimeline.mod.CustomMarkerChildrenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CursorMarker {
  
  @JSImport("react-calendar-timeline", "CursorMarker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactCalendarTimeline.mod.CursorMarker] {
    
    inline def children(value: /* props */ CustomMarkerChildrenProps => Node): this.type = set("children", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: CursorMarker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CursorMarkerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
