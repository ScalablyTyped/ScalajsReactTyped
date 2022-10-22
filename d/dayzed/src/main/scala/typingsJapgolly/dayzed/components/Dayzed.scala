package typingsJapgolly.dayzed.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.dayzed.dayzedInts.`0`
import typingsJapgolly.dayzed.dayzedInts.`1`
import typingsJapgolly.dayzed.dayzedInts.`2`
import typingsJapgolly.dayzed.dayzedInts.`3`
import typingsJapgolly.dayzed.dayzedInts.`4`
import typingsJapgolly.dayzed.dayzedInts.`5`
import typingsJapgolly.dayzed.dayzedInts.`6`
import typingsJapgolly.dayzed.mod.DateObj
import typingsJapgolly.dayzed.mod.Props
import typingsJapgolly.dayzed.mod.RenderProps
import typingsJapgolly.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dayzed {
  
  inline def apply(onDateSelected: (DateObj, ReactEventFrom[Element]) => Callback): Builder = {
    val __props = js.Dynamic.literal(onDateSelected = js.Any.fromFunction2((t0: DateObj, t1: ReactEventFrom[Element]) => (onDateSelected(t0, t1)).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsWithChildren[Props]]))
  }
  
  @JSImport("dayzed", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: /* renderProps */ RenderProps => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def date(value: js.Date): this.type = set("date", value.asInstanceOf[js.Any])
    
    inline def firstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): this.type = set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def monthsToDisplay(value: Double): this.type = set("monthsToDisplay", value.asInstanceOf[js.Any])
    
    inline def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def onOffsetChanged(value: /* offset */ Double => Callback): this.type = set("onOffsetChanged", js.Any.fromFunction1((t0: /* offset */ Double) => value(t0).runNow()))
    
    inline def render(value: /* renderProps */ RenderProps => Node): this.type = set("render", js.Any.fromFunction1(value))
    
    inline def selected(value: js.Date | js.Array[js.Date]): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def selectedVarargs(value: js.Date*): this.type = set("selected", js.Array(value*))
    
    inline def showOutsideDays(value: Boolean): this.type = set("showOutsideDays", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsWithChildren[Props]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
