package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateManagedPrefixListRequest extends StObject {
  
  /**
    * The IP address type. Valid Values: IPv4 | IPv6 
    */
  var AddressFamily: String
  
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency. Constraints: Up to 255 UTF-8 characters in length.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more entries for the prefix list.
    */
  var Entries: js.UndefOr[AddPrefixListEntries] = js.undefined
  
  /**
    * The maximum number of entries for the prefix list.
    */
  var MaxEntries: Integer
  
  /**
    * A name for the prefix list. Constraints: Up to 255 characters in length. The name cannot start with com.amazonaws.
    */
  var PrefixListName: String
  
  /**
    * The tags to apply to the prefix list during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreateManagedPrefixListRequest {
  
  inline def apply(AddressFamily: String, MaxEntries: Integer, PrefixListName: String): CreateManagedPrefixListRequest = {
    val __obj = js.Dynamic.literal(AddressFamily = AddressFamily.asInstanceOf[js.Any], MaxEntries = MaxEntries.asInstanceOf[js.Any], PrefixListName = PrefixListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateManagedPrefixListRequest]
  }
  
  extension [Self <: CreateManagedPrefixListRequest](x: Self) {
    
    inline def setAddressFamily(value: String): Self = StObject.set(x, "AddressFamily", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEntries(value: AddPrefixListEntries): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "Entries", js.undefined)
    
    inline def setEntriesVarargs(value: AddPrefixListEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
    
    inline def setMaxEntries(value: Integer): Self = StObject.set(x, "MaxEntries", value.asInstanceOf[js.Any])
    
    inline def setPrefixListName(value: String): Self = StObject.set(x, "PrefixListName", value.asInstanceOf[js.Any])
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
