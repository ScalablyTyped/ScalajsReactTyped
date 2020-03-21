package typingsJapgolly.extjs.Ext.slider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThumb extends IBase {
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.undefined
  /** [Method] Disables the thumb if it is currently enabled */
  var disable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Enables the thumb if it is currently disabled */
  var enable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets up an Ext dd DragTracker for this thumb */
  var initEvents: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Renders the thumb into a slider */
  var render: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Ext.slider.MultiSlider) */
  var slider: js.UndefOr[IMultiSlider] = js.undefined
}

object IThumb {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    constrain: js.UndefOr[Boolean] = js.undefined,
    disable: js.UndefOr[Callback] = js.undefined,
    enable: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IThumb] = null,
    initEvents: js.UndefOr[Callback] = js.undefined,
    mixins: js.Any = null,
    render: js.UndefOr[Callback] = js.undefined,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    slider: IMultiSlider = null,
    statics: js.Any = null,
    uses: Array = null
  ): IThumb = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(constrain)) __obj.updateDynamic("constrain")(constrain.asInstanceOf[js.Any])
    disable.foreach(p => __obj.updateDynamic("disable")(p.toJsFn))
    enable.foreach(p => __obj.updateDynamic("enable")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    initEvents.foreach(p => __obj.updateDynamic("initEvents")(p.toJsFn))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    render.foreach(p => __obj.updateDynamic("render")(p.toJsFn))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (slider != null) __obj.updateDynamic("slider")(slider.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThumb]
  }
}

