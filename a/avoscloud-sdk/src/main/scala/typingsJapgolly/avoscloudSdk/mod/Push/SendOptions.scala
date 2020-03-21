package typingsJapgolly.avoscloudSdk.mod.Push

import japgolly.scalajs.react.Callback
import typingsJapgolly.avoscloudSdk.mod.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendOptions extends js.Object {
  var error: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SendOptions {
  @scala.inline
  def apply(error: /* error */ Error => Callback = null, success: js.UndefOr[Callback] = js.undefined): SendOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.avoscloudSdk.mod.Error) => error(t0).runNow()))
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[SendOptions]
  }
}

