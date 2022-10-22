package typingsJapgolly.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainRequest extends StObject {
  
  /**
    * The identifier of the domain you are describing.
    */
  var DomainId: typingsJapgolly.awsSdk.clientsVoiceidMod.DomainId
}
object DescribeDomainRequest {
  
  inline def apply(DomainId: DomainId): DescribeDomainRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainRequest]
  }
  
  extension [Self <: DescribeDomainRequest](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
  }
}
