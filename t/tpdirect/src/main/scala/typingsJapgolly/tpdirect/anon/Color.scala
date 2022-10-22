package typingsJapgolly.tpdirect.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.tpdirect.tpdirectStrings.black
import typingsJapgolly.tpdirect.tpdirectStrings.long
import typingsJapgolly.tpdirect.tpdirectStrings.short
import typingsJapgolly.tpdirect.tpdirectStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var color: black | white
  
  var el: String
  
  /**
    * @description Use either TPDirect.googlePay.getPrime(callback) or TPDirect.googlePay.setupGooglePayButton({getPrimeCallback})
    */
  var getPrimeCallback: js.UndefOr[
    js.Function3[
      /* err */ Msg, 
      /* prime */ PickBaseResultprime, 
      /* result */ PickBaseResultclientipMer, 
      Unit
    ]
  ] = js.undefined
  
  var `type`: long | short
}
object Color {
  
  inline def apply(color: black | white, el: String, `type`: long | short): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setColor(value: black | white): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setEl(value: String): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setGetPrimeCallback(
      value: (/* err */ Msg, /* prime */ PickBaseResultprime, /* result */ PickBaseResultclientipMer) => Callback
    ): Self = StObject.set(x, "getPrimeCallback", js.Any.fromFunction3((t0: /* err */ Msg, t1: /* prime */ PickBaseResultprime, t2: /* result */ PickBaseResultclientipMer) => (value(t0, t1, t2)).runNow()))
    
    inline def setGetPrimeCallbackUndefined: Self = StObject.set(x, "getPrimeCallback", js.undefined)
    
    inline def setType(value: long | short): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
