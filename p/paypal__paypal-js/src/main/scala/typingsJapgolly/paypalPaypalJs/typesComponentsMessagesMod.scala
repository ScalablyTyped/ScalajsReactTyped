package typingsJapgolly.paypalPaypalJs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.paypalPaypalJs.anon.Layout
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.EUR
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.GBP
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.USD
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.cart
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.category
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.home
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.payment
import typingsJapgolly.paypalPaypalJs.paypalPaypalJsStrings.product
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesComponentsMessagesMod {
  
  @js.native
  trait PayPalMessagesComponent extends StObject {
    
    def render(container: String): js.Promise[Unit] = js.native
    def render(container: HTMLElement): js.Promise[Unit] = js.native
  }
  
  trait PayPalMessagesComponentOptions extends StObject {
    
    var amount: js.UndefOr[Double | String] = js.undefined
    
    var currency: js.UndefOr[USD | GBP | EUR] = js.undefined
    
    var onApply: js.UndefOr[js.Function1[/* data */ Record[String, Any], Unit]] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* data */ Record[String, Any], Unit]] = js.undefined
    
    var onRender: js.UndefOr[js.Function1[/* data */ Record[String, Any], Unit]] = js.undefined
    
    var placement: js.UndefOr[home | category | product | cart | payment] = js.undefined
    
    var style: js.UndefOr[Layout] = js.undefined
  }
  object PayPalMessagesComponentOptions {
    
    inline def apply(): PayPalMessagesComponentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PayPalMessagesComponentOptions]
    }
    
    extension [Self <: PayPalMessagesComponentOptions](x: Self) {
      
      inline def setAmount(value: Double | String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setCurrency(value: USD | GBP | EUR): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setOnApply(value: /* data */ Record[String, Any] => Callback): Self = StObject.set(x, "onApply", js.Any.fromFunction1((t0: /* data */ Record[String, Any]) => value(t0).runNow()))
      
      inline def setOnApplyUndefined: Self = StObject.set(x, "onApply", js.undefined)
      
      inline def setOnClick(value: /* data */ Record[String, Any] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* data */ Record[String, Any]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnRender(value: /* data */ Record[String, Any] => Callback): Self = StObject.set(x, "onRender", js.Any.fromFunction1((t0: /* data */ Record[String, Any]) => value(t0).runNow()))
      
      inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
      
      inline def setPlacement(value: home | category | product | cart | payment): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setStyle(value: Layout): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
