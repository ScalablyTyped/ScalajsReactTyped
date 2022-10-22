package typingsJapgolly.servicenowLondon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.servicenowLondon.anon.Get
import typingsJapgolly.servicenowLondon.anon.Name
import typingsJapgolly.servicenowLondon.servicenowLondonStrings.all
import typingsJapgolly.servicenowLondon.servicenowLondonStrings.basic
import typingsJapgolly.servicenowLondon.servicenowLondonStrings.elevated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snWs {
  
  trait RESTAPIRequest extends StObject {
    
    val body: RESTAPIRequestBody
    
    def getHeader(header: String): String
    
    def getSupportedResponseContentTypes(): js.Array[String]
    
    val headers: StringDictionary[String]
    
    val pathParams: StringDictionary[String]
    
    val queryParams: StringDictionary[js.Array[String]]
    
    val queryString: String
    
    val uri: String
    
    val url: String
  }
  object RESTAPIRequest {
    
    inline def apply(
      body: RESTAPIRequestBody,
      getHeader: String => String,
      getSupportedResponseContentTypes: CallbackTo[js.Array[String]],
      headers: StringDictionary[String],
      pathParams: StringDictionary[String],
      queryParams: StringDictionary[js.Array[String]],
      queryString: String,
      uri: String,
      url: String
    ): RESTAPIRequest = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), getSupportedResponseContentTypes = getSupportedResponseContentTypes.toJsFn, headers = headers.asInstanceOf[js.Any], pathParams = pathParams.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RESTAPIRequest]
    }
    
    extension [Self <: RESTAPIRequest](x: Self) {
      
      inline def setBody(value: RESTAPIRequestBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setGetHeader(value: String => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
      
      inline def setGetSupportedResponseContentTypes(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getSupportedResponseContentTypes", value.toJsFn)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setPathParams(value: StringDictionary[String]): Self = StObject.set(x, "pathParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParams(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait RESTAPIRequestBody extends StObject {
    
    val data: Any
    
    val dataStream: js.Object
    
    val dataString: String
    
    def hasNext(): Boolean
    
    def nextEntry(): Any
  }
  object RESTAPIRequestBody {
    
    inline def apply(
      data: Any,
      dataStream: js.Object,
      dataString: String,
      hasNext: CallbackTo[Boolean],
      nextEntry: CallbackTo[Any]
    ): RESTAPIRequestBody = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataStream = dataStream.asInstanceOf[js.Any], dataString = dataString.asInstanceOf[js.Any], hasNext = hasNext.toJsFn, nextEntry = nextEntry.toJsFn)
      __obj.asInstanceOf[RESTAPIRequestBody]
    }
    
    extension [Self <: RESTAPIRequestBody](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataStream(value: js.Object): Self = StObject.set(x, "dataStream", value.asInstanceOf[js.Any])
      
      inline def setDataString(value: String): Self = StObject.set(x, "dataString", value.asInstanceOf[js.Any])
      
      inline def setHasNext(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasNext", value.toJsFn)
      
      inline def setNextEntry(value: CallbackTo[Any]): Self = StObject.set(x, "nextEntry", value.toJsFn)
    }
  }
  
  trait RESTAPIResponse extends StObject {
    
    def getStreamWriter(): RESTAPIResponseStream
    
    def setBody(body: Any): Unit
    
    def setContentType(contentType: String): Unit
    
    def setError(error: Any): Unit
    
    def setHeader(header: String, value: String): Unit
    
    def setHeaders(headers: Any): Unit
    
    def setLocation(location: String): Unit
    
    def setStatus(status: Double): Unit
  }
  object RESTAPIResponse {
    
    inline def apply(
      getStreamWriter: CallbackTo[RESTAPIResponseStream],
      setBody: Any => Callback,
      setContentType: String => Callback,
      setError: Any => Callback,
      setHeader: (String, String) => Callback,
      setHeaders: Any => Callback,
      setLocation: String => Callback,
      setStatus: Double => Callback
    ): RESTAPIResponse = {
      val __obj = js.Dynamic.literal(getStreamWriter = getStreamWriter.toJsFn, setBody = js.Any.fromFunction1((t0: Any) => setBody(t0).runNow()), setContentType = js.Any.fromFunction1((t0: String) => setContentType(t0).runNow()), setError = js.Any.fromFunction1((t0: Any) => setError(t0).runNow()), setHeader = js.Any.fromFunction2((t0: String, t1: String) => (setHeader(t0, t1)).runNow()), setHeaders = js.Any.fromFunction1((t0: Any) => setHeaders(t0).runNow()), setLocation = js.Any.fromFunction1((t0: String) => setLocation(t0).runNow()), setStatus = js.Any.fromFunction1((t0: Double) => setStatus(t0).runNow()))
      __obj.asInstanceOf[RESTAPIResponse]
    }
    
    extension [Self <: RESTAPIResponse](x: Self) {
      
      inline def setGetStreamWriter(value: CallbackTo[RESTAPIResponseStream]): Self = StObject.set(x, "getStreamWriter", value.toJsFn)
      
      inline def setSetBody(value: Any => Callback): Self = StObject.set(x, "setBody", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setSetContentType(value: String => Callback): Self = StObject.set(x, "setContentType", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetError(value: Any => Callback): Self = StObject.set(x, "setError", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setSetHeader(value: (String, String) => Callback): Self = StObject.set(x, "setHeader", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetHeaders(value: Any => Callback): Self = StObject.set(x, "setHeaders", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setSetLocation(value: String => Callback): Self = StObject.set(x, "setLocation", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetStatus(value: Double => Callback): Self = StObject.set(x, "setStatus", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  trait RESTAPIResponseStream extends StObject {
    
    def writeStream(stream: js.Object): Unit
    
    def writeString(data: String): Unit
  }
  object RESTAPIResponseStream {
    
    inline def apply(writeStream: js.Object => Callback, writeString: String => Callback): RESTAPIResponseStream = {
      val __obj = js.Dynamic.literal(writeStream = js.Any.fromFunction1((t0: js.Object) => writeStream(t0).runNow()), writeString = js.Any.fromFunction1((t0: String) => writeString(t0).runNow()))
      __obj.asInstanceOf[RESTAPIResponseStream]
    }
    
    extension [Self <: RESTAPIResponseStream](x: Self) {
      
      inline def setWriteStream(value: js.Object => Callback): Self = StObject.set(x, "writeStream", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
      
      inline def setWriteString(value: String => Callback): Self = StObject.set(x, "writeString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  /**
    * The RESTMessageV2 API allows you to send outbound REST messages using JavaScript.
    * Use the RESTResponseV2 API to manage the response returned by the REST provider.
    *
    * You can use this API in scoped applications, or within the global scope.
    */
  @js.native
  trait RESTMessageV2 extends StObject {
    
    /**
      * Send the REST message to the endpoint.
      *
      * In the following example, replace REST_message_record with the name of the REST message
      * record from your instance.
      *
      * @returns The response returned by the REST provider.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2("<REST_message_record>","get");
      * // Might throw exception if http connection timed out or some issue with sending request
      * // itself because of encryption/decryption of password.
      * var response = sm.execute();
      */
    def execute(): RESTResponseV2 = js.native
    
    /**
      * Send the REST message to the endpoint asynchronously. The instance does not wait for a
      * response from the web service provider when making asynchronous calls.
      *
      * In the following example, replace REST_message_record with the name of the REST message
      * record from your instance.
      *
      * @returns The response returned by the REST provider.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2("<REST_message_record>","get");
      * // Might throw exception if http connection timed out or some issue with sending request
      * // itself because of encryption/decryption of password.
      * var response = sm.executeAsync();
      * // In seconds. Wait at most 60 seconds to get response from ECC Queue/Mid Server
      * // Might throw exception timing out waiting for response in ECC queue.
      * response.waitForResponse(60);
      */
    def executeAsync(): RESTResponseV2 = js.native
    
    /**
      * Get the URL of the endpoint for the REST message.
      *
      * In the following example, replace REST_message_record with the name of the REST message
      * record from your instance.
      *
      * @returns The URL of the REST web service provider.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2("<REST_message_record>","get");
      * var endpoint = sm.getEndpoint();
      */
    def getEndpoint(): String = js.native
    
    /**
      * Get the content of the REST message body.
      *
      * In the following example, replace REST_message_record with the name of the REST message
      * record from your instance.
      *
      * @returns The REST message body.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2("<REST_message_record>","get");
      * var body = sm.getRequestBody();
      */
    def getRequestBody(): String = js.native
    
    /**
      * Get the value for an HTTP header specified in the REST message.
      *
      * By default, this method cannot return the value for a header set automatically by the system.
      * To grant this method access to all headers, set the property glide.http.log_debug to true.
      *
      * In the following example, replace REST_message_record with the name of the REST message
      * record from your instance.
      *
      * @param headerName The request header you want to get the value for.
      * @returns The value of the specified header.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2("<REST_message_record>","get");
      * var header = sm.getRequestHeader("Accept");
      */
    def getRequestHeader(headerName: String): String = js.native
    
    /**
      * Get HTTP headers that were set by the REST client and the associated values.
      *
      * This method does not return headers set automatically by the system. To configure this
      * method to return all headers, set the property glide.http.log_debug to true.
      *
      * In the following example, replace REST_message_record with the name of the REST message
      * record from your instance.
      *
      * @returns An Object that maps the name of each header to the associated value.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2("<REST_message_record>","get");
      * var headers = sm.getRequestHeaders();
      */
    def getRequestHeaders(): js.Object = js.native
    
    /**
      * Configures the REST message to save the returned response body as an attachment record.
      *
      * When you use this function with a REST message that is sent through a MID server, the MID
      * server user must have any roles required to read and write attachment records, as well as
      * any roles required to read and write records on the table specified in the tableName
      * parameter.
      *
      * The response body does not need to be a binary file to be saved as an attachment. Response
      * bodies using text formats, such as JSON or XML can also be saved. If the instance fails
      * to save the attachment, call getErrorMessage() on the related RESTResponseV2 object
      * for error details.
      *
      * @param tableName Specify the table that contains the record you want to attach the saved file
      * to.
      * @param recordSysId Specify the sys_id of the record you want to attach the saved file to.
      * @param fileName Specify the file name to give to the saved file.
      * @example
      *
      * (function sampleRESTMessageV2() {
      *    try {
      *       var request = new sn_ws.RESTMessageV2();
      *       request.setHttpMethod('get');
      *
      *       var attachment_sys_id = '<attachment_record_sys_id>',
      *           tablename = 'incident',
      *           recordSysId = '<incident_sys_id>',
      *           response,
      *           httpResponseStatus,
      *           filename = '<filename>';
      *
      *       // endpoint - ServiceNow REST Attachment API
      *       request.setEndpoint('https://<instance_name>.service-now.com/api/now/attachment/' +
      *       attachment_sys_id + '/file');
      *       request.setBasicAuth('<username>', '<password>');
      *
      *       // RESTMessageV2 - saveResponseBodyAsAttachment(String tableName, String recordSysId,
      *       // String fileName)
      *       request.saveResponseBodyAsAttachment(tablename, recordSysId, filename);
      *
      *       response = request.execute();
      *       httpResponseStatus = response.getStatusCode();
      *
      *       gs.print(" http response status_code:  " + httpResponseStatus);
      *   }
      *   catch (ex) {
      *       var message = ex.getMessage();
      *       gs.print(message);
      *   }
      * })();
      */
    def saveResponseBodyAsAttachment(tableName: String, recordSysId: String, fileName: String): Unit = js.native
    /**
      * Configure the REST message to save the returned response body as an encrypted
      * attachment record.
      *
      * When you use this function with a REST message that is sent through a MID server, the MID
      * server user must have any roles required to read and write attachment records, as well as any
      * roles required to read and write records on the table specified in the `tableName` parameter.
      *
      * The response body does not need to be a binary file to be saved as an attachment. Response
      * bodies using text formats, such as JSON or XML can also be saved. If the instance fails to
      * save the attachment, call `getErrorMessage()` on the related RESTResponseV2 object for error
      * details.
      *
      * @param tableName Specify the table that contains the record you want to attach the saved file
      * to.
      * @param recordSysId Specify the sys_id of the record you want to attach the saved file to.
      * @param fileName Specify the file name to give to the saved file.
      * @param encryptContext Specify the sys_id of an encryption context. The saved file is
      * encrypted using this context.
      */
    def saveResponseBodyAsAttachment(tableName: String, recordSysId: String, fileName: String, encryptContext: String): Unit = js.native
    
    /**
      * Set the credentials for the REST message using an existing basic auth or OAuth 2.0 profile.
      *
      * In the following example, replace REST_message_record with the name of the REST message
      * record from your instance.
      *
      * @param type The type of authentication profile to use. Valid values are 'basic' to use basic
      * authentication, or 'oauth2' to use OAuth 2.0.
      * @param profileId The sys_id of an authentication profile record. When using basic auth,
      * specify the sys_id of a Basic Auth Configuration [sys_auth_profile_basic] record. When using
      * OAuth 2.0, specify the sys_id of a OAuth Entity Profile [oauth_entity_profile] record.
      * @example
      *
      * var requestBody;
      * var responseBody;
      * var status;
      * var sm;
      * try {
      *     // Might throw exception if message doesn't exist or not visible due to scope.
      *     sm = new sn_ws.RESTMessageV2("<REST_message_record>", "get");
      *
      *     // set auth profile to an OAuth 2.0 profile record.
      *     sm.setAuthenticationProfile('oauth2', '1234adsf123212131123qasdsf');
      *
      *     sm.setStringParameter("symbol", "NOW");
      *     sm.setStringParameterNoEscape("xml_data", "<data>test</data>");
      *
      *     // In milliseconds. Wait at most 10 seconds for response from http request.
      *     sm.setHttpTimeout(10000);
      *     // Might throw exception if http connection timed out or some issue
      *     // with sending request itself because of encryption/decryption of password.
      *     response = sm.execute();
      *     responseBody = response.haveError() ? response.getErrorMessage() : response.getBody();
      *     status = response.getStatusCode();
      * } catch (ex) {
      *     responseBody = ex.getMessage();
      *     status = '500';
      * } finally {
      *     requestBody = sm ? sm.getRequestBody() : null;
      * }
      */
    def setAuthenticationProfile(`type`: String, profileId: String): Unit = js.native
    
    /**
      * Sets basic authentication headers for the REST message.
      *
      * Setting security values using this method overrides basic authentication values defined for
      * the REST message record.
      *
      * In the following example, replace REST_message_record with the name of the REST message
      * record from your instance.
      *
      * @param userName The username you want to use to authenticate the REST message.
      * @param userPass The password for the specified user.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2("<REST_message_record>","get");
      * sm.setBasicAuth("username","password");
      */
    def setBasicAuth(userName: String, userPass: String): Unit = js.native
    
    /**
      * Associate outbound requests and the resulting response record in the ECC queue. This method
      * only applies to REST messages sent through a MID Server.
      *
      * The correlator provided populates the Agent correlator field on the ECC queue record for the
      * response. Provide a unique correlator for each outbound request to associate the correct
      * results in the ECC queue with the request when designing asynchronous automation through a
      * MID Server.
      *
      * In the following example, replace REST_message_record with the name of the REST message record
      * from your instance.
      *
      * @param correlator A unique identifier
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2("<REST_message_record>","get");
      * sm.setEccCorrelator("unique_identifier");
      */
    def setEccCorrelator(correlator: String): Unit = js.native
    
    /**
      * Override a value from the database by writing to the REST message payload. This method only
      * applies to REST messages sent through a MID Server.
      *
      * Use this method when a value from the REST message in the database is invalid, such as when
      * the endpoint URL is longer than the maximum REST endpoint field length. You can set only the
      * endpoint URL using this method by passing source as the name parameter.
      *
      * In the following example, replace REST_message_record with the name of the REST message
      * record from your instance.
      *
      * @param name The name of the parameter, such as source.
      * @param value The value to assign to the specified parameter.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2("<REST_message_record>","get");
      * sm.setEccParameter("source","http://very.long.endpoint.url");
      */
    def setEccParameter(name: String, value: String): Unit = js.native
    
    /**
      * Set the endpoint for the REST message.
      *
      * By default, the REST message uses the endpoint specified in the REST message record. Use this
      * method to override this default. You must call this method when using the RESTMessageV2 -
      *
      * RESTMessageV2() constructor with no parameters.
      *
      * @param endpoint The URL of the REST provider you want to interface with.
      * @example
      *
      * var sm = new sn_ws.RESTMessageV2();
      * sm.setEndpoint("http://web.service.endpoint");
      */
    def setEndpoint(endpoint: String): Unit = js.native
    
    /**
      * The HTTP method this REST message performs, such as GET or PUT.
      *
      * You must set an HTTP method when using the RESTMessageV2 - RESTMessageV2() constructor with
      * no parameters.
      * @param method The HTTP method to perform.
      * @example
      *
      * var sm = new sn_ws.RESTMessageV2();
      * sm.setHttpMethod("post");
      */
    def setHttpMethod(method: RestHTTPMethods): Unit = js.native
    
    /**
      * Set the amount of time the REST message waits for a response from the web service provider
      * before the request times out.
      *
      * In the following example, replace REST_message_record with the name of the REST message
      * record from your instance.
      *
      * @param timeoutMs The amount of time, in milliseconds, before the call to the REST provider
      * times out.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2("<REST_message_record>","get");
      * sm.setHttpTimeout(6000);
      */
    def setHttpTimeout(timeoutMs: Double): Unit = js.native
    
    /**
      * Set the log level for this message and the corresponding response.
      *
      * Setting a log level using the RESTMessageV2 API overrides the log level configured on the
      * REST message record. This log level may not apply if the endpoint domain is blacklisted, or
      * if the property glide.outbound_http_log.override is true. To view outbound web service logs,
      * navigate to System Logs > Outbound HTTP Requests.
      *
      * @param level The log level. Valid values are basic, elevated, and all.
      * @example
      *
      * var rm = new sn_ws.RESTMessageV2();
      * rm.setLogLevel('all');
      */
    def setLogLevel(level: basic | elevated | all): Unit = js.native
    
    /**
      * Configure the REST message to communicate through a MID Server.
      *
      * In the following example, replace REST_message_record with the name of the REST message
      * record from your instance.
      *
      * @param midServer The name of the MID Server to use. Your instance must have an active MID
      * Server with the specified name.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2("<REST_message_record>","get");
      * sm.setMIDServer("mid_server_name");
      */
    def setMIDServer(midServer: String): Unit = js.native
    
    /**
      * Set the mutual authentication protocol profile for the REST message.
      *
      * Setting a protocol profile using this method overrides the protocol profile selected for the
      * REST message record.
      *
      * In the following example, replace REST_message_record with the name of the REST message
      * record from your instance.
      *
      * @param profileName The Name of the protocol profile to use for mutual authentication.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2("<REST_message_record>","get");
      * sm.setMutualAuth("mutual_auth_profile_name");
      */
    def setMutualAuth(profileName: String): Unit = js.native
    
    /**
      * Append a parameter to the end of the request URL with the form name=value.
      *
      * For example, the code setQueryParameter("sysparm_query",
      * "active=true^ORDERBYnumber^ORDERBYDESCcategory"); appends the text
      *
      * sysparm_query=active=true^ORDERBYnumber^ORDERBYDESCcategory to the request URL.
      *
      * @param name The name of the URL parameter to pass.
      * @param value The value to assign the URL parameter.
      * @example
      *
      * var sm = new sn_ws.RESTMessageV2();
      * // Set up message, including endpoint and authentication
      * sm.setQueryParameter("sysparm_query","active=true^ORDERBYnumber^ORDERBYDESCcategory");
      */
    def setQueryParameter(name: String, value: String): Unit = js.native
    
    /**
      * Set the body content to send to the web service provider when using PUT or POST HTTP methods.
      *
      * When you set the body content using this method, variables in the body are not substituted
      * for parameters from the REST message function record. You must explicitly define all values
      * within the REST message body.
      *
      * @param body The request body to send.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2("Update user","post");
      * var body = "<Message body content>";
      * sm.setRequestBody(body);
      */
    def setRequestBody(body: String): Unit = js.native
    
    /**
      * Sets the request body using an existing attachment record.
      *
      * When you use this function with a REST message that is sent through a MID server, the MID
      * server user must have any roles required to read attachment records.
      *
      * @param attachmentSysId The sys_id of the Attachment [sys_attachment] record you want to send
      * in this REST message.
      * @example
      *
      * (function sampleRESTMessageV2() {
      *     try {
      *         var request = new sn_ws.RESTMessageV2();
      *         request.setHttpMethod('post');
      *         request.setEndpoint('<web service endpoint URL>');
      *         request.setRequestBodyFromAttachment('<attachment sys_id>');
      *
      *         var response = request.execute();
      *         var httpResponseStatus = response.getStatusCode();
      *
      *         gs.print("http response status_code: " + httpResponseStatus);
      *     }
      *     catch (ex) {
      *         var message = ex.getMessage();
      *         gs.print(message);
      *     }
      * })();
      */
    def setRequestBodyFromAttachment(attachmentSysId: String): Unit = js.native
    
    /**
      * Set the body content of a PUT or POST message using a binary stream.
      *
      * You can use this method to send binary files such as images or archives using REST messages.
      * If the request is not a PUT or POST request, the request body is ignored.
      *
      * @param stream The binary data to send, such as an attachment or a stream from a 3rd-party
      * service.
      */
    def setRequestBodyFromStream(stream: js.Object): Unit = js.native
    
    /**
      * Set an HTTP header in the REST message to the specified value.
      *
      * In the following example, replace REST_message_record with the name of the REST message
      * record from your instance.
      *
      * @param name The name of the header.
      * @param value The value to assign to the specified header.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2("<REST_message_record>","get");
      * sm.setRequestHeader("Accept","Application/json");
      */
    def setRequestHeader(name: String, value: String): Unit = js.native
    
    /**
      * Override the default requestor profile for the REST message in order to retrieve an OAuth
      * access token associated with a different requestor.
      *
      * This method applies only to REST messages configured to use OAuth 2.0 authentication. This
      * method is optional and is unnecessary in most configurations.
      *
      * @param requestorContext
      * @param requestorId
      */
    def setRequestorProfile(requestorContext: String, requestorId: String): Unit = js.native
    
    /**
      * Set a REST message function variable with the specified name from the REST message record
      * to the specified value.
      *
      * XML reserved characters in the value are converted to the equivalent escaped characters. Use
      * setStringParameterNoEscape to set a variable without escaping XML reserved characters.
      *
      * In the following example, replace REST_message_record with the name of the REST message
      * record from your instance.
      *
      * @param name The name of the REST message variable. This parameter must be defined in the
      * REST message record before you can assign a value to it.
      * @param value The value to assign the variable.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2("<REST_message_record>","get");
      * sm.setStringParameter("s","NOW");
      */
    def setStringParameter(name: String, value: String): Unit = js.native
    
    /**
      * Set a REST message function variable with the specified name from the REST message record to
      * the specified value.
      *
      * This method is equivalent to setStringParameter but does not escape XML reserved characters.
      * In the following example, replace REST_message_record with the name of the REST message
      * record from your instance.
      *
      * @param name The name of the REST message variable. This parameter must be defined in the
      * REST message record before you can assign a value to it.
      * @param value The value to assign the variable.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2("<REST_message_record>","get");
      * sm.setStringParameterNoEscape("s","NOW");
      */
    def setStringParameterNoEscape(name: String, value: String): Unit = js.native
  }
  
  /**
    * The RESTResponseV2 API allows you to use the data returned by an outbound REST message
    * in JavaScript code.
    */
  trait RESTResponseV2 extends StObject {
    
    /**
      * Returns all headers contained in the response, including any duplicate headers.
      *
      * @returns The list of headers contained in the response. Each header is represented as a
      * GlideHTTPHeader object which contains the header `name` and `value`.
      * @example
      *
      * var r = new sn_ws.RESTMessageV2('<A REST message>', 'get');
      * var response = r.execute();
      * var headers = response.getAllHeaders();
      * for(var i in headers){
      *   gs.info(headers[i].name + ': ' + headers[i].value);
      * }
      */
    def getAllHeaders(): js.Array[Name]
    
    /**
      * Get the content of the REST response body.
      *
      * Use this function when you want to get the request body as text content. Do not use this
      * method when saving the response as a binary attachment. If a RESTMessageV2 object called
      * the `saveResponseBodyAsAttachment(...)` function, using `getBody()` on the associated
      * RESTResponseV2 object will cause an error. When saving the response as an attachment,
      * if the outbound REST message fails, call `getErrorMessage()` on the response to retrieve
      * the body content.
      *
      * @returns The REST response body.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
      * var response = sm.execute();
      * var responseBody = response.getBody();
      */
    def getBody(): String
    
    /**
      * Returns all cookies included in the response.
      *
      * @returns The list of cookies. Iterate through the list to perform operations on each cookie.
      * @example
      *
      * var cookies = response.getCookies();
      * var i;
      * for (var i = 0; i < cookies.size(); i++) {
      *   gs.info('cookie: ' + cookies.get(i));
      * }
      */
    def getCookies(): Get
    
    /**
      * Get the numeric error code if there was an error during the REST transaction.
      *
      * This error code is specific to the Now Platform, it is not an HTTP error code. Provide this
      * error code if you require assistance from ServiceNow Customer Support.
      *
      * @returns The numeric error code, such as 1 for socket timeout.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
      * var response = sm.execute();
      * var errorCode = response.getErrorCode();
      */
    def getErrorCode(): Double
    
    /**
      * Get the error message if there was an error during the REST transaction.
      *
      * @returns The error message.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
      * var response = sm.execute();
      * var errorMsg = response.getErrorMessage();
      */
    def getErrorMessage(): String
    
    /**
      * Get the value for a specified header.
      *
      * @param name The name of the header that you want the value for, such as Set-Cookie.
      * @returns The value of the specified header.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
      * var response = sm.execute();
      * var headerVal = response.getHeader('Content-Type');
      */
    def getHeader(name: String): String
    
    /**
      * Get all headers returned in the REST response and the associated values.
      *
      * **Note:** If a header is present more than once in the response, such as a Set-Cookie header,
      * this function returns only the last of the duplicate headers. To return all headers
      * including duplicates, use the `getAllHeaders()` function.
      *
      * @returns An Object that maps the name of each header to the associated value.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
      * var response = sm.execute();
      * var headers = response.getHeaders();
      */
    def getHeaders(): js.Object
    
    /**
      * Get the fully-resolved query sent to the REST endpoint.
      *
      * This query contains the endpoint URL as well as any values assigned to variables in the
      * REST message. Use this method only with responses to direct requests. This method is not
      * supported for requests sent asynchronously, or requests sent using a MID server.
      *
      * @returns The fully-resolved query.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
      * var response = sm.execute();
      * var queryString = response.getQueryString();
      */
    def getQueryString(): String
    
    /**
      * Get the sys_id value of the attachment created from the response body content.
      *
      * If the RESTMessageV2 object associated with this response called the
      * `saveResponseBodyAsAttachment(...)` function, use `getResponseAttachmentSysid()` to get the
      * sys_id of the created attachment record. Use this function when you want to perform
      * additional operations with the new attachment record.
      *
      * @returns The sys_id of the new attachment record.
      */
    def getResponseAttachmentSysid(): String
    
    /**
      * Get the numeric HTTP status code returned by the REST provider.
      *
      * @returns The numeric status code returned by the REST provider, such as 200 for a
      * successful response.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
      * var response = sm.execute();
      * var statusCode = response.getStatusCode();
      */
    def getStatusCode(): Double
    
    /**
      * Indicate if there was an error during the REST transaction.
      *
      * @returns Returns true if there was an error, false if there was no error.
      * @example
      *
      * // Might throw exception if message doesn't exist or not visible due to scope.
      * var sm = new sn_ws.RESTMessageV2('Yahoo Finance', 'get');
      * var response = sm.execute();
      * var error = response.haveError();
      */
    def haveError(): Boolean
    
    /**
      * Set the amount of time the instance waits for a response from the web service provider.
      *
      * This method overrides the property glide.rest.outbound.ecc_response.timeout for this REST
      * response.
      *
      * @param timeoutSecs The amount of time, in seconds, to wait for this response.
      * @example
      *
      * var sm = new sn_ws.RESTMessageV2("Yahoo Finance","get"); //Might throw exception if message doesn't exist or not visible due to scope.
      * var response = sm.executeAsync();
      * response.waitForResponse(60);
      */
    def waitForResponse(timeoutSecs: Double): Unit
  }
  object RESTResponseV2 {
    
    inline def apply(
      getAllHeaders: CallbackTo[js.Array[Name]],
      getBody: CallbackTo[String],
      getCookies: CallbackTo[Get],
      getErrorCode: CallbackTo[Double],
      getErrorMessage: CallbackTo[String],
      getHeader: String => String,
      getHeaders: CallbackTo[js.Object],
      getQueryString: CallbackTo[String],
      getResponseAttachmentSysid: CallbackTo[String],
      getStatusCode: CallbackTo[Double],
      haveError: CallbackTo[Boolean],
      waitForResponse: Double => Callback
    ): RESTResponseV2 = {
      val __obj = js.Dynamic.literal(getAllHeaders = getAllHeaders.toJsFn, getBody = getBody.toJsFn, getCookies = getCookies.toJsFn, getErrorCode = getErrorCode.toJsFn, getErrorMessage = getErrorMessage.toJsFn, getHeader = js.Any.fromFunction1(getHeader), getHeaders = getHeaders.toJsFn, getQueryString = getQueryString.toJsFn, getResponseAttachmentSysid = getResponseAttachmentSysid.toJsFn, getStatusCode = getStatusCode.toJsFn, haveError = haveError.toJsFn, waitForResponse = js.Any.fromFunction1((t0: Double) => waitForResponse(t0).runNow()))
      __obj.asInstanceOf[RESTResponseV2]
    }
    
    extension [Self <: RESTResponseV2](x: Self) {
      
      inline def setGetAllHeaders(value: CallbackTo[js.Array[Name]]): Self = StObject.set(x, "getAllHeaders", value.toJsFn)
      
      inline def setGetBody(value: CallbackTo[String]): Self = StObject.set(x, "getBody", value.toJsFn)
      
      inline def setGetCookies(value: CallbackTo[Get]): Self = StObject.set(x, "getCookies", value.toJsFn)
      
      inline def setGetErrorCode(value: CallbackTo[Double]): Self = StObject.set(x, "getErrorCode", value.toJsFn)
      
      inline def setGetErrorMessage(value: CallbackTo[String]): Self = StObject.set(x, "getErrorMessage", value.toJsFn)
      
      inline def setGetHeader(value: String => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
      
      inline def setGetHeaders(value: CallbackTo[js.Object]): Self = StObject.set(x, "getHeaders", value.toJsFn)
      
      inline def setGetQueryString(value: CallbackTo[String]): Self = StObject.set(x, "getQueryString", value.toJsFn)
      
      inline def setGetResponseAttachmentSysid(value: CallbackTo[String]): Self = StObject.set(x, "getResponseAttachmentSysid", value.toJsFn)
      
      inline def setGetStatusCode(value: CallbackTo[Double]): Self = StObject.set(x, "getStatusCode", value.toJsFn)
      
      inline def setHaveError(value: CallbackTo[Boolean]): Self = StObject.set(x, "haveError", value.toJsFn)
      
      inline def setWaitForResponse(value: Double => Callback): Self = StObject.set(x, "waitForResponse", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.servicenowLondon.servicenowLondonStrings.get
    - typingsJapgolly.servicenowLondon.servicenowLondonStrings.post
    - typingsJapgolly.servicenowLondon.servicenowLondonStrings.delete
    - typingsJapgolly.servicenowLondon.servicenowLondonStrings.patch
    - typingsJapgolly.servicenowLondon.servicenowLondonStrings.put
    - typingsJapgolly.servicenowLondon.servicenowLondonStrings.head
    - typingsJapgolly.servicenowLondon.servicenowLondonStrings.options
  */
  trait RestHTTPMethods extends StObject
  object RestHTTPMethods {
    
    inline def delete: typingsJapgolly.servicenowLondon.servicenowLondonStrings.delete = "delete".asInstanceOf[typingsJapgolly.servicenowLondon.servicenowLondonStrings.delete]
    
    inline def get: typingsJapgolly.servicenowLondon.servicenowLondonStrings.get = "get".asInstanceOf[typingsJapgolly.servicenowLondon.servicenowLondonStrings.get]
    
    inline def head: typingsJapgolly.servicenowLondon.servicenowLondonStrings.head = "head".asInstanceOf[typingsJapgolly.servicenowLondon.servicenowLondonStrings.head]
    
    inline def options: typingsJapgolly.servicenowLondon.servicenowLondonStrings.options = "options".asInstanceOf[typingsJapgolly.servicenowLondon.servicenowLondonStrings.options]
    
    inline def patch: typingsJapgolly.servicenowLondon.servicenowLondonStrings.patch = "patch".asInstanceOf[typingsJapgolly.servicenowLondon.servicenowLondonStrings.patch]
    
    inline def post: typingsJapgolly.servicenowLondon.servicenowLondonStrings.post = "post".asInstanceOf[typingsJapgolly.servicenowLondon.servicenowLondonStrings.post]
    
    inline def put: typingsJapgolly.servicenowLondon.servicenowLondonStrings.put = "put".asInstanceOf[typingsJapgolly.servicenowLondon.servicenowLondonStrings.put]
  }
  
  trait SOAPMessageV2 extends StObject {
    
    def execute(): SOAPResponseV2
    
    def executeAsync(): SOAPResponseV2
    
    def getEndpoint(): String
    
    def getRequestBody(): String
    
    def getRequestHeader(headerName: String): String
    
    def getRequestHeaders(): js.Object
    
    def setBasicAuth(userName: String, userPass: String): Unit
    
    def setEccCorrelator(correlator: String): Unit
    
    def setEccParameter(name: String, value: String): Unit
    
    def setEndpoint(endpoint: String): Unit
    
    def setHttpMethod(method: String): Unit
    
    def setHttpTimeout(timeoutMs: Double): Unit
    
    def setMIDServer(midServer: String): Unit
    
    def setMutualAuth(profileName: String): Unit
    
    def setRequestBody(body: String): Unit
    
    def setRequestHeader(name: String, value: String): Unit
    
    def setSOAPAction(soapAction: String): Unit
    
    def setStringParameter(name: String, value: String): Unit
    
    def setStringParameterNoEscape(name: String, value: String): Unit
    
    def setWSSecurity(keystoreId: String, keystoreAlias: String, keystorePassword: String, certificateId: String): Unit
  }
  object SOAPMessageV2 {
    
    inline def apply(
      execute: CallbackTo[SOAPResponseV2],
      executeAsync: CallbackTo[SOAPResponseV2],
      getEndpoint: CallbackTo[String],
      getRequestBody: CallbackTo[String],
      getRequestHeader: String => String,
      getRequestHeaders: CallbackTo[js.Object],
      setBasicAuth: (String, String) => Callback,
      setEccCorrelator: String => Callback,
      setEccParameter: (String, String) => Callback,
      setEndpoint: String => Callback,
      setHttpMethod: String => Callback,
      setHttpTimeout: Double => Callback,
      setMIDServer: String => Callback,
      setMutualAuth: String => Callback,
      setRequestBody: String => Callback,
      setRequestHeader: (String, String) => Callback,
      setSOAPAction: String => Callback,
      setStringParameter: (String, String) => Callback,
      setStringParameterNoEscape: (String, String) => Callback,
      setWSSecurity: (String, String, String, String) => Callback
    ): SOAPMessageV2 = {
      val __obj = js.Dynamic.literal(execute = execute.toJsFn, executeAsync = executeAsync.toJsFn, getEndpoint = getEndpoint.toJsFn, getRequestBody = getRequestBody.toJsFn, getRequestHeader = js.Any.fromFunction1(getRequestHeader), getRequestHeaders = getRequestHeaders.toJsFn, setBasicAuth = js.Any.fromFunction2((t0: String, t1: String) => (setBasicAuth(t0, t1)).runNow()), setEccCorrelator = js.Any.fromFunction1((t0: String) => setEccCorrelator(t0).runNow()), setEccParameter = js.Any.fromFunction2((t0: String, t1: String) => (setEccParameter(t0, t1)).runNow()), setEndpoint = js.Any.fromFunction1((t0: String) => setEndpoint(t0).runNow()), setHttpMethod = js.Any.fromFunction1((t0: String) => setHttpMethod(t0).runNow()), setHttpTimeout = js.Any.fromFunction1((t0: Double) => setHttpTimeout(t0).runNow()), setMIDServer = js.Any.fromFunction1((t0: String) => setMIDServer(t0).runNow()), setMutualAuth = js.Any.fromFunction1((t0: String) => setMutualAuth(t0).runNow()), setRequestBody = js.Any.fromFunction1((t0: String) => setRequestBody(t0).runNow()), setRequestHeader = js.Any.fromFunction2((t0: String, t1: String) => (setRequestHeader(t0, t1)).runNow()), setSOAPAction = js.Any.fromFunction1((t0: String) => setSOAPAction(t0).runNow()), setStringParameter = js.Any.fromFunction2((t0: String, t1: String) => (setStringParameter(t0, t1)).runNow()), setStringParameterNoEscape = js.Any.fromFunction2((t0: String, t1: String) => (setStringParameterNoEscape(t0, t1)).runNow()), setWSSecurity = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: String) => (setWSSecurity(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[SOAPMessageV2]
    }
    
    extension [Self <: SOAPMessageV2](x: Self) {
      
      inline def setExecute(value: CallbackTo[SOAPResponseV2]): Self = StObject.set(x, "execute", value.toJsFn)
      
      inline def setExecuteAsync(value: CallbackTo[SOAPResponseV2]): Self = StObject.set(x, "executeAsync", value.toJsFn)
      
      inline def setGetEndpoint(value: CallbackTo[String]): Self = StObject.set(x, "getEndpoint", value.toJsFn)
      
      inline def setGetRequestBody(value: CallbackTo[String]): Self = StObject.set(x, "getRequestBody", value.toJsFn)
      
      inline def setGetRequestHeader(value: String => String): Self = StObject.set(x, "getRequestHeader", js.Any.fromFunction1(value))
      
      inline def setGetRequestHeaders(value: CallbackTo[js.Object]): Self = StObject.set(x, "getRequestHeaders", value.toJsFn)
      
      inline def setSetBasicAuth(value: (String, String) => Callback): Self = StObject.set(x, "setBasicAuth", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetEccCorrelator(value: String => Callback): Self = StObject.set(x, "setEccCorrelator", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetEccParameter(value: (String, String) => Callback): Self = StObject.set(x, "setEccParameter", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetEndpoint(value: String => Callback): Self = StObject.set(x, "setEndpoint", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetHttpMethod(value: String => Callback): Self = StObject.set(x, "setHttpMethod", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetHttpTimeout(value: Double => Callback): Self = StObject.set(x, "setHttpTimeout", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetMIDServer(value: String => Callback): Self = StObject.set(x, "setMIDServer", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetMutualAuth(value: String => Callback): Self = StObject.set(x, "setMutualAuth", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetRequestBody(value: String => Callback): Self = StObject.set(x, "setRequestBody", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetRequestHeader(value: (String, String) => Callback): Self = StObject.set(x, "setRequestHeader", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetSOAPAction(value: String => Callback): Self = StObject.set(x, "setSOAPAction", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetStringParameter(value: (String, String) => Callback): Self = StObject.set(x, "setStringParameter", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetStringParameterNoEscape(value: (String, String) => Callback): Self = StObject.set(x, "setStringParameterNoEscape", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetWSSecurity(value: (String, String, String, String) => Callback): Self = StObject.set(x, "setWSSecurity", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: String) => (value(t0, t1, t2, t3)).runNow()))
    }
  }
  
  trait SOAPResponseV2 extends StObject {
    
    def getAllHeaders(): js.Array[Name]
    
    def getBody(): String
    
    def getCookies(): Get
    
    def getErrorCode(): Double
    
    def getErrorMessage(): String
    
    def getHeader(name: String): String
    
    def getHeaders(): js.Object
    
    def getStatusCode(): Double
    
    def haveError(): Boolean
    
    def waitForResponse(timeoutSecs: Double): Unit
  }
  object SOAPResponseV2 {
    
    inline def apply(
      getAllHeaders: CallbackTo[js.Array[Name]],
      getBody: CallbackTo[String],
      getCookies: CallbackTo[Get],
      getErrorCode: CallbackTo[Double],
      getErrorMessage: CallbackTo[String],
      getHeader: String => String,
      getHeaders: CallbackTo[js.Object],
      getStatusCode: CallbackTo[Double],
      haveError: CallbackTo[Boolean],
      waitForResponse: Double => Callback
    ): SOAPResponseV2 = {
      val __obj = js.Dynamic.literal(getAllHeaders = getAllHeaders.toJsFn, getBody = getBody.toJsFn, getCookies = getCookies.toJsFn, getErrorCode = getErrorCode.toJsFn, getErrorMessage = getErrorMessage.toJsFn, getHeader = js.Any.fromFunction1(getHeader), getHeaders = getHeaders.toJsFn, getStatusCode = getStatusCode.toJsFn, haveError = haveError.toJsFn, waitForResponse = js.Any.fromFunction1((t0: Double) => waitForResponse(t0).runNow()))
      __obj.asInstanceOf[SOAPResponseV2]
    }
    
    extension [Self <: SOAPResponseV2](x: Self) {
      
      inline def setGetAllHeaders(value: CallbackTo[js.Array[Name]]): Self = StObject.set(x, "getAllHeaders", value.toJsFn)
      
      inline def setGetBody(value: CallbackTo[String]): Self = StObject.set(x, "getBody", value.toJsFn)
      
      inline def setGetCookies(value: CallbackTo[Get]): Self = StObject.set(x, "getCookies", value.toJsFn)
      
      inline def setGetErrorCode(value: CallbackTo[Double]): Self = StObject.set(x, "getErrorCode", value.toJsFn)
      
      inline def setGetErrorMessage(value: CallbackTo[String]): Self = StObject.set(x, "getErrorMessage", value.toJsFn)
      
      inline def setGetHeader(value: String => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
      
      inline def setGetHeaders(value: CallbackTo[js.Object]): Self = StObject.set(x, "getHeaders", value.toJsFn)
      
      inline def setGetStatusCode(value: CallbackTo[Double]): Self = StObject.set(x, "getStatusCode", value.toJsFn)
      
      inline def setHaveError(value: CallbackTo[Boolean]): Self = StObject.set(x, "haveError", value.toJsFn)
      
      inline def setWaitForResponse(value: Double => Callback): Self = StObject.set(x, "waitForResponse", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
}
