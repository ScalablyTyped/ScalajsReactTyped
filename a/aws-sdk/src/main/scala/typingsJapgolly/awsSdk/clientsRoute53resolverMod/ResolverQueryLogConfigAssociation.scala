package typingsJapgolly.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolverQueryLogConfigAssociation extends StObject {
  
  /**
    * The date and time that the VPC was associated with the query logging configuration, in Unix time format and Coordinated Universal Time (UTC).
    */
  var CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
  
  /**
    * If the value of Status is FAILED, the value of Error indicates the cause:    DESTINATION_NOT_FOUND: The specified destination (for example, an Amazon S3 bucket) was deleted.    ACCESS_DENIED: Permissions don't allow sending logs to the destination.   If the value of Status is a value other than FAILED, Error is null. 
    */
  var Error: js.UndefOr[ResolverQueryLogConfigAssociationError] = js.undefined
  
  /**
    * Contains additional information about the error. If the value or Error is null, the value of ErrorMessage also is null.
    */
  var ErrorMessage: js.UndefOr[ResolverQueryLogConfigAssociationErrorMessage] = js.undefined
  
  /**
    * The ID of the query logging association.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The ID of the query logging configuration that a VPC is associated with.
    */
  var ResolverQueryLogConfigId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The ID of the Amazon VPC that is associated with the query logging configuration.
    */
  var ResourceId: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53resolverMod.ResourceId] = js.undefined
  
  /**
    * The status of the specified query logging association. Valid values include the following:    CREATING: Resolver is creating an association between an Amazon VPC and a query logging configuration.    CREATED: The association between an Amazon VPC and a query logging configuration was successfully created. Resolver is logging queries that originate in the specified VPC.    DELETING: Resolver is deleting this query logging association.    FAILED: Resolver either couldn't create or couldn't delete the query logging association.  
    */
  var Status: js.UndefOr[ResolverQueryLogConfigAssociationStatus] = js.undefined
}
object ResolverQueryLogConfigAssociation {
  
  inline def apply(): ResolverQueryLogConfigAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverQueryLogConfigAssociation]
  }
  
  extension [Self <: ResolverQueryLogConfigAssociation](x: Self) {
    
    inline def setCreationTime(value: Rfc3339TimeString): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setError(value: ResolverQueryLogConfigAssociationError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: ResolverQueryLogConfigAssociationErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setResolverQueryLogConfigId(value: ResourceId): Self = StObject.set(x, "ResolverQueryLogConfigId", value.asInstanceOf[js.Any])
    
    inline def setResolverQueryLogConfigIdUndefined: Self = StObject.set(x, "ResolverQueryLogConfigId", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setStatus(value: ResolverQueryLogConfigAssociationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
