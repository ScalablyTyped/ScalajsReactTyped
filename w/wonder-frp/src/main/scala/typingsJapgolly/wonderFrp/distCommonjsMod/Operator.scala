package typingsJapgolly.wonderFrp.distCommonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "Operator")
@js.native
open class Operator ()
  extends typingsJapgolly.wonderFrp.distCommonjsGlobalOperatorMod.Operator
/* static members */
object Operator {
  
  @JSImport("wonder-frp/dist/commonjs", "Operator")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStream(subscribeFunc: Any): typingsJapgolly.wonderFrp.distCommonjsStreamAnonymousStreamMod.AnonymousStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(subscribeFunc.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsStreamAnonymousStreamMod.AnonymousStream]
  
  inline def empty(): typingsJapgolly.wonderFrp.distCommonjsStreamAnonymousStreamMod.AnonymousStream = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsStreamAnonymousStreamMod.AnonymousStream]
  
  inline def fromArray(array: js.Array[Any]): typingsJapgolly.wonderFrp.distCommonjsStreamFromArrayStreamMod.FromArrayStream = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsStreamFromArrayStreamMod.FromArrayStream]
  inline def fromArray(array: js.Array[Any], scheduler: typingsJapgolly.wonderFrp.distCommonjsCoreSchedulerMod.Scheduler): typingsJapgolly.wonderFrp.distCommonjsStreamFromArrayStreamMod.FromArrayStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderFrp.distCommonjsStreamFromArrayStreamMod.FromArrayStream]
}
