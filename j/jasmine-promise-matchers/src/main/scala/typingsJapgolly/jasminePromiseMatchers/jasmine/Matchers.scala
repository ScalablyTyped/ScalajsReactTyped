package typingsJapgolly.jasminePromiseMatchers.jasmine

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[T] extends js.Object {
  /**
  		 * Verifies that a value is a $q Promise.
  		 */
  def toBePromise(): Boolean
  /**
  		 * Verifies that a Promise is (or has been) rejected.
  		 */
  def toBeRejected(): Boolean
  /**
  		 * Verifies that a Promise is (or has been) rejected with the specified parameter.
  		 */
  def toBeRejectedWith(value: js.Any): Boolean
  /**
  		 * Verifies that a Promise is (or has been) resolved.
  		 */
  def toBeResolved(): Boolean
  /**
  		 * Verifies that a Promise is (or has been) resolved with the specified parameter.
  		 */
  def toBeResolvedWith(value: js.Any): Boolean
}

object Matchers {
  @scala.inline
  def apply[T](
    toBePromise: CallbackTo[Boolean],
    toBeRejected: CallbackTo[Boolean],
    toBeRejectedWith: js.Any => CallbackTo[Boolean],
    toBeResolved: CallbackTo[Boolean],
    toBeResolvedWith: js.Any => CallbackTo[Boolean]
  ): Matchers[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toBePromise")(toBePromise.toJsFn)
    __obj.updateDynamic("toBeRejected")(toBeRejected.toJsFn)
    __obj.updateDynamic("toBeRejectedWith")(js.Any.fromFunction1((t0: js.Any) => toBeRejectedWith(t0).runNow()))
    __obj.updateDynamic("toBeResolved")(toBeResolved.toJsFn)
    __obj.updateDynamic("toBeResolvedWith")(js.Any.fromFunction1((t0: js.Any) => toBeResolvedWith(t0).runNow()))
    __obj.asInstanceOf[Matchers[T]]
  }
}

