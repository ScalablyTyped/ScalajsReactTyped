package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesBrowserPreviewWidgetMod.BrowserBarSizes
import typingsJapgolly.wixStyleReact.distTypesBrowserPreviewWidgetMod.BrowserPreviewWidgetProps
import typingsJapgolly.wixStyleReact.distTypesBrowserPreviewWidgetMod.BrowserPreviewWidgetSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BrowserPreviewWidget {
  
  @JSImport("wix-style-react", "BrowserPreviewWidget")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.BrowserPreviewWidget] {
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def browserBarSize(value: BrowserBarSizes): this.type = set("browserBarSize", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def skin(value: BrowserPreviewWidgetSkin): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: BrowserPreviewWidget.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BrowserPreviewWidgetProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
