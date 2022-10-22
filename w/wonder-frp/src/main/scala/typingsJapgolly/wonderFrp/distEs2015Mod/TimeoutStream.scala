package typingsJapgolly.wonderFrp.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "TimeoutStream")
@js.native
open class TimeoutStream protected ()
  extends typingsJapgolly.wonderFrp.distEs2015StreamTimeoutStreamMod.TimeoutStream {
  def this(time: Double, scheduler: typingsJapgolly.wonderFrp.distEs2015CoreSchedulerMod.Scheduler) = this()
}
/* static members */
object TimeoutStream {
  
  @JSImport("wonder-frp/dist/es2015", "TimeoutStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(time: Double, scheduler: typingsJapgolly.wonderFrp.distEs2015CoreSchedulerMod.Scheduler): typingsJapgolly.wonderFrp.distEs2015StreamTimeoutStreamMod.TimeoutStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distEs2015StreamTimeoutStreamMod.TimeoutStream]
}
