package typingsJapgolly.prettyFormat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsReceived extends js.Object {
  var callToJSON: js.UndefOr[Boolean] = js.undefined
  var escapeRegex: js.UndefOr[Boolean] = js.undefined
  var escapeString: js.UndefOr[Boolean] = js.undefined
  var highlight: js.UndefOr[Boolean] = js.undefined
  var indent: js.UndefOr[Double] = js.undefined
  var maxDepth: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Boolean] = js.undefined
  var plugins: js.UndefOr[Plugins] = js.undefined
  var printFunctionName: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[ThemeReceived] = js.undefined
}

object OptionsReceived {
  @scala.inline
  def apply(
    callToJSON: js.UndefOr[Boolean] = js.undefined,
    escapeRegex: js.UndefOr[Boolean] = js.undefined,
    escapeString: js.UndefOr[Boolean] = js.undefined,
    highlight: js.UndefOr[Boolean] = js.undefined,
    indent: Int | Double = null,
    maxDepth: Int | Double = null,
    min: js.UndefOr[Boolean] = js.undefined,
    plugins: Plugins = null,
    printFunctionName: js.UndefOr[Boolean] = js.undefined,
    theme: ThemeReceived = null
  ): OptionsReceived = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(callToJSON)) __obj.updateDynamic("callToJSON")(callToJSON.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeRegex)) __obj.updateDynamic("escapeRegex")(escapeRegex.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeString)) __obj.updateDynamic("escapeString")(escapeString.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(printFunctionName)) __obj.updateDynamic("printFunctionName")(printFunctionName.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsReceived]
  }
}

