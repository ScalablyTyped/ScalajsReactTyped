package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeaderLayout {
  
  inline def apply(closeButton: Any, onCancel: Any, theme: Any, title: Any): Builder = {
    val __props = js.Dynamic.literal(closeButton = closeButton.asInstanceOf[js.Any], onCancel = onCancel.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.wixStyleReact.anon.CloseButton]))
  }
  
  @JSImport("wix-style-react/dist/types/MessageBoxFunctionalLayout/HeaderLayout", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def appearance(value: String): this.type = set("appearance", value.asInstanceOf[js.Any])
    
    inline def newColorsBranding(value: Boolean): this.type = set("newColorsBranding", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: typingsJapgolly.wixStyleReact.anon.CloseButton): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
