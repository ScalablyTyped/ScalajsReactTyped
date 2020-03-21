package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsReportRow extends js.Object {
  def formatForUpload(): js.Object
}

object AdWordsReportRow {
  @scala.inline
  def apply(formatForUpload: CallbackTo[js.Object]): AdWordsReportRow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("formatForUpload")(formatForUpload.toJsFn)
    __obj.asInstanceOf[AdWordsReportRow]
  }
}

