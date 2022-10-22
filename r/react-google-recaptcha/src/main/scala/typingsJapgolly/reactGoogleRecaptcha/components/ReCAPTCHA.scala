package typingsJapgolly.reactGoogleRecaptcha.components

import typingsJapgolly.reactGoogleRecaptcha.mod.ReCAPTCHAProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReCAPTCHA {
  
  inline def apply(sitekey: String): SharedBuilder_ReCAPTCHAProps1894066745[typingsJapgolly.reactGoogleRecaptcha.mod.ReCAPTCHA] = {
    val __props = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
    new SharedBuilder_ReCAPTCHAProps1894066745[typingsJapgolly.reactGoogleRecaptcha.mod.ReCAPTCHA](js.Array(this.component, __props.asInstanceOf[ReCAPTCHAProps]))
  }
  
  @JSImport("react-google-recaptcha", "ReCAPTCHA")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ReCAPTCHAProps): SharedBuilder_ReCAPTCHAProps1894066745[typingsJapgolly.reactGoogleRecaptcha.mod.ReCAPTCHA] = new SharedBuilder_ReCAPTCHAProps1894066745[typingsJapgolly.reactGoogleRecaptcha.mod.ReCAPTCHA](js.Array(this.component, p.asInstanceOf[js.Any]))
}
