package typingsJapgolly.senchaTouch.Ext.carousel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInfinite extends ICarousel {
  /** [Method] Returns the value of innerItemConfig
  		* @returns Object
  		*/
  var getInnerItemConfig: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of maxItemIndex
  		* @returns Object
  		*/
  var getMaxItemIndex: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of indicator
  		* @param indicator Object The new value.
  		*/
  @JSName("setIndicator")
  var setIndicator_IInfinite: js.UndefOr[js.Function1[/* indicator */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of innerItemConfig
  		* @param innerItemConfig Object The new value.
  		*/
  var setInnerItemConfig: js.UndefOr[js.Function1[/* innerItemConfig */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of maxItemIndex
  		* @param maxItemIndex Object The new value.
  		*/
  var setMaxItemIndex: js.UndefOr[js.Function1[/* maxItemIndex */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IInfinite {
  @scala.inline
  def apply(
    ICarousel: ICarousel = null,
    getInnerItemConfig: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMaxItemIndex: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    setIndicator: /* indicator */ js.UndefOr[js.Any] => Callback = null,
    setInnerItemConfig: /* innerItemConfig */ js.UndefOr[js.Any] => Callback = null,
    setMaxItemIndex: /* maxItemIndex */ js.UndefOr[js.Any] => Callback = null
  ): IInfinite = {
    val __obj = js.Dynamic.literal()
    if (ICarousel != null) js.Dynamic.global.Object.assign(__obj, ICarousel)
    getInnerItemConfig.foreach(p => __obj.updateDynamic("getInnerItemConfig")(p.toJsFn))
    getMaxItemIndex.foreach(p => __obj.updateDynamic("getMaxItemIndex")(p.toJsFn))
    if (setIndicator != null) __obj.updateDynamic("setIndicator")(js.Any.fromFunction1((t0: /* indicator */ js.UndefOr[js.Any]) => setIndicator(t0).runNow()))
    if (setInnerItemConfig != null) __obj.updateDynamic("setInnerItemConfig")(js.Any.fromFunction1((t0: /* innerItemConfig */ js.UndefOr[js.Any]) => setInnerItemConfig(t0).runNow()))
    if (setMaxItemIndex != null) __obj.updateDynamic("setMaxItemIndex")(js.Any.fromFunction1((t0: /* maxItemIndex */ js.UndefOr[js.Any]) => setMaxItemIndex(t0).runNow()))
    __obj.asInstanceOf[IInfinite]
  }
}

