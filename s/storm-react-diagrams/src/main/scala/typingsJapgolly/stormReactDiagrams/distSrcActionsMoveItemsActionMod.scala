package typingsJapgolly.stormReactDiagrams

import typingsJapgolly.stormReactDiagrams.distSrcActionsBaseActionMod.BaseAction
import typingsJapgolly.stormReactDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typingsJapgolly.stormReactDiagrams.distSrcModelsSelectionModelMod.SelectionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcActionsMoveItemsActionMod {
  
  @JSImport("storm-react-diagrams/dist/src/actions/MoveItemsAction", "MoveItemsAction")
  @js.native
  open class MoveItemsAction protected () extends BaseAction {
    def this(mouseX: Double, mouseY: Double, diagramEngine: DiagramEngine) = this()
    
    var moved: Boolean = js.native
    
    var selectionModels: js.Array[SelectionModel] = js.native
  }
}
