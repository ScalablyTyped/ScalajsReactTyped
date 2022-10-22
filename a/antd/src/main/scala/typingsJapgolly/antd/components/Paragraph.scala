package typingsJapgolly.antd.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libSkeletonParagraphMod.SkeletonParagraphProps
import typingsJapgolly.antd.libSkeletonParagraphMod.widthUnit
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Paragraph {
  
  @JSImport("antd/lib/skeleton/Paragraph", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def width(value: widthUnit | js.Array[widthUnit]): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def widthVarargs(value: widthUnit*): this.type = set("width", js.Array(value*))
  }
  
  implicit def make(companion: Paragraph.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SkeletonParagraphProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
