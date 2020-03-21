package typingsJapgolly.naverWhale

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.system.storage.StorageCapacityInfo
import typingsJapgolly.chrome.chrome.system.storage.StorageUnitInfo
import typingsJapgolly.chrome.chrome.system.storage.SystemStorageAttachedEvent
import typingsJapgolly.chrome.chrome.system.storage.SystemStorageDetachedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofstorageEjectDevice extends js.Object {
  var onAttached: SystemStorageAttachedEvent
  var onDetached: SystemStorageDetachedEvent
  def ejectDevice(id: String, callback: js.Function1[/* result */ String, Unit]): Unit
  def getAvailableCapacity(id: String, callback: js.Function1[/* info */ StorageCapacityInfo, Unit]): Unit
  def getInfo(callback: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit]): Unit
}

object TypeofstorageEjectDevice {
  @scala.inline
  def apply(
    ejectDevice: (String, js.Function1[/* result */ String, Unit]) => Callback,
    getAvailableCapacity: (String, js.Function1[/* info */ StorageCapacityInfo, Unit]) => Callback,
    getInfo: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit] => Callback,
    onAttached: SystemStorageAttachedEvent,
    onDetached: SystemStorageDetachedEvent
  ): TypeofstorageEjectDevice = {
    val __obj = js.Dynamic.literal(onAttached = onAttached.asInstanceOf[js.Any], onDetached = onDetached.asInstanceOf[js.Any])
    __obj.updateDynamic("ejectDevice")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* result */ java.lang.String, scala.Unit]) => ejectDevice(t0, t1).runNow()))
    __obj.updateDynamic("getAvailableCapacity")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[
  /* info */ typingsJapgolly.chrome.chrome.system.storage.StorageCapacityInfo, 
  scala.Unit]) => getAvailableCapacity(t0, t1).runNow()))
    __obj.updateDynamic("getInfo")(js.Any.fromFunction1((t0: js.Function1[
  /* info */ js.Array[typingsJapgolly.chrome.chrome.system.storage.StorageUnitInfo], 
  scala.Unit]) => getInfo(t0).runNow()))
    __obj.asInstanceOf[TypeofstorageEjectDevice]
  }
}

