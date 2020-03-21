package typingsJapgolly.extjs.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFloating extends IBase {
  /** [Method] Center this Component in its container
  		* @returns Ext.Component this
  		*/
  var center: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.undefined
  /** [Method] Moves this floating Component into a constrain region
  		* @param constrainTo String/HTMLElement/Ext.Element/Ext.util.Region The Element or Region into which this Component is to be constrained. Defaults to the element into which this floating Component was rendered.
  		*/
  var doConstrain: js.UndefOr[js.Function1[/* constrainTo */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var fixed: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var focusOnToFront: js.UndefOr[Boolean] = js.undefined
  /** [Method] This method is called internally by Ext ZIndexManager to signal that a floating Component has either been moved to th
  		* @param active Boolean True to activate the Component, false to deactivate it.
  		* @param newActive Ext.Component The newly active Component which is taking over topmost zIndex position.
  		*/
  var setActive: js.UndefOr[
    js.Function2[/* active */ js.UndefOr[Boolean], /* newActive */ js.UndefOr[IComponent], Unit]
  ] = js.undefined
  /** [Config Option] (String/Boolean) */
  var shadow: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var shadowOffset: js.UndefOr[Double] = js.undefined
  /** [Method] Sends this Component to the back of lower z index than any other visible windows
  		* @returns Ext.Component this
  		*/
  var toBack: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Brings this floating Component to the front of any other visible floating Components managed by the same ZIndexManag
  		* @param preventFocus Boolean Specify true to prevent the Component from being focused.
  		* @returns Ext.Component this
  		*/
  var toFront: js.UndefOr[js.Function1[/* preventFocus */ js.UndefOr[Boolean], IComponent]] = js.undefined
}

object IFloating {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    center: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    config: js.Any = null,
    constrain: js.UndefOr[Boolean] = js.undefined,
    doConstrain: /* constrainTo */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    focusOnToFront: js.UndefOr[Boolean] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IFloating] = null,
    mixins: js.Any = null,
    requires: Array = null,
    self: IClass = null,
    setActive: (/* active */ js.UndefOr[Boolean], /* newActive */ js.UndefOr[IComponent]) => Callback = null,
    shadow: js.Any = null,
    shadowOffset: Int | Double = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    toBack: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    toFront: /* preventFocus */ js.UndefOr[Boolean] => CallbackTo[IComponent] = null,
    uses: Array = null
  ): IFloating = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    center.foreach(p => __obj.updateDynamic("center")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(constrain)) __obj.updateDynamic("constrain")(constrain.asInstanceOf[js.Any])
    if (doConstrain != null) __obj.updateDynamic("doConstrain")(js.Any.fromFunction1((t0: /* constrainTo */ js.UndefOr[js.Any]) => doConstrain(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnToFront)) __obj.updateDynamic("focusOnToFront")(focusOnToFront.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setActive != null) __obj.updateDynamic("setActive")(js.Any.fromFunction2((t0: /* active */ js.UndefOr[scala.Boolean], t1: /* newActive */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent]) => setActive(t0, t1).runNow()))
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    toBack.foreach(p => __obj.updateDynamic("toBack")(p.toJsFn))
    if (toFront != null) __obj.updateDynamic("toFront")(js.Any.fromFunction1((t0: /* preventFocus */ js.UndefOr[scala.Boolean]) => toFront(t0).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFloating]
  }
}

