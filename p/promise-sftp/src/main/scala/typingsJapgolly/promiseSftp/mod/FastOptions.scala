package typingsJapgolly.promiseSftp.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for `PromiseSftp#fast{Get,Put}` */
trait FastOptions extends js.Object {
  /**
    * Size of each read in bytes
    * @default 32768
    */
  var chunkSize: Double
  /**
    * Number of concurrent reads
    * @default 25
    */
  var concurrency: js.UndefOr[Double] = js.undefined
  /** Called every time a part of a file is transferred */
  var step: js.UndefOr[
    js.Function3[/* totalTransferred */ Double, /* chunk */ Double, /* total */ Double, Unit]
  ] = js.undefined
}

object FastOptions {
  @scala.inline
  def apply(
    chunkSize: Double,
    concurrency: Int | Double = null,
    step: (/* totalTransferred */ Double, /* chunk */ Double, /* total */ Double) => Callback = null
  ): FastOptions = {
    val __obj = js.Dynamic.literal(chunkSize = chunkSize.asInstanceOf[js.Any])
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(js.Any.fromFunction3((t0: /* totalTransferred */ scala.Double, t1: /* chunk */ scala.Double, t2: /* total */ scala.Double) => step(t0, t1, t2).runNow()))
    __obj.asInstanceOf[FastOptions]
  }
}

