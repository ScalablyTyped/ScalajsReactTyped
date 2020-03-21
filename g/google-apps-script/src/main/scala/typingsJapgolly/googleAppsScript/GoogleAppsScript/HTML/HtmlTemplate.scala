package typingsJapgolly.googleAppsScript.GoogleAppsScript.HTML

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A template object for dynamically constructing HTML. For more information, see the guide to templates.
  */
trait HtmlTemplate
  extends /* propName */ StringDictionary[js.Any] {
  def evaluate(): HtmlOutput
  def getCode(): String
  def getCodeWithComments(): String
  def getRawContent(): String
}

object HtmlTemplate {
  @scala.inline
  def apply(
    evaluate: CallbackTo[HtmlOutput],
    getCode: CallbackTo[String],
    getCodeWithComments: CallbackTo[String],
    getRawContent: CallbackTo[String],
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): HtmlTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("evaluate")(evaluate.toJsFn)
    __obj.updateDynamic("getCode")(getCode.toJsFn)
    __obj.updateDynamic("getCodeWithComments")(getCodeWithComments.toJsFn)
    __obj.updateDynamic("getRawContent")(getRawContent.toJsFn)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[HtmlTemplate]
  }
}

