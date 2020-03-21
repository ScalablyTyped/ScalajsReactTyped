package typingsJapgolly.winrt.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Protection {
  type ComponentLoadFailedEventHandler = js.Function2[
    /* sender */ typingsJapgolly.winrt.Windows.Media.Protection.MediaProtectionManager, 
    /* e */ typingsJapgolly.winrt.Windows.Media.Protection.ComponentLoadFailedEventArgs, 
    scala.Unit
  ]
  type RebootNeededEventHandler = js.Function1[
    /* sender */ typingsJapgolly.winrt.Windows.Media.Protection.MediaProtectionManager, 
    scala.Unit
  ]
  type ServiceRequestedEventHandler = js.Function2[
    /* sender */ typingsJapgolly.winrt.Windows.Media.Protection.MediaProtectionManager, 
    /* e */ typingsJapgolly.winrt.Windows.Media.Protection.ServiceRequestedEventArgs, 
    scala.Unit
  ]
}
