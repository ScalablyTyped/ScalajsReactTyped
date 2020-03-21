package typingsJapgolly.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MockObserver")
@js.native
class MockObserver protected ()
  extends typingsJapgolly.wonderFrp.mockObserverMod.MockObserver {
  def this(scheduler: typingsJapgolly.wonderFrp.testSchedulerMod.TestScheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MockObserver")
@js.native
object MockObserver extends js.Object {
  def create(scheduler: typingsJapgolly.wonderFrp.testSchedulerMod.TestScheduler): typingsJapgolly.wonderFrp.mockObserverMod.MockObserver = js.native
}

