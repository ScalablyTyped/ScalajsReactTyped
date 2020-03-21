package typingsJapgolly.reactNativeJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UriOptions extends js.Object {
  /**
    * Allow relative URIs. Defaults to `false`.
    */
  var allowRelative: js.UndefOr[Boolean] = js.undefined
  /**
    * Restrict only relative URIs. Defaults to `false`.
    */
  var relativeOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies one or more acceptable Schemes, should only include the scheme name.
    * Can be an Array or String (strings are automatically escaped for use in a Regular Expression).
    */
  var scheme: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
}

object UriOptions {
  @scala.inline
  def apply(
    allowRelative: js.UndefOr[Boolean] = js.undefined,
    relativeOnly: js.UndefOr[Boolean] = js.undefined,
    scheme: String | js.RegExp | (js.Array[String | js.RegExp]) = null
  ): UriOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowRelative)) __obj.updateDynamic("allowRelative")(allowRelative.asInstanceOf[js.Any])
    if (!js.isUndefined(relativeOnly)) __obj.updateDynamic("relativeOnly")(relativeOnly.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[UriOptions]
  }
}

