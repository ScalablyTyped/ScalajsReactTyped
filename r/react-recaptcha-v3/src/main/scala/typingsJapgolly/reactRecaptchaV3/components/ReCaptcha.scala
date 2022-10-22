package typingsJapgolly.reactRecaptchaV3.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRecaptchaV3.mod.ReCaptcha.ReCaptchaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReCaptcha {
  
  inline def apply(action: String, sitekey: String): Builder = {
    val __props = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sitekey = sitekey.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReCaptchaProps]))
  }
  
  @JSImport("react-recaptcha-v3", "ReCaptcha")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactRecaptchaV3.mod.ReCaptcha] {
    
    inline def elementID(value: String): this.type = set("elementID", value.asInstanceOf[js.Any])
    
    inline def verifyCallback(value: /* response */ String => Callback): this.type = set("verifyCallback", js.Any.fromFunction1((t0: /* response */ String) => value(t0).runNow()))
    
    inline def verifyCallbackName(value: String): this.type = set("verifyCallbackName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReCaptchaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
