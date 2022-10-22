package typingsJapgolly.strongholdPayJs.mod.global.Stronghold

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChargeOptions
  extends StObject
     with Options {
  
  var authorizeOnly: js.UndefOr[Boolean] = js.undefined
  
  var charge: ChargeDropin
  
  def onSuccess(charge: Charge): Unit
  @JSName("onSuccess")
  var onSuccess_Original: ChargeOnSuccess
  
  var tip: js.UndefOr[TipDataDropin] = js.undefined
}
object ChargeOptions {
  
  inline def apply(charge: ChargeDropin, onSuccess: /* charge */ Charge => Callback): ChargeOptions = {
    val __obj = js.Dynamic.literal(charge = charge.asInstanceOf[js.Any], onSuccess = js.Any.fromFunction1((t0: /* charge */ Charge) => onSuccess(t0).runNow()))
    __obj.asInstanceOf[ChargeOptions]
  }
  
  extension [Self <: ChargeOptions](x: Self) {
    
    inline def setAuthorizeOnly(value: Boolean): Self = StObject.set(x, "authorizeOnly", value.asInstanceOf[js.Any])
    
    inline def setAuthorizeOnlyUndefined: Self = StObject.set(x, "authorizeOnly", js.undefined)
    
    inline def setCharge(value: ChargeDropin): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
    
    inline def setOnSuccess(value: /* charge */ Charge => Callback): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1((t0: /* charge */ Charge) => value(t0).runNow()))
    
    inline def setTip(value: TipDataDropin): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
    
    inline def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
  }
}
