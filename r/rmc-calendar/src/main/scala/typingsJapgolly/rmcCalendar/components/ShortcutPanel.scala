package typingsJapgolly.rmcCalendar.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.rmcCalendar.libCalendarShortcutPanelMod.PropsType
import typingsJapgolly.rmcCalendar.libCalendarShortcutPanelMod.default
import typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShortcutPanel {
  
  inline def apply(locale: Locale, onSelect: (js.UndefOr[js.Date | Unit], js.UndefOr[js.Date]) => Callback): Default[default] = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onSelect = js.Any.fromFunction2((t0: js.UndefOr[js.Date | Unit], t1: js.UndefOr[js.Date]) => (onSelect(t0, t1)).runNow()))
    new Default[default](js.Array(this.component, __props.asInstanceOf[PropsType]))
  }
  
  @JSImport("rmc-calendar/lib/calendar/ShortcutPanel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PropsType): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
