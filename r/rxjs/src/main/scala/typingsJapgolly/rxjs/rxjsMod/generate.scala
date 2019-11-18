package typingsJapgolly.rxjs.rxjsMod

import typingsJapgolly.rxjs.internalObservableGenerateMod.ConditionFunc
import typingsJapgolly.rxjs.internalObservableGenerateMod.GenerateBaseOptions
import typingsJapgolly.rxjs.internalObservableGenerateMod.GenerateOptions
import typingsJapgolly.rxjs.internalObservableGenerateMod.IterateFunc
import typingsJapgolly.rxjs.internalObservableGenerateMod.ResultFunc
import typingsJapgolly.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "generate")
@js.native
object generate extends js.Object {
  def apply[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S]): typingsJapgolly.rxjs.internalObservableMod.Observable[S] = js.native
  def apply[S](initialState: S, condition: ConditionFunc[S], iterate: IterateFunc[S], scheduler: SchedulerLike): typingsJapgolly.rxjs.internalObservableMod.Observable[S] = js.native
  def apply[S](options: GenerateBaseOptions[S]): typingsJapgolly.rxjs.internalObservableMod.Observable[S] = js.native
  def apply[T, S](
    initialState: S,
    condition: ConditionFunc[S],
    iterate: IterateFunc[S],
    resultSelector: ResultFunc[S, T]
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T, S](
    initialState: S,
    condition: ConditionFunc[S],
    iterate: IterateFunc[S],
    resultSelector: ResultFunc[S, T],
    scheduler: SchedulerLike
  ): typingsJapgolly.rxjs.internalObservableMod.Observable[T] = js.native
  def apply[T, S](options: GenerateOptions[T, S]): typingsJapgolly.rxjs.internalObservableMod.Observable[T] = js.native
}

