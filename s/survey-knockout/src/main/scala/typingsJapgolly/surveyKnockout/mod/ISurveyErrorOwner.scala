package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISurveyErrorOwner extends ILocalizableOwner {
  def getErrorCustomText(text: String, error: SurveyError): String
}

object ISurveyErrorOwner {
  @scala.inline
  def apply(
    getErrorCustomText: (String, SurveyError) => CallbackTo[String],
    getLocale: CallbackTo[String],
    getMarkdownHtml: String => CallbackTo[String],
    getProcessedText: String => CallbackTo[String]
  ): ISurveyErrorOwner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getErrorCustomText")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.surveyKnockout.mod.SurveyError) => getErrorCustomText(t0, t1).runNow()))
    __obj.updateDynamic("getLocale")(getLocale.toJsFn)
    __obj.updateDynamic("getMarkdownHtml")(js.Any.fromFunction1((t0: java.lang.String) => getMarkdownHtml(t0).runNow()))
    __obj.updateDynamic("getProcessedText")(js.Any.fromFunction1((t0: java.lang.String) => getProcessedText(t0).runNow()))
    __obj.asInstanceOf[ISurveyErrorOwner]
  }
}

