package typingsJapgolly.dateformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * dateFormat.i18n
  *
  * Internationalization strings
  *
  * Example:
  *
  * @example ```
  * dateFormat.i18n = {
  *     dayNames: [
  *         'Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat',
  *         'Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'
  *     ],
  *     monthNames: [
  *         'Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec',
  *         'January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'
  *     ],
  *     timeNames: [
  *         'a', 'p', 'am', 'pm', 'A', 'P', 'AM', 'PM'
  *     ]
  * };```
  *
  * @see https://github.com/felixge/node-dateformat/blob/master/lib/dateformat.js#L124
  */
trait DateFormatI18n extends js.Object {
  var dayNames: js.Array[String]
  var monthNames: js.Array[String]
  var timeNames: js.Array[String]
}

object DateFormatI18n {
  @scala.inline
  def apply(dayNames: js.Array[String], monthNames: js.Array[String], timeNames: js.Array[String]): DateFormatI18n = {
    val __obj = js.Dynamic.literal(dayNames = dayNames.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], timeNames = timeNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DateFormatI18n]
  }
}

