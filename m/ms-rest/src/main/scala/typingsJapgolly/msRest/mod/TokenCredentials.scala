package typingsJapgolly.msRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ms-rest", "TokenCredentials")
@js.native
class TokenCredentials protected () extends ServiceClientCredentials {
  def this(token: String) = this()
  def this(token: String, authorizationScheme: String) = this()
  /**
    * Signs a request with the Authentication header.
    *
    * @param {WebResource} The WebResource to be signed.
    * @param {function(error)}  callback  The callback function.
    */
  /* CompleteClass */
  override def signRequest(webResource: WebResource, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

