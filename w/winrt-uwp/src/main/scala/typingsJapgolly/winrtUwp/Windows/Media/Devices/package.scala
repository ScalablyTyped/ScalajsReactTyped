package typingsJapgolly.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Devices {
  /** Handles the AnswerRequested and AudioTransferRequested events. */
  type CallControlEventHandler = js.Function1[
    /* ev */ typingsJapgolly.winrtUwp.Windows.WinRTEvent[typingsJapgolly.winrtUwp.Windows.Media.Devices.CallControl], 
    scala.Unit
  ]
  /** Handles the DialRequested event. */
  type DialRequestedEventHandler = js.Function1[
    /* ev */ typingsJapgolly.winrtUwp.Windows.Media.Devices.DialRequestedEventArgs with typingsJapgolly.winrtUwp.Windows.WinRTEvent[typingsJapgolly.winrtUwp.Windows.Media.Devices.CallControl], 
    scala.Unit
  ]
  /** Handles the KeypadPressed event. */
  type KeypadPressedEventHandler = js.Function1[
    /* ev */ typingsJapgolly.winrtUwp.Windows.Media.Devices.KeypadPressedEventArgs with typingsJapgolly.winrtUwp.Windows.WinRTEvent[typingsJapgolly.winrtUwp.Windows.Media.Devices.CallControl], 
    scala.Unit
  ]
  /** Handles the RedialRequested event. */
  type RedialRequestedEventHandler = js.Function1[
    /* ev */ typingsJapgolly.winrtUwp.Windows.Media.Devices.RedialRequestedEventArgs with typingsJapgolly.winrtUwp.Windows.WinRTEvent[typingsJapgolly.winrtUwp.Windows.Media.Devices.CallControl], 
    scala.Unit
  ]
}
