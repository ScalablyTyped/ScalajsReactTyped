package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsReportRowIterator extends js.Object {
  def hasNext(): Boolean
  def next(): AdWordsReportRow
}

object AdWordsReportRowIterator {
  @scala.inline
  def apply(hasNext: CallbackTo[Boolean], next: CallbackTo[AdWordsReportRow]): AdWordsReportRowIterator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasNext")(hasNext.toJsFn)
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.asInstanceOf[AdWordsReportRowIterator]
  }
}

