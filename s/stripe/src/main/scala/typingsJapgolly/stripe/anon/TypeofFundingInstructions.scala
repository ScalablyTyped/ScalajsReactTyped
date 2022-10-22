package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFundingInstructions extends StObject {
  
  val BankTransfer: TypeofBankTransferFinancialAddress
}
object TypeofFundingInstructions {
  
  inline def apply(BankTransfer: TypeofBankTransferFinancialAddress): TypeofFundingInstructions = {
    val __obj = js.Dynamic.literal(BankTransfer = BankTransfer.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFundingInstructions]
  }
  
  extension [Self <: TypeofFundingInstructions](x: Self) {
    
    inline def setBankTransfer(value: TypeofBankTransferFinancialAddress): Self = StObject.set(x, "BankTransfer", value.asInstanceOf[js.Any])
  }
}
