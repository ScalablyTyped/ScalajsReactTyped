package typingsJapgolly.reactCalendarTimeline.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactCalendarTimeline.mod.TimelineHeadersProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimelineHeaders {
  
  @JSImport("react-calendar-timeline", "TimelineHeaders")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactCalendarTimeline.mod.TimelineHeaders] {
    
    inline def calendarHeaderClassName(value: String): this.type = set("calendarHeaderClassName", value.asInstanceOf[js.Any])
    
    inline def calendarHeaderStyle(value: CSSProperties): this.type = set("calendarHeaderStyle", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def headerRef(value: Ref[Any]): this.type = set("headerRef", value.asInstanceOf[js.Any])
    
    inline def headerRefFunction1(value: Any | Null => Callback): this.type = set("headerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def headerRefNull: this.type = set("headerRef", null)
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TimelineHeaders.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TimelineHeadersProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
