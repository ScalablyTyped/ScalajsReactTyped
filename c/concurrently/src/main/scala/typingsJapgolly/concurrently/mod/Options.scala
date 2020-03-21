package typingsJapgolly.concurrently.mod

import typingsJapgolly.concurrently.concurrentlyStrings.command
import typingsJapgolly.concurrently.concurrentlyStrings.failure
import typingsJapgolly.concurrently.concurrentlyStrings.first
import typingsJapgolly.concurrently.concurrentlyStrings.index
import typingsJapgolly.concurrently.concurrentlyStrings.last
import typingsJapgolly.concurrently.concurrentlyStrings.name
import typingsJapgolly.concurrently.concurrentlyStrings.none
import typingsJapgolly.concurrently.concurrentlyStrings.pid
import typingsJapgolly.concurrently.concurrentlyStrings.success
import typingsJapgolly.concurrently.concurrentlyStrings.time
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** the default input target when reading from `inputStream`. Default: `0`. */
  var defaultInputTarget: js.UndefOr[Double] = js.undefined
  /** a Readable stream to read the input from, eg `process.stdin` */
  var inputStream: js.UndefOr[ReadableStream] = js.undefined
  /** an array of exiting conditions that will cause a process to kill others. Can contain any of success or failure. */
  var killOthers: js.UndefOr[js.Array[success | failure]] = js.undefined
  /**  a Writable stream to write logs to. Default: `process.stdout` */
  var outputStream: js.UndefOr[WritableStream] = js.undefined
  /**
    * the prefix type to use when logging processes output.
    */
  var prefix: js.UndefOr[index | pid | time | command | name | none | String] = js.undefined
  /** how many characters to show when prefixing with `command`. Default: `10` */
  var prefixLength: js.UndefOr[Double] = js.undefined
  /** whether raw mode should be used, meaning strictly process output will be logged, without any prefixes, colouring or extra stuff. */
  var raw: js.UndefOr[Boolean] = js.undefined
  /** how many milliseconds to wait between process restarts. Default: 0 */
  var restartDelay: js.UndefOr[Double] = js.undefined
  /** how many attempts to restart a process that dies will be made. Default: `0` */
  var restartTries: js.UndefOr[Double] = js.undefined
  /** the condition to consider the run was successful. */
  var successCondition: js.UndefOr[first | last] = js.undefined
  /** a date-fns format to use when prefixing with time. Default: `yyyy-MM-dd HH:mm:ss.ZZZ` */
  var timestampFormat: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defaultInputTarget: Int | Double = null,
    inputStream: ReadableStream = null,
    killOthers: js.Array[success | failure] = null,
    outputStream: WritableStream = null,
    prefix: index | pid | time | command | name | none | String = null,
    prefixLength: Int | Double = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    restartDelay: Int | Double = null,
    restartTries: Int | Double = null,
    successCondition: first | last = null,
    timestampFormat: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (defaultInputTarget != null) __obj.updateDynamic("defaultInputTarget")(defaultInputTarget.asInstanceOf[js.Any])
    if (inputStream != null) __obj.updateDynamic("inputStream")(inputStream.asInstanceOf[js.Any])
    if (killOthers != null) __obj.updateDynamic("killOthers")(killOthers.asInstanceOf[js.Any])
    if (outputStream != null) __obj.updateDynamic("outputStream")(outputStream.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixLength != null) __obj.updateDynamic("prefixLength")(prefixLength.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (restartDelay != null) __obj.updateDynamic("restartDelay")(restartDelay.asInstanceOf[js.Any])
    if (restartTries != null) __obj.updateDynamic("restartTries")(restartTries.asInstanceOf[js.Any])
    if (successCondition != null) __obj.updateDynamic("successCondition")(successCondition.asInstanceOf[js.Any])
    if (timestampFormat != null) __obj.updateDynamic("timestampFormat")(timestampFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

