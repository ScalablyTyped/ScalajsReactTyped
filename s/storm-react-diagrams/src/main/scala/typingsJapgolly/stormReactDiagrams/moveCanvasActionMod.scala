package typingsJapgolly.stormReactDiagrams

import typingsJapgolly.stormReactDiagrams.baseActionMod.BaseAction
import typingsJapgolly.stormReactDiagrams.diagramModelMod.DiagramModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/actions/MoveCanvasAction", JSImport.Namespace)
@js.native
object moveCanvasActionMod extends js.Object {
  @js.native
  class MoveCanvasAction protected () extends BaseAction {
    def this(mouseX: Double, mouseY: Double, diagramModel: DiagramModel) = this()
    var initialOffsetX: Double = js.native
    var initialOffsetY: Double = js.native
  }
  
}

