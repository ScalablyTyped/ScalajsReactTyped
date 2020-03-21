package typingsJapgolly.consul.mod

import typingsJapgolly.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  var consistent: js.UndefOr[Boolean] = js.undefined
  var ctx: js.UndefOr[EventEmitter] = js.undefined
  var dc: js.UndefOr[String] = js.undefined
  var stale: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  @JSName("wait")
  var wait_FCommonOptions: js.UndefOr[String] = js.undefined
  var wan: js.UndefOr[Boolean] = js.undefined
}

object CommonOptions {
  @scala.inline
  def apply(
    consistent: js.UndefOr[Boolean] = js.undefined,
    ctx: EventEmitter = null,
    dc: String = null,
    stale: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    token: String = null,
    wait: String = null,
    wan: js.UndefOr[Boolean] = js.undefined
  ): CommonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(consistent)) __obj.updateDynamic("consistent")(consistent.asInstanceOf[js.Any])
    if (ctx != null) __obj.updateDynamic("ctx")(ctx.asInstanceOf[js.Any])
    if (dc != null) __obj.updateDynamic("dc")(dc.asInstanceOf[js.Any])
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (wait != null) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    if (!js.isUndefined(wan)) __obj.updateDynamic("wan")(wan.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonOptions]
  }
}

