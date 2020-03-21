package typingsJapgolly.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "TimeoutStream")
@js.native
class TimeoutStream protected ()
  extends typingsJapgolly.wonderFrp.timeoutStreamMod.TimeoutStream {
  def this(time: Double, scheduler: typingsJapgolly.wonderFrp.schedulerMod.Scheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "TimeoutStream")
@js.native
object TimeoutStream extends js.Object {
  def create(time: Double, scheduler: typingsJapgolly.wonderFrp.schedulerMod.Scheduler): typingsJapgolly.wonderFrp.timeoutStreamMod.TimeoutStream = js.native
}

