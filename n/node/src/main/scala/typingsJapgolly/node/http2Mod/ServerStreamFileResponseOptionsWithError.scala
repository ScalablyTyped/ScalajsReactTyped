package typingsJapgolly.node.http2Mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.fsMod.Stats
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerStreamFileResponseOptionsWithError extends ServerStreamFileResponseOptions {
  var onError: js.UndefOr[js.Function1[/* err */ ErrnoException, Unit]] = js.undefined
}

object ServerStreamFileResponseOptionsWithError {
  @scala.inline
  def apply(
    length: Int | Double = null,
    offset: Int | Double = null,
    onError: /* err */ ErrnoException => Callback = null,
    statCheck: (/* stats */ Stats, /* headers */ OutgoingHttpHeaders, /* statOptions */ StatOptions) => CallbackTo[Unit | Boolean] = null,
    waitForTrailers: js.UndefOr[Boolean] = js.undefined
  ): ServerStreamFileResponseOptionsWithError = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* err */ typingsJapgolly.node.NodeJS.ErrnoException) => onError(t0).runNow()))
    if (statCheck != null) __obj.updateDynamic("statCheck")(js.Any.fromFunction3((t0: /* stats */ typingsJapgolly.node.fsMod.Stats, t1: /* headers */ typingsJapgolly.node.httpMod.OutgoingHttpHeaders, t2: /* statOptions */ typingsJapgolly.node.http2Mod.StatOptions) => statCheck(t0, t1, t2).runNow()))
    if (!js.isUndefined(waitForTrailers)) __obj.updateDynamic("waitForTrailers")(waitForTrailers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerStreamFileResponseOptionsWithError]
  }
}

