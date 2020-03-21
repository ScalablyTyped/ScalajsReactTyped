package typingsJapgolly.anchorJs.mod.anchorjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorOptions extends js.Object {
  var ariaLabel: js.UndefOr[String] = js.undefined
  var base: js.UndefOr[String] = js.undefined
  var `class`: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var placement: js.UndefOr[AnchorPlacement] = js.undefined
  var titleText: js.UndefOr[String] = js.undefined
  var truncate: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[AnchorVisibility] = js.undefined
}

object AnchorOptions {
  @scala.inline
  def apply(
    ariaLabel: String = null,
    base: String = null,
    `class`: String = null,
    icon: String = null,
    placement: AnchorPlacement = null,
    titleText: String = null,
    truncate: Int | Double = null,
    visible: AnchorVisibility = null
  ): AnchorOptions = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (titleText != null) __obj.updateDynamic("titleText")(titleText.asInstanceOf[js.Any])
    if (truncate != null) __obj.updateDynamic("truncate")(truncate.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorOptions]
  }
}

