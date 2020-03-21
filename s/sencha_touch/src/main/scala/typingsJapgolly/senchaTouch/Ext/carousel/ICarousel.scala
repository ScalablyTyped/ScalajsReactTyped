package typingsJapgolly.senchaTouch.Ext.carousel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICarousel extends IContainer {
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.undefined
  /** [Method] Returns the index of the currently active card
  		* @returns Number The index of the currently active card.
  		*/
  var getActiveIndex: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of animation
  		* @returns Object
  		*/
  var getAnimation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of bufferSize
  		* @returns Number
  		*/
  var getBufferSize: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of directionLock
  		* @returns Boolean
  		*/
  var getDirectionLock: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of indicator
  		* @returns any
  		*/
  var getIndicator: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of itemConfig
  		* @returns Object
  		*/
  var getItemConfig: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of itemLength
  		* @returns Object
  		*/
  var getItemLength: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var indicator: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns true when direction is horizontal
  		* @returns Boolean
  		*/
  var isHorizontal: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true when direction is vertical
  		* @returns Boolean
  		*/
  var isVertical: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Switches to the next card
  		* @returns Ext.carousel.Carousel this
  		*/
  var next: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Switches to the previous card
  		* @returns Ext.carousel.Carousel this
  		*/
  var prev: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Switches to the previous card
  		* @returns Ext.carousel.Carousel this
  		*/
  var previous: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Sets the value of animation
  		* @param animation Object The new value.
  		*/
  var setAnimation: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of bufferSize
  		* @param bufferSize Number The new value.
  		*/
  var setBufferSize: js.UndefOr[js.Function1[/* bufferSize */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of directionLock
  		* @param directionLock Boolean The new value.
  		*/
  var setDirectionLock: js.UndefOr[js.Function1[/* directionLock */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of indicator
  		* @param indicator Boolean The new value.
  		*/
  var setIndicator: js.UndefOr[js.Function1[/* indicator */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of itemConfig
  		* @param itemConfig Object The new value.
  		*/
  var setItemConfig: js.UndefOr[js.Function1[/* itemConfig */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of itemLength
  		* @param itemLength Object The new value.
  		*/
  var setItemLength: js.UndefOr[js.Function1[/* itemLength */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object ICarousel {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    direction: String = null,
    getActiveIndex: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getAnimation: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getBufferSize: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getDirection: js.UndefOr[CallbackTo[String]] = js.undefined,
    getDirectionLock: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getIndicator: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getItemConfig: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getItemLength: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    indicator: js.UndefOr[Boolean] = js.undefined,
    isHorizontal: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isVertical: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    next: js.UndefOr[CallbackTo[ICarousel]] = js.undefined,
    prev: js.UndefOr[CallbackTo[ICarousel]] = js.undefined,
    previous: js.UndefOr[CallbackTo[ICarousel]] = js.undefined,
    setAnimation: /* animation */ js.UndefOr[js.Any] => Callback = null,
    setBufferSize: /* bufferSize */ js.UndefOr[Double] => Callback = null,
    setDirection: /* direction */ js.UndefOr[String] => Callback = null,
    setDirectionLock: /* directionLock */ js.UndefOr[Boolean] => Callback = null,
    setIndicator: /* indicator */ js.UndefOr[Boolean] => Callback = null,
    setItemConfig: /* itemConfig */ js.UndefOr[js.Any] => Callback = null,
    setItemLength: /* itemLength */ js.UndefOr[js.Any] => Callback = null
  ): ICarousel = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    getActiveIndex.foreach(p => __obj.updateDynamic("getActiveIndex")(p.toJsFn))
    getAnimation.foreach(p => __obj.updateDynamic("getAnimation")(p.toJsFn))
    getBufferSize.foreach(p => __obj.updateDynamic("getBufferSize")(p.toJsFn))
    getDirection.foreach(p => __obj.updateDynamic("getDirection")(p.toJsFn))
    getDirectionLock.foreach(p => __obj.updateDynamic("getDirectionLock")(p.toJsFn))
    getIndicator.foreach(p => __obj.updateDynamic("getIndicator")(p.toJsFn))
    getItemConfig.foreach(p => __obj.updateDynamic("getItemConfig")(p.toJsFn))
    getItemLength.foreach(p => __obj.updateDynamic("getItemLength")(p.toJsFn))
    if (!js.isUndefined(indicator)) __obj.updateDynamic("indicator")(indicator.asInstanceOf[js.Any])
    isHorizontal.foreach(p => __obj.updateDynamic("isHorizontal")(p.toJsFn))
    isVertical.foreach(p => __obj.updateDynamic("isVertical")(p.toJsFn))
    next.foreach(p => __obj.updateDynamic("next")(p.toJsFn))
    prev.foreach(p => __obj.updateDynamic("prev")(p.toJsFn))
    previous.foreach(p => __obj.updateDynamic("previous")(p.toJsFn))
    if (setAnimation != null) __obj.updateDynamic("setAnimation")(js.Any.fromFunction1((t0: /* animation */ js.UndefOr[js.Any]) => setAnimation(t0).runNow()))
    if (setBufferSize != null) __obj.updateDynamic("setBufferSize")(js.Any.fromFunction1((t0: /* bufferSize */ js.UndefOr[scala.Double]) => setBufferSize(t0).runNow()))
    if (setDirection != null) __obj.updateDynamic("setDirection")(js.Any.fromFunction1((t0: /* direction */ js.UndefOr[java.lang.String]) => setDirection(t0).runNow()))
    if (setDirectionLock != null) __obj.updateDynamic("setDirectionLock")(js.Any.fromFunction1((t0: /* directionLock */ js.UndefOr[scala.Boolean]) => setDirectionLock(t0).runNow()))
    if (setIndicator != null) __obj.updateDynamic("setIndicator")(js.Any.fromFunction1((t0: /* indicator */ js.UndefOr[scala.Boolean]) => setIndicator(t0).runNow()))
    if (setItemConfig != null) __obj.updateDynamic("setItemConfig")(js.Any.fromFunction1((t0: /* itemConfig */ js.UndefOr[js.Any]) => setItemConfig(t0).runNow()))
    if (setItemLength != null) __obj.updateDynamic("setItemLength")(js.Any.fromFunction1((t0: /* itemLength */ js.UndefOr[js.Any]) => setItemLength(t0).runNow()))
    __obj.asInstanceOf[ICarousel]
  }
}

