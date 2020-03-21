package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMatrixColumnOwner extends ILocalizableOwner {
  def getCellType(): String
  def getRequiredText(): String
  def onColumnPropertiesChanged(column: MatrixDropdownColumn): Unit
}

object IMatrixColumnOwner {
  @scala.inline
  def apply(
    getCellType: CallbackTo[String],
    getLocale: CallbackTo[String],
    getMarkdownHtml: String => CallbackTo[String],
    getProcessedText: String => CallbackTo[String],
    getRequiredText: CallbackTo[String],
    onColumnPropertiesChanged: MatrixDropdownColumn => Callback
  ): IMatrixColumnOwner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCellType")(getCellType.toJsFn)
    __obj.updateDynamic("getLocale")(getLocale.toJsFn)
    __obj.updateDynamic("getMarkdownHtml")(js.Any.fromFunction1((t0: java.lang.String) => getMarkdownHtml(t0).runNow()))
    __obj.updateDynamic("getProcessedText")(js.Any.fromFunction1((t0: java.lang.String) => getProcessedText(t0).runNow()))
    __obj.updateDynamic("getRequiredText")(getRequiredText.toJsFn)
    __obj.updateDynamic("onColumnPropertiesChanged")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.MatrixDropdownColumn) => onColumnPropertiesChanged(t0).runNow()))
    __obj.asInstanceOf[IMatrixColumnOwner]
  }
}

