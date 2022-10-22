package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalSubscriptionMod.Subscription
import typingsJapgolly.rxjs.distTypesInternalTypesMod.SchedulerLike
import typingsJapgolly.rxjs.rxjsBooleans.`false`
import typingsJapgolly.rxjs.rxjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalUtilExecuteScheduleMod {
  
  @JSImport("rxjs/dist/types/internal/util/executeSchedule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def executeSchedule(parentSubscription: Subscription, scheduler: SchedulerLike, work: js.Function0[Unit]): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("executeSchedule")(parentSubscription.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], work.asInstanceOf[js.Any])).asInstanceOf[Subscription]
  inline def executeSchedule(
    parentSubscription: Subscription,
    scheduler: SchedulerLike,
    work: js.Function0[Unit],
    delay: Double
  ): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("executeSchedule")(parentSubscription.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], work.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Subscription]
  
  inline def executeSchedule_false(
    parentSubscription: Subscription,
    scheduler: SchedulerLike,
    work: js.Function0[Unit],
    delay: Double,
    repeat: `false`
  ): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("executeSchedule")(parentSubscription.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], work.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], repeat.asInstanceOf[js.Any])).asInstanceOf[Subscription]
  inline def executeSchedule_false(
    parentSubscription: Subscription,
    scheduler: SchedulerLike,
    work: js.Function0[Unit],
    delay: Unit,
    repeat: `false`
  ): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("executeSchedule")(parentSubscription.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], work.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], repeat.asInstanceOf[js.Any])).asInstanceOf[Subscription]
  
  inline def executeSchedule_true(
    parentSubscription: Subscription,
    scheduler: SchedulerLike,
    work: js.Function0[Unit],
    delay: Double,
    repeat: `true`
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("executeSchedule")(parentSubscription.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], work.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], repeat.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
