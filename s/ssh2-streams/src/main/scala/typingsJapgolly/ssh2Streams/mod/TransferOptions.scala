package typingsJapgolly.ssh2Streams.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferOptions extends js.Object {
  /**
    * Size of each read in bytes
    */
  var chunkSize: js.UndefOr[Double] = js.undefined
  /**
    * Number of concurrent reads
    */
  var concurrency: js.UndefOr[Double] = js.undefined
  /**
    * Integer or string representing the file mode to set for the uploaded file.
    */
  var mode: js.UndefOr[Double | String] = js.undefined
  /**
    * Called every time a part of a file was transferred
    */
  var step: js.UndefOr[
    js.Function3[/* total_transferred */ Double, /* chunk */ Double, /* total */ Double, Unit]
  ] = js.undefined
}

object TransferOptions {
  @scala.inline
  def apply(
    chunkSize: Int | Double = null,
    concurrency: Int | Double = null,
    mode: Double | String = null,
    step: (/* total_transferred */ Double, /* chunk */ Double, /* total */ Double) => Callback = null
  ): TransferOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(js.Any.fromFunction3((t0: /* total_transferred */ scala.Double, t1: /* chunk */ scala.Double, t2: /* total */ scala.Double) => step(t0, t1, t2).runNow()))
    __obj.asInstanceOf[TransferOptions]
  }
}

