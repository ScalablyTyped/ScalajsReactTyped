package typingsJapgolly.trezorConnect.libTypescriptEventsMod

import typingsJapgolly.trezorConnect.anon.AccountTypes
import typingsJapgolly.trezorConnect.anon.CoinInfo
import typingsJapgolly.trezorConnect.anon.CustomCancelButton
import typingsJapgolly.trezorConnect.anon.Device
import typingsJapgolly.trezorConnect.anon.DeviceProgress
import typingsJapgolly.trezorConnect.anon.DeviceType
import typingsJapgolly.trezorConnect.anon.Devices
import typingsJapgolly.trezorConnect.anon.Message
import typingsJapgolly.trezorConnect.anon.OmitButtonRequestcodecodeCode
import typingsJapgolly.trezorConnect.anon.Permissions
import typingsJapgolly.trezorConnect.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _UiEvent extends StObject
object _UiEvent {
  
  inline def ButtonRequestMessage(payload: OmitButtonRequestcodecodeCode, `type`: /* "ui-button" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.ButtonRequestMessage = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.ButtonRequestMessage]
  }
  
  inline def CustomMessageRequest(payload: Message, `type`: /* "ui-custom_request" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.CustomMessageRequest = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.CustomMessageRequest]
  }
  
  inline def FirmwareProgress(payload: DeviceProgress, `type`: /* "ui-firmware-progress" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.FirmwareProgress = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.FirmwareProgress]
  }
  
  inline def MessageWithoutPayload(payload: scala.Unit, `type`: /* "ui-request_window" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.MessageWithoutPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.MessageWithoutPayload]
  }
  
  inline def PayloadDevice(payload: Device, `type`: /* "ui-request_pin" */ String): typingsJapgolly.trezorConnect.anon.PayloadDevice = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.PayloadDevice]
  }
  
  inline def PayloadDeviceType(payload: DeviceType, `type`: /* "ui-invalid_pin" */ String): typingsJapgolly.trezorConnect.anon.PayloadDeviceType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.PayloadDeviceType]
  }
  
  inline def PopupHandshake(`type`: /* "popup-handshake" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.PopupHandshake = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.PopupHandshake]
  }
  
  inline def RequestConfirmation(payload: CustomCancelButton, `type`: /* "ui-request_confirmation" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.RequestConfirmation = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.RequestConfirmation]
  }
  
  inline def RequestPermission(payload: Permissions, `type`: /* "ui-request_permission" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.RequestPermission = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.RequestPermission]
  }
  
  inline def SelectAccount(payload: AccountTypes, `type`: /* "ui-select_account" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.SelectAccount = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.SelectAccount]
  }
  
  inline def SelectDevice(payload: Devices, `type`: /* "ui-select_device" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.SelectDevice = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.SelectDevice]
  }
  
  inline def SelectFee(payload: CoinInfo, `type`: /* "ui-select_fee" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.SelectFee = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.SelectFee]
  }
  
  inline def TypeString(payload: Type, `type`: /* "ui-request_word" */ String): typingsJapgolly.trezorConnect.anon.TypeString = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.TypeString]
  }
  
  inline def UnexpectedDeviceMode(
    payload: typingsJapgolly.trezorConnect.libTypescriptTrezorDeviceMod.Device,
    `type`: /* "ui-device_bootloader_mode" */ String
  ): typingsJapgolly.trezorConnect.libTypescriptEventsMod.UnexpectedDeviceMode = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.UnexpectedDeviceMode]
  }
  
  inline def UpdateCustomFee(payload: CoinInfo, `type`: /* "ui-update_custom_fee" */ String): typingsJapgolly.trezorConnect.libTypescriptEventsMod.UpdateCustomFee = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.libTypescriptEventsMod.UpdateCustomFee]
  }
}
