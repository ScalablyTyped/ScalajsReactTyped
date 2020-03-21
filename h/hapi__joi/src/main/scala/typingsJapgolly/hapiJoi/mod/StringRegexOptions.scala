package typingsJapgolly.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringRegexOptions extends js.Object {
  /**
    * when true, the provided pattern will be disallowed instead of required.
    *
    * @default false
    */
  var invert: js.UndefOr[Boolean] = js.undefined
  /**
    * optional pattern name.
    */
  var name: js.UndefOr[String] = js.undefined
}

object StringRegexOptions {
  @scala.inline
  def apply(invert: js.UndefOr[Boolean] = js.undefined, name: String = null): StringRegexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringRegexOptions]
  }
}

