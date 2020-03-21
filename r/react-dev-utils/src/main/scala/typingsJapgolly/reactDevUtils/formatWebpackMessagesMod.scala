package typingsJapgolly.reactDevUtils

import typingsJapgolly.webpack.mod.Stats.ToJsonOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dev-utils/formatWebpackMessages", JSImport.Namespace)
@js.native
object formatWebpackMessagesMod extends js.Object {
  /**
    * Extracts and prettifies warning and error messages from webpack
    * [stats](https://github.com/webpack/docs/wiki/node.js-api#stats) object.
    */
  def apply(json: ToJsonOutput): AnonWarnings = js.native
}

