package typingsJapgolly.workboxRouting.routeHandlerMod

import org.scalajs.dom.experimental.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteHandlerObject extends js.Object {
  @JSName("handle")
  var handle_Original: RouteHandlerCallback = js.native
  def handle(context: RouteHandlerCallbackContext): js.Promise[Response] = js.native
}

