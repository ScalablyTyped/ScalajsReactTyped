package typingsJapgolly.rest.registryMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.when.When.Promise_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MIMEConverter extends js.Object {
  def read(value: String): js.Any | Promise_[_]
  def write(value: js.Any): String | Promise_[String]
}

object MIMEConverter {
  @scala.inline
  def apply(
    read: String => CallbackTo[js.Any | Promise_[js.Any]],
    write: js.Any => CallbackTo[String | Promise_[String]]
  ): MIMEConverter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("read")(js.Any.fromFunction1((t0: java.lang.String) => read(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: js.Any) => write(t0).runNow()))
    __obj.asInstanceOf[MIMEConverter]
  }
}

