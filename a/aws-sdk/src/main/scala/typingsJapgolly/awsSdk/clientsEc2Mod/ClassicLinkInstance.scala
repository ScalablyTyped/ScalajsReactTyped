package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassicLinkInstance extends StObject {
  
  /**
    * A list of security groups.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * Any tags assigned to the instance.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object ClassicLinkInstance {
  
  inline def apply(): ClassicLinkInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassicLinkInstance]
  }
  
  extension [Self <: ClassicLinkInstance](x: Self) {
    
    inline def setGroups(value: GroupIdentifierList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: GroupIdentifier*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
