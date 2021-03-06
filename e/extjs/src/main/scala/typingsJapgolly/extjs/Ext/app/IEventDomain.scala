package typingsJapgolly.extjs.Ext.app

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventDomain extends IBase {
  /** [Config Option] (String) */
  var idProperty: js.UndefOr[String] = js.undefined
  /** [Property] (Object) */
  var instances: js.UndefOr[js.Any] = js.undefined
  /** [Method] This method matches the firer of the event the target to the given selector
  		* @param target Object The firer of the event.
  		* @param selector String The selector to which to match the target.
  		* @returns Boolean true if the target matches the selector.
  		*/
  var `match`: js.UndefOr[
    js.Function2[/* target */ js.UndefOr[js.Any], /* selector */ js.UndefOr[String], Boolean]
  ] = js.undefined
  /** [Method] This method is called by the derived class to monitor fireEvent calls
  		* @param observable Ext.Class The Observable to monitor for events.
  		*/
  var monitor: js.UndefOr[js.Function1[/* observable */ js.UndefOr[IClass], Unit]] = js.undefined
}

object IEventDomain {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    extend: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    idProperty: String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IEventDomain] = null,
    instances: js.Any = null,
    `match`: (/* target */ js.UndefOr[js.Any], /* selector */ js.UndefOr[String]) => CallbackTo[Boolean] = null,
    mixins: js.Any = null,
    monitor: /* observable */ js.UndefOr[IClass] => Callback = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IEventDomain = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (idProperty != null) __obj.updateDynamic("idProperty")(idProperty.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(js.Any.fromFunction2((t0: /* target */ js.UndefOr[js.Any], t1: /* selector */ js.UndefOr[java.lang.String]) => `match`(t0, t1).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (monitor != null) __obj.updateDynamic("monitor")(js.Any.fromFunction1((t0: /* observable */ js.UndefOr[typingsJapgolly.extjs.Ext.IClass]) => monitor(t0).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventDomain]
  }
}

