package typingsJapgolly.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConcurrent extends js.Object {
  /**
    * Max concurrent requests.
    */
  var concurrent: js.UndefOr[Double] = js.undefined
  /**
    * maximum event loop delay duration in milliseconds over which incoming requests are rejected with an HTTP Server Timeout (503) response.
    * Defaults to 0 (no limit).
    */
  var maxEventLoopDelay: js.UndefOr[Double] = js.undefined
  /** maximum V8 heap size over which incoming requests are rejected with an HTTP Server Timeout (503) response. Defaults to 0 (no limit). */
  var maxHeapUsedBytes: js.UndefOr[Double] = js.undefined
  /**
    * maximum process RSS size over which incoming requests are rejected with an HTTP Server Timeout (503) response. Defaults to 0 (no limit).
    */
  var maxRssBytes: js.UndefOr[Double] = js.undefined
  /** the frequency of sampling in milliseconds. When set to 0, the other load options are ignored. Defaults to 0 (no sampling). */
  var sampleInterval: js.UndefOr[Double] = js.undefined
}

object AnonConcurrent {
  @scala.inline
  def apply(
    concurrent: Int | Double = null,
    maxEventLoopDelay: Int | Double = null,
    maxHeapUsedBytes: Int | Double = null,
    maxRssBytes: Int | Double = null,
    sampleInterval: Int | Double = null
  ): AnonConcurrent = {
    val __obj = js.Dynamic.literal()
    if (concurrent != null) __obj.updateDynamic("concurrent")(concurrent.asInstanceOf[js.Any])
    if (maxEventLoopDelay != null) __obj.updateDynamic("maxEventLoopDelay")(maxEventLoopDelay.asInstanceOf[js.Any])
    if (maxHeapUsedBytes != null) __obj.updateDynamic("maxHeapUsedBytes")(maxHeapUsedBytes.asInstanceOf[js.Any])
    if (maxRssBytes != null) __obj.updateDynamic("maxRssBytes")(maxRssBytes.asInstanceOf[js.Any])
    if (sampleInterval != null) __obj.updateDynamic("sampleInterval")(sampleInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConcurrent]
  }
}

