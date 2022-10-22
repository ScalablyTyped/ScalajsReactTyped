package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalTypesMod.OperatorFunction
import typingsJapgolly.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsTimeIntervalMod {
  
  @JSImport("rxjs/internal/operators/timeInterval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/operators/timeInterval", "TimeInterval")
  @js.native
  open class TimeInterval_[T] protected ()
    extends typingsJapgolly.rxjs.distTypesInternalOperatorsTimeIntervalMod.TimeInterval_[T] {
    /**
      * @deprecated Internal implementation detail, do not construct directly. Will be made an interface in v8.
      */
    def this(value: T, interval: Double) = this()
  }
  
  inline def timeInterval[T](): OperatorFunction[T, typingsJapgolly.rxjs.distTypesInternalOperatorsTimeIntervalMod.TimeInterval_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")().asInstanceOf[OperatorFunction[T, typingsJapgolly.rxjs.distTypesInternalOperatorsTimeIntervalMod.TimeInterval_[T]]]
  inline def timeInterval[T](scheduler: SchedulerLike): OperatorFunction[T, typingsJapgolly.rxjs.distTypesInternalOperatorsTimeIntervalMod.TimeInterval_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")(scheduler.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, typingsJapgolly.rxjs.distTypesInternalOperatorsTimeIntervalMod.TimeInterval_[T]]]
}
