package typingsJapgolly.extjs.Ext.data.flash

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBinaryXhr extends IBase {
  /** [Method] Abort this connection  */
  var abort: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] As in XMLHttpRequest  */
  var getAllResponseHeaders: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] As in XMLHttpRequest
  		* @param header Object
  		*/
  var getResponseHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] As in XMLHttpRequest  */
  var onreadystatechange: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] As in XMLHttpRequest
  		* @param method Object
  		* @param url Object
  		* @param async Object
  		* @param user Object
  		* @param password Object
  		*/
  var open: js.UndefOr[
    js.Function5[
      /* method */ js.UndefOr[js.Any], 
      /* url */ js.UndefOr[js.Any], 
      /* async */ js.UndefOr[js.Any], 
      /* user */ js.UndefOr[js.Any], 
      /* password */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] As in XMLHttpRequest
  		* @param mimeType Object
  		*/
  var overrideMimeType: js.UndefOr[js.Function1[/* mimeType */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Property] (number) */
  var readyState: js.UndefOr[Double] = js.undefined
  /** [Property] (Array) */
  var responseBytes: js.UndefOr[Array] = js.undefined
  /** [Method] Initiate the request
  		* @param body Array an array of byte values to send.
  		*/
  var send: js.UndefOr[js.Function1[/* body */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] As in XMLHttpRequest
  		* @param header Object
  		* @param value Object
  		*/
  var setRequestHeader: js.UndefOr[
    js.Function2[/* header */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Property] (number) */
  var status: js.UndefOr[Double] = js.undefined
  /** [Property] (String) */
  var statusText: js.UndefOr[String] = js.undefined
}

object IBinaryXhr {
  @scala.inline
  def apply(
    abort: js.UndefOr[Callback] = js.undefined,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    extend: String = null,
    getAllResponseHeaders: js.UndefOr[Callback] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getResponseHeader: /* header */ js.UndefOr[js.Any] => Callback = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IBinaryXhr] = null,
    mixins: js.Any = null,
    onreadystatechange: js.UndefOr[Callback] = js.undefined,
    open: (/* method */ js.UndefOr[js.Any], /* url */ js.UndefOr[js.Any], /* async */ js.UndefOr[js.Any], /* user */ js.UndefOr[js.Any], /* password */ js.UndefOr[js.Any]) => Callback = null,
    overrideMimeType: /* mimeType */ js.UndefOr[js.Any] => Callback = null,
    readyState: Int | Double = null,
    requires: Array = null,
    responseBytes: Array = null,
    self: IClass = null,
    send: /* body */ js.UndefOr[Array] => Callback = null,
    setRequestHeader: (/* header */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any]) => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    status: Int | Double = null,
    statusText: String = null,
    uses: Array = null
  ): IBinaryXhr = {
    val __obj = js.Dynamic.literal()
    abort.foreach(p => __obj.updateDynamic("abort")(p.toJsFn))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getAllResponseHeaders.foreach(p => __obj.updateDynamic("getAllResponseHeaders")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getResponseHeader != null) __obj.updateDynamic("getResponseHeader")(js.Any.fromFunction1((t0: /* header */ js.UndefOr[js.Any]) => getResponseHeader(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    onreadystatechange.foreach(p => __obj.updateDynamic("onreadystatechange")(p.toJsFn))
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction5((t0: /* method */ js.UndefOr[js.Any], t1: /* url */ js.UndefOr[js.Any], t2: /* async */ js.UndefOr[js.Any], t3: /* user */ js.UndefOr[js.Any], t4: /* password */ js.UndefOr[js.Any]) => open(t0, t1, t2, t3, t4).runNow()))
    if (overrideMimeType != null) __obj.updateDynamic("overrideMimeType")(js.Any.fromFunction1((t0: /* mimeType */ js.UndefOr[js.Any]) => overrideMimeType(t0).runNow()))
    if (readyState != null) __obj.updateDynamic("readyState")(readyState.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (responseBytes != null) __obj.updateDynamic("responseBytes")(responseBytes.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (send != null) __obj.updateDynamic("send")(js.Any.fromFunction1((t0: /* body */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => send(t0).runNow()))
    if (setRequestHeader != null) __obj.updateDynamic("setRequestHeader")(js.Any.fromFunction2((t0: /* header */ js.UndefOr[js.Any], t1: /* value */ js.UndefOr[js.Any]) => setRequestHeader(t0, t1).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBinaryXhr]
  }
}

