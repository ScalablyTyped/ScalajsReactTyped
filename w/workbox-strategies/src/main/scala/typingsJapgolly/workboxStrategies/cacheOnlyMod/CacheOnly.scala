package typingsJapgolly.workboxStrategies.cacheOnlyMod

import org.scalajs.dom.experimental.Response
import typingsJapgolly.workboxRouting.routeHandlerMod.RouteHandlerObject
import typingsJapgolly.workboxStrategies.makeRequestCallbackMod.MakeRequestCallback
import typingsJapgolly.workboxStrategies.makeRequestCallbackMod.MakeRequestCallbackOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-strategies/CacheOnly", "CacheOnly")
@js.native
class CacheOnly () extends RouteHandlerObject {
  def this(options: CacheOnlyOptions) = this()
  @JSName("makeRequest")
  var makeRequest_Original: MakeRequestCallback = js.native
  def makeRequest(options: MakeRequestCallbackOptions): js.Promise[Response] = js.native
}

