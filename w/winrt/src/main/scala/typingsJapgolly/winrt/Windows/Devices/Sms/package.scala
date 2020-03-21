package typingsJapgolly.winrt.Windows.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Sms {
  type SmsDeviceStatusChangedEventHandler = js.Function1[/* sender */ typingsJapgolly.winrt.Windows.Devices.Sms.SmsDevice, scala.Unit]
  type SmsMessageReceivedEventHandler = js.Function2[
    /* sender */ typingsJapgolly.winrt.Windows.Devices.Sms.SmsDevice, 
    /* e */ typingsJapgolly.winrt.Windows.Devices.Sms.SmsMessageReceivedEventArgs, 
    scala.Unit
  ]
}
