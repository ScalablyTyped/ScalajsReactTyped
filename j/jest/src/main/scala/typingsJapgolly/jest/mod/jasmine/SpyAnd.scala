package typingsJapgolly.jest.mod.jasmine

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpyAnd extends js.Object {
  /**
    * By chaining the spy with and.callFake, all calls to the spy
    * will delegate to the supplied function.
    */
  def callFake(fn: js.Function1[/* repeated */ js.Any, _]): Spy
  /**
    * By chaining the spy with and.callThrough, the spy will still track all
    * calls to it but in addition it will delegate to the actual implementation.
    */
  def callThrough(): Spy
  /**
    * By chaining the spy with and.returnValue, all calls to the function
    * will return a specific value.
    */
  def returnValue(`val`: js.Any): Spy
  /**
    * By chaining the spy with and.returnValues, all calls to the function
    * will return specific values in order until it reaches the end of the return values list.
    */
  def returnValues(values: js.Any*): Spy
  /**
    * When a calling strategy is used for a spy, the original stubbing
    * behavior can be returned at any time with and.stub.
    */
  def stub(): Spy
  /**
    * By chaining the spy with and.throwError, all calls to the spy
    * will throw the specified value.
    */
  def throwError(msg: String): Spy
}

object SpyAnd {
  @scala.inline
  def apply(
    callFake: js.Function1[/* repeated */ js.Any, js.Any] => CallbackTo[Spy],
    callThrough: CallbackTo[Spy],
    returnValue: js.Any => CallbackTo[Spy],
    returnValues: /* repeated */ js.Any => CallbackTo[Spy],
    stub: CallbackTo[Spy],
    throwError: String => CallbackTo[Spy]
  ): SpyAnd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callFake")(js.Any.fromFunction1((t0: js.Function1[/* repeated */ js.Any, js.Any]) => callFake(t0).runNow()))
    __obj.updateDynamic("callThrough")(callThrough.toJsFn)
    __obj.updateDynamic("returnValue")(js.Any.fromFunction1((t0: js.Any) => returnValue(t0).runNow()))
    __obj.updateDynamic("returnValues")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => returnValues(t0).runNow()))
    __obj.updateDynamic("stub")(stub.toJsFn)
    __obj.updateDynamic("throwError")(js.Any.fromFunction1((t0: java.lang.String) => throwError(t0).runNow()))
    __obj.asInstanceOf[SpyAnd]
  }
}

