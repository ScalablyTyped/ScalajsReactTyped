package typingsJapgolly.extjs.Ext.grid.plugin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IAbstractPlugin
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeaderResizer extends IAbstractPlugin {
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the value of dynamic
  		* @returns Boolean
  		*/
  var getDynamic: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] not using w and e resize bc we are only ever resizing one column wResizeCursor Ext isWebKit w resize  col resi
  		* @param headerCt Object
  		*/
  @JSName("init")
  var init_IHeaderResizer: js.UndefOr[js.Function1[/* headerCt */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of dynamic
  		* @param dynamic Boolean
  		*/
  var setDynamic: js.UndefOr[js.Function1[/* dynamic */ js.UndefOr[Boolean], Unit]] = js.undefined
}

object IHeaderResizer {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clonePlugin: /* overrideCfg */ js.UndefOr[js.Any] => Callback = null,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    disable: js.UndefOr[Callback] = js.undefined,
    dynamic: js.UndefOr[Boolean] = js.undefined,
    enable: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    getCmp: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    getDynamic: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    init: /* headerCt */ js.UndefOr[js.Any] => Callback = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IHeaderResizer] = null,
    isPlugin: js.UndefOr[Boolean] = js.undefined,
    mixins: js.Any = null,
    pluginId: String = null,
    requires: Array = null,
    self: IClass = null,
    setCmp: /* cmp */ js.UndefOr[IComponent] => Callback = null,
    setDynamic: /* dynamic */ js.UndefOr[Boolean] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IHeaderResizer = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (clonePlugin != null) __obj.updateDynamic("clonePlugin")(js.Any.fromFunction1((t0: /* overrideCfg */ js.UndefOr[js.Any]) => clonePlugin(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    disable.foreach(p => __obj.updateDynamic("disable")(p.toJsFn))
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic.asInstanceOf[js.Any])
    enable.foreach(p => __obj.updateDynamic("enable")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getCmp.foreach(p => __obj.updateDynamic("getCmp")(p.toJsFn))
    getDynamic.foreach(p => __obj.updateDynamic("getDynamic")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: /* headerCt */ js.UndefOr[js.Any]) => init(t0).runNow()))
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (!js.isUndefined(isPlugin)) __obj.updateDynamic("isPlugin")(isPlugin.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (pluginId != null) __obj.updateDynamic("pluginId")(pluginId.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setCmp != null) __obj.updateDynamic("setCmp")(js.Any.fromFunction1((t0: /* cmp */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent]) => setCmp(t0).runNow()))
    if (setDynamic != null) __obj.updateDynamic("setDynamic")(js.Any.fromFunction1((t0: /* dynamic */ js.UndefOr[scala.Boolean]) => setDynamic(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHeaderResizer]
  }
}

