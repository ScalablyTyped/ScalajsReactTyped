package typingsJapgolly.rxjs.mod

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.ObservableInput
import typingsJapgolly.rxjs.typesMod.ObservedValueOf
import typingsJapgolly.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "concat")
@js.native
object concat extends js.Object {
  def apply[O /* <: ObservableInput[_] */](observables: (O | SchedulerLike)*): Observable[ObservedValueOf[O]] = js.native
  def apply[O1 /* <: ObservableInput[_] */](v1: O1): Observable[ObservedValueOf[O1]] = js.native
  def apply[O1 /* <: ObservableInput[_] */](v1: O1, scheduler: SchedulerLike): Observable[ObservedValueOf[O1]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](v1: O1, v2: O2): Observable[ObservedValueOf[O1 | O2]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */](v1: O1, v2: O2, scheduler: SchedulerLike): Observable[ObservedValueOf[O1 | O2]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3): Observable[ObservedValueOf[O1 | O2 | O3]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, scheduler: SchedulerLike): Observable[ObservedValueOf[O1 | O2 | O3]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4): Observable[ObservedValueOf[O1 | O2 | O3 | O4]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, scheduler: SchedulerLike): Observable[ObservedValueOf[O1 | O2 | O3 | O4]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5): Observable[ObservedValueOf[O1 | O2 | O3 | O4 | O5]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, scheduler: SchedulerLike): Observable[ObservedValueOf[O1 | O2 | O3 | O4 | O5]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6): Observable[ObservedValueOf[O1 | O2 | O3 | O4 | O5 | O6]] = js.native
  def apply[O1 /* <: ObservableInput[_] */, O2 /* <: ObservableInput[_] */, O3 /* <: ObservableInput[_] */, O4 /* <: ObservableInput[_] */, O5 /* <: ObservableInput[_] */, O6 /* <: ObservableInput[_] */](v1: O1, v2: O2, v3: O3, v4: O4, v5: O5, v6: O6, scheduler: SchedulerLike): Observable[ObservedValueOf[O1 | O2 | O3 | O4 | O5 | O6]] = js.native
}

