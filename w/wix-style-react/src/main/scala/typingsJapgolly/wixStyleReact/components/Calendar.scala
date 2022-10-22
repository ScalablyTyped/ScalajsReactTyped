package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.FC
import typingsJapgolly.wixDesignSystemsLocaleUtils.distTypesDateTimeFormatConstantsMod.SupportedWixLocales_
import typingsJapgolly.wixStyleReact.anon.FromTo
import typingsJapgolly.wixStyleReact.distTypesCalendarMod.CalendarProps
import typingsJapgolly.wixStyleReact.distTypesCalendarMod.dateIndicationProps
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`0`
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`1`
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`2`
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`3`
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`4`
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`5`
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`6`
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.day
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.range
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Calendar {
  
  inline def apply(onChange: js.Function): Builder = {
    val __props = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CalendarProps]))
  }
  
  @JSImport("wix-style-react", "Calendar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Calendar] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def dateIndication(value: FC[dateIndicationProps]): this.type = set("dateIndication", value.asInstanceOf[js.Any])
    
    inline def excludePastDates(value: Boolean): this.type = set("excludePastDates", value.asInstanceOf[js.Any])
    
    inline def filterDate(value: js.Function): this.type = set("filterDate", value.asInstanceOf[js.Any])
    
    inline def firstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): this.type = set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def leftArrowAriaLabel(value: String): this.type = set("leftArrowAriaLabel", value.asInstanceOf[js.Any])
    
    inline def leftArrowAriaLabelledBy(value: String): this.type = set("leftArrowAriaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def locale(value: SupportedWixLocales_): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def monthDropdownAriaLabel(value: String): this.type = set("monthDropdownAriaLabel", value.asInstanceOf[js.Any])
    
    inline def monthDropdownAriaLabelledBy(value: String): this.type = set("monthDropdownAriaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def numOfMonths(value: `1` | `2`): this.type = set("numOfMonths", value.asInstanceOf[js.Any])
    
    inline def onClose(value: js.Function): this.type = set("onClose", value.asInstanceOf[js.Any])
    
    inline def onMonthChange(value: /* monthStart */ js.Date => Callback): this.type = set("onMonthChange", js.Any.fromFunction1((t0: /* monthStart */ js.Date) => value(t0).runNow()))
    
    inline def rightArrowAriaLabel(value: String): this.type = set("rightArrowAriaLabel", value.asInstanceOf[js.Any])
    
    inline def rightArrowAriaLabelledBy(value: String): this.type = set("rightArrowAriaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    inline def selectionMode(value: day | range): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    inline def shouldCloseOnSelect(value: Boolean): this.type = set("shouldCloseOnSelect", value.asInstanceOf[js.Any])
    
    inline def showMonthDropdown(value: Boolean): this.type = set("showMonthDropdown", value.asInstanceOf[js.Any])
    
    inline def showYearDropdown(value: Boolean): this.type = set("showYearDropdown", value.asInstanceOf[js.Any])
    
    inline def size(value: small | medium): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def today(value: js.Date): this.type = set("today", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Date | FromTo): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def yearDropdownAriaLabel(value: String): this.type = set("yearDropdownAriaLabel", value.asInstanceOf[js.Any])
    
    inline def yearDropdownAriaLabelledBy(value: String): this.type = set("yearDropdownAriaLabelledBy", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CalendarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
