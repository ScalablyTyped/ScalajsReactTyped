package typingsJapgolly.extjs.Ext.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyMap extends IBase {
  /** [Method] Add a new binding to this KeyMap
  		* @param binding Object/Object[] A single KeyMap config or an array of configs. The following config object properties are supported:
  		*/
  var addBinding: js.UndefOr[js.Function1[/* binding */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Object/Object[][]) */
  var binding: js.UndefOr[js.Any] = js.undefined
  /** [Method] Destroys the KeyMap instance and removes all handlers
  		* @param removeTarget Boolean True to also remove the target
  		*/
  var destroy: js.UndefOr[js.Function1[/* removeTarget */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Disable this KeyMap */
  var disable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Enables this KeyMap */
  var enable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var eventName: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var ignoreInputFields: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns true if this KeyMap is enabled
  		* @returns Boolean
  		*/
  var isEnabled: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Shorthand for adding a single key listener
  		* @param key Number/Number[]/Object Either the numeric key code, array of key codes or an object with the following options: {key: (number or array), shift: (true/false), ctrl: (true/false), alt: (true/false)}
  		* @param fn Function The function to call
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
  		*/
  var on: js.UndefOr[
    js.Function3[
      /* key */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (Function) */
  var processEvent: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var processEventScope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Remove a binding from this KeyMap
  		* @param binding Object See for options
  		*/
  var removeBinding: js.UndefOr[js.Function1[/* binding */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Convenience function for setting disabled enabled by boolean
  		* @param disabled Boolean
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Ext.Component/Ext.Element/HTMLElement/String) */
  var target: js.UndefOr[js.Any] = js.undefined
  /** [Method] Shorthand for removing a single key listener
  		* @param key Number/Number[]/Object Either the numeric key code, array of key codes or an object with the following options: {key: (number or array), shift: (true/false), ctrl: (true/false), alt: (true/false)}
  		* @param fn Function The function to call
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
  		*/
  var un: js.UndefOr[
    js.Function3[
      /* key */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
}

object IKeyMap {
  @scala.inline
  def apply(
    addBinding: /* binding */ js.UndefOr[js.Any] => Callback = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    binding: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    destroy: /* removeTarget */ js.UndefOr[Boolean] => Callback = null,
    disable: js.UndefOr[Callback] = js.undefined,
    enable: js.UndefOr[Callback] = js.undefined,
    eventName: String = null,
    extend: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    ignoreInputFields: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IKeyMap] = null,
    isEnabled: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    mixins: js.Any = null,
    on: (/* key */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    processEvent: js.Any = null,
    processEventScope: js.Any = null,
    removeBinding: /* binding */ js.UndefOr[js.Any] => Callback = null,
    requires: Array = null,
    self: IClass = null,
    setDisabled: /* disabled */ js.UndefOr[Boolean] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    target: js.Any = null,
    un: (/* key */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null
  ): IKeyMap = {
    val __obj = js.Dynamic.literal()
    if (addBinding != null) __obj.updateDynamic("addBinding")(js.Any.fromFunction1((t0: /* binding */ js.UndefOr[js.Any]) => addBinding(t0).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (binding != null) __obj.updateDynamic("binding")(binding.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* removeTarget */ js.UndefOr[scala.Boolean]) => destroy(t0).runNow()))
    disable.foreach(p => __obj.updateDynamic("disable")(p.toJsFn))
    enable.foreach(p => __obj.updateDynamic("enable")(p.toJsFn))
    if (eventName != null) __obj.updateDynamic("eventName")(eventName.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (!js.isUndefined(ignoreInputFields)) __obj.updateDynamic("ignoreInputFields")(ignoreInputFields.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    isEnabled.foreach(p => __obj.updateDynamic("isEnabled")(p.toJsFn))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction3((t0: /* key */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => on(t0, t1, t2).runNow()))
    if (processEvent != null) __obj.updateDynamic("processEvent")(processEvent.asInstanceOf[js.Any])
    if (processEventScope != null) __obj.updateDynamic("processEventScope")(processEventScope.asInstanceOf[js.Any])
    if (removeBinding != null) __obj.updateDynamic("removeBinding")(js.Any.fromFunction1((t0: /* binding */ js.UndefOr[js.Any]) => removeBinding(t0).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDisabled != null) __obj.updateDynamic("setDisabled")(js.Any.fromFunction1((t0: /* disabled */ js.UndefOr[scala.Boolean]) => setDisabled(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3((t0: /* key */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => un(t0, t1, t2).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyMap]
  }
}

