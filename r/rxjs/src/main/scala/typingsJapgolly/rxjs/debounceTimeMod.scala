package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.typesMod.MonoTypeOperatorFunction
import typingsJapgolly.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/debounceTime", JSImport.Namespace)
@js.native
object debounceTimeMod extends js.Object {
  def debounceTime[T](dueTime: Double): MonoTypeOperatorFunction[T] = js.native
  def debounceTime[T](dueTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
}

