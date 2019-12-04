package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalTypesMod.ObservableInput
import typingsJapgolly.rxjs.internalTypesMod.OperatorFunction
import typingsJapgolly.rxjs.internalTypesMod.SchedulerLike
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/timeoutWith", JSImport.Namespace)
@js.native
object internalOperatorsTimeoutWithMod extends js.Object {
  def timeoutWith[T, R](due: Double, withObservable: ObservableInput[R]): OperatorFunction[T, T | R] = js.native
  def timeoutWith[T, R](due: Double, withObservable: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = js.native
  def timeoutWith[T, R](due: Date, withObservable: ObservableInput[R]): OperatorFunction[T, T | R] = js.native
  def timeoutWith[T, R](due: Date, withObservable: ObservableInput[R], scheduler: SchedulerLike): OperatorFunction[T, T | R] = js.native
}

