package typingsJapgolly.nivoWaffle.distTypesTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseHandlers[RawDatum /* <: Datum */, ElementType] extends StObject {
  
  var onClick: js.UndefOr[MouseHandler[RawDatum, ElementType]] = js.undefined
  
  var onMouseEnter: js.UndefOr[MouseHandler[RawDatum, ElementType]] = js.undefined
  
  var onMouseLeave: js.UndefOr[MouseHandler[RawDatum, ElementType]] = js.undefined
  
  var onMouseMove: js.UndefOr[MouseHandler[RawDatum, ElementType]] = js.undefined
}
object MouseHandlers {
  
  inline def apply[RawDatum /* <: Datum */, ElementType](): MouseHandlers[RawDatum, ElementType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseHandlers[RawDatum, ElementType]]
  }
  
  extension [Self <: MouseHandlers[?, ?], RawDatum /* <: Datum */, ElementType](x: Self & (MouseHandlers[RawDatum, ElementType])) {
    
    inline def setOnClick(
      value: (/* cell */ Cell[RawDatum], /* event */ ReactMouseEventFrom[ElementType & Element]) => Callback
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* cell */ Cell[RawDatum], t1: /* event */ ReactMouseEventFrom[ElementType & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(
      value: (/* cell */ Cell[RawDatum], /* event */ ReactMouseEventFrom[ElementType & Element]) => Callback
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2((t0: /* cell */ Cell[RawDatum], t1: /* event */ ReactMouseEventFrom[ElementType & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: (/* cell */ Cell[RawDatum], /* event */ ReactMouseEventFrom[ElementType & Element]) => Callback
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2((t0: /* cell */ Cell[RawDatum], t1: /* event */ ReactMouseEventFrom[ElementType & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(
      value: (/* cell */ Cell[RawDatum], /* event */ ReactMouseEventFrom[ElementType & Element]) => Callback
    ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2((t0: /* cell */ Cell[RawDatum], t1: /* event */ ReactMouseEventFrom[ElementType & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
  }
}
