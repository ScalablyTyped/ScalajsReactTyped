package typingsJapgolly.winrtUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Collections {
  /** Represents the method that handles the changed event of an observable map. */
  type MapChangedEventHandler[K, V] = js.Function1[
    /* ev */ typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IMapChangedEventArgs[K] with (typingsJapgolly.winrtUwp.Windows.WinRTEvent[typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IObservableMap[K, V]]), 
    scala.Unit
  ]
}
