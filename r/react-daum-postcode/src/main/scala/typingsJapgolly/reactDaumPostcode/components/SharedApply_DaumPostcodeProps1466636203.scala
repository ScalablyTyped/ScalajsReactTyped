package typingsJapgolly.reactDaumPostcode.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDaumPostcode.mod.AddressData
import typingsJapgolly.reactDaumPostcode.mod.DaumPostcodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_DaumPostcodeProps1466636203[ComponentRef] () {
  val componentImport: js.Any
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
    zonecodeOnly: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DaumPostcodeProps, ComponentRef, Unit, DaumPostcodeProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDaumPostcode.mod.DaumPostcodeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDaumPostcode.mod.DaumPostcodeProps])(children: _*)
  }
}

