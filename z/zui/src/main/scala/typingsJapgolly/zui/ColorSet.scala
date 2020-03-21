package typingsJapgolly.zui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSet extends js.Object {
  def get(name: String): Color
}

object ColorSet {
  @scala.inline
  def apply(get: String => CallbackTo[Color]): ColorSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.asInstanceOf[ColorSet]
  }
}

