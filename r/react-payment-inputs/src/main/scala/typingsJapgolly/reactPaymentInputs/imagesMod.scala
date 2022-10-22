package typingsJapgolly.reactPaymentInputs

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagesMod {
  
  @JSImport("react-payment-inputs/images", "images")
  @js.native
  val images: CardImages = js.native
  
  trait CardImages extends StObject {
    
    var amex: Element
    
    var dinersclub: Element
    
    var discover: Element
    
    var hipercard: Element
    
    var jcb: Element
    
    var mastercard: Element
    
    var placeholder: Element
    
    var unionpay: Element
    
    var visa: Element
  }
  object CardImages {
    
    inline def apply(
      amex: VdomElement,
      dinersclub: VdomElement,
      discover: VdomElement,
      hipercard: VdomElement,
      jcb: VdomElement,
      mastercard: VdomElement,
      placeholder: VdomElement,
      unionpay: VdomElement,
      visa: VdomElement
    ): CardImages = {
      val __obj = js.Dynamic.literal(amex = amex.rawElement.asInstanceOf[js.Any], dinersclub = dinersclub.rawElement.asInstanceOf[js.Any], discover = discover.rawElement.asInstanceOf[js.Any], hipercard = hipercard.rawElement.asInstanceOf[js.Any], jcb = jcb.rawElement.asInstanceOf[js.Any], mastercard = mastercard.rawElement.asInstanceOf[js.Any], placeholder = placeholder.rawElement.asInstanceOf[js.Any], unionpay = unionpay.rawElement.asInstanceOf[js.Any], visa = visa.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardImages]
    }
    
    extension [Self <: CardImages](x: Self) {
      
      inline def setAmex(value: VdomElement): Self = StObject.set(x, "amex", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDinersclub(value: VdomElement): Self = StObject.set(x, "dinersclub", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDiscover(value: VdomElement): Self = StObject.set(x, "discover", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHipercard(value: VdomElement): Self = StObject.set(x, "hipercard", value.rawElement.asInstanceOf[js.Any])
      
      inline def setJcb(value: VdomElement): Self = StObject.set(x, "jcb", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMastercard(value: VdomElement): Self = StObject.set(x, "mastercard", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: VdomElement): Self = StObject.set(x, "placeholder", value.rawElement.asInstanceOf[js.Any])
      
      inline def setUnionpay(value: VdomElement): Self = StObject.set(x, "unionpay", value.rawElement.asInstanceOf[js.Any])
      
      inline def setVisa(value: VdomElement): Self = StObject.set(x, "visa", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
