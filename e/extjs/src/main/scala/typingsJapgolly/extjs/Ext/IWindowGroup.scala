package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWindowGroup extends IBase {
  /** [Method] Brings the specified Component to the front of any other active Components in this ZIndexManager
  		* @param comp String/Object The id of the Component or a Ext.Component instance
  		* @returns Boolean True if the dialog was brought to the front, else false if it was already in front
  		*/
  var bringToFront: js.UndefOr[js.Function1[/* comp */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
  		* @param fn Function The function to execute for each item
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
  		*/
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
  		* @param fn Function The function to execute for each item
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
  		*/
  var eachBottomUp: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
  		* @param fn Function The function to execute for each item
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
  		*/
  var eachTopDown: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Gets a registered Component by id
  		* @param id String/Object The id of the Component or a Ext.Component instance
  		* @returns Ext.Component
  		*/
  var get: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], IComponent]] = js.undefined
  /** [Method] Gets the currently active Component in this ZIndexManager
  		* @returns Ext.Component The active Component
  		*/
  var getActive: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Returns zero or more Components in this ZIndexManager using the custom search function passed to this method
  		* @param fn Function The search function
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Component being tested. That gets passed to the function if not specified.
  		* @returns Array An array of zero or more matching windows
  		*/
  var getBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Array]] = js.undefined
  /** [Method] Hides all Components managed by this ZIndexManager  */
  var hideAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Registers a floating Ext Component with this ZIndexManager
  		* @param comp Ext.Component The Component to register.
  		*/
  var register: js.UndefOr[js.Function1[/* comp */ js.UndefOr[IComponent], Unit]] = js.undefined
  /** [Method] Sends the specified Component to the back of other active Components in this ZIndexManager
  		* @param comp String/Object The id of the Component or a Ext.Component instance
  		* @returns Ext.Component The Component
  		*/
  var sendToBack: js.UndefOr[js.Function1[/* comp */ js.UndefOr[js.Any], IComponent]] = js.undefined
  /** [Method] Unregisters a Ext Component from this ZIndexManager
  		* @param comp Ext.Component The Component to unregister.
  		*/
  var unregister: js.UndefOr[js.Function1[/* comp */ js.UndefOr[IComponent], Unit]] = js.undefined
}

object IWindowGroup {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    bringToFront: /* comp */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    eachBottomUp: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    eachTopDown: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    extend: java.lang.String = null,
    get: /* id */ js.UndefOr[js.Any] => CallbackTo[IComponent] = null,
    getActive: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    getBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[Array] = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => CallbackTo[js.Any] = null,
    hideAll: js.UndefOr[Callback] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IWindowGroup] = null,
    mixins: js.Any = null,
    register: /* comp */ js.UndefOr[IComponent] => Callback = null,
    requires: Array = null,
    self: IClass = null,
    sendToBack: /* comp */ js.UndefOr[js.Any] => CallbackTo[IComponent] = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    unregister: /* comp */ js.UndefOr[IComponent] => Callback = null,
    uses: Array = null
  ): IWindowGroup = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (bringToFront != null) __obj.updateDynamic("bringToFront")(js.Any.fromFunction1((t0: /* comp */ js.UndefOr[js.Any]) => bringToFront(t0).runNow()))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => each(t0, t1).runNow()))
    if (eachBottomUp != null) __obj.updateDynamic("eachBottomUp")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => eachBottomUp(t0, t1).runNow()))
    if (eachTopDown != null) __obj.updateDynamic("eachTopDown")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => eachTopDown(t0, t1).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[js.Any]) => get(t0).runNow()))
    getActive.foreach(p => __obj.updateDynamic("getActive")(p.toJsFn))
    if (getBy != null) __obj.updateDynamic("getBy")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => getBy(t0, t1).runNow()))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    hideAll.foreach(p => __obj.updateDynamic("hideAll")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (register != null) __obj.updateDynamic("register")(js.Any.fromFunction1((t0: /* comp */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent]) => register(t0).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (sendToBack != null) __obj.updateDynamic("sendToBack")(js.Any.fromFunction1((t0: /* comp */ js.UndefOr[js.Any]) => sendToBack(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (unregister != null) __obj.updateDynamic("unregister")(js.Any.fromFunction1((t0: /* comp */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent]) => unregister(t0).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWindowGroup]
  }
}

