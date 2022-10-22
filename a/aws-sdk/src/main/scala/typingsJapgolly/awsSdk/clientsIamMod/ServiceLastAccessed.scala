package typingsJapgolly.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceLastAccessed extends StObject {
  
  /**
    * The date and time, in ISO 8601 date-time format, when an authenticated entity most recently attempted to access the service. Amazon Web Services does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the tracking period.
    */
  var LastAuthenticated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the authenticated entity (user or role) that last attempted to access the service. Amazon Web Services does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the tracking period.
    */
  var LastAuthenticatedEntity: js.UndefOr[arnType] = js.undefined
  
  /**
    * The Region from which the authenticated entity (user or role) last attempted to access the service. Amazon Web Services does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the tracking period.
    */
  var LastAuthenticatedRegion: js.UndefOr[stringType] = js.undefined
  
  /**
    * The name of the service in which access was attempted.
    */
  var ServiceName: serviceNameType
  
  /**
    * The namespace of the service in which access was attempted. To learn the service namespace of a service, see Actions, resources, and condition keys for Amazon Web Services services in the Service Authorization Reference. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, (service prefix: a4b). For more information about service namespaces, see Amazon Web Services Service Namespaces in the Amazon Web Services General Reference.
    */
  var ServiceNamespace: serviceNamespaceType
  
  /**
    * The total number of authenticated principals (root user, IAM users, or IAM roles) that have attempted to access the service. This field is null if no principals attempted to access the service within the tracking period.
    */
  var TotalAuthenticatedEntities: js.UndefOr[integerType] = js.undefined
  
  /**
    * An object that contains details about the most recent attempt to access a tracked action within the service. This field is null if there no tracked actions or if the principal did not use the tracked actions within the tracking period. This field is also null if the report was generated at the service level and not the action level. For more information, see the Granularity field in GenerateServiceLastAccessedDetails.
    */
  var TrackedActionsLastAccessed: js.UndefOr[typingsJapgolly.awsSdk.clientsIamMod.TrackedActionsLastAccessed] = js.undefined
}
object ServiceLastAccessed {
  
  inline def apply(ServiceName: serviceNameType, ServiceNamespace: serviceNamespaceType): ServiceLastAccessed = {
    val __obj = js.Dynamic.literal(ServiceName = ServiceName.asInstanceOf[js.Any], ServiceNamespace = ServiceNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceLastAccessed]
  }
  
  extension [Self <: ServiceLastAccessed](x: Self) {
    
    inline def setLastAuthenticated(value: js.Date): Self = StObject.set(x, "LastAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setLastAuthenticatedEntity(value: arnType): Self = StObject.set(x, "LastAuthenticatedEntity", value.asInstanceOf[js.Any])
    
    inline def setLastAuthenticatedEntityUndefined: Self = StObject.set(x, "LastAuthenticatedEntity", js.undefined)
    
    inline def setLastAuthenticatedRegion(value: stringType): Self = StObject.set(x, "LastAuthenticatedRegion", value.asInstanceOf[js.Any])
    
    inline def setLastAuthenticatedRegionUndefined: Self = StObject.set(x, "LastAuthenticatedRegion", js.undefined)
    
    inline def setLastAuthenticatedUndefined: Self = StObject.set(x, "LastAuthenticated", js.undefined)
    
    inline def setServiceName(value: serviceNameType): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNamespace(value: serviceNamespaceType): Self = StObject.set(x, "ServiceNamespace", value.asInstanceOf[js.Any])
    
    inline def setTotalAuthenticatedEntities(value: integerType): Self = StObject.set(x, "TotalAuthenticatedEntities", value.asInstanceOf[js.Any])
    
    inline def setTotalAuthenticatedEntitiesUndefined: Self = StObject.set(x, "TotalAuthenticatedEntities", js.undefined)
    
    inline def setTrackedActionsLastAccessed(value: TrackedActionsLastAccessed): Self = StObject.set(x, "TrackedActionsLastAccessed", value.asInstanceOf[js.Any])
    
    inline def setTrackedActionsLastAccessedUndefined: Self = StObject.set(x, "TrackedActionsLastAccessed", js.undefined)
    
    inline def setTrackedActionsLastAccessedVarargs(value: TrackedActionLastAccessed*): Self = StObject.set(x, "TrackedActionsLastAccessed", js.Array(value*))
  }
}
