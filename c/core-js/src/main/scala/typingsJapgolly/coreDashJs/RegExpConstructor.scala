package typingsJapgolly.coreDashJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpConstructor extends js.Object {
  def escape(str: java.lang.String): java.lang.String
}

object RegExpConstructor {
  @scala.inline
  def apply(escape: java.lang.String => CallbackTo[java.lang.String]): RegExpConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("escape")(js.Any.fromFunction1((t0: java.lang.String) => escape(t0).runNow()))
    __obj.asInstanceOf[RegExpConstructor]
  }
}

