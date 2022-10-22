package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.std.Record
import typingsJapgolly.wixDesignSystemsLocaleUtils.distTypesDateTimeFormatConstantsMod.SupportedWixLocales_
import typingsJapgolly.wixStyleReact.anon.Date
import typingsJapgolly.wixStyleReact.anon.From
import typingsJapgolly.wixStyleReact.distTypesCalendarBaseCalendarBaseCalendarMod.BaseCalendarProps
import typingsJapgolly.wixStyleReact.distTypesCalendarBaseCalendarBaseCalendarMod.default
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`0`
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`1`
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`2`
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`3`
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`4`
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`5`
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`6`
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.day
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BaseCalendar {
  
  inline def apply(
    captionElement: Element | (ComponentClassP[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CaptionElementProps */ Any) & js.Object
    ]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<CaptionElementProps> */ Any),
    displayedMonth: js.Date,
    onChange: (js.Date | From, Any) => Callback
  ): Builder = {
    val __props = js.Dynamic.literal(captionElement = captionElement.asInstanceOf[js.Any], displayedMonth = displayedMonth.asInstanceOf[js.Any], onChange = js.Any.fromFunction2((t0: js.Date | From, t1: Any) => (onChange(t0, t1)).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[BaseCalendarProps]))
  }
  
  @JSImport("wix-style-react/dist/types/Calendar/BaseCalendar/BaseCalendar", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def allowSelectingOutsideDays(value: Boolean): this.type = set("allowSelectingOutsideDays", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def dateIndication(value: /* param */ Date => Callback): this.type = set("dateIndication", js.Any.fromFunction1((t0: /* param */ Date) => value(t0).runNow()))
    
    inline def excludePastDates(value: Boolean): this.type = set("excludePastDates", value.asInstanceOf[js.Any])
    
    inline def filterDate(value: /* date */ js.Date => Boolean): this.type = set("filterDate", js.Any.fromFunction1(value))
    
    inline def firstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): this.type = set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def locale(value: SupportedWixLocales_): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def modifiers(value: Record[String, Any]): this.type = set("modifiers", value.asInstanceOf[js.Any])
    
    inline def numOfMonths(value: `1` | `2`): this.type = set("numOfMonths", value.asInstanceOf[js.Any])
    
    inline def onClose(value: /* event */ js.UndefOr[Any] => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: /* event */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def onDisplayedViewChange(value: /* month */ js.Date => Callback): this.type = set("onDisplayedViewChange", js.Any.fromFunction1((t0: /* month */ js.Date) => value(t0).runNow()))
    
    inline def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    inline def selectionMode(value: day | range): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    inline def shouldCloseOnSelect(value: Boolean): this.type = set("shouldCloseOnSelect", value.asInstanceOf[js.Any])
    
    inline def today(value: js.Date): this.type = set("today", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Date | From): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BaseCalendarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
