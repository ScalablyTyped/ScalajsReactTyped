package typingsJapgolly.stubby.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  def matches(request: StubbyRequest): StubbyRequest | Null
}

object Endpoint {
  @scala.inline
  def apply(matches: StubbyRequest => CallbackTo[StubbyRequest | Null]): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("matches")(js.Any.fromFunction1((t0: typingsJapgolly.stubby.mod.StubbyRequest) => matches(t0).runNow()))
    __obj.asInstanceOf[Endpoint]
  }
}

