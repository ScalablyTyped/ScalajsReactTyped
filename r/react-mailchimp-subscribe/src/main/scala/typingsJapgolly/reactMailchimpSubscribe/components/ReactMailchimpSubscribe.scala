package typingsJapgolly.reactMailchimpSubscribe.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMailchimpSubscribe.mod.FormHooks
import typingsJapgolly.reactMailchimpSubscribe.mod.Props
import typingsJapgolly.reactMailchimpSubscribe.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMailchimpSubscribe {
  
  inline def apply[FormFields](url: String): Builder[FormFields] = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new Builder[FormFields](js.Array(this.component, __props.asInstanceOf[Props[FormFields]]))
  }
  
  @JSImport("react-mailchimp-subscribe", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[FormFields] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[FormFields]] {
    
    inline def render(value: /* hooks */ FormHooks[FormFields] => Node): this.type = set("render", js.Any.fromFunction1(value))
  }
  
  def withProps[FormFields](p: Props[FormFields]): Builder[FormFields] = new Builder[FormFields](js.Array(this.component, p.asInstanceOf[js.Any]))
}
