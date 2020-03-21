package typingsJapgolly.less2sass.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Less2Sass extends js.Object {
  def convert(file: String): String
}

object Less2Sass {
  @scala.inline
  def apply(convert: String => CallbackTo[String]): Less2Sass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("convert")(js.Any.fromFunction1((t0: java.lang.String) => convert(t0).runNow()))
    __obj.asInstanceOf[Less2Sass]
  }
}

