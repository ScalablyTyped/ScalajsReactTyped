package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.distEsSrcComponentsCaptchaCaptchaMod.CaptchaProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsCaptchaTypesMod.CaptchaLang
import typingsJapgolly.wixUiCore.distEsSrcComponentsCaptchaTypesMod.CaptchaType
import typingsJapgolly.wixUiCore.distEsSrcComponentsCaptchaTypesMod.Size
import typingsJapgolly.wixUiCore.distEsSrcComponentsCaptchaTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Captcha {
  
  inline def apply(loader: Any, sitekey: String): Builder = {
    val __props = js.Dynamic.literal(loader = loader.asInstanceOf[js.Any], sitekey = sitekey.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CaptchaProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src", "Captcha")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcMod.Captcha] {
    
    inline def captchaType(value: CaptchaType): this.type = set("captchaType", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
    
    inline def lang(value: CaptchaLang): this.type = set("lang", value.asInstanceOf[js.Any])
    
    inline def onError(value: Callback): this.type = set("onError", value.toJsFn)
    
    inline def onExpire(value: Callback): this.type = set("onExpire", value.toJsFn)
    
    inline def onLoad(value: Callback): this.type = set("onLoad", value.toJsFn)
    
    inline def onRender(value: Callback): this.type = set("onRender", value.toJsFn)
    
    inline def onReset(value: Callback): this.type = set("onReset", value.toJsFn)
    
    inline def onVerify(value: /* token */ String => Callback): this.type = set("onVerify", js.Any.fromFunction1((t0: /* token */ String) => value(t0).runNow()))
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def size(value: Size): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CaptchaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
