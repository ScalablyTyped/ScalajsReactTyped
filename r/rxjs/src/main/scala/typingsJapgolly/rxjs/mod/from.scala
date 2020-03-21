package typingsJapgolly.rxjs.mod

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.ObservableInput
import typingsJapgolly.rxjs.typesMod.ObservedValueOf
import typingsJapgolly.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "from")
@js.native
object from extends js.Object {
  def apply[O /* <: ObservableInput[_] */](input: O): Observable[ObservedValueOf[O]] = js.native
  def apply[O /* <: ObservableInput[_] */](input: O, scheduler: SchedulerLike): Observable[ObservedValueOf[O]] = js.native
}

