package typingsJapgolly.cypress.sinonMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonSetMatcher extends SinonMatcher {
  /**
    * Requires a Set to contain each one of the items the given set has.
    */
  def contains(expected: SimplifiedSet): SinonMatcher
  /**
    *  Requires a Set to be deep equal another one.
    */
  def deepEquals(expected: SimplifiedSet): SinonMatcher
}

object SinonSetMatcher {
  @scala.inline
  def apply(
    and: SinonMatcher => CallbackTo[SinonMatcher],
    contains: SimplifiedSet => CallbackTo[SinonMatcher],
    deepEquals: SimplifiedSet => CallbackTo[SinonMatcher],
    or: SinonMatcher => CallbackTo[SinonMatcher],
    test: js.Any => CallbackTo[Boolean]
  ): SinonSetMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("and")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.sinonMod.SinonMatcher) => and(t0).runNow()))
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.sinonMod.SimplifiedSet) => contains(t0).runNow()))
    __obj.updateDynamic("deepEquals")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.sinonMod.SimplifiedSet) => deepEquals(t0).runNow()))
    __obj.updateDynamic("or")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.sinonMod.SinonMatcher) => or(t0).runNow()))
    __obj.updateDynamic("test")(js.Any.fromFunction1((t0: js.Any) => test(t0).runNow()))
    __obj.asInstanceOf[SinonSetMatcher]
  }
}

