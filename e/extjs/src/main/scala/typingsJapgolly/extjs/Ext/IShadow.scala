package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShadow extends IBase {
  /** [Method] Hides this shadow */
  var hide: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns true if the shadow is visible else false */
  var isVisible: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var offset: js.UndefOr[Double] = js.undefined
  /** [Method] Direct alignment when values are already available
  		* @param left Number The target element left position
  		* @param top Number The target element top position
  		* @param width Number The target element width
  		* @param height Number The target element height
  		*/
  var realign: js.UndefOr[
    js.Function4[
      /* left */ js.UndefOr[Double], 
      /* top */ js.UndefOr[Double], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Sets the opacity of the shadow
  		* @param opacity Number The opacity
  		*/
  var setOpacity: js.UndefOr[js.Function1[/* opacity */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Adjust the z index of this shadow
  		* @param zindex Number The new z-index
  		*/
  var setZIndex: js.UndefOr[js.Function1[/* zindex */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Displays the shadow under the target element
  		* @param targetEl String/HTMLElement/Ext.Element The id or element under which the shadow should display
  		*/
  var show: js.UndefOr[js.Function1[/* targetEl */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IShadow {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => CallbackTo[js.Any] = null,
    hide: js.UndefOr[Callback] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IShadow] = null,
    isVisible: js.UndefOr[Callback] = js.undefined,
    mixins: js.Any = null,
    mode: java.lang.String = null,
    offset: Int | Double = null,
    realign: (/* left */ js.UndefOr[Double], /* top */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Callback = null,
    requires: Array = null,
    self: IClass = null,
    setOpacity: /* opacity */ js.UndefOr[Double] => Callback = null,
    setZIndex: /* zindex */ js.UndefOr[Double] => Callback = null,
    show: /* targetEl */ js.UndefOr[js.Any] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IShadow = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    hide.foreach(p => __obj.updateDynamic("hide")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    isVisible.foreach(p => __obj.updateDynamic("isVisible")(p.toJsFn))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (realign != null) __obj.updateDynamic("realign")(js.Any.fromFunction4((t0: /* left */ js.UndefOr[scala.Double], t1: /* top */ js.UndefOr[scala.Double], t2: /* width */ js.UndefOr[scala.Double], t3: /* height */ js.UndefOr[scala.Double]) => realign(t0, t1, t2, t3).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setOpacity != null) __obj.updateDynamic("setOpacity")(js.Any.fromFunction1((t0: /* opacity */ js.UndefOr[scala.Double]) => setOpacity(t0).runNow()))
    if (setZIndex != null) __obj.updateDynamic("setZIndex")(js.Any.fromFunction1((t0: /* zindex */ js.UndefOr[scala.Double]) => setZIndex(t0).runNow()))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1((t0: /* targetEl */ js.UndefOr[js.Any]) => show(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShadow]
  }
}

