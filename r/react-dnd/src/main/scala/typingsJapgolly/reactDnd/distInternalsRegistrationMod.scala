package typingsJapgolly.reactDnd

import typingsJapgolly.dndCore.distInterfacesMod.DragDropManager
import typingsJapgolly.dndCore.distInterfacesMod.DragSource
import typingsJapgolly.dndCore.distInterfacesMod.DropTarget
import typingsJapgolly.dndCore.distInterfacesMod.Identifier
import typingsJapgolly.dndCore.distInterfacesMod.SourceType
import typingsJapgolly.dndCore.distInterfacesMod.TargetType
import typingsJapgolly.dndCore.distInterfacesMod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInternalsRegistrationMod {
  
  @JSImport("react-dnd/dist/internals/registration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerSource(`type`: SourceType, source: DragSource, manager: DragDropManager): js.Tuple2[Identifier, Unsubscribe] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSource")(`type`.asInstanceOf[js.Any], source.asInstanceOf[js.Any], manager.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Identifier, Unsubscribe]]
  
  inline def registerTarget(`type`: TargetType, target: DropTarget, manager: DragDropManager): js.Tuple2[Identifier, Unsubscribe] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTarget")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], manager.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Identifier, Unsubscribe]]
}
