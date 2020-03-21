package typingsJapgolly.asyncBusboy.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.busboy.AnonFieldNameSize
import typingsJapgolly.busboy.busboy.BusboyConfig
import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends BusboyConfig {
  def onFile(fieldname: String, file: ReadableStream, filename: String, encoding: String, mimetype: String): Unit
}

object Options {
  @scala.inline
  def apply(
    onFile: (String, ReadableStream, String, String, String) => Callback,
    defCharset: String = null,
    fileHwm: Int | Double = null,
    headers: js.Any = null,
    highWaterMark: Int | Double = null,
    limits: AnonFieldNameSize = null,
    preservePath: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onFile")(js.Any.fromFunction5((t0: java.lang.String, t1: typingsJapgolly.node.NodeJS.ReadableStream, t2: java.lang.String, t3: java.lang.String, t4: java.lang.String) => onFile(t0, t1, t2, t3, t4).runNow()))
    if (defCharset != null) __obj.updateDynamic("defCharset")(defCharset.asInstanceOf[js.Any])
    if (fileHwm != null) __obj.updateDynamic("fileHwm")(fileHwm.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (limits != null) __obj.updateDynamic("limits")(limits.asInstanceOf[js.Any])
    if (!js.isUndefined(preservePath)) __obj.updateDynamic("preservePath")(preservePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

