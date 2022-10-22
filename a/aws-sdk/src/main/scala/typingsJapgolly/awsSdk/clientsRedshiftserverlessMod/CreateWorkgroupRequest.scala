package typingsJapgolly.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkgroupRequest extends StObject {
  
  /**
    * The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
    */
  var baseCapacity: js.UndefOr[Integer] = js.undefined
  
  /**
    * An array of parameters to set for more control over a serverless database. The options are datestyle, enable_user_activity_logging, query_group, search_path, and max_query_execution_time.
    */
  var configParameters: js.UndefOr[ConfigParameterList] = js.undefined
  
  /**
    * The value that specifies whether to turn on enhanced virtual private cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC instead of over the internet.
    */
  var enhancedVpcRouting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the namespace to associate with the workgroup.
    */
  var namespaceName: NamespaceName
  
  /**
    * A value that specifies whether the workgroup can be accessed from a public network.
    */
  var publiclyAccessible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of security group IDs to associate with the workgroup.
    */
  var securityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined
  
  /**
    * An array of VPC subnet IDs to associate with the workgroup.
    */
  var subnetIds: js.UndefOr[SubnetIdList] = js.undefined
  
  /**
    * A array of tag instances.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The name of the created workgroup.
    */
  var workgroupName: WorkgroupName
}
object CreateWorkgroupRequest {
  
  inline def apply(namespaceName: NamespaceName, workgroupName: WorkgroupName): CreateWorkgroupRequest = {
    val __obj = js.Dynamic.literal(namespaceName = namespaceName.asInstanceOf[js.Any], workgroupName = workgroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkgroupRequest]
  }
  
  extension [Self <: CreateWorkgroupRequest](x: Self) {
    
    inline def setBaseCapacity(value: Integer): Self = StObject.set(x, "baseCapacity", value.asInstanceOf[js.Any])
    
    inline def setBaseCapacityUndefined: Self = StObject.set(x, "baseCapacity", js.undefined)
    
    inline def setConfigParameters(value: ConfigParameterList): Self = StObject.set(x, "configParameters", value.asInstanceOf[js.Any])
    
    inline def setConfigParametersUndefined: Self = StObject.set(x, "configParameters", js.undefined)
    
    inline def setConfigParametersVarargs(value: ConfigParameter*): Self = StObject.set(x, "configParameters", js.Array(value*))
    
    inline def setEnhancedVpcRouting(value: Boolean): Self = StObject.set(x, "enhancedVpcRouting", value.asInstanceOf[js.Any])
    
    inline def setEnhancedVpcRoutingUndefined: Self = StObject.set(x, "enhancedVpcRouting", js.undefined)
    
    inline def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessible(value: Boolean): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
    
    inline def setSecurityGroupIds(value: SecurityGroupIdList): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "securityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: SubnetIdList): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "subnetIds", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setWorkgroupName(value: WorkgroupName): Self = StObject.set(x, "workgroupName", value.asInstanceOf[js.Any])
  }
}
