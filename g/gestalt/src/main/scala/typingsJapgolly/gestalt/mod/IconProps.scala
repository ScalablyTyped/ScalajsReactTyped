package typingsJapgolly.gestalt.mod

import typingsJapgolly.gestalt.AnonPath
import typingsJapgolly.gestalt.gestaltStrings.blue
import typingsJapgolly.gestalt.gestaltStrings.darkGray
import typingsJapgolly.gestalt.gestaltStrings.eggplant
import typingsJapgolly.gestalt.gestaltStrings.gray
import typingsJapgolly.gestalt.gestaltStrings.green
import typingsJapgolly.gestalt.gestaltStrings.lightGray
import typingsJapgolly.gestalt.gestaltStrings.maroon
import typingsJapgolly.gestalt.gestaltStrings.midnight
import typingsJapgolly.gestalt.gestaltStrings.navy
import typingsJapgolly.gestalt.gestaltStrings.olive
import typingsJapgolly.gestalt.gestaltStrings.orange
import typingsJapgolly.gestalt.gestaltStrings.orchid
import typingsJapgolly.gestalt.gestaltStrings.pine
import typingsJapgolly.gestalt.gestaltStrings.purple
import typingsJapgolly.gestalt.gestaltStrings.red
import typingsJapgolly.gestalt.gestaltStrings.watermelon
import typingsJapgolly.gestalt.gestaltStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends js.Object {
  var accessibilityLabel: String
  var color: js.UndefOr[
    blue | darkGray | eggplant | gray | green | lightGray | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | watermelon | white
  ] = js.undefined
  var dangerouslySetSvgPath: js.UndefOr[AnonPath] = js.undefined
  var icon: Icons
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double | String] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    accessibilityLabel: String,
    icon: Icons,
    color: blue | darkGray | eggplant | gray | green | lightGray | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | watermelon | white = null,
    dangerouslySetSvgPath: AnonPath = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    size: Double | String = null
  ): IconProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dangerouslySetSvgPath != null) __obj.updateDynamic("dangerouslySetSvgPath")(dangerouslySetSvgPath.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

