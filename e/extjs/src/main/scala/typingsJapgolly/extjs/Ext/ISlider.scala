package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.slider.IMulti
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlider extends IMulti {
  /** [Method] Returns the current value of the slider
  		* @returns any The current value of the slider
  		*/
  @JSName("getValue")
  var getValue_ISlider: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Programmatically sets the value of the Slider
  		* @param value Number The value to set the slider to. (This will be constrained within minValue and maxValue)
  		* @param animate Boolean Turn on or off animation
  		*/
  @JSName("setValue")
  var setValue_ISlider: js.UndefOr[
    js.Function2[/* value */ js.UndefOr[Double], /* animate */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
}

object ISlider {
  @scala.inline
  def apply(
    IMulti: IMulti = null,
    getValue: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    setValue: (/* value */ js.UndefOr[Double], /* animate */ js.UndefOr[Boolean]) => Callback = null
  ): ISlider = {
    val __obj = js.Dynamic.literal()
    if (IMulti != null) js.Dynamic.global.Object.assign(__obj, IMulti)
    getValue.foreach(p => __obj.updateDynamic("getValue")(p.toJsFn))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction2((t0: /* value */ js.UndefOr[scala.Double], t1: /* animate */ js.UndefOr[scala.Boolean]) => setValue(t0, t1).runNow()))
    __obj.asInstanceOf[ISlider]
  }
}

