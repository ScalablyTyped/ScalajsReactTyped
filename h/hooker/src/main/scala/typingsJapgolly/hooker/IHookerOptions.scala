package typingsJapgolly.hooker

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHookerOptions extends js.Object {
  var once: js.UndefOr[Boolean] = js.undefined
  var passName: js.UndefOr[Boolean] = js.undefined
  var post: js.UndefOr[HookerPostHookFunction] = js.undefined
  var pre: js.UndefOr[HookerPreHookFunction] = js.undefined
}

object IHookerOptions {
  @scala.inline
  def apply(
    once: js.UndefOr[Boolean] = js.undefined,
    passName: js.UndefOr[Boolean] = js.undefined,
    post: (/* result */ js.Any, /* repeated */ js.Any) => CallbackTo[IHookerPostHookResult | Unit] = null,
    pre: /* repeated */ js.Any => CallbackTo[IHookerPreHookResult | Unit] = null
  ): IHookerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    if (!js.isUndefined(passName)) __obj.updateDynamic("passName")(passName.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(js.Any.fromFunction2((t0: /* result */ js.Any, t1: /* repeated */ js.Any) => post(t0, t1).runNow()))
    if (pre != null) __obj.updateDynamic("pre")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => pre(t0).runNow()))
    __obj.asInstanceOf[IHookerOptions]
  }
}

