package typingsJapgolly.cypress.sinonMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonMatcher extends js.Object {
  /**
    * All matchers implement and and or. This allows to logically combine mutliple matchers.
    * The result is a new matchers that requires both (and) or one of the matchers (or) to return true.
    * @example var stringOrNumber = sinon.match.string.or(sinon.match.number);
    * var bookWithPages = sinon.match.instanceOf(Book).and(sinon.match.has("pages"));
    */
  def and(expr: SinonMatcher): SinonMatcher
  /**
    * All matchers implement and and or. This allows to logically combine mutliple matchers.
    * The result is a new matchers that requires both (and) or one of the matchers (or) to return true.
    * @example var stringOrNumber = sinon.match.string.or(sinon.match.number);
    * var bookWithPages = sinon.match.instanceOf(Book).and(sinon.match.has("pages"));
    */
  def or(expr: SinonMatcher): SinonMatcher
  def test(`val`: js.Any): Boolean
}

object SinonMatcher {
  @scala.inline
  def apply(
    and: SinonMatcher => CallbackTo[SinonMatcher],
    or: SinonMatcher => CallbackTo[SinonMatcher],
    test: js.Any => CallbackTo[Boolean]
  ): SinonMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("and")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.sinonMod.SinonMatcher) => and(t0).runNow()))
    __obj.updateDynamic("or")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.sinonMod.SinonMatcher) => or(t0).runNow()))
    __obj.updateDynamic("test")(js.Any.fromFunction1((t0: js.Any) => test(t0).runNow()))
    __obj.asInstanceOf[SinonMatcher]
  }
}

