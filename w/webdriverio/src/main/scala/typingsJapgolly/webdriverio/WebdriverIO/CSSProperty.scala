package typingsJapgolly.webdriverio.WebdriverIO

import typingsJapgolly.webdriverio.AnonAlpha
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSProperty extends js.Object {
  var parsed: js.UndefOr[AnonAlpha] = js.undefined
  var property: String
  var value: js.Any
}

object CSSProperty {
  @scala.inline
  def apply(property: String, value: js.Any, parsed: AnonAlpha = null): CSSProperty = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (parsed != null) __obj.updateDynamic("parsed")(parsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSProperty]
  }
}

