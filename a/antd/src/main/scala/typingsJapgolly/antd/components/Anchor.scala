package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.anon.Href
import typingsJapgolly.antd.libAnchorAnchorLinkMod.AnchorLinkProps
import typingsJapgolly.antd.libAnchorAnchorMod.AnchorContainer
import typingsJapgolly.antd.libAnchorAnchorMod.AnchorProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Anchor {
  
  object Link {
    
    inline def apply(href: String): SharedBuilder_AnchorLinkProps382954627[typingsJapgolly.antd.mod.Anchor.Link] = {
      val __props = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      new SharedBuilder_AnchorLinkProps382954627[typingsJapgolly.antd.mod.Anchor.Link](js.Array(this.component, __props.asInstanceOf[AnchorLinkProps]))
    }
    
    @JSImport("antd", "Anchor.Link")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: AnchorLinkProps): SharedBuilder_AnchorLinkProps382954627[typingsJapgolly.antd.mod.Anchor.Link] = new SharedBuilder_AnchorLinkProps382954627[typingsJapgolly.antd.mod.Anchor.Link](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Anchor")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antd.libAnchorAnchorMod.Anchor] {
    
    inline def affix(value: Boolean): this.type = set("affix", value.asInstanceOf[js.Any])
    
    inline def bounds(value: Double): this.type = set("bounds", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def getContainer(value: CallbackTo[AnchorContainer]): this.type = set("getContainer", value.toJsFn)
    
    inline def getCurrentAnchor(value: /* activeLink */ String => String): this.type = set("getCurrentAnchor", js.Any.fromFunction1(value))
    
    inline def offsetTop(value: Double): this.type = set("offsetTop", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* currentActiveLink */ String => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* currentActiveLink */ String) => value(t0).runNow()))
    
    inline def onClick(value: (/* e */ ReactMouseEventFrom[HTMLElement], /* link */ Href) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLElement], t1: /* link */ Href) => (value(t0, t1)).runNow()))
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def showInkInFixed(value: Boolean): this.type = set("showInkInFixed", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def targetOffset(value: Double): this.type = set("targetOffset", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Anchor.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AnchorProps & RefAttributes[typingsJapgolly.antd.libAnchorAnchorMod.Anchor]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
