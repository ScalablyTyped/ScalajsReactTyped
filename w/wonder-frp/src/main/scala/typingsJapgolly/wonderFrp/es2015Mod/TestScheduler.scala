package typingsJapgolly.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "TestScheduler")
@js.native
class TestScheduler protected ()
  extends typingsJapgolly.wonderFrp.testingTestSchedulerMod.TestScheduler {
  def this(isReset: Boolean) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "TestScheduler")
@js.native
object TestScheduler extends js.Object {
  def completed(tick: js.Any): typingsJapgolly.wonderFrp.testingRecordMod.Record = js.native
  def create(): typingsJapgolly.wonderFrp.testingTestSchedulerMod.TestScheduler = js.native
  def create(isReset: Boolean): typingsJapgolly.wonderFrp.testingTestSchedulerMod.TestScheduler = js.native
  def error(tick: js.Any, error: js.Any): typingsJapgolly.wonderFrp.testingRecordMod.Record = js.native
  def next(tick: js.Any, value: js.Any): typingsJapgolly.wonderFrp.testingRecordMod.Record = js.native
}

