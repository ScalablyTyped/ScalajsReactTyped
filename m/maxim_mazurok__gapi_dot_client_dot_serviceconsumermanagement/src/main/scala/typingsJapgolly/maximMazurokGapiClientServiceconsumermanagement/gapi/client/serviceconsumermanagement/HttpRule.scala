package typingsJapgolly.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpRule extends StObject {
  
  /** Additional HTTP bindings for the selector. Nested bindings must not contain an `additional_bindings` field themselves (that is, the nesting may only be one level deep). */
  var additionalBindings: js.UndefOr[js.Array[HttpRule]] = js.undefined
  
  /**
    * The name of the request field whose value is mapped to the HTTP request body, or `*` for mapping all request fields not captured by the path pattern to the HTTP body, or omitted for
    * not having any HTTP request body. NOTE: the referred field must be present at the top-level of the request message type.
    */
  var body: js.UndefOr[String] = js.undefined
  
  /**
    * The custom pattern is used for specifying an HTTP method that is not included in the `pattern` field, such as HEAD, or "*" to leave the HTTP method unspecified for this rule. The
    * wild-card rule is useful for services that provide content to Web (HTML) clients.
    */
  var custom: js.UndefOr[CustomHttpPattern] = js.undefined
  
  /** Maps to HTTP DELETE. Used for deleting a resource. */
  var delete: js.UndefOr[String] = js.undefined
  
  /** Maps to HTTP GET. Used for listing and getting information about resources. */
  var get: js.UndefOr[String] = js.undefined
  
  /** Maps to HTTP PATCH. Used for updating a resource. */
  var patch: js.UndefOr[String] = js.undefined
  
  /** Maps to HTTP POST. Used for creating a resource or performing an action. */
  var post: js.UndefOr[String] = js.undefined
  
  /** Maps to HTTP PUT. Used for replacing a resource. */
  var put: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The name of the response field whose value is mapped to the HTTP response body. When omitted, the entire response message will be used as the HTTP response body. NOTE: The
    * referred field must be present at the top-level of the response message type.
    */
  var responseBody: js.UndefOr[String] = js.undefined
  
  /** Selects a method to which this rule applies. Refer to selector for syntax details. */
  var selector: js.UndefOr[String] = js.undefined
}
object HttpRule {
  
  inline def apply(): HttpRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRule]
  }
  
  extension [Self <: HttpRule](x: Self) {
    
    inline def setAdditionalBindings(value: js.Array[HttpRule]): Self = StObject.set(x, "additionalBindings", value.asInstanceOf[js.Any])
    
    inline def setAdditionalBindingsUndefined: Self = StObject.set(x, "additionalBindings", js.undefined)
    
    inline def setAdditionalBindingsVarargs(value: HttpRule*): Self = StObject.set(x, "additionalBindings", js.Array(value*))
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCustom(value: CustomHttpPattern): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setGet(value: String): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    inline def setPost(value: String): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    inline def setPut(value: String): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
    
    inline def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
    
    inline def setResponseBody(value: String): Self = StObject.set(x, "responseBody", value.asInstanceOf[js.Any])
    
    inline def setResponseBodyUndefined: Self = StObject.set(x, "responseBody", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
