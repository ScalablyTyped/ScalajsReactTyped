package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarDottypesMod.ICalendarIconStrings
import typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarYearMod.ICalendarYearHeaderProps
import typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarYearMod.ICalendarYearProps
import typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarYearMod.ICalendarYearStrings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CalendarYear {
  
  @JSImport("office-ui-fabric-react/lib/components/Calendar/CalendarYear", "CalendarYear")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.officeUiFabricReact.libComponentsCalendarCalendarYearMod.CalendarYear
        ] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def maxYear(value: Double): this.type = set("maxYear", value.asInstanceOf[js.Any])
    
    inline def minYear(value: Double): this.type = set("minYear", value.asInstanceOf[js.Any])
    
    inline def navigatedYear(value: Double): this.type = set("navigatedYear", value.asInstanceOf[js.Any])
    
    inline def navigationIcons(value: ICalendarIconStrings): this.type = set("navigationIcons", value.asInstanceOf[js.Any])
    
    inline def onHeaderSelect(value: /* focus */ Boolean => Callback): this.type = set("onHeaderSelect", js.Any.fromFunction1((t0: /* focus */ Boolean) => value(t0).runNow()))
    
    inline def onRenderTitle(value: /* props */ ICalendarYearHeaderProps => Node): this.type = set("onRenderTitle", js.Any.fromFunction1(value))
    
    inline def onRenderYear(value: /* year */ Double => Node): this.type = set("onRenderYear", js.Any.fromFunction1(value))
    
    inline def onSelectYear(value: /* year */ Double => Callback): this.type = set("onSelectYear", js.Any.fromFunction1((t0: /* year */ Double) => value(t0).runNow()))
    
    inline def selectedYear(value: Double): this.type = set("selectedYear", value.asInstanceOf[js.Any])
    
    inline def strings(value: ICalendarYearStrings): this.type = set("strings", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CalendarYear.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ICalendarYearProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
