package typingsJapgolly.winrtUwp.Windows.Devices.WiFiDirect

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiDirectConfigurationMethod extends js.Object

/** Specifies a Wi-Fi Direct configuration method. Configuration is how a user tells one piece of Wi-Fi Direct equipment to connect to another piece of Wi-Fi Direct equipment. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod")
@js.native
object WiFiDirectConfigurationMethod extends js.Object {
  /** This device accepts connections from devices that provide the PIN this device currently displays. */
  @js.native
  sealed trait displayPin extends WiFiDirectConfigurationMethod
  
  /** This device accepts entry of the PIN being displayed on the accepting device. */
  @js.native
  sealed trait providePin extends WiFiDirectConfigurationMethod
  
  /** This device uses the pushbutton method for pairing. A user pushes a button on both the connecting device and the accepting device in order to establish a connection between them. */
  @js.native
  sealed trait pushButton extends WiFiDirectConfigurationMethod
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectConfigurationMethod with Double] = js.native
  /* 1 */ @js.native
  object displayPin extends TopLevel[displayPin with Double]
  
  /* 0 */ @js.native
  object providePin extends TopLevel[providePin with Double]
  
  /* 2 */ @js.native
  object pushButton extends TopLevel[pushButton with Double]
  
}

