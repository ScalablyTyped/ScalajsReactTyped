package typingsJapgolly.winrt.Windows.Devices.Enumeration

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceInformation extends js.Object {
  var enclosureLocation: EnclosureLocation
  var id: String
  var isDefault: Boolean
  var isEnabled: Boolean
  var name: String
  var properties: IMapView[String, _]
  def getGlyphThumbnailAsync(): IAsyncOperation[DeviceThumbnail]
  def getThumbnailAsync(): IAsyncOperation[DeviceThumbnail]
  def update(updateInfo: DeviceInformationUpdate): Unit
}

object IDeviceInformation {
  @scala.inline
  def apply(
    enclosureLocation: EnclosureLocation,
    getGlyphThumbnailAsync: CallbackTo[IAsyncOperation[DeviceThumbnail]],
    getThumbnailAsync: CallbackTo[IAsyncOperation[DeviceThumbnail]],
    id: String,
    isDefault: Boolean,
    isEnabled: Boolean,
    name: String,
    properties: IMapView[String, _],
    update: DeviceInformationUpdate => Callback
  ): IDeviceInformation = {
    val __obj = js.Dynamic.literal(enclosureLocation = enclosureLocation.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("getGlyphThumbnailAsync")(getGlyphThumbnailAsync.toJsFn)
    __obj.updateDynamic("getThumbnailAsync")(getThumbnailAsync.toJsFn)
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Devices.Enumeration.DeviceInformationUpdate) => update(t0).runNow()))
    __obj.asInstanceOf[IDeviceInformation]
  }
}

