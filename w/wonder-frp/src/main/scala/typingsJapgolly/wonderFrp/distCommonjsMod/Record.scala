package typingsJapgolly.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "Record")
@js.native
open class Record protected ()
  extends typingsJapgolly.wonderFrp.distCommonjsTestingRecordMod.Record {
  def this(
    time: Any,
    value: Any,
    actionType: typingsJapgolly.wonderFrp.distCommonjsTestingActionTypeMod.ActionType,
    comparer: js.Function
  ) = this()
}
/* static members */
object Record {
  
  @JSImport("wonder-frp/dist/commonjs", "Record")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(time: Double, value: Any): typingsJapgolly.wonderFrp.distCommonjsTestingRecordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsTestingRecordMod.Record]
  inline def create(time: Double, value: Any, actionType: Unit, comparer: js.Function): typingsJapgolly.wonderFrp.distCommonjsTestingRecordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any], actionType.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsTestingRecordMod.Record]
  inline def create(
    time: Double,
    value: Any,
    actionType: typingsJapgolly.wonderFrp.distCommonjsTestingActionTypeMod.ActionType
  ): typingsJapgolly.wonderFrp.distCommonjsTestingRecordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any], actionType.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsTestingRecordMod.Record]
  inline def create(
    time: Double,
    value: Any,
    actionType: typingsJapgolly.wonderFrp.distCommonjsTestingActionTypeMod.ActionType,
    comparer: js.Function
  ): typingsJapgolly.wonderFrp.distCommonjsTestingRecordMod.Record = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(time.asInstanceOf[js.Any], value.asInstanceOf[js.Any], actionType.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsTestingRecordMod.Record]
}
