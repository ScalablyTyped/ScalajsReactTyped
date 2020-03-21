package typingsJapgolly.reactDaumPostcode.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DaumPostcodeProps extends js.Object {
  var alwaysShowEngAddr: js.UndefOr[Boolean] = js.undefined
  var animation: js.UndefOr[Boolean] = js.undefined
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var autoMapping: js.UndefOr[Boolean] = js.undefined
  var autoResize: js.UndefOr[Boolean] = js.undefined
  var defaultQuery: js.UndefOr[String] = js.undefined
  var errorMessage: js.UndefOr[Element] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var hideEngBtn: js.UndefOr[Boolean] = js.undefined
  var hideMapBtn: js.UndefOr[Boolean] = js.undefined
  var maxSuggestItems: js.UndefOr[Double] = js.undefined
  var pleaseReadGuide: js.UndefOr[Double] = js.undefined
  var pleaseReadGuideTimer: js.UndefOr[Double] = js.undefined
  var scriptUrl: js.UndefOr[String] = js.undefined
  var shorthand: js.UndefOr[Boolean] = js.undefined
  var showMoreHName: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var theme: js.UndefOr[js.Object] = js.undefined
  var useSuggest: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  var zonecodeOnly: js.UndefOr[Boolean] = js.undefined
  def onComplete(data: AddressData): Unit
}

object DaumPostcodeProps {
  @scala.inline
  def apply(
    onComplete: AddressData => Callback,
    alwaysShowEngAddr: js.UndefOr[Boolean] = js.undefined,
    animation: js.UndefOr[Boolean] = js.undefined,
    autoClose: js.UndefOr[Boolean] = js.undefined,
    autoMapping: js.UndefOr[Boolean] = js.undefined,
    autoResize: js.UndefOr[Boolean] = js.undefined,
    defaultQuery: String = null,
    errorMessage: VdomElement = null,
    height: Double | String = null,
    hideEngBtn: js.UndefOr[Boolean] = js.undefined,
    hideMapBtn: js.UndefOr[Boolean] = js.undefined,
    maxSuggestItems: Int | Double = null,
    pleaseReadGuide: Int | Double = null,
    pleaseReadGuideTimer: Int | Double = null,
    scriptUrl: String = null,
    shorthand: js.UndefOr[Boolean] = js.undefined,
    showMoreHName: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    theme: js.Object = null,
    useSuggest: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null,
    zonecodeOnly: js.UndefOr[Boolean] = js.undefined
  ): DaumPostcodeProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onComplete")(js.Any.fromFunction1((t0: typingsJapgolly.reactDaumPostcode.mod.AddressData) => onComplete(t0).runNow()))
    if (!js.isUndefined(alwaysShowEngAddr)) __obj.updateDynamic("alwaysShowEngAddr")(alwaysShowEngAddr.asInstanceOf[js.Any])
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (!js.isUndefined(autoMapping)) __obj.updateDynamic("autoMapping")(autoMapping.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize.asInstanceOf[js.Any])
    if (defaultQuery != null) __obj.updateDynamic("defaultQuery")(defaultQuery.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.rawElement.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hideEngBtn)) __obj.updateDynamic("hideEngBtn")(hideEngBtn.asInstanceOf[js.Any])
    if (!js.isUndefined(hideMapBtn)) __obj.updateDynamic("hideMapBtn")(hideMapBtn.asInstanceOf[js.Any])
    if (maxSuggestItems != null) __obj.updateDynamic("maxSuggestItems")(maxSuggestItems.asInstanceOf[js.Any])
    if (pleaseReadGuide != null) __obj.updateDynamic("pleaseReadGuide")(pleaseReadGuide.asInstanceOf[js.Any])
    if (pleaseReadGuideTimer != null) __obj.updateDynamic("pleaseReadGuideTimer")(pleaseReadGuideTimer.asInstanceOf[js.Any])
    if (scriptUrl != null) __obj.updateDynamic("scriptUrl")(scriptUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(shorthand)) __obj.updateDynamic("shorthand")(shorthand.asInstanceOf[js.Any])
    if (!js.isUndefined(showMoreHName)) __obj.updateDynamic("showMoreHName")(showMoreHName.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(useSuggest)) __obj.updateDynamic("useSuggest")(useSuggest.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(zonecodeOnly)) __obj.updateDynamic("zonecodeOnly")(zonecodeOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaumPostcodeProps]
  }
}

