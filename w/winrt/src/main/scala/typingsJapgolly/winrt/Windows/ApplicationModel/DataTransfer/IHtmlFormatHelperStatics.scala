package typingsJapgolly.winrt.Windows.ApplicationModel.DataTransfer

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHtmlFormatHelperStatics extends js.Object {
  def createHtmlFormat(htmlFragment: String): String
  def getStaticFragment(htmlFormat: String): String
}

object IHtmlFormatHelperStatics {
  @scala.inline
  def apply(createHtmlFormat: String => CallbackTo[String], getStaticFragment: String => CallbackTo[String]): IHtmlFormatHelperStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createHtmlFormat")(js.Any.fromFunction1((t0: java.lang.String) => createHtmlFormat(t0).runNow()))
    __obj.updateDynamic("getStaticFragment")(js.Any.fromFunction1((t0: java.lang.String) => getStaticFragment(t0).runNow()))
    __obj.asInstanceOf[IHtmlFormatHelperStatics]
  }
}

