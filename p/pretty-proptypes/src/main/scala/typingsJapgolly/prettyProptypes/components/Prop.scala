package typingsJapgolly.prettyProptypes.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.prettyProptypes.mod.CommonProps
import typingsJapgolly.prettyProptypes.mod.Components_
import typingsJapgolly.prettyProptypes.mod.Kind
import typingsJapgolly.prettyProptypes.mod.PropProps
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Prop {
  
  inline def apply(
    components: Components_,
    name: String,
    required: Boolean,
    shapeComponent: ComponentType[CommonProps],
    `type`: String,
    typeValue: Kind
  ): Builder = {
    val __props = js.Dynamic.literal(components = components.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], shapeComponent = shapeComponent.asInstanceOf[js.Any], typeValue = typeValue.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropProps]))
  }
  
  @JSImport("pretty-proptypes", "Prop")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.prettyProptypes.mod.Prop] {
    
    inline def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def description(value: String): this.type = set("description", value.asInstanceOf[js.Any])
    
    inline def shouldCollapse(value: Boolean): this.type = set("shouldCollapse", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
