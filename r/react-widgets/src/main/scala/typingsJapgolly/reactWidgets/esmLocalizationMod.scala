package typingsJapgolly.reactWidgets

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactWidgets.anon.PartialMessages
import typingsJapgolly.reactWidgets.esmMessagesMod.ProcessedMessages
import typingsJapgolly.reactWidgets.esmMessagesMod.UserProvidedMessages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmLocalizationMod {
  
  @JSImport("react-widgets/esm/Localization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply(hasDateNumberMessagesChildren: ProviderProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasDateNumberMessagesChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-widgets/esm/Localization", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def useLocalizer(): Localizer[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalizer")().asInstanceOf[Localizer[Any, Any]]
    inline def useLocalizer(messages: Unit, formats: FormatterOverrides[Any, Any]): Localizer[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalizer")(messages.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[Localizer[Any, Any]]
    inline def useLocalizer(messages: PartialMessages): Localizer[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalizer")(messages.asInstanceOf[js.Any]).asInstanceOf[Localizer[Any, Any]]
    inline def useLocalizer(messages: PartialMessages, formats: FormatterOverrides[Any, Any]): Localizer[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalizer")(messages.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[Localizer[Any, Any]]
  }
  
  inline def useLocalizer(): Localizer[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalizer")().asInstanceOf[Localizer[Any, Any]]
  inline def useLocalizer(messages: Unit, formats: FormatterOverrides[Any, Any]): Localizer[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalizer")(messages.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[Localizer[Any, Any]]
  inline def useLocalizer(messages: PartialMessages): Localizer[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalizer")(messages.asInstanceOf[js.Any]).asInstanceOf[Localizer[Any, Any]]
  inline def useLocalizer(messages: PartialMessages, formats: FormatterOverrides[Any, Any]): Localizer[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalizer")(messages.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[Localizer[Any, Any]]
  
  /* Inlined {[ Key in react-widgets.react-widgets/esm/Localization.RequiredDateMethods ]:? TFormat} */
  trait DateFormats[TFormat] extends StObject {
    
    var century: js.UndefOr[TFormat] = js.undefined
    
    var date: js.UndefOr[TFormat] = js.undefined
    
    var datetime: js.UndefOr[TFormat] = js.undefined
    
    var dayOfMonth: js.UndefOr[TFormat] = js.undefined
    
    var decade: js.UndefOr[TFormat] = js.undefined
    
    var header: js.UndefOr[TFormat] = js.undefined
    
    var month: js.UndefOr[TFormat] = js.undefined
    
    var time: js.UndefOr[TFormat] = js.undefined
    
    var weekday: js.UndefOr[TFormat] = js.undefined
    
    var year: js.UndefOr[TFormat] = js.undefined
  }
  object DateFormats {
    
    inline def apply[TFormat](): DateFormats[TFormat] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateFormats[TFormat]]
    }
    
    extension [Self <: DateFormats[?], TFormat](x: Self & DateFormats[TFormat]) {
      
      inline def setCentury(value: TFormat): Self = StObject.set(x, "century", value.asInstanceOf[js.Any])
      
      inline def setCenturyUndefined: Self = StObject.set(x, "century", js.undefined)
      
      inline def setDate(value: TFormat): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDatetime(value: TFormat): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
      
      inline def setDayOfMonth(value: TFormat): Self = StObject.set(x, "dayOfMonth", value.asInstanceOf[js.Any])
      
      inline def setDayOfMonthUndefined: Self = StObject.set(x, "dayOfMonth", js.undefined)
      
      inline def setDecade(value: TFormat): Self = StObject.set(x, "decade", value.asInstanceOf[js.Any])
      
      inline def setDecadeUndefined: Self = StObject.set(x, "decade", js.undefined)
      
      inline def setHeader(value: TFormat): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setMonth(value: TFormat): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setTime(value: TFormat): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setWeekday(value: TFormat): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
      
      inline def setYear(value: TFormat): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  /* Inlined {parse (dateString : string, format : TD | undefined): std.Date | null, firstOfWeek (): number} & {[ Key in react-widgets.react-widgets/esm/Localization.RequiredDateMethods ]: (date : std.Date, format : TD | undefined): string} */
  @js.native
  trait DateLocalizer[TD] extends StObject {
    
    var century: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[TD], String] = js.native
    
    var date: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[TD], String] = js.native
    
    var datetime: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[TD], String] = js.native
    
    var dayOfMonth: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[TD], String] = js.native
    
    var decade: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[TD], String] = js.native
    
    def firstOfWeek(): Double = js.native
    
    var header: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[TD], String] = js.native
    
    var month: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[TD], String] = js.native
    
    def parse(dateString: String): js.Date | Null = js.native
    def parse(dateString: String, format: TD): js.Date | Null = js.native
    
    var time: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[TD], String] = js.native
    
    var weekday: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[TD], String] = js.native
    
    var year: js.Function2[/* date */ js.Date, /* format */ js.UndefOr[TD], String] = js.native
  }
  
  trait DateTimePart extends StObject {
    
    var `type`: DateTimePartType
    
    var value: String
  }
  object DateTimePart {
    
    inline def apply(`type`: DateTimePartType, value: String): DateTimePart = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateTimePart]
    }
    
    extension [Self <: DateTimePart](x: Self) {
      
      inline def setType(value: DateTimePartType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.day
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.dayPeriod
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.era
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.hour
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.literal
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.minute
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.month
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.second
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.weekday
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.year
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.millisecond
  */
  trait DateTimePartType extends StObject
  object DateTimePartType {
    
    inline def day: typingsJapgolly.reactWidgets.reactWidgetsStrings.day = "day".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.day]
    
    inline def dayPeriod: typingsJapgolly.reactWidgets.reactWidgetsStrings.dayPeriod = "dayPeriod".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.dayPeriod]
    
    inline def era: typingsJapgolly.reactWidgets.reactWidgetsStrings.era = "era".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.era]
    
    inline def hour: typingsJapgolly.reactWidgets.reactWidgetsStrings.hour = "hour".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.hour]
    
    inline def literal: typingsJapgolly.reactWidgets.reactWidgetsStrings.literal = "literal".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.literal]
    
    inline def millisecond: typingsJapgolly.reactWidgets.reactWidgetsStrings.millisecond = "millisecond".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.millisecond]
    
    inline def minute: typingsJapgolly.reactWidgets.reactWidgetsStrings.minute = "minute".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.minute]
    
    inline def month: typingsJapgolly.reactWidgets.reactWidgetsStrings.month = "month".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.month]
    
    inline def second: typingsJapgolly.reactWidgets.reactWidgetsStrings.second = "second".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.second]
    
    inline def weekday: typingsJapgolly.reactWidgets.reactWidgetsStrings.weekday = "weekday".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.weekday]
    
    inline def year: typingsJapgolly.reactWidgets.reactWidgetsStrings.year = "year".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.year]
  }
  
  /* Inlined react-widgets.react-widgets/esm/Localization.DateFormats<TD> & {  number :TN | undefined} */
  trait FormatterOverrides[TD, TN] extends StObject {
    
    var century: js.UndefOr[TD] = js.undefined
    
    var date: js.UndefOr[TD] = js.undefined
    
    var datetime: js.UndefOr[TD] = js.undefined
    
    var dayOfMonth: js.UndefOr[TD] = js.undefined
    
    var decade: js.UndefOr[TD] = js.undefined
    
    var header: js.UndefOr[TD] = js.undefined
    
    var month: js.UndefOr[TD] = js.undefined
    
    var number: js.UndefOr[TN] = js.undefined
    
    var time: js.UndefOr[TD] = js.undefined
    
    var weekday: js.UndefOr[TD] = js.undefined
    
    var year: js.UndefOr[TD] = js.undefined
  }
  object FormatterOverrides {
    
    inline def apply[TD, TN](): FormatterOverrides[TD, TN] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatterOverrides[TD, TN]]
    }
    
    extension [Self <: FormatterOverrides[?, ?], TD, TN](x: Self & (FormatterOverrides[TD, TN])) {
      
      inline def setCentury(value: TD): Self = StObject.set(x, "century", value.asInstanceOf[js.Any])
      
      inline def setCenturyUndefined: Self = StObject.set(x, "century", js.undefined)
      
      inline def setDate(value: TD): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDatetime(value: TD): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
      
      inline def setDayOfMonth(value: TD): Self = StObject.set(x, "dayOfMonth", value.asInstanceOf[js.Any])
      
      inline def setDayOfMonthUndefined: Self = StObject.set(x, "dayOfMonth", js.undefined)
      
      inline def setDecade(value: TD): Self = StObject.set(x, "decade", value.asInstanceOf[js.Any])
      
      inline def setDecadeUndefined: Self = StObject.set(x, "decade", js.undefined)
      
      inline def setHeader(value: TD): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setMonth(value: TD): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setNumber(value: TN): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setTime(value: TD): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setWeekday(value: TD): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
      
      inline def setYear(value: TD): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  @js.native
  trait Localizer[TD, TN] extends StObject {
    
    def decimalCharacter(): String = js.native
    
    def firstOfWeek(): Double = js.native
    
    def formatDate(value: js.Date, formatter: RequiredDateMethods): String = js.native
    def formatDate(value: js.Date, formatter: RequiredDateMethods, userFormat: TD): String = js.native
    
    def formatNumber(value: Double): String = js.native
    def formatNumber(value: Double, userFormat: TN): String = js.native
    
    var formatOverrides: FormatterOverrides[TD, TN] = js.native
    
    var messages: ProcessedMessages = js.native
    
    def parseDate(dateString: String): js.Date | Null = js.native
    def parseDate(dateString: String, format: TD): js.Date | Null = js.native
    
    def parseNumber(numberString: String): Double | Null = js.native
    def parseNumber(numberString: String, format: TN): Double | Null = js.native
  }
  
  @js.native
  trait NumberLocalizer[TN] extends StObject {
    
    def decimalCharacter(): String = js.native
    
    def format(value: Double): String = js.native
    def format(value: Double, format: TN): String = js.native
    
    def parse(numberString: String): Double | Null = js.native
    def parse(numberString: String, format: TN): Double | Null = js.native
  }
  
  trait ProviderProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var date: js.UndefOr[DateLocalizer[Any]] = js.undefined
    
    var messages: js.UndefOr[UserProvidedMessages] = js.undefined
    
    var number: js.UndefOr[NumberLocalizer[Any]] = js.undefined
  }
  object ProviderProps {
    
    inline def apply(): ProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProviderProps]
    }
    
    extension [Self <: ProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDate(value: DateLocalizer[Any]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setMessages(value: UserProvidedMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setNumber(value: NumberLocalizer[Any]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.date
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.time
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.datetime
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.header
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.weekday
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.dayOfMonth
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.month
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.year
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.decade
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.century
  */
  trait RequiredDateMethods extends StObject
  object RequiredDateMethods {
    
    inline def century: typingsJapgolly.reactWidgets.reactWidgetsStrings.century = "century".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.century]
    
    inline def date: typingsJapgolly.reactWidgets.reactWidgetsStrings.date = "date".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.date]
    
    inline def datetime: typingsJapgolly.reactWidgets.reactWidgetsStrings.datetime = "datetime".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.datetime]
    
    inline def dayOfMonth: typingsJapgolly.reactWidgets.reactWidgetsStrings.dayOfMonth = "dayOfMonth".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.dayOfMonth]
    
    inline def decade: typingsJapgolly.reactWidgets.reactWidgetsStrings.decade = "decade".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.decade]
    
    inline def header: typingsJapgolly.reactWidgets.reactWidgetsStrings.header = "header".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.header]
    
    inline def month: typingsJapgolly.reactWidgets.reactWidgetsStrings.month = "month".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.month]
    
    inline def time: typingsJapgolly.reactWidgets.reactWidgetsStrings.time = "time".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.time]
    
    inline def weekday: typingsJapgolly.reactWidgets.reactWidgetsStrings.weekday = "weekday".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.weekday]
    
    inline def year: typingsJapgolly.reactWidgets.reactWidgetsStrings.year = "year".asInstanceOf[typingsJapgolly.reactWidgets.reactWidgetsStrings.year]
  }
}
