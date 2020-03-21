package typingsJapgolly.winrt.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Proximity {
  type DeviceArrivedEventHandler = js.Function1[
    /* sender */ typingsJapgolly.winrt.Windows.Networking.Proximity.ProximityDevice, 
    scala.Unit
  ]
  type DeviceDepartedEventHandler = js.Function1[
    /* sender */ typingsJapgolly.winrt.Windows.Networking.Proximity.ProximityDevice, 
    scala.Unit
  ]
  type MessageReceivedHandler = js.Function2[
    /* sender */ typingsJapgolly.winrt.Windows.Networking.Proximity.ProximityDevice, 
    /* message */ typingsJapgolly.winrt.Windows.Networking.Proximity.ProximityMessage, 
    scala.Unit
  ]
  type MessageTransmittedHandler = js.Function2[
    /* sender */ typingsJapgolly.winrt.Windows.Networking.Proximity.ProximityDevice, 
    /* messageId */ scala.Double, 
    scala.Unit
  ]
}
