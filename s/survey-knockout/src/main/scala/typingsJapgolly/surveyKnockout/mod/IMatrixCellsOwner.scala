package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMatrixCellsOwner extends ILocalizableOwner {
  def getColumns(): js.Array[_]
  def getRows(): js.Array[_]
}

object IMatrixCellsOwner {
  @scala.inline
  def apply(
    getColumns: CallbackTo[js.Array[js.Any]],
    getLocale: CallbackTo[String],
    getMarkdownHtml: String => CallbackTo[String],
    getProcessedText: String => CallbackTo[String],
    getRows: CallbackTo[js.Array[js.Any]]
  ): IMatrixCellsOwner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getColumns")(getColumns.toJsFn)
    __obj.updateDynamic("getLocale")(getLocale.toJsFn)
    __obj.updateDynamic("getMarkdownHtml")(js.Any.fromFunction1((t0: java.lang.String) => getMarkdownHtml(t0).runNow()))
    __obj.updateDynamic("getProcessedText")(js.Any.fromFunction1((t0: java.lang.String) => getProcessedText(t0).runNow()))
    __obj.updateDynamic("getRows")(getRows.toJsFn)
    __obj.asInstanceOf[IMatrixCellsOwner]
  }
}

