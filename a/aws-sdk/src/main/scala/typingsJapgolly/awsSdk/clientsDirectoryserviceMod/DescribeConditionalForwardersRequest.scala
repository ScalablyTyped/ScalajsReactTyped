package typingsJapgolly.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConditionalForwardersRequest extends StObject {
  
  /**
    * The directory ID for which to get the list of associated conditional forwarders.
    */
  var DirectoryId: typingsJapgolly.awsSdk.clientsDirectoryserviceMod.DirectoryId
  
  /**
    * The fully qualified domain names (FQDN) of the remote domains for which to get the list of associated conditional forwarders. If this member is null, all conditional forwarders are returned.
    */
  var RemoteDomainNames: js.UndefOr[typingsJapgolly.awsSdk.clientsDirectoryserviceMod.RemoteDomainNames] = js.undefined
}
object DescribeConditionalForwardersRequest {
  
  inline def apply(DirectoryId: DirectoryId): DescribeConditionalForwardersRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConditionalForwardersRequest]
  }
  
  extension [Self <: DescribeConditionalForwardersRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setRemoteDomainNames(value: RemoteDomainNames): Self = StObject.set(x, "RemoteDomainNames", value.asInstanceOf[js.Any])
    
    inline def setRemoteDomainNamesUndefined: Self = StObject.set(x, "RemoteDomainNames", js.undefined)
    
    inline def setRemoteDomainNamesVarargs(value: RemoteDomainName*): Self = StObject.set(x, "RemoteDomainNames", js.Array(value*))
  }
}
