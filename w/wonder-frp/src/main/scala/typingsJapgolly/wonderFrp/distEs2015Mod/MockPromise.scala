package typingsJapgolly.wonderFrp.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "MockPromise")
@js.native
open class MockPromise protected ()
  extends typingsJapgolly.wonderFrp.distEs2015TestingMockPromiseMod.MockPromise {
  def this(
    scheduler: typingsJapgolly.wonderFrp.distEs2015TestingTestSchedulerMod.TestScheduler,
    messages: js.Array[typingsJapgolly.wonderFrp.distEs2015TestingRecordMod.Record]
  ) = this()
}
/* static members */
object MockPromise {
  
  @JSImport("wonder-frp/dist/es2015", "MockPromise")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    scheduler: typingsJapgolly.wonderFrp.distEs2015TestingTestSchedulerMod.TestScheduler,
    messages: js.Array[typingsJapgolly.wonderFrp.distEs2015TestingRecordMod.Record]
  ): typingsJapgolly.wonderFrp.distEs2015TestingMockPromiseMod.MockPromise = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(scheduler.asInstanceOf[js.Any], messages.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distEs2015TestingMockPromiseMod.MockPromise]
}
