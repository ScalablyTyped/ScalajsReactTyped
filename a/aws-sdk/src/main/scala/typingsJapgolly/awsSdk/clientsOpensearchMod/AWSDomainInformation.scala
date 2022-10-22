package typingsJapgolly.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AWSDomainInformation extends StObject {
  
  var DomainName: typingsJapgolly.awsSdk.clientsOpensearchMod.DomainName
  
  var OwnerId: js.UndefOr[typingsJapgolly.awsSdk.clientsOpensearchMod.OwnerId] = js.undefined
  
  var Region: js.UndefOr[typingsJapgolly.awsSdk.clientsOpensearchMod.Region] = js.undefined
}
object AWSDomainInformation {
  
  inline def apply(DomainName: DomainName): AWSDomainInformation = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AWSDomainInformation]
  }
  
  extension [Self <: AWSDomainInformation](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setOwnerId(value: OwnerId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setRegion(value: Region): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
  }
}
