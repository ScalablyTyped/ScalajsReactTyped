package typingsJapgolly.reactCalendar.components

import typingsJapgolly.reactCalendar.mod.CalendarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCalendar {
  
  @JSImport("react-calendar", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactCalendar.type): SharedBuilder_CalendarProps_135001147 = new SharedBuilder_CalendarProps_135001147(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CalendarProps): SharedBuilder_CalendarProps_135001147 = new SharedBuilder_CalendarProps_135001147(js.Array(this.component, p.asInstanceOf[js.Any]))
}
