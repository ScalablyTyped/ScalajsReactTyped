package typingsJapgolly.stormReactDiagrams.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.stormReactDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typingsJapgolly.stormReactDiagrams.distSrcWidgetsLayersNodeLayerWidgetMod.NodeLayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeLayerWidget {
  
  inline def apply(diagramEngine: DiagramEngine): Builder = {
    val __props = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NodeLayerProps]))
  }
  
  @JSImport("storm-react-diagrams", "NodeLayerWidget")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.stormReactDiagrams.mod.NodeLayerWidget] {
    
    inline def baseClass(value: String): this.type = set("baseClass", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def extraProps(value: Any): this.type = set("extraProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NodeLayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
