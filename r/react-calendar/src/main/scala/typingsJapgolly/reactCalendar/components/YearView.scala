package typingsJapgolly.reactCalendar.components

import typingsJapgolly.reactCalendar.mod.DetailViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object YearView {
  
  inline def apply(activeStartDate: js.Date): SharedBuilder_DetailViewProps_738864266 = {
    val __props = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any])
    new SharedBuilder_DetailViewProps_738864266(js.Array(this.component, __props.asInstanceOf[DetailViewProps]))
  }
  
  @JSImport("react-calendar", "YearView")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DetailViewProps): SharedBuilder_DetailViewProps_738864266 = new SharedBuilder_DetailViewProps_738864266(js.Array(this.component, p.asInstanceOf[js.Any]))
}
