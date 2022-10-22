package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesBoxMod.BoxCssSizingProperty
import typingsJapgolly.wixStyleReact.distTypesSkeletonLineMod.SkeletonLineProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SkeletonLine {
  
  @JSImport("wix-style-react", "SkeletonLine")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.SkeletonLine] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def margin(value: BoxCssSizingProperty): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def marginBottom(value: BoxCssSizingProperty): this.type = set("marginBottom", value.asInstanceOf[js.Any])
    
    inline def marginLeft(value: BoxCssSizingProperty): this.type = set("marginLeft", value.asInstanceOf[js.Any])
    
    inline def marginRight(value: BoxCssSizingProperty): this.type = set("marginRight", value.asInstanceOf[js.Any])
    
    inline def marginTop(value: BoxCssSizingProperty): this.type = set("marginTop", value.asInstanceOf[js.Any])
    
    inline def width(value: BoxCssSizingProperty): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SkeletonLine.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SkeletonLineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
