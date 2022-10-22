package typingsJapgolly.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "TimeoutStream")
@js.native
open class TimeoutStream protected ()
  extends typingsJapgolly.wonderFrp.distCommonjsStreamTimeoutStreamMod.TimeoutStream {
  def this(time: Double, scheduler: typingsJapgolly.wonderFrp.distCommonjsCoreSchedulerMod.Scheduler) = this()
}
/* static members */
object TimeoutStream {
  
  @JSImport("wonder-frp/dist/commonjs", "TimeoutStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(time: Double, scheduler: typingsJapgolly.wonderFrp.distCommonjsCoreSchedulerMod.Scheduler): typingsJapgolly.wonderFrp.distCommonjsStreamTimeoutStreamMod.TimeoutStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsStreamTimeoutStreamMod.TimeoutStream]
}
