package typingsJapgolly.restify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteSpec extends js.Object {
  var method: String
  var name: js.UndefOr[String] = js.undefined
  var path: String | js.RegExp
  var versions: js.UndefOr[js.Array[String]] = js.undefined
}

object RouteSpec {
  @scala.inline
  def apply(method: String, path: String | js.RegExp, name: String = null, versions: js.Array[String] = null): RouteSpec = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpec]
  }
}

