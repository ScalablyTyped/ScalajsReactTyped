package typingsJapgolly.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorisedEntity
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * A unique ID of the account adhering to the standards for ID permanence.
    */
  var accountId: String
  
  var authorisedEntity: Abn
  
  /**
    * The amount of the last debit executed under this authorisation
    */
  var lastDebitAmount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date and time of the last debit executed under this authorisation
    */
  var lastDebitDateTime: js.UndefOr[String | Null] = js.undefined
}
object AuthorisedEntity {
  
  inline def apply(accountId: String, authorisedEntity: Abn): AuthorisedEntity = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], authorisedEntity = authorisedEntity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorisedEntity]
  }
  
  extension [Self <: AuthorisedEntity](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAuthorisedEntity(value: Abn): Self = StObject.set(x, "authorisedEntity", value.asInstanceOf[js.Any])
    
    inline def setLastDebitAmount(value: String): Self = StObject.set(x, "lastDebitAmount", value.asInstanceOf[js.Any])
    
    inline def setLastDebitAmountNull: Self = StObject.set(x, "lastDebitAmount", null)
    
    inline def setLastDebitAmountUndefined: Self = StObject.set(x, "lastDebitAmount", js.undefined)
    
    inline def setLastDebitDateTime(value: String): Self = StObject.set(x, "lastDebitDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastDebitDateTimeNull: Self = StObject.set(x, "lastDebitDateTime", null)
    
    inline def setLastDebitDateTimeUndefined: Self = StObject.set(x, "lastDebitDateTime", js.undefined)
  }
}
