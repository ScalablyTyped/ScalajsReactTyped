package typingsJapgolly.winrt.Windows.ApplicationModel.DataTransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClipboardStatics extends js.Object {
  var oncontentchanged: js.Any
  def clear(): Unit
  def flush(): Unit
  def getContent(): DataPackageView
  def setContent(content: DataPackage): Unit
}

object IClipboardStatics {
  @scala.inline
  def apply(
    clear: Callback,
    flush: Callback,
    getContent: CallbackTo[DataPackageView],
    oncontentchanged: js.Any,
    setContent: DataPackage => Callback
  ): IClipboardStatics = {
    val __obj = js.Dynamic.literal(oncontentchanged = oncontentchanged.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("getContent")(getContent.toJsFn)
    __obj.updateDynamic("setContent")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.ApplicationModel.DataTransfer.DataPackage) => setContent(t0).runNow()))
    __obj.asInstanceOf[IClipboardStatics]
  }
}

