package typingsJapgolly.remoteOriginUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var path: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(path: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

