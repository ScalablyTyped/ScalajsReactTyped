package typingsJapgolly.winrtUwp.Windows.Services.Store

import typingsJapgolly.winrtUwp.Windows.Web.Http.HttpStatusCode
import typingsJapgolly.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request that is sent to the Windows Store. */
@JSGlobal("Windows.Services.Store.StoreSendRequestResult")
@js.native
abstract class StoreSendRequestResult () extends js.Object {
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError = js.native
  /** Gets the HTTP status code for the request. */
  var httpStatusCode: HttpStatusCode = js.native
  /** Gets the response data for the request. */
  var response: String = js.native
}

