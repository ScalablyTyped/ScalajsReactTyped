package typingsJapgolly.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "IntervalStream")
@js.native
open class IntervalStream protected ()
  extends typingsJapgolly.wonderFrp.distCommonjsStreamIntervalStreamMod.IntervalStream {
  def this(interval: Double, scheduler: typingsJapgolly.wonderFrp.distCommonjsCoreSchedulerMod.Scheduler) = this()
}
/* static members */
object IntervalStream {
  
  @JSImport("wonder-frp/dist/commonjs", "IntervalStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(interval: Double, scheduler: typingsJapgolly.wonderFrp.distCommonjsCoreSchedulerMod.Scheduler): typingsJapgolly.wonderFrp.distCommonjsStreamIntervalStreamMod.IntervalStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(interval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsStreamIntervalStreamMod.IntervalStream]
}
