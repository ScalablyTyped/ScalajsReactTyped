package typingsJapgolly.workboxStrategies.networkFirstMod

import org.scalajs.dom.experimental.Response
import typingsJapgolly.workboxRouting.routeHandlerMod.RouteHandlerObject
import typingsJapgolly.workboxStrategies.makeRequestCallbackMod.MakeRequestCallback
import typingsJapgolly.workboxStrategies.makeRequestCallbackMod.MakeRequestCallbackOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-strategies/NetworkFirst", "NetworkFirst")
@js.native
class NetworkFirst () extends RouteHandlerObject {
  def this(options: NetworkFirstOptions) = this()
  @JSName("makeRequest")
  var makeRequest_Original: MakeRequestCallback = js.native
  def makeRequest(options: MakeRequestCallbackOptions): js.Promise[Response] = js.native
}

