package typingsJapgolly.stormReactDiagrams.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.stormReactDiagrams.distSrcDefaultsModelsDefaultPortModelMod.DefaultPortModel
import typingsJapgolly.stormReactDiagrams.distSrcDefaultsWidgetsDefaultPortLabelWidgetMod.DefaultPortLabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultPortLabel {
  
  inline def apply(model: DefaultPortModel): Builder = {
    val __props = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DefaultPortLabelProps]))
  }
  
  @JSImport("storm-react-diagrams", "DefaultPortLabel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.stormReactDiagrams.mod.DefaultPortLabel] {
    
    inline def baseClass(value: String): this.type = set("baseClass", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def extraProps(value: Any): this.type = set("extraProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DefaultPortLabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
