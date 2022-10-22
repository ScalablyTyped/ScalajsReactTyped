package typingsJapgolly.winrt.Windows.Devices.Enumeration

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDeviceInformation extends StObject {
  
  var enclosureLocation: EnclosureLocation
  
  def getGlyphThumbnailAsync(): IAsyncOperation[DeviceThumbnail]
  
  def getThumbnailAsync(): IAsyncOperation[DeviceThumbnail]
  
  var id: String
  
  var isDefault: Boolean
  
  var isEnabled: Boolean
  
  var name: String
  
  var properties: IMapView[String, Any]
  
  def update(updateInfo: DeviceInformationUpdate): Unit
}
object IDeviceInformation {
  
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
  ): IDeviceInformation = {
    val __obj = js.Dynamic.literal(enclosureLocation = enclosureLocation.asInstanceOf[js.Any], getGlyphThumbnailAsync = getGlyphThumbnailAsync.toJsFn, getThumbnailAsync = getThumbnailAsync.toJsFn, id = id.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], update = js.Any.fromFunction1((t0: DeviceInformationUpdate) => update(t0).runNow()))
    __obj.asInstanceOf[IDeviceInformation]
  }
  
  extension [Self <: IDeviceInformation](x: Self) {
    
    inline def setEnclosureLocation(value: EnclosureLocation): Self = StObject.set(x, "enclosureLocation", value.asInstanceOf[js.Any])
    
    inline def setGetGlyphThumbnailAsync(value: CallbackTo[IAsyncOperation[DeviceThumbnail]]): Self = StObject.set(x, "getGlyphThumbnailAsync", value.toJsFn)
    
    inline def setGetThumbnailAsync(value: CallbackTo[IAsyncOperation[DeviceThumbnail]]): Self = StObject.set(x, "getThumbnailAsync", value.toJsFn)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IMapView[String, Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: DeviceInformationUpdate => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: DeviceInformationUpdate) => value(t0).runNow()))
  }
}
