package typingsJapgolly.reactStripeElements.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactStripeElements.anon.ElementsCreateOptionschil
import typingsJapgolly.stripeV3.stripe.elements.Font
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Elements {
  
  @JSImport("react-stripe-elements", "Elements")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactStripeElements.mod.Elements] {
    
    inline def fonts(value: js.Array[Font]): this.type = set("fonts", value.asInstanceOf[js.Any])
    
    inline def fontsVarargs(value: Font*): this.type = set("fonts", js.Array(value*))
    
    inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Elements.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ElementsCreateOptionschil): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
