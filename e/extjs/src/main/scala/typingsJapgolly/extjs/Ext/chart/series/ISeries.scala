package typingsJapgolly.extjs.Ext.chart.series

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.data.IModel
import typingsJapgolly.extjs.Ext.draw.ISprite
import typingsJapgolly.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.chart.IHighlight because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined highlight, highlightCfg, highlightItem, unHighlightItem
- typingsJapgolly.extjs.Ext.chart.ILabel because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined label, onCreateLabel, onPlaceLabel */ trait ISeries extends IObservable {
  /** [Method] Iterate over each of the records for this series
  		* @param fn Function The function to execute for each record.
  		* @param scope Object Scope for the fn.
  		*/
  var eachRecord: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] For a given x y point relative to the Surface find a corresponding item from this series if any
  		* @param x Number
  		* @param y Number
  		* @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain the following:
  		*/
  var getItemForPoint: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], _]] = js.undefined
  /** [Method] Returns a string with the color to be used for the series legend item
  		* @param index Object
  		*/
  var getLegendColor: js.UndefOr[js.Function1[/* index */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Return the number of records being displayed in this series  */
  var getRecordCount: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Hides all the elements in the series  */
  var hideAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var highlight: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var highlightCfg: js.UndefOr[js.Any] = js.undefined
  /** [Method] Highlight the given series item
  		* @param item Object Info about the item; same format as returned by #getItemForPoint.
  		*/
  var highlightItem: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Determines whether the series item at the given index has been excluded i e
  		* @param index Object
  		*/
  var isExcluded: js.UndefOr[js.Function1[/* index */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.undefined
  /** [Method] Called each time a new label is created
  		* @param storeItem Ext.data.Model The element of the store that is related to the sprite.
  		* @param item Object The item related to the sprite. An item is an object containing the position of the shape used to describe the visualization and also pointing to the actual shape (circle, rectangle, path, etc).
  		* @param i Number The index of the element created (i.e the first created label, second created label, etc).
  		* @param display String The label.display type. May be false if the label is hidden
  		* @returns Ext.draw.Sprite The created sprite that will draw the label.
  		*/
  var onCreateLabel: js.UndefOr[
    js.Function4[js.UndefOr[IModel], js.UndefOr[js.Any], js.UndefOr[Double], js.UndefOr[String], ISprite]
  ] = js.undefined
  /** [Method] Called for updating the position of the label
  		* @param label Ext.draw.Sprite The sprite that draws the label.
  		* @param storeItem Ext.data.Model The element of the store that is related to the sprite.
  		* @param item Object The item related to the sprite. An item is an object containing the position of the shape used to describe the visualization and also pointing to the actual shape (circle, rectangle, path, etc).
  		* @param i Number The index of the element to be updated (i.e. whether it is the first, second, third from the labelGroup)
  		* @param display String The label.display type. May be false if the label is hidden
  		* @param animate Boolean A boolean value to set or unset animations for the labels.
  		* @param index Number The series index.
  		*/
  var onPlaceLabel: js.UndefOr[
    js.Function7[
      js.UndefOr[ISprite], 
      js.UndefOr[IModel], 
      js.UndefOr[js.Any], 
      js.UndefOr[Double], 
      js.UndefOr[String], 
      js.UndefOr[Boolean], 
      js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.undefined
  /** [Method] Changes the value of the title for the series
  		* @param index Number
  		* @param title String
  		*/
  var setTitle: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* title */ js.UndefOr[String], Unit]
  ] = js.undefined
  /** [Config Option] (Array) */
  var shadowAttributes: js.UndefOr[Array] = js.undefined
  /** [Method] Shows all the elements in the series  */
  var showAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var showInLegend: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var tips: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.undefined
  /** [Method] Un highlight any existing highlights */
  var unHighlightItem: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ISeries {
  @scala.inline
  def apply(
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    clearManagedListeners: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    eachRecord: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    fireEventArgs: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array]) => CallbackTo[Boolean] = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getItemForPoint: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => CallbackTo[js.Any] = null,
    getLegendColor: /* index */ js.UndefOr[js.Any] => Callback = null,
    getRecordCount: js.UndefOr[Callback] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    hasListeners: js.Any = null,
    hideAll: js.UndefOr[Callback] = js.undefined,
    highlight: js.Any = null,
    highlightCfg: js.Any = null,
    highlightItem: js.UndefOr[js.Any] => Callback = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[ISeries] = null,
    isExcluded: /* index */ js.UndefOr[js.Any] => Callback = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    label: js.Any = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onCreateLabel: (js.UndefOr[IModel], js.UndefOr[js.Any], js.UndefOr[Double], js.UndefOr[String]) => CallbackTo[ISprite] = null,
    onPlaceLabel: (js.UndefOr[ISprite], js.UndefOr[IModel], js.UndefOr[js.Any], js.UndefOr[Double], js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Double]) => Callback = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[String]) => CallbackTo[js.Any] = null,
    removeListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    renderer: js.Any = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Callback = null,
    resumeEvents: js.UndefOr[Callback] = js.undefined,
    self: IClass = null,
    setTitle: (/* index */ js.UndefOr[Double], /* title */ js.UndefOr[String]) => Callback = null,
    shadowAttributes: Array = null,
    showAll: js.UndefOr[Callback] = js.undefined,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Callback = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Callback = null,
    tips: js.Any = null,
    title: String = null,
    `type`: String = null,
    un: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    unHighlightItem: js.UndefOr[Callback] = js.undefined,
    uses: Array = null
  ): ISeries = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addListener(t0, t1, t2, t3).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    clearManagedListeners.foreach(p => __obj.updateDynamic("clearManagedListeners")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (eachRecord != null) __obj.updateDynamic("eachRecord")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => eachRecord(t0, t1).runNow()))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => fireEventArgs(t0, t1).runNow()))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getItemForPoint != null) __obj.updateDynamic("getItemForPoint")(js.Any.fromFunction2((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double]) => getItemForPoint(t0, t1).runNow()))
    if (getLegendColor != null) __obj.updateDynamic("getLegendColor")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[js.Any]) => getLegendColor(t0).runNow()))
    getRecordCount.foreach(p => __obj.updateDynamic("getRecordCount")(p.toJsFn))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    hideAll.foreach(p => __obj.updateDynamic("hideAll")(p.toJsFn))
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (highlightCfg != null) __obj.updateDynamic("highlightCfg")(highlightCfg.asInstanceOf[js.Any])
    if (highlightItem != null) __obj.updateDynamic("highlightItem")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => highlightItem(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (isExcluded != null) __obj.updateDynamic("isExcluded")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[js.Any]) => isExcluded(t0).runNow()))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => on(t0, t1, t2, t3).runNow()))
    if (onCreateLabel != null) __obj.updateDynamic("onCreateLabel")(js.Any.fromFunction4((t0: js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel], t1: js.UndefOr[js.Any], t2: js.UndefOr[scala.Double], t3: js.UndefOr[java.lang.String]) => onCreateLabel(t0, t1, t2, t3).runNow()))
    if (onPlaceLabel != null) __obj.updateDynamic("onPlaceLabel")(js.Any.fromFunction7((t0: js.UndefOr[typingsJapgolly.extjs.Ext.draw.ISprite], t1: js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel], t2: js.UndefOr[js.Any], t3: js.UndefOr[scala.Double], t4: js.UndefOr[java.lang.String], t5: js.UndefOr[scala.Boolean], t6: js.UndefOr[scala.Double]) => onPlaceLabel(t0, t1, t2, t3, t4, t5, t6).runNow()))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3((t0: /* origin */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t2: /* prefix */ js.UndefOr[java.lang.String]) => relayEvents(t0, t1, t2).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => removeListener(t0, t1, t2).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => resumeEvent(t0).runNow()))
    resumeEvents.foreach(p => __obj.updateDynamic("resumeEvents")(p.toJsFn))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[scala.Double], t1: /* title */ js.UndefOr[java.lang.String]) => setTitle(t0, t1).runNow()))
    if (shadowAttributes != null) __obj.updateDynamic("shadowAttributes")(shadowAttributes.asInstanceOf[js.Any])
    showAll.foreach(p => __obj.updateDynamic("showAll")(p.toJsFn))
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => suspendEvent(t0).runNow()))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1((t0: /* queueSuspended */ js.UndefOr[scala.Boolean]) => suspendEvents(t0).runNow()))
    if (tips != null) __obj.updateDynamic("tips")(tips.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => un(t0, t1, t2).runNow()))
    unHighlightItem.foreach(p => __obj.updateDynamic("unHighlightItem")(p.toJsFn))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISeries]
  }
}

