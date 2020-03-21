package typingsJapgolly.reactAliceCarousel.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactAliceCarousel.mod.EventObject
import typingsJapgolly.reactAliceCarousel.mod.Props
import typingsJapgolly.reactAliceCarousel.reactAliceCarouselStrings.default
import typingsJapgolly.reactAliceCarousel.reactAliceCarouselStrings.responsive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactAliceCarousel {
  def apply(
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    autoPlay: js.UndefOr[Boolean] = js.undefined,
    autoPlayActionDisabled: js.UndefOr[Boolean] = js.undefined,
    autoPlayDirection: String = null,
    autoPlayInterval: Int | Double = null,
    buttonsDisabled: js.UndefOr[Boolean] = js.undefined,
    controlsStrategy: default | responsive = null,
    disableAutoPlayOnAction: js.UndefOr[Boolean] = js.undefined,
    dotsDisabled: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    fadeOutAnimation: js.UndefOr[Boolean] = js.undefined,
    infinite: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[js.Object] = null,
    keysControlDisabled: js.UndefOr[Boolean] = js.undefined,
    mouseTrackingEnabled: js.UndefOr[Boolean] = js.undefined,
    onInitialized: /* e */ EventObject => Callback = null,
    onResized: /* e */ EventObject => Callback = null,
    onSlideChange: /* e */ EventObject => Callback = null,
    onSlideChanged: /* e */ EventObject => Callback = null,
    playButtonEnabled: js.UndefOr[Boolean] = js.undefined,
    preventEventOnTouchMove: js.UndefOr[Boolean] = js.undefined,
    responsive: js.Object = null,
    shouldHandleResizeEvent: /* e */ js.Any => CallbackTo[Boolean] = null,
    showSlideInfo: js.UndefOr[Boolean] = js.undefined,
    slideToIndex: Int | Double = null,
    stagePadding: js.Object = null,
    startIndex: Int | Double = null,
    stopAutoPlayOnHover: js.UndefOr[Boolean] = js.undefined,
    swipeDisabled: js.UndefOr[Boolean] = js.undefined,
    touchTrackingEnabled: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, typingsJapgolly.reactAliceCarousel.mod.default, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlayActionDisabled)) __obj.updateDynamic("autoPlayActionDisabled")(autoPlayActionDisabled.asInstanceOf[js.Any])
    if (autoPlayDirection != null) __obj.updateDynamic("autoPlayDirection")(autoPlayDirection.asInstanceOf[js.Any])
    if (autoPlayInterval != null) __obj.updateDynamic("autoPlayInterval")(autoPlayInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonsDisabled)) __obj.updateDynamic("buttonsDisabled")(buttonsDisabled.asInstanceOf[js.Any])
    if (controlsStrategy != null) __obj.updateDynamic("controlsStrategy")(controlsStrategy.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAutoPlayOnAction)) __obj.updateDynamic("disableAutoPlayOnAction")(disableAutoPlayOnAction.asInstanceOf[js.Any])
    if (!js.isUndefined(dotsDisabled)) __obj.updateDynamic("dotsDisabled")(dotsDisabled.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeOutAnimation)) __obj.updateDynamic("fadeOutAnimation")(fadeOutAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(keysControlDisabled)) __obj.updateDynamic("keysControlDisabled")(keysControlDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseTrackingEnabled)) __obj.updateDynamic("mouseTrackingEnabled")(mouseTrackingEnabled.asInstanceOf[js.Any])
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactAliceCarousel.mod.EventObject) => onInitialized(t0).runNow()))
    if (onResized != null) __obj.updateDynamic("onResized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactAliceCarousel.mod.EventObject) => onResized(t0).runNow()))
    if (onSlideChange != null) __obj.updateDynamic("onSlideChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactAliceCarousel.mod.EventObject) => onSlideChange(t0).runNow()))
    if (onSlideChanged != null) __obj.updateDynamic("onSlideChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactAliceCarousel.mod.EventObject) => onSlideChanged(t0).runNow()))
    if (!js.isUndefined(playButtonEnabled)) __obj.updateDynamic("playButtonEnabled")(playButtonEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(preventEventOnTouchMove)) __obj.updateDynamic("preventEventOnTouchMove")(preventEventOnTouchMove.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (shouldHandleResizeEvent != null) __obj.updateDynamic("shouldHandleResizeEvent")(js.Any.fromFunction1((t0: /* e */ js.Any) => shouldHandleResizeEvent(t0).runNow()))
    if (!js.isUndefined(showSlideInfo)) __obj.updateDynamic("showSlideInfo")(showSlideInfo.asInstanceOf[js.Any])
    if (slideToIndex != null) __obj.updateDynamic("slideToIndex")(slideToIndex.asInstanceOf[js.Any])
    if (stagePadding != null) __obj.updateDynamic("stagePadding")(stagePadding.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(stopAutoPlayOnHover)) __obj.updateDynamic("stopAutoPlayOnHover")(stopAutoPlayOnHover.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeDisabled)) __obj.updateDynamic("swipeDisabled")(swipeDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(touchTrackingEnabled)) __obj.updateDynamic("touchTrackingEnabled")(touchTrackingEnabled.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactAliceCarousel.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactAliceCarousel.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAliceCarousel.mod.Props])(children: _*)
  }
  @JSImport("react-alice-carousel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

