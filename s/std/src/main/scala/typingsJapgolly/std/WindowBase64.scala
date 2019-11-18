package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowBase64 extends js.Object {
  def atob(encodedString: java.lang.String): java.lang.String
  def btoa(rawString: java.lang.String): java.lang.String
}

object WindowBase64 {
  @scala.inline
  def apply(
    atob: java.lang.String => CallbackTo[java.lang.String],
    btoa: java.lang.String => CallbackTo[java.lang.String]
  ): WindowBase64 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("atob")(js.Any.fromFunction1((t0: java.lang.String) => atob(t0).runNow()))
    __obj.updateDynamic("btoa")(js.Any.fromFunction1((t0: java.lang.String) => btoa(t0).runNow()))
    __obj.asInstanceOf[WindowBase64]
  }
}

