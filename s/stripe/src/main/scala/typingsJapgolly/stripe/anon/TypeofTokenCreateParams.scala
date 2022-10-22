package typingsJapgolly.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTokenCreateParams extends StObject {
  
  val Account: TypeofAccountCompany
  
  val BankAccount: Any
  
  val Person: TypeofPersonDocuments
}
object TypeofTokenCreateParams {
  
  inline def apply(Account: TypeofAccountCompany, BankAccount: Any, Person: TypeofPersonDocuments): TypeofTokenCreateParams = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], BankAccount = BankAccount.asInstanceOf[js.Any], Person = Person.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTokenCreateParams]
  }
  
  extension [Self <: TypeofTokenCreateParams](x: Self) {
    
    inline def setAccount(value: TypeofAccountCompany): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setBankAccount(value: Any): Self = StObject.set(x, "BankAccount", value.asInstanceOf[js.Any])
    
    inline def setPerson(value: TypeofPersonDocuments): Self = StObject.set(x, "Person", value.asInstanceOf[js.Any])
  }
}
