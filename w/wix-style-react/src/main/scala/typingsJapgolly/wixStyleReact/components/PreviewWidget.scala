package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesPreviewWidgetMod.PreviewWidgetContentOutline
import typingsJapgolly.wixStyleReact.distTypesPreviewWidgetMod.PreviewWidgetProps
import typingsJapgolly.wixStyleReact.distTypesPreviewWidgetMod.PreviewWidgetSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PreviewWidget {
  
  @JSImport("wix-style-react", "PreviewWidget")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.PreviewWidget] {
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def contentOutline(value: PreviewWidgetContentOutline): this.type = set("contentOutline", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def scrollable(value: Boolean): this.type = set("scrollable", value.asInstanceOf[js.Any])
    
    inline def skin(value: PreviewWidgetSkin): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PreviewWidget.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PreviewWidgetProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
