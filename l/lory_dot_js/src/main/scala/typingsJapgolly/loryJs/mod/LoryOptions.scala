package typingsJapgolly.loryJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoryOptions extends js.Object {
  /**
    * executed after initialisation (end of setup function)
    */
  var afterInit: js.UndefOr[js.Function0[_]] = js.undefined
  //////////////////////////////////////////////////
  //  Callbacks
  //////////////////////////////////////////////////
  /**
    * executed before initialisation (first in setup function)
    */
  var beforeInit: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * executed on click of next controls (next function)
    */
  var beforeNext: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * executed on click of prev controls (prev function)
    */
  var beforePrev: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * executed on every resize event
    */
  var beforeResize: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * executed on touch attempt (touchstart)
    */
  var beforeTouch: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * class name for slider frame
    * default: 'js_frame'
    */
  var classNameFrame: js.UndefOr[String] = js.undefined
  /**
    * class name for slider next control
    * default: 'js_next'
    */
  var classNameNextCtrl: js.UndefOr[String] = js.undefined
  /**
    * class name for slider previous control
    * default: 'js_prev'
    */
  var classNamePrevCtrl: js.UndefOr[String] = js.undefined
  /**
    * class name for slides container
    * default: 'js_slides'
    */
  var classNameSlideContainer: js.UndefOr[String] = js.undefined
  /**
    * cubic bezier easing functions: http://easings.net/de (default: 'cubic-bezier(0.455, 0.03, 0.515, 0.955)').
    */
  var ease: js.UndefOr[String] = js.undefined
  /**
    * enabled mouse events
    * default: false
    */
  var enableMouseEvents: js.UndefOr[Boolean] = js.undefined
  /**
    * like carousel, works with multiple slides (default: false). (do not combine with rewind)
    */
  var infinite: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * the slide index to show when the slider is initialized (	default: 0 )
    */
  var initialIndex: js.UndefOr[Double] = js.undefined
  /**
    * if slider reached the last slide, with next click the slider goes back to the startindex (default: false).
    */
  var rewind: js.UndefOr[Boolean] = js.undefined
  /**
    * time in milliseconds for the animation of the rewind after the last slide (default: 600).
    */
  var rewindSpeed: js.UndefOr[Double] = js.undefined
  /**
    * time in milliseconds for the animation of a valid slide attempt (default: 300).
    */
  var slideSpeed: js.UndefOr[Double] = js.undefined
  //////////////////////////////////////////////////
  //  Options
  //////////////////////////////////////////////////
  /**
    * slides scrolled at once (default: 1).
    */
  var slidesToScroll: js.UndefOr[Double] = js.undefined
  /**
    * time for the snapBack of the slider if the slide attempt was not valid (default: 200).
    */
  var snapBackSpeed: js.UndefOr[Double] = js.undefined
}

object LoryOptions {
  @scala.inline
  def apply(
    afterInit: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    beforeInit: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    beforeNext: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    beforePrev: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    beforeResize: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    beforeTouch: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    classNameFrame: String = null,
    classNameNextCtrl: String = null,
    classNamePrevCtrl: String = null,
    classNameSlideContainer: String = null,
    ease: String = null,
    enableMouseEvents: js.UndefOr[Boolean] = js.undefined,
    infinite: Boolean | Double = null,
    initialIndex: Int | Double = null,
    rewind: js.UndefOr[Boolean] = js.undefined,
    rewindSpeed: Int | Double = null,
    slideSpeed: Int | Double = null,
    slidesToScroll: Int | Double = null,
    snapBackSpeed: Int | Double = null
  ): LoryOptions = {
    val __obj = js.Dynamic.literal()
    afterInit.foreach(p => __obj.updateDynamic("afterInit")(p.toJsFn))
    beforeInit.foreach(p => __obj.updateDynamic("beforeInit")(p.toJsFn))
    beforeNext.foreach(p => __obj.updateDynamic("beforeNext")(p.toJsFn))
    beforePrev.foreach(p => __obj.updateDynamic("beforePrev")(p.toJsFn))
    beforeResize.foreach(p => __obj.updateDynamic("beforeResize")(p.toJsFn))
    beforeTouch.foreach(p => __obj.updateDynamic("beforeTouch")(p.toJsFn))
    if (classNameFrame != null) __obj.updateDynamic("classNameFrame")(classNameFrame.asInstanceOf[js.Any])
    if (classNameNextCtrl != null) __obj.updateDynamic("classNameNextCtrl")(classNameNextCtrl.asInstanceOf[js.Any])
    if (classNamePrevCtrl != null) __obj.updateDynamic("classNamePrevCtrl")(classNamePrevCtrl.asInstanceOf[js.Any])
    if (classNameSlideContainer != null) __obj.updateDynamic("classNameSlideContainer")(classNameSlideContainer.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMouseEvents)) __obj.updateDynamic("enableMouseEvents")(enableMouseEvents.asInstanceOf[js.Any])
    if (infinite != null) __obj.updateDynamic("infinite")(infinite.asInstanceOf[js.Any])
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(rewind)) __obj.updateDynamic("rewind")(rewind.asInstanceOf[js.Any])
    if (rewindSpeed != null) __obj.updateDynamic("rewindSpeed")(rewindSpeed.asInstanceOf[js.Any])
    if (slideSpeed != null) __obj.updateDynamic("slideSpeed")(slideSpeed.asInstanceOf[js.Any])
    if (slidesToScroll != null) __obj.updateDynamic("slidesToScroll")(slidesToScroll.asInstanceOf[js.Any])
    if (snapBackSpeed != null) __obj.updateDynamic("snapBackSpeed")(snapBackSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoryOptions]
  }
}

