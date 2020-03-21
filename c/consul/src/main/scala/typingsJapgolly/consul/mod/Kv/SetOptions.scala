package typingsJapgolly.consul.mod.Kv

import typingsJapgolly.consul.mod.CommonOptions
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions extends CommonOptions {
  var acquire: js.UndefOr[String] = js.undefined
  var cas: js.UndefOr[String] = js.undefined
  var flags: js.UndefOr[Double] = js.undefined
  var key: String
  var release: js.UndefOr[String] = js.undefined
  var value: String | Buffer
}

object SetOptions {
  @scala.inline
  def apply(
    key: String,
    value: String | Buffer,
    acquire: String = null,
    cas: String = null,
    consistent: js.UndefOr[Boolean] = js.undefined,
    ctx: EventEmitter = null,
    dc: String = null,
    flags: Int | Double = null,
    release: String = null,
    stale: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    token: String = null,
    wait: String = null,
    wan: js.UndefOr[Boolean] = js.undefined
  ): SetOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (acquire != null) __obj.updateDynamic("acquire")(acquire.asInstanceOf[js.Any])
    if (cas != null) __obj.updateDynamic("cas")(cas.asInstanceOf[js.Any])
    if (!js.isUndefined(consistent)) __obj.updateDynamic("consistent")(consistent.asInstanceOf[js.Any])
    if (ctx != null) __obj.updateDynamic("ctx")(ctx.asInstanceOf[js.Any])
    if (dc != null) __obj.updateDynamic("dc")(dc.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (release != null) __obj.updateDynamic("release")(release.asInstanceOf[js.Any])
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (wait != null) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    if (!js.isUndefined(wan)) __obj.updateDynamic("wan")(wan.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptions]
  }
}

