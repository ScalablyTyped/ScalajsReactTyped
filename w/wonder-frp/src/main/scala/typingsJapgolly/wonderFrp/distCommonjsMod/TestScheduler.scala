package typingsJapgolly.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "TestScheduler")
@js.native
open class TestScheduler protected ()
  extends typingsJapgolly.wonderFrp.distCommonjsTestingTestSchedulerMod.TestScheduler {
  def this(isReset: Boolean) = this()
}
/* static members */
object TestScheduler {
  
  @JSImport("wonder-frp/dist/commonjs", "TestScheduler")
  @js.native
  val ^ : js.Any = js.native
  
  inline def completed(tick: Any): typingsJapgolly.wonderFrp.distCommonjsTestingRecordMod.Record = ^.asInstanceOf[js.Dynamic].applyDynamic("completed")(tick.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsTestingRecordMod.Record]
  
  inline def create(): typingsJapgolly.wonderFrp.distCommonjsTestingTestSchedulerMod.TestScheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsTestingTestSchedulerMod.TestScheduler]
  inline def create(isReset: Boolean): typingsJapgolly.wonderFrp.distCommonjsTestingTestSchedulerMod.TestScheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(isReset.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsTestingTestSchedulerMod.TestScheduler]
  
  inline def error(tick: Any, error: Any): typingsJapgolly.wonderFrp.distCommonjsTestingRecordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(tick.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsTestingRecordMod.Record]
  
  inline def next(tick: Any, value: Any): typingsJapgolly.wonderFrp.distCommonjsTestingRecordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("next")(tick.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsTestingRecordMod.Record]
}
