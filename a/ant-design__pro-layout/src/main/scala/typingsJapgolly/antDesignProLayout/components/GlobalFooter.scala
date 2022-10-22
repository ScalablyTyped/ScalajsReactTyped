package typingsJapgolly.antDesignProLayout.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignProLayout.anon.BlankTarget
import typingsJapgolly.antDesignProLayout.esComponentsGlobalFooterMod.GlobalFooterProps
import typingsJapgolly.antDesignProLayout.esTypingsMod.WithFalse
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlobalFooter {
  
  @JSImport("@ant-design/pro-layout/es/components/GlobalFooter", "GlobalFooter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def copyright(value: VdomNode): this.type = set("copyright", value.rawNode.asInstanceOf[js.Any])
    
    inline def copyrightNull: this.type = set("copyright", null)
    
    inline def copyrightVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("copyright", js.Array(value*))
    
    inline def copyrightVdomElement(value: VdomElement): this.type = set("copyright", value.rawElement.asInstanceOf[js.Any])
    
    inline def links(value: WithFalse[js.Array[BlankTarget]]): this.type = set("links", value.asInstanceOf[js.Any])
    
    inline def linksVarargs(value: BlankTarget*): this.type = set("links", js.Array(value*))
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: GlobalFooter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GlobalFooterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
