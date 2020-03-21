package typingsJapgolly.swiper.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsOptions extends js.Object {
  /**
    * Triggered right beforey Swiper destoryed
    */
  var beforeDestroy: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Triggered when user click/tap on Swiper after 300ms delay. Receives 'touchend' event as an arguments.
    */
  var click: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Triggered when user double tap on Swiper's container. Receives 'touchend' event as an arguments
    */
  var doubleTap: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Triggered when Swiper goes from beginning or end position
    */
  var fromEdge: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Triggered right after all inner images are loaded. updateOnImagesReady should be also enabled
    */
  var imagesReady: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Fired right after Swiper initialization.
    * Note that with swiper.on('init') syntax it will
    * work only in case you set init: false parameter.
    *
    * @example
    * var swiper = new Swiper('.swiper-container', {
    *   init: false,
    *   // other parameters
    * });
    *
    * @example
    * swiper.on('init', function() {
    *  // do something
    * });
    *
    * @example
    * // init Swiper
    * swiper.init();
    *
    * @example
    * // Otherwise use it as the parameter:
    * var swiper = new Swiper('.swiper-container', {
    *   // other parameters
    *   on: {
    *     init: function () {
    *       // do something
    *     },
    *   }
    * });
    */
  var init: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Triggered when Swiper progress is changed, as an arguments it receives
    * progress that is always from 0 to 1
    */
  var progress: js.UndefOr[js.Function1[/* progress */ js.Any, _]] = js.undefined
  /**
    * Triggered when Swiper reach its beginning (initial position)
    */
  var reachBeginning: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Triggered when Swiper reach last slide
    */
  var reachEnd: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Triggered on window resize right before swiper's onresize manipulation
    */
  var resize: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Triggered everytime when swiper starts animation.
    * Receives current transition duration (in ms) as an arguments,
    */
  var setTransition: js.UndefOr[js.Function1[/* transition */ js.Any, _]] = js.undefined
  /**
    * Triggered when swiper's wrapper change its position. Receives current translate value as an arguments
    */
  var setTranslate: js.UndefOr[js.Function1[/* translate */ js.Any, _]] = js.undefined
  /**
    * Triggered when currently active slide is changed
    */
  var slideChange: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Triggered after animation to other slide (next or previous).
    */
  var slideChangeTransitionEnd: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Triggered in the beginning of animation to other slide (next or previous).
    */
  var slideChangeTransitionStart: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Same as "slideChangeTransitionEnd" but for "forward" direction only
    */
  var slideNextTransitionEnd: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Same as "slideChangeTransitionStart" but for "forward" direction only
    */
  var slideNextTransitionStart: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Same as "slideChangeTransitionEnd" but for "backward" direction only
    */
  var slidePrevTransitionEnd: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Same as "slideChangeTransitionStart" but for "backward" direction only
    */
  var slidePrevTransitionStart: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Triggered when user touch and move finger over Swiper and move it.
    * Receives 'touchmove' event as an arguments.
    */
  var sliderMove: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Triggered when user click/tap on Swiper. Receives 'touchend' event as an arguments.
    */
  var tap: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Triggered when user release Swiper. Receives 'touchend' event as an arguments.
    */
  var touchEnd: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Triggered when user touch and move finger over Swiper. Receives 'touchmove' event as an arguments.
    */
  var touchMove: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Fired when user touch and move finger over
    * Swiper in direction opposite to direction parameter.
    * Receives 'touchmove' event as an arguments.
    */
  var touchMoveOpposite: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Triggered when user touch Swiper. Receives 'touchstart' event as an arguments.
    */
  var touchStart: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Triggered after transition.
    */
  var transitionEnd: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Triggered in the beginning of transition.
    */
  var transitionStart: js.UndefOr[js.Function0[_]] = js.undefined
}

object EventsOptions {
  @scala.inline
  def apply(
    beforeDestroy: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    click: /* event */ js.Any => CallbackTo[js.Any] = null,
    doubleTap: /* event */ js.Any => CallbackTo[js.Any] = null,
    fromEdge: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    imagesReady: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    init: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    progress: /* progress */ js.Any => CallbackTo[js.Any] = null,
    reachBeginning: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    reachEnd: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    resize: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    setTransition: /* transition */ js.Any => CallbackTo[js.Any] = null,
    setTranslate: /* translate */ js.Any => CallbackTo[js.Any] = null,
    slideChange: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    slideChangeTransitionEnd: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    slideChangeTransitionStart: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    slideNextTransitionEnd: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    slideNextTransitionStart: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    slidePrevTransitionEnd: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    slidePrevTransitionStart: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    sliderMove: /* event */ js.Any => CallbackTo[js.Any] = null,
    tap: /* event */ js.Any => CallbackTo[js.Any] = null,
    touchEnd: /* event */ js.Any => CallbackTo[js.Any] = null,
    touchMove: /* event */ js.Any => CallbackTo[js.Any] = null,
    touchMoveOpposite: /* event */ js.Any => CallbackTo[js.Any] = null,
    touchStart: /* event */ js.Any => CallbackTo[js.Any] = null,
    transitionEnd: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    transitionStart: js.UndefOr[CallbackTo[js.Any]] = js.undefined
  ): EventsOptions = {
    val __obj = js.Dynamic.literal()
    beforeDestroy.foreach(p => __obj.updateDynamic("beforeDestroy")(p.toJsFn))
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1((t0: /* event */ js.Any) => click(t0).runNow()))
    if (doubleTap != null) __obj.updateDynamic("doubleTap")(js.Any.fromFunction1((t0: /* event */ js.Any) => doubleTap(t0).runNow()))
    fromEdge.foreach(p => __obj.updateDynamic("fromEdge")(p.toJsFn))
    imagesReady.foreach(p => __obj.updateDynamic("imagesReady")(p.toJsFn))
    init.foreach(p => __obj.updateDynamic("init")(p.toJsFn))
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction1((t0: /* progress */ js.Any) => progress(t0).runNow()))
    reachBeginning.foreach(p => __obj.updateDynamic("reachBeginning")(p.toJsFn))
    reachEnd.foreach(p => __obj.updateDynamic("reachEnd")(p.toJsFn))
    resize.foreach(p => __obj.updateDynamic("resize")(p.toJsFn))
    if (setTransition != null) __obj.updateDynamic("setTransition")(js.Any.fromFunction1((t0: /* transition */ js.Any) => setTransition(t0).runNow()))
    if (setTranslate != null) __obj.updateDynamic("setTranslate")(js.Any.fromFunction1((t0: /* translate */ js.Any) => setTranslate(t0).runNow()))
    slideChange.foreach(p => __obj.updateDynamic("slideChange")(p.toJsFn))
    slideChangeTransitionEnd.foreach(p => __obj.updateDynamic("slideChangeTransitionEnd")(p.toJsFn))
    slideChangeTransitionStart.foreach(p => __obj.updateDynamic("slideChangeTransitionStart")(p.toJsFn))
    slideNextTransitionEnd.foreach(p => __obj.updateDynamic("slideNextTransitionEnd")(p.toJsFn))
    slideNextTransitionStart.foreach(p => __obj.updateDynamic("slideNextTransitionStart")(p.toJsFn))
    slidePrevTransitionEnd.foreach(p => __obj.updateDynamic("slidePrevTransitionEnd")(p.toJsFn))
    slidePrevTransitionStart.foreach(p => __obj.updateDynamic("slidePrevTransitionStart")(p.toJsFn))
    if (sliderMove != null) __obj.updateDynamic("sliderMove")(js.Any.fromFunction1((t0: /* event */ js.Any) => sliderMove(t0).runNow()))
    if (tap != null) __obj.updateDynamic("tap")(js.Any.fromFunction1((t0: /* event */ js.Any) => tap(t0).runNow()))
    if (touchEnd != null) __obj.updateDynamic("touchEnd")(js.Any.fromFunction1((t0: /* event */ js.Any) => touchEnd(t0).runNow()))
    if (touchMove != null) __obj.updateDynamic("touchMove")(js.Any.fromFunction1((t0: /* event */ js.Any) => touchMove(t0).runNow()))
    if (touchMoveOpposite != null) __obj.updateDynamic("touchMoveOpposite")(js.Any.fromFunction1((t0: /* event */ js.Any) => touchMoveOpposite(t0).runNow()))
    if (touchStart != null) __obj.updateDynamic("touchStart")(js.Any.fromFunction1((t0: /* event */ js.Any) => touchStart(t0).runNow()))
    transitionEnd.foreach(p => __obj.updateDynamic("transitionEnd")(p.toJsFn))
    transitionStart.foreach(p => __obj.updateDynamic("transitionStart")(p.toJsFn))
    __obj.asInstanceOf[EventsOptions]
  }
}

