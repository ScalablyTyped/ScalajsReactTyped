package typingsJapgolly.reactStripeElements.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.stripeV3.stripe.Stripe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StripeProvider {
  
  object childrenReactNodeundefine {
    
    inline def apply(apiKey: String): Builder = {
      val __props = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactStripeElements.anon.childrenReactNodeundefine]))
    }
    
    @JSImport("react-stripe-elements", "StripeProvider")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactStripeElements.mod.StripeProvider] {
      
      inline def stripeAccount(value: String): this.type = set("stripeAccount", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.reactStripeElements.anon.childrenReactNodeundefine): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object childrenReactNodeundefineApiKey {
    
    @JSImport("react-stripe-elements", "StripeProvider")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactStripeElements.mod.StripeProvider] {
      
      inline def stripe(value: Stripe): this.type = set("stripe", value.asInstanceOf[js.Any])
      
      inline def stripeAccount(value: String): this.type = set("stripeAccount", value.asInstanceOf[js.Any])
      
      inline def stripeNull: this.type = set("stripe", null)
    }
    
    implicit def make(companion: childrenReactNodeundefineApiKey.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: typingsJapgolly.reactStripeElements.anon.childrenReactNodeundefineApiKey): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
