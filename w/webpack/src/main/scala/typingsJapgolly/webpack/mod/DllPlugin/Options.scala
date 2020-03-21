package typingsJapgolly.webpack.mod.DllPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The context of requests in the manifest file.
    *
    * Defaults to the webpack context.
    */
  var context: js.UndefOr[String] = js.undefined
  /**
    * The name of the exposed DLL function (keep consistent with `output.library`).
    */
  var name: String
  /**
    * The absolute path to the manifest json file (output).
    */
  var path: String
}

object Options {
  @scala.inline
  def apply(name: String, path: String, context: String = null): Options = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

