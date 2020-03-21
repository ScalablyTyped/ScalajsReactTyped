package typingsJapgolly.winrtUwp.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Proximity {
  /** Describes the method that handles the DeviceArrived event. */
  type DeviceArrivedEventHandler = js.Function1[
    /* ev */ typingsJapgolly.winrtUwp.Windows.WinRTEvent[typingsJapgolly.winrtUwp.Windows.Networking.Proximity.ProximityDevice], 
    scala.Unit
  ]
  /** Describes the method that handles the DeviceDeparted event. */
  type DeviceDepartedEventHandler = js.Function1[
    /* ev */ typingsJapgolly.winrtUwp.Windows.WinRTEvent[typingsJapgolly.winrtUwp.Windows.Networking.Proximity.ProximityDevice], 
    scala.Unit
  ]
  /** Describes the method that will handle the event that's fired when a message that has been subscribed to has been received. */
  type MessageReceivedHandler = js.Function2[
    /* sender */ typingsJapgolly.winrtUwp.Windows.Networking.Proximity.ProximityDevice, 
    /* message */ typingsJapgolly.winrtUwp.Windows.Networking.Proximity.ProximityMessage, 
    scala.Unit
  ]
  /** Describes the method that will handle the event that's fired when a published message has been transmitted. */
  type MessageTransmittedHandler = js.Function2[
    /* sender */ typingsJapgolly.winrtUwp.Windows.Networking.Proximity.ProximityDevice, 
    /* messageId */ scala.Double, 
    scala.Unit
  ]
}
