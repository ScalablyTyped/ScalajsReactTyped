package typingsJapgolly.sinon.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonMapMatcher extends SinonMatcher {
  /**
    * Requires a Map to contain each one of the items the given map has.
    */
  def contains(expected: SimplifiedMap): SinonMatcher
  /**
    * Requires a Map to be deep equal another one.
    */
  def deepEquals(expected: SimplifiedMap): SinonMatcher
}

object SinonMapMatcher {
  @scala.inline
  def apply(
    and: SinonMatcher => CallbackTo[SinonMatcher],
    contains: SimplifiedMap => CallbackTo[SinonMatcher],
    deepEquals: SimplifiedMap => CallbackTo[SinonMatcher],
    or: SinonMatcher => CallbackTo[SinonMatcher],
    test: js.Any => CallbackTo[Boolean]
  ): SinonMapMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("and")(js.Any.fromFunction1((t0: typingsJapgolly.sinon.mod.SinonMatcher) => and(t0).runNow()))
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: typingsJapgolly.sinon.mod.SimplifiedMap) => contains(t0).runNow()))
    __obj.updateDynamic("deepEquals")(js.Any.fromFunction1((t0: typingsJapgolly.sinon.mod.SimplifiedMap) => deepEquals(t0).runNow()))
    __obj.updateDynamic("or")(js.Any.fromFunction1((t0: typingsJapgolly.sinon.mod.SinonMatcher) => or(t0).runNow()))
    __obj.updateDynamic("test")(js.Any.fromFunction1((t0: js.Any) => test(t0).runNow()))
    __obj.asInstanceOf[SinonMapMatcher]
  }
}

