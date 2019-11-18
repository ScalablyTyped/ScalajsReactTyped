package typingsJapgolly.mobx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libApiFlowMod {
  import typingsJapgolly.mobx.Anon_Cancel
  import typingsJapgolly.std.Exclude

  type CancellablePromise[T] = js.Promise[T] with Anon_Cancel
  type FlowReturnType[R] = IfAllAreFlowYieldThenVoid[R | FlowYield | js.Any]
  type IfAllAreFlowYieldThenVoid[R] = (Exclude[R, FlowYield]) | Unit
}
