package typingsJapgolly.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicDnsPropertiesMutableChange extends StObject {
  
  /**
    * Updated fields for the Start of Authority (SOA) record for the hosted zone for the public DNS namespace.
    */
  var SOA: SOAChange
}
object PublicDnsPropertiesMutableChange {
  
  inline def apply(SOA: SOAChange): PublicDnsPropertiesMutableChange = {
    val __obj = js.Dynamic.literal(SOA = SOA.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicDnsPropertiesMutableChange]
  }
  
  extension [Self <: PublicDnsPropertiesMutableChange](x: Self) {
    
    inline def setSOA(value: SOAChange): Self = StObject.set(x, "SOA", value.asInstanceOf[js.Any])
  }
}
