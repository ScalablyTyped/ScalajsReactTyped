package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single choice associated with a type of Item that supports choices, like CheckboxItem, ListItem, or MultipleChoiceItem.
  *
  *     // Create a new form and add a multiple-choice item.
  *     var form = FormApp.create('Form Name');
  *     var item = form.addMultipleChoiceItem();
  *     item.setTitle('Do you prefer cats or dogs?')
  *         .setChoices([
  *             item.createChoice('Cats', FormApp.PageNavigationType.CONTINUE),
  *             item.createChoice('Dogs', FormApp.PageNavigationType.RESTART)
  *         ]);
  *
  *     // Add another page because navigation has no effect on the last page.
  *     form.addPageBreakItem().setTitle('You chose well!');
  *
  *     // Log the navigation types that each choice results in.
  *     var choices = item.getChoices();
  *     for (var i = 0; i < choices.length; i++) {
  *     Logger.log('If the respondent chooses "%s", the form will %s.',
  *                choices[i].getValue(),
  *                choices[i].getPageNavigationType());
  *     }
  */
trait Choice extends js.Object {
  def getGotoPage(): PageBreakItem
  def getPageNavigationType(): PageNavigationType
  def getValue(): String
  def isCorrectAnswer(): Boolean
}

object Choice {
  @scala.inline
  def apply(
    getGotoPage: CallbackTo[PageBreakItem],
    getPageNavigationType: CallbackTo[PageNavigationType],
    getValue: CallbackTo[String],
    isCorrectAnswer: CallbackTo[Boolean]
  ): Choice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getGotoPage")(getGotoPage.toJsFn)
    __obj.updateDynamic("getPageNavigationType")(getPageNavigationType.toJsFn)
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.updateDynamic("isCorrectAnswer")(isCorrectAnswer.toJsFn)
    __obj.asInstanceOf[Choice]
  }
}

