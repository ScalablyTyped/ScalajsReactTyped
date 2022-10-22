package typingsJapgolly.googleAppsScript.GoogleAppsScript

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object URLFetch {
  
  /**
    * This class allows users to access specific information on HTTP responses.
    * See also
    *
    * UrlFetchApp
    */
  @js.native
  trait HTTPResponse extends StObject {
    
    def getAllHeaders(): js.Object = js.native
    
    def getAs(contentType: String): Blob = js.native
    
    def getBlob(): Blob = js.native
    
    def getContent(): js.Array[Byte] = js.native
    
    def getContentText(): String = js.native
    def getContentText(charset: String): String = js.native
    
    def getHeaders(): js.Object = js.native
    
    def getResponseCode(): Integer = js.native
  }
  
  type HttpHeaders = StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.googleAppsScript.googleAppsScriptStrings.get
    - typingsJapgolly.googleAppsScript.googleAppsScriptStrings.delete
    - typingsJapgolly.googleAppsScript.googleAppsScriptStrings.patch
    - typingsJapgolly.googleAppsScript.googleAppsScriptStrings.post
    - typingsJapgolly.googleAppsScript.googleAppsScriptStrings.put
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    inline def delete: typingsJapgolly.googleAppsScript.googleAppsScriptStrings.delete = "delete".asInstanceOf[typingsJapgolly.googleAppsScript.googleAppsScriptStrings.delete]
    
    inline def get: typingsJapgolly.googleAppsScript.googleAppsScriptStrings.get = "get".asInstanceOf[typingsJapgolly.googleAppsScript.googleAppsScriptStrings.get]
    
    inline def patch: typingsJapgolly.googleAppsScript.googleAppsScriptStrings.patch = "patch".asInstanceOf[typingsJapgolly.googleAppsScript.googleAppsScriptStrings.patch]
    
    inline def post: typingsJapgolly.googleAppsScript.googleAppsScriptStrings.post = "post".asInstanceOf[typingsJapgolly.googleAppsScript.googleAppsScriptStrings.post]
    
    inline def put: typingsJapgolly.googleAppsScript.googleAppsScriptStrings.put = "put".asInstanceOf[typingsJapgolly.googleAppsScript.googleAppsScriptStrings.put]
  }
  
  type Payload = String | StringDictionary[Any] | Blob
  
  trait URLFetchRequest
    extends StObject
       with URLFetchRequestOptions {
    
    var url: String
  }
  object URLFetchRequest {
    
    inline def apply(url: String): URLFetchRequest = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLFetchRequest]
    }
    
    extension [Self <: URLFetchRequest](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait URLFetchRequestOptions extends StObject {
    
    /**
      * the content type (defaults to 'application/x-www-form-urlencoded'). Another example of content
      * type is 'application/xml; charset=utf-8'.
      */
    var contentType: js.UndefOr[String] = js.undefined
    
    /**
      * if this is set to false, reserved characters in the URL will not be escaped (default: true)
      */
    var escaping: js.UndefOr[Boolean] = js.undefined
    
    /**
      * if this is set to false, the fetch not automatically follow HTTP redirects; it will return
      * the original HTTP response. The default is true.
      */
    var followRedirects: js.UndefOr[Boolean] = js.undefined
    
    /**
      * a JavaScript key/value map of HTTP headers for the request
      */
    var headers: js.UndefOr[HttpHeaders] = js.undefined
    
    /**
      * the HTTP method for the request: get, delete, patch, post, or put. The default is get.
      */
    var method: js.UndefOr[HttpMethod] = js.undefined
    
    /**
      * if this is set to true, the fetch will not throw an exception if the response code indicates
      * failure, and will instead return the HTTPResponse (default: false)
      */
    var muteHttpExceptions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * the payload (e.g. POST body) for the request. Certain HTTP methods (e.g. GET) do not accept a
      * payload. It can be a string, a byte array, or a JavaScript object. A JavaScript object will be
      * interpretted as a map of form field names to values, where the values can be either strings or blobs.
      */
    var payload: js.UndefOr[Payload] = js.undefined
    
    /**
      * Deprecated. This instructs fetch to resolve the specified URL within the intranet linked to your
      * domain through (deprecated) SDC
      */
    var useIntranet: js.UndefOr[Boolean] = js.undefined
    
    /**
      * if this is set to false, the fetch will ignore any invalid certificates for HTTPS requests.
      * The default is true.
      */
    var validateHttpsCertificates: js.UndefOr[Boolean] = js.undefined
  }
  object URLFetchRequestOptions {
    
    inline def apply(): URLFetchRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[URLFetchRequestOptions]
    }
    
    extension [Self <: URLFetchRequestOptions](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setEscaping(value: Boolean): Self = StObject.set(x, "escaping", value.asInstanceOf[js.Any])
      
      inline def setEscapingUndefined: Self = StObject.set(x, "escaping", js.undefined)
      
      inline def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      inline def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMuteHttpExceptions(value: Boolean): Self = StObject.set(x, "muteHttpExceptions", value.asInstanceOf[js.Any])
      
      inline def setMuteHttpExceptionsUndefined: Self = StObject.set(x, "muteHttpExceptions", js.undefined)
      
      inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setUseIntranet(value: Boolean): Self = StObject.set(x, "useIntranet", value.asInstanceOf[js.Any])
      
      inline def setUseIntranetUndefined: Self = StObject.set(x, "useIntranet", js.undefined)
      
      inline def setValidateHttpsCertificates(value: Boolean): Self = StObject.set(x, "validateHttpsCertificates", value.asInstanceOf[js.Any])
      
      inline def setValidateHttpsCertificatesUndefined: Self = StObject.set(x, "validateHttpsCertificates", js.undefined)
    }
  }
  
  /**
    * Fetch resources and communicate with other hosts over the Internet.
    *
    * This service allows scripts to communicate with other applications or access other resources
    * on the web by fetching URLs. A script can use the URL Fetch service to issue HTTP and HTTPS
    * requests and receive responses. The URL Fetch service uses Google's network infrastructure for
    * efficiency and scaling purposes.
    *
    * Requests made using this service originate from a set pool of IP ranges. You can look up the full list of IP addresses
    * if you need to whitelist or approve these requests.
    *
    * This service requires the https://www.googleapis.com/auth/script.external_request
    * scope. In most cases Apps Script automatically detects and includes the scopes a script needs,
    * but if you are setting your scopes
    * explicitly you must manually add this scope to use UrlFetchApp.
    * See also
    *
    * HTTPResponse
    *
    * Setting explicit scopes
    */
  @js.native
  trait UrlFetchApp extends StObject {
    
    def fetch(url: String): HTTPResponse = js.native
    def fetch(url: String, params: URLFetchRequestOptions): HTTPResponse = js.native
    
    def fetchAll(requests: js.Array[URLFetchRequest | String]): js.Array[HTTPResponse] = js.native
    
    def getRequest(url: String): URLFetchRequest = js.native
    def getRequest(url: String, params: URLFetchRequestOptions): URLFetchRequest = js.native
  }
}
