package typingsJapgolly.reactVis.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.reactVis.anon.Color
import typingsJapgolly.reactVis.reactVisStrings.horizontal
import typingsJapgolly.reactVis.reactVisStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscreteColorLegendProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  // default: ''
  var items: js.Array[Color | String | ReactChild]
  
  var onItemClick: js.UndefOr[RVMouseEventHandler] = js.undefined
  
  var onItemMouseEnter: js.UndefOr[RVItemEventHandler] = js.undefined
  
  var onItemMouseLeave: js.UndefOr[RVItemEventHandler] = js.undefined
  
  var orientation: js.UndefOr[vertical | horizontal] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object DiscreteColorLegendProps {
  
  inline def apply(items: js.Array[Color | String | ReactChild]): DiscreteColorLegendProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscreteColorLegendProps]
  }
  
  extension [Self <: DiscreteColorLegendProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setItems(value: js.Array[Color | String | ReactChild]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: (Color | String | ReactChild)*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setOnItemClick(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
    
    inline def setOnItemMouseEnter(
      value: (/* item */ Any, /* index */ Double, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback
    ): Self = StObject.set(x, "onItemMouseEnter", js.Any.fromFunction3((t0: /* item */ Any, t1: /* index */ Double, t2: /* event */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnItemMouseEnterUndefined: Self = StObject.set(x, "onItemMouseEnter", js.undefined)
    
    inline def setOnItemMouseLeave(
      value: (/* item */ Any, /* index */ Double, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback
    ): Self = StObject.set(x, "onItemMouseLeave", js.Any.fromFunction3((t0: /* item */ Any, t1: /* index */ Double, t2: /* event */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnItemMouseLeaveUndefined: Self = StObject.set(x, "onItemMouseLeave", js.undefined)
    
    inline def setOrientation(value: vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
