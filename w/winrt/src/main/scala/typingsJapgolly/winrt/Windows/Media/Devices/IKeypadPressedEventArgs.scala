package typingsJapgolly.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeypadPressedEventArgs extends js.Object {
  var telephonyKey: TelephonyKey
}

object IKeypadPressedEventArgs {
  @scala.inline
  def apply(telephonyKey: TelephonyKey): IKeypadPressedEventArgs = {
    val __obj = js.Dynamic.literal(telephonyKey = telephonyKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IKeypadPressedEventArgs]
  }
}

