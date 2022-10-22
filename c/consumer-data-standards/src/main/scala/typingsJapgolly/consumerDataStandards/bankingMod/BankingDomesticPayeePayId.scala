package typingsJapgolly.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.ABN
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.EMAIL
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.ORG_IDENTIFIER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.TELEPHONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingDomesticPayeePayId
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The identifier of the PayID (dependent on type)
    */
  var identifier: String
  
  /**
    * The name assigned to the PayID by the owner of the PayID
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the PayID
    */
  var `type`: ABN | EMAIL | ORG_IDENTIFIER | TELEPHONE
}
object BankingDomesticPayeePayId {
  
  inline def apply(identifier: String, `type`: ABN | EMAIL | ORG_IDENTIFIER | TELEPHONE): BankingDomesticPayeePayId = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingDomesticPayeePayId]
  }
  
  extension [Self <: BankingDomesticPayeePayId](x: Self) {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: ABN | EMAIL | ORG_IDENTIFIER | TELEPHONE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
