package typingsJapgolly.extjs.Ext.panel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProxy extends IBase {
  /** [Method] Gets the proxy s element
  		* @returns Ext.Element The proxy's element
  		*/
  var getEl: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Method] Gets the proxy s ghost Panel
  		* @returns Ext.panel.Panel The proxy's ghost Panel
  		*/
  var getGhost: js.UndefOr[js.Function0[IPanel]] = js.undefined
  /** [Method] Gets the proxy element
  		* @returns Ext.Element The proxy's element
  		*/
  var getProxy: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Method] Hides the proxy */
  var hide: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var insertProxy: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var moveOnDrag: js.UndefOr[Boolean] = js.undefined
  /** [Method] Moves the proxy to a different position in the DOM
  		* @param parentNode HTMLElement The proxy's parent DOM node
  		* @param before HTMLElement The sibling node before which the proxy should be inserted. Defaults to the parent's last child if not specified.
  		*/
  var moveProxy: js.UndefOr[
    js.Function2[/* parentNode */ js.UndefOr[HTMLElement], /* before */ js.UndefOr[HTMLElement], Unit]
  ] = js.undefined
  /** [Property] (Ext.panel.Panel) */
  var panel: js.UndefOr[IPanel] = js.undefined
  /** [Method] Shows the proxy */
  var show: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IProxy {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    extend: String = null,
    getEl: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    getGhost: js.UndefOr[CallbackTo[IPanel]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getProxy: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    hide: js.UndefOr[Callback] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IProxy] = null,
    insertProxy: js.UndefOr[Boolean] = js.undefined,
    mixins: js.Any = null,
    moveOnDrag: js.UndefOr[Boolean] = js.undefined,
    moveProxy: (/* parentNode */ js.UndefOr[HTMLElement], /* before */ js.UndefOr[HTMLElement]) => Callback = null,
    panel: IPanel = null,
    requires: Array = null,
    self: IClass = null,
    show: js.UndefOr[Callback] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IProxy = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getEl.foreach(p => __obj.updateDynamic("getEl")(p.toJsFn))
    getGhost.foreach(p => __obj.updateDynamic("getGhost")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getProxy.foreach(p => __obj.updateDynamic("getProxy")(p.toJsFn))
    hide.foreach(p => __obj.updateDynamic("hide")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (!js.isUndefined(insertProxy)) __obj.updateDynamic("insertProxy")(insertProxy.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (!js.isUndefined(moveOnDrag)) __obj.updateDynamic("moveOnDrag")(moveOnDrag.asInstanceOf[js.Any])
    if (moveProxy != null) __obj.updateDynamic("moveProxy")(js.Any.fromFunction2((t0: /* parentNode */ js.UndefOr[org.scalajs.dom.raw.HTMLElement], t1: /* before */ js.UndefOr[org.scalajs.dom.raw.HTMLElement]) => moveProxy(t0, t1).runNow()))
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    show.foreach(p => __obj.updateDynamic("show")(p.toJsFn))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProxy]
  }
}

