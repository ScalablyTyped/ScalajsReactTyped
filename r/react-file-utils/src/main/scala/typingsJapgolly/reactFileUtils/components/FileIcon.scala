package typingsJapgolly.reactFileUtils.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactFileUtils.distComponentsFileIconFileIconMod.FileIconProps
import typingsJapgolly.reactFileUtils.distComponentsFileIconIconMapMod.IconType
import typingsJapgolly.reactFileUtils.distComponentsFileIconIconMapMod.IconVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FileIcon {
  
  @JSImport("react-file-utils", "FileIcon")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def big(value: Boolean): this.type = set("big", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def filename(value: String): this.type = set("filename", value.asInstanceOf[js.Any])
    
    inline def mimeType(value: String): this.type = set("mimeType", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def sizeSmall(value: Double): this.type = set("sizeSmall", value.asInstanceOf[js.Any])
    
    inline def `type`(value: IconType): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def version(value: IconVersion): this.type = set("version", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FileIcon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FileIconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
