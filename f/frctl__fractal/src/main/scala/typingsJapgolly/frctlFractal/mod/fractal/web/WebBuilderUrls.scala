package typingsJapgolly.frctlFractal.mod.fractal.web

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebBuilderUrls extends js.Object {
  var ext: js.UndefOr[String] = js.undefined
}

object WebBuilderUrls {
  @scala.inline
  def apply(ext: String = null): WebBuilderUrls = {
    val __obj = js.Dynamic.literal()
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebBuilderUrls]
  }
}

