package typingsJapgolly.winrt.Windows.Devices.Enumeration

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceInformation
  extends StObject
     with IDeviceInformation
object DeviceInformation {
  
  inline def apply(
    enclosureLocation: EnclosureLocation,
    getGlyphThumbnailAsync: CallbackTo[IAsyncOperation[DeviceThumbnail]],
    getThumbnailAsync: CallbackTo[IAsyncOperation[DeviceThumbnail]],
    id: String,
    isDefault: Boolean,
    isEnabled: Boolean,
    name: String,
    properties: IMapView[String, Any],
    update: DeviceInformationUpdate => Callback
  ): DeviceInformation = {
    val __obj = js.Dynamic.literal(enclosureLocation = enclosureLocation.asInstanceOf[js.Any], getGlyphThumbnailAsync = getGlyphThumbnailAsync.toJsFn, getThumbnailAsync = getThumbnailAsync.toJsFn, id = id.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], update = js.Any.fromFunction1((t0: DeviceInformationUpdate) => update(t0).runNow()))
    __obj.asInstanceOf[DeviceInformation]
  }
}
