package typingsJapgolly.extjs.Ext.layout

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.IComponent
import typingsJapgolly.extjs.Ext.dom.IElement
import typingsJapgolly.extjs.Ext.util.IQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContext extends IBase {
  /** [Method] Flushes any pending writes to the DOM by calling each ContextItem in the flushQueue  */
  var flush: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the ContextItem for a component
  		* @param cmp Ext.Component
  		*/
  var getCmp: js.UndefOr[js.Function1[/* cmp */ js.UndefOr[IComponent], Unit]] = js.undefined
  /** [Method] Returns the ContextItem for an element
  		* @param parent Ext.layout.ContextItem
  		* @param el Ext.dom.Element
  		*/
  var getEl: js.UndefOr[
    js.Function2[/* parent */ js.UndefOr[IContextItem], /* el */ js.UndefOr[IElement], Unit]
  ] = js.undefined
  /** [Method] Invalidates one or more components layouts component and container
  		* @param components Ext.Component/Array An array of Components or a single Component.
  		* @param full Boolean True if all properties should be invalidated, otherwise only those calculated by the component should be invalidated.
  		*/
  var invalidate: js.UndefOr[
    js.Function2[/* components */ js.UndefOr[js.Any], /* full */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Property] (Ext.util.Queue) */
  var layoutQueue: js.UndefOr[IQueue] = js.undefined
  /** [Method] Removes the ContextItem for an element from the cache and from the parent s children array
  		* @param parent Ext.layout.ContextItem
  		* @param el Ext.dom.Element
  		*/
  var removeEl: js.UndefOr[
    js.Function2[/* parent */ js.UndefOr[IContextItem], /* el */ js.UndefOr[IElement], Unit]
  ] = js.undefined
  /** [Method] Resets the given layout object
  		* @param layout Object
  		* @param ownerContext Object
  		* @param firstTime Object
  		*/
  var resetLayout: js.UndefOr[
    js.Function3[
      /* layout */ js.UndefOr[js.Any], 
      /* ownerContext */ js.UndefOr[js.Any], 
      /* firstTime */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Runs the layout calculations
  		* @returns Boolean True if all layouts were completed, false if not.
  		*/
  var run: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Performs one layout cycle by calling each layout in the layout queue
  		* @returns Boolean True if some progress was made, false if not.
  		*/
  var runCycle: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Set the size of a component element or composite or an array of components or elements
  		* @param items Ext.Component/Ext.Component[]/Ext.dom.Element/Ext.dom.Element[]/Ext.dom.CompositeElement The item(s) to size.
  		* @param width Number The new width to set (ignored if undefined or NaN).
  		* @param height Number The new height to set (ignored if undefined or NaN).
  		*/
  var setItemSize: js.UndefOr[
    js.Function3[
      /* items */ js.UndefOr[js.Any], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Property] (Number) */
  var state: js.UndefOr[Double] = js.undefined
}

object IContext {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    extend: String = null,
    flush: js.UndefOr[Callback] = js.undefined,
    getCmp: /* cmp */ js.UndefOr[IComponent] => Callback = null,
    getEl: (/* parent */ js.UndefOr[IContextItem], /* el */ js.UndefOr[IElement]) => Callback = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IContext] = null,
    invalidate: (/* components */ js.UndefOr[js.Any], /* full */ js.UndefOr[Boolean]) => Callback = null,
    layoutQueue: IQueue = null,
    mixins: js.Any = null,
    removeEl: (/* parent */ js.UndefOr[IContextItem], /* el */ js.UndefOr[IElement]) => Callback = null,
    requires: Array = null,
    resetLayout: (/* layout */ js.UndefOr[js.Any], /* ownerContext */ js.UndefOr[js.Any], /* firstTime */ js.UndefOr[js.Any]) => Callback = null,
    run: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    runCycle: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    self: IClass = null,
    setItemSize: (/* items */ js.UndefOr[js.Any], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    state: Int | Double = null,
    statics: js.Any = null,
    uses: Array = null
  ): IContext = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    flush.foreach(p => __obj.updateDynamic("flush")(p.toJsFn))
    if (getCmp != null) __obj.updateDynamic("getCmp")(js.Any.fromFunction1((t0: /* cmp */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent]) => getCmp(t0).runNow()))
    if (getEl != null) __obj.updateDynamic("getEl")(js.Any.fromFunction2((t0: /* parent */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.IContextItem], t1: /* el */ js.UndefOr[typingsJapgolly.extjs.Ext.dom.IElement]) => getEl(t0, t1).runNow()))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (invalidate != null) __obj.updateDynamic("invalidate")(js.Any.fromFunction2((t0: /* components */ js.UndefOr[js.Any], t1: /* full */ js.UndefOr[scala.Boolean]) => invalidate(t0, t1).runNow()))
    if (layoutQueue != null) __obj.updateDynamic("layoutQueue")(layoutQueue.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (removeEl != null) __obj.updateDynamic("removeEl")(js.Any.fromFunction2((t0: /* parent */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.IContextItem], t1: /* el */ js.UndefOr[typingsJapgolly.extjs.Ext.dom.IElement]) => removeEl(t0, t1).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resetLayout != null) __obj.updateDynamic("resetLayout")(js.Any.fromFunction3((t0: /* layout */ js.UndefOr[js.Any], t1: /* ownerContext */ js.UndefOr[js.Any], t2: /* firstTime */ js.UndefOr[js.Any]) => resetLayout(t0, t1, t2).runNow()))
    run.foreach(p => __obj.updateDynamic("run")(p.toJsFn))
    runCycle.foreach(p => __obj.updateDynamic("runCycle")(p.toJsFn))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setItemSize != null) __obj.updateDynamic("setItemSize")(js.Any.fromFunction3((t0: /* items */ js.UndefOr[js.Any], t1: /* width */ js.UndefOr[scala.Double], t2: /* height */ js.UndefOr[scala.Double]) => setItemSize(t0, t1, t2).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContext]
  }
}

