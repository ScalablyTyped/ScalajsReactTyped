package typingsJapgolly.senchaTouch.Ext.app

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRoute extends IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object) */
  var conditions: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var controller: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value of action
  		* @returns String
  		*/
  var getAction: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of conditions
  		* @returns Object
  		*/
  var getConditions: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of controller
  		* @returns String
  		*/
  var getController: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Property] (Object) */
  var paramsInMatchString: js.UndefOr[js.Any] = js.undefined
  /** [Method] Attempts to recognize a given url string and return controller action pair for it
  		* @param url String The url to recognize.
  		* @returns Object/Boolean The matched data, or false if no match.
  		*/
  var recognize: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], _]] = js.undefined
  /** [Method] Sets the value of action
  		* @param action String The new value.
  		*/
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of conditions
  		* @param conditions Object The new value.
  		*/
  var setConditions: js.UndefOr[js.Function1[/* conditions */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of controller
  		* @param controller String The new value.
  		*/
  var setController: js.UndefOr[js.Function1[/* controller */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.undefined
}

object IRoute {
  @scala.inline
  def apply(
    action: String = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    conditions: js.Any = null,
    config: js.Any = null,
    controller: String = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    getAction: js.UndefOr[CallbackTo[String]] = js.undefined,
    getConditions: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getController: js.UndefOr[CallbackTo[String]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getUrl: js.UndefOr[CallbackTo[String]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    paramsInMatchString: js.Any = null,
    platformConfig: js.Any = null,
    recognize: /* url */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    self: IClass = null,
    setAction: /* action */ js.UndefOr[String] => Callback = null,
    setConditions: /* conditions */ js.UndefOr[js.Any] => Callback = null,
    setController: /* controller */ js.UndefOr[String] => Callback = null,
    setUrl: /* url */ js.UndefOr[String] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    url: String = null,
    uses: Array = null
  ): IRoute = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getAction.foreach(p => __obj.updateDynamic("getAction")(p.toJsFn))
    getConditions.foreach(p => __obj.updateDynamic("getConditions")(p.toJsFn))
    getController.foreach(p => __obj.updateDynamic("getController")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getUrl.foreach(p => __obj.updateDynamic("getUrl")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (paramsInMatchString != null) __obj.updateDynamic("paramsInMatchString")(paramsInMatchString.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (recognize != null) __obj.updateDynamic("recognize")(js.Any.fromFunction1((t0: /* url */ js.UndefOr[java.lang.String]) => recognize(t0).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAction != null) __obj.updateDynamic("setAction")(js.Any.fromFunction1((t0: /* action */ js.UndefOr[java.lang.String]) => setAction(t0).runNow()))
    if (setConditions != null) __obj.updateDynamic("setConditions")(js.Any.fromFunction1((t0: /* conditions */ js.UndefOr[js.Any]) => setConditions(t0).runNow()))
    if (setController != null) __obj.updateDynamic("setController")(js.Any.fromFunction1((t0: /* controller */ js.UndefOr[java.lang.String]) => setController(t0).runNow()))
    if (setUrl != null) __obj.updateDynamic("setUrl")(js.Any.fromFunction1((t0: /* url */ js.UndefOr[java.lang.String]) => setUrl(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRoute]
  }
}

