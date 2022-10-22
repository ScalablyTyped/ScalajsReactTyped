package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.anon.Icon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Control {
  
  inline def apply(className: Any, dataHook: Any, icon: Any, onClick: Any, size: Any, skin: Any): Builder = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], skin = skin.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Icon]))
  }
  
  @JSImport("wix-style-react/dist/types/CarouselWIP/Control", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Icon): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
