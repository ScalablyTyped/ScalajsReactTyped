package typingsJapgolly.winrt.Windows.ApplicationModel.DataTransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataTransferManagerStatics extends js.Object {
  def getForCurrentView(): DataTransferManager
  def showShareUI(): Unit
}

object IDataTransferManagerStatics {
  @scala.inline
  def apply(getForCurrentView: CallbackTo[DataTransferManager], showShareUI: Callback): IDataTransferManagerStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getForCurrentView")(getForCurrentView.toJsFn)
    __obj.updateDynamic("showShareUI")(showShareUI.toJsFn)
    __obj.asInstanceOf[IDataTransferManagerStatics]
  }
}

