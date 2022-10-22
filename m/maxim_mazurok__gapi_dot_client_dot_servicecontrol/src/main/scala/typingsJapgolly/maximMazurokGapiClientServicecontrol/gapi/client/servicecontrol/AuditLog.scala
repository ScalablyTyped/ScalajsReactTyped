package typingsJapgolly.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditLog extends StObject {
  
  /** Authentication information. */
  var authenticationInfo: js.UndefOr[AuthenticationInfo] = js.undefined
  
  /** Authorization information. If there are multiple resources or permissions involved, then there is one AuthorizationInfo element for each {resource, permission} tuple. */
  var authorizationInfo: js.UndefOr[js.Array[AuthorizationInfo]] = js.undefined
  
  /** Other service-specific data about the request, response, and other information associated with the current audited event. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /**
    * The name of the service method or operation. For API calls, this should be the name of the API method. For example, "google.cloud.bigquery.v2.TableService.InsertTable"
    * "google.logging.v2.ConfigServiceV2.CreateSink"
    */
  var methodName: js.UndefOr[String] = js.undefined
  
  /** The number of items returned from a List or Query API method, if applicable. */
  var numResponseItems: js.UndefOr[String] = js.undefined
  
  /** Indicates the policy violations for this request. If the request is denied by the policy, violation information will be logged here. */
  var policyViolationInfo: js.UndefOr[PolicyViolationInfo] = js.undefined
  
  /**
    * The operation request. This may not include all request parameters, such as those that are too large, privacy-sensitive, or duplicated elsewhere in the log record. It should never
    * include user-generated data, such as file contents. When the JSON object represented here has a proto equivalent, the proto name will be indicated in the `@‍type` property.
    */
  var request: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** Metadata about the operation. */
  var requestMetadata: js.UndefOr[RequestMetadata] = js.undefined
  
  /** The resource location information. */
  var resourceLocation: js.UndefOr[ResourceLocation] = js.undefined
  
  /**
    * The resource or collection that is the target of the operation. The name is a scheme-less URI, not including the API service name. For example:
    * "projects/PROJECT_ID/zones/us-central1-a/instances" "projects/PROJECT_ID/datasets/DATASET_ID"
    */
  var resourceName: js.UndefOr[String] = js.undefined
  
  /**
    * The resource's original state before mutation. Present only for operations which have successfully modified the targeted resource(s). In general, this field should contain all
    * changed fields, except those that are already been included in `request`, `response`, `metadata` or `service_data` fields. When the JSON object represented here has a proto
    * equivalent, the proto name will be indicated in the `@‍type` property.
    */
  var resourceOriginalState: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /**
    * The operation response. This may not include all response elements, such as those that are too large, privacy-sensitive, or duplicated elsewhere in the log record. It should never
    * include user-generated data, such as file contents. When the JSON object represented here has a proto equivalent, the proto name will be indicated in the `@‍type` property.
    */
  var response: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** Deprecated. Use the `metadata` field instead. Other service-specific data about the request, response, and other activities. */
  var serviceData: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** The name of the API service performing the operation. For example, `"compute.googleapis.com"`. */
  var serviceName: js.UndefOr[String] = js.undefined
  
  /** The status of the overall operation. */
  var status: js.UndefOr[Status] = js.undefined
}
object AuditLog {
  
  inline def apply(): AuditLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditLog]
  }
  
  extension [Self <: AuditLog](x: Self) {
    
    inline def setAuthenticationInfo(value: AuthenticationInfo): Self = StObject.set(x, "authenticationInfo", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationInfoUndefined: Self = StObject.set(x, "authenticationInfo", js.undefined)
    
    inline def setAuthorizationInfo(value: js.Array[AuthorizationInfo]): Self = StObject.set(x, "authorizationInfo", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationInfoUndefined: Self = StObject.set(x, "authorizationInfo", js.undefined)
    
    inline def setAuthorizationInfoVarargs(value: AuthorizationInfo*): Self = StObject.set(x, "authorizationInfo", js.Array(value*))
    
    inline def setMetadata(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    inline def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
    
    inline def setNumResponseItems(value: String): Self = StObject.set(x, "numResponseItems", value.asInstanceOf[js.Any])
    
    inline def setNumResponseItemsUndefined: Self = StObject.set(x, "numResponseItems", js.undefined)
    
    inline def setPolicyViolationInfo(value: PolicyViolationInfo): Self = StObject.set(x, "policyViolationInfo", value.asInstanceOf[js.Any])
    
    inline def setPolicyViolationInfoUndefined: Self = StObject.set(x, "policyViolationInfo", js.undefined)
    
    inline def setRequest(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestMetadata(value: RequestMetadata): Self = StObject.set(x, "requestMetadata", value.asInstanceOf[js.Any])
    
    inline def setRequestMetadataUndefined: Self = StObject.set(x, "requestMetadata", js.undefined)
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResourceLocation(value: ResourceLocation): Self = StObject.set(x, "resourceLocation", value.asInstanceOf[js.Any])
    
    inline def setResourceLocationUndefined: Self = StObject.set(x, "resourceLocation", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceOriginalState(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "resourceOriginalState", value.asInstanceOf[js.Any])
    
    inline def setResourceOriginalStateUndefined: Self = StObject.set(x, "resourceOriginalState", js.undefined)
    
    inline def setResponse(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setServiceData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "serviceData", value.asInstanceOf[js.Any])
    
    inline def setServiceDataUndefined: Self = StObject.set(x, "serviceData", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
