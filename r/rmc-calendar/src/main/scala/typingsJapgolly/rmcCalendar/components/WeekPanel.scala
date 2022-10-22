package typingsJapgolly.rmcCalendar.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.Locale
import typingsJapgolly.rmcCalendar.libDateWeekPanelMod.PropsType
import typingsJapgolly.rmcCalendar.libDateWeekPanelMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WeekPanel {
  
  inline def apply(locale: Locale): Default[default] = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[PropsType]))
  }
  
  @JSImport("rmc-calendar/lib/date/WeekPanel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PropsType): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
