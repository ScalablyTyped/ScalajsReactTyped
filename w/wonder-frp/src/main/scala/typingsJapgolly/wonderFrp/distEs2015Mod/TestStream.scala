package typingsJapgolly.wonderFrp.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "TestStream")
@js.native
open class TestStream protected ()
  extends typingsJapgolly.wonderFrp.distEs2015TestingTestStreamMod.TestStream {
  def this(
    messages: js.Array[typingsJapgolly.wonderFrp.distEs2015TestingRecordMod.Record],
    scheduler: typingsJapgolly.wonderFrp.distEs2015TestingTestSchedulerMod.TestScheduler
  ) = this()
}
/* static members */
object TestStream {
  
  @JSImport("wonder-frp/dist/es2015", "TestStream")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    messages: js.Array[typingsJapgolly.wonderFrp.distEs2015TestingRecordMod.Record],
    scheduler: typingsJapgolly.wonderFrp.distEs2015TestingTestSchedulerMod.TestScheduler
  ): typingsJapgolly.wonderFrp.distEs2015TestingTestStreamMod.TestStream = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(messages.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distEs2015TestingTestStreamMod.TestStream]
}
