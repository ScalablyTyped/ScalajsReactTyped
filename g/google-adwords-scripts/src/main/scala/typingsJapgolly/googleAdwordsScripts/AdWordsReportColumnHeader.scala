package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsReportColumnHeader extends js.Object {
  def getBulkUploadColumnName(): String
  def getReportColumnName(): String
}

object AdWordsReportColumnHeader {
  @scala.inline
  def apply(getBulkUploadColumnName: CallbackTo[String], getReportColumnName: CallbackTo[String]): AdWordsReportColumnHeader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBulkUploadColumnName")(getBulkUploadColumnName.toJsFn)
    __obj.updateDynamic("getReportColumnName")(getReportColumnName.toJsFn)
    __obj.asInstanceOf[AdWordsReportColumnHeader]
  }
}

