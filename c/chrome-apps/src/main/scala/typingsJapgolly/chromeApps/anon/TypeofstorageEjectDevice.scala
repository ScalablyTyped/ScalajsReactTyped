package typingsJapgolly.chromeApps.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chrome.events.Event
import typingsJapgolly.chromeApps.chrome.system.storage.StorageCapacityInfo
import typingsJapgolly.chromeApps.chrome.system.storage.StorageUnitInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofstorageEjectDevice extends StObject {
  
  val EjectDeviceResultCode: FAILURE
  
  val StorageUnitType: FIXED
  
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
        /* keyof typeof EjectDeviceResultCode */ String, 
        /* import warning: importer.ImportType#apply Failed type conversion: keyof typeof EjectDeviceResultCode extends keyof typeof EjectDeviceResultCode ? std.Exclude<keyof typeof EjectDeviceResultCode, typeof EjectDeviceResultCode[keyof typeof EjectDeviceResultCode]> : never */ js.Any
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
  
  /** Fired when a new removable storage is attached to the system. */
  val onAttached: Event[js.Function1[/* info */ StorageUnitInfo, Unit]]
  
  /** Fired when a removable storage is detached from the system. */
  val onDetached: Event[js.Function1[/* id */ String, Unit]]
}
object TypeofstorageEjectDevice {
  
  inline def apply(
    EjectDeviceResultCode: FAILURE,
    StorageUnitType: FIXED,
    ejectDevice: (String, js.Function1[
      /* result */ ToStringLiteral[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EjectDeviceResultCode */ js.Any, 
        /* keyof typeof EjectDeviceResultCode */ String, 
        /* import warning: importer.ImportType#apply Failed type conversion: keyof typeof EjectDeviceResultCode extends keyof typeof EjectDeviceResultCode ? std.Exclude<keyof typeof EjectDeviceResultCode, typeof EjectDeviceResultCode[keyof typeof EjectDeviceResultCode]> : never */ js.Any
      ], 
      Unit
    ]) => Callback,
    getAvailableCapacity: (String, js.Function1[/* info */ StorageCapacityInfo, Unit]) => Callback,
    getInfo: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit] => Callback,
    onAttached: Event[js.Function1[/* info */ StorageUnitInfo, Unit]],
    onDetached: Event[js.Function1[/* id */ String, Unit]]
  ): TypeofstorageEjectDevice = {
    val __obj = js.Dynamic.literal(EjectDeviceResultCode = EjectDeviceResultCode.asInstanceOf[js.Any], StorageUnitType = StorageUnitType.asInstanceOf[js.Any], ejectDevice = js.Any.fromFunction2((t0: String, t1: js.Function1[
      /* result */ ToStringLiteral[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof EjectDeviceResultCode */ js.Any, 
        /* keyof typeof EjectDeviceResultCode */ String, 
        /* import warning: importer.ImportType#apply Failed type conversion: keyof typeof EjectDeviceResultCode extends keyof typeof EjectDeviceResultCode ? std.Exclude<keyof typeof EjectDeviceResultCode, typeof EjectDeviceResultCode[keyof typeof EjectDeviceResultCode]> : never */ js.Any
      ], 
      Unit
    ]) => (ejectDevice(t0, t1)).runNow()), getAvailableCapacity = js.Any.fromFunction2((t0: String, t1: js.Function1[/* info */ StorageCapacityInfo, Unit]) => (getAvailableCapacity(t0, t1)).runNow()), getInfo = js.Any.fromFunction1((t0: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit]) => getInfo(t0).runNow()), onAttached = onAttached.asInstanceOf[js.Any], onDetached = onDetached.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofstorageEjectDevice]
  }
  
  extension [Self <: TypeofstorageEjectDevice](x: Self) {
    
    inline def setEjectDevice(
      value: (String, js.Function1[
          /* result */ ToStringLiteral[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EjectDeviceResultCode */ js.Any, 
            /* keyof typeof EjectDeviceResultCode */ String, 
            /* import warning: importer.ImportType#apply Failed type conversion: keyof typeof EjectDeviceResultCode extends keyof typeof EjectDeviceResultCode ? std.Exclude<keyof typeof EjectDeviceResultCode, typeof EjectDeviceResultCode[keyof typeof EjectDeviceResultCode]> : never */ js.Any
          ], 
          Unit
        ]) => Callback
    ): Self = StObject.set(x, "ejectDevice", js.Any.fromFunction2((t0: String, t1: js.Function1[
          /* result */ ToStringLiteral[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof EjectDeviceResultCode */ js.Any, 
            /* keyof typeof EjectDeviceResultCode */ String, 
            /* import warning: importer.ImportType#apply Failed type conversion: keyof typeof EjectDeviceResultCode extends keyof typeof EjectDeviceResultCode ? std.Exclude<keyof typeof EjectDeviceResultCode, typeof EjectDeviceResultCode[keyof typeof EjectDeviceResultCode]> : never */ js.Any
          ], 
          Unit
        ]) => (value(t0, t1)).runNow()))
    
    inline def setEjectDeviceResultCode(value: FAILURE): Self = StObject.set(x, "EjectDeviceResultCode", value.asInstanceOf[js.Any])
    
    inline def setGetAvailableCapacity(value: (String, js.Function1[/* info */ StorageCapacityInfo, Unit]) => Callback): Self = StObject.set(x, "getAvailableCapacity", js.Any.fromFunction2((t0: String, t1: js.Function1[/* info */ StorageCapacityInfo, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setGetInfo(value: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit] => Callback): Self = StObject.set(x, "getInfo", js.Any.fromFunction1((t0: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit]) => value(t0).runNow()))
    
    inline def setOnAttached(value: Event[js.Function1[/* info */ StorageUnitInfo, Unit]]): Self = StObject.set(x, "onAttached", value.asInstanceOf[js.Any])
    
    inline def setOnDetached(value: Event[js.Function1[/* id */ String, Unit]]): Self = StObject.set(x, "onDetached", value.asInstanceOf[js.Any])
    
    inline def setStorageUnitType(value: FIXED): Self = StObject.set(x, "StorageUnitType", value.asInstanceOf[js.Any])
  }
}
