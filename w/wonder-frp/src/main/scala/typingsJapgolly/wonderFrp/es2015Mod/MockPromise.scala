package typingsJapgolly.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "MockPromise")
@js.native
class MockPromise protected ()
  extends typingsJapgolly.wonderFrp.testingMockPromiseMod.MockPromise {
  def this(
    scheduler: typingsJapgolly.wonderFrp.testingTestSchedulerMod.TestScheduler,
    messages: js.Array[typingsJapgolly.wonderFrp.testingRecordMod.Record]
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "MockPromise")
@js.native
object MockPromise extends js.Object {
  def create(
    scheduler: typingsJapgolly.wonderFrp.testingTestSchedulerMod.TestScheduler,
    messages: js.Array[typingsJapgolly.wonderFrp.testingRecordMod.Record]
  ): typingsJapgolly.wonderFrp.testingMockPromiseMod.MockPromise = js.native
}

