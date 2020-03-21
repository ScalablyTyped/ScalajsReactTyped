package typingsJapgolly.instagramPrivateApi.requestMod

import typingsJapgolly.instagramPrivateApi.AnonAcceptEncoding
import typingsJapgolly.instagramPrivateApi.PartialAttemptOptionsany
import typingsJapgolly.instagramPrivateApi.clientMod.IgApiClient
import typingsJapgolly.instagramPrivateApi.commonTypesMod.IgResponse
import typingsJapgolly.instagramPrivateApi.errorsMod.IgClientError
import typingsJapgolly.request.mod.Options
import typingsJapgolly.rxjs.mod.Subject
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/core/request", "Request")
@js.native
class Request protected () extends js.Object {
  def this(client: IgApiClient) = this()
  var attemptOptions: PartialAttemptOptionsany = js.native
  var client: js.Any = js.native
  var defaults: Partial[Options] = js.native
  @JSName("end$")
  var end$: Subject[_] = js.native
  @JSName("error$")
  var error$: Subject[IgClientError] = js.native
  var handleResponseError: js.Any = js.native
  var updateState: js.Any = js.native
  /* protected */ def faultTolerantRequest(options: Options): js.Promise[_] = js.native
  def getDefaultHeaders(): AnonAcceptEncoding = js.native
  def send[T](userOptions: Options): js.Promise[IgResponse[T]] = js.native
  def send[T](userOptions: Options, onlyCheckHttpStatus: Boolean): js.Promise[IgResponse[T]] = js.native
  def sign(payload: Payload): SignedPost = js.native
  def signature(data: String): String = js.native
  def userBreadcrumb(size: Double): String = js.native
}

/* static members */
@JSImport("instagram-private-api/dist/core/request", "Request")
@js.native
object Request extends js.Object {
  var requestDebug: js.Any = js.native
  var requestTransform: js.Any = js.native
}

