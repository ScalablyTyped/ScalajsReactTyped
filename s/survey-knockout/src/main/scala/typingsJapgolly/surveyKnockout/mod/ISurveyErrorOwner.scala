package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISurveyErrorOwner
  extends StObject
     with ILocalizableOwner {
  
  def getErrorCustomText(text: String, error: SurveyError): String
}
object ISurveyErrorOwner {
  
  inline def apply(
    getErrorCustomText: (String, SurveyError) => String,
    getLocale: CallbackTo[String],
    getMarkdownHtml: (String, String) => String,
    getProcessedText: String => String,
    getRenderer: String => String,
    getRendererContext: LocalizableString => Any
  ): ISurveyErrorOwner = {
    val __obj = js.Dynamic.literal(getErrorCustomText = js.Any.fromFunction2(getErrorCustomText), getLocale = getLocale.toJsFn, getMarkdownHtml = js.Any.fromFunction2(getMarkdownHtml), getProcessedText = js.Any.fromFunction1(getProcessedText), getRenderer = js.Any.fromFunction1(getRenderer), getRendererContext = js.Any.fromFunction1(getRendererContext))
    __obj.asInstanceOf[ISurveyErrorOwner]
  }
  
  extension [Self <: ISurveyErrorOwner](x: Self) {
    
    inline def setGetErrorCustomText(value: (String, SurveyError) => String): Self = StObject.set(x, "getErrorCustomText", js.Any.fromFunction2(value))
  }
}
