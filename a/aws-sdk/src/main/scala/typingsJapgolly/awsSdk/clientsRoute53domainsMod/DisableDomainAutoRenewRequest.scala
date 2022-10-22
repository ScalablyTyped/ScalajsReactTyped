package typingsJapgolly.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableDomainAutoRenewRequest extends StObject {
  
  /**
    * The name of the domain that you want to disable automatic renewal for.
    */
  var DomainName: typingsJapgolly.awsSdk.clientsRoute53domainsMod.DomainName
}
object DisableDomainAutoRenewRequest {
  
  inline def apply(DomainName: DomainName): DisableDomainAutoRenewRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableDomainAutoRenewRequest]
  }
  
  extension [Self <: DisableDomainAutoRenewRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
