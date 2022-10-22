package typingsJapgolly.nivoLegends.distTypesTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.SVGRectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<'onClick' | 'onMouseEnter' | 'onMouseLeave', (datum : @nivo/legends.@nivo/legends/dist/types/types.Datum, event : react.react.MouseEvent<std.SVGRectElement, react.react.NativeMouseEvent>): void> & {toggleSerie (id : @nivo/legends.@nivo/legends/dist/types/types.Datum['id']): void}> */
trait InteractivityProps extends StObject {
  
  var onClick: js.UndefOr[
    js.Function2[/* datum */ Datum, /* event */ ReactMouseEventFrom[SVGRectElement], Unit]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    js.Function2[/* datum */ Datum, /* event */ ReactMouseEventFrom[SVGRectElement], Unit]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    js.Function2[/* datum */ Datum, /* event */ ReactMouseEventFrom[SVGRectElement], Unit]
  ] = js.undefined
  
  var toggleSerie: js.UndefOr[js.Function1[/* id */ String | Double, Unit]] = js.undefined
}
object InteractivityProps {
  
  inline def apply(): InteractivityProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractivityProps]
  }
  
  extension [Self <: InteractivityProps](x: Self) {
    
    inline def setOnClick(value: (/* datum */ Datum, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* datum */ Datum, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(value: (/* datum */ Datum, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2((t0: /* datum */ Datum, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: (/* datum */ Datum, /* event */ ReactMouseEventFrom[SVGRectElement]) => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2((t0: /* datum */ Datum, t1: /* event */ ReactMouseEventFrom[SVGRectElement]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setToggleSerie(value: /* id */ String | Double => Callback): Self = StObject.set(x, "toggleSerie", js.Any.fromFunction1((t0: /* id */ String | Double) => value(t0).runNow()))
    
    inline def setToggleSerieUndefined: Self = StObject.set(x, "toggleSerie", js.undefined)
  }
}
