package typingsJapgolly.expressCluster.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var outputStream: js.UndefOr[WritableStream] = js.undefined
  var respawn: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
  var workerListener: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    count: Int | Double = null,
    outputStream: WritableStream = null,
    respawn: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined,
    workerListener: js.UndefOr[Callback] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (outputStream != null) __obj.updateDynamic("outputStream")(outputStream.asInstanceOf[js.Any])
    if (!js.isUndefined(respawn)) __obj.updateDynamic("respawn")(respawn.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    workerListener.foreach(p => __obj.updateDynamic("workerListener")(p.toJsFn))
    __obj.asInstanceOf[Config]
  }
}

