package typingsJapgolly.baseui.popoverMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.baseui.baseuiStrings.auto
import typingsJapgolly.baseui.baseuiStrings.bottom
import typingsJapgolly.baseui.baseuiStrings.bottomLeft
import typingsJapgolly.baseui.baseuiStrings.bottomRight
import typingsJapgolly.baseui.baseuiStrings.click
import typingsJapgolly.baseui.baseuiStrings.hover
import typingsJapgolly.baseui.baseuiStrings.left
import typingsJapgolly.baseui.baseuiStrings.leftBottom
import typingsJapgolly.baseui.baseuiStrings.leftTop
import typingsJapgolly.baseui.baseuiStrings.menu
import typingsJapgolly.baseui.baseuiStrings.none
import typingsJapgolly.baseui.baseuiStrings.right
import typingsJapgolly.baseui.baseuiStrings.rightBottom
import typingsJapgolly.baseui.baseuiStrings.rightTop
import typingsJapgolly.baseui.baseuiStrings.tooltip
import typingsJapgolly.baseui.baseuiStrings.top
import typingsJapgolly.baseui.baseuiStrings.topLeft
import typingsJapgolly.baseui.baseuiStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePopoverProps extends js.Object {
  var accessibilityType: js.UndefOr[none | menu | tooltip] = js.undefined
  var animateOutTime: js.UndefOr[Double] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var `data-baseweb`: js.UndefOr[String] = js.undefined
  var focusLock: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var ignoreBoundary: js.UndefOr[Boolean] = js.undefined
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  var onMouseEnterDelay: js.UndefOr[Double] = js.undefined
  var onMouseLeaveDelay: js.UndefOr[Double] = js.undefined
  var overrides: js.UndefOr[Overrides] = js.undefined
  var placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.undefined
  var popperOptions: js.UndefOr[js.Any] = js.undefined
  var renderAll: js.UndefOr[Boolean] = js.undefined
  var returnFocus: js.UndefOr[Boolean] = js.undefined
  var showArrow: js.UndefOr[Boolean] = js.undefined
  var triggerType: js.UndefOr[click | hover] = js.undefined
}

object BasePopoverProps {
  @scala.inline
  def apply(
    accessibilityType: none | menu | tooltip = null,
    animateOutTime: Int | Double = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    `data-baseweb`: String = null,
    focusLock: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    ignoreBoundary: js.UndefOr[Boolean] = js.undefined,
    mountNode: HTMLElement = null,
    onMouseEnterDelay: Int | Double = null,
    onMouseLeaveDelay: Int | Double = null,
    overrides: Overrides = null,
    placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top = null,
    popperOptions: js.Any = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    returnFocus: js.UndefOr[Boolean] = js.undefined,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    triggerType: click | hover = null
  ): BasePopoverProps = {
    val __obj = js.Dynamic.literal()
    if (accessibilityType != null) __obj.updateDynamic("accessibilityType")(accessibilityType.asInstanceOf[js.Any])
    if (animateOutTime != null) __obj.updateDynamic("animateOutTime")(animateOutTime.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (`data-baseweb` != null) __obj.updateDynamic("data-baseweb")(`data-baseweb`.asInstanceOf[js.Any])
    if (!js.isUndefined(focusLock)) __obj.updateDynamic("focusLock")(focusLock.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreBoundary)) __obj.updateDynamic("ignoreBoundary")(ignoreBoundary.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (onMouseEnterDelay != null) __obj.updateDynamic("onMouseEnterDelay")(onMouseEnterDelay.asInstanceOf[js.Any])
    if (onMouseLeaveDelay != null) __obj.updateDynamic("onMouseLeaveDelay")(onMouseLeaveDelay.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popperOptions != null) __obj.updateDynamic("popperOptions")(popperOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(returnFocus)) __obj.updateDynamic("returnFocus")(returnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow.asInstanceOf[js.Any])
    if (triggerType != null) __obj.updateDynamic("triggerType")(triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePopoverProps]
  }
}

