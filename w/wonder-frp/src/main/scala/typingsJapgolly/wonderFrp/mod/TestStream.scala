package typingsJapgolly.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "TestStream")
@js.native
class TestStream protected ()
  extends typingsJapgolly.wonderFrp.testStreamMod.TestStream {
  def this(
    messages: js.Array[typingsJapgolly.wonderFrp.recordMod.Record],
    scheduler: typingsJapgolly.wonderFrp.testSchedulerMod.TestScheduler
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "TestStream")
@js.native
object TestStream extends js.Object {
  def create(
    messages: js.Array[typingsJapgolly.wonderFrp.recordMod.Record],
    scheduler: typingsJapgolly.wonderFrp.testSchedulerMod.TestScheduler
  ): typingsJapgolly.wonderFrp.testStreamMod.TestStream = js.native
}

