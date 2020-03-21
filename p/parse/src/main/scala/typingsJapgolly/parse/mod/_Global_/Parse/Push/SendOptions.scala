package typingsJapgolly.parse.mod._Global_.Parse.Push

import japgolly.scalajs.react.Callback
import typingsJapgolly.parse.mod._Global_.Parse.Error
import typingsJapgolly.parse.mod._Global_.Parse.UseMasterKeyOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendOptions extends UseMasterKeyOption {
  var error: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SendOptions {
  @scala.inline
  def apply(
    error: /* error */ Error => Callback = null,
    success: js.UndefOr[Callback] = js.undefined,
    useMasterKey: js.UndefOr[Boolean] = js.undefined
  ): SendOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.parse.mod._Global_.Parse.Error) => error(t0).runNow()))
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendOptions]
  }
}

