package typingsJapgolly.gitRepoName.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(cwd: String = null, path: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

