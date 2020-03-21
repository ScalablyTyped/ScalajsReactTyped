package typingsJapgolly.rest.registryMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.when.When.Promise_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registry extends js.Object {
  def lookup(mimeType: String): Promise_[MIMEConverter]
  def register(mimeType: String, converter: MIMEConverter): Unit
}

object Registry {
  @scala.inline
  def apply(
    lookup: String => CallbackTo[Promise_[MIMEConverter]],
    register: (String, MIMEConverter) => Callback
  ): Registry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lookup")(js.Any.fromFunction1((t0: java.lang.String) => lookup(t0).runNow()))
    __obj.updateDynamic("register")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.rest.registryMod.MIMEConverter) => register(t0, t1).runNow()))
    __obj.asInstanceOf[Registry]
  }
}

