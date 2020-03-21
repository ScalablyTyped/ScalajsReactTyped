package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The user's selection in the active presentation.
  *
  *     var selection = SlidesApp.getActivePresentation().getSelection();
  *     var currentPage = selection.getCurrentPage();
  *     var selectionType = selection.getSelectionType();
  *     }
  */
trait Selection extends js.Object {
  def getCurrentPage(): Page
  def getPageElementRange(): PageElementRange
  def getPageRange(): PageRange
  def getSelectionType(): SelectionType
  def getTableCellRange(): TableCellRange
  def getTextRange(): TextRange
}

object Selection {
  @scala.inline
  def apply(
    getCurrentPage: CallbackTo[Page],
    getPageElementRange: CallbackTo[PageElementRange],
    getPageRange: CallbackTo[PageRange],
    getSelectionType: CallbackTo[SelectionType],
    getTableCellRange: CallbackTo[TableCellRange],
    getTextRange: CallbackTo[TextRange]
  ): Selection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCurrentPage")(getCurrentPage.toJsFn)
    __obj.updateDynamic("getPageElementRange")(getPageElementRange.toJsFn)
    __obj.updateDynamic("getPageRange")(getPageRange.toJsFn)
    __obj.updateDynamic("getSelectionType")(getSelectionType.toJsFn)
    __obj.updateDynamic("getTableCellRange")(getTableCellRange.toJsFn)
    __obj.updateDynamic("getTextRange")(getTextRange.toJsFn)
    __obj.asInstanceOf[Selection]
  }
}

