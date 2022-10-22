package typingsJapgolly.stormReactDiagrams.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.stormReactDiagrams.distSrcModelsNodeModelMod.NodeModel
import typingsJapgolly.stormReactDiagrams.distSrcWidgetsPortWidgetMod.PortProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PortWidget {
  
  inline def apply(name: String, node: NodeModel): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PortProps]))
  }
  
  @JSImport("storm-react-diagrams", "PortWidget")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.stormReactDiagrams.mod.PortWidget] {
    
    inline def baseClass(value: String): this.type = set("baseClass", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def extraProps(value: Any): this.type = set("extraProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PortProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
