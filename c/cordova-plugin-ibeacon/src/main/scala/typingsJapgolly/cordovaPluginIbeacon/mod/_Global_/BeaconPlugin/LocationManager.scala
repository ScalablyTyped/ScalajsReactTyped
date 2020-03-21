package typingsJapgolly.cordovaPluginIbeacon.mod._Global_.BeaconPlugin

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationManager extends js.Object {
  var BeaconRegion: typingsJapgolly.cordovaPluginIbeacon.mod._Global_.BeaconPlugin.BeaconRegion
  var Region: typingsJapgolly.cordovaPluginIbeacon.mod._Global_.BeaconPlugin.Region
  var delegate: Delegate
  def appendToDeviceLog(message: String): Promise[String]
  def disableBluetooth(): Promise[Unit]
  def disableDebugLogs(): Promise[Unit]
  def disableDebugNotifications(): Promise[Unit]
  def enableBluetooth(): Promise[Unit]
  def enableDebugLogs(): Promise[Unit]
  def enableDebugNotifications(): Promise[Unit]
  def getAuthorizationStatus(): Promise[PluginResult]
  def getMonitoredRegions(): Promise[js.Array[Region]]
  def getRangedRegions(): Promise[js.Array[Region]]
  def isAdvertising(): Promise[Boolean]
  def isAdvertisingAvailable(): Promise[Boolean]
  def isBluetoothEnabled(): Promise[Boolean]
  def isMonitoringAvailableForClass(region: Region): Promise[Boolean]
  def isRangingAvailable(): Promise[Boolean]
  def onDomDelegateReady(): Promise[Unit]
  def requestAlwaysAuthorization(): Promise[Unit]
  def requestStateForRegion(region: Region): Promise[Unit]
  def requestWhenInUseAuthorization(): Promise[Unit]
  def startAdvertising(region: Region, measuredPower: Boolean): Promise[Unit]
  def startMonitoringForRegion(region: Region): Promise[Unit]
  def startRangingBeaconsInRegion(region: Region): Promise[Unit]
  def stopAdvertising(): Promise[Unit]
  def stopMonitoringForRegion(region: Region): Promise[Unit]
  def stopRangingBeaconsInRegion(region: Region): Promise[Unit]
}

object LocationManager {
  @scala.inline
  def apply(
    BeaconRegion: BeaconRegion,
    Region: Region,
    appendToDeviceLog: String => CallbackTo[Promise[String]],
    delegate: Delegate,
    disableBluetooth: CallbackTo[Promise[Unit]],
    disableDebugLogs: CallbackTo[Promise[Unit]],
    disableDebugNotifications: CallbackTo[Promise[Unit]],
    enableBluetooth: CallbackTo[Promise[Unit]],
    enableDebugLogs: CallbackTo[Promise[Unit]],
    enableDebugNotifications: CallbackTo[Promise[Unit]],
    getAuthorizationStatus: CallbackTo[Promise[PluginResult]],
    getMonitoredRegions: CallbackTo[Promise[js.Array[Region]]],
    getRangedRegions: CallbackTo[Promise[js.Array[Region]]],
    isAdvertising: CallbackTo[Promise[Boolean]],
    isAdvertisingAvailable: CallbackTo[Promise[Boolean]],
    isBluetoothEnabled: CallbackTo[Promise[Boolean]],
    isMonitoringAvailableForClass: Region => CallbackTo[Promise[Boolean]],
    isRangingAvailable: CallbackTo[Promise[Boolean]],
    onDomDelegateReady: CallbackTo[Promise[Unit]],
    requestAlwaysAuthorization: CallbackTo[Promise[Unit]],
    requestStateForRegion: Region => CallbackTo[Promise[Unit]],
    requestWhenInUseAuthorization: CallbackTo[Promise[Unit]],
    startAdvertising: (Region, Boolean) => CallbackTo[Promise[Unit]],
    startMonitoringForRegion: Region => CallbackTo[Promise[Unit]],
    startRangingBeaconsInRegion: Region => CallbackTo[Promise[Unit]],
    stopAdvertising: CallbackTo[Promise[Unit]],
    stopMonitoringForRegion: Region => CallbackTo[Promise[Unit]],
    stopRangingBeaconsInRegion: Region => CallbackTo[Promise[Unit]]
  ): LocationManager = {
    val __obj = js.Dynamic.literal(BeaconRegion = BeaconRegion.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any], delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("appendToDeviceLog")(js.Any.fromFunction1((t0: java.lang.String) => appendToDeviceLog(t0).runNow()))
    __obj.updateDynamic("disableBluetooth")(disableBluetooth.toJsFn)
    __obj.updateDynamic("disableDebugLogs")(disableDebugLogs.toJsFn)
    __obj.updateDynamic("disableDebugNotifications")(disableDebugNotifications.toJsFn)
    __obj.updateDynamic("enableBluetooth")(enableBluetooth.toJsFn)
    __obj.updateDynamic("enableDebugLogs")(enableDebugLogs.toJsFn)
    __obj.updateDynamic("enableDebugNotifications")(enableDebugNotifications.toJsFn)
    __obj.updateDynamic("getAuthorizationStatus")(getAuthorizationStatus.toJsFn)
    __obj.updateDynamic("getMonitoredRegions")(getMonitoredRegions.toJsFn)
    __obj.updateDynamic("getRangedRegions")(getRangedRegions.toJsFn)
    __obj.updateDynamic("isAdvertising")(isAdvertising.toJsFn)
    __obj.updateDynamic("isAdvertisingAvailable")(isAdvertisingAvailable.toJsFn)
    __obj.updateDynamic("isBluetoothEnabled")(isBluetoothEnabled.toJsFn)
    __obj.updateDynamic("isMonitoringAvailableForClass")(js.Any.fromFunction1((t0: typingsJapgolly.cordovaPluginIbeacon.mod._Global_.BeaconPlugin.Region) => isMonitoringAvailableForClass(t0).runNow()))
    __obj.updateDynamic("isRangingAvailable")(isRangingAvailable.toJsFn)
    __obj.updateDynamic("onDomDelegateReady")(onDomDelegateReady.toJsFn)
    __obj.updateDynamic("requestAlwaysAuthorization")(requestAlwaysAuthorization.toJsFn)
    __obj.updateDynamic("requestStateForRegion")(js.Any.fromFunction1((t0: typingsJapgolly.cordovaPluginIbeacon.mod._Global_.BeaconPlugin.Region) => requestStateForRegion(t0).runNow()))
    __obj.updateDynamic("requestWhenInUseAuthorization")(requestWhenInUseAuthorization.toJsFn)
    __obj.updateDynamic("startAdvertising")(js.Any.fromFunction2((t0: typingsJapgolly.cordovaPluginIbeacon.mod._Global_.BeaconPlugin.Region, t1: scala.Boolean) => startAdvertising(t0, t1).runNow()))
    __obj.updateDynamic("startMonitoringForRegion")(js.Any.fromFunction1((t0: typingsJapgolly.cordovaPluginIbeacon.mod._Global_.BeaconPlugin.Region) => startMonitoringForRegion(t0).runNow()))
    __obj.updateDynamic("startRangingBeaconsInRegion")(js.Any.fromFunction1((t0: typingsJapgolly.cordovaPluginIbeacon.mod._Global_.BeaconPlugin.Region) => startRangingBeaconsInRegion(t0).runNow()))
    __obj.updateDynamic("stopAdvertising")(stopAdvertising.toJsFn)
    __obj.updateDynamic("stopMonitoringForRegion")(js.Any.fromFunction1((t0: typingsJapgolly.cordovaPluginIbeacon.mod._Global_.BeaconPlugin.Region) => stopMonitoringForRegion(t0).runNow()))
    __obj.updateDynamic("stopRangingBeaconsInRegion")(js.Any.fromFunction1((t0: typingsJapgolly.cordovaPluginIbeacon.mod._Global_.BeaconPlugin.Region) => stopRangingBeaconsInRegion(t0).runNow()))
    __obj.asInstanceOf[LocationManager]
  }
}

