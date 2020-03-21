package typingsJapgolly.traverson.mod.Traverson

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraversonMethods extends js.Object {
  def from(uri: String): Builder
  def registerMediaType(name: String, handler: js.Any): TraversonMethods
}

object TraversonMethods {
  @scala.inline
  def apply(
    from: String => CallbackTo[Builder],
    registerMediaType: (String, js.Any) => CallbackTo[TraversonMethods]
  ): TraversonMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(js.Any.fromFunction1((t0: java.lang.String) => from(t0).runNow()))
    __obj.updateDynamic("registerMediaType")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => registerMediaType(t0, t1).runNow()))
    __obj.asInstanceOf[TraversonMethods]
  }
}

