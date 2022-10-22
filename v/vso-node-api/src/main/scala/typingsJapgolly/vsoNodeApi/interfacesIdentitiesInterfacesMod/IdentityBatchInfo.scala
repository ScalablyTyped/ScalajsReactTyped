package typingsJapgolly.vsoNodeApi.interfacesIdentitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityBatchInfo extends StObject {
  
  var descriptors: js.Array[IdentityDescriptor]
  
  var identityIds: js.Array[String]
  
  var includeRestrictedVisibility: Boolean
  
  var propertyNames: js.Array[String]
  
  var queryMembership: QueryMembership
}
object IdentityBatchInfo {
  
  inline def apply(
    descriptors: js.Array[IdentityDescriptor],
    identityIds: js.Array[String],
    includeRestrictedVisibility: Boolean,
    propertyNames: js.Array[String],
    queryMembership: QueryMembership
  ): IdentityBatchInfo = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], identityIds = identityIds.asInstanceOf[js.Any], includeRestrictedVisibility = includeRestrictedVisibility.asInstanceOf[js.Any], propertyNames = propertyNames.asInstanceOf[js.Any], queryMembership = queryMembership.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityBatchInfo]
  }
  
  extension [Self <: IdentityBatchInfo](x: Self) {
    
    inline def setDescriptors(value: js.Array[IdentityDescriptor]): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    inline def setDescriptorsVarargs(value: IdentityDescriptor*): Self = StObject.set(x, "descriptors", js.Array(value*))
    
    inline def setIdentityIds(value: js.Array[String]): Self = StObject.set(x, "identityIds", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdsVarargs(value: String*): Self = StObject.set(x, "identityIds", js.Array(value*))
    
    inline def setIncludeRestrictedVisibility(value: Boolean): Self = StObject.set(x, "includeRestrictedVisibility", value.asInstanceOf[js.Any])
    
    inline def setPropertyNames(value: js.Array[String]): Self = StObject.set(x, "propertyNames", value.asInstanceOf[js.Any])
    
    inline def setPropertyNamesVarargs(value: String*): Self = StObject.set(x, "propertyNames", js.Array(value*))
    
    inline def setQueryMembership(value: QueryMembership): Self = StObject.set(x, "queryMembership", value.asInstanceOf[js.Any])
  }
}
