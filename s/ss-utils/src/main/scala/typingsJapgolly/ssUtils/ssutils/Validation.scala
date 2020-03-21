package typingsJapgolly.ssUtils.ssutils

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validation extends js.Object {
  var messages: StringDictionary[String]
  var overrideMessages: Boolean
  def errorFilter(errorMsg: String, errorCode: String, `type`: String): Unit
}

object Validation {
  @scala.inline
  def apply(
    errorFilter: (String, String, String) => Callback,
    messages: StringDictionary[String],
    overrideMessages: Boolean
  ): Validation = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], overrideMessages = overrideMessages.asInstanceOf[js.Any])
    __obj.updateDynamic("errorFilter")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => errorFilter(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Validation]
  }
}

