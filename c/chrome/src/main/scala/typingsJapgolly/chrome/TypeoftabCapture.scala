package typingsJapgolly.chrome

import japgolly.scalajs.react.Callback
import org.scalajs.dom.experimental.mediastream.MediaStream
import typingsJapgolly.chrome.chrome.tabCapture.CaptureInfo
import typingsJapgolly.chrome.chrome.tabCapture.CaptureOptions
import typingsJapgolly.chrome.chrome.tabCapture.CaptureStatusChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeoftabCapture extends js.Object {
  var onStatusChanged: CaptureStatusChangedEvent
  def capture(options: CaptureOptions, callback: js.Function1[/* stream */ MediaStream | Null, Unit]): Unit
  def getCapturedTabs(callback: js.Function1[/* result */ js.Array[CaptureInfo], Unit]): Unit
}

object TypeoftabCapture {
  @scala.inline
  def apply(
    capture: (CaptureOptions, js.Function1[/* stream */ MediaStream | Null, Unit]) => Callback,
    getCapturedTabs: js.Function1[/* result */ js.Array[CaptureInfo], Unit] => Callback,
    onStatusChanged: CaptureStatusChangedEvent
  ): TypeoftabCapture = {
    val __obj = js.Dynamic.literal(onStatusChanged = onStatusChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("capture")(js.Any.fromFunction2((t0: typingsJapgolly.chrome.chrome.tabCapture.CaptureOptions, t1: js.Function1[
  /* stream */ org.scalajs.dom.experimental.mediastream.MediaStream | scala.Null, 
  scala.Unit]) => capture(t0, t1).runNow()))
    __obj.updateDynamic("getCapturedTabs")(js.Any.fromFunction1((t0: js.Function1[
  /* result */ js.Array[typingsJapgolly.chrome.chrome.tabCapture.CaptureInfo], 
  scala.Unit]) => getCapturedTabs(t0).runNow()))
    __obj.asInstanceOf[TypeoftabCapture]
  }
}

