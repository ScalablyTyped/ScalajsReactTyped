package typingsJapgolly.rest.pathPrefixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var prefix: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(prefix: String = null): Config = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

