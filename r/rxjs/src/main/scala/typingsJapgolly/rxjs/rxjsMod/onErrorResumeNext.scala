package typingsJapgolly.rxjs.rxjsMod

import typingsJapgolly.rxjs.internalTypesMod.ObservableInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "onErrorResumeNext")
@js.native
object onErrorResumeNext extends js.Object {
  def apply[R](array: js.Array[ObservableInput[_]]): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[R](observables: (ObservableInput[_] | (js.Function1[/* repeated */ js.Any, R]))*): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[R](v: ObservableInput[R]): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[T2, T3, R](v2: ObservableInput[T2], v3: ObservableInput[T3]): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[T2, T3, T4, R](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[T2, T3, T4, T5, R](v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4], v5: ObservableInput[T5]): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
  def apply[T2, T3, T4, T5, T6, R](
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[R] = js.native
}

