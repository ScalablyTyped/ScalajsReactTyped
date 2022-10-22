package typingsJapgolly.stormReactDiagrams.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.stormReactDiagrams.distSrcDefaultsModelsDefaultLabelModelMod.DefaultLabelModel
import typingsJapgolly.stormReactDiagrams.distSrcDefaultsWidgetsDefaultLabelWidgetMod.DefaultLabelWidgetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultLabelWidget {
  
  inline def apply(model: DefaultLabelModel): Builder = {
    val __props = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DefaultLabelWidgetProps]))
  }
  
  @JSImport("storm-react-diagrams", "DefaultLabelWidget")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.stormReactDiagrams.mod.DefaultLabelWidget] {
    
    inline def baseClass(value: String): this.type = set("baseClass", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def extraProps(value: Any): this.type = set("extraProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DefaultLabelWidgetProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
