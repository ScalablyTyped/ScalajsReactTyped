package typingsJapgolly.extjs.Ext.form.action

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.form.IBasic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectSubmit extends ISubmit

object IDirectSubmit {
  @scala.inline
  def apply(
    CLIENT_INVALID: String = null,
    CONNECT_FAILURE: String = null,
    LOAD_FAILURE: String = null,
    SERVER_INVALID: String = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clientValidation: js.UndefOr[Boolean] = js.undefined,
    config: js.Any = null,
    extend: String = null,
    failure: js.Any = null,
    failureType: String = null,
    form: IBasic = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    headers: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IDirectSubmit] = null,
    method: String = null,
    mixins: js.Any = null,
    params: js.Any = null,
    requires: Array = null,
    reset: js.UndefOr[Boolean] = js.undefined,
    response: js.Any = null,
    result: js.Any = null,
    run: js.UndefOr[Callback] = js.undefined,
    scope: js.Any = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    submitEmptyText: js.UndefOr[Boolean] = js.undefined,
    success: js.Any = null,
    timeout: Int | Double = null,
    `type`: String = null,
    url: String = null,
    uses: Array = null,
    waitMsg: String = null,
    waitTitle: String = null
  ): IDirectSubmit = {
    val __obj = js.Dynamic.literal()
    if (CLIENT_INVALID != null) __obj.updateDynamic("CLIENT_INVALID")(CLIENT_INVALID.asInstanceOf[js.Any])
    if (CONNECT_FAILURE != null) __obj.updateDynamic("CONNECT_FAILURE")(CONNECT_FAILURE.asInstanceOf[js.Any])
    if (LOAD_FAILURE != null) __obj.updateDynamic("LOAD_FAILURE")(LOAD_FAILURE.asInstanceOf[js.Any])
    if (SERVER_INVALID != null) __obj.updateDynamic("SERVER_INVALID")(SERVER_INVALID.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (!js.isUndefined(clientValidation)) __obj.updateDynamic("clientValidation")(clientValidation.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (failure != null) __obj.updateDynamic("failure")(failure.asInstanceOf[js.Any])
    if (failureType != null) __obj.updateDynamic("failureType")(failureType.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    run.foreach(p => __obj.updateDynamic("run")(p.toJsFn))
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (!js.isUndefined(submitEmptyText)) __obj.updateDynamic("submitEmptyText")(submitEmptyText.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (waitMsg != null) __obj.updateDynamic("waitMsg")(waitMsg.asInstanceOf[js.Any])
    if (waitTitle != null) __obj.updateDynamic("waitTitle")(waitTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirectSubmit]
  }
}

