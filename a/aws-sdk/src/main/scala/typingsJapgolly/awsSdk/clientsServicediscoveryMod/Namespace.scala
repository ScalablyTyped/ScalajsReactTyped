package typingsJapgolly.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Namespace extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that Cloud Map assigns to the namespace when you create it.
    */
  var Arn: js.UndefOr[typingsJapgolly.awsSdk.clientsServicediscoveryMod.Arn] = js.undefined
  
  /**
    * The date that the namespace was created, in Unix date/time format and Coordinated Universal Time (UTC). The value of CreateDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A unique string that identifies the request and that allows failed requests to be retried without the risk of running an operation twice. 
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The description that you specify for the namespace when you create it.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * The ID of a namespace.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The name of the namespace, such as example.com.
    */
  var Name: js.UndefOr[NamespaceName] = js.undefined
  
  /**
    * A complex type that contains information that's specific to the type of the namespace.
    */
  var Properties: js.UndefOr[NamespaceProperties] = js.undefined
  
  /**
    * The number of services that are associated with the namespace.
    */
  var ServiceCount: js.UndefOr[ResourceCount] = js.undefined
  
  /**
    * The type of the namespace. The methods for discovering instances depends on the value that you specify:  HTTP  Instances can be discovered only programmatically, using the Cloud Map DiscoverInstances API.  DNS_PUBLIC  Instances can be discovered using public DNS queries and using the DiscoverInstances API.  DNS_PRIVATE  Instances can be discovered using DNS queries in VPCs and using the DiscoverInstances API.  
    */
  var Type: js.UndefOr[NamespaceType] = js.undefined
}
object Namespace {
  
  inline def apply(): Namespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Namespace]
  }
  
  extension [Self <: Namespace](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setCreatorRequestId(value: ResourceId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: NamespaceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setProperties(value: NamespaceProperties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    inline def setServiceCount(value: ResourceCount): Self = StObject.set(x, "ServiceCount", value.asInstanceOf[js.Any])
    
    inline def setServiceCountUndefined: Self = StObject.set(x, "ServiceCount", js.undefined)
    
    inline def setType(value: NamespaceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
