package typingsJapgolly.cypress.sinonMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonMock extends js.Object {
  /**
    * Overrides obj.method with a mock function and returns it.
    */
  def expects(method: String): SinonExpectation
  /**
    * Restores all mocked methods.
    */
  def restore(): Unit
  /**
    * Verifies all expectations on the mock.
    * If any expectation is not satisfied, an exception is thrown.
    * Also restores the mocked methods.
    */
  def verify(): Unit
}

object SinonMock {
  @scala.inline
  def apply(expects: String => CallbackTo[SinonExpectation], restore: Callback, verify: Callback): SinonMock = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expects")(js.Any.fromFunction1((t0: java.lang.String) => expects(t0).runNow()))
    __obj.updateDynamic("restore")(restore.toJsFn)
    __obj.updateDynamic("verify")(verify.toJsFn)
    __obj.asInstanceOf[SinonMock]
  }
}

