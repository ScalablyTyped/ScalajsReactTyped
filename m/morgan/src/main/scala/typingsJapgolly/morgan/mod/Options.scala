package typingsJapgolly.morgan.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***
  * Morgan accepts these properties in the options object.
  */
trait Options extends js.Object {
  /***
    * Buffer duration before writing logs to the stream, defaults to false.
    * When set to true, defaults to 1000 ms.
    * @deprecated
    */
  var buffer: js.UndefOr[Boolean] = js.undefined
  /***
    * Write log line on request instead of response. This means that a
    * requests will be logged even if the server crashes, but data from the
    * response cannot be logged (like the response code).
    */
  var immediate: js.UndefOr[Boolean] = js.undefined
  /***
    * Function to determine if logging is skipped, defaults to false. This
    * function will be called as skip(req, res).
    */
  var skip: js.UndefOr[js.Function2[/* req */ Request_[ParamsDictionary], /* res */ Response_, Boolean]] = js.undefined
  /***
    * Output stream for writing log lines, defaults to process.stdout.
    * @param str
    */
  var stream: js.UndefOr[StreamOptions] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    buffer: js.UndefOr[Boolean] = js.undefined,
    immediate: js.UndefOr[Boolean] = js.undefined,
    skip: (/* req */ Request_[ParamsDictionary], /* res */ Response_) => CallbackTo[Boolean] = null,
    stream: StreamOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(js.Any.fromFunction2((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* res */ typingsJapgolly.express.mod.Response_) => skip(t0, t1).runNow()))
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

