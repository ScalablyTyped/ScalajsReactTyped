package typingsJapgolly.jasmine.jasmine

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsymmetricMatcher[TValue] extends js.Object {
  var jasmineToString: js.UndefOr[js.Function0[String]] = js.undefined
  def asymmetricMatch(other: TValue, customTesters: js.Array[CustomEqualityTester]): Boolean
}

object AsymmetricMatcher {
  @scala.inline
  def apply[TValue](
    asymmetricMatch: (TValue, js.Array[CustomEqualityTester]) => CallbackTo[Boolean],
    jasmineToString: js.UndefOr[CallbackTo[String]] = js.undefined
  ): AsymmetricMatcher[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asymmetricMatch")(js.Any.fromFunction2((t0: TValue, t1: js.Array[typingsJapgolly.jasmine.jasmine.CustomEqualityTester]) => asymmetricMatch(t0, t1).runNow()))
    jasmineToString.foreach(p => __obj.updateDynamic("jasmineToString")(p.toJsFn))
    __obj.asInstanceOf[AsymmetricMatcher[TValue]]
  }
}

