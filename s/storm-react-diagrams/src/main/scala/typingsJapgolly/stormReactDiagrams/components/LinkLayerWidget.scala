package typingsJapgolly.stormReactDiagrams.components

import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.stormReactDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typingsJapgolly.stormReactDiagrams.distSrcModelsPointModelMod.PointModel
import typingsJapgolly.stormReactDiagrams.distSrcWidgetsLayersLinkLayerWidgetMod.LinkLayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinkLayerWidget {
  
  inline def apply(diagramEngine: DiagramEngine, pointAdded: (PointModel, MouseEvent) => Any): Builder = {
    val __props = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], pointAdded = js.Any.fromFunction2(pointAdded))
    new Builder(js.Array(this.component, __props.asInstanceOf[LinkLayerProps]))
  }
  
  @JSImport("storm-react-diagrams", "LinkLayerWidget")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.stormReactDiagrams.mod.LinkLayerWidget] {
    
    inline def baseClass(value: String): this.type = set("baseClass", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def extraProps(value: Any): this.type = set("extraProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LinkLayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
