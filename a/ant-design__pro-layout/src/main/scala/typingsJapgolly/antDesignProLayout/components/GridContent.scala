package typingsJapgolly.antDesignProLayout.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignProLayout.esComponentsGridContentMod.GridContentProps
import typingsJapgolly.antDesignProLayout.esDefaultSettingsMod.ContentWidth
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GridContent {
  
  @JSImport("@ant-design/pro-layout", "GridContent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def contentWidth(value: ContentWidth): this.type = set("contentWidth", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: GridContent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GridContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
