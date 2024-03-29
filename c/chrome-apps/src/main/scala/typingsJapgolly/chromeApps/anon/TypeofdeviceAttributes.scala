package typingsJapgolly.chromeApps.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofdeviceAttributes extends StObject {
  
  /**
    * @since Chrome 66.
    * @description
    * Fetches the administrator-annotated Location.
    * If the current user is not affiliated or no Annotated Location has been set by the administrator, returns an empty string.
    * @param callback Called with the Annotated Location of the device.
    */
  def getDeviceAnnotatedLocation(callback: js.Function1[/* annotatedLocation */ String, Unit]): Unit
  
  /**
    * @since Chrome 66.
    * @description
    * Fetches the administrator-annotated Asset Id.
    * If the current user is not affiliated or no Asset Id has been set by the administrator, returns an empty string.
    * @param callback Called with the Asset ID of the device.
    */
  def getDeviceAssetId(callback: js.Function1[/* assetId */ String, Unit]): Unit
  
  /**
    * @since Chrome 66.
    * @description
    * Fetches the device's serial number.
    * Please note the purpose of this API is to administrate the device
    * (e.g. generating Certificate Sign Requests for device-wide certificates).
    * This API may not be used for tracking devices without the consent of the device's administrator.
    * If the current user is not affiliated, returns an empty string.
    * @param callback Called with the serial number of the device.
    */
  def getDeviceSerialNumber(callback: js.Function1[/* serialNumber */ String, Unit]): Unit
  
  /**
    * @description
    * Fetches the value of the device identifier of the directory API,
    * that is generated by the server and identifies the cloud record
    * of the device for querying in the cloud directory API.
    * If the current user is not affiliated, returns an empty string.
    * @param callback Called with the device identifier of the directory API when received.
    */
  def getDirectoryDeviceId(callback: js.Function1[/* deviceId */ String, Unit]): Unit
}
object TypeofdeviceAttributes {
  
  inline def apply(
    getDeviceAnnotatedLocation: js.Function1[/* annotatedLocation */ String, Unit] => Callback,
    getDeviceAssetId: js.Function1[/* assetId */ String, Unit] => Callback,
    getDeviceSerialNumber: js.Function1[/* serialNumber */ String, Unit] => Callback,
    getDirectoryDeviceId: js.Function1[/* deviceId */ String, Unit] => Callback
  ): TypeofdeviceAttributes = {
    val __obj = js.Dynamic.literal(getDeviceAnnotatedLocation = js.Any.fromFunction1((t0: js.Function1[/* annotatedLocation */ String, Unit]) => getDeviceAnnotatedLocation(t0).runNow()), getDeviceAssetId = js.Any.fromFunction1((t0: js.Function1[/* assetId */ String, Unit]) => getDeviceAssetId(t0).runNow()), getDeviceSerialNumber = js.Any.fromFunction1((t0: js.Function1[/* serialNumber */ String, Unit]) => getDeviceSerialNumber(t0).runNow()), getDirectoryDeviceId = js.Any.fromFunction1((t0: js.Function1[/* deviceId */ String, Unit]) => getDirectoryDeviceId(t0).runNow()))
    __obj.asInstanceOf[TypeofdeviceAttributes]
  }
  
  extension [Self <: TypeofdeviceAttributes](x: Self) {
    
    inline def setGetDeviceAnnotatedLocation(value: js.Function1[/* annotatedLocation */ String, Unit] => Callback): Self = StObject.set(x, "getDeviceAnnotatedLocation", js.Any.fromFunction1((t0: js.Function1[/* annotatedLocation */ String, Unit]) => value(t0).runNow()))
    
    inline def setGetDeviceAssetId(value: js.Function1[/* assetId */ String, Unit] => Callback): Self = StObject.set(x, "getDeviceAssetId", js.Any.fromFunction1((t0: js.Function1[/* assetId */ String, Unit]) => value(t0).runNow()))
    
    inline def setGetDeviceSerialNumber(value: js.Function1[/* serialNumber */ String, Unit] => Callback): Self = StObject.set(x, "getDeviceSerialNumber", js.Any.fromFunction1((t0: js.Function1[/* serialNumber */ String, Unit]) => value(t0).runNow()))
    
    inline def setGetDirectoryDeviceId(value: js.Function1[/* deviceId */ String, Unit] => Callback): Self = StObject.set(x, "getDirectoryDeviceId", js.Any.fromFunction1((t0: js.Function1[/* deviceId */ String, Unit]) => value(t0).runNow()))
  }
}
