package typingsJapgolly.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.ACTIVE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.REVOKED
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.SURRENDERED
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.SUSPENDED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Unique id of the Data Recipient Legal Entity issued by the CDR Register
    */
  var legalEntityId: String
  
  /**
    * Data Recipient status in the CDR Register
    */
  var status: ACTIVE | SUSPENDED | REVOKED | SURRENDERED
}
object Status {
  
  inline def apply(legalEntityId: String, status: ACTIVE | SUSPENDED | REVOKED | SURRENDERED): Status = {
    val __obj = js.Dynamic.literal(legalEntityId = legalEntityId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  extension [Self <: Status](x: Self) {
    
    inline def setLegalEntityId(value: String): Self = StObject.set(x, "legalEntityId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ACTIVE | SUSPENDED | REVOKED | SURRENDERED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
