package typingsJapgolly.reactCreditCards.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCreditCards.anon.Name
import typingsJapgolly.reactCreditCards.anon.Valid
import typingsJapgolly.reactCreditCards.mod.CallbackArgument
import typingsJapgolly.reactCreditCards.mod.Focused
import typingsJapgolly.reactCreditCards.mod.ReactCreditCardProps
import typingsJapgolly.reactCreditCards.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCreditCards {
  
  inline def apply(cvc: String | Double, expiry: String | Double, name: String, number: String | Double): Builder = {
    val __props = js.Dynamic.literal(cvc = cvc.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactCreditCardProps]))
  }
  
  @JSImport("react-credit-cards", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def acceptedCards(value: js.Array[String]): this.type = set("acceptedCards", value.asInstanceOf[js.Any])
    
    inline def acceptedCardsVarargs(value: String*): this.type = set("acceptedCards", js.Array(value*))
    
    inline def callback(value: (/* type */ CallbackArgument, /* isValid */ Boolean) => Callback): this.type = set("callback", js.Any.fromFunction2((t0: /* type */ CallbackArgument, t1: /* isValid */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def focused(value: Focused): this.type = set("focused", value.asInstanceOf[js.Any])
    
    inline def issuer(value: String): this.type = set("issuer", value.asInstanceOf[js.Any])
    
    inline def locale(value: Valid): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def placeholders(value: Name): this.type = set("placeholders", value.asInstanceOf[js.Any])
    
    inline def preview(value: Boolean): this.type = set("preview", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactCreditCardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
