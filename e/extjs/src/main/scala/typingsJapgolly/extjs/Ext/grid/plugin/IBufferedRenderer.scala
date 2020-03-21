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

trait IBufferedRenderer extends IAbstractPlugin {
  /** [Method] Initialize this as a plugin
  		* @param grid Object
  		*/
  @JSName("init")
  var init_IBufferedRenderer: js.UndefOr[js.Function1[/* grid */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var leadingBufferZone: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var numFromEdge: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var percentageFromEdge: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var position: js.UndefOr[Double] = js.undefined
  /** [Method] Scrolls to and optionlly selects the specified row index in the total dataset
  		* @param recordIdx Number The zero-based position in the dataset to scroll to.
  		* @param doSelect Boolean Pass as true to select the specified row.
  		* @param callback Function A function to call when the row has been scrolled to.
  		* @param scope Object The scope (this reference) in which to execute the callback. Defaults to this BufferedRenderer.
  		*/
  var scrollTo: js.UndefOr[
    js.Function4[
      /* recordIdx */ js.UndefOr[Double], 
      /* doSelect */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (Number) */
  var scrollToLoadBuffer: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var synchronousRender: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var trailingBufferZone: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var variableRowHeight: js.UndefOr[Boolean] = js.undefined
}

object IBufferedRenderer {
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
    enable: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    getCmp: js.UndefOr[CallbackTo[IComponent]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    init: /* grid */ js.UndefOr[js.Any] => Callback = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IBufferedRenderer] = null,
    isPlugin: js.UndefOr[Boolean] = js.undefined,
    leadingBufferZone: Int | Double = null,
    mixins: js.Any = null,
    numFromEdge: Int | Double = null,
    percentageFromEdge: Int | Double = null,
    pluginId: String = null,
    position: Int | Double = null,
    requires: Array = null,
    scrollTo: (/* recordIdx */ js.UndefOr[Double], /* doSelect */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    scrollToLoadBuffer: Int | Double = null,
    self: IClass = null,
    setCmp: /* cmp */ js.UndefOr[IComponent] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    synchronousRender: js.UndefOr[Boolean] = js.undefined,
    trailingBufferZone: Int | Double = null,
    uses: Array = null,
    variableRowHeight: js.UndefOr[Boolean] = js.undefined
  ): IBufferedRenderer = {
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
    enable.foreach(p => __obj.updateDynamic("enable")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getCmp.foreach(p => __obj.updateDynamic("getCmp")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: /* grid */ js.UndefOr[js.Any]) => init(t0).runNow()))
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (!js.isUndefined(isPlugin)) __obj.updateDynamic("isPlugin")(isPlugin.asInstanceOf[js.Any])
    if (leadingBufferZone != null) __obj.updateDynamic("leadingBufferZone")(leadingBufferZone.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (numFromEdge != null) __obj.updateDynamic("numFromEdge")(numFromEdge.asInstanceOf[js.Any])
    if (percentageFromEdge != null) __obj.updateDynamic("percentageFromEdge")(percentageFromEdge.asInstanceOf[js.Any])
    if (pluginId != null) __obj.updateDynamic("pluginId")(pluginId.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(js.Any.fromFunction4((t0: /* recordIdx */ js.UndefOr[scala.Double], t1: /* doSelect */ js.UndefOr[scala.Boolean], t2: /* callback */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => scrollTo(t0, t1, t2, t3).runNow()))
    if (scrollToLoadBuffer != null) __obj.updateDynamic("scrollToLoadBuffer")(scrollToLoadBuffer.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setCmp != null) __obj.updateDynamic("setCmp")(js.Any.fromFunction1((t0: /* cmp */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent]) => setCmp(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronousRender)) __obj.updateDynamic("synchronousRender")(synchronousRender.asInstanceOf[js.Any])
    if (trailingBufferZone != null) __obj.updateDynamic("trailingBufferZone")(trailingBufferZone.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (!js.isUndefined(variableRowHeight)) __obj.updateDynamic("variableRowHeight")(variableRowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBufferedRenderer]
  }
}

