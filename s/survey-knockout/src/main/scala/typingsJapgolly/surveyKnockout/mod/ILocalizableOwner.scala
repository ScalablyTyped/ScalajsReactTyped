package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocalizableOwner extends js.Object {
  def getLocale(): String
  def getMarkdownHtml(text: String): String
  def getProcessedText(text: String): String
}

object ILocalizableOwner {
  @scala.inline
  def apply(
    getLocale: CallbackTo[String],
    getMarkdownHtml: String => CallbackTo[String],
    getProcessedText: String => CallbackTo[String]
  ): ILocalizableOwner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLocale")(getLocale.toJsFn)
    __obj.updateDynamic("getMarkdownHtml")(js.Any.fromFunction1((t0: java.lang.String) => getMarkdownHtml(t0).runNow()))
    __obj.updateDynamic("getProcessedText")(js.Any.fromFunction1((t0: java.lang.String) => getProcessedText(t0).runNow()))
    __obj.asInstanceOf[ILocalizableOwner]
  }
}

