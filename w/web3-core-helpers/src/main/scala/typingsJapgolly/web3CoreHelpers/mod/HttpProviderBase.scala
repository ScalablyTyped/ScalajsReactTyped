package typingsJapgolly.web3CoreHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-core-helpers", "HttpProviderBase")
@js.native
class HttpProviderBase protected () extends js.Object {
  def this(host: String) = this()
  def this(host: String, options: HttpProviderOptions) = this()
  var connected: Boolean = js.native
  var host: String = js.native
  def disconnect(): Boolean = js.native
  def send(
    payload: JsonRpcPayload,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]
  ): Unit = js.native
  def supportsSubscriptions(): Boolean = js.native
}

