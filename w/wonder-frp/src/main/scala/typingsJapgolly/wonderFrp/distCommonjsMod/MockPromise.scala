package typingsJapgolly.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "MockPromise")
@js.native
open class MockPromise protected ()
  extends typingsJapgolly.wonderFrp.distCommonjsTestingMockPromiseMod.MockPromise {
  def this(
    scheduler: typingsJapgolly.wonderFrp.distCommonjsTestingTestSchedulerMod.TestScheduler,
    messages: js.Array[typingsJapgolly.wonderFrp.distCommonjsTestingRecordMod.Record]
  ) = this()
}
/* static members */
object MockPromise {
  
  @JSImport("wonder-frp/dist/commonjs", "MockPromise")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    scheduler: typingsJapgolly.wonderFrp.distCommonjsTestingTestSchedulerMod.TestScheduler,
    messages: js.Array[typingsJapgolly.wonderFrp.distCommonjsTestingRecordMod.Record]
  ): typingsJapgolly.wonderFrp.distCommonjsTestingMockPromiseMod.MockPromise = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(scheduler.asInstanceOf[js.Any], messages.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsTestingMockPromiseMod.MockPromise]
}
