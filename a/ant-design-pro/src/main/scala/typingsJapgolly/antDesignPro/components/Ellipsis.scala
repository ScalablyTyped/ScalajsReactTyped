package typingsJapgolly.antDesignPro.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignPro.libEllipsisMod.EllipsisProps
import typingsJapgolly.antDesignPro.libEllipsisMod.EllipsisTooltipProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ellipsis {
  
  @JSImport("ant-design-pro", "Ellipsis")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignPro.mod.Ellipsis] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def fullWidthRecognition(value: Boolean): this.type = set("fullWidthRecognition", value.asInstanceOf[js.Any])
    
    inline def length(value: Double): this.type = set("length", value.asInstanceOf[js.Any])
    
    inline def lines(value: Double): this.type = set("lines", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: Boolean | EllipsisTooltipProps): this.type = set("tooltip", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Ellipsis.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: EllipsisProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
