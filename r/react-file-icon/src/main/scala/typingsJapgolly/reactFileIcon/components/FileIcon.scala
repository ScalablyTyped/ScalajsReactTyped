package typingsJapgolly.reactFileIcon.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactFileIcon.mod.FileIconProps
import typingsJapgolly.reactFileIcon.mod.IconType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FileIcon {
  
  @JSImport("react-file-icon", "FileIcon")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def `extension`(value: String): this.type = set("extension", value.asInstanceOf[js.Any])
    
    inline def fold(value: Boolean): this.type = set("fold", value.asInstanceOf[js.Any])
    
    inline def foldColor(value: String): this.type = set("foldColor", value.asInstanceOf[js.Any])
    
    inline def glyphColor(value: String): this.type = set("glyphColor", value.asInstanceOf[js.Any])
    
    inline def gradientColor(value: String): this.type = set("gradientColor", value.asInstanceOf[js.Any])
    
    inline def gradientOpacity(value: Double): this.type = set("gradientOpacity", value.asInstanceOf[js.Any])
    
    inline def labelColor(value: String): this.type = set("labelColor", value.asInstanceOf[js.Any])
    
    inline def labelTextColor(value: String): this.type = set("labelTextColor", value.asInstanceOf[js.Any])
    
    inline def labelTextStyle(value: js.Object): this.type = set("labelTextStyle", value.asInstanceOf[js.Any])
    
    inline def labelUppercase(value: Boolean): this.type = set("labelUppercase", value.asInstanceOf[js.Any])
    
    inline def radius(value: Double): this.type = set("radius", value.asInstanceOf[js.Any])
    
    inline def `type`(value: IconType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FileIcon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FileIconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
