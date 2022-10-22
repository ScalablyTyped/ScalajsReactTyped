package typingsJapgolly.paypalCheckoutComponents

import japgolly.scalajs.react.Callback
import typingsJapgolly.paypalCheckoutComponents.anon.AccessToken
import typingsJapgolly.paypalCheckoutComponents.anon.CreateBillingAgreement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesButtonMod {
  
  @js.native
  sealed trait FundingOption extends StObject
  @JSImport("paypal-checkout-components/modules/button", "FundingOption")
  @js.native
  object FundingOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FundingOption & Double] = js.native
    
    @js.native
    sealed trait CARD
      extends StObject
         with FundingOption
    /* 1 */ val CARD: typingsJapgolly.paypalCheckoutComponents.modulesButtonMod.FundingOption.CARD & Double = js.native
    
    @js.native
    sealed trait CREDIT
      extends StObject
         with FundingOption
    /* 0 */ val CREDIT: typingsJapgolly.paypalCheckoutComponents.modulesButtonMod.FundingOption.CREDIT & Double = js.native
    
    @js.native
    sealed trait ELV
      extends StObject
         with FundingOption
    /* 3 */ val ELV: typingsJapgolly.paypalCheckoutComponents.modulesButtonMod.FundingOption.ELV & Double = js.native
    
    @js.native
    sealed trait PAYPAL
      extends StObject
         with FundingOption
    /* 4 */ val PAYPAL: typingsJapgolly.paypalCheckoutComponents.modulesButtonMod.FundingOption.PAYPAL & Double = js.native
    
    @js.native
    sealed trait VENMO
      extends StObject
         with FundingOption
    /* 2 */ val VENMO: typingsJapgolly.paypalCheckoutComponents.modulesButtonMod.FundingOption.VENMO & Double = js.native
  }
  
  trait ButtonRenderer extends StObject {
    
    def render(options: AccessToken, selector: String): Unit
  }
  object ButtonRenderer {
    
    inline def apply(render: (AccessToken, String) => Callback): ButtonRenderer = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction2((t0: AccessToken, t1: String) => (render(t0, t1)).runNow()))
      __obj.asInstanceOf[ButtonRenderer]
    }
    
    extension [Self <: ButtonRenderer](x: Self) {
      
      inline def setRender(value: (AccessToken, String) => Callback): Self = StObject.set(x, "render", js.Any.fromFunction2((t0: AccessToken, t1: String) => (value(t0, t1)).runNow()))
    }
  }
  
  @js.native
  trait ButtonsRenderer extends StObject {
    
    def apply(options: CreateBillingAgreement): ButtonsRenderer = js.native
    
    def render(selector: String): Unit = js.native
  }
}
