package typingsJapgolly.dayzed.mod

import typingsJapgolly.dayzed.dayzedNumbers.`0`
import typingsJapgolly.dayzed.dayzedNumbers.`10`
import typingsJapgolly.dayzed.dayzedNumbers.`11`
import typingsJapgolly.dayzed.dayzedNumbers.`1`
import typingsJapgolly.dayzed.dayzedNumbers.`2`
import typingsJapgolly.dayzed.dayzedNumbers.`3`
import typingsJapgolly.dayzed.dayzedNumbers.`4`
import typingsJapgolly.dayzed.dayzedNumbers.`5`
import typingsJapgolly.dayzed.dayzedNumbers.`6`
import typingsJapgolly.dayzed.dayzedNumbers.`7`
import typingsJapgolly.dayzed.dayzedNumbers.`8`
import typingsJapgolly.dayzed.dayzedNumbers.`9`
import typingsJapgolly.dayzed.dayzedStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calendar extends js.Object {
  var firstDayOfMonth: js.Date
  var lastDayOfMonth: js.Date
  var month: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`
  var weeks: js.Array[js.Array[DateObj | _empty]]
  var year: Double
}

object Calendar {
  @scala.inline
  def apply(
    firstDayOfMonth: js.Date,
    lastDayOfMonth: js.Date,
    month: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`,
    weeks: js.Array[js.Array[DateObj | _empty]],
    year: Double
  ): Calendar = {
    val __obj = js.Dynamic.literal(firstDayOfMonth = firstDayOfMonth.asInstanceOf[js.Any], lastDayOfMonth = lastDayOfMonth.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Calendar]
  }
}

