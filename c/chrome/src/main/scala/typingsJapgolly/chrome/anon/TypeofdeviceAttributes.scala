package typingsJapgolly.chrome.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofdeviceAttributes extends StObject {
  
  def getDeviceAnnotatedLocation(callback: js.Function1[/* annotatedLocation */ String, Unit]): Unit
  
  def getDeviceAssetId(callback: js.Function1[/* assetId */ String, Unit]): Unit
  
  def getDeviceHostname(callback: js.Function1[/* hostname */ String, Unit]): Unit
  
  def getDeviceSerialNumber(callback: js.Function1[/* serialNumber */ String, Unit]): Unit
  
  def getDirectoryDeviceId(callback: js.Function1[/* deviceId */ String, Unit]): Unit
}
object TypeofdeviceAttributes {
  
  inline def apply(
    getDeviceAnnotatedLocation: js.Function1[/* annotatedLocation */ String, Unit] => Callback,
    getDeviceAssetId: js.Function1[/* assetId */ String, Unit] => Callback,
    getDeviceHostname: js.Function1[/* hostname */ String, Unit] => Callback,
    getDeviceSerialNumber: js.Function1[/* serialNumber */ String, Unit] => Callback,
    getDirectoryDeviceId: js.Function1[/* deviceId */ String, Unit] => Callback
  ): TypeofdeviceAttributes = {
    val __obj = js.Dynamic.literal(getDeviceAnnotatedLocation = js.Any.fromFunction1((t0: js.Function1[/* annotatedLocation */ String, Unit]) => getDeviceAnnotatedLocation(t0).runNow()), getDeviceAssetId = js.Any.fromFunction1((t0: js.Function1[/* assetId */ String, Unit]) => getDeviceAssetId(t0).runNow()), getDeviceHostname = js.Any.fromFunction1((t0: js.Function1[/* hostname */ String, Unit]) => getDeviceHostname(t0).runNow()), getDeviceSerialNumber = js.Any.fromFunction1((t0: js.Function1[/* serialNumber */ String, Unit]) => getDeviceSerialNumber(t0).runNow()), getDirectoryDeviceId = js.Any.fromFunction1((t0: js.Function1[/* deviceId */ String, Unit]) => getDirectoryDeviceId(t0).runNow()))
    __obj.asInstanceOf[TypeofdeviceAttributes]
  }
  
  extension [Self <: TypeofdeviceAttributes](x: Self) {
    
    inline def setGetDeviceAnnotatedLocation(value: js.Function1[/* annotatedLocation */ String, Unit] => Callback): Self = StObject.set(x, "getDeviceAnnotatedLocation", js.Any.fromFunction1((t0: js.Function1[/* annotatedLocation */ String, Unit]) => value(t0).runNow()))
    
    inline def setGetDeviceAssetId(value: js.Function1[/* assetId */ String, Unit] => Callback): Self = StObject.set(x, "getDeviceAssetId", js.Any.fromFunction1((t0: js.Function1[/* assetId */ String, Unit]) => value(t0).runNow()))
    
    inline def setGetDeviceHostname(value: js.Function1[/* hostname */ String, Unit] => Callback): Self = StObject.set(x, "getDeviceHostname", js.Any.fromFunction1((t0: js.Function1[/* hostname */ String, Unit]) => value(t0).runNow()))
    
    inline def setGetDeviceSerialNumber(value: js.Function1[/* serialNumber */ String, Unit] => Callback): Self = StObject.set(x, "getDeviceSerialNumber", js.Any.fromFunction1((t0: js.Function1[/* serialNumber */ String, Unit]) => value(t0).runNow()))
    
    inline def setGetDirectoryDeviceId(value: js.Function1[/* deviceId */ String, Unit] => Callback): Self = StObject.set(x, "getDirectoryDeviceId", js.Any.fromFunction1((t0: js.Function1[/* deviceId */ String, Unit]) => value(t0).runNow()))
  }
}
