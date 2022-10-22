package typingsJapgolly.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.ACTIVE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.INACTIVE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.REMOVED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoftwareProductId
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Unique id of the software product issued by the CDR Register
    */
  var softwareProductId: String
  
  /**
    * Software product status in the CDR Register
    */
  var status: ACTIVE | INACTIVE | REMOVED
}
object SoftwareProductId {
  
  inline def apply(softwareProductId: String, status: ACTIVE | INACTIVE | REMOVED): SoftwareProductId = {
    val __obj = js.Dynamic.literal(softwareProductId = softwareProductId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftwareProductId]
  }
  
  extension [Self <: SoftwareProductId](x: Self) {
    
    inline def setSoftwareProductId(value: String): Self = StObject.set(x, "softwareProductId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ACTIVE | INACTIVE | REMOVED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
