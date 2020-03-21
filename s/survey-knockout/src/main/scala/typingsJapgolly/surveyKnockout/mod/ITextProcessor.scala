package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextProcessor extends js.Object {
  def processText(text: String, returnDisplayValue: Boolean): String
  def processTextEx(text: String, returnDisplayValue: Boolean, doEncoding: Boolean): js.Any
}

object ITextProcessor {
  @scala.inline
  def apply(
    processText: (String, Boolean) => CallbackTo[String],
    processTextEx: (String, Boolean, Boolean) => CallbackTo[js.Any]
  ): ITextProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("processText")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => processText(t0, t1).runNow()))
    __obj.updateDynamic("processTextEx")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Boolean, t2: scala.Boolean) => processTextEx(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ITextProcessor]
  }
}

