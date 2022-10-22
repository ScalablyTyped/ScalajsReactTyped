package typingsJapgolly.grommet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.grommet.anon.Next
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.AnimateType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.grommetInts.`0`
import typingsJapgolly.grommet.grommetInts.`1`
import typingsJapgolly.grommet.grommetStrings.array
import typingsJapgolly.grommet.grommetStrings.end
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.onSelect
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.start
import typingsJapgolly.grommet.grommetStrings.trim
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsCalendarMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/es6/components/Calendar", "Calendar")
  @js.native
  open class Calendar protected ()
    extends Component[CalendarExtendedProps, js.Object, Any] {
    def this(props: CalendarExtendedProps) = this()
    def this(props: CalendarExtendedProps, context: Any) = this()
  }
  @JSImport("grommet/es6/components/Calendar", "Calendar")
  @js.native
  val Calendar: ComponentClassP[CalendarExtendedProps & js.Object] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLDivElement>, std.HTMLDivElement>, 'a11yTitle' | 'alignSelf' | 'gridArea' | 'margin' | 'activeDate' | 'animate' | 'bounds' | 'children' | 'date' | 'dates' | 'daysOfWeek' | 'disabled' | 'fill' | 'firstDayOfWeek' | 'header' | 'locale' | 'messages' | 'onReference' | 'onSelect' | 'range' | 'reference' | 'showAdjacentDays' | 'size'> ]: react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLDivElement>, std.HTMLDivElement>[P]} */ trait CalendarExtendedProps
    extends StObject
       with CalendarProps
  object CalendarExtendedProps {
    
    inline def apply(): CalendarExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarExtendedProps]
    }
  }
  
  trait CalendarHeaderProps extends StObject {
    
    var date: js.Date
    
    var locale: js.UndefOr[String] = js.undefined
    
    var nextInBound: Boolean
    
    def onNextMonth(): Unit
    
    def onPreviousMonth(): Unit
    
    var previousInBound: Boolean
  }
  object CalendarHeaderProps {
    
    inline def apply(
      date: js.Date,
      nextInBound: Boolean,
      onNextMonth: Callback,
      onPreviousMonth: Callback,
      previousInBound: Boolean
    ): CalendarHeaderProps = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], nextInBound = nextInBound.asInstanceOf[js.Any], onNextMonth = onNextMonth.toJsFn, onPreviousMonth = onPreviousMonth.toJsFn, previousInBound = previousInBound.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarHeaderProps]
    }
    
    extension [Self <: CalendarHeaderProps](x: Self) {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setNextInBound(value: Boolean): Self = StObject.set(x, "nextInBound", value.asInstanceOf[js.Any])
      
      inline def setOnNextMonth(value: Callback): Self = StObject.set(x, "onNextMonth", value.toJsFn)
      
      inline def setOnPreviousMonth(value: Callback): Self = StObject.set(x, "onPreviousMonth", value.toJsFn)
      
      inline def setPreviousInBound(value: Boolean): Self = StObject.set(x, "previousInBound", value.asInstanceOf[js.Any])
    }
  }
  
  trait CalendarProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var activeDate: js.UndefOr[start | end] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var animate: js.UndefOr[AnimateType] = js.undefined
    
    var bounds: js.UndefOr[js.Array[String]] = js.undefined
    
    var children: js.UndefOr[js.Function1[/* args */ RenderProps, Node]] = js.undefined
    
    var date: js.UndefOr[String | (js.Array[String | js.Array[String]])] = js.undefined
    
    var dates: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
    
    var daysOfWeek: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var firstDayOfWeek: js.UndefOr[`0` | `1`] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var header: js.UndefOr[js.Function1[/* args */ CalendarHeaderProps, Node]] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var messages: js.UndefOr[Next] = js.undefined
    
    var onReference: js.UndefOr[js.Function1[/* reference */ String, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* select */ String | js.Array[String], Any]] = js.undefined
    
    var range: js.UndefOr[Boolean | array] = js.undefined
    
    var reference: js.UndefOr[String] = js.undefined
    
    var showAdjacentDays: js.UndefOr[Boolean | trim] = js.undefined
    
    var size: js.UndefOr[small | medium | large | String] = js.undefined
  }
  object CalendarProps {
    
    inline def apply(): CalendarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarProps]
    }
    
    extension [Self <: CalendarProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setActiveDate(value: start | end): Self = StObject.set(x, "activeDate", value.asInstanceOf[js.Any])
      
      inline def setActiveDateUndefined: Self = StObject.set(x, "activeDate", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAnimate(value: AnimateType): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setBounds(value: js.Array[String]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setBoundsVarargs(value: String*): Self = StObject.set(x, "bounds", js.Array(value*))
      
      inline def setChildren(value: /* args */ RenderProps => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDate(value: String | (js.Array[String | js.Array[String]])): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDateVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "date", js.Array(value*))
      
      inline def setDates(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
      
      inline def setDatesUndefined: Self = StObject.set(x, "dates", js.undefined)
      
      inline def setDatesVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "dates", js.Array(value*))
      
      inline def setDaysOfWeek(value: Boolean): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
      
      inline def setDaysOfWeekUndefined: Self = StObject.set(x, "daysOfWeek", js.undefined)
      
      inline def setDisabled(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisabledVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "disabled", js.Array(value*))
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFirstDayOfWeek(value: `0` | `1`): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setHeader(value: /* args */ CalendarHeaderProps => Node): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMessages(value: Next): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setOnReference(value: /* reference */ String => Callback): Self = StObject.set(x, "onReference", js.Any.fromFunction1((t0: /* reference */ String) => value(t0).runNow()))
      
      inline def setOnReferenceUndefined: Self = StObject.set(x, "onReference", js.undefined)
      
      inline def setOnSelect(value: /* select */ String | js.Array[String] => Any): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setRange(value: Boolean | array): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
      
      inline def setShowAdjacentDays(value: Boolean | trim): Self = StObject.set(x, "showAdjacentDays", value.asInstanceOf[js.Any])
      
      inline def setShowAdjacentDaysUndefined: Self = StObject.set(x, "showAdjacentDays", js.undefined)
      
      inline def setSize(value: small | medium | large | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type CalendarType = CalendarProps & (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], onSelect])
  
  trait RenderProps extends StObject {
    
    var date: js.Date
    
    var day: Double
    
    var isInRange: Boolean
    
    var isSelected: Boolean
  }
  object RenderProps {
    
    inline def apply(date: js.Date, day: Double, isInRange: Boolean, isSelected: Boolean): RenderProps = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], isInRange = isInRange.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderProps]
    }
    
    extension [Self <: RenderProps](x: Self) {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setIsInRange(value: Boolean): Self = StObject.set(x, "isInRange", value.asInstanceOf[js.Any])
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    }
  }
}
