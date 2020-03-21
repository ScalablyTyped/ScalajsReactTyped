package typingsJapgolly.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "MockObserver")
@js.native
class MockObserver protected ()
  extends typingsJapgolly.wonderFrp.testingMockObserverMod.MockObserver {
  def this(scheduler: typingsJapgolly.wonderFrp.testingTestSchedulerMod.TestScheduler) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "MockObserver")
@js.native
object MockObserver extends js.Object {
  def create(scheduler: typingsJapgolly.wonderFrp.testingTestSchedulerMod.TestScheduler): typingsJapgolly.wonderFrp.testingMockObserverMod.MockObserver = js.native
}

