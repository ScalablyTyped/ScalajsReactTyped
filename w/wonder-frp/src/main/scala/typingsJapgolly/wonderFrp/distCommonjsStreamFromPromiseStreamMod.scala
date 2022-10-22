package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.distCommonjsCoreSchedulerMod.Scheduler
import typingsJapgolly.wonderFrp.distCommonjsStreamBaseStreamMod.BaseStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsStreamFromPromiseStreamMod {
  
  @JSImport("wonder-frp/dist/commonjs/stream/FromPromiseStream", "FromPromiseStream")
  @js.native
  open class FromPromiseStream protected () extends BaseStream {
    def this(promise: Any, scheduler: Scheduler) = this()
    
    /* private */ var _promise: Any = js.native
  }
  /* static members */
  object FromPromiseStream {
    
    @JSImport("wonder-frp/dist/commonjs/stream/FromPromiseStream", "FromPromiseStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(promise: Any, scheduler: Scheduler): FromPromiseStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(promise.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[FromPromiseStream]
  }
}
