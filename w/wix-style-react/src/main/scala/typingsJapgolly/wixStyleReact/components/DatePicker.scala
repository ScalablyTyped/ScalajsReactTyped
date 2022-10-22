package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.FC
import typingsJapgolly.wixDesignSystemsLocaleUtils.distTypesDateTimeFormatConstantsMod.SupportedWixLocales_
import typingsJapgolly.wixStyleReact.anon.Format
import typingsJapgolly.wixStyleReact.distTypesCalendarMod.dateIndicationProps
import typingsJapgolly.wixStyleReact.distTypesCommonMod.PopoverCommonProps
import typingsJapgolly.wixStyleReact.distTypesDatePickerMod.DatePickerProps
import typingsJapgolly.wixStyleReact.distTypesDatePickerMod.DatePickerStatus
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`0`
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`1`
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`2`
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`3`
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`4`
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`5`
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`6`
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.day
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.range
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.short
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePicker {
  
  inline def apply(onChange: js.Function): Builder = {
    val __props = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DatePickerProps]))
  }
  
  @JSImport("wix-style-react", "DatePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.DatePicker] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def calendarDataHook(value: String): this.type = set("calendarDataHook", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def clearButton(value: Boolean): this.type = set("clearButton", value.asInstanceOf[js.Any])
    
    inline def customInput(value: VdomNode): this.type = set("customInput", value.rawNode.asInstanceOf[js.Any])
    
    inline def customInputNull: this.type = set("customInput", null)
    
    inline def customInputVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("customInput", js.Array(value*))
    
    inline def customInputVdomElement(value: VdomElement): this.type = set("customInput", value.rawElement.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def dateIndication(value: FC[dateIndicationProps]): this.type = set("dateIndication", value.asInstanceOf[js.Any])
    
    inline def dateStyle(value: short | medium): this.type = set("dateStyle", value.asInstanceOf[js.Any])
    
    inline def disableKeyboardType(value: Boolean): this.type = set("disableKeyboardType", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def excludePastDates(value: Boolean): this.type = set("excludePastDates", value.asInstanceOf[js.Any])
    
    inline def filterDate(value: js.Function): this.type = set("filterDate", value.asInstanceOf[js.Any])
    
    inline def firstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): this.type = set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def initialOpen(value: Boolean): this.type = set("initialOpen", value.asInstanceOf[js.Any])
    
    inline def inputDataHook(value: String): this.type = set("inputDataHook", value.asInstanceOf[js.Any])
    
    inline def inputProps(value: js.Object): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    inline def leftArrowAriaLabel(value: String): this.type = set("leftArrowAriaLabel", value.asInstanceOf[js.Any])
    
    inline def leftArrowAriaLabelledBy(value: String): this.type = set("leftArrowAriaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def locale(value: SupportedWixLocales_): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def monthDropdownAriaLabel(value: String): this.type = set("monthDropdownAriaLabel", value.asInstanceOf[js.Any])
    
    inline def monthDropdownAriaLabelledBy(value: String): this.type = set("monthDropdownAriaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def numOfMonths(value: `1` | `2`): this.type = set("numOfMonths", value.asInstanceOf[js.Any])
    
    inline def onClear(value: ReactMouseEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onClear", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onClose(value: js.Function): this.type = set("onClose", value.asInstanceOf[js.Any])
    
    inline def onMonthChange(value: /* monthStart */ js.Date => Callback): this.type = set("onMonthChange", js.Any.fromFunction1((t0: /* monthStart */ js.Date) => value(t0).runNow()))
    
    inline def onValidate(value: /* hasValidationTypeFormatValue */ Format => Callback): this.type = set("onValidate", js.Any.fromFunction1((t0: /* hasValidationTypeFormatValue */ Format) => value(t0).runNow()))
    
    inline def placeholderText(value: String): this.type = set("placeholderText", value.asInstanceOf[js.Any])
    
    inline def popoverProps(value: PopoverCommonProps): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def rightArrowAriaLabel(value: String): this.type = set("rightArrowAriaLabel", value.asInstanceOf[js.Any])
    
    inline def rightArrowAriaLabelledBy(value: String): this.type = set("rightArrowAriaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    inline def selectionMode(value: day | range): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    inline def shouldCloseOnSelect(value: Boolean): this.type = set("shouldCloseOnSelect", value.asInstanceOf[js.Any])
    
    inline def showMonthDropdown(value: Boolean): this.type = set("showMonthDropdown", value.asInstanceOf[js.Any])
    
    inline def showYearDropdown(value: Boolean): this.type = set("showYearDropdown", value.asInstanceOf[js.Any])
    
    inline def size(value: small | medium | large): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def status(value: DatePickerStatus): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def statusMessage(value: VdomNode): this.type = set("statusMessage", value.rawNode.asInstanceOf[js.Any])
    
    inline def statusMessageNull: this.type = set("statusMessage", null)
    
    inline def statusMessageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("statusMessage", js.Array(value*))
    
    inline def statusMessageVdomElement(value: VdomElement): this.type = set("statusMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def today(value: js.Date): this.type = set("today", value.asInstanceOf[js.Any])
    
    inline def validate(value: Boolean): this.type = set("validate", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def yearDropdownAriaLabel(value: String): this.type = set("yearDropdownAriaLabel", value.asInstanceOf[js.Any])
    
    inline def yearDropdownAriaLabelledBy(value: String): this.type = set("yearDropdownAriaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DatePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
