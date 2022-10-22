package typingsJapgolly.antDesignProLayout.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignProLayout.anon.Children
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WrapContent {
  
  inline def apply(hasHeader: Boolean): Builder = {
    val __props = js.Dynamic.literal(hasHeader = hasHeader.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Children]))
  }
  
  @JSImport("@ant-design/pro-layout/es/WrapContent", "WrapContent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def ErrorBoundary(value: Any): this.type = set("ErrorBoundary", value.asInstanceOf[js.Any])
    
    inline def contentHeight(value: Double | String): this.type = set("contentHeight", value.asInstanceOf[js.Any])
    
    inline def hasPageContainer(value: Double): this.type = set("hasPageContainer", value.asInstanceOf[js.Any])
    
    inline def isChildrenLayout(value: Boolean): this.type = set("isChildrenLayout", value.asInstanceOf[js.Any])
    
    inline def location(value: Any): this.type = set("location", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Children): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
