package typingsJapgolly.vexflow.mod.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Factory")
@js.native
open class Factory protected ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.Factory {
  def this(options: Any) = this()
}
object Factory {
  
  @JSImport("vexflow", "Flow.Factory")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def newFromElementId(elementId: Any): typingsJapgolly.vexflow.Vex.Flow.Factory = ^.asInstanceOf[js.Dynamic].applyDynamic("newFromElementId")(elementId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.Factory]
  inline def newFromElementId(elementId: Any, width: Double): typingsJapgolly.vexflow.Vex.Flow.Factory = (^.asInstanceOf[js.Dynamic].applyDynamic("newFromElementId")(elementId.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.Factory]
  inline def newFromElementId(elementId: Any, width: Double, height: Double): typingsJapgolly.vexflow.Vex.Flow.Factory = (^.asInstanceOf[js.Dynamic].applyDynamic("newFromElementId")(elementId.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.Factory]
  inline def newFromElementId(elementId: Any, width: Unit, height: Double): typingsJapgolly.vexflow.Vex.Flow.Factory = (^.asInstanceOf[js.Dynamic].applyDynamic("newFromElementId")(elementId.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vexflow.Vex.Flow.Factory]
}
