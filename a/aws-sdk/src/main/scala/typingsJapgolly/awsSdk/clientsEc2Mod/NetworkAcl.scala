package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkAcl extends StObject {
  
  /**
    * Any associations between the network ACL and one or more subnets
    */
  var Associations: js.UndefOr[NetworkAclAssociationList] = js.undefined
  
  /**
    * One or more entries (rules) in the network ACL.
    */
  var Entries: js.UndefOr[NetworkAclEntryList] = js.undefined
  
  /**
    * Indicates whether this is the default network ACL for the VPC.
    */
  var IsDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the network ACL.
    */
  var NetworkAclId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the network ACL.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Any tags assigned to the network ACL.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the VPC for the network ACL.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object NetworkAcl {
  
  inline def apply(): NetworkAcl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkAcl]
  }
  
  extension [Self <: NetworkAcl](x: Self) {
    
    inline def setAssociations(value: NetworkAclAssociationList): Self = StObject.set(x, "Associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "Associations", js.undefined)
    
    inline def setAssociationsVarargs(value: NetworkAclAssociation*): Self = StObject.set(x, "Associations", js.Array(value*))
    
    inline def setEntries(value: NetworkAclEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "Entries", js.undefined)
    
    inline def setEntriesVarargs(value: NetworkAclEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "IsDefault", js.undefined)
    
    inline def setNetworkAclId(value: String): Self = StObject.set(x, "NetworkAclId", value.asInstanceOf[js.Any])
    
    inline def setNetworkAclIdUndefined: Self = StObject.set(x, "NetworkAclId", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
