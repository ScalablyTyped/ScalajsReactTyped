package typingsJapgolly.reactNativeAwesomeCardIo.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardIOViewProps extends CardIOCommonProps {
  /**  Style props of CardIOViewProps */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**  This function will be called when the CardIOView completes its work and returns a CreditCard. */
  def didScanCard(card: CardDetails): Unit
}

object CardIOViewProps {
  @scala.inline
  def apply(
    didScanCard: CardDetails => Callback,
    allowFreelyRotatingCardGuide: js.UndefOr[Boolean] = js.undefined,
    detectionMode: CardIODetectionMode = null,
    guideColor: String | Double = null,
    hideCardIOLogo: js.UndefOr[Boolean] = js.undefined,
    languageOrLocale: String = null,
    scanExpiry: js.UndefOr[Boolean] = js.undefined,
    scanInstructions: String = null,
    scannedImageDuration: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    useCardIOLogo: js.UndefOr[Boolean] = js.undefined
  ): CardIOViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("didScanCard")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeAwesomeCardIo.mod.CardDetails) => didScanCard(t0).runNow()))
    if (!js.isUndefined(allowFreelyRotatingCardGuide)) __obj.updateDynamic("allowFreelyRotatingCardGuide")(allowFreelyRotatingCardGuide.asInstanceOf[js.Any])
    if (detectionMode != null) __obj.updateDynamic("detectionMode")(detectionMode.asInstanceOf[js.Any])
    if (guideColor != null) __obj.updateDynamic("guideColor")(guideColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCardIOLogo)) __obj.updateDynamic("hideCardIOLogo")(hideCardIOLogo.asInstanceOf[js.Any])
    if (languageOrLocale != null) __obj.updateDynamic("languageOrLocale")(languageOrLocale.asInstanceOf[js.Any])
    if (!js.isUndefined(scanExpiry)) __obj.updateDynamic("scanExpiry")(scanExpiry.asInstanceOf[js.Any])
    if (scanInstructions != null) __obj.updateDynamic("scanInstructions")(scanInstructions.asInstanceOf[js.Any])
    if (scannedImageDuration != null) __obj.updateDynamic("scannedImageDuration")(scannedImageDuration.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useCardIOLogo)) __obj.updateDynamic("useCardIOLogo")(useCardIOLogo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardIOViewProps]
  }
}

