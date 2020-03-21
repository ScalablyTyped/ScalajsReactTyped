package typingsJapgolly.typedRestClient.restClientMod

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.typedRestClient.httpClientMod.HttpClient
import typingsJapgolly.typedRestClient.interfacesMod.IRequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-rest-client/RestClient", "RestClient")
@js.native
class RestClient protected () extends js.Object {
  /**
    * Creates an instance of the RestClient
    * @constructor
    * @param {string} userAgent - userAgent for requests
    * @param {string} baseUrl - (Optional) If not specified, use full urls per request.  If supplied and a function passes a relative url, it will be appended to this
    * @param {ifm.IRequestHandler[]} handlers - handlers are typically auth handlers (basic, bearer, ntlm supplied)
    * @param {ifm.IRequestOptions} requestOptions - options for each http requests (http proxy setting, socket timeout)
    */
  def this(userAgent: String) = this()
  def this(userAgent: String, baseUrl: String) = this()
  def this(userAgent: String, baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
  def this(
    userAgent: String,
    baseUrl: String,
    handlers: js.Array[IRequestHandler],
    requestOptions: typingsJapgolly.typedRestClient.interfacesMod.IRequestOptions
  ) = this()
  var _baseUrl: js.Any = js.native
  var _headersFromOptions: js.Any = js.native
  var _processResponse: js.Any = js.native
  var client: HttpClient = js.native
  var versionParam: String = js.native
  /**
    * Creates resource(s) from an endpoint
    * T type of object returned.
    * Be aware that not found returns a null.  Other error conditions reject the promise
    * @param {string} resource - fully qualified or relative url
    * @param {IRequestOptions} requestOptions - (optional) requestOptions object
    */
  def create[T](resource: String, resources: js.Any): js.Promise[IRestResponse[T]] = js.native
  def create[T](resource: String, resources: js.Any, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
  /**
    * Deletes a resource from an endpoint
    * Be aware that not found returns a null.  Other error conditions reject the promise
    * @param {string} resource - fully qualified or relative url
    * @param {IRequestOptions} requestOptions - (optional) requestOptions object
    */
  def del[T](resource: String): js.Promise[IRestResponse[T]] = js.native
  def del[T](resource: String, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
  /**
    * Gets a resource from an endpoint
    * Be aware that not found returns a null.  Other error conditions reject the promise
    * @param {string} resource - fully qualified url or relative path
    * @param {IRequestOptions} requestOptions - (optional) requestOptions object
    */
  def get[T](resource: String): js.Promise[IRestResponse[T]] = js.native
  def get[T](resource: String, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
  /**
    * Gets a resource from an endpoint
    * Be aware that not found returns a null.  Other error conditions reject the promise
    * @param {string} requestUrl - fully qualified or relative url
    * @param {IRequestOptions} requestOptions - (optional) requestOptions object
    */
  def options[T](requestUrl: String): js.Promise[IRestResponse[T]] = js.native
  def options[T](requestUrl: String, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
  /**
    * Replaces resource(s) from an endpoint
    * T type of object returned.
    * Be aware that not found returns a null.  Other error conditions reject the promise
    * @param {string} resource - fully qualified or relative url
    * @param {IRequestOptions} requestOptions - (optional) requestOptions object
    */
  def replace[T](resource: String, resources: js.Any): js.Promise[IRestResponse[T]] = js.native
  def replace[T](resource: String, resources: js.Any, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
  /**
    * Updates resource(s) from an endpoint
    * T type of object returned.
    * Be aware that not found returns a null.  Other error conditions reject the promise
    * @param {string} resource - fully qualified or relative url
    * @param {IRequestOptions} requestOptions - (optional) requestOptions object
    */
  def update[T](resource: String, resources: js.Any): js.Promise[IRestResponse[T]] = js.native
  def update[T](resource: String, resources: js.Any, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
  def uploadStream[T](verb: String, requestUrl: String, stream: ReadableStream): js.Promise[IRestResponse[T]] = js.native
  def uploadStream[T](verb: String, requestUrl: String, stream: ReadableStream, options: IRequestOptions): js.Promise[IRestResponse[T]] = js.native
}

/* static members */
@JSImport("typed-rest-client/RestClient", "RestClient")
@js.native
object RestClient extends js.Object {
  var dateTimeDeserializer: js.Any = js.native
}

