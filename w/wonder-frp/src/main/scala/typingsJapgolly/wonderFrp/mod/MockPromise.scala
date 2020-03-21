package typingsJapgolly.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MockPromise")
@js.native
class MockPromise protected ()
  extends typingsJapgolly.wonderFrp.mockPromiseMod.MockPromise {
  def this(
    scheduler: typingsJapgolly.wonderFrp.testSchedulerMod.TestScheduler,
    messages: js.Array[typingsJapgolly.wonderFrp.recordMod.Record]
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MockPromise")
@js.native
object MockPromise extends js.Object {
  def create(
    scheduler: typingsJapgolly.wonderFrp.testSchedulerMod.TestScheduler,
    messages: js.Array[typingsJapgolly.wonderFrp.recordMod.Record]
  ): typingsJapgolly.wonderFrp.mockPromiseMod.MockPromise = js.native
}

