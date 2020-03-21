package typingsJapgolly.cordovaPluginIbeacon.mod._Global_.BeaconPlugin

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delegate extends js.Object {
  def didChangeAuthorizationStatus(authorizationStatus: String): Unit
  def didDetermineStateForRegion(pluginResult: PluginResult): Unit
  def didEnterRegion(pluginResult: PluginResult): Unit
  def didExitRegion(pluginResult: PluginResult): Unit
  def didRangeBeaconsInRegion(pluginResult: PluginResult): Unit
  def didStartMonitoringForRegion(pluginResult: PluginResult): Unit
  def monitoringDidFailForRegionWithError(pluginResult: PluginResult): Unit
  def peripheralManagerDidStartAdvertising(pluginResult: PluginResult): Unit
  def peripheralManagerDidUpdateState(pluginResult: PluginResult): Unit
}

object Delegate {
  @scala.inline
  def apply(
    didChangeAuthorizationStatus: String => Callback,
    didDetermineStateForRegion: PluginResult => Callback,
    didEnterRegion: PluginResult => Callback,
    didExitRegion: PluginResult => Callback,
    didRangeBeaconsInRegion: PluginResult => Callback,
    didStartMonitoringForRegion: PluginResult => Callback,
    monitoringDidFailForRegionWithError: PluginResult => Callback,
    peripheralManagerDidStartAdvertising: PluginResult => Callback,
    peripheralManagerDidUpdateState: PluginResult => Callback
  ): Delegate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("didChangeAuthorizationStatus")(js.Any.fromFunction1((t0: java.lang.String) => didChangeAuthorizationStatus(t0).runNow()))
    __obj.updateDynamic("didDetermineStateForRegion")(js.Any.fromFunction1((t0: typingsJapgolly.cordovaPluginIbeacon.mod._Global_.BeaconPlugin.PluginResult) => didDetermineStateForRegion(t0).runNow()))
    __obj.updateDynamic("didEnterRegion")(js.Any.fromFunction1((t0: typingsJapgolly.cordovaPluginIbeacon.mod._Global_.BeaconPlugin.PluginResult) => didEnterRegion(t0).runNow()))
    __obj.updateDynamic("didExitRegion")(js.Any.fromFunction1((t0: typingsJapgolly.cordovaPluginIbeacon.mod._Global_.BeaconPlugin.PluginResult) => didExitRegion(t0).runNow()))
    __obj.updateDynamic("didRangeBeaconsInRegion")(js.Any.fromFunction1((t0: typingsJapgolly.cordovaPluginIbeacon.mod._Global_.BeaconPlugin.PluginResult) => didRangeBeaconsInRegion(t0).runNow()))
    __obj.updateDynamic("didStartMonitoringForRegion")(js.Any.fromFunction1((t0: typingsJapgolly.cordovaPluginIbeacon.mod._Global_.BeaconPlugin.PluginResult) => didStartMonitoringForRegion(t0).runNow()))
    __obj.updateDynamic("monitoringDidFailForRegionWithError")(js.Any.fromFunction1((t0: typingsJapgolly.cordovaPluginIbeacon.mod._Global_.BeaconPlugin.PluginResult) => monitoringDidFailForRegionWithError(t0).runNow()))
    __obj.updateDynamic("peripheralManagerDidStartAdvertising")(js.Any.fromFunction1((t0: typingsJapgolly.cordovaPluginIbeacon.mod._Global_.BeaconPlugin.PluginResult) => peripheralManagerDidStartAdvertising(t0).runNow()))
    __obj.updateDynamic("peripheralManagerDidUpdateState")(js.Any.fromFunction1((t0: typingsJapgolly.cordovaPluginIbeacon.mod._Global_.BeaconPlugin.PluginResult) => peripheralManagerDidUpdateState(t0).runNow()))
    __obj.asInstanceOf[Delegate]
  }
}

