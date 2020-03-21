package typingsJapgolly.restify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var chain: Chain
  var method: String
  var name: String
  var path: String | js.RegExp
  var spec: RouteSpec
}

object Route {
  @scala.inline
  def apply(chain: Chain, method: String, name: String, path: String | js.RegExp, spec: RouteSpec): Route = {
    val __obj = js.Dynamic.literal(chain = chain.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Route]
  }
}

