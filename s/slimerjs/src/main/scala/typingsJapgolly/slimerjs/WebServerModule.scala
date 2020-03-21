package typingsJapgolly.slimerjs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebServerModule extends js.Object {
  def create(): WebServer
}

object WebServerModule {
  @scala.inline
  def apply(create: CallbackTo[WebServer]): WebServerModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create.toJsFn)
    __obj.asInstanceOf[WebServerModule]
  }
}

