package typingsJapgolly.chrome

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofdeviceAttributes extends js.Object {
  def getDeviceAnnotatedLocation(callback: js.Function1[/* annotatedLocation */ String, Unit]): Unit
  def getDeviceAssetId(callback: js.Function1[/* assetId */ String, Unit]): Unit
  def getDeviceSerialNumber(callback: js.Function1[/* serialNumber */ String, Unit]): Unit
  def getDirectoryDeviceId(callback: js.Function1[/* deviceId */ String, Unit]): Unit
}

object TypeofdeviceAttributes {
  @scala.inline
  def apply(
    getDeviceAnnotatedLocation: js.Function1[/* annotatedLocation */ String, Unit] => Callback,
    getDeviceAssetId: js.Function1[/* assetId */ String, Unit] => Callback,
    getDeviceSerialNumber: js.Function1[/* serialNumber */ String, Unit] => Callback,
    getDirectoryDeviceId: js.Function1[/* deviceId */ String, Unit] => Callback
  ): TypeofdeviceAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDeviceAnnotatedLocation")(js.Any.fromFunction1((t0: js.Function1[/* annotatedLocation */ java.lang.String, scala.Unit]) => getDeviceAnnotatedLocation(t0).runNow()))
    __obj.updateDynamic("getDeviceAssetId")(js.Any.fromFunction1((t0: js.Function1[/* assetId */ java.lang.String, scala.Unit]) => getDeviceAssetId(t0).runNow()))
    __obj.updateDynamic("getDeviceSerialNumber")(js.Any.fromFunction1((t0: js.Function1[/* serialNumber */ java.lang.String, scala.Unit]) => getDeviceSerialNumber(t0).runNow()))
    __obj.updateDynamic("getDirectoryDeviceId")(js.Any.fromFunction1((t0: js.Function1[/* deviceId */ java.lang.String, scala.Unit]) => getDirectoryDeviceId(t0).runNow()))
    __obj.asInstanceOf[TypeofdeviceAttributes]
  }
}

