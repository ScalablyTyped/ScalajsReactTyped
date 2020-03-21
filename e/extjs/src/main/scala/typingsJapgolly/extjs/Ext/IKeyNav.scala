package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyNav extends IBase {
  /** [Config Option] (String) */
  var defaultEventAction: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Destroy this KeyNav
  		* @param removeEl Boolean Pass true to remove the element associated with this KeyNav.
  		*/
  var destroy: js.UndefOr[js.Function1[/* removeEl */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Disables this KeyNav  */
  var disable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** [Method] Enables this KeyNav  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var eventName: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var forceKeyDown: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var ignoreInputFields: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.util.KeyMap) */
  var keyMap: js.UndefOr[typingsJapgolly.extjs.Ext.util.IKeyMap] = js.undefined
  /** [Config Option] (Function) */
  var processEvent: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var processEventScope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Convenience function for setting disabled enabled by boolean
  		* @param disabled Boolean
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Ext.Component/Ext.Element/HTMLElement/String) */
  var target: js.UndefOr[js.Any] = js.undefined
}

object IKeyNav {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    defaultEventAction: java.lang.String = null,
    destroy: /* removeEl */ js.UndefOr[Boolean] => Callback = null,
    disable: js.UndefOr[Callback] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enable: js.UndefOr[Callback] = js.undefined,
    eventName: java.lang.String = null,
    extend: java.lang.String = null,
    forceKeyDown: js.UndefOr[Boolean] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => CallbackTo[js.Any] = null,
    ignoreInputFields: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IKeyNav] = null,
    keyMap: typingsJapgolly.extjs.Ext.util.IKeyMap = null,
    mixins: js.Any = null,
    processEvent: js.Any = null,
    processEventScope: js.Any = null,
    requires: Array = null,
    self: IClass = null,
    setDisabled: /* disabled */ js.UndefOr[Boolean] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    target: js.Any = null,
    uses: Array = null
  ): IKeyNav = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (defaultEventAction != null) __obj.updateDynamic("defaultEventAction")(defaultEventAction.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* removeEl */ js.UndefOr[scala.Boolean]) => destroy(t0).runNow()))
    disable.foreach(p => __obj.updateDynamic("disable")(p.toJsFn))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    enable.foreach(p => __obj.updateDynamic("enable")(p.toJsFn))
    if (eventName != null) __obj.updateDynamic("eventName")(eventName.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (!js.isUndefined(forceKeyDown)) __obj.updateDynamic("forceKeyDown")(forceKeyDown.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (!js.isUndefined(ignoreInputFields)) __obj.updateDynamic("ignoreInputFields")(ignoreInputFields.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (keyMap != null) __obj.updateDynamic("keyMap")(keyMap.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (processEvent != null) __obj.updateDynamic("processEvent")(processEvent.asInstanceOf[js.Any])
    if (processEventScope != null) __obj.updateDynamic("processEventScope")(processEventScope.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDisabled != null) __obj.updateDynamic("setDisabled")(js.Any.fromFunction1((t0: /* disabled */ js.UndefOr[scala.Boolean]) => setDisabled(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyNav]
  }
}

