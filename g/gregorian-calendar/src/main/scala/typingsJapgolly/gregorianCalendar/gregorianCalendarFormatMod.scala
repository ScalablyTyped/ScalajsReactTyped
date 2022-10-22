package typingsJapgolly.gregorianCalendar

import typingsJapgolly.gregorianCalendar.anon.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gregorianCalendarFormatMod {
  
  @JSImport("gregorian-calendar-format", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DateTimeFormat {
    /**
      * @param pattern The format pattern string
      * @param locale The local of to output (defaults to require('gregorian-calendar/lib/locale/en_US'),
      *               may also be one of:
      *                   require('gregorian-calendar/lib/locale/zh_CN')
      *                   require('gregorian-calendar/lib/locale/ru_RU')
      */
    def this(pattern: String) = this()
    def this(pattern: String, locale: js.Object) = this()
  }
  
  @js.native
  sealed trait DateTimeStyle extends StObject
  @JSImport("gregorian-calendar-format", "DateTimeStyle")
  @js.native
  object DateTimeStyle extends StObject {
    
    /**
      * full style
      */
    @js.native
    sealed trait FULL
      extends StObject
         with DateTimeStyle
    
    /**
      * long style
      */
    @js.native
    sealed trait LONG
      extends StObject
         with DateTimeStyle
    
    /**
      * medium style
      */
    @js.native
    sealed trait MEDIUM
      extends StObject
         with DateTimeStyle
    
    /**
      * short style
      */
    @js.native
    sealed trait SHORT
      extends StObject
         with DateTimeStyle
  }
  
  @js.native
  trait DateTimeFormat extends StObject {
    
    var Style: DateTimeStyle = js.native
    
    /**
      * format an instance of GregorianCalendar according to pattern
      */
    def format(calendar: typingsJapgolly.gregorianCalendar.mod.^): String = js.native
    
    /**
      * get a predefine GregorianCalendarFormat instance
      */
    def getDateTimeInstance(dateStyle: DateTimeStyle, timeStyle: DateTimeStyle): DateTimeFormat = js.native
    def getDateTimeInstance(dateStyle: DateTimeStyle, timeStyle: DateTimeStyle, locale: js.Object): DateTimeFormat = js.native
    
    /**
      * parse a dateString to an instance of GregorianCalendar according to pattern, it's better to specify calendarLocale, such as
      *  `df.parse('2013-11-12', {locale: require('gregorian-calendar/lib/locale/zh_CN'}));`
      */
    def parse(dateString: String, hasLocale: Locale): typingsJapgolly.gregorianCalendar.mod.^ = js.native
  }
}
