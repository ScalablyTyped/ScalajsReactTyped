package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typingsJapgolly.rxjs.internalTypesMod.ObservableInput
import typingsJapgolly.rxjs.internalTypesMod.ObservedValueOf
import typingsJapgolly.rxjs.internalTypesMod.OperatorFunction
import typingsJapgolly.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/publishReplay", JSImport.Namespace)
@js.native
object internalOperatorsPublishReplayMod extends js.Object {
  def publishReplay[T](): MonoTypeOperatorFunction[T] = js.native
  def publishReplay[T](bufferSize: Double): MonoTypeOperatorFunction[T] = js.native
  def publishReplay[T](bufferSize: Double, windowTime: Double): MonoTypeOperatorFunction[T] = js.native
  def publishReplay[T](bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def publishReplay[T, O /* <: ObservableInput[_] */](bufferSize: Double, windowTime: Double, selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = js.native
  def publishReplay[T, O /* <: ObservableInput[_] */](
    bufferSize: Double,
    windowTime: Double,
    selector: js.Function1[/* shared */ Observable[T], O],
    scheduler: SchedulerLike
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSName("publishReplay")
  def publishReplay_TO_ObservableInputWildcard_OperatorFunction[T, O /* <: ObservableInput[_] */](): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSName("publishReplay")
  def publishReplay_TO_ObservableInputWildcard_OperatorFunction[T, O /* <: ObservableInput[_] */](bufferSize: Double): OperatorFunction[T, ObservedValueOf[O]] = js.native
  @JSName("publishReplay")
  def publishReplay_TO_ObservableInputWildcard_OperatorFunction[T, O /* <: ObservableInput[_] */](bufferSize: Double, windowTime: Double): OperatorFunction[T, ObservedValueOf[O]] = js.native
}

