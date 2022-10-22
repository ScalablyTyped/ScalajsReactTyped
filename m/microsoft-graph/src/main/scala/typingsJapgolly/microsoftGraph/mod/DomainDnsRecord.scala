package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainDnsRecord
  extends StObject
     with Entity {
  
  /**
    * If false, this record must be configured by the customer at the DNS host for Microsoft Online Services to operate
    * correctly with the domain.
    */
  var isOptional: js.UndefOr[Boolean] = js.undefined
  
  // Value used when configuring the name of the DNS record at the DNS host.
  var label: js.UndefOr[String] = js.undefined
  
  // Indicates what type of DNS record this entity represents.The value can be one of the following: CName, Mx, Srv, Txt.
  var recordType: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Microsoft Online Service or feature that has a dependency on this DNS record.Can be one of the following values: null,
    * Email, Sharepoint, EmailInternalRelayOnly, OfficeCommunicationsOnline, SharePointDefaultDomain, FullRedelegation,
    * SharePointPublic, OrgIdAuthentication, Yammer, Intune.
    */
  var supportedService: js.UndefOr[String] = js.undefined
  
  // Value to use when configuring the time-to-live (ttl) property of the DNS record at the DNS host. Not nullable.
  var ttl: js.UndefOr[Double] = js.undefined
}
object DomainDnsRecord {
  
  inline def apply(): DomainDnsRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDnsRecord]
  }
  
  extension [Self <: DomainDnsRecord](x: Self) {
    
    inline def setIsOptional(value: Boolean): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
    
    inline def setIsOptionalUndefined: Self = StObject.set(x, "isOptional", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRecordType(value: NullableOption[String]): Self = StObject.set(x, "recordType", value.asInstanceOf[js.Any])
    
    inline def setRecordTypeNull: Self = StObject.set(x, "recordType", null)
    
    inline def setRecordTypeUndefined: Self = StObject.set(x, "recordType", js.undefined)
    
    inline def setSupportedService(value: String): Self = StObject.set(x, "supportedService", value.asInstanceOf[js.Any])
    
    inline def setSupportedServiceUndefined: Self = StObject.set(x, "supportedService", js.undefined)
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
