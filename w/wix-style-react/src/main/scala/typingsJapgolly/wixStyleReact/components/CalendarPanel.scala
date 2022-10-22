package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.dateFns.mod.Locale
import typingsJapgolly.wixDesignSystemsLocaleUtils.distTypesDateTimeFormatConstantsMod.SupportedWixLocales_
import typingsJapgolly.wixStyleReact.anon.SelectedDays
import typingsJapgolly.wixStyleReact.distTypesCalendarPanelMod.CalendarPanelProps
import typingsJapgolly.wixStyleReact.distTypesCalendarPanelMod.PresetType
import typingsJapgolly.wixStyleReact.distTypesCalendarPanelMod.SelectedDaysType
import typingsJapgolly.wixStyleReact.distTypesCalendarPanelMod.SelectionModeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CalendarPanel {
  
  inline def apply(onChange: SelectedDaysType => Callback): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: SelectedDaysType) => onChange(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[CalendarPanelProps]))
  }
  
  @JSImport("wix-style-react", "CalendarPanel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.CalendarPanel] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def excludePastDates(value: Boolean): this.type = set("excludePastDates", value.asInstanceOf[js.Any])
    
    inline def filterDate(value: /* date */ js.Date => Boolean): this.type = set("filterDate", js.Any.fromFunction1(value))
    
    inline def footer(value: (/* selectedDays */ SelectedDaysType, /* submitDisabled */ Boolean) => Callback): this.type = set("footer", js.Any.fromFunction2((t0: /* selectedDays */ SelectedDaysType, t1: /* submitDisabled */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def locale(value: SupportedWixLocales_ | Locale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def numOfMonths(value: Double): this.type = set("numOfMonths", value.asInstanceOf[js.Any])
    
    inline def onClose(value: /* e */ ReactEventFrom[Element] => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[Element]) => value(t0).runNow()))
    
    inline def presets(value: js.Array[PresetType] | SelectedDays): this.type = set("presets", value.asInstanceOf[js.Any])
    
    inline def presetsVarargs(value: PresetType*): this.type = set("presets", js.Array(value*))
    
    inline def selectionMode(value: SelectionModeType): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    inline def shouldCloseOnSelect(value: Boolean): this.type = set("shouldCloseOnSelect", value.asInstanceOf[js.Any])
    
    inline def showMonthDropdown(value: Boolean): this.type = set("showMonthDropdown", value.asInstanceOf[js.Any])
    
    inline def showYearDropdown(value: Boolean): this.type = set("showYearDropdown", value.asInstanceOf[js.Any])
    
    inline def value(value: SelectedDaysType): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CalendarPanelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
