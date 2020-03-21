package typingsJapgolly.azureSb.registrationresultMod.Azure.ServiceBus.Results

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistrationResult extends js.Object {
  def parse(xml: js.Object): js.Object | js.Array[js.Object]
  def serialize(`type`: String, resource: js.Object, properties: js.Array[String]): String
}

object RegistrationResult {
  @scala.inline
  def apply(
    parse: js.Object => CallbackTo[js.Object | js.Array[js.Object]],
    serialize: (String, js.Object, js.Array[String]) => CallbackTo[String]
  ): RegistrationResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: js.Object) => parse(t0).runNow()))
    __obj.updateDynamic("serialize")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Object, t2: js.Array[java.lang.String]) => serialize(t0, t1, t2).runNow()))
    __obj.asInstanceOf[RegistrationResult]
  }
}

