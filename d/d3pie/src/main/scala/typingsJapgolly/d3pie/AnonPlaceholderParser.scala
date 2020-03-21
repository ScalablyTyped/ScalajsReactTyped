package typingsJapgolly.d3pie

import japgolly.scalajs.react.Callback
import typingsJapgolly.d3pie.d3pieStrings.caption
import typingsJapgolly.d3pie.d3pieStrings.placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlaceholderParser extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var placeholderParser: js.UndefOr[js.Function2[/* index */ Double, /* data */ AnonPercentage, Unit]] = js.undefined
  var string: js.UndefOr[String] = js.undefined
  var styles: js.UndefOr[AnonBackgroundColor] = js.undefined
  var `type`: js.UndefOr[placeholder | caption] = js.undefined
}

object AnonPlaceholderParser {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    placeholderParser: (/* index */ Double, /* data */ AnonPercentage) => Callback = null,
    string: String = null,
    styles: AnonBackgroundColor = null,
    `type`: placeholder | caption = null
  ): AnonPlaceholderParser = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (placeholderParser != null) __obj.updateDynamic("placeholderParser")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* data */ typingsJapgolly.d3pie.AnonPercentage) => placeholderParser(t0, t1).runNow()))
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPlaceholderParser]
  }
}

