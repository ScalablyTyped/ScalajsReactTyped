package typingsJapgolly.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainResponse extends StObject {
  
  /**
    * The current status of the domain.
    */
  var DomainStatus: typingsJapgolly.awsSdk.clientsOpensearchMod.DomainStatus
}
object DescribeDomainResponse {
  
  inline def apply(DomainStatus: DomainStatus): DescribeDomainResponse = {
    val __obj = js.Dynamic.literal(DomainStatus = DomainStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainResponse]
  }
  
  extension [Self <: DescribeDomainResponse](x: Self) {
    
    inline def setDomainStatus(value: DomainStatus): Self = StObject.set(x, "DomainStatus", value.asInstanceOf[js.Any])
  }
}
