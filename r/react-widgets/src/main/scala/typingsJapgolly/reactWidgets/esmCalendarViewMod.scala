package typingsJapgolly.reactWidgets

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLTableElement
import org.scalajs.dom.HTMLTableRowElement
import org.scalajs.dom.HTMLTableSectionElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactWidgets.reactWidgetsStrings.century
import typingsJapgolly.reactWidgets.reactWidgetsStrings.decade
import typingsJapgolly.reactWidgets.reactWidgetsStrings.month
import typingsJapgolly.reactWidgets.reactWidgetsStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCalendarViewMod {
  
  object default {
    
    inline def apply(hasClassNameFocusedItemOnKeyDownChildrenLabelledby: CalendarViewProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasClassNameFocusedItemOnKeyDownChildrenLabelledby.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-widgets/esm/CalendarView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-widgets/esm/CalendarView", "default.Body")
    @js.native
    def Body: js.Function1[/* props */ AllHTMLAttributes[HTMLTableSectionElement], Element] = js.native
    inline def Body_=(x: js.Function1[/* props */ AllHTMLAttributes[HTMLTableSectionElement], Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
    
    /* was `typeof CalendarViewCell` */
    inline def Cell(hasOnChangeMinMaxDateUnitDisabledSelectedFocusedItemViewUnitChildrenLabel: CellProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Cell")(hasOnChangeMinMaxDateUnitDisabledSelectedFocusedItemViewUnitChildrenLabel.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-widgets/esm/CalendarView", "default.Row")
    @js.native
    def Row: js.Function1[/* props */ AllHTMLAttributes[HTMLTableRowElement], Element] = js.native
    inline def Row_=(x: js.Function1[/* props */ AllHTMLAttributes[HTMLTableRowElement], Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Row")(x.asInstanceOf[js.Any])
  }
  
  trait CalendarViewProps extends StObject {
    
    var `aria-labelledby`: String
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var focusedItem: js.Date
    
    var id: String
    
    var onKeyDown: KeyboardEventHandler[HTMLTableElement]
  }
  object CalendarViewProps {
    
    inline def apply(
      `aria-labelledby`: String,
      focusedItem: js.Date,
      id: String,
      onKeyDown: ReactKeyboardEventFrom[HTMLTableElement & org.scalajs.dom.Element] => Callback
    ): CalendarViewProps = {
      val __obj = js.Dynamic.literal(focusedItem = focusedItem.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLTableElement & org.scalajs.dom.Element]) => onKeyDown(t0).runNow()))
      __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarViewProps]
    }
    
    extension [Self <: CalendarViewProps](x: Self) {
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFocusedItem(value: js.Date): Self = StObject.set(x, "focusedItem", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLTableElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLTableElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    }
  }
  
  trait CellProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var date: js.Date
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var focusedItem: js.UndefOr[js.Date] = js.undefined
    
    var label: String
    
    var max: js.Date
    
    var min: js.Date
    
    var now: js.UndefOr[js.Date] = js.undefined
    
    def onChange(date: js.Date): Unit
    
    var selected: js.UndefOr[js.Date | Null] = js.undefined
    
    var unit: DateUnit
    
    var viewUnit: month | year | decade | century
  }
  object CellProps {
    
    inline def apply(
      date: js.Date,
      label: String,
      max: js.Date,
      min: js.Date,
      onChange: js.Date => Callback,
      unit: DateUnit,
      viewUnit: month | year | decade | century
    ): CellProps = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: js.Date) => onChange(t0).runNow()), unit = unit.asInstanceOf[js.Any], viewUnit = viewUnit.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellProps]
    }
    
    extension [Self <: CellProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFocusedItem(value: js.Date): Self = StObject.set(x, "focusedItem", value.asInstanceOf[js.Any])
      
      inline def setFocusedItemUndefined: Self = StObject.set(x, "focusedItem", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setNow(value: js.Date): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setOnChange(value: js.Date => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
      
      inline def setSelected(value: js.Date): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedNull: Self = StObject.set(x, "selected", null)
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setUnit(value: DateUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setViewUnit(value: month | year | decade | century): Self = StObject.set(x, "viewUnit", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.second
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.minutes
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.hours
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.day
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.week
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.month
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.year
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.decade
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.century
  */
  trait DateUnit extends StObject
  object DateUnit {
    
    inline def century: typingsJapgolly.reactWidgets.reactWidgetsStrings.century = "century".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.century]
    
    inline def day: typingsJapgolly.reactWidgets.reactWidgetsStrings.day = "day".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.day]
    
    inline def decade: typingsJapgolly.reactWidgets.reactWidgetsStrings.decade = "decade".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.decade]
    
    inline def hours: typingsJapgolly.reactWidgets.reactWidgetsStrings.hours = "hours".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.hours]
    
    inline def minutes: typingsJapgolly.reactWidgets.reactWidgetsStrings.minutes = "minutes".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.minutes]
    
    inline def month: typingsJapgolly.reactWidgets.reactWidgetsStrings.month = "month".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.month]
    
    inline def second: typingsJapgolly.reactWidgets.reactWidgetsStrings.second = "second".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.second]
    
    inline def week: typingsJapgolly.reactWidgets.reactWidgetsStrings.week = "week".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.week]
    
    inline def year: typingsJapgolly.reactWidgets.reactWidgetsStrings.year = "year".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.year]
  }
}
