package typingsJapgolly.nivoBar.distTypesTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import typingsJapgolly.nivoBar.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarHandlers[RawDatum, Element] extends StObject {
  
  var onClick: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatum[RawDatum] & Color, 
      /* event */ ReactMouseEventFrom[Element & org.scalajs.dom.Element], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatum[RawDatum], 
      /* event */ ReactMouseEventFrom[Element & org.scalajs.dom.Element], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatum[RawDatum], 
      /* event */ ReactMouseEventFrom[Element & org.scalajs.dom.Element], 
      Unit
    ]
  ] = js.undefined
}
object BarHandlers {
  
  inline def apply[RawDatum, Element](): BarHandlers[RawDatum, Element] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarHandlers[RawDatum, Element]]
  }
  
  extension [Self <: BarHandlers[?, ?], RawDatum, Element](x: Self & (BarHandlers[RawDatum, Element])) {
    
    inline def setOnClick(
      value: (/* datum */ ComputedDatum[RawDatum] & Color, /* event */ ReactMouseEventFrom[Element & org.scalajs.dom.Element]) => Callback
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum] & Color, t1: /* event */ ReactMouseEventFrom[Element & org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[Element & org.scalajs.dom.Element]) => Callback
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[Element & org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[Element & org.scalajs.dom.Element]) => Callback
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[Element & org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
  }
}
