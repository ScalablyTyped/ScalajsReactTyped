package typingsJapgolly.builderUtilRuntime

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.DELETE
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.GET
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.POST
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeStrings.PUT
import typingsJapgolly.builderUtilRuntime.outCancellationTokenMod.CancellationToken
import typingsJapgolly.builderUtilRuntime.outProgressCallbackTransformMod.ProgressInfo
import typingsJapgolly.node.NodeJS.Dict
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.cryptoMod.BinaryToTextEncoding
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.OutgoingHttpHeader
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.urlMod.URL_
import typingsJapgolly.std.Error
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outHttpExecutorMod {
  
  @JSImport("builder-util-runtime/out/httpExecutor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("builder-util-runtime/out/httpExecutor", "DigestTransform")
  @js.native
  open class DigestTransform protected () extends Transform {
    def this(expected: String) = this()
    def this(expected: String, algorithm: String) = this()
    def this(expected: String, algorithm: String, encoding: BinaryToTextEncoding) = this()
    def this(expected: String, algorithm: Unit, encoding: BinaryToTextEncoding) = this()
    
    /* private */ var _actual: Any = js.native
    
    def _flush(callback: Any): Unit = js.native
    
    def _transform(chunk: Buffer, encoding: String, callback: Any): Unit = js.native
    
    def actual: String | Null = js.native
    
    /* private */ val algorithm: Any = js.native
    
    /* private */ val digester: Any = js.native
    
    /* private */ val encoding: Any = js.native
    
    val expected: String = js.native
    
    var isValidateOnEnd: Boolean = js.native
    
    def validate(): Null = js.native
  }
  
  @JSImport("builder-util-runtime/out/httpExecutor", "HttpError")
  @js.native
  open class HttpError protected ()
    extends StObject
       with Error {
    def this(statusCode: Double) = this()
    def this(statusCode: Double, message: String) = this()
    def this(statusCode: Double, message: String, description: Any) = this()
    def this(statusCode: Double, message: Unit, description: Any) = this()
    
    val description: Any | Null = js.native
    
    def isServerError(): Boolean = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val statusCode: Double = js.native
  }
  
  /* note: abstract class */ @JSImport("builder-util-runtime/out/httpExecutor", "HttpExecutor")
  @js.native
  open class HttpExecutor[T /* <: Request */] () extends StObject {
    
    def addErrorAndTimeoutHandlers(request: Any, reject: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    def addErrorAndTimeoutHandlers(request: Any, reject: js.Function1[/* error */ js.Error, Unit], timeout: Double): Unit = js.native
    
    /* protected */ def addRedirectHandlers(
      request: Any,
      options: RequestOptions,
      reject: js.Function1[/* error */ js.Error, Unit],
      redirectCount: Double,
      handler: js.Function1[/* options */ RequestOptions, Unit]
    ): Unit = js.native
    
    /* private */ var addTimeOutHandler: Any = js.native
    
    /* protected */ def createMaxRedirectError(): js.Error = js.native
    
    def createRequest(options: RequestOptions, callback: js.Function1[/* response */ Any, Unit]): T = js.native
    
    def doApiRequest(
      options: RequestOptions,
      cancellationToken: CancellationToken,
      requestProcessor: js.Function2[/* request */ T, /* reject */ js.Function1[/* error */ js.Error, Unit], Unit]
    ): js.Promise[String] = js.native
    def doApiRequest(
      options: RequestOptions,
      cancellationToken: CancellationToken,
      requestProcessor: js.Function2[/* request */ T, /* reject */ js.Function1[/* error */ js.Error, Unit], Unit],
      redirectCount: Double
    ): js.Promise[String] = js.native
    
    /* protected */ def doDownload(requestOptions: RequestOptions, options: DownloadCallOptions, redirectCount: Double): Unit = js.native
    
    def downloadToBuffer(url: URL_, options: DownloadOptions): js.Promise[Buffer] = js.native
    
    /* private */ var handleResponse: Any = js.native
    
    /* protected */ val maxRedirects: /* 10 */ Double = js.native
    
    def request(options: RequestOptions): js.Promise[String | Null] = js.native
    def request(options: RequestOptions, cancellationToken: Unit, data: StringDictionary[Any]): js.Promise[String | Null] = js.native
    def request(options: RequestOptions, cancellationToken: CancellationToken): js.Promise[String | Null] = js.native
    def request(options: RequestOptions, cancellationToken: CancellationToken, data: StringDictionary[Any]): js.Promise[String | Null] = js.native
  }
  /* static members */
  object HttpExecutor {
    
    @JSImport("builder-util-runtime/out/httpExecutor", "HttpExecutor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def prepareRedirectUrlOptions(redirectUrl: String, options: RequestOptions): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareRedirectUrlOptions")(redirectUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
    
    inline def retryOnServerError(task: js.Function0[js.Promise[Any]]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryOnServerError")(task.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def retryOnServerError(task: js.Function0[js.Promise[Any]], maxRetries: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryOnServerError")(task.asInstanceOf[js.Any], maxRetries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  }
  
  inline def configureRequestOptions(options: RequestOptions): RequestOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any]).asInstanceOf[RequestOptions]
  inline def configureRequestOptions(options: RequestOptions, token: String): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  inline def configureRequestOptions(options: RequestOptions, token: String, method: GET | DELETE | PUT | POST): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  inline def configureRequestOptions(options: RequestOptions, token: Null, method: GET | DELETE | PUT | POST): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  inline def configureRequestOptions(options: RequestOptions, token: Unit, method: GET | DELETE | PUT | POST): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptions")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  
  inline def configureRequestOptionsFromUrl(url: String, options: RequestOptions): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestOptionsFromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  
  inline def configureRequestUrl(url: URL_, options: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configureRequestUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createHttpError(response: IncomingMessage): HttpError = ^.asInstanceOf[js.Dynamic].applyDynamic("createHttpError")(response.asInstanceOf[js.Any]).asInstanceOf[HttpError]
  inline def createHttpError(response: IncomingMessage, description: Any): HttpError = (^.asInstanceOf[js.Dynamic].applyDynamic("createHttpError")(response.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[HttpError]
  
  inline def parseJson(result: js.Promise[String | Null]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJson")(result.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def safeGetHeader(response: Any, headerKey: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("safeGetHeader")(response.asInstanceOf[js.Any], headerKey.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def safeStringifyJson(data: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeStringifyJson")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def safeStringifyJson(data: Any, skippedNames: Set[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safeStringifyJson")(data.asInstanceOf[js.Any], skippedNames.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @js.native
  trait DownloadCallOptions extends StObject {
    
    def callback(): Unit = js.native
    def callback(error: js.Error): Unit = js.native
    
    var destination: String | Null = js.native
    
    def onCancel(callback: js.Function0[Unit]): Unit = js.native
    
    var options: DownloadOptions = js.native
    
    var responseHandler: (js.Function2[
        /* response */ IncomingMessage, 
        /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
        Unit
      ]) | Null = js.native
  }
  
  trait DownloadOptions extends StObject {
    
    val cancellationToken: CancellationToken
    
    val headers: js.UndefOr[OutgoingHttpHeaders | Null] = js.undefined
    
    var onProgress: js.UndefOr[js.Function1[/* progress */ ProgressInfo, Unit]] = js.undefined
    
    val sha2: js.UndefOr[String | Null] = js.undefined
    
    val sha512: js.UndefOr[String | Null] = js.undefined
  }
  object DownloadOptions {
    
    inline def apply(cancellationToken: CancellationToken): DownloadOptions = {
      val __obj = js.Dynamic.literal(cancellationToken = cancellationToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadOptions]
    }
    
    extension [Self <: DownloadOptions](x: Self) {
      
      inline def setCancellationToken(value: CancellationToken): Self = StObject.set(x, "cancellationToken", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersNull: Self = StObject.set(x, "headers", null)
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setOnProgress(value: /* progress */ ProgressInfo => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: /* progress */ ProgressInfo) => value(t0).runNow()))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setSha2(value: String): Self = StObject.set(x, "sha2", value.asInstanceOf[js.Any])
      
      inline def setSha2Null: Self = StObject.set(x, "sha2", null)
      
      inline def setSha2Undefined: Self = StObject.set(x, "sha2", js.undefined)
      
      inline def setSha512(value: String): Self = StObject.set(x, "sha512", value.asInstanceOf[js.Any])
      
      inline def setSha512Null: Self = StObject.set(x, "sha512", null)
      
      inline def setSha512Undefined: Self = StObject.set(x, "sha512", js.undefined)
    }
  }
  
  @js.native
  trait Request extends StObject {
    
    def abort(): Unit = js.native
    
    def end(): Unit = js.native
    def end(data: Buffer): Unit = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - org.scalablytyped.runtime.StObject because Already inherited
  - org.scalablytyped.runtime.StringDictionary because Already inherited */ trait RequestHeaders
    extends StObject
       with Dict[OutgoingHttpHeader]
  object RequestHeaders {
    
    inline def apply(): RequestHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestHeaders]
    }
  }
}
