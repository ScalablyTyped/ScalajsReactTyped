package typingsJapgolly.atAngularCommon.httpHttpMod

import org.scalajs.dom.raw.Blob
import typingsJapgolly.atAngularCommon.Anon_ArraybufferBlob
import typingsJapgolly.atAngularCommon.Anon_ArraybufferBody
import typingsJapgolly.atAngularCommon.Anon_ArraybufferBodyEvents
import typingsJapgolly.atAngularCommon.Anon_ArraybufferBodyHeader
import typingsJapgolly.atAngularCommon.Anon_ArraybufferBodyHeaderHeaders
import typingsJapgolly.atAngularCommon.Anon_ArraybufferEvents
import typingsJapgolly.atAngularCommon.Anon_ArraybufferHeader
import typingsJapgolly.atAngularCommon.Anon_Blob
import typingsJapgolly.atAngularCommon.Anon_BlobBody
import typingsJapgolly.atAngularCommon.Anon_BlobBodyHeader
import typingsJapgolly.atAngularCommon.Anon_BlobBodyHeaderHeaders
import typingsJapgolly.atAngularCommon.Anon_BlobEvents
import typingsJapgolly.atAngularCommon.Anon_BlobHeader
import typingsJapgolly.atAngularCommon.Anon_BodyEvents
import typingsJapgolly.atAngularCommon.Anon_BodyEventsHeader
import typingsJapgolly.atAngularCommon.Anon_BodyHeader
import typingsJapgolly.atAngularCommon.Anon_BodyHeaderHeaders
import typingsJapgolly.atAngularCommon.Anon_BodyHeaderHeadersJson
import typingsJapgolly.atAngularCommon.Anon_BodyHeaderHeadersJsonObserve
import typingsJapgolly.atAngularCommon.Anon_BodyHeaderHeadersJsonObserveParam
import typingsJapgolly.atAngularCommon.Anon_BodyHeaderHeadersObserve
import typingsJapgolly.atAngularCommon.Anon_Events
import typingsJapgolly.atAngularCommon.Anon_EventsHeader
import typingsJapgolly.atAngularCommon.Anon_EventsHeaderHeaders
import typingsJapgolly.atAngularCommon.Anon_Header
import typingsJapgolly.atAngularCommon.Anon_HeaderHeaders
import typingsJapgolly.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/http", "HttpClient")
@js.native
class HttpClient protected () extends js.Object {
  def this(handler: HttpHandler) = this()
  var handler: js.Any = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a JSON object and
    * returns the response body as a JSON object.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body of type `Object`.
    */
  def delete(url: String): Observable[js.Object] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as an `ArrayBuffer`
    *  and returns the response as an `ArrayBuffer`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return  An `Observable` of the response body as an `ArrayBuffer`.
    */
  def delete(url: String, options: Anon_ArraybufferBodyHeaderHeaders): Observable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as an `ArrayBuffer`
    *  and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HTTPEvents` for the request,
    * with response body as an `ArrayBuffer`.
    */
  def delete(url: String, options: Anon_ArraybufferEvents): Observable[HttpEvent[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as an `ArrayBuffer` and returns
    *  the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the full `HTTPResponse`, with the response body as an `ArrayBuffer`.
    */
  def delete(url: String, options: Anon_ArraybufferHeader): Observable[HttpResponse[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a `Blob` and returns
    * the response as a `Blob`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response body as a `Blob`.
    */
  def delete(url: String, options: Anon_BlobBodyHeaderHeaders): Observable[Blob] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a `Blob`
    *  and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all the `HTTPEvents` for the request, with the response body as a
    * `Blob`.
    */
  def delete(url: String, options: Anon_BlobEvents): Observable[HttpEvent[Blob]] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a `Blob` and returns the full
    * `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse`, with the response body of type `Blob`.
    */
  def delete(url: String, options: Anon_BlobHeader): Observable[HttpResponse[Blob]] = js.native
  def delete(url: String, options: Anon_BodyHeaderHeadersJsonObserveParam): Observable[js.Object] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a text string and returns
    * a string.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body of type string.
    */
  def delete(url: String, options: Anon_BodyHeaderHeadersObserve): Observable[String] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a text string
    * and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HTTPEvents` for the request, with the response
    *  body of type string.
    */
  def delete(url: String, options: Anon_Events): Observable[HttpEvent[String]] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a JSON object
    * and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HTTPEvents` for the request, with response body of
    * type `Object`.
    */
  def delete(url: String, options: Anon_EventsHeader): Observable[HttpEvent[js.Object]] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a text stream and
    *  returns the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the full `HTTPResponse`, with the response body of type string.
    */
  def delete(url: String, options: Anon_Header): Observable[HttpResponse[String]] = js.native
  /**
    * Constructs a `DELETE` request the interprets the body as a JSON object and returns
    * the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse`, with the response body of type `Object`.
    *
    */
  def delete(url: String, options: Anon_HeaderHeaders): Observable[HttpResponse[js.Object]] = js.native
  /**
    * Constructs a DELETE request that interprets the body as a JSON object and returns
    * the response in a given type.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse`, with response body in the requested type.
    */
  @JSName("delete")
  def delete_T[T](url: String): Observable[T] = js.native
  @JSName("delete")
  def delete_T[T](url: String, options: Anon_BodyHeaderHeadersJsonObserveParam): Observable[T] = js.native
  /**
    * Constructs a `DELETE`request that interprets the body as a JSON object
    * and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all the `HTTPEvents` for the request, with a response
    * body in the requested type.
    */
  @JSName("delete")
  def delete_T[T](url: String, options: Anon_EventsHeader): Observable[HttpEvent[T]] = js.native
  /**
    * Constructs a `DELETE` request that interprets the body as a JSON object
    * and returns the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse`, with the response body of the requested type.
    */
  @JSName("delete")
  def delete_T[T](url: String, options: Anon_HeaderHeaders): Observable[HttpResponse[T]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a JSON object and
    * returns the response body as a JSON object.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    *
    * @return An `Observable` of the response body as a JSON object.
    */
  def get(url: String): Observable[js.Object] = js.native
  /**
    * Constructs a `GET` request that interprets the body as an `ArrayBuffer` and returns the response in
    *  an `ArrayBuffer`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body as an `ArrayBuffer`.
    */
  def get(url: String, options: Anon_ArraybufferBodyHeaderHeaders): Observable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  /**
    * Constructs a `GET` request that interprets the body as an `ArrayBuffer` and returns
    *  the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HttpEvents` for the request, with the response
    * body as an `ArrayBuffer`.
    */
  def get(url: String, options: Anon_ArraybufferEvents): Observable[HttpEvent[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as an `ArrayBuffer` and
    * returns the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def get(url: String, options: Anon_ArraybufferHeader): Observable[HttpResponse[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a `Blob`
    * and returns the response as a `Blob`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body as a `Blob`.
    */
  def get(url: String, options: Anon_BlobBodyHeaderHeaders): Observable[Blob] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a `Blob` and
    * returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body as a `Blob`.
    */
  def get(url: String, options: Anon_BlobEvents): Observable[HttpEvent[Blob]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a `Blob` and
    * returns the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    *  with the response body as a `Blob`.
    */
  def get(url: String, options: Anon_BlobHeader): Observable[HttpResponse[Blob]] = js.native
  def get(url: String, options: Anon_BodyHeaderHeadersJsonObserveParam): Observable[js.Object] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a text string
    * and returns the response as a string value.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body of type string.
    */
  def get(url: String, options: Anon_BodyHeaderHeadersObserve): Observable[String] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a text string and returns
    * the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body of type string.
    */
  def get(url: String, options: Anon_Events): Observable[HttpEvent[String]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a JSON object
    * and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body of type `Object`.
    */
  def get(url: String, options: Anon_EventsHeader): Observable[HttpEvent[js.Object]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a text stream and
    * returns the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with the response body of type string.
    */
  def get(url: String, options: Anon_Header): Observable[HttpResponse[String]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a JSON object and
    * returns the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the full `HttpResponse`,
    * with the response body of type `Object`.
    */
  def get(url: String, options: Anon_HeaderHeaders): Observable[HttpResponse[js.Object]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a JSON object and returns
    * the response body in a given type.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse`, with a response body in the requested type.
    */
  @JSName("get")
  def get_T[T](url: String): Observable[T] = js.native
  @JSName("get")
  def get_T[T](url: String, options: Anon_BodyHeaderHeadersJsonObserveParam): Observable[T] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a JSON object and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with a response body in the requested type.
    */
  @JSName("get")
  def get_T[T](url: String, options: Anon_EventsHeader): Observable[HttpEvent[T]] = js.native
  /**
    * Constructs a `GET` request that interprets the body as a JSON object and
    * returns the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the full `HTTPResponse` for the request,
    * with a response body in the requested type.
    */
  @JSName("get")
  def get_T[T](url: String, options: Anon_HeaderHeaders): Observable[HttpResponse[T]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a JSON object and
    * returns the response body as a JSON object.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body as a JSON object.
    */
  def head(url: String): Observable[js.Object] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as an `ArrayBuffer` and
    * returns the response as an `ArrayBuffer`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body as an `ArrayBuffer`.
    */
  def head(url: String, options: Anon_ArraybufferBodyHeaderHeaders): Observable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as an  `ArrayBuffer`
    *  and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of tall `HttpEvents` for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def head(url: String, options: Anon_ArraybufferEvents): Observable[HttpEvent[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as an `ArrayBuffer`
    *  and returns the full HTTP response.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def head(url: String, options: Anon_ArraybufferHeader): Observable[HttpResponse[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a `Blob` and returns
    * the response as a `Blob`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return  An `Observable` of the response, with the response body as a `Blob`.
    */
  def head(url: String, options: Anon_BlobBodyHeaderHeaders): Observable[Blob] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a `Blob` and
    * returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HttpEvents` for the request,
    * with the response body as a `Blob`.
    */
  def head(url: String, options: Anon_BlobEvents): Observable[HttpEvent[Blob]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a `Blob` and returns
    * the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with the response body as a blob.
    */
  def head(url: String, options: Anon_BlobHeader): Observable[HttpResponse[Blob]] = js.native
  def head(url: String, options: Anon_BodyHeaderHeadersJsonObserveParam): Observable[js.Object] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a text string and returns the response
    * as a string value.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body of type string.
    */
  def head(url: String, options: Anon_BodyHeaderHeadersObserve): Observable[String] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a text string
    * and returns the full event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all HttpEvents for the request, with the response body of type string.
    */
  def head(url: String, options: Anon_Events): Observable[HttpEvent[String]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a JSON object
    * and returns the full HTTP event stream.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HTTPEvents` for the request, with a response body of
    * type `Object`.
    */
  def head(url: String, options: Anon_EventsHeader): Observable[HttpEvent[js.Object]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as text stream
    * and returns the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with the response body of type string.
    */
  def head(url: String, options: Anon_Header): Observable[HttpResponse[String]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a JSON object and
    * returns the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with the response body of type `Object`.
    */
  def head(url: String, options: Anon_HeaderHeaders): Observable[HttpResponse[js.Object]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a JSON object and returns
    * the response in a given type.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with a response body of the given type.
    */
  @JSName("head")
  def head_T[T](url: String): Observable[T] = js.native
  @JSName("head")
  def head_T[T](url: String, options: Anon_BodyHeaderHeadersJsonObserveParam): Observable[T] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a JSON object and
    * returns the full event stream.
    *
    * @return An `Observable` of all the `HTTPEvents` for the request
    * , with a response body in the requested type.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    */
  @JSName("head")
  def head_T[T](url: String, options: Anon_EventsHeader): Observable[HttpEvent[T]] = js.native
  /**
    * Constructs a `HEAD` request that interprets the body as a JSON object
    * and returns the full `HTTPResponse`.
    *
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with a responmse body of the requested type.
    */
  @JSName("head")
  def head_T[T](url: String, options: Anon_HeaderHeaders): Observable[HttpResponse[T]] = js.native
  /**
    * Constructs a `JSONP` request for the given URL and name of the callback parameter.
    *
    * @param url The resource URL.
    * @param callbackParam The callback function name.
    *
    * @return An `Observable` of the response object, with response body as an object.
    */
  def jsonp(url: String, callbackParam: String): Observable[js.Object] = js.native
  /**
    * Constructs a `JSONP` request for the given URL and name of the callback parameter.
    *
    * @param url The resource URL.
    * @param callbackParam The callback function name.
    *
    * You must install a suitable interceptor, such as one provided by `HttpClientJsonpModule`.
    * If no such interceptor is reached,
    * then the `JSONP` request can be rejected by the configured backend.
    *
    * @return An `Observable` of the response object, with response body in the requested type.
    */
  @JSName("jsonp")
  def jsonp_T[T](url: String, callbackParam: String): Observable[T] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a JSON object and returns the response
    * body as a JSON object.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body as a JSON object.
    */
  def options(url: String): Observable[js.Object] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as an
    * `ArrayBuffer` and returns the response as an `ArrayBuffer`.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body as an `ArrayBuffer`.
    */
  def options(url: String, options: Anon_ArraybufferBodyHeaderHeaders): Observable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as an `ArrayBuffer`
    *  and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return  An `Observable` of all `HttpEvents` for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def options(url: String, options: Anon_ArraybufferEvents): Observable[HttpEvent[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as an `ArrayBuffer`
    *  and returns the full HTTP response.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def options(url: String, options: Anon_ArraybufferHeader): Observable[HttpResponse[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a `Blob` and returns
    * the response as a `Blob`.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body as a `Blob`.
    */
  def options(url: String, options: Anon_BlobBodyHeaderHeaders): Observable[Blob] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a `Blob` and
    * returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of all `HttpEvents` for the request,
    * with the response body as a `Blob`.
    */
  def options(url: String, options: Anon_BlobEvents): Observable[HttpEvent[Blob]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a `Blob`
    *  and returns the full `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    *  with the response body as a `Blob`.
    */
  def options(url: String, options: Anon_BlobHeader): Observable[HttpResponse[Blob]] = js.native
  def options(url: String, options: Anon_BodyHeaderHeadersJsonObserveParam): Observable[js.Object] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a text string and
    * returns a string value.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body of type string.
    */
  def options(url: String, options: Anon_BodyHeaderHeadersObserve): Observable[String] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a text string
    * and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HTTPEvents` for the request,
    * with the response body of type string.
    */
  def options(url: String, options: Anon_Events): Observable[HttpEvent[String]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a JSON object
    * and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HttpEvents` for the request with the response
    * body of type `Object`.
    */
  def options(url: String, options: Anon_EventsHeader): Observable[HttpEvent[js.Object]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as text stream
    * and returns the full `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    *  with the response body of type string.
    */
  def options(url: String, options: Anon_Header): Observable[HttpResponse[String]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a JSON object
    * and returns the full `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with the response body of type `Object`.
    */
  def options(url: String, options: Anon_HeaderHeaders): Observable[HttpResponse[js.Object]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a JSON object and returns the response
    * in a given type.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HTTPResponse`, with a response body of the given type.
    */
  @JSName("options")
  def options_T[T](url: String): Observable[T] = js.native
  @JSName("options")
  def options_T[T](url: String, options: Anon_BodyHeaderHeadersJsonObserveParam): Observable[T] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a JSON object and
    * returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HttpEvents` for the request,
    * with a response body in the requested type.
    */
  @JSName("options")
  def options_T[T](url: String, options: Anon_EventsHeader): Observable[HttpEvent[T]] = js.native
  /**
    * Constructs an `OPTIONS` request that interprets the body as a JSON object and
    * returns the full `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with a response body in the requested type.
    */
  @JSName("options")
  def options_T[T](url: String, options: Anon_HeaderHeaders): Observable[HttpResponse[T]] = js.native
  def patch(url: String): Observable[js.Object] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a JSON object and
    * returns the response body as a JSON object.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body as a JSON object.
    */
  def patch(url: String, body: js.Any): Observable[js.Object] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as an `ArrayBuffer` and returns
    * the response as an `ArrayBuffer`.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body as an `ArrayBuffer`.
    */
  def patch(url: String, body: js.Any, options: Anon_ArraybufferBodyHeaderHeaders): Observable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as an `ArrayBuffer` and
    *  returns the the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HTTPevents` for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def patch(url: String, body: js.Any, options: Anon_ArraybufferEvents): Observable[HttpEvent[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as an `ArrayBuffer`
    *  and returns the full `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return  An `Observable` of the `HttpResponse` for the request,
    *  with the response body as an `ArrayBuffer`.
    */
  def patch(url: String, body: js.Any, options: Anon_ArraybufferHeader): Observable[HttpResponse[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a `Blob` and returns the response
    * as a `Blob`.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body as a `Blob`.
    */
  def patch(url: String, body: js.Any, options: Anon_BlobBodyHeaderHeaders): Observable[Blob] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a `Blob`
    *  and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HTTPevents` for the request, with the
    * response body as `Blob`.
    */
  def patch(url: String, body: js.Any, options: Anon_BlobEvents): Observable[HttpEvent[Blob]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a `Blob` and returns the full
    * `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return  An `Observable` of the `HttpResponse` for the request,
    * with the response body as a `Blob`.
    */
  def patch(url: String, body: js.Any, options: Anon_BlobHeader): Observable[HttpResponse[Blob]] = js.native
  def patch(url: String, body: js.Any, options: Anon_BodyHeaderHeadersJsonObserveParam): Observable[js.Object] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as as a text string and
    * returns the response as a string value.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with a response body of type string.
    */
  def patch(url: String, body: js.Any, options: Anon_BodyHeaderHeadersObserve): Observable[String] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a text string and
    * returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HTTPevents`for the request, with a
    * response body of type string.
    */
  def patch(url: String, body: js.Any, options: Anon_Events): Observable[HttpEvent[String]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a JSON object
    * and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HTTPevents` for the request,
    * with a response body of type `Object`.
    */
  def patch(url: String, body: js.Any, options: Anon_EventsHeader): Observable[HttpEvent[js.Object]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a text stream and returns the
    * full `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return  An `Observable` of the `HttpResponse` for the request,
    * with a response body of type string.
    */
  def patch(url: String, body: js.Any, options: Anon_Header): Observable[HttpResponse[String]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a JSON object
    * and returns the full `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with a response body in the requested type.
    */
  def patch(url: String, body: js.Any, options: Anon_HeaderHeaders): Observable[HttpResponse[js.Object]] = js.native
  def patch(url: String, body: Null, options: Anon_ArraybufferBodyHeaderHeaders): Observable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def patch(url: String, body: Null, options: Anon_ArraybufferEvents): Observable[HttpEvent[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  def patch(url: String, body: Null, options: Anon_ArraybufferHeader): Observable[HttpResponse[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  def patch(url: String, body: Null, options: Anon_BlobBodyHeaderHeaders): Observable[Blob] = js.native
  def patch(url: String, body: Null, options: Anon_BlobEvents): Observable[HttpEvent[Blob]] = js.native
  def patch(url: String, body: Null, options: Anon_BlobHeader): Observable[HttpResponse[Blob]] = js.native
  def patch(url: String, body: Null, options: Anon_BodyHeaderHeadersJsonObserveParam): Observable[js.Object] = js.native
  def patch(url: String, body: Null, options: Anon_BodyHeaderHeadersObserve): Observable[String] = js.native
  def patch(url: String, body: Null, options: Anon_Events): Observable[HttpEvent[String]] = js.native
  def patch(url: String, body: Null, options: Anon_EventsHeader): Observable[HttpEvent[js.Object]] = js.native
  def patch(url: String, body: Null, options: Anon_Header): Observable[HttpResponse[String]] = js.native
  def patch(url: String, body: Null, options: Anon_HeaderHeaders): Observable[HttpResponse[js.Object]] = js.native
  @JSName("patch")
  def patch_T[T](url: String): Observable[T] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a JSON object
    * and returns the response in a given type.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return  An `Observable` of the `HttpResponse` for the request,
    * with a response body in the given type.
    */
  @JSName("patch")
  def patch_T[T](url: String, body: js.Any): Observable[T] = js.native
  @JSName("patch")
  def patch_T[T](url: String, body: js.Any, options: Anon_BodyHeaderHeadersJsonObserveParam): Observable[T] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a JSON object
    * and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of all the `HTTPevents` for the request,
    *  with a response body in the requested type.
    */
  @JSName("patch")
  def patch_T[T](url: String, body: js.Any, options: Anon_EventsHeader): Observable[HttpEvent[T]] = js.native
  /**
    * Constructs a `PATCH` request that interprets the body as a JSON object
    * and returns the full `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param body The resources to edit.
    * @param options HTTP options.
    *
    * @return An `Observable` of the `HttpResponse` for the request,
    * with a response body in the given type.
    */
  @JSName("patch")
  def patch_T[T](url: String, body: js.Any, options: Anon_HeaderHeaders): Observable[HttpResponse[T]] = js.native
  @JSName("patch")
  def patch_T[T](url: String, body: Null, options: Anon_BodyHeaderHeadersJsonObserveParam): Observable[T] = js.native
  @JSName("patch")
  def patch_T[T](url: String, body: Null, options: Anon_EventsHeader): Observable[HttpEvent[T]] = js.native
  @JSName("patch")
  def patch_T[T](url: String, body: Null, options: Anon_HeaderHeaders): Observable[HttpResponse[T]] = js.native
  def post(url: String): Observable[js.Object] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a
    * JSON object and returns the response body as a JSON object.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of the response, with the response body as a JSON object.
    */
  def post(url: String, body: js.Any): Observable[js.Object] = js.native
  /**
    * Constructs a `POST` request that interprets the body as an as an `ArrayBuffer` and returns
    * an `ArrayBuffer`.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options.
    *
    * @return An `Observable` of the response, with the response body as an `ArrayBuffer`.
    */
  def post(url: String, body: js.Any, options: Anon_ArraybufferBodyHeaderHeaders): Observable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  /**
    * Constructs a `POST` request that interprets the body as an `ArrayBuffer` and
    * returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvents` for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def post(url: String, body: js.Any, options: Anon_ArraybufferEvents): Observable[HttpEvent[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a POST request that interprets the body as an `ArrayBuffer`
    *  and returns the full `HTTPresponse`.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return  An `Observable` of the `HTTPResponse` for the request, with the response body as an `ArrayBuffer`.
    */
  def post(url: String, body: js.Any, options: Anon_ArraybufferHeader): Observable[HttpResponse[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a `Blob` and returns the
    * response as a `Blob`.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of the response, with the response body as a `Blob`.
    */
  def post(url: String, body: js.Any, options: Anon_BlobBodyHeaderHeaders): Observable[Blob] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a `Blob`
    * and returns the response in an observable of the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvents` for the request, with the response body as `Blob`.
    */
  def post(url: String, body: js.Any, options: Anon_BlobEvents): Observable[HttpEvent[Blob]] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a `Blob` and returns the full
    * `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with the response body as a `Blob`.
    */
  def post(url: String, body: js.Any, options: Anon_BlobHeader): Observable[HttpResponse[Blob]] = js.native
  def post(url: String, body: js.Any, options: Anon_BodyHeaderHeadersJsonObserveParam): Observable[js.Object] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a text string and
    * returns the response as a string value.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of the response, with a response body of type string.
    */
  def post(url: String, body: js.Any, options: Anon_BodyHeaderHeadersObserve): Observable[String] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a text string and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return  An `Observable` of all `HttpEvents` for the request,
    * with a response body of type string.
    */
  def post(url: String, body: js.Any, options: Anon_Events): Observable[HttpEvent[String]] = js.native
  /**
    * Constructs a POST request that interprets the body as a JSON object and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return  An `Observable` of all `HttpEvents` for the request,
    * with a response body of type `Object`.
    */
  def post(url: String, body: js.Any, options: Anon_EventsHeader): Observable[HttpEvent[js.Object]] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a text stream and returns
    * the full `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return  An `Observable` of the `HTTPResponse` for the request,
    * with a response body of type string.
    */
  def post(url: String, body: js.Any, options: Anon_Header): Observable[HttpResponse[String]] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a JSON object
    * and returns the full `HTTPResponse`.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HTTPResponse` for the request, with a response body of type
    * `Object`.
    */
  def post(url: String, body: js.Any, options: Anon_HeaderHeaders): Observable[HttpResponse[js.Object]] = js.native
  def post(url: String, body: Null, options: Anon_ArraybufferBodyHeaderHeaders): Observable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def post(url: String, body: Null, options: Anon_ArraybufferEvents): Observable[HttpEvent[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  def post(url: String, body: Null, options: Anon_ArraybufferHeader): Observable[HttpResponse[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  def post(url: String, body: Null, options: Anon_BlobBodyHeaderHeaders): Observable[Blob] = js.native
  def post(url: String, body: Null, options: Anon_BlobEvents): Observable[HttpEvent[Blob]] = js.native
  def post(url: String, body: Null, options: Anon_BlobHeader): Observable[HttpResponse[Blob]] = js.native
  def post(url: String, body: Null, options: Anon_BodyHeaderHeadersJsonObserveParam): Observable[js.Object] = js.native
  def post(url: String, body: Null, options: Anon_BodyHeaderHeadersObserve): Observable[String] = js.native
  def post(url: String, body: Null, options: Anon_Events): Observable[HttpEvent[String]] = js.native
  def post(url: String, body: Null, options: Anon_EventsHeader): Observable[HttpEvent[js.Object]] = js.native
  def post(url: String, body: Null, options: Anon_Header): Observable[HttpResponse[String]] = js.native
  def post(url: String, body: Null, options: Anon_HeaderHeaders): Observable[HttpResponse[js.Object]] = js.native
  @JSName("post")
  def post_T[T](url: String): Observable[T] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a JSON object
    * and returns an observable of the response.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return  An `Observable` of the `HTTPResponse` for the request, with a response body in the requested type.
    */
  @JSName("post")
  def post_T[T](url: String, body: js.Any): Observable[T] = js.native
  @JSName("post")
  def post_T[T](url: String, body: js.Any, options: Anon_BodyHeaderHeadersJsonObserveParam): Observable[T] = js.native
  /**
    * Constructs a POST request that interprets the body as a JSON object and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvents` for the request,
    * with a response body in the requested type.
    */
  @JSName("post")
  def post_T[T](url: String, body: js.Any, options: Anon_EventsHeader): Observable[HttpEvent[T]] = js.native
  /**
    * Constructs a `POST` request that interprets the body as a JSON object and returns the full
    * `HTTPResponse`.
    *
    *
    * @param url The endpoint URL.
    * @param body The content to replace with.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HTTPResponse` for the request, with a response body in the requested type.
    */
  @JSName("post")
  def post_T[T](url: String, body: js.Any, options: Anon_HeaderHeaders): Observable[HttpResponse[T]] = js.native
  @JSName("post")
  def post_T[T](url: String, body: Null, options: Anon_BodyHeaderHeadersJsonObserveParam): Observable[T] = js.native
  @JSName("post")
  def post_T[T](url: String, body: Null, options: Anon_EventsHeader): Observable[HttpEvent[T]] = js.native
  @JSName("post")
  def post_T[T](url: String, body: Null, options: Anon_HeaderHeaders): Observable[HttpResponse[T]] = js.native
  def put(url: String): Observable[js.Object] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a JSON object and returns the response
    * body as a JSON object.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the response, with the response body as a JSON object.
    */
  def put(url: String, body: js.Any): Observable[js.Object] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as an `ArrayBuffer` and returns the
    * response as an `ArrayBuffer`.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the response, with the response body as an `ArrayBuffer`.
    */
  def put(url: String, body: js.Any, options: Anon_ArraybufferBodyHeaderHeaders): Observable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as an `ArrayBuffer` and
    * returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvents` for the request,
    * with the response body as an `ArrayBuffer`.
    */
  def put(url: String, body: js.Any, options: Anon_ArraybufferEvents): Observable[HttpEvent[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as an
    * `ArrayBuffer` and returns an observable of the full HTTP response.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HTTPResponse` for the request, with the response body as an `ArrayBuffer`.
    */
  def put(url: String, body: js.Any, options: Anon_ArraybufferHeader): Observable[HttpResponse[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a `Blob` and returns
    * the response as a `Blob`.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the response, with the response body as a `Blob`.
    */
  def put(url: String, body: js.Any, options: Anon_BlobBodyHeaderHeaders): Observable[Blob] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a `Blob` and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvents` for the request,
    * with the response body as a `Blob`.
    */
  def put(url: String, body: js.Any, options: Anon_BlobEvents): Observable[HttpEvent[Blob]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a `Blob` and returns the
    * full HTTP response.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with the response body as a `Blob`.
    */
  def put(url: String, body: js.Any, options: Anon_BlobHeader): Observable[HttpResponse[Blob]] = js.native
  def put(url: String, body: js.Any, options: Anon_BodyHeaderHeadersJsonObserveParam): Observable[js.Object] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a text string and
    * returns the response as a string value.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the response, with a response body of type string.
    */
  def put(url: String, body: js.Any, options: Anon_BodyHeaderHeadersObserve): Observable[String] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a text string and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of all HttpEvents for the request, with a response body
    * of type string.
    */
  def put(url: String, body: js.Any, options: Anon_Events): Observable[HttpEvent[String]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a JSON object and returns the full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvents` for the request, with a response body of
    * type `Object`.
    */
  def put(url: String, body: js.Any, options: Anon_EventsHeader): Observable[HttpEvent[js.Object]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a text stream and returns the
    * full HTTP response.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HTTPResponse` for the request, with a response body of type string.
    */
  def put(url: String, body: js.Any, options: Anon_Header): Observable[HttpResponse[String]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a JSON object and returns the full HTTP response.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HTTPResponse` for the request, with a response body
    * of type 'Object`.
    */
  def put(url: String, body: js.Any, options: Anon_HeaderHeaders): Observable[HttpResponse[js.Object]] = js.native
  def put(url: String, body: Null, options: Anon_ArraybufferBodyHeaderHeaders): Observable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def put(url: String, body: Null, options: Anon_ArraybufferEvents): Observable[HttpEvent[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  def put(url: String, body: Null, options: Anon_ArraybufferHeader): Observable[HttpResponse[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  def put(url: String, body: Null, options: Anon_BlobBodyHeaderHeaders): Observable[Blob] = js.native
  def put(url: String, body: Null, options: Anon_BlobEvents): Observable[HttpEvent[Blob]] = js.native
  def put(url: String, body: Null, options: Anon_BlobHeader): Observable[HttpResponse[Blob]] = js.native
  def put(url: String, body: Null, options: Anon_BodyHeaderHeadersJsonObserveParam): Observable[js.Object] = js.native
  def put(url: String, body: Null, options: Anon_BodyHeaderHeadersObserve): Observable[String] = js.native
  def put(url: String, body: Null, options: Anon_Events): Observable[HttpEvent[String]] = js.native
  def put(url: String, body: Null, options: Anon_EventsHeader): Observable[HttpEvent[js.Object]] = js.native
  def put(url: String, body: Null, options: Anon_Header): Observable[HttpResponse[String]] = js.native
  def put(url: String, body: Null, options: Anon_HeaderHeaders): Observable[HttpResponse[js.Object]] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a JSON object and returns the
    * full event stream.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of all `HttpEvents` for the request,
    * with a response body in the requested type.
    */
  def put[T](url: String, body: js.Any, options: Anon_EventsHeaderHeaders): Observable[HttpEvent[T]] = js.native
  def put[T](url: String, body: Null, options: Anon_EventsHeaderHeaders): Observable[HttpEvent[T]] = js.native
  @JSName("put")
  def put_T[T](url: String): Observable[T] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a JSON object
    * and returns an observable of the response.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HTTPResponse` for the request, with a response body in the requested type.
    */
  @JSName("put")
  def put_T[T](url: String, body: js.Any): Observable[T] = js.native
  @JSName("put")
  def put_T[T](url: String, body: js.Any, options: Anon_BodyHeaderHeadersJsonObserveParam): Observable[T] = js.native
  /**
    * Constructs a `PUT` request that interprets the body as a JSON object and returns the full HTTP response.
    *
    * @param url The endpoint URL.
    * @param body The resources to add/update.
    * @param options HTTP options
    *
    * @return An `Observable` of the `HTTPResponse` for the request,
    * with a response body in the requested type.
    */
  @JSName("put")
  def put_T[T](url: String, body: js.Any, options: Anon_HeaderHeaders): Observable[HttpResponse[T]] = js.native
  @JSName("put")
  def put_T[T](url: String, body: Null, options: Anon_BodyHeaderHeadersJsonObserveParam): Observable[T] = js.native
  @JSName("put")
  def put_T[T](url: String, body: Null, options: Anon_HeaderHeaders): Observable[HttpResponse[T]] = js.native
  /**
    * Constructs a request which interprets the body as a JSON object and returns the full
    * `HTTPResponse` as a JSON object.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse`, with the response body of type `Object`.
    */
  /**
    * Constructs a request where response type and requested observable are not known statically.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the reuested response, wuth body of type `any`.
    */
  def request(method: String, url: String): Observable[js.Object] = js.native
  def request(method: String, url: String, options: Anon_ArraybufferBlob): Observable[_] = js.native
  /**
    * Constructs a request that interprets the body as an `ArrayBuffer` and returns the response in an
    * `ArrayBuffer`.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    *
    * @return An `Observable` of the response, with the response body as an `ArrayBuffer`.
    */
  def request(method: String, url: String, options: Anon_ArraybufferBody): Observable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  /**
    * Constructs a request that interprets the body as an `ArrayBuffer` and returns the
    * the full event stream.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body as an array of `HTTPEvents` for the
    * request.
    */
  def request(method: String, url: String, options: Anon_ArraybufferBodyEvents): Observable[HttpEvent[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a request which interprets the body as an `ArrayBuffer`
    * and returns the full `HTTPResponse`.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse`, with the response body as an `ArrayBuffer`.
    */
  def request(method: String, url: String, options: Anon_ArraybufferBodyHeader): Observable[HttpResponse[scala.scalajs.js.typedarray.ArrayBuffer]] = js.native
  /**
    * Constructs a request that interprets the body as a blob and returns
    * the response as a blob.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body of type `Blob`.
    */
  def request(method: String, url: String, options: Anon_Blob): Observable[Blob] = js.native
  /**
    * Constructs a request that interprets the body as a `Blob` and returns
    * the full event stream.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of of all `HttpEvents` for the request,
    * with the response body of type `Blob`.
    */
  def request(method: String, url: String, options: Anon_BlobBody): Observable[HttpEvent[Blob]] = js.native
  /**
    * Constructs a request which interprets the body as a `Blob` and returns the full `HTTPResponse`.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse`, with the response body of type `Blob`.
    */
  def request(method: String, url: String, options: Anon_BlobBodyHeader): Observable[HttpResponse[Blob]] = js.native
  /**
    * Constructs a request which interprets the body as a text string and returns the full event stream.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HttpEvents` for the reques,
    * with the response body of type string.
    */
  def request(method: String, url: String, options: Anon_BodyEvents): Observable[HttpEvent[String]] = js.native
  /**
    * Constructs a request which interprets the body as a JSON object and returns the full event stream.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the  request.
    *
    * @return An `Observable` of all `HttpEvents` for the request,
    *  with the response body of type `Object`.
    */
  def request(method: String, url: String, options: Anon_BodyEventsHeader): Observable[HttpEvent[_]] = js.native
  /**
    * Constructs a request that interprets the body as a text string and
    * returns a string value.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the response, with the response body of type string.
    */
  def request(method: String, url: String, options: Anon_BodyHeader): Observable[String] = js.native
  /**
    * Constructs a request which interprets the body as a text stream and returns the full `HTTPResponse`.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the HTTP response, with the response body of type string.
    */
  def request(method: String, url: String, options: Anon_BodyHeaderHeaders): Observable[HttpResponse[String]] = js.native
  /**
    * Constructs a request which interprets the body as a JSON object and returns the full `HTTPResponse`.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the full `HTTPResponse`,
    * with the response body of type `Object`.
    */
  def request(method: String, url: String, options: Anon_BodyHeaderHeadersJson): Observable[HttpResponse[js.Object]] = js.native
  def request(method: String, url: String, options: Anon_BodyHeaderHeadersJsonObserve): Observable[js.Object] = js.native
  /**
    * Sends an `HTTPRequest` and returns a stream of `HTTPEvents`.
    *
    * @return An `Observable` of the response, with the response body as a stream of `HTTPEvents`.
    */
  def request[R](req: HttpRequest[_]): Observable[HttpEvent[R]] = js.native
  /**
    * Constructs a request which interprets the body as a JSON object
    * with the response body of the requested type.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of the `HTTPResponse`, with the response body of type `R`.
    */
  @JSName("request")
  def request_R[R](method: String, url: String): Observable[R] = js.native
  /**
    * Constructs a request which interprets the body as a JSON object and returns the full event stream.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return An `Observable` of all `HttpEvents` for the request,
    * with the response body of type `R`.
    */
  @JSName("request")
  def request_R[R](method: String, url: String, options: Anon_BodyEventsHeader): Observable[HttpEvent[R]] = js.native
  /**
    * Constructs a request which interprets the body as a JSON object and returns
    * the full `HTTPResponse` with the response body in the requested type.
    *
    * @param method  The HTTP method.
    * @param url     The endpoint URL.
    * @param options The HTTP options to send with the request.
    *
    * @return  An `Observable` of the full `HTTPResponse`, with the response body of type `R`.
    */
  @JSName("request")
  def request_R[R](method: String, url: String, options: Anon_BodyHeaderHeadersJson): Observable[HttpResponse[R]] = js.native
  @JSName("request")
  def request_R[R](method: String, url: String, options: Anon_BodyHeaderHeadersJsonObserve): Observable[R] = js.native
}

