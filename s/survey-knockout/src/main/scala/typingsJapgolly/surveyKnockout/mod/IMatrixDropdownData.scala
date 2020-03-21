package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMatrixDropdownData extends js.Object {
  var columns: js.Array[MatrixDropdownColumn]
  var value: js.Any
  def createQuestion(row: MatrixDropdownRowModelBase, column: MatrixDropdownColumn): Question
  def getLocale(): String
  def getMarkdownHtml(text: String): String
  def getProcessedText(text: String): String
  def getRowIndex(row: MatrixDropdownRowModelBase): Double
  def getSharedQuestionByName(columnName: String, row: MatrixDropdownRowModelBase): Question
  def getSurvey(): ISurvey
  def onRowChanged(row: MatrixDropdownRowModelBase, columnName: String, newRowValue: js.Any, isDeletingValue: Boolean): Unit
  def onRowChanging(row: MatrixDropdownRowModelBase, columnName: String, rowValue: js.Any): js.Any
  def onTotalValueChanged(): js.Any
  def validateCell(row: MatrixDropdownRowModelBase, columnName: String, rowValue: js.Any): SurveyError
}

object IMatrixDropdownData {
  @scala.inline
  def apply(
    columns: js.Array[MatrixDropdownColumn],
    createQuestion: (MatrixDropdownRowModelBase, MatrixDropdownColumn) => CallbackTo[Question],
    getLocale: CallbackTo[String],
    getMarkdownHtml: String => CallbackTo[String],
    getProcessedText: String => CallbackTo[String],
    getRowIndex: MatrixDropdownRowModelBase => CallbackTo[Double],
    getSharedQuestionByName: (String, MatrixDropdownRowModelBase) => CallbackTo[Question],
    getSurvey: CallbackTo[ISurvey],
    onRowChanged: (MatrixDropdownRowModelBase, String, js.Any, Boolean) => Callback,
    onRowChanging: (MatrixDropdownRowModelBase, String, js.Any) => CallbackTo[js.Any],
    onTotalValueChanged: CallbackTo[js.Any],
    validateCell: (MatrixDropdownRowModelBase, String, js.Any) => CallbackTo[SurveyError],
    value: js.Any
  ): IMatrixDropdownData = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("createQuestion")(js.Any.fromFunction2((t0: typingsJapgolly.surveyKnockout.mod.MatrixDropdownRowModelBase, t1: typingsJapgolly.surveyKnockout.mod.MatrixDropdownColumn) => createQuestion(t0, t1).runNow()))
    __obj.updateDynamic("getLocale")(getLocale.toJsFn)
    __obj.updateDynamic("getMarkdownHtml")(js.Any.fromFunction1((t0: java.lang.String) => getMarkdownHtml(t0).runNow()))
    __obj.updateDynamic("getProcessedText")(js.Any.fromFunction1((t0: java.lang.String) => getProcessedText(t0).runNow()))
    __obj.updateDynamic("getRowIndex")(js.Any.fromFunction1((t0: typingsJapgolly.surveyKnockout.mod.MatrixDropdownRowModelBase) => getRowIndex(t0).runNow()))
    __obj.updateDynamic("getSharedQuestionByName")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.surveyKnockout.mod.MatrixDropdownRowModelBase) => getSharedQuestionByName(t0, t1).runNow()))
    __obj.updateDynamic("getSurvey")(getSurvey.toJsFn)
    __obj.updateDynamic("onRowChanged")(js.Any.fromFunction4((t0: typingsJapgolly.surveyKnockout.mod.MatrixDropdownRowModelBase, t1: java.lang.String, t2: js.Any, t3: scala.Boolean) => onRowChanged(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("onRowChanging")(js.Any.fromFunction3((t0: typingsJapgolly.surveyKnockout.mod.MatrixDropdownRowModelBase, t1: java.lang.String, t2: js.Any) => onRowChanging(t0, t1, t2).runNow()))
    __obj.updateDynamic("onTotalValueChanged")(onTotalValueChanged.toJsFn)
    __obj.updateDynamic("validateCell")(js.Any.fromFunction3((t0: typingsJapgolly.surveyKnockout.mod.MatrixDropdownRowModelBase, t1: java.lang.String, t2: js.Any) => validateCell(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IMatrixDropdownData]
  }
}

