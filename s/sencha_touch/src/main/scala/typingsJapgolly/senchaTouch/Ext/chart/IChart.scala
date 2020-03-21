package typingsJapgolly.senchaTouch.Ext.chart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChart extends IAbstractChart {
  /** [Config Option] (Boolean) */
  var flipXY: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the value of flipXY
  		* @returns Boolean
  		*/
  var getFlipXY: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of innerRegion
  		* @returns Array
  		*/
  var getInnerRegion: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Layout the axes and series  */
  var performLayout: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the value of flipXY
  		* @param flipXY Boolean The new value.
  		*/
  var setFlipXY: js.UndefOr[js.Function1[/* flipXY */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of innerRegion
  		* @param innerRegion Array The new value.
  		*/
  var setInnerRegion: js.UndefOr[js.Function1[/* innerRegion */ js.UndefOr[Array], Unit]] = js.undefined
}

object IChart {
  @scala.inline
  def apply(
    IAbstractChart: IAbstractChart = null,
    flipXY: js.UndefOr[Boolean] = js.undefined,
    getFlipXY: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getInnerRegion: js.UndefOr[CallbackTo[Array]] = js.undefined,
    performLayout: js.UndefOr[Callback] = js.undefined,
    setFlipXY: /* flipXY */ js.UndefOr[Boolean] => Callback = null,
    setInnerRegion: /* innerRegion */ js.UndefOr[Array] => Callback = null
  ): IChart = {
    val __obj = js.Dynamic.literal()
    if (IAbstractChart != null) js.Dynamic.global.Object.assign(__obj, IAbstractChart)
    if (!js.isUndefined(flipXY)) __obj.updateDynamic("flipXY")(flipXY.asInstanceOf[js.Any])
    getFlipXY.foreach(p => __obj.updateDynamic("getFlipXY")(p.toJsFn))
    getInnerRegion.foreach(p => __obj.updateDynamic("getInnerRegion")(p.toJsFn))
    performLayout.foreach(p => __obj.updateDynamic("performLayout")(p.toJsFn))
    if (setFlipXY != null) __obj.updateDynamic("setFlipXY")(js.Any.fromFunction1((t0: /* flipXY */ js.UndefOr[scala.Boolean]) => setFlipXY(t0).runNow()))
    if (setInnerRegion != null) __obj.updateDynamic("setInnerRegion")(js.Any.fromFunction1((t0: /* innerRegion */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setInnerRegion(t0).runNow()))
    __obj.asInstanceOf[IChart]
  }
}

