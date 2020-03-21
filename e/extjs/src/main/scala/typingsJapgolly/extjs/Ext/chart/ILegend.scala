package typingsJapgolly.extjs.Ext.chart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILegend extends IBase {
  /** [Config Option] (String) */
  var boxFill: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var boxStroke: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var boxStrokeWidth: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var boxZIndex: js.UndefOr[Double] = js.undefined
  /** [Property] (Boolean) */
  var isVertical: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var itemSpacing: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var labelColor: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var labelFont: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var padding: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.undefined
  /** [Method] toggle
  		* @param show Boolean Whether to show or hide the legend.
  		*/
  var toggle: js.UndefOr[js.Function1[/* show */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var update: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var x: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var y: js.UndefOr[Double] = js.undefined
}

object ILegend {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    boxFill: String = null,
    boxStroke: String = null,
    boxStrokeWidth: String = null,
    boxZIndex: Int | Double = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    extend: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[ILegend] = null,
    isVertical: js.UndefOr[Boolean] = js.undefined,
    itemSpacing: Int | Double = null,
    labelColor: String = null,
    labelFont: String = null,
    mixins: js.Any = null,
    padding: Int | Double = null,
    position: String = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    toggle: /* show */ js.UndefOr[Boolean] => Callback = null,
    update: js.UndefOr[Boolean] = js.undefined,
    uses: Array = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    x: Int | Double = null,
    y: Int | Double = null
  ): ILegend = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (boxFill != null) __obj.updateDynamic("boxFill")(boxFill.asInstanceOf[js.Any])
    if (boxStroke != null) __obj.updateDynamic("boxStroke")(boxStroke.asInstanceOf[js.Any])
    if (boxStrokeWidth != null) __obj.updateDynamic("boxStrokeWidth")(boxStrokeWidth.asInstanceOf[js.Any])
    if (boxZIndex != null) __obj.updateDynamic("boxZIndex")(boxZIndex.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (!js.isUndefined(isVertical)) __obj.updateDynamic("isVertical")(isVertical.asInstanceOf[js.Any])
    if (itemSpacing != null) __obj.updateDynamic("itemSpacing")(itemSpacing.asInstanceOf[js.Any])
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor.asInstanceOf[js.Any])
    if (labelFont != null) __obj.updateDynamic("labelFont")(labelFont.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction1((t0: /* show */ js.UndefOr[scala.Boolean]) => toggle(t0).runNow()))
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILegend]
  }
}

