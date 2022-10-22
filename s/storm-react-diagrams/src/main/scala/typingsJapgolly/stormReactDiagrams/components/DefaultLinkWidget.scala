package typingsJapgolly.stormReactDiagrams.components

import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.stormReactDiagrams.distSrcDefaultsModelsDefaultLinkModelMod.DefaultLinkModel
import typingsJapgolly.stormReactDiagrams.distSrcDefaultsWidgetsDefaultLinkWidgetMod.DefaultLinkProps
import typingsJapgolly.stormReactDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typingsJapgolly.stormReactDiagrams.distSrcModelsPointModelMod.PointModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultLinkWidget {
  
  inline def apply(diagramEngine: DiagramEngine, link: DefaultLinkModel): Builder = {
    val __props = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DefaultLinkProps]))
  }
  
  @JSImport("storm-react-diagrams", "DefaultLinkWidget")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.stormReactDiagrams.mod.DefaultLinkWidget] {
    
    inline def baseClass(value: String): this.type = set("baseClass", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def extraProps(value: Any): this.type = set("extraProps", value.asInstanceOf[js.Any])
    
    inline def pointAdded(value: (/* point */ PointModel, /* event */ MouseEvent) => Any): this.type = set("pointAdded", js.Any.fromFunction2(value))
    
    inline def smooth(value: Boolean): this.type = set("smooth", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DefaultLinkProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
