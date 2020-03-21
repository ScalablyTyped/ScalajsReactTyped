package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.coreSchedulerMod.Scheduler
import typingsJapgolly.wonderFrp.streamBaseStreamMod.BaseStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/FromPromiseStream", JSImport.Namespace)
@js.native
object streamFromPromiseStreamMod extends js.Object {
  @js.native
  class FromPromiseStream protected () extends BaseStream {
    def this(promise: js.Any, scheduler: Scheduler) = this()
    var _promise: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object FromPromiseStream extends js.Object {
    def create(promise: js.Any, scheduler: Scheduler): FromPromiseStream = js.native
  }
  
}

