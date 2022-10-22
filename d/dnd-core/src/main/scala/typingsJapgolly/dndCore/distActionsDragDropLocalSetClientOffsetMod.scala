package typingsJapgolly.dndCore

import typingsJapgolly.dndCore.distInterfacesMod.XYCoord
import typingsJapgolly.redux.mod.AnyAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distActionsDragDropLocalSetClientOffsetMod {
  
  @JSImport("dnd-core/dist/actions/dragDrop/local/setClientOffset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setClientOffset(): AnyAction = ^.asInstanceOf[js.Dynamic].applyDynamic("setClientOffset")().asInstanceOf[AnyAction]
  inline def setClientOffset(clientOffset: Null, sourceClientOffset: XYCoord): AnyAction = (^.asInstanceOf[js.Dynamic].applyDynamic("setClientOffset")(clientOffset.asInstanceOf[js.Any], sourceClientOffset.asInstanceOf[js.Any])).asInstanceOf[AnyAction]
  inline def setClientOffset(clientOffset: Unit, sourceClientOffset: XYCoord): AnyAction = (^.asInstanceOf[js.Dynamic].applyDynamic("setClientOffset")(clientOffset.asInstanceOf[js.Any], sourceClientOffset.asInstanceOf[js.Any])).asInstanceOf[AnyAction]
  inline def setClientOffset(clientOffset: XYCoord): AnyAction = ^.asInstanceOf[js.Dynamic].applyDynamic("setClientOffset")(clientOffset.asInstanceOf[js.Any]).asInstanceOf[AnyAction]
  inline def setClientOffset(clientOffset: XYCoord, sourceClientOffset: XYCoord): AnyAction = (^.asInstanceOf[js.Dynamic].applyDynamic("setClientOffset")(clientOffset.asInstanceOf[js.Any], sourceClientOffset.asInstanceOf[js.Any])).asInstanceOf[AnyAction]
}
