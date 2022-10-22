package typingsJapgolly.hcaptchaReactHcaptcha.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.compact
import typingsJapgolly.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.dark
import typingsJapgolly.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.invisible
import typingsJapgolly.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.light
import typingsJapgolly.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.normal
import typingsJapgolly.hcaptchaReactHcaptcha.mod.HCaptchaProps
import typingsJapgolly.hcaptchaReactHcaptcha.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHcaptcha {
  
  inline def apply(sitekey: String): Builder = {
    val __props = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HCaptchaProps]))
  }
  
  @JSImport("@hcaptcha/react-hcaptcha", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def languageOverride(value: String): this.type = set("languageOverride", value.asInstanceOf[js.Any])
    
    inline def onError(value: /* event */ String => Any): this.type = set("onError", js.Any.fromFunction1(value))
    
    inline def onExpire(value: CallbackTo[Any]): this.type = set("onExpire", value.toJsFn)
    
    inline def onVerify(value: /* token */ String => Any): this.type = set("onVerify", js.Any.fromFunction1(value))
    
    inline def reCaptchaCompat(value: Boolean): this.type = set("reCaptchaCompat", value.asInstanceOf[js.Any])
    
    inline def size(value: normal | compact | invisible): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def theme(value: light | dark): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HCaptchaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
