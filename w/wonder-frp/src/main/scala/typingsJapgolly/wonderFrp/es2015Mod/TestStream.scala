package typingsJapgolly.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "TestStream")
@js.native
class TestStream protected ()
  extends typingsJapgolly.wonderFrp.testingTestStreamMod.TestStream {
  def this(
    messages: js.Array[typingsJapgolly.wonderFrp.testingRecordMod.Record],
    scheduler: typingsJapgolly.wonderFrp.testingTestSchedulerMod.TestScheduler
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "TestStream")
@js.native
object TestStream extends js.Object {
  def create(
    messages: js.Array[typingsJapgolly.wonderFrp.testingRecordMod.Record],
    scheduler: typingsJapgolly.wonderFrp.testingTestSchedulerMod.TestScheduler
  ): typingsJapgolly.wonderFrp.testingTestStreamMod.TestStream = js.native
}

