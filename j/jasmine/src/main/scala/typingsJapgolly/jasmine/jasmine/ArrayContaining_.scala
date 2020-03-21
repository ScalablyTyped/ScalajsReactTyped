package typingsJapgolly.jasmine.jasmine

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayContaining_[T]
  extends AsymmetricMatcher[js.Any] {
  var `new`: js.UndefOr[js.Function1[/* sample */ ArrayLike[T], ArrayLike[T]]] = js.undefined
}

object ArrayContaining_ {
  @scala.inline
  def apply[T](
    asymmetricMatch: (js.Any, js.Array[CustomEqualityTester]) => CallbackTo[Boolean],
    jasmineToString: js.UndefOr[CallbackTo[String]] = js.undefined,
    `new`: /* sample */ ArrayLike[T] => CallbackTo[ArrayLike[T]] = null
  ): ArrayContaining_[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asymmetricMatch")(js.Any.fromFunction2((t0: js.Any, t1: js.Array[typingsJapgolly.jasmine.jasmine.CustomEqualityTester]) => asymmetricMatch(t0, t1).runNow()))
    jasmineToString.foreach(p => __obj.updateDynamic("jasmineToString")(p.toJsFn))
    if (`new` != null) __obj.updateDynamic("new")(js.Any.fromFunction1((t0: /* sample */ typingsJapgolly.jasmine.jasmine.ArrayLike[T]) => `new`(t0).runNow()))
    __obj.asInstanceOf[ArrayContaining_[T]]
  }
}

