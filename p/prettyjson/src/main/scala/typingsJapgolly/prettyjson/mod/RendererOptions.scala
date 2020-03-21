package typingsJapgolly.prettyjson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererOptions extends js.Object {
  var dashColor: js.UndefOr[String] = js.undefined
  var defaultIndentation: js.UndefOr[Double] = js.undefined
  /**
    * Define behavior for Array objects
    */
  var emptyArrayMsg: js.UndefOr[String] = js.undefined
    // default: (empty)
  var inlineArrays: js.UndefOr[Boolean] = js.undefined
  var keysColor: js.UndefOr[String] = js.undefined
  var noAlign: js.UndefOr[Boolean] = js.undefined
  /**
    * Color definition
    */
  var noColor: js.UndefOr[Boolean] = js.undefined
  var numberColor: js.UndefOr[String] = js.undefined
  var stringColor: js.UndefOr[String] = js.undefined
}

object RendererOptions {
  @scala.inline
  def apply(
    dashColor: String = null,
    defaultIndentation: Int | Double = null,
    emptyArrayMsg: String = null,
    inlineArrays: js.UndefOr[Boolean] = js.undefined,
    keysColor: String = null,
    noAlign: js.UndefOr[Boolean] = js.undefined,
    noColor: js.UndefOr[Boolean] = js.undefined,
    numberColor: String = null,
    stringColor: String = null
  ): RendererOptions = {
    val __obj = js.Dynamic.literal()
    if (dashColor != null) __obj.updateDynamic("dashColor")(dashColor.asInstanceOf[js.Any])
    if (defaultIndentation != null) __obj.updateDynamic("defaultIndentation")(defaultIndentation.asInstanceOf[js.Any])
    if (emptyArrayMsg != null) __obj.updateDynamic("emptyArrayMsg")(emptyArrayMsg.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineArrays)) __obj.updateDynamic("inlineArrays")(inlineArrays.asInstanceOf[js.Any])
    if (keysColor != null) __obj.updateDynamic("keysColor")(keysColor.asInstanceOf[js.Any])
    if (!js.isUndefined(noAlign)) __obj.updateDynamic("noAlign")(noAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(noColor)) __obj.updateDynamic("noColor")(noColor.asInstanceOf[js.Any])
    if (numberColor != null) __obj.updateDynamic("numberColor")(numberColor.asInstanceOf[js.Any])
    if (stringColor != null) __obj.updateDynamic("stringColor")(stringColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererOptions]
  }
}

