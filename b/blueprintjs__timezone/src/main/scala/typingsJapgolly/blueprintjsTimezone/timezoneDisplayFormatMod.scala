package typingsJapgolly.blueprintjsTimezone

import typingsJapgolly.blueprintjsTimezone.blueprintjsTimezoneStrings.abbreviation
import typingsJapgolly.blueprintjsTimezone.blueprintjsTimezoneStrings.composite
import typingsJapgolly.blueprintjsTimezone.blueprintjsTimezoneStrings.name
import typingsJapgolly.blueprintjsTimezone.blueprintjsTimezoneStrings.offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", JSImport.Namespace)
@js.native
object timezoneDisplayFormatMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.blueprintjsTimezone.blueprintjsTimezoneStrings.offset
    - typingsJapgolly.blueprintjsTimezone.blueprintjsTimezoneStrings.abbreviation
    - typingsJapgolly.blueprintjsTimezone.blueprintjsTimezoneStrings.name
    - typingsJapgolly.blueprintjsTimezone.blueprintjsTimezoneStrings.composite
  */
  trait TimezoneDisplayFormat extends js.Object
  
  def formatTimezone(timezone: String, date: js.Date, displayFormat: TimezoneDisplayFormat): js.UndefOr[String] = js.native
  @js.native
  object TimezoneDisplayFormat extends js.Object {
    /** Abbreviation format: `"HST"` */
    var ABBREVIATION: abbreviation = js.native
    /** Composite format: `"Pacific/Honolulu (HST) -10:00"` */
    var COMPOSITE: composite = js.native
    /** Name format: `"Pacific/Honolulu"` */
    var NAME: name = js.native
    /** Offset format: `"-10:00"` */
    var OFFSET: offset = js.native
  }
  
}

