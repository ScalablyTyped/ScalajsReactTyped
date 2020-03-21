package typingsJapgolly.senchaTouch.Ext.device.tunnel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstract extends IBase {
  /** [Method] Broadcast a message intent to look for receivers who can respond to it
  		* @param message String
  		* @returns Ext.Promise A promise which provides an array of objects upon fulfilled. Each object contains information about a receiver, with 'id', 'name' and 'icon' keys.
  		*/
  var broadcast: js.UndefOr[js.Function1[/* message */ js.UndefOr[String], IPromise]] = js.undefined
  /** [Method] Create a connection to another application with the given id
  		* @param receiverId String The id of the application to connect to. Get this id from broadcast
  		* @returns Ext.Promise
  		*/
  var connect: js.UndefOr[js.Function1[/* receiverId */ js.UndefOr[String], IPromise]] = js.undefined
  /** [Method] Assign the callback to handle new connection
  		* @param callback Function
  		*/
  var onConnect: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Assign the callback to handling incoming messages
  		* @param callback Function
  		*/
  var onMessage: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Send a message
  		* @param receiverId String The id of the application to connect to. Get this id from broadcast
  		* @param message * The message to send, can be an object, as long as it is JSON-able.
  		* @param foreground Boolean Whether or not to bring the receiver app to the foreground
  		* @returns Ext.Promise
  		*/
  var send: js.UndefOr[
    js.Function3[
      /* receiverId */ js.UndefOr[String], 
      /* message */ js.UndefOr[js.Any], 
      /* foreground */ js.UndefOr[Boolean], 
      IPromise
    ]
  ] = js.undefined
}

object IAbstract {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    broadcast: /* message */ js.UndefOr[String] => CallbackTo[IPromise] = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    connect: /* receiverId */ js.UndefOr[String] => CallbackTo[IPromise] = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    mixins: js.Any = null,
    onConnect: /* callback */ js.UndefOr[js.Any] => Callback = null,
    onMessage: /* callback */ js.UndefOr[js.Any] => Callback = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    send: (/* receiverId */ js.UndefOr[String], /* message */ js.UndefOr[js.Any], /* foreground */ js.UndefOr[Boolean]) => CallbackTo[IPromise] = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IAbstract = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (broadcast != null) __obj.updateDynamic("broadcast")(js.Any.fromFunction1((t0: /* message */ js.UndefOr[java.lang.String]) => broadcast(t0).runNow()))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(js.Any.fromFunction1((t0: /* receiverId */ js.UndefOr[java.lang.String]) => connect(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (onConnect != null) __obj.updateDynamic("onConnect")(js.Any.fromFunction1((t0: /* callback */ js.UndefOr[js.Any]) => onConnect(t0).runNow()))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1((t0: /* callback */ js.UndefOr[js.Any]) => onMessage(t0).runNow()))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (send != null) __obj.updateDynamic("send")(js.Any.fromFunction3((t0: /* receiverId */ js.UndefOr[java.lang.String], t1: /* message */ js.UndefOr[js.Any], t2: /* foreground */ js.UndefOr[scala.Boolean]) => send(t0, t1, t2).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbstract]
  }
}

