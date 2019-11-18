package typingsJapgolly.node.http2Mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.fsMod.Stats
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerStreamFileResponseOptions extends js.Object {
  var length: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var statCheck: js.UndefOr[
    js.Function3[
      /* stats */ Stats, 
      /* headers */ OutgoingHttpHeaders, 
      /* statOptions */ StatOptions, 
      Unit | Boolean
    ]
  ] = js.undefined
  var waitForTrailers: js.UndefOr[Boolean] = js.undefined
}

object ServerStreamFileResponseOptions {
  @scala.inline
  def apply(
    length: Int | Double = null,
    offset: Int | Double = null,
    statCheck: (/* stats */ Stats, /* headers */ OutgoingHttpHeaders, /* statOptions */ StatOptions) => CallbackTo[Unit | Boolean] = null,
    waitForTrailers: js.UndefOr[Boolean] = js.undefined
  ): ServerStreamFileResponseOptions = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (statCheck != null) __obj.updateDynamic("statCheck")(js.Any.fromFunction3((t0: /* stats */ typingsJapgolly.node.fsMod.Stats, t1: /* headers */ typingsJapgolly.node.httpMod.OutgoingHttpHeaders, t2: /* statOptions */ typingsJapgolly.node.http2Mod.StatOptions) => statCheck(t0, t1, t2).runNow()))
    if (!js.isUndefined(waitForTrailers)) __obj.updateDynamic("waitForTrailers")(waitForTrailers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerStreamFileResponseOptions]
  }
}

