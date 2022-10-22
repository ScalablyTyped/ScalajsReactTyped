package typingsJapgolly.dayzed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.dayzed.dayzedInts.`0`
import typingsJapgolly.dayzed.dayzedInts.`1`
import typingsJapgolly.dayzed.dayzedInts.`2`
import typingsJapgolly.dayzed.dayzedInts.`3`
import typingsJapgolly.dayzed.dayzedInts.`4`
import typingsJapgolly.dayzed.dayzedInts.`5`
import typingsJapgolly.dayzed.dayzedInts.`6`
import typingsJapgolly.dayzed.mod.DateObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<dayzed.dayzed.Props, 'children' | 'render'> */
  trait OmitPropschildrenrender extends StObject {
    
    var date: js.UndefOr[js.Date] = js.undefined
    
    var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var monthsToDisplay: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var onDateSelected: js.Function2[/* selectedDate */ DateObj, /* event */ ReactEventFrom[Element], Unit]
    
    var onOffsetChanged: js.UndefOr[js.Function1[/* offset */ Double, Unit]] = js.undefined
    
    var selected: js.UndefOr[js.Date | js.Array[js.Date]] = js.undefined
    
    var showOutsideDays: js.UndefOr[Boolean] = js.undefined
  }
  object OmitPropschildrenrender {
    
    inline def apply(onDateSelected: (/* selectedDate */ DateObj, /* event */ ReactEventFrom[Element]) => Callback): OmitPropschildrenrender = {
      val __obj = js.Dynamic.literal(onDateSelected = js.Any.fromFunction2((t0: /* selectedDate */ DateObj, t1: /* event */ ReactEventFrom[Element]) => (onDateSelected(t0, t1)).runNow()))
      __obj.asInstanceOf[OmitPropschildrenrender]
    }
    
    extension [Self <: OmitPropschildrenrender](x: Self) {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setFirstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMonthsToDisplay(value: Double): Self = StObject.set(x, "monthsToDisplay", value.asInstanceOf[js.Any])
      
      inline def setMonthsToDisplayUndefined: Self = StObject.set(x, "monthsToDisplay", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnDateSelected(value: (/* selectedDate */ DateObj, /* event */ ReactEventFrom[Element]) => Callback): Self = StObject.set(x, "onDateSelected", js.Any.fromFunction2((t0: /* selectedDate */ DateObj, t1: /* event */ ReactEventFrom[Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnOffsetChanged(value: /* offset */ Double => Callback): Self = StObject.set(x, "onOffsetChanged", js.Any.fromFunction1((t0: /* offset */ Double) => value(t0).runNow()))
      
      inline def setOnOffsetChangedUndefined: Self = StObject.set(x, "onOffsetChanged", js.undefined)
      
      inline def setSelected(value: js.Date | js.Array[js.Date]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSelectedVarargs(value: js.Date*): Self = StObject.set(x, "selected", js.Array(value*))
      
      inline def setShowOutsideDays(value: Boolean): Self = StObject.set(x, "showOutsideDays", value.asInstanceOf[js.Any])
      
      inline def setShowOutsideDaysUndefined: Self = StObject.set(x, "showOutsideDays", js.undefined)
    }
  }
}
