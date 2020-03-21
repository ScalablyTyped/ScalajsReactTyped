package typingsJapgolly.nock.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecorderOptions extends js.Object {
  var dont_print: js.UndefOr[Boolean] = js.undefined
  var enable_reqheaders_recording: js.UndefOr[Boolean] = js.undefined
  var logging: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.undefined
  var output_objects: js.UndefOr[Boolean] = js.undefined
  var use_separator: js.UndefOr[Boolean] = js.undefined
}

object RecorderOptions {
  @scala.inline
  def apply(
    dont_print: js.UndefOr[Boolean] = js.undefined,
    enable_reqheaders_recording: js.UndefOr[Boolean] = js.undefined,
    logging: /* content */ String => Callback = null,
    output_objects: js.UndefOr[Boolean] = js.undefined,
    use_separator: js.UndefOr[Boolean] = js.undefined
  ): RecorderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dont_print)) __obj.updateDynamic("dont_print")(dont_print.asInstanceOf[js.Any])
    if (!js.isUndefined(enable_reqheaders_recording)) __obj.updateDynamic("enable_reqheaders_recording")(enable_reqheaders_recording.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(js.Any.fromFunction1((t0: /* content */ java.lang.String) => logging(t0).runNow()))
    if (!js.isUndefined(output_objects)) __obj.updateDynamic("output_objects")(output_objects.asInstanceOf[js.Any])
    if (!js.isUndefined(use_separator)) __obj.updateDynamic("use_separator")(use_separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderOptions]
  }
}

