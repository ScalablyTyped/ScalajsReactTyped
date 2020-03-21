package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access filter criteria. To create a new criteria, use SpreadsheetApp.newFilterCriteria() and FilterCriteriaBuilder.
  */
trait FilterCriteria extends js.Object {
  def copy(): FilterCriteriaBuilder
  def getCriteriaType(): BooleanCriteria
  def getCriteriaValues(): js.Array[_]
  def getHiddenValues(): js.Array[String]
  def getVisibleValues(): js.Array[String]
}

object FilterCriteria {
  @scala.inline
  def apply(
    copy: CallbackTo[FilterCriteriaBuilder],
    getCriteriaType: CallbackTo[BooleanCriteria],
    getCriteriaValues: CallbackTo[js.Array[js.Any]],
    getHiddenValues: CallbackTo[js.Array[String]],
    getVisibleValues: CallbackTo[js.Array[String]]
  ): FilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("getCriteriaType")(getCriteriaType.toJsFn)
    __obj.updateDynamic("getCriteriaValues")(getCriteriaValues.toJsFn)
    __obj.updateDynamic("getHiddenValues")(getHiddenValues.toJsFn)
    __obj.updateDynamic("getVisibleValues")(getVisibleValues.toJsFn)
    __obj.asInstanceOf[FilterCriteria]
  }
}

