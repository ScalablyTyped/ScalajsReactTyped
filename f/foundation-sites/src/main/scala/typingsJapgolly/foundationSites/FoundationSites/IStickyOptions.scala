package typingsJapgolly.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStickyOptions extends js.Object {
  var anchor: js.UndefOr[String] = js.undefined
  var btmAnchor: js.UndefOr[String] = js.undefined
  var checkEvery: js.UndefOr[Double] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var containerClass: js.UndefOr[String] = js.undefined
  var marginBottom: js.UndefOr[Double] = js.undefined
  var marginTop: js.UndefOr[Double] = js.undefined
  var stickTo: js.UndefOr[String] = js.undefined
  var stickyClass: js.UndefOr[String] = js.undefined
  var stickyOn: js.UndefOr[String] = js.undefined
  var topAnchor: js.UndefOr[String] = js.undefined
}

object IStickyOptions {
  @scala.inline
  def apply(
    anchor: String = null,
    btmAnchor: String = null,
    checkEvery: Int | Double = null,
    container: String = null,
    containerClass: String = null,
    marginBottom: Int | Double = null,
    marginTop: Int | Double = null,
    stickTo: String = null,
    stickyClass: String = null,
    stickyOn: String = null,
    topAnchor: String = null
  ): IStickyOptions = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (btmAnchor != null) __obj.updateDynamic("btmAnchor")(btmAnchor.asInstanceOf[js.Any])
    if (checkEvery != null) __obj.updateDynamic("checkEvery")(checkEvery.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (stickTo != null) __obj.updateDynamic("stickTo")(stickTo.asInstanceOf[js.Any])
    if (stickyClass != null) __obj.updateDynamic("stickyClass")(stickyClass.asInstanceOf[js.Any])
    if (stickyOn != null) __obj.updateDynamic("stickyOn")(stickyOn.asInstanceOf[js.Any])
    if (topAnchor != null) __obj.updateDynamic("topAnchor")(topAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStickyOptions]
  }
}

