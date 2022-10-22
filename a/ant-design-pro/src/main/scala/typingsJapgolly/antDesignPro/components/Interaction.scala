package typingsJapgolly.antDesignPro.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antvG2.libInterfaceMod.LooseObject
import typingsJapgolly.bizcharts.libComponentsInteractionMod.IInteractionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Interaction {
  
  inline def apply(`type`: String): Builder = {
    val __props = js.Dynamic.literal()
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IInteractionProps]))
  }
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Interaction")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def cfg(value: LooseObject): this.type = set("cfg", value.asInstanceOf[js.Any])
    
    inline def config(value: js.Object): this.type = set("config", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IInteractionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
