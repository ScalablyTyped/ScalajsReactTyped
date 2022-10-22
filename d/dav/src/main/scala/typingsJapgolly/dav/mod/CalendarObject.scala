package typingsJapgolly.dav.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dav", "CalendarObject")
@js.native
open class CalendarObject () extends DAVObject {
  def this(options: CalendarObjectOptions) = this()
  
  var calendar: Calendar = js.native
  
  var calendarData: String = js.native
}
