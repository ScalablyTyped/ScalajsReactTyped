package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.distEs2015CoreSchedulerMod.Scheduler
import typingsJapgolly.wonderFrp.distEs2015StreamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015StreamIntervalStreamMod {
  
  @JSImport("wonder-frp/dist/es2015/stream/IntervalStream", "IntervalStream")
  @js.native
  open class IntervalStream protected () extends BaseStream {
    def this(interval: Double, scheduler: Scheduler) = this()
    
    /* private */ var _interval: Any = js.native
    
    def initWhenCreate(): Unit = js.native
  }
  /* static members */
  object IntervalStream {
    
    @JSImport("wonder-frp/dist/es2015/stream/IntervalStream", "IntervalStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(interval: Double, scheduler: Scheduler): IntervalStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(interval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[IntervalStream]
  }
}
