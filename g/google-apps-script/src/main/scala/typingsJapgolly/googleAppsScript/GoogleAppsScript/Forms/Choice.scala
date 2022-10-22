package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Choice extends StObject {
  
  def getGotoPage(): PageBreakItem
  
  def getPageNavigationType(): PageNavigationType
  
  def getValue(): String
  
  def isCorrectAnswer(): Boolean
}
object Choice {
  
  inline def apply(
    getGotoPage: CallbackTo[PageBreakItem],
    getPageNavigationType: CallbackTo[PageNavigationType],
    getValue: CallbackTo[String],
    isCorrectAnswer: CallbackTo[Boolean]
  ): Choice = {
    val __obj = js.Dynamic.literal(getGotoPage = getGotoPage.toJsFn, getPageNavigationType = getPageNavigationType.toJsFn, getValue = getValue.toJsFn, isCorrectAnswer = isCorrectAnswer.toJsFn)
    __obj.asInstanceOf[Choice]
  }
  
  extension [Self <: Choice](x: Self) {
    
    inline def setGetGotoPage(value: CallbackTo[PageBreakItem]): Self = StObject.set(x, "getGotoPage", value.toJsFn)
    
    inline def setGetPageNavigationType(value: CallbackTo[PageNavigationType]): Self = StObject.set(x, "getPageNavigationType", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[String]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setIsCorrectAnswer(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCorrectAnswer", value.toJsFn)
  }
}
