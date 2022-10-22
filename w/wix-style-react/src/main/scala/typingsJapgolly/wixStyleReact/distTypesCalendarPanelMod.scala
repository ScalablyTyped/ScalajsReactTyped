package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import typingsJapgolly.dateFns.mod.Locale
import typingsJapgolly.react.mod.Component
import typingsJapgolly.wixDesignSystemsLocaleUtils.distTypesDateTimeFormatConstantsMod.SupportedWixLocales_
import typingsJapgolly.wixStyleReact.anon.SelectedDays
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarPanelMod {
  
  @JSImport("wix-style-react/dist/types/CalendarPanel", JSImport.Default)
  @js.native
  open class default () extends CalendarPanel
  
  @js.native
  trait CalendarPanel
    extends Component[CalendarPanelProps, js.Object, Any] {
    
    def getSelectedPresetId(): String | Double = js.native
    
    def isSubmitDisabled(): Boolean = js.native
    
    def onSelectPreset(): Unit = js.native
  }
  
  trait CalendarPanelProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var excludePastDates: js.UndefOr[Boolean] = js.undefined
    
    var filterDate: js.UndefOr[js.Function1[/* date */ js.Date, Boolean]] = js.undefined
    
    var footer: js.UndefOr[
        js.Function2[/* selectedDays */ SelectedDaysType, /* submitDisabled */ Boolean, Unit]
      ] = js.undefined
    
    var locale: js.UndefOr[SupportedWixLocales_ | Locale] = js.undefined
    
    var numOfMonths: js.UndefOr[Double] = js.undefined
    
    def onChange(selectedDays: SelectedDaysType): Unit
    
    var onClose: js.UndefOr[js.Function1[/* e */ ReactEventFrom[Element], Unit]] = js.undefined
    
    var presets: js.UndefOr[js.Array[PresetType] | SelectedDays] = js.undefined
    
    var selectionMode: js.UndefOr[SelectionModeType] = js.undefined
    
    var shouldCloseOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var showMonthDropdown: js.UndefOr[Boolean] = js.undefined
    
    var showYearDropdown: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[SelectedDaysType] = js.undefined
  }
  object CalendarPanelProps {
    
    inline def apply(onChange: SelectedDaysType => Callback): CalendarPanelProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: SelectedDaysType) => onChange(t0).runNow()))
      __obj.asInstanceOf[CalendarPanelProps]
    }
    
    extension [Self <: CalendarPanelProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setExcludePastDates(value: Boolean): Self = StObject.set(x, "excludePastDates", value.asInstanceOf[js.Any])
      
      inline def setExcludePastDatesUndefined: Self = StObject.set(x, "excludePastDates", js.undefined)
      
      inline def setFilterDate(value: /* date */ js.Date => Boolean): Self = StObject.set(x, "filterDate", js.Any.fromFunction1(value))
      
      inline def setFilterDateUndefined: Self = StObject.set(x, "filterDate", js.undefined)
      
      inline def setFooter(value: (/* selectedDays */ SelectedDaysType, /* submitDisabled */ Boolean) => Callback): Self = StObject.set(x, "footer", js.Any.fromFunction2((t0: /* selectedDays */ SelectedDaysType, t1: /* submitDisabled */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setLocale(value: SupportedWixLocales_ | Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setNumOfMonths(value: Double): Self = StObject.set(x, "numOfMonths", value.asInstanceOf[js.Any])
      
      inline def setNumOfMonthsUndefined: Self = StObject.set(x, "numOfMonths", js.undefined)
      
      inline def setOnChange(value: SelectedDaysType => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: SelectedDaysType) => value(t0).runNow()))
      
      inline def setOnClose(value: /* e */ ReactEventFrom[Element] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setPresets(value: js.Array[PresetType] | SelectedDays): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      inline def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      inline def setPresetsVarargs(value: PresetType*): Self = StObject.set(x, "presets", js.Array(value*))
      
      inline def setSelectionMode(value: SelectionModeType): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setShouldCloseOnSelect(value: Boolean): Self = StObject.set(x, "shouldCloseOnSelect", value.asInstanceOf[js.Any])
      
      inline def setShouldCloseOnSelectUndefined: Self = StObject.set(x, "shouldCloseOnSelect", js.undefined)
      
      inline def setShowMonthDropdown(value: Boolean): Self = StObject.set(x, "showMonthDropdown", value.asInstanceOf[js.Any])
      
      inline def setShowMonthDropdownUndefined: Self = StObject.set(x, "showMonthDropdown", js.undefined)
      
      inline def setShowYearDropdown(value: Boolean): Self = StObject.set(x, "showYearDropdown", value.asInstanceOf[js.Any])
      
      inline def setShowYearDropdownUndefined: Self = StObject.set(x, "showYearDropdown", js.undefined)
      
      inline def setValue(value: SelectedDaysType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait DateRangeType extends StObject {
    
    var from: js.UndefOr[String | js.Date] = js.undefined
    
    var to: js.UndefOr[String | js.Date] = js.undefined
  }
  object DateRangeType {
    
    inline def apply(): DateRangeType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateRangeType]
    }
    
    extension [Self <: DateRangeType](x: Self) {
      
      inline def setFrom(value: String | js.Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: String | js.Date): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait OptionType
    extends StObject
       with PresetType {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: String | Double
    
    var overrideStyle: js.UndefOr[Boolean] = js.undefined
    
    var selectedDays: SelectedDaysType
    
    var value: Node | String | js.Function
  }
  object OptionType {
    
    inline def apply(id: String | Double, selectedDays: SelectedDaysType): OptionType = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], selectedDays = selectedDays.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[OptionType]
    }
    
    extension [Self <: OptionType](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOverrideStyle(value: Boolean): Self = StObject.set(x, "overrideStyle", value.asInstanceOf[js.Any])
      
      inline def setOverrideStyleUndefined: Self = StObject.set(x, "overrideStyle", js.undefined)
      
      inline def setSelectedDays(value: SelectedDaysType): Self = StObject.set(x, "selectedDays", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Node | String | js.Function): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setValueVdomElement(value: VdomElement): Self = StObject.set(x, "value", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.distTypesCalendarPanelMod.OptionType
    - typingsJapgolly.wixStyleReact.anon.`1`
  */
  trait PresetType extends StObject
  object PresetType {
    
    inline def `1`(): typingsJapgolly.wixStyleReact.anon.`1` = {
      val __obj = js.Dynamic.literal(value = "-")
      __obj.asInstanceOf[typingsJapgolly.wixStyleReact.anon.`1`]
    }
    
    inline def OptionType(id: String | Double, selectedDays: SelectedDaysType): typingsJapgolly.wixStyleReact.distTypesCalendarPanelMod.OptionType = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], selectedDays = selectedDays.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[typingsJapgolly.wixStyleReact.distTypesCalendarPanelMod.OptionType]
    }
  }
  
  type SelectedDaysType = String | js.Date | DateRangeType
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.day
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.range
  */
  trait SelectionModeType extends StObject
  object SelectionModeType {
    
    inline def day: typingsJapgolly.wixStyleReact.wixStyleReactStrings.day = "day".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.day]
    
    inline def range: typingsJapgolly.wixStyleReact.wixStyleReactStrings.range = "range".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.range]
  }
}
