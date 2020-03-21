package typingsJapgolly.webcl.WEBCL

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.6.1
trait WebCLBuffer extends WebCLMemoryObject {
  def createSubBuffer(memFlags: MemFlagsBits, origin: Double, sizeInBytes: Double): WebCLBuffer
}

object WebCLBuffer {
  @scala.inline
  def apply(
    createSubBuffer: (MemFlagsBits, Double, Double) => CallbackTo[WebCLBuffer],
    getInfo: MemInfo => CallbackTo[js.Any],
    release: Callback
  ): WebCLBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createSubBuffer")(js.Any.fromFunction3((t0: typingsJapgolly.webcl.WEBCL.MemFlagsBits, t1: scala.Double, t2: scala.Double) => createSubBuffer(t0, t1, t2).runNow()))
    __obj.updateDynamic("getInfo")(js.Any.fromFunction1((t0: typingsJapgolly.webcl.WEBCL.MemInfo) => getInfo(t0).runNow()))
    __obj.updateDynamic("release")(release.toJsFn)
    __obj.asInstanceOf[WebCLBuffer]
  }
}

