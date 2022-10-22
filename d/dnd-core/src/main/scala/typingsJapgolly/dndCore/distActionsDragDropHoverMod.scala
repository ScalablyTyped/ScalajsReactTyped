package typingsJapgolly.dndCore

import typingsJapgolly.dndCore.distInterfacesMod.Action
import typingsJapgolly.dndCore.distInterfacesMod.DragDropManager
import typingsJapgolly.dndCore.distInterfacesMod.HoverOptions
import typingsJapgolly.dndCore.distInterfacesMod.HoverPayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distActionsDragDropHoverMod {
  
  @JSImport("dnd-core/dist/actions/dragDrop/hover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createHover(manager: DragDropManager): js.Function2[
    /* targetIdsArg */ js.Array[String], 
    /* hasClientOffset */ js.UndefOr[HoverOptions], 
    Action[HoverPayload]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createHover")(manager.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* targetIdsArg */ js.Array[String], 
    /* hasClientOffset */ js.UndefOr[HoverOptions], 
    Action[HoverPayload]
  ]]
}
