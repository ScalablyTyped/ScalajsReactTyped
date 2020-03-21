package typingsJapgolly.winrt.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Devices {
  type CallControlEventHandler = js.Function1[/* sender */ typingsJapgolly.winrt.Windows.Media.Devices.CallControl, scala.Unit]
  type DialRequestedEventHandler = js.Function2[
    /* sender */ typingsJapgolly.winrt.Windows.Media.Devices.CallControl, 
    /* e */ typingsJapgolly.winrt.Windows.Media.Devices.DialRequestedEventArgs, 
    scala.Unit
  ]
  type KeypadPressedEventHandler = js.Function2[
    /* sender */ typingsJapgolly.winrt.Windows.Media.Devices.CallControl, 
    /* e */ typingsJapgolly.winrt.Windows.Media.Devices.KeypadPressedEventArgs, 
    scala.Unit
  ]
  type RedialRequestedEventHandler = js.Function2[
    /* sender */ typingsJapgolly.winrt.Windows.Media.Devices.CallControl, 
    /* e */ typingsJapgolly.winrt.Windows.Media.Devices.RedialRequestedEventArgs, 
    scala.Unit
  ]
}
