package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.distCommonjsCoreSchedulerMod.Scheduler
import typingsJapgolly.wonderFrp.distCommonjsStreamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsStreamTimeoutStreamMod {
  
  @JSImport("wonder-frp/dist/commonjs/stream/TimeoutStream", "TimeoutStream")
  @js.native
  open class TimeoutStream protected () extends BaseStream {
    def this(time: Double, scheduler: Scheduler) = this()
    
    /* private */ var _time: Any = js.native
  }
  /* static members */
  object TimeoutStream {
    
    @JSImport("wonder-frp/dist/commonjs/stream/TimeoutStream", "TimeoutStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(time: Double, scheduler: Scheduler): TimeoutStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[TimeoutStream]
  }
}
