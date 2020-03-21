package typingsJapgolly.htmltojsx.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLtoJSX extends js.Object {
  def convert(html: String): String
}

object HTMLtoJSX {
  @scala.inline
  def apply(convert: String => CallbackTo[String]): HTMLtoJSX = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("convert")(js.Any.fromFunction1((t0: java.lang.String) => convert(t0).runNow()))
    __obj.asInstanceOf[HTMLtoJSX]
  }
}

