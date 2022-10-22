package typingsJapgolly.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "TestStream")
@js.native
open class TestStream protected ()
  extends typingsJapgolly.wonderFrp.distCommonjsTestingTestStreamMod.TestStream {
  def this(
    messages: js.Array[typingsJapgolly.wonderFrp.distCommonjsTestingRecordMod.Record],
    scheduler: typingsJapgolly.wonderFrp.distCommonjsTestingTestSchedulerMod.TestScheduler
  ) = this()
}
/* static members */
object TestStream {
  
  @JSImport("wonder-frp/dist/commonjs", "TestStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    messages: js.Array[typingsJapgolly.wonderFrp.distCommonjsTestingRecordMod.Record],
    scheduler: typingsJapgolly.wonderFrp.distCommonjsTestingTestSchedulerMod.TestScheduler
  ): typingsJapgolly.wonderFrp.distCommonjsTestingTestStreamMod.TestStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(messages.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsTestingTestStreamMod.TestStream]
}
