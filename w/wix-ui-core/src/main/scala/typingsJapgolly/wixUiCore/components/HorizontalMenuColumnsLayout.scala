package typingsJapgolly.wixUiCore.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.wixUiCore.distEsSrcComponentsHorizontalMenuHorizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.ColumnsAlignment
import typingsJapgolly.wixUiCore.distEsSrcComponentsHorizontalMenuHorizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.HorizontalMenuColumnsLayoutProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsHorizontalMenuHorizontalMenuContextMod.HorizontalMenuContextValue
import typingsJapgolly.wixUiCore.distEsSrcComponentsHorizontalMenuHorizontalMenuItemHorizontalMenuItemContextMod.HorizontalMenuItemContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HorizontalMenuColumnsLayout {
  
  inline def apply(menuContext: HorizontalMenuContextValue, menuItemContext: HorizontalMenuItemContextValue): Builder = {
    val __props = js.Dynamic.literal(menuContext = menuContext.asInstanceOf[js.Any], menuItemContext = menuItemContext.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HorizontalMenuColumnsLayoutProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src", "HorizontalMenuColumnsLayout")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcMod.HorizontalMenuColumnsLayout] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def columnGap(value: Double): this.type = set("columnGap", value.asInstanceOf[js.Any])
    
    inline def columns(value: Double): this.type = set("columns", value.asInstanceOf[js.Any])
    
    inline def columnsAlignment(value: ColumnsAlignment): this.type = set("columnsAlignment", value.asInstanceOf[js.Any])
    
    inline def maxOverflowWidth(value: Double): this.type = set("maxOverflowWidth", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HorizontalMenuColumnsLayoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
