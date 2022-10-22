package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesGooglePreviewMod.GooglePreviewProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.light
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.transparent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GooglePreview {
  
  @JSImport("wix-style-react", "GooglePreview")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.GooglePreview] {
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def description(value: String): this.type = set("description", value.asInstanceOf[js.Any])
    
    inline def descriptionMaxLines(value: Double): this.type = set("descriptionMaxLines", value.asInstanceOf[js.Any])
    
    inline def previewUrl(value: String): this.type = set("previewUrl", value.asInstanceOf[js.Any])
    
    inline def skin(value: light | transparent): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleMaxLines(value: Double): this.type = set("titleMaxLines", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: GooglePreview.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GooglePreviewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
