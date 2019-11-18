package typingsJapgolly.mobx

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mobx.libUtilsComparerMod.IEqualsComparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Equals extends js.Object {
  @JSName("equals")
  var equals_FAnon_Equals: js.UndefOr[IEqualsComparer[_]] = js.undefined
  var fireImmediately: js.UndefOr[Boolean] = js.undefined
}

object Anon_Equals {
  @scala.inline
  def apply(
    equals: (js.Any, js.Any) => CallbackTo[Boolean] = null,
    fireImmediately: js.UndefOr[Boolean] = js.undefined
  ): Anon_Equals = {
    val __obj = js.Dynamic.literal()
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => equals(t0, t1).runNow()))
    if (!js.isUndefined(fireImmediately)) __obj.updateDynamic("fireImmediately")(fireImmediately.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Equals]
  }
}

