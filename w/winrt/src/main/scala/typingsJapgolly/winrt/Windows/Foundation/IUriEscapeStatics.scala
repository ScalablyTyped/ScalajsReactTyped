package typingsJapgolly.winrt.Windows.Foundation

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUriEscapeStatics extends js.Object {
  def escapeComponent(toEscape: String): String
  def unescapeComponent(toUnescape: String): String
}

object IUriEscapeStatics {
  @scala.inline
  def apply(escapeComponent: String => CallbackTo[String], unescapeComponent: String => CallbackTo[String]): IUriEscapeStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("escapeComponent")(js.Any.fromFunction1((t0: java.lang.String) => escapeComponent(t0).runNow()))
    __obj.updateDynamic("unescapeComponent")(js.Any.fromFunction1((t0: java.lang.String) => unescapeComponent(t0).runNow()))
    __obj.asInstanceOf[IUriEscapeStatics]
  }
}

