package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalOperatorsTimestampMod.Timestamp
import typingsJapgolly.rxjs.internalTypesMod.OperatorFunction
import typingsJapgolly.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/timestamp", JSImport.Namespace)
@js.native
object internalOperatorsTimestampMod extends js.Object {
  @js.native
  class Timestamp[T] protected ()
    extends typingsJapgolly.rxjs.internalTypesMod.Timestamp[T] {
    def this(value: T, timestamp: Double) = this()
    /* CompleteClass */
    override var timestamp: Double = js.native
    /* CompleteClass */
    override var value: T = js.native
  }
  
  def timestamp[T](): OperatorFunction[T, Timestamp[T]] = js.native
  def timestamp[T](scheduler: SchedulerLike): OperatorFunction[T, Timestamp[T]] = js.native
}

