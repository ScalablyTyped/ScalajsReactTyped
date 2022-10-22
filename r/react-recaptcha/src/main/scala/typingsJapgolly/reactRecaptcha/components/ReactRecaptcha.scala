package typingsJapgolly.reactRecaptcha.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRecaptcha.mod.RecaptchaProps
import typingsJapgolly.reactRecaptcha.mod.^
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.`inline`
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.audio
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.bottomleft
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.bottomright
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.compact
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.dark
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.explicit
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.image
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.invisible
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.light
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.normal
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.onload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactRecaptcha {
  
  @JSImport("react-recaptcha", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def badge(value: bottomright | bottomleft | `inline`): this.type = set("badge", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def elementID(value: String): this.type = set("elementID", value.asInstanceOf[js.Any])
    
    inline def expiredCallback(value: CallbackTo[Any]): this.type = set("expiredCallback", value.toJsFn)
    
    inline def expiredCallbackName(value: String): this.type = set("expiredCallbackName", value.asInstanceOf[js.Any])
    
    inline def hl(value: String): this.type = set("hl", value.asInstanceOf[js.Any])
    
    inline def onloadCallback(value: CallbackTo[Any]): this.type = set("onloadCallback", value.toJsFn)
    
    inline def onloadCallbackName(value: String): this.type = set("onloadCallbackName", value.asInstanceOf[js.Any])
    
    inline def render(value: onload | explicit): this.type = set("render", value.asInstanceOf[js.Any])
    
    inline def sitekey(value: String): this.type = set("sitekey", value.asInstanceOf[js.Any])
    
    inline def size(value: normal | compact | invisible): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def tabindex(value: Double | String): this.type = set("tabindex", value.asInstanceOf[js.Any])
    
    inline def theme(value: dark | light): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def `type`(value: audio | image): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def verifyCallback(value: /* response */ String => Any): this.type = set("verifyCallback", js.Any.fromFunction1(value))
    
    inline def verifyCallbackName(value: String): this.type = set("verifyCallbackName", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactRecaptcha.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RecaptchaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
