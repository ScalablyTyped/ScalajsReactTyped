package typingsJapgolly.reactIntl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatter extends js.Object {
  var formatDate: FormatDateOptions
  var formatDisplayName: FormatDisplayNameOptions
  var formatList: FormatListOptions
  var formatNumber: FormatNumberOptions
  var formatTime: FormatDateOptions
}

object Formatter {
  @scala.inline
  def apply(
    formatDate: FormatDateOptions,
    formatDisplayName: FormatDisplayNameOptions,
    formatList: FormatListOptions,
    formatNumber: FormatNumberOptions,
    formatTime: FormatDateOptions
  ): Formatter = {
    val __obj = js.Dynamic.literal(formatDate = formatDate.asInstanceOf[js.Any], formatDisplayName = formatDisplayName.asInstanceOf[js.Any], formatList = formatList.asInstanceOf[js.Any], formatNumber = formatNumber.asInstanceOf[js.Any], formatTime = formatTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Formatter]
  }
}

