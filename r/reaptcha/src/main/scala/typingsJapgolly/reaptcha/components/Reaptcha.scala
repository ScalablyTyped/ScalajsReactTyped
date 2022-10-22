package typingsJapgolly.reaptcha.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reaptcha.mod.Props
import typingsJapgolly.reaptcha.mod.RenderProps
import typingsJapgolly.reaptcha.mod.default
import typingsJapgolly.reaptcha.reaptchaStrings.`inline`
import typingsJapgolly.reaptcha.reaptchaStrings.bottomleft
import typingsJapgolly.reaptcha.reaptchaStrings.bottomright
import typingsJapgolly.reaptcha.reaptchaStrings.compact
import typingsJapgolly.reaptcha.reaptchaStrings.dark
import typingsJapgolly.reaptcha.reaptchaStrings.invisible
import typingsJapgolly.reaptcha.reaptchaStrings.light
import typingsJapgolly.reaptcha.reaptchaStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Reaptcha {
  
  inline def apply(onVerify: String => Callback, sitekey: String): Builder = {
    val __props = js.Dynamic.literal(onVerify = js.Any.fromFunction1((t0: String) => onVerify(t0).runNow()), sitekey = sitekey.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("reaptcha", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def badge(value: bottomright | bottomleft | `inline`): this.type = set("badge", value.asInstanceOf[js.Any])
    
    inline def children(value: /* renderProps */ RenderProps => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def explicit(value: Boolean): this.type = set("explicit", value.asInstanceOf[js.Any])
    
    inline def hl(value: String): this.type = set("hl", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inject(value: Boolean): this.type = set("inject", value.asInstanceOf[js.Any])
    
    inline def isolated(value: Boolean): this.type = set("isolated", value.asInstanceOf[js.Any])
    
    inline def onError(value: Callback): this.type = set("onError", value.toJsFn)
    
    inline def onExpire(value: Callback): this.type = set("onExpire", value.toJsFn)
    
    inline def onLoad(value: Callback): this.type = set("onLoad", value.toJsFn)
    
    inline def onRender(value: Callback): this.type = set("onRender", value.toJsFn)
    
    inline def size(value: compact | normal | invisible): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def tabindex(value: Double): this.type = set("tabindex", value.asInstanceOf[js.Any])
    
    inline def theme(value: light | dark): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
