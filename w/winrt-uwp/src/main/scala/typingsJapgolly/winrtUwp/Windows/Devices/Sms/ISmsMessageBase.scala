package typingsJapgolly.winrtUwp.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface specifies base functionality for all SMS message types. */
trait ISmsMessageBase extends js.Object {
  /** Gets the cellular class of the message. */
  var cellularClass: CellularClass
  /** Gets the unique device identifier associated with this message. */
  var deviceId: String
  /** Gets the message class of this message. */
  var messageClass: SmsMessageClass
  /** Gets the message type of this message. */
  var messageType: SmsMessageType
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  var simIccId: String
}

object ISmsMessageBase {
  @scala.inline
  def apply(
    cellularClass: CellularClass,
    deviceId: String,
    messageClass: SmsMessageClass,
    messageType: SmsMessageType,
    simIccId: String
  ): ISmsMessageBase = {
    val __obj = js.Dynamic.literal(cellularClass = cellularClass.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISmsMessageBase]
  }
}

