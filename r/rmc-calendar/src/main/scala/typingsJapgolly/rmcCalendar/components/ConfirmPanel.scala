package typingsJapgolly.rmcCalendar.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rmcCalendar.libCalendarConfirmPanelMod.ConfirmPanelPropsType
import typingsJapgolly.rmcCalendar.libCalendarConfirmPanelMod.default
import typingsJapgolly.rmcCalendar.libDateDataTypesMod.Models.Locale
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.one
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConfirmPanel {
  
  inline def apply(locale: Locale, onConfirm: Callback): Builder = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onConfirm = onConfirm.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[ConfirmPanelPropsType]))
  }
  
  @JSImport("rmc-calendar/lib/calendar/ConfirmPanel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def disableBtn(value: Boolean): this.type = set("disableBtn", value.asInstanceOf[js.Any])
    
    inline def endDateTime(value: js.Date): this.type = set("endDateTime", value.asInstanceOf[js.Any])
    
    inline def formatStr(value: String): this.type = set("formatStr", value.asInstanceOf[js.Any])
    
    inline def onlyConfirm(value: Boolean): this.type = set("onlyConfirm", value.asInstanceOf[js.Any])
    
    inline def startDateTime(value: js.Date): this.type = set("startDateTime", value.asInstanceOf[js.Any])
    
    inline def `type`(value: one | range): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ConfirmPanelPropsType): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
