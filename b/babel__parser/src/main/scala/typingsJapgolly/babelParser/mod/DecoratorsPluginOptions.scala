package typingsJapgolly.babelParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoratorsPluginOptions extends js.Object {
  var decoratorsBeforeExport: js.UndefOr[Boolean] = js.undefined
}

object DecoratorsPluginOptions {
  @scala.inline
  def apply(decoratorsBeforeExport: js.UndefOr[Boolean] = js.undefined): DecoratorsPluginOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decoratorsBeforeExport)) __obj.updateDynamic("decoratorsBeforeExport")(decoratorsBeforeExport.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecoratorsPluginOptions]
  }
}

