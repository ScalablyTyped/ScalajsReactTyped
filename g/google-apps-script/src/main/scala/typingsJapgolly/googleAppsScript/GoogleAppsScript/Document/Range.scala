package typingsJapgolly.googleAppsScript.GoogleAppsScript.Document

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A range of elements in a document. The user's selection is represented as a Range, among
  * other uses. Scripts can only access the selection of the user who is running the script, and only
  * if the script is bound to the document.
  *
  *     // Bold all selected text.
  *     var selection = DocumentApp.getActiveDocument().getSelection();
  *     if (selection) {
  *       var elements = selection.getRangeElements();
  *       for (var i = 0; i < elements.length; i++) {
  *         var element = elements[i];
  *
  *         // Only modify elements that can be edited as text; skip images and other non-text elements.
  *         if (element.getElement().editAsText) {
  *           var text = element.getElement().editAsText();
  *
  *           // Bold the selected part of the element, or the full element if it's completely selected.
  *           if (element.isPartial()) {
  *             text.setBold(element.getStartOffset(), element.getEndOffsetInclusive(), true);
  *           } else {
  *             text.setBold(true);
  *           }
  *         }
  *       }
  *     }
  */
trait Range extends js.Object {
  def getRangeElements(): js.Array[RangeElement]
  /** @deprecated DO NOT USE */ def getSelectedElements(): js.Array[RangeElement]
}

object Range {
  @scala.inline
  def apply(
    getRangeElements: CallbackTo[js.Array[RangeElement]],
    getSelectedElements: CallbackTo[js.Array[RangeElement]]
  ): Range = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getRangeElements")(getRangeElements.toJsFn)
    __obj.updateDynamic("getSelectedElements")(getSelectedElements.toJsFn)
    __obj.asInstanceOf[Range]
  }
}

