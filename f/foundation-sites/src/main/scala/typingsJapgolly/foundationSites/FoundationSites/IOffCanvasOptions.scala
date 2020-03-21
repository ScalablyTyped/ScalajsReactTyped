package typingsJapgolly.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOffCanvasOptions extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  var forceTop: js.UndefOr[Boolean] = js.undefined
  var isRevealed: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var revealClass: js.UndefOr[String] = js.undefined
  var revealOn: js.UndefOr[String] = js.undefined
  var transitionTime: js.UndefOr[Double] = js.undefined
  var trapFocus: js.UndefOr[Boolean] = js.undefined
}

object IOffCanvasOptions {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    forceTop: js.UndefOr[Boolean] = js.undefined,
    isRevealed: js.UndefOr[Boolean] = js.undefined,
    position: String = null,
    revealClass: String = null,
    revealOn: String = null,
    transitionTime: Int | Double = null,
    trapFocus: js.UndefOr[Boolean] = js.undefined
  ): IOffCanvasOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(forceTop)) __obj.updateDynamic("forceTop")(forceTop.asInstanceOf[js.Any])
    if (!js.isUndefined(isRevealed)) __obj.updateDynamic("isRevealed")(isRevealed.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (revealClass != null) __obj.updateDynamic("revealClass")(revealClass.asInstanceOf[js.Any])
    if (revealOn != null) __obj.updateDynamic("revealOn")(revealOn.asInstanceOf[js.Any])
    if (transitionTime != null) __obj.updateDynamic("transitionTime")(transitionTime.asInstanceOf[js.Any])
    if (!js.isUndefined(trapFocus)) __obj.updateDynamic("trapFocus")(trapFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOffCanvasOptions]
  }
}

