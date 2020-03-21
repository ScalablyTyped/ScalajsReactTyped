package typingsJapgolly.istanbulMiddleware

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.istanbulMiddleware.mod.Matcher
import typingsJapgolly.istanbulMiddleware.mod.PostLoadHook
import typingsJapgolly.istanbulMiddleware.mod.PostLoadHookFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPostLoadHook extends js.Object {
  var postLoadHook: js.UndefOr[PostLoadHook] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object AnonPostLoadHook {
  @scala.inline
  def apply(
    postLoadHook: (/* matcherfn */ Matcher, /* transformer */ js.Any, /* verbose */ Boolean) => CallbackTo[PostLoadHookFn] = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): AnonPostLoadHook = {
    val __obj = js.Dynamic.literal()
    if (postLoadHook != null) __obj.updateDynamic("postLoadHook")(js.Any.fromFunction3((t0: /* matcherfn */ typingsJapgolly.istanbulMiddleware.mod.Matcher, t1: /* transformer */ js.Any, t2: /* verbose */ scala.Boolean) => postLoadHook(t0, t1, t2).runNow()))
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPostLoadHook]
  }
}

