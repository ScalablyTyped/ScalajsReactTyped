package typingsJapgolly.grommet.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.anon.Next
import typingsJapgolly.grommet.es6ComponentsCalendarMod.CalendarExtendedProps
import typingsJapgolly.grommet.es6ComponentsCalendarMod.CalendarHeaderProps
import typingsJapgolly.grommet.es6ComponentsCalendarMod.RenderProps
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.AnimateType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.grommetInts.`0`
import typingsJapgolly.grommet.grommetInts.`1`
import typingsJapgolly.grommet.grommetStrings.array
import typingsJapgolly.grommet.grommetStrings.end
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.start
import typingsJapgolly.grommet.grommetStrings.trim
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Calendar {
  
  @JSImport("grommet/es6", "Calendar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.grommet.es6Mod.Calendar] {
    
    inline def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    
    inline def activeDate(value: start | end): this.type = set("activeDate", value.asInstanceOf[js.Any])
    
    inline def alignSelf(value: AlignSelfType): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    inline def animate(value: AnimateType): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def bounds(value: js.Array[String]): this.type = set("bounds", value.asInstanceOf[js.Any])
    
    inline def boundsVarargs(value: String*): this.type = set("bounds", js.Array(value*))
    
    inline def children(value: /* args */ RenderProps => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def date(value: String | (js.Array[String | js.Array[String]])): this.type = set("date", value.asInstanceOf[js.Any])
    
    inline def dateVarargs(value: (String | js.Array[String])*): this.type = set("date", js.Array(value*))
    
    inline def dates(value: js.Array[String | js.Array[String]]): this.type = set("dates", value.asInstanceOf[js.Any])
    
    inline def datesVarargs(value: (String | js.Array[String])*): this.type = set("dates", js.Array(value*))
    
    inline def daysOfWeek(value: Boolean): this.type = set("daysOfWeek", value.asInstanceOf[js.Any])
    
    inline def disabled(value: js.Array[String | js.Array[String]]): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def disabledVarargs(value: (String | js.Array[String])*): this.type = set("disabled", js.Array(value*))
    
    inline def fill(value: Boolean): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def firstDayOfWeek(value: `0` | `1`): this.type = set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    inline def header(value: /* args */ CalendarHeaderProps => Node): this.type = set("header", js.Any.fromFunction1(value))
    
    inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def messages(value: Next): this.type = set("messages", value.asInstanceOf[js.Any])
    
    inline def onReference(value: /* reference */ String => Callback): this.type = set("onReference", js.Any.fromFunction1((t0: /* reference */ String) => value(t0).runNow()))
    
    inline def onSelect(value: /* select */ String | js.Array[String] => Any): this.type = set("onSelect", js.Any.fromFunction1(value))
    
    inline def range(value: Boolean | array): this.type = set("range", value.asInstanceOf[js.Any])
    
    inline def reference(value: String): this.type = set("reference", value.asInstanceOf[js.Any])
    
    inline def showAdjacentDays(value: Boolean | trim): this.type = set("showAdjacentDays", value.asInstanceOf[js.Any])
    
    inline def size(value: small | medium | large | String): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Calendar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CalendarExtendedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
