package typingsJapgolly.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Collections {
  type MapChangedEventHandler[K, V] = js.Function2[
    /* sender */ typingsJapgolly.winrt.Windows.Foundation.Collections.IObservableMap[K, V], 
    /* event */ typingsJapgolly.winrt.Windows.Foundation.Collections.IMapChangedEventArgs[K], 
    scala.Unit
  ]
  type VectorChangedEventHandler[T] = js.Function2[
    /* sender */ typingsJapgolly.winrt.Windows.Foundation.Collections.IObservableVector[T], 
    /* event */ typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorChangedEventArgs, 
    scala.Unit
  ]
}
