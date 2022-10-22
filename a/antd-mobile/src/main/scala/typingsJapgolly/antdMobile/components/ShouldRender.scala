package typingsJapgolly.antdMobile.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobile.esUtilsShouldRenderMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShouldRender {
  
  inline def apply(active: Boolean): Builder = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("antd-mobile/es/utils/should-render", "ShouldRender")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def destroyOnClose(value: Boolean): this.type = set("destroyOnClose", value.asInstanceOf[js.Any])
    
    inline def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
