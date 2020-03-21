package typingsJapgolly.workboxRouting

import typingsJapgolly.workboxRouting.httpmethodMod.HTTPMethod
import typingsJapgolly.workboxRouting.routeHandlerMod.RouteHandler
import typingsJapgolly.workboxRouting.routeMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-routing/RegExpRoute", JSImport.Namespace)
@js.native
object regExpRouteMod extends js.Object {
  @js.native
  class RegExpRoute protected ()
    extends Route[js.Array[String]] {
    def this(regExp: js.RegExp, handler: RouteHandler) = this()
    def this(regExp: js.RegExp, handler: RouteHandler, method: HTTPMethod) = this()
  }
  
}

