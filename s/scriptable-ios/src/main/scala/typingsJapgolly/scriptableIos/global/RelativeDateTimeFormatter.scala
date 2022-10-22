package typingsJapgolly.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Creates a textual representation of the amount of time between two dates._
  *
  * The formatter creates a textual representation of the time between two points in time.
  * @see https://docs.scriptable.app/relativedatetimeformatter/#-new-relativedatetimeformatter
  */
@JSGlobal("RelativeDateTimeFormatter")
@js.native
/**
  * _Creates a textual representation of the amount of time between two dates._
  *
  * The formatter creates a textual representation of the time between two points in time.
  * @see https://docs.scriptable.app/relativedatetimeformatter/#-new-relativedatetimeformatter
  */
open class RelativeDateTimeFormatter ()
  extends StObject
     with typingsJapgolly.scriptableIos.RelativeDateTimeFormatter {
  
  /**
    * _Locale to use when formatting._
    *
    * The locale should be specified using a string identifier, e.g. "en", "it" or "da". When no locale is set, the formatter will use the current locale of the device.
    * @see https://docs.scriptable.app/relativedatetimeformatter/#locale
    */
  /* CompleteClass */
  var locale: String = js.native
  
  /**
    * _Creates a localized string communicating the amount of time between two dates._
    *
    * Creates a localized textual representation of the amount of time between to dates. If the two dates are the same, the function will return "now". If the reference date is
    * yesterday, the function will return "yesterday". Other examples include "in 10 seconds", "2 hours ago", "last week" and "next year".
    * @param date - The date to create a relative date and time for.
    * @param referenceDate - The reference date that `date` is relative to.
    * @see https://docs.scriptable.app/relativedatetimeformatter/#-string
    */
  /* CompleteClass */
  override def string(date: js.Date, referenceDate: js.Date): String = js.native
  
  /**
    * _Prefers named dates and times._
    *
    * When using the named style, the formatter tries to find a suitable textual representation over a numeric value for the relative time, e.g. "now" instead of "in 0 seconds" and
    * "yesterday" instead of "1 day ago".
    *
    * When no named representation is found the formatter will fallback to using the numeric style.
    * @see https://docs.scriptable.app/relativedatetimeformatter/#-usenameddatetimestyle
    */
  /* CompleteClass */
  override def useNamedDateTimeStyle(): Unit = js.native
  
  /**
    * _Prefers numeric dates and times._
    *
    * When using the numeric style, the formatter will always prefer numeric representations over named representations. E.g. it will return "in 0 seconds" instead of "now" and "1 day
    * ago" instead of "yesteday".
    * @see https://docs.scriptable.app/relativedatetimeformatter/#-usenumericdatetimestyle
    */
  /* CompleteClass */
  override def useNumericDateTimeStyle(): Unit = js.native
}
