package typingsJapgolly.reactGoogleRecaptcha.components

import typingsJapgolly.reactGoogleRecaptcha.mod.ReCAPTCHAProps
import typingsJapgolly.reactGoogleRecaptcha.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactGoogleRecaptcha {
  
  inline def apply(sitekey: String): SharedBuilder_ReCAPTCHAProps1894066745[default] = {
    val __props = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
    new SharedBuilder_ReCAPTCHAProps1894066745[default](js.Array(this.component, __props.asInstanceOf[ReCAPTCHAProps]))
  }
  
  @JSImport("react-google-recaptcha", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ReCAPTCHAProps): SharedBuilder_ReCAPTCHAProps1894066745[default] = new SharedBuilder_ReCAPTCHAProps1894066745[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
