package typingsJapgolly.reactVis.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.reactVis.anon.Disabled
import typingsJapgolly.reactVis.mod.SearchableDiscreteColorLegendProps
import typingsJapgolly.reactVis.reactVisStrings.horizontal
import typingsJapgolly.reactVis.reactVisStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchableDiscreteColorLegend {
  
  inline def apply(items: js.Array[Disabled | String | ReactChild]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SearchableDiscreteColorLegendProps]))
  }
  
  @JSImport("react-vis", "SearchableDiscreteColorLegend")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def onItemClick(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onItemClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onItemMouseEnter(
      value: (/* item */ Any, /* index */ Double, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback
    ): this.type = set("onItemMouseEnter", js.Any.fromFunction3((t0: /* item */ Any, t1: /* index */ Double, t2: /* event */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1, t2)).runNow()))
    
    inline def onItemMouseLeave(
      value: (/* item */ Any, /* index */ Double, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback
    ): this.type = set("onItemMouseLeave", js.Any.fromFunction3((t0: /* item */ Any, t1: /* index */ Double, t2: /* event */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1, t2)).runNow()))
    
    inline def onSearchChange(value: /* x */ Any => Any): this.type = set("onSearchChange", js.Any.fromFunction1(value))
    
    inline def orientation(value: vertical | horizontal): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def searchFn(value: (/* items */ js.Array[Any], /* s */ String) => js.Array[Any]): this.type = set("searchFn", js.Any.fromFunction2(value))
    
    inline def searchPlaceholder(value: String): this.type = set("searchPlaceholder", value.asInstanceOf[js.Any])
    
    inline def searchText(value: String): this.type = set("searchText", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SearchableDiscreteColorLegendProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
