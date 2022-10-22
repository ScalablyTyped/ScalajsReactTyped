package typingsJapgolly.reactDates.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.reactDates.reactDatesInts.`-1`
import typingsJapgolly.reactDates.reactDatesInts.`0`
import typingsJapgolly.std.HTMLTableDataCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarDayShape extends StObject {
  
  var ariaLabelFormat: js.UndefOr[String] = js.undefined
  
  var day: js.UndefOr[Moment | Null] = js.undefined
  
  var daySize: js.UndefOr[Double] = js.undefined
  
  var isFocused: js.UndefOr[Boolean] = js.undefined
  
  var isOutsideDay: js.UndefOr[Boolean] = js.undefined
  
  var modifiers: js.UndefOr[ModifiersShape] = js.undefined
  
  var onDayClick: js.UndefOr[
    js.Function2[
      /* day */ Moment, 
      /* event */ ReactMouseEventFrom[HTMLTableDataCellElement & Element], 
      Unit
    ]
  ] = js.undefined
  
  var onDayMouseEnter: js.UndefOr[
    js.Function2[
      /* day */ Moment, 
      /* event */ ReactMouseEventFrom[HTMLTableDataCellElement & Element], 
      Unit
    ]
  ] = js.undefined
  
  var onDayMouseLeave: js.UndefOr[
    js.Function2[
      /* day */ Moment, 
      /* event */ ReactMouseEventFrom[HTMLTableDataCellElement & Element], 
      Unit
    ]
  ] = js.undefined
  
  // internationalization
  var phrases: js.UndefOr[CalendarDayPhrases] = js.undefined
  
  var renderDayContents: js.UndefOr[(js.Function2[/* day */ Moment, /* modifiers */ ModifiersShape, Node]) | Null] = js.undefined
  
  var tabIndex: js.UndefOr[`0` | `-1`] = js.undefined
}
object CalendarDayShape {
  
  inline def apply(): CalendarDayShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarDayShape]
  }
  
  extension [Self <: CalendarDayShape](x: Self) {
    
    inline def setAriaLabelFormat(value: String): Self = StObject.set(x, "ariaLabelFormat", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelFormatUndefined: Self = StObject.set(x, "ariaLabelFormat", js.undefined)
    
    inline def setDay(value: Moment): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayNull: Self = StObject.set(x, "day", null)
    
    inline def setDaySize(value: Double): Self = StObject.set(x, "daySize", value.asInstanceOf[js.Any])
    
    inline def setDaySizeUndefined: Self = StObject.set(x, "daySize", js.undefined)
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    inline def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
    
    inline def setIsOutsideDay(value: Boolean): Self = StObject.set(x, "isOutsideDay", value.asInstanceOf[js.Any])
    
    inline def setIsOutsideDayUndefined: Self = StObject.set(x, "isOutsideDay", js.undefined)
    
    inline def setModifiers(value: ModifiersShape): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setOnDayClick(
      value: (/* day */ Moment, /* event */ ReactMouseEventFrom[HTMLTableDataCellElement & Element]) => Callback
    ): Self = StObject.set(x, "onDayClick", js.Any.fromFunction2((t0: /* day */ Moment, t1: /* event */ ReactMouseEventFrom[HTMLTableDataCellElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
    
    inline def setOnDayMouseEnter(
      value: (/* day */ Moment, /* event */ ReactMouseEventFrom[HTMLTableDataCellElement & Element]) => Callback
    ): Self = StObject.set(x, "onDayMouseEnter", js.Any.fromFunction2((t0: /* day */ Moment, t1: /* event */ ReactMouseEventFrom[HTMLTableDataCellElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnDayMouseEnterUndefined: Self = StObject.set(x, "onDayMouseEnter", js.undefined)
    
    inline def setOnDayMouseLeave(
      value: (/* day */ Moment, /* event */ ReactMouseEventFrom[HTMLTableDataCellElement & Element]) => Callback
    ): Self = StObject.set(x, "onDayMouseLeave", js.Any.fromFunction2((t0: /* day */ Moment, t1: /* event */ ReactMouseEventFrom[HTMLTableDataCellElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnDayMouseLeaveUndefined: Self = StObject.set(x, "onDayMouseLeave", js.undefined)
    
    inline def setPhrases(value: CalendarDayPhrases): Self = StObject.set(x, "phrases", value.asInstanceOf[js.Any])
    
    inline def setPhrasesUndefined: Self = StObject.set(x, "phrases", js.undefined)
    
    inline def setRenderDayContents(value: (/* day */ Moment, /* modifiers */ ModifiersShape) => Node): Self = StObject.set(x, "renderDayContents", js.Any.fromFunction2(value))
    
    inline def setRenderDayContentsNull: Self = StObject.set(x, "renderDayContents", null)
    
    inline def setRenderDayContentsUndefined: Self = StObject.set(x, "renderDayContents", js.undefined)
    
    inline def setTabIndex(value: `0` | `-1`): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
  }
}
