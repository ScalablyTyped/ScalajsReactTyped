package typingsJapgolly.awsSdk.clientsMediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackagingGroup extends StObject {
  
  /**
    * The ARN of the PackagingGroup.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  var Authorization: js.UndefOr[typingsJapgolly.awsSdk.clientsMediapackagevodMod.Authorization] = js.undefined
  
  /**
    * The fully qualified domain name for Assets in the PackagingGroup.
    */
  var DomainName: js.UndefOr[string] = js.undefined
  
  var EgressAccessLogs: js.UndefOr[typingsJapgolly.awsSdk.clientsMediapackagevodMod.EgressAccessLogs] = js.undefined
  
  /**
    * The ID of the PackagingGroup.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.clientsMediapackagevodMod.Tags] = js.undefined
}
object PackagingGroup {
  
  inline def apply(): PackagingGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackagingGroup]
  }
  
  extension [Self <: PackagingGroup](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAuthorization(value: Authorization): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "Authorization", js.undefined)
    
    inline def setDomainName(value: string): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setEgressAccessLogs(value: EgressAccessLogs): Self = StObject.set(x, "EgressAccessLogs", value.asInstanceOf[js.Any])
    
    inline def setEgressAccessLogsUndefined: Self = StObject.set(x, "EgressAccessLogs", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
