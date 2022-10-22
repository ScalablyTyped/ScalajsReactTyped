package typingsJapgolly.stormReactDiagrams.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.stormReactDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typingsJapgolly.stormReactDiagrams.distSrcModelsNodeModelMod.NodeModel
import typingsJapgolly.stormReactDiagrams.distSrcWidgetsNodeWidgetMod.NodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeWidget {
  
  inline def apply(diagramEngine: DiagramEngine, node: NodeModel): Builder = {
    val __props = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NodeProps]))
  }
  
  @JSImport("storm-react-diagrams", "NodeWidget")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.stormReactDiagrams.mod.NodeWidget] {
    
    inline def baseClass(value: String): this.type = set("baseClass", value.asInstanceOf[js.Any])
    
    inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def extraProps(value: Any): this.type = set("extraProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NodeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
