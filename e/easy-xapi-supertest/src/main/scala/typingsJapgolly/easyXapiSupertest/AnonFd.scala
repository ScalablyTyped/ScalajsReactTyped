package typingsJapgolly.easyXapiSupertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFd extends js.Object {
  var bufferSize: js.UndefOr[Double] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var fd: js.UndefOr[String] = js.undefined
  var flags: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
}

object AnonFd {
  @scala.inline
  def apply(
    bufferSize: Int | Double = null,
    encoding: String = null,
    fd: String = null,
    flags: String = null,
    mode: String = null
  ): AnonFd = {
    val __obj = js.Dynamic.literal()
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFd]
  }
}

