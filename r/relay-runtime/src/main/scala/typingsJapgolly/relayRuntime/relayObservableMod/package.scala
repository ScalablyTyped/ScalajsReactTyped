package typingsJapgolly.relayRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayObservableMod {
  type ObservableFromValue[T] = typingsJapgolly.relayRuntime.relayObservableMod.Subscribable[T] | js.Promise[T] | T
  type Source[T] = js.Function1[
    /* sink */ typingsJapgolly.relayRuntime.relayObservableMod.Sink[T], 
    scala.Unit | typingsJapgolly.relayRuntime.relayObservableMod.Subscription | js.Function0[js.Any]
  ]
}
