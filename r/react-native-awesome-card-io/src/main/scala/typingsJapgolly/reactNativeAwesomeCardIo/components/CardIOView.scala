package typingsJapgolly.reactNativeAwesomeCardIo.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeAwesomeCardIo.mod.CardDetails
import typingsJapgolly.reactNativeAwesomeCardIo.mod.CardIODetectionMode
import typingsJapgolly.reactNativeAwesomeCardIo.mod.CardIOViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardIOView {
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
    useCardIOLogo: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    CardIOViewProps, 
    typingsJapgolly.reactNativeAwesomeCardIo.mod.CardIOView, 
    Unit, 
    CardIOViewProps
  ] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeAwesomeCardIo.mod.CardIOViewProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeAwesomeCardIo.mod.CardIOView](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeAwesomeCardIo.mod.CardIOViewProps])(children: _*)
  }
  @JSImport("react-native-awesome-card-io", "CardIOView")
  @js.native
  object componentImport extends js.Object
  
}

