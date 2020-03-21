package typingsJapgolly.ionicCore.componentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSlides extends js.Object {
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * Emitted after the active slide has changed.
    */
  var onIonSlideDidChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the user double taps on the slide's container.
    */
  var onIonSlideDoubleTap: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the slider is actively being moved.
    */
  var onIonSlideDrag: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the next slide has ended.
    */
  var onIonSlideNextEnd: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the next slide has started.
    */
  var onIonSlideNextStart: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the previous slide has ended.
    */
  var onIonSlidePrevEnd: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the previous slide has started.
    */
  var onIonSlidePrevStart: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the slider is at the last slide.
    */
  var onIonSlideReachEnd: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the slider is at its initial position.
    */
  var onIonSlideReachStart: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the user taps/clicks on the slide's container.
    */
  var onIonSlideTap: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the user releases the touch.
    */
  var onIonSlideTouchEnd: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the user first touches the slider.
    */
  var onIonSlideTouchStart: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the slide transition has ended.
    */
  var onIonSlideTransitionEnd: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the slide transition has started.
    */
  var onIonSlideTransitionStart: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted before the active slide has changed.
    */
  var onIonSlideWillChange: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted after Swiper initialization
    */
  var onIonSlidesDidLoad: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Options to pass to the swiper instance. See http://idangero.us/swiper/api/ for valid options
    */
  var options: js.UndefOr[js.Any] = js.undefined
  /**
    * If `true`, show the pagination.
    */
  var pager: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, show the scrollbar.
    */
  var scrollbar: js.UndefOr[Boolean] = js.undefined
}

object IonSlides {
  @scala.inline
  def apply(
    mode: ios | md = null,
    onIonSlideDidChange: /* event */ CustomEvent => Callback = null,
    onIonSlideDoubleTap: /* event */ CustomEvent => Callback = null,
    onIonSlideDrag: /* event */ CustomEvent => Callback = null,
    onIonSlideNextEnd: /* event */ CustomEvent => Callback = null,
    onIonSlideNextStart: /* event */ CustomEvent => Callback = null,
    onIonSlidePrevEnd: /* event */ CustomEvent => Callback = null,
    onIonSlidePrevStart: /* event */ CustomEvent => Callback = null,
    onIonSlideReachEnd: /* event */ CustomEvent => Callback = null,
    onIonSlideReachStart: /* event */ CustomEvent => Callback = null,
    onIonSlideTap: /* event */ CustomEvent => Callback = null,
    onIonSlideTouchEnd: /* event */ CustomEvent => Callback = null,
    onIonSlideTouchStart: /* event */ CustomEvent => Callback = null,
    onIonSlideTransitionEnd: /* event */ CustomEvent => Callback = null,
    onIonSlideTransitionStart: /* event */ CustomEvent => Callback = null,
    onIonSlideWillChange: /* event */ CustomEvent => Callback = null,
    onIonSlidesDidLoad: /* event */ CustomEvent => Callback = null,
    options: js.Any = null,
    pager: js.UndefOr[Boolean] = js.undefined,
    scrollbar: js.UndefOr[Boolean] = js.undefined
  ): IonSlides = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onIonSlideDidChange != null) __obj.updateDynamic("onIonSlideDidChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideDidChange(t0).runNow()))
    if (onIonSlideDoubleTap != null) __obj.updateDynamic("onIonSlideDoubleTap")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideDoubleTap(t0).runNow()))
    if (onIonSlideDrag != null) __obj.updateDynamic("onIonSlideDrag")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideDrag(t0).runNow()))
    if (onIonSlideNextEnd != null) __obj.updateDynamic("onIonSlideNextEnd")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideNextEnd(t0).runNow()))
    if (onIonSlideNextStart != null) __obj.updateDynamic("onIonSlideNextStart")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideNextStart(t0).runNow()))
    if (onIonSlidePrevEnd != null) __obj.updateDynamic("onIonSlidePrevEnd")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlidePrevEnd(t0).runNow()))
    if (onIonSlidePrevStart != null) __obj.updateDynamic("onIonSlidePrevStart")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlidePrevStart(t0).runNow()))
    if (onIonSlideReachEnd != null) __obj.updateDynamic("onIonSlideReachEnd")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideReachEnd(t0).runNow()))
    if (onIonSlideReachStart != null) __obj.updateDynamic("onIonSlideReachStart")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideReachStart(t0).runNow()))
    if (onIonSlideTap != null) __obj.updateDynamic("onIonSlideTap")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideTap(t0).runNow()))
    if (onIonSlideTouchEnd != null) __obj.updateDynamic("onIonSlideTouchEnd")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideTouchEnd(t0).runNow()))
    if (onIonSlideTouchStart != null) __obj.updateDynamic("onIonSlideTouchStart")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideTouchStart(t0).runNow()))
    if (onIonSlideTransitionEnd != null) __obj.updateDynamic("onIonSlideTransitionEnd")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideTransitionEnd(t0).runNow()))
    if (onIonSlideTransitionStart != null) __obj.updateDynamic("onIonSlideTransitionStart")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideTransitionStart(t0).runNow()))
    if (onIonSlideWillChange != null) __obj.updateDynamic("onIonSlideWillChange")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlideWillChange(t0).runNow()))
    if (onIonSlidesDidLoad != null) __obj.updateDynamic("onIonSlidesDidLoad")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonSlidesDidLoad(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(pager)) __obj.updateDynamic("pager")(pager.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollbar)) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSlides]
  }
}

