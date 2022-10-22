package typingsJapgolly.blueprintjsTimezone

import typingsJapgolly.blueprintjsTimezone.blueprintjsTimezoneStrings.abbreviation
import typingsJapgolly.blueprintjsTimezone.blueprintjsTimezoneStrings.composite
import typingsJapgolly.blueprintjsTimezone.blueprintjsTimezoneStrings.name
import typingsJapgolly.blueprintjsTimezone.blueprintjsTimezoneStrings.offset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsTimezonePickerTimezoneDisplayFormatMod {
  
  @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.blueprintjsTimezone.blueprintjsTimezoneStrings.offset
    - typingsJapgolly.blueprintjsTimezone.blueprintjsTimezoneStrings.abbreviation
    - typingsJapgolly.blueprintjsTimezone.blueprintjsTimezoneStrings.name
    - typingsJapgolly.blueprintjsTimezone.blueprintjsTimezoneStrings.composite
  */
  trait TimezoneDisplayFormat extends StObject
  object TimezoneDisplayFormat {
    
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", "TimezoneDisplayFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /** Abbreviation format: `"HST"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", "TimezoneDisplayFormat.ABBREVIATION")
    @js.native
    def ABBREVIATION: abbreviation = js.native
    inline def ABBREVIATION_=(x: abbreviation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABBREVIATION")(x.asInstanceOf[js.Any])
    
    /** Composite format: `"Pacific/Honolulu (HST) -10:00"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", "TimezoneDisplayFormat.COMPOSITE")
    @js.native
    def COMPOSITE: composite = js.native
    inline def COMPOSITE_=(x: composite): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPOSITE")(x.asInstanceOf[js.Any])
    
    /** Name format: `"Pacific/Honolulu"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", "TimezoneDisplayFormat.NAME")
    @js.native
    def NAME: name = js.native
    inline def NAME_=(x: name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    /** Offset format: `"-10:00"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", "TimezoneDisplayFormat.OFFSET")
    @js.native
    def OFFSET: offset = js.native
    inline def OFFSET_=(x: offset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFFSET")(x.asInstanceOf[js.Any])
  }
  
  inline def formatTimezone(timezone: String, date: js.Date, displayFormat: TimezoneDisplayFormat): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTimezone")(timezone.asInstanceOf[js.Any], date.asInstanceOf[js.Any], displayFormat.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
}
