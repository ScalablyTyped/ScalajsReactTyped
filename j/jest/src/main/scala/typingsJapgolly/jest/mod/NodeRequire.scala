package typingsJapgolly.jest.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRequire extends js.Object {
  /**
    * Returns the actual module instead of a mock, bypassing all checks on
    * whether the module should receive a mock implementation or not.
    *
    * @deprecated Use `jest.requireActual` instead.
    */
  def requireActual(moduleName: String): js.Any
  /**
    * Returns a mock module instead of the actual module, bypassing all checks
    * on whether the module should be required normally or not.
    *
    * @deprecated Use `jest.requireMock`instead.
    */
  def requireMock(moduleName: String): js.Any
}

object NodeRequire {
  @scala.inline
  def apply(requireActual: String => CallbackTo[js.Any], requireMock: String => CallbackTo[js.Any]): NodeRequire = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requireActual")(js.Any.fromFunction1((t0: java.lang.String) => requireActual(t0).runNow()))
    __obj.updateDynamic("requireMock")(js.Any.fromFunction1((t0: java.lang.String) => requireMock(t0).runNow()))
    __obj.asInstanceOf[NodeRequire]
  }
}

