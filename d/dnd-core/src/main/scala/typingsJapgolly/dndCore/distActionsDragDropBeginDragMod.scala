package typingsJapgolly.dndCore

import typingsJapgolly.dndCore.distInterfacesMod.Action
import typingsJapgolly.dndCore.distInterfacesMod.BeginDragOptions
import typingsJapgolly.dndCore.distInterfacesMod.BeginDragPayload
import typingsJapgolly.dndCore.distInterfacesMod.DragDropManager
import typingsJapgolly.dndCore.distInterfacesMod.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distActionsDragDropBeginDragMod {
  
  @JSImport("dnd-core/dist/actions/dragDrop/beginDrag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBeginDrag(manager: DragDropManager): js.Function2[
    /* sourceIds */ js.UndefOr[js.Array[Identifier]], 
    /* options */ js.UndefOr[BeginDragOptions], 
    js.UndefOr[Action[BeginDragPayload]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBeginDrag")(manager.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* sourceIds */ js.UndefOr[js.Array[Identifier]], 
    /* options */ js.UndefOr[BeginDragOptions], 
    js.UndefOr[Action[BeginDragPayload]]
  ]]
}
