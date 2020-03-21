package typingsJapgolly.chromeApps

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chrome.events.Event
import typingsJapgolly.chromeApps.chrome.system.storage.StorageCapacityInfo
import typingsJapgolly.chromeApps.chrome.system.storage.StorageUnitInfo
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofstorageEjectDevice extends js.Object {
  val EjectDeviceResultCode: AnonFAILURE
  val StorageUnitType: AnonFIXED
  /** Fired when a new removable storage is attached to the system. */
  val onAttached: Event[js.Function1[/* info */ StorageUnitInfo, Unit]]
  /** Fired when a removable storage is detached from the system. */
  val onDetached: Event[js.Function1[/* id */ String, Unit]]
  /**
    * Ejects a removable storage device.
    * @param callback
    * Parameter **result**:
    *
    * **success:** The ejection command is successful -- the application can prompt the user to remove the device;
    *
    * **in_use:** The device is in use by another application. The ejection did not succeed;
    *   the user should not remove the device until the other application is done with the device;
    *
    * **no_such_device:** There is no such device known.
    *
    * **failure:** The ejection command failed.
    */
  def ejectDevice(
    id: String,
    callback: js.Function1[
      /* result */ ToStringLiteral[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EjectDeviceResultCode */ js.Any, 
        String, 
        Exclude[
          String, 
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EjectDeviceResultCode[keyof typeof EjectDeviceResultCode] */ js.Any
        ]
      ], 
      Unit
    ]
  ): Unit
  /**
    * Get the available capacity of a specified |id| storage device. The |id| is the transient device ID from StorageUnitInfo.
    * @since Dev channel only.
    */
  def getAvailableCapacity(id: String, callback: js.Function1[/* info */ StorageCapacityInfo, Unit]): Unit
  /** Get the storage information from the system. The argument passed to the callback is an array of StorageUnitInfo objects. */
  def getInfo(callback: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit]): Unit
}

object TypeofstorageEjectDevice {
  @scala.inline
  def apply(
    EjectDeviceResultCode: AnonFAILURE,
    StorageUnitType: AnonFIXED,
    ejectDevice: (String, js.Function1[
      /* result */ ToStringLiteral[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EjectDeviceResultCode */ js.Any, 
        String, 
        Exclude[
          String, 
          /* import warning: importer.ImportType#apply Failed type conversion: typeof EjectDeviceResultCode[keyof typeof EjectDeviceResultCode] */ js.Any
        ]
      ], 
      Unit
    ]) => Callback,
    getAvailableCapacity: (String, js.Function1[/* info */ StorageCapacityInfo, Unit]) => Callback,
    getInfo: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit] => Callback,
    onAttached: Event[js.Function1[/* info */ StorageUnitInfo, Unit]],
    onDetached: Event[js.Function1[/* id */ String, Unit]]
  ): TypeofstorageEjectDevice = {
    val __obj = js.Dynamic.literal(EjectDeviceResultCode = EjectDeviceResultCode.asInstanceOf[js.Any], StorageUnitType = StorageUnitType.asInstanceOf[js.Any], onAttached = onAttached.asInstanceOf[js.Any], onDetached = onDetached.asInstanceOf[js.Any])
    __obj.updateDynamic("ejectDevice")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[
  /* result */ typingsJapgolly.chromeApps.chrome.ToStringLiteral[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof EjectDeviceResultCode */ js.Any, 
    java.lang.String, 
    typingsJapgolly.std.Exclude[
      java.lang.String, 
      /* import warning: importer.ImportType#apply Failed type conversion: typeof EjectDeviceResultCode[keyof typeof EjectDeviceResultCode] */ js.Any
    ]
  ], 
  scala.Unit]) => ejectDevice(t0, t1).runNow()))
    __obj.updateDynamic("getAvailableCapacity")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[
  /* info */ typingsJapgolly.chromeApps.chrome.system.storage.StorageCapacityInfo, 
  scala.Unit]) => getAvailableCapacity(t0, t1).runNow()))
    __obj.updateDynamic("getInfo")(js.Any.fromFunction1((t0: js.Function1[
  /* info */ js.Array[typingsJapgolly.chromeApps.chrome.system.storage.StorageUnitInfo], 
  scala.Unit]) => getInfo(t0).runNow()))
    __obj.asInstanceOf[TypeofstorageEjectDevice]
  }
}

