package typingsJapgolly.builderUtilRuntime.httpExecutorMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.builderUtilRuntime.builderUtilRuntimeNumbers.`10`
import typingsJapgolly.builderUtilRuntime.cancellationTokenMod.CancellationToken
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime/out/httpExecutor", "HttpExecutor")
@js.native
abstract class HttpExecutor[REQUEST] () extends js.Object {
  var addTimeOutHandler: js.Any = js.native
  var handleResponse: js.Any = js.native
  val maxRedirects: `10` = js.native
  def addErrorAndTimeoutHandlers(request: js.Any, reject: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  /* protected */ def addRedirectHandlers(
    request: js.Any,
    options: RequestOptions,
    reject: js.Function1[/* error */ js.Error, Unit],
    redirectCount: Double,
    handler: js.Function1[/* options */ RequestOptions, Unit]
  ): Unit = js.native
  /* protected */ def createMaxRedirectError(): js.Error = js.native
  def createRequest(options: js.Any, callback: js.Function1[/* response */ js.Any, Unit]): js.Any = js.native
  def doApiRequest(
    options: RequestOptions,
    cancellationToken: CancellationToken,
    requestProcessor: js.Function2[/* request */ REQUEST, /* reject */ js.Function1[/* error */ js.Error, Unit], Unit]
  ): js.Promise[String] = js.native
  def doApiRequest(
    options: RequestOptions,
    cancellationToken: CancellationToken,
    requestProcessor: js.Function2[/* request */ REQUEST, /* reject */ js.Function1[/* error */ js.Error, Unit], Unit],
    redirectCount: Double
  ): js.Promise[String] = js.native
  /* protected */ def doDownload(requestOptions: js.Any, options: DownloadCallOptions, redirectCount: Double): Unit = js.native
  def downloadToBuffer(url: URL_, options: DownloadOptions): js.Promise[Buffer] = js.native
  def request(options: RequestOptions): js.Promise[String | Null] = js.native
  def request(options: RequestOptions, cancellationToken: CancellationToken): js.Promise[String | Null] = js.native
  def request(options: RequestOptions, cancellationToken: CancellationToken, data: StringDictionary[js.Any]): js.Promise[String | Null] = js.native
}

/* static members */
@JSImport("builder-util-runtime/out/httpExecutor", "HttpExecutor")
@js.native
object HttpExecutor extends js.Object {
  def prepareRedirectUrlOptions(redirectUrl: String, options: RequestOptions): RequestOptions = js.native
}

