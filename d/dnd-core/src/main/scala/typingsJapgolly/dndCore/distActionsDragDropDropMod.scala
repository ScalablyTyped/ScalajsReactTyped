package typingsJapgolly.dndCore

import typingsJapgolly.dndCore.distInterfacesMod.DragDropManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distActionsDragDropDropMod {
  
  @JSImport("dnd-core/dist/actions/dragDrop/drop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDrop(manager: DragDropManager): js.Function1[/* options */ js.UndefOr[js.Object], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDrop")(manager.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* options */ js.UndefOr[js.Object], Unit]]
}
