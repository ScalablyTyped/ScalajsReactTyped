package typingsJapgolly.cypress.sinonMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonArrayMatcher extends SinonMatcher {
  /**
    * Requires an Array to contain each one of the values the given array has.
    */
  def contains(expected: js.Array[_]): SinonMatcher
  /**
    * Requires an Array to be deep equal another one.
    */
  def deepEquals(expected: js.Array[_]): SinonMatcher
  /**
    * Requires an Array to end with the same values as another one.
    */
  def endsWith(expected: js.Array[_]): SinonMatcher
  /**
    * Requires an Array to start with the same values as another one.
    */
  def startsWith(expected: js.Array[_]): SinonMatcher
}

object SinonArrayMatcher {
  @scala.inline
  def apply(
    and: SinonMatcher => CallbackTo[SinonMatcher],
    contains: js.Array[js.Any] => CallbackTo[SinonMatcher],
    deepEquals: js.Array[js.Any] => CallbackTo[SinonMatcher],
    endsWith: js.Array[js.Any] => CallbackTo[SinonMatcher],
    or: SinonMatcher => CallbackTo[SinonMatcher],
    startsWith: js.Array[js.Any] => CallbackTo[SinonMatcher],
    test: js.Any => CallbackTo[Boolean]
  ): SinonArrayMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("and")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.sinonMod.SinonMatcher) => and(t0).runNow()))
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: js.Array[js.Any]) => contains(t0).runNow()))
    __obj.updateDynamic("deepEquals")(js.Any.fromFunction1((t0: js.Array[js.Any]) => deepEquals(t0).runNow()))
    __obj.updateDynamic("endsWith")(js.Any.fromFunction1((t0: js.Array[js.Any]) => endsWith(t0).runNow()))
    __obj.updateDynamic("or")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.sinonMod.SinonMatcher) => or(t0).runNow()))
    __obj.updateDynamic("startsWith")(js.Any.fromFunction1((t0: js.Array[js.Any]) => startsWith(t0).runNow()))
    __obj.updateDynamic("test")(js.Any.fromFunction1((t0: js.Any) => test(t0).runNow()))
    __obj.asInstanceOf[SinonArrayMatcher]
  }
}

