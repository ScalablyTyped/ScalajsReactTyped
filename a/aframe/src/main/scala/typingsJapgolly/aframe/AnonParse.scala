package typingsJapgolly.aframe

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParse extends js.Object {
  def parse(value: String): js.Object
  def stringify(data: js.Object): String
}

object AnonParse {
  @scala.inline
  def apply(parse: String => CallbackTo[js.Object], stringify: js.Object => CallbackTo[String]): AnonParse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.updateDynamic("stringify")(js.Any.fromFunction1((t0: js.Object) => stringify(t0).runNow()))
    __obj.asInstanceOf[AnonParse]
  }
}

