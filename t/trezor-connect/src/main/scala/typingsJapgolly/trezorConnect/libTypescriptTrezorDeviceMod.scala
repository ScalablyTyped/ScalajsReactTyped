package typingsJapgolly.trezorConnect

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.ReturnType
import typingsJapgolly.trezorConnect.anon.Max
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.Features
import typingsJapgolly.trezorConnect.trezorConnectStrings.acquired
import typingsJapgolly.trezorConnect.trezorConnectStrings.normal_
import typingsJapgolly.trezorConnect.trezorConnectStrings.unacquired
import typingsJapgolly.trezorConnect.trezorConnectStrings.unreadable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptTrezorDeviceMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.KnownDevice
    - typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.UnknownDevice
    - typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.UnreadableDevice
  */
  trait Device extends StObject
  object Device {
    
    inline def KnownDevice(
      error: scala.Unit,
      features: Features,
      firmware: DeviceFirmwareStatus,
      label: String,
      mode: DeviceMode,
      path: String,
      status: DeviceStatus,
      unavailableCapabilities: UnavailableCapabilities
    ): typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.KnownDevice = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], firmware = firmware.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unavailableCapabilities = unavailableCapabilities.asInstanceOf[js.Any], id = null)
      __obj.updateDynamic("type")("acquired")
      __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.KnownDevice]
    }
    
    inline def UnknownDevice(
      error: scala.Unit,
      features: scala.Unit,
      firmware: scala.Unit,
      firmwareRelease: scala.Unit,
      label: String,
      mode: scala.Unit,
      path: String,
      state: scala.Unit,
      status: scala.Unit,
      unavailableCapabilities: scala.Unit
    ): typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.UnknownDevice = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], firmware = firmware.asInstanceOf[js.Any], firmwareRelease = firmwareRelease.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unavailableCapabilities = unavailableCapabilities.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("unacquired")
      __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.UnknownDevice]
    }
    
    inline def UnreadableDevice(
      error: String,
      features: scala.Unit,
      firmware: scala.Unit,
      firmwareRelease: scala.Unit,
      label: String,
      mode: scala.Unit,
      path: String,
      state: scala.Unit,
      status: scala.Unit,
      unavailableCapabilities: scala.Unit
    ): typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.UnreadableDevice = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], firmware = firmware.asInstanceOf[js.Any], firmwareRelease = firmwareRelease.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unavailableCapabilities = unavailableCapabilities.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("unreadable")
      __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.UnreadableDevice]
    }
  }
  
  trait DeviceEvent extends StObject {
    
    var payload: Device
    
    var `type`: /* "device-connect" */ String
  }
  object DeviceEvent {
    
    inline def apply(payload: Device, `type`: /* "device-connect" */ String): DeviceEvent = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceEvent]
    }
    
    extension [Self <: DeviceEvent](x: Self) {
      
      inline def setPayload(value: Device): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "device-connect" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.trezorConnect.trezorConnectStrings.valid
    - typingsJapgolly.trezorConnect.trezorConnectStrings.outdated
    - typingsJapgolly.trezorConnect.trezorConnectStrings.required
    - typingsJapgolly.trezorConnect.trezorConnectStrings.unknown
    - typingsJapgolly.trezorConnect.trezorConnectStrings.none
  */
  trait DeviceFirmwareStatus extends StObject
  object DeviceFirmwareStatus {
    
    inline def none: typingsJapgolly.trezorConnect.trezorConnectStrings.none = "none".asInstanceOf[typingsJapgolly.trezorConnect.trezorConnectStrings.none]
    
    inline def outdated: typingsJapgolly.trezorConnect.trezorConnectStrings.outdated = "outdated".asInstanceOf[typingsJapgolly.trezorConnect.trezorConnectStrings.outdated]
    
    inline def required: typingsJapgolly.trezorConnect.trezorConnectStrings.required = "required".asInstanceOf[typingsJapgolly.trezorConnect.trezorConnectStrings.required]
    
    inline def unknown: typingsJapgolly.trezorConnect.trezorConnectStrings.unknown = "unknown".asInstanceOf[typingsJapgolly.trezorConnect.trezorConnectStrings.unknown]
    
    inline def valid: typingsJapgolly.trezorConnect.trezorConnectStrings.valid = "valid".asInstanceOf[typingsJapgolly.trezorConnect.trezorConnectStrings.valid]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.trezorConnect.trezorConnectStrings.normal_
    - typingsJapgolly.trezorConnect.trezorConnectStrings.bootloader
    - typingsJapgolly.trezorConnect.trezorConnectStrings.initialize
    - typingsJapgolly.trezorConnect.trezorConnectStrings.seedless
  */
  trait DeviceMode extends StObject
  object DeviceMode {
    
    inline def bootloader: typingsJapgolly.trezorConnect.trezorConnectStrings.bootloader = "bootloader".asInstanceOf[typingsJapgolly.trezorConnect.trezorConnectStrings.bootloader]
    
    inline def initialize: typingsJapgolly.trezorConnect.trezorConnectStrings.initialize = "initialize".asInstanceOf[typingsJapgolly.trezorConnect.trezorConnectStrings.initialize]
    
    inline def normal: normal_ = "normal".asInstanceOf[normal_]
    
    inline def seedless: typingsJapgolly.trezorConnect.trezorConnectStrings.seedless = "seedless".asInstanceOf[typingsJapgolly.trezorConnect.trezorConnectStrings.seedless]
  }
  
  trait DeviceStateResponse extends StObject {
    
    var state: String
  }
  object DeviceStateResponse {
    
    inline def apply(state: String): DeviceStateResponse = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceStateResponse]
    }
    
    extension [Self <: DeviceStateResponse](x: Self) {
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.trezorConnect.trezorConnectStrings.available
    - typingsJapgolly.trezorConnect.trezorConnectStrings.occupied
    - typingsJapgolly.trezorConnect.trezorConnectStrings.used
  */
  trait DeviceStatus extends StObject
  object DeviceStatus {
    
    inline def available: typingsJapgolly.trezorConnect.trezorConnectStrings.available = "available".asInstanceOf[typingsJapgolly.trezorConnect.trezorConnectStrings.available]
    
    inline def occupied: typingsJapgolly.trezorConnect.trezorConnectStrings.occupied = "occupied".asInstanceOf[typingsJapgolly.trezorConnect.trezorConnectStrings.occupied]
    
    inline def used: typingsJapgolly.trezorConnect.trezorConnectStrings.used = "used".asInstanceOf[typingsJapgolly.trezorConnect.trezorConnectStrings.used]
  }
  
  trait FirmwareRange extends StObject {
    
    var `1`: Max
    
    var `2`: Max
  }
  object FirmwareRange {
    
    inline def apply(`1`: Max, `2`: Max): FirmwareRange = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirmwareRange]
    }
    
    extension [Self <: FirmwareRange](x: Self) {
      
      inline def set1(value: Max): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set2(value: Max): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    }
  }
  
  type FirmwareRelease = ReturnType[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof getInfo */ Any
  ]
  
  trait KnownDevice
    extends StObject
       with Device {
    
    var error: scala.Unit
    
    var features: Features
    
    var firmware: DeviceFirmwareStatus
    
    var firmwareRelease: js.UndefOr[FirmwareRelease] = js.undefined
    
    var id: String | Null
    
    var label: String
    
    var mode: DeviceMode
    
    var path: String
    
    var state: js.UndefOr[String] = js.undefined
    
    var status: DeviceStatus
    
    var `type`: acquired
    
    var unavailableCapabilities: UnavailableCapabilities
  }
  object KnownDevice {
    
    inline def apply(
      error: scala.Unit,
      features: Features,
      firmware: DeviceFirmwareStatus,
      label: String,
      mode: DeviceMode,
      path: String,
      status: DeviceStatus,
      unavailableCapabilities: UnavailableCapabilities
    ): KnownDevice = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], firmware = firmware.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unavailableCapabilities = unavailableCapabilities.asInstanceOf[js.Any], id = null)
      __obj.updateDynamic("type")("acquired")
      __obj.asInstanceOf[KnownDevice]
    }
    
    extension [Self <: KnownDevice](x: Self) {
      
      inline def setError(value: scala.Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFeatures(value: Features): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFirmware(value: DeviceFirmwareStatus): Self = StObject.set(x, "firmware", value.asInstanceOf[js.Any])
      
      inline def setFirmwareRelease(value: FirmwareRelease): Self = StObject.set(x, "firmwareRelease", value.asInstanceOf[js.Any])
      
      inline def setFirmwareReleaseUndefined: Self = StObject.set(x, "firmwareRelease", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setMode(value: DeviceMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStatus(value: DeviceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: acquired): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnavailableCapabilities(value: UnavailableCapabilities): Self = StObject.set(x, "unavailableCapabilities", value.asInstanceOf[js.Any])
    }
  }
  
  type UnavailableCapabilities = StringDictionary[UnavailableCapability]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.trezorConnect.trezorConnectStrings.`no-capability`
    - typingsJapgolly.trezorConnect.trezorConnectStrings.`no-support`
    - typingsJapgolly.trezorConnect.trezorConnectStrings.`update-required`
    - typingsJapgolly.trezorConnect.trezorConnectStrings.`trezor-connect-outdated`
  */
  trait UnavailableCapability extends StObject
  object UnavailableCapability {
    
    inline def `no-capability`: typingsJapgolly.trezorConnect.trezorConnectStrings.`no-capability` = "no-capability".asInstanceOf[typingsJapgolly.trezorConnect.trezorConnectStrings.`no-capability`]
    
    inline def `no-support`: typingsJapgolly.trezorConnect.trezorConnectStrings.`no-support` = "no-support".asInstanceOf[typingsJapgolly.trezorConnect.trezorConnectStrings.`no-support`]
    
    inline def `trezor-connect-outdated`: typingsJapgolly.trezorConnect.trezorConnectStrings.`trezor-connect-outdated` = "trezor-connect-outdated".asInstanceOf[typingsJapgolly.trezorConnect.trezorConnectStrings.`trezor-connect-outdated`]
    
    inline def `update-required`: typingsJapgolly.trezorConnect.trezorConnectStrings.`update-required` = "update-required".asInstanceOf[typingsJapgolly.trezorConnect.trezorConnectStrings.`update-required`]
  }
  
  trait UnknownDevice
    extends StObject
       with Device {
    
    var error: scala.Unit
    
    var features: scala.Unit
    
    var firmware: scala.Unit
    
    var firmwareRelease: scala.Unit
    
    var id: js.UndefOr[Null] = js.undefined
    
    var label: String
    
    var mode: scala.Unit
    
    var path: String
    
    var state: scala.Unit
    
    var status: scala.Unit
    
    var `type`: unacquired
    
    var unavailableCapabilities: scala.Unit
  }
  object UnknownDevice {
    
    inline def apply(
      error: scala.Unit,
      features: scala.Unit,
      firmware: scala.Unit,
      firmwareRelease: scala.Unit,
      label: String,
      mode: scala.Unit,
      path: String,
      state: scala.Unit,
      status: scala.Unit,
      unavailableCapabilities: scala.Unit
    ): UnknownDevice = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], firmware = firmware.asInstanceOf[js.Any], firmwareRelease = firmwareRelease.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unavailableCapabilities = unavailableCapabilities.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("unacquired")
      __obj.asInstanceOf[UnknownDevice]
    }
    
    extension [Self <: UnknownDevice](x: Self) {
      
      inline def setError(value: scala.Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFeatures(value: scala.Unit): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFirmware(value: scala.Unit): Self = StObject.set(x, "firmware", value.asInstanceOf[js.Any])
      
      inline def setFirmwareRelease(value: scala.Unit): Self = StObject.set(x, "firmwareRelease", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setMode(value: scala.Unit): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setState(value: scala.Unit): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: scala.Unit): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: unacquired): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnavailableCapabilities(value: scala.Unit): Self = StObject.set(x, "unavailableCapabilities", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnreadableDevice
    extends StObject
       with Device {
    
    var error: String
    
    var features: scala.Unit
    
    var firmware: scala.Unit
    
    var firmwareRelease: scala.Unit
    
    var id: js.UndefOr[Null] = js.undefined
    
    var label: String
    
    var mode: scala.Unit
    
    var path: String
    
    var state: scala.Unit
    
    var status: scala.Unit
    
    var `type`: unreadable
    
    var unavailableCapabilities: scala.Unit
  }
  object UnreadableDevice {
    
    inline def apply(
      error: String,
      features: scala.Unit,
      firmware: scala.Unit,
      firmwareRelease: scala.Unit,
      label: String,
      mode: scala.Unit,
      path: String,
      state: scala.Unit,
      status: scala.Unit,
      unavailableCapabilities: scala.Unit
    ): UnreadableDevice = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], firmware = firmware.asInstanceOf[js.Any], firmwareRelease = firmwareRelease.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unavailableCapabilities = unavailableCapabilities.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("unreadable")
      __obj.asInstanceOf[UnreadableDevice]
    }
    
    extension [Self <: UnreadableDevice](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFeatures(value: scala.Unit): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFirmware(value: scala.Unit): Self = StObject.set(x, "firmware", value.asInstanceOf[js.Any])
      
      inline def setFirmwareRelease(value: scala.Unit): Self = StObject.set(x, "firmwareRelease", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setMode(value: scala.Unit): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setState(value: scala.Unit): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: scala.Unit): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: unreadable): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnavailableCapabilities(value: scala.Unit): Self = StObject.set(x, "unavailableCapabilities", value.asInstanceOf[js.Any])
    }
  }
}
