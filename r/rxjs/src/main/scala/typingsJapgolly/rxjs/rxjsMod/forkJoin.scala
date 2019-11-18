package typingsJapgolly.rxjs.rxjsMod

import typingsJapgolly.rxjs.internalTypesMod.ObservableInput
import typingsJapgolly.rxjs.internalTypesMod.ObservedValuesFromArray
import typingsJapgolly.rxjs.internalTypesMod.SubscribableOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "forkJoin")
@js.native
object forkJoin extends js.Object {
  def apply(args: (ObservableInput[_] | js.Function)*): typingsJapgolly.rxjs.internalObservableMod.Observable[_] = js.native
  def apply(sourcesObject: js.Object): typingsJapgolly.rxjs.internalObservableMod.Observable[scala.Nothing] = js.native
  def apply[A /* <: js.Array[ObservableInput[_]] */](sources: A): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Array[ObservedValuesFromArray[A]]] = js.native
  def apply[A](sources: js.Array[ObservableInput[A]]): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Array[A]] = js.native
  def apply[T](v1: SubscribableOrPromise[T]): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Array[T]] = js.native
  def apply[A, B](sources: js.Tuple2[ObservableInput[A], ObservableInput[B]]): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Tuple2[A, B]] = js.native
  def apply[T, T2](v1: ObservableInput[T], v2: ObservableInput[T2]): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Tuple2[T, T2]] = js.native
  def apply[A, B, C](sources: js.Tuple3[ObservableInput[A], ObservableInput[B], ObservableInput[C]]): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Tuple3[A, B, C]] = js.native
  def apply[T, T2, T3](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3]): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Tuple3[T, T2, T3]] = js.native
  def apply[A, B, C, D](sources: js.Tuple4[ObservableInput[A], ObservableInput[B], ObservableInput[C], ObservableInput[D]]): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Tuple4[A, B, C, D]] = js.native
  def apply[T, T2, T3, T4](v1: ObservableInput[T], v2: ObservableInput[T2], v3: ObservableInput[T3], v4: ObservableInput[T4]): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Tuple4[T, T2, T3, T4]] = js.native
  def apply[A, B, C, D, E](
    sources: js.Tuple5[
      ObservableInput[A], 
      ObservableInput[B], 
      ObservableInput[C], 
      ObservableInput[D], 
      ObservableInput[E]
    ]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Tuple5[A, B, C, D, E]] = js.native
  def apply[T, T2, T3, T4, T5](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Tuple5[T, T2, T3, T4, T5]] = js.native
  def apply[A, B, C, D, E, F](
    sources: js.Tuple6[
      ObservableInput[A], 
      ObservableInput[B], 
      ObservableInput[C], 
      ObservableInput[D], 
      ObservableInput[E], 
      ObservableInput[F]
    ]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Tuple6[A, B, C, D, E, F]] = js.native
  def apply[T, T2, T3, T4, T5, T6](
    v1: ObservableInput[T],
    v2: ObservableInput[T2],
    v3: ObservableInput[T3],
    v4: ObservableInput[T4],
    v5: ObservableInput[T5],
    v6: ObservableInput[T6]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[js.Tuple6[T, T2, T3, T4, T5, T6]] = js.native
}

