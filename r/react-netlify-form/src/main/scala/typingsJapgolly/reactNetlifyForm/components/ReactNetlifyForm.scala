package typingsJapgolly.reactNetlifyForm.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactGoogleRecaptcha.mod.ReCAPTCHAProps
import typingsJapgolly.reactNetlifyForm.mod.NetlifyFormProps
import typingsJapgolly.reactNetlifyForm.mod.NetlifyFormState
import typingsJapgolly.reactNetlifyForm.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNetlifyForm {
  
  inline def apply(children: NetlifyFormState => Element, name: String): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NetlifyFormProps]))
  }
  
  @JSImport("react-netlify-form", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def action(value: String): this.type = set("action", value.asInstanceOf[js.Any])
    
    inline def honeypotName(value: String): this.type = set("honeypotName", value.asInstanceOf[js.Any])
    
    inline def recaptcha(value: ReCAPTCHAProps): this.type = set("recaptcha", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NetlifyFormProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
