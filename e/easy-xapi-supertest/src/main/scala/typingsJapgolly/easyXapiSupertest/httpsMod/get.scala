package typingsJapgolly.easyXapiSupertest.httpsMod

import typingsJapgolly.easyXapiSupertest.httpMod.ClientRequest
import typingsJapgolly.easyXapiSupertest.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("https", "get")
@js.native
object get extends js.Object {
  def apply(options: RequestOptions): ClientRequest = js.native
  def apply(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
}

