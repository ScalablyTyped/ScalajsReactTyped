package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAction extends IBase {
  /** [Method] Disables all components configured by this Action  */
  var disable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** [Method] Executes the specified function once for each Component currently tied to this Action
  		* @param fn Function The function to execute for each component
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Component.
  		*/
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Enables all components configured by this Action  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Executes this Action manually using the handler function specified in the original config object or the handler funct
  		* @param args Object... Variable number of arguments passed to the handler function
  		*/
  var execute: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  /** [Method] Gets the icon CSS class currently used by all components configured by this Action  */
  var getIconCls: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Gets the text currently displayed by all components configured by this Action  */
  var getText: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /** [Method] Hides all components configured by this Action  */
  var hide: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns true if the components using this Action are currently disabled else returns false  */
  var isDisabled: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns true if the components configured by this Action are currently hidden else returns false  */
  var isHidden: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the disabled state of all components configured by this Action
  		* @param disabled Boolean True to disable the component, false to enable it
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the function that will be called by each Component using this action when its primary event is triggered
  		* @param fn Function The function that will be invoked by the action's components. The function will be called with no arguments.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Component firing the event.
  		*/
  var setHandler: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the hidden state of all components configured by this Action
  		* @param hidden Boolean True to hide the component, false to show it.
  		*/
  var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the icon CSS class for all components configured by this Action
  		* @param cls String The CSS class supplying the icon image
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the text to be displayed by all components configured by this Action
  		* @param text String The text to display
  		*/
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Shows all components configured by this Action  */
  var show: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object IAction {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    disable: js.UndefOr[Callback] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    enable: js.UndefOr[Callback] = js.undefined,
    execute: /* repeated */ js.Any => Callback = null,
    extend: java.lang.String = null,
    getIconCls: js.UndefOr[Callback] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => CallbackTo[js.Any] = null,
    getText: js.UndefOr[Callback] = js.undefined,
    handler: js.Any = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hide: js.UndefOr[Callback] = js.undefined,
    iconCls: java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IAction] = null,
    isDisabled: js.UndefOr[Callback] = js.undefined,
    isHidden: js.UndefOr[Callback] = js.undefined,
    itemId: java.lang.String = null,
    mixins: js.Any = null,
    requires: Array = null,
    scope: js.Any = null,
    self: IClass = null,
    setDisabled: /* disabled */ js.UndefOr[Boolean] => Callback = null,
    setHandler: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    setHidden: /* hidden */ js.UndefOr[Boolean] => Callback = null,
    setIconCls: /* cls */ js.UndefOr[java.lang.String] => Callback = null,
    setText: /* text */ js.UndefOr[java.lang.String] => Callback = null,
    show: js.UndefOr[Callback] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    text: java.lang.String = null,
    uses: Array = null
  ): IAction = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    disable.foreach(p => __obj.updateDynamic("disable")(p.toJsFn))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => each(t0, t1).runNow()))
    enable.foreach(p => __obj.updateDynamic("enable")(p.toJsFn))
    if (execute != null) __obj.updateDynamic("execute")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => execute(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getIconCls.foreach(p => __obj.updateDynamic("getIconCls")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getText.foreach(p => __obj.updateDynamic("getText")(p.toJsFn))
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    hide.foreach(p => __obj.updateDynamic("hide")(p.toJsFn))
    if (iconCls != null) __obj.updateDynamic("iconCls")(iconCls.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    isDisabled.foreach(p => __obj.updateDynamic("isDisabled")(p.toJsFn))
    isHidden.foreach(p => __obj.updateDynamic("isHidden")(p.toJsFn))
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDisabled != null) __obj.updateDynamic("setDisabled")(js.Any.fromFunction1((t0: /* disabled */ js.UndefOr[scala.Boolean]) => setDisabled(t0).runNow()))
    if (setHandler != null) __obj.updateDynamic("setHandler")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => setHandler(t0, t1).runNow()))
    if (setHidden != null) __obj.updateDynamic("setHidden")(js.Any.fromFunction1((t0: /* hidden */ js.UndefOr[scala.Boolean]) => setHidden(t0).runNow()))
    if (setIconCls != null) __obj.updateDynamic("setIconCls")(js.Any.fromFunction1((t0: /* cls */ js.UndefOr[java.lang.String]) => setIconCls(t0).runNow()))
    if (setText != null) __obj.updateDynamic("setText")(js.Any.fromFunction1((t0: /* text */ js.UndefOr[java.lang.String]) => setText(t0).runNow()))
    show.foreach(p => __obj.updateDynamic("show")(p.toJsFn))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAction]
  }
}

