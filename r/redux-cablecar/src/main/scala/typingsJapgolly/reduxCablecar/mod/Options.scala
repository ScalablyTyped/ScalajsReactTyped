package typingsJapgolly.reduxCablecar.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var connected: js.UndefOr[js.Function0[Unit]] = js.undefined
  var disconnected: js.UndefOr[js.Function0[Unit]] = js.undefined
  var optimisticOnFail: js.UndefOr[Boolean] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    connected: js.UndefOr[Callback] = js.undefined,
    disconnected: js.UndefOr[Callback] = js.undefined,
    optimisticOnFail: js.UndefOr[Boolean] = js.undefined,
    params: js.Object = null,
    prefix: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    connected.foreach(p => __obj.updateDynamic("connected")(p.toJsFn))
    disconnected.foreach(p => __obj.updateDynamic("disconnected")(p.toJsFn))
    if (!js.isUndefined(optimisticOnFail)) __obj.updateDynamic("optimisticOnFail")(optimisticOnFail.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

