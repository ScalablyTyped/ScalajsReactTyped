package typingsJapgolly.strongholdPayJs.mod.global.Stronghold

import typingsJapgolly.strongholdPayJs.anon.DisplayMessage_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TipDataDropin extends StObject {
  
  /**
    * The amount to charge, specified in the smallest divisible currency unit. For example, number of cents of United States dollar.
    */
  var amount: Double
  
  var beneficiaryName: String
  
  var details: js.UndefOr[DisplayMessage_] = js.undefined
}
object TipDataDropin {
  
  inline def apply(amount: Double, beneficiaryName: String): TipDataDropin = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], beneficiaryName = beneficiaryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TipDataDropin]
  }
  
  extension [Self <: TipDataDropin](x: Self) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBeneficiaryName(value: String): Self = StObject.set(x, "beneficiaryName", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: DisplayMessage_): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
