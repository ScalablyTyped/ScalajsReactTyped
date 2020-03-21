package typingsJapgolly.nightwatch.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchAssertion[T, U] extends js.Object {
  var api: NightwatchAPI
  var expected: js.Function0[T] | T
  var failure: js.UndefOr[js.Function1[/* result */ U, Boolean]] = js.undefined
  var message: String
  def command(callback: js.Function1[/* result */ U, Unit]): this.type
  def pass(value: T): js.Any
  def value(result: U): T
}

object NightwatchAssertion {
  @scala.inline
  def apply[T, U](
    api: NightwatchAPI,
    command: js.Function1[/* result */ U, Unit] => CallbackTo[NightwatchAssertion[T, U]],
    expected: js.Function0[T] | T,
    message: String,
    pass: T => CallbackTo[js.Any],
    value: U => CallbackTo[T],
    failure: /* result */ U => CallbackTo[Boolean] = null
  ): NightwatchAssertion[T, U] = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("command")(js.Any.fromFunction1((t0: js.Function1[/* result */ U, scala.Unit]) => command(t0).runNow()))
    __obj.updateDynamic("pass")(js.Any.fromFunction1((t0: T) => pass(t0).runNow()))
    __obj.updateDynamic("value")(js.Any.fromFunction1((t0: U) => value(t0).runNow()))
    if (failure != null) __obj.updateDynamic("failure")(js.Any.fromFunction1((t0: /* result */ U) => failure(t0).runNow()))
    __obj.asInstanceOf[NightwatchAssertion[T, U]]
  }
}

