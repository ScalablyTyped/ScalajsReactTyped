package typingsJapgolly.senchaTouch.Ext.app

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAction extends IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[String] = js.undefined
  /** [Config Option] (Ext.app.Application) */
  var application: js.UndefOr[IApplication] = js.undefined
  /** [Config Option] (Array) */
  var args: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Array) */
  var beforeFilters: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Ext.app.Controller) */
  var controller: js.UndefOr[IController] = js.undefined
  /** [Method] Starts execution of this Action by calling each of the beforeFilters in turn if any are specified  before calling t  */
  var execute: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the value of action
  		* @returns String
  		*/
  var getAction: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of application
  		* @returns Ext.app.Application
  		*/
  var getApplication: js.UndefOr[js.Function0[IApplication]] = js.undefined
  /** [Method] Returns the value of args
  		* @returns Array
  		*/
  var getArgs: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of beforeFilters
  		* @returns Array
  		*/
  var getBeforeFilters: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of controller
  		* @returns Ext.app.Controller
  		*/
  var getController: js.UndefOr[js.Function0[IController]] = js.undefined
  /** [Method] Returns the value of data
  		* @returns Object
  		*/
  var getData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns Object
  		*/
  var getTitle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Resumes the execution of this Action or starts it if it had not been started already */
  var resume: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of action
  		* @param action String The new value.
  		*/
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of application
  		* @param application Ext.app.Application The new value.
  		*/
  var setApplication: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], Unit]] = js.undefined
  /** [Method] Sets the value of args
  		* @param args Array The new value.
  		*/
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of beforeFilters
  		* @param beforeFilters Array The new value.
  		*/
  var setBeforeFilters: js.UndefOr[js.Function1[/* beforeFilters */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of controller
  		* @param controller Ext.app.Controller The new value.
  		*/
  var setController: js.UndefOr[js.Function1[/* controller */ js.UndefOr[IController], Unit]] = js.undefined
  /** [Method] Sets the value of data
  		* @param data Object The new value.
  		*/
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title Object The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.undefined
}

object IAction {
  @scala.inline
  def apply(
    action: String = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    application: IApplication = null,
    args: Array = null,
    beforeFilters: Array = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    controller: IController = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    execute: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    getAction: js.UndefOr[CallbackTo[String]] = js.undefined,
    getApplication: js.UndefOr[CallbackTo[IApplication]] = js.undefined,
    getArgs: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getBeforeFilters: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getController: js.UndefOr[CallbackTo[IController]] = js.undefined,
    getData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getScope: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTitle: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getUrl: js.UndefOr[CallbackTo[String]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    resume: js.UndefOr[Callback] = js.undefined,
    scope: js.Any = null,
    self: IClass = null,
    setAction: /* action */ js.UndefOr[String] => Callback = null,
    setApplication: /* application */ js.UndefOr[IApplication] => Callback = null,
    setArgs: /* args */ js.UndefOr[Array] => Callback = null,
    setBeforeFilters: /* beforeFilters */ js.UndefOr[Array] => Callback = null,
    setController: /* controller */ js.UndefOr[IController] => Callback = null,
    setData: /* data */ js.UndefOr[js.Any] => Callback = null,
    setScope: /* scope */ js.UndefOr[js.Any] => Callback = null,
    setTitle: /* title */ js.UndefOr[js.Any] => Callback = null,
    setUrl: /* url */ js.UndefOr[String] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    url: String = null,
    uses: Array = null
  ): IAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (beforeFilters != null) __obj.updateDynamic("beforeFilters")(beforeFilters.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    execute.foreach(p => __obj.updateDynamic("execute")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getAction.foreach(p => __obj.updateDynamic("getAction")(p.toJsFn))
    getApplication.foreach(p => __obj.updateDynamic("getApplication")(p.toJsFn))
    getArgs.foreach(p => __obj.updateDynamic("getArgs")(p.toJsFn))
    getBeforeFilters.foreach(p => __obj.updateDynamic("getBeforeFilters")(p.toJsFn))
    getController.foreach(p => __obj.updateDynamic("getController")(p.toJsFn))
    getData.foreach(p => __obj.updateDynamic("getData")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getScope.foreach(p => __obj.updateDynamic("getScope")(p.toJsFn))
    getTitle.foreach(p => __obj.updateDynamic("getTitle")(p.toJsFn))
    getUrl.foreach(p => __obj.updateDynamic("getUrl")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    resume.foreach(p => __obj.updateDynamic("resume")(p.toJsFn))
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAction != null) __obj.updateDynamic("setAction")(js.Any.fromFunction1((t0: /* action */ js.UndefOr[java.lang.String]) => setAction(t0).runNow()))
    if (setApplication != null) __obj.updateDynamic("setApplication")(js.Any.fromFunction1((t0: /* application */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.app.IApplication]) => setApplication(t0).runNow()))
    if (setArgs != null) __obj.updateDynamic("setArgs")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setArgs(t0).runNow()))
    if (setBeforeFilters != null) __obj.updateDynamic("setBeforeFilters")(js.Any.fromFunction1((t0: /* beforeFilters */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setBeforeFilters(t0).runNow()))
    if (setController != null) __obj.updateDynamic("setController")(js.Any.fromFunction1((t0: /* controller */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.app.IController]) => setController(t0).runNow()))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1((t0: /* data */ js.UndefOr[js.Any]) => setData(t0).runNow()))
    if (setScope != null) __obj.updateDynamic("setScope")(js.Any.fromFunction1((t0: /* scope */ js.UndefOr[js.Any]) => setScope(t0).runNow()))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: /* title */ js.UndefOr[js.Any]) => setTitle(t0).runNow()))
    if (setUrl != null) __obj.updateDynamic("setUrl")(js.Any.fromFunction1((t0: /* url */ js.UndefOr[java.lang.String]) => setUrl(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAction]
  }
}

