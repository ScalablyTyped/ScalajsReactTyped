package typingsJapgolly.senchaTouch.Ext.chart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.dataview.IDataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILegend extends IDataView {
  /** [Method] Returns the value of disableSelection
  		* @returns Boolean
  		*/
  @JSName("getDisableSelection")
  var getDisableSelection_ILegend: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of horizontalHeight
  		* @returns Number
  		*/
  var getHorizontalHeight: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of inline
  		* @returns Boolean
  		*/
  @JSName("getInline")
  var getInline_ILegend: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of itemTpl
  		* @returns Array
  		*/
  @JSName("getItemTpl")
  var getItemTpl_ILegend: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of padding
  		* @returns Number
  		*/
  @JSName("getPadding")
  var getPadding_ILegend: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of toggleable
  		* @returns Boolean
  		*/
  var getToggleable: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of verticalWidth
  		* @returns Number
  		*/
  var getVerticalWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of disableSelection
  		* @param disableSelection Boolean The new value.
  		*/
  @JSName("setDisableSelection")
  var setDisableSelection_ILegend: js.UndefOr[js.Function1[/* disableSelection */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of horizontalHeight
  		* @param horizontalHeight Number The new value.
  		*/
  var setHorizontalHeight: js.UndefOr[js.Function1[/* horizontalHeight */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of inline
  		* @param inline Boolean The new value.
  		*/
  @JSName("setInline")
  var setInline_ILegend: js.UndefOr[js.Function1[/* inline */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of itemTpl
  		* @param itemTpl Array The new value.
  		*/
  @JSName("setItemTpl")
  var setItemTpl_ILegend: js.UndefOr[js.Function1[/* itemTpl */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of padding
  		* @param padding Number The new value.
  		*/
  @JSName("setPadding")
  var setPadding_ILegend: js.UndefOr[js.Function1[/* padding */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of toggleable
  		* @param toggleable Boolean The new value.
  		*/
  var setToggleable: js.UndefOr[js.Function1[/* toggleable */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of verticalWidth
  		* @param verticalWidth Number The new value.
  		*/
  var setVerticalWidth: js.UndefOr[js.Function1[/* verticalWidth */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var toggleable: js.UndefOr[Boolean] = js.undefined
}

object ILegend {
  @scala.inline
  def apply(
    IDataView: IDataView = null,
    getDisableSelection: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getHorizontalHeight: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getInline: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getItemTpl: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getPadding: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getToggleable: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getVerticalWidth: js.UndefOr[CallbackTo[Double]] = js.undefined,
    position: String = null,
    setDisableSelection: /* disableSelection */ js.UndefOr[Boolean] => Callback = null,
    setHorizontalHeight: /* horizontalHeight */ js.UndefOr[Double] => Callback = null,
    setInline: /* inline */ js.UndefOr[Boolean] => Callback = null,
    setItemTpl: /* itemTpl */ js.UndefOr[Array] => Callback = null,
    setPadding: /* padding */ js.UndefOr[Double] => Callback = null,
    setToggleable: /* toggleable */ js.UndefOr[Boolean] => Callback = null,
    setVerticalWidth: /* verticalWidth */ js.UndefOr[Double] => Callback = null,
    toggleable: js.UndefOr[Boolean] = js.undefined
  ): ILegend = {
    val __obj = js.Dynamic.literal()
    if (IDataView != null) js.Dynamic.global.Object.assign(__obj, IDataView)
    getDisableSelection.foreach(p => __obj.updateDynamic("getDisableSelection")(p.toJsFn))
    getHorizontalHeight.foreach(p => __obj.updateDynamic("getHorizontalHeight")(p.toJsFn))
    getInline.foreach(p => __obj.updateDynamic("getInline")(p.toJsFn))
    getItemTpl.foreach(p => __obj.updateDynamic("getItemTpl")(p.toJsFn))
    getPadding.foreach(p => __obj.updateDynamic("getPadding")(p.toJsFn))
    getToggleable.foreach(p => __obj.updateDynamic("getToggleable")(p.toJsFn))
    getVerticalWidth.foreach(p => __obj.updateDynamic("getVerticalWidth")(p.toJsFn))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (setDisableSelection != null) __obj.updateDynamic("setDisableSelection")(js.Any.fromFunction1((t0: /* disableSelection */ js.UndefOr[scala.Boolean]) => setDisableSelection(t0).runNow()))
    if (setHorizontalHeight != null) __obj.updateDynamic("setHorizontalHeight")(js.Any.fromFunction1((t0: /* horizontalHeight */ js.UndefOr[scala.Double]) => setHorizontalHeight(t0).runNow()))
    if (setInline != null) __obj.updateDynamic("setInline")(js.Any.fromFunction1((t0: /* inline */ js.UndefOr[scala.Boolean]) => setInline(t0).runNow()))
    if (setItemTpl != null) __obj.updateDynamic("setItemTpl")(js.Any.fromFunction1((t0: /* itemTpl */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setItemTpl(t0).runNow()))
    if (setPadding != null) __obj.updateDynamic("setPadding")(js.Any.fromFunction1((t0: /* padding */ js.UndefOr[scala.Double]) => setPadding(t0).runNow()))
    if (setToggleable != null) __obj.updateDynamic("setToggleable")(js.Any.fromFunction1((t0: /* toggleable */ js.UndefOr[scala.Boolean]) => setToggleable(t0).runNow()))
    if (setVerticalWidth != null) __obj.updateDynamic("setVerticalWidth")(js.Any.fromFunction1((t0: /* verticalWidth */ js.UndefOr[scala.Double]) => setVerticalWidth(t0).runNow()))
    if (!js.isUndefined(toggleable)) __obj.updateDynamic("toggleable")(toggleable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILegend]
  }
}

