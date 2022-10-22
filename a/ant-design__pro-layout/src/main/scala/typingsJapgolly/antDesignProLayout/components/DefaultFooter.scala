package typingsJapgolly.antDesignProLayout.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignProLayout.anon.BlankTarget
import typingsJapgolly.antDesignProLayout.esComponentsFooterMod.FooterProps
import typingsJapgolly.antDesignProLayout.esTypingsMod.WithFalse
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultFooter {
  
  @JSImport("@ant-design/pro-layout", "DefaultFooter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def copyright(value: WithFalse[String]): this.type = set("copyright", value.asInstanceOf[js.Any])
    
    inline def links(value: WithFalse[js.Array[BlankTarget]]): this.type = set("links", value.asInstanceOf[js.Any])
    
    inline def linksVarargs(value: BlankTarget*): this.type = set("links", js.Array(value*))
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DefaultFooter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FooterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
