package typingsJapgolly.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Protection {
  /** Represents the method that handles the data passed by the MediaProtectionManager when a load of binary data fails. */
  type ComponentLoadFailedEventHandler = js.Function1[
    /* ev */ typingsJapgolly.winrtUwp.Windows.Media.Protection.ComponentLoadFailedEventArgs with typingsJapgolly.winrtUwp.Windows.WinRTEvent[typingsJapgolly.winrtUwp.Windows.Media.Protection.MediaProtectionManager], 
    scala.Unit
  ]
  /** Represents the method that handles the data passed by the MediaProtectionManager that requires a reboot. */
  type RebootNeededEventHandler = js.Function1[
    /* ev */ typingsJapgolly.winrtUwp.Windows.WinRTEvent[typingsJapgolly.winrtUwp.Windows.Media.Protection.MediaProtectionManager], 
    scala.Unit
  ]
  /** Represents the method that handles the data passed by the MediaProtectionManager when the resume operation is completed. */
  type ServiceRequestedEventHandler = js.Function1[
    /* ev */ typingsJapgolly.winrtUwp.Windows.Media.Protection.ServiceRequestedEventArgs with typingsJapgolly.winrtUwp.Windows.WinRTEvent[typingsJapgolly.winrtUwp.Windows.Media.Protection.MediaProtectionManager], 
    scala.Unit
  ]
}
