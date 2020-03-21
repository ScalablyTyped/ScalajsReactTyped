package typingsJapgolly.winrt.Windows.Devices.Portable

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageDeviceStatics extends js.Object {
  def fromId(interfaceId: String): StorageFolder
  def getDeviceSelector(): String
}

object IStorageDeviceStatics {
  @scala.inline
  def apply(fromId: String => CallbackTo[StorageFolder], getDeviceSelector: CallbackTo[String]): IStorageDeviceStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromId")(js.Any.fromFunction1((t0: java.lang.String) => fromId(t0).runNow()))
    __obj.updateDynamic("getDeviceSelector")(getDeviceSelector.toJsFn)
    __obj.asInstanceOf[IStorageDeviceStatics]
  }
}

