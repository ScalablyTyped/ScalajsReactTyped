package typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.inversify.interfacesMod.interfaces.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpContext extends js.Object {
  var container: Container
  var request: Request_[ParamsDictionary]
  var response: Response_
  var user: Principal
}

object HttpContext {
  @scala.inline
  def apply(container: Container, request: Request_[ParamsDictionary], response: Response_, user: Principal): HttpContext = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HttpContext]
  }
}

