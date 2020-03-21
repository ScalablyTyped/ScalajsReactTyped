package typingsJapgolly.winrt.Windows.Data.Html

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHtmlUtilities extends js.Object {
  def convertToText(html: String): String
}

object IHtmlUtilities {
  @scala.inline
  def apply(convertToText: String => CallbackTo[String]): IHtmlUtilities = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("convertToText")(js.Any.fromFunction1((t0: java.lang.String) => convertToText(t0).runNow()))
    __obj.asInstanceOf[IHtmlUtilities]
  }
}

