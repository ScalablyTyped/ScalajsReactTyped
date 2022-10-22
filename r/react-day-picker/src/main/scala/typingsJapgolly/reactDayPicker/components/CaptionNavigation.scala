package typingsJapgolly.reactDayPicker.components

import typingsJapgolly.reactDayPicker.mod.CaptionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CaptionNavigation {
  
  inline def apply(displayMonth: js.Date): SharedBuilder_CaptionProps_728068045 = {
    val __props = js.Dynamic.literal(displayMonth = displayMonth.asInstanceOf[js.Any])
    new SharedBuilder_CaptionProps_728068045(js.Array(this.component, __props.asInstanceOf[CaptionProps]))
  }
  
  @JSImport("react-day-picker", "CaptionNavigation")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CaptionProps): SharedBuilder_CaptionProps_728068045 = new SharedBuilder_CaptionProps_728068045(js.Array(this.component, p.asInstanceOf[js.Any]))
}
