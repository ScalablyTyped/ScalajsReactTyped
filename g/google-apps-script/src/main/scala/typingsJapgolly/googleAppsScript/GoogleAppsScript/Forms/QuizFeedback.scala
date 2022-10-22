package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The bean implementation of a Feedback, which contains properties common to all feedback, such as
  * display text or links.
  *
  * Feedback can be added to gradeable Form items.
  *
  *     // Setting feedback which should be automatically shown when a user responds to a question
  *     // incorrectly.
  *     var textItem = form.addTextItem().setTitle('Re-hydrating dried fruit is an example of what?');
  *     var feedback = FormApp.createFeedback()
  *       .setDisplayText(
  *           “Good answer, but not quite right.  Please review chapter 4 before next time.”)
  *       .addLink("http://wikipedia.com/osmosis");
  *     textItem.setFeedbackForIncorrect(feedback);
  */
trait QuizFeedback extends StObject {
  
  def getLinkUrls(): js.Array[String]
  
  def getText(): String
}
object QuizFeedback {
  
  inline def apply(getLinkUrls: CallbackTo[js.Array[String]], getText: CallbackTo[String]): QuizFeedback = {
    val __obj = js.Dynamic.literal(getLinkUrls = getLinkUrls.toJsFn, getText = getText.toJsFn)
    __obj.asInstanceOf[QuizFeedback]
  }
  
  extension [Self <: QuizFeedback](x: Self) {
    
    inline def setGetLinkUrls(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getLinkUrls", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
  }
}
