package typingsJapgolly.reactDates.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactDates.reactDatesStrings.verticalScrollable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnGetPrevScrollableMonths extends StObject {
  
  var onGetNextScrollableMonths: js.UndefOr[
    js.Function1[
      /* event */ js.UndefOr[ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]], 
      Unit
    ]
  ] = js.undefined
  
  // VERTICAL_SCROLLABLE daypickers only
  var onGetPrevScrollableMonths: js.UndefOr[
    js.Function1[
      /* event */ js.UndefOr[ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]], 
      Unit
    ]
  ] = js.undefined
  
  var orientation: verticalScrollable
}
object OnGetPrevScrollableMonths {
  
  inline def apply(): OnGetPrevScrollableMonths = {
    val __obj = js.Dynamic.literal(orientation = "verticalScrollable")
    __obj.asInstanceOf[OnGetPrevScrollableMonths]
  }
  
  extension [Self <: OnGetPrevScrollableMonths](x: Self) {
    
    inline def setOnGetNextScrollableMonths(
      value: /* event */ js.UndefOr[ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]] => Callback
    ): Self = StObject.set(x, "onGetNextScrollableMonths", js.Any.fromFunction1((t0: /* event */ js.UndefOr[ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]]) => value(t0).runNow()))
    
    inline def setOnGetNextScrollableMonthsUndefined: Self = StObject.set(x, "onGetNextScrollableMonths", js.undefined)
    
    inline def setOnGetPrevScrollableMonths(
      value: /* event */ js.UndefOr[ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]] => Callback
    ): Self = StObject.set(x, "onGetPrevScrollableMonths", js.Any.fromFunction1((t0: /* event */ js.UndefOr[ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]]) => value(t0).runNow()))
    
    inline def setOnGetPrevScrollableMonthsUndefined: Self = StObject.set(x, "onGetPrevScrollableMonths", js.undefined)
    
    inline def setOrientation(value: verticalScrollable): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
  }
}
