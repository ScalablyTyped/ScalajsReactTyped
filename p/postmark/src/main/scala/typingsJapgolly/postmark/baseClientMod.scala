package typingsJapgolly.postmark

import typingsJapgolly.postmark.callbackMod.Callback
import typingsJapgolly.postmark.clientOptionsMod.ClientOptions.HttpMethod
import typingsJapgolly.postmark.errorHandlerMod.ErrorHandler
import typingsJapgolly.postmark.modelsMod.ClientOptions.Configuration
import typingsJapgolly.postmark.modelsMod.FilteringParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/BaseClient", JSImport.Namespace)
@js.native
object baseClientMod extends js.Object {
  @js.native
  trait BaseClient extends js.Object {
    val authHeader: js.Any = js.native
    var clientOptions: Configuration = js.native
    var clientVersion: String = js.native
    var errorHandler: ErrorHandler = js.native
    var getHttpRequestURL: js.Any = js.native
    var getRequestTimeoutInSeconds: js.Any = js.native
    /**
      * Process http request.
      *
      * @param method - Which type of http request will be executed.
      * @param path - API URL endpoint.
      * @param queryParameters - Querystring parameters used for http request.
      * @param body - Data sent with http request.
      */
    var httpRequest: js.Any = js.native
    /**
      * Process callback function for HTTP request.
      *
      * @param httpRequest - HTTP request for which callback will be executed
      * @param callback - callback function to be executed.
      */
    var processCallbackRequest: js.Any = js.native
    /**
      * Process HTTP request.
      *
      * @param method - Which type of http request will be executed.
      * @param path - API URL endpoint.
      * @param queryParameters - Querystring parameters used for http request.
      * @param body - Data sent with http request.
      *
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    var processHttpRequest: js.Any = js.native
    /**
      * Process request for Postmark ClientOptions.
      *
      * @param method - see processHttpRequest for details
      * @param path - see processHttpRequest for details
      * @param queryParameters - see processHttpRequest for details
      * @param body - see processHttpRequest for details
      * @param callback - callback function to be executed.
      *
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    var processRequest: js.Any = js.native
    /**
      * Handle http request to return it as Promise.
      *
      * @param method - Which type of http request will be executed.
      * @param path - API URL endpoint.
      * @param queryParameters - Querystring parameters used for http request.
      * @param body - Data sent with http request.
      *
      * @returns A promise that will complete when the API responds.
      */
    var promisifiedHttpRequest: js.Any = js.native
    val token: js.Any = js.native
    /**
      * Token can't be empty.
      *
      * @param {string} token - HTTP request token
      */
    var verifyToken: js.Any = js.native
    /**
      * JSON object with default headers sent by HTTP request.
      */
    def getComposedHttpRequestHeaders(): js.Object = js.native
    /**
      * Process http request with sending body - data.
      *
      * @see processRequest for more details.
      */
    /* protected */ def processRequestWithBody[T](method: HttpMethod, path: String): js.Promise[T] = js.native
    /* protected */ def processRequestWithBody[T](method: HttpMethod, path: String, body: js.Object): js.Promise[T] = js.native
    /* protected */ def processRequestWithBody[T](method: HttpMethod, path: String, body: js.Object, callback: Callback[T]): js.Promise[T] = js.native
    /* protected */ def processRequestWithBody[T](method: HttpMethod, path: String, body: Null, callback: Callback[T]): js.Promise[T] = js.native
    /**
      * Process http request without sending body - data.
      *
      * @see processRequest for more details.
      */
    /* protected */ def processRequestWithoutBody[T](method: HttpMethod, path: String): js.Promise[T] = js.native
    /* protected */ def processRequestWithoutBody[T](method: HttpMethod, path: String, queryParameters: js.Object): js.Promise[T] = js.native
    /* protected */ def processRequestWithoutBody[T](method: HttpMethod, path: String, queryParameters: js.Object, callback: Callback[T]): js.Promise[T] = js.native
    /**
      * Set default values for count and offset when doing filtering with API requests if they are not specified by filter.
      */
    /* protected */ def setDefaultPaginationValues(filter: FilteringParameters): Unit = js.native
  }
  
  @js.native
  abstract class default protected () extends BaseClient {
    protected def this(token: String, authHeader: String) = this()
    protected def this(token: String, authHeader: String, configOptions: Configuration) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    /**
      * Client connection configuration options.
      * You may modify these values and new clients will use them.
      * Any values provided to a Client constructor will override default options.
      */
    var DefaultOptions: Configuration = js.native
  }
  
}

