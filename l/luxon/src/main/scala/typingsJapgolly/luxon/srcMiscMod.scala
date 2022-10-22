package typingsJapgolly.luxon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiscMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    std.Intl.DateTimeFormatOptions extends {  calendar :infer T | undefined} ? T : 'buddhist' | 'chinese' | 'coptic' | 'ethioaa' | 'ethiopic' | 'gregory' | 'hebrew' | 'indian' | 'islamic' | 'islamicc' | 'iso8601' | 'japanese' | 'persian' | 'roc'
    }}}
    */
  @js.native
  trait CalendarSystem extends StObject
  
  type DateTimeFormatOptions = typingsJapgolly.std.Intl.DateTimeFormatOptions
  
  type EraLength = StringUnitLength
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.luxon.luxonStrings.h11
    - typingsJapgolly.luxon.luxonStrings.h12
    - typingsJapgolly.luxon.luxonStrings.h23
    - typingsJapgolly.luxon.luxonStrings.h24
  */
  trait HourCycle extends StObject
  object HourCycle {
    
    inline def h11: typingsJapgolly.luxon.luxonStrings.h11 = "h11".asInstanceOf[typingsJapgolly.luxon.luxonStrings.h11]
    
    inline def h12: typingsJapgolly.luxon.luxonStrings.h12 = "h12".asInstanceOf[typingsJapgolly.luxon.luxonStrings.h12]
    
    inline def h23: typingsJapgolly.luxon.luxonStrings.h23 = "h23".asInstanceOf[typingsJapgolly.luxon.luxonStrings.h23]
    
    inline def h24: typingsJapgolly.luxon.luxonStrings.h24 = "h24".asInstanceOf[typingsJapgolly.luxon.luxonStrings.h24]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.luxon.luxonStrings.numeric
    - typingsJapgolly.luxon.luxonStrings.`2-digit`
  */
  trait NumberUnitLength extends StObject
  object NumberUnitLength {
    
    inline def `2-digit`: typingsJapgolly.luxon.luxonStrings.`2-digit` = "2-digit".asInstanceOf[typingsJapgolly.luxon.luxonStrings.`2-digit`]
    
    inline def numeric: typingsJapgolly.luxon.luxonStrings.numeric = "numeric".asInstanceOf[typingsJapgolly.luxon.luxonStrings.numeric]
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    std.Intl.DateTimeFormatOptions extends {  numberingSystem :infer T | undefined} ? T : 'arab' | 'arabext' | 'bali' | 'beng' | 'deva' | 'fullwide' | 'gujr' | 'guru' | 'hanidec' | 'khmr' | 'knda' | 'laoo' | 'latn' | 'limb' | 'mlym' | 'mong' | 'mymr' | 'orya' | 'tamldec' | 'telu' | 'thai' | 'tibt'
    }}}
    */
  @js.native
  trait NumberingSystem extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.luxon.luxonStrings.narrow
    - typingsJapgolly.luxon.luxonStrings.short
    - typingsJapgolly.luxon.luxonStrings.long
  */
  trait StringUnitLength extends StObject
  object StringUnitLength {
    
    inline def long: typingsJapgolly.luxon.luxonStrings.long = "long".asInstanceOf[typingsJapgolly.luxon.luxonStrings.long]
    
    inline def narrow: typingsJapgolly.luxon.luxonStrings.narrow = "narrow".asInstanceOf[typingsJapgolly.luxon.luxonStrings.narrow]
    
    inline def short: typingsJapgolly.luxon.luxonStrings.short = "short".asInstanceOf[typingsJapgolly.luxon.luxonStrings.short]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.luxon.luxonStrings.narrow
    - typingsJapgolly.luxon.luxonStrings.short
    - typingsJapgolly.luxon.luxonStrings.long
    - typingsJapgolly.luxon.luxonStrings.numeric
    - typingsJapgolly.luxon.luxonStrings.`2-digit`
  */
  trait UnitLength extends StObject
  object UnitLength {
    
    inline def `2-digit`: typingsJapgolly.luxon.luxonStrings.`2-digit` = "2-digit".asInstanceOf[typingsJapgolly.luxon.luxonStrings.`2-digit`]
    
    inline def long: typingsJapgolly.luxon.luxonStrings.long = "long".asInstanceOf[typingsJapgolly.luxon.luxonStrings.long]
    
    inline def narrow: typingsJapgolly.luxon.luxonStrings.narrow = "narrow".asInstanceOf[typingsJapgolly.luxon.luxonStrings.narrow]
    
    inline def numeric: typingsJapgolly.luxon.luxonStrings.numeric = "numeric".asInstanceOf[typingsJapgolly.luxon.luxonStrings.numeric]
    
    inline def short: typingsJapgolly.luxon.luxonStrings.short = "short".asInstanceOf[typingsJapgolly.luxon.luxonStrings.short]
  }
  
  trait ZoneOptions extends StObject {
    
    /**
      * @deprecated since 0.2.12. Use keepLocalTime instead
      */
    var keepCalendarTime: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, adjust the underlying time so that the local time stays the same, but in the target zone.
      * You should rarely need this.
      * Defaults to false.
      */
    var keepLocalTime: js.UndefOr[Boolean] = js.undefined
  }
  object ZoneOptions {
    
    inline def apply(): ZoneOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoneOptions]
    }
    
    extension [Self <: ZoneOptions](x: Self) {
      
      inline def setKeepCalendarTime(value: Boolean): Self = StObject.set(x, "keepCalendarTime", value.asInstanceOf[js.Any])
      
      inline def setKeepCalendarTimeUndefined: Self = StObject.set(x, "keepCalendarTime", js.undefined)
      
      inline def setKeepLocalTime(value: Boolean): Self = StObject.set(x, "keepLocalTime", value.asInstanceOf[js.Any])
      
      inline def setKeepLocalTimeUndefined: Self = StObject.set(x, "keepLocalTime", js.undefined)
    }
  }
}
