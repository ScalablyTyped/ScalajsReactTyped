package typingsJapgolly.extjs.Ext.grid.feature

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.data.IModel
import typingsJapgolly.extjs.Ext.grid.IPanel
import typingsJapgolly.extjs.Ext.view.ITable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGrouping extends IAbstractSummary {
  /** [Method] Collapse a group
  		* @param groupName String The group name
  		* @param focus Boolean Pass true to focus the group after expand.
  		*/
  var collapse: js.UndefOr[
    js.Function2[/* groupName */ js.UndefOr[String], /* focus */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Collapse all groups */
  var collapseAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var depthToIndent: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var enableGroupingMenu: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableNoGroups: js.UndefOr[Boolean] = js.undefined
  /** [Method] Expand a group
  		* @param groupName String The group name
  		* @param focus Boolean Pass true to focus the group after expand.
  		*/
  var expand: js.UndefOr[
    js.Function2[/* groupName */ js.UndefOr[String], /* focus */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Expand all groups */
  var expandAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the group data object for the group to which the passed record belongs if the Store is grouped
  		* @param record Ext.data.Model The record for which to return group information.
  		* @returns Object A single group data block as returned from Store.getGroups. Returns undefined if the Store is not grouped.
  		*/
  var getRecordGroup: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], _]] = js.undefined
  /** [Config Option] (String) */
  var groupByText: js.UndefOr[String] = js.undefined
  /** [Config Option] (String/Array/Ext.Template) */
  var groupHeaderTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var hideGroupedHeader: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns true if the named group is expanded
  		* @param groupName String The group name as returned from getGroupString. This is usually the value of the groupField.
  		* @returns Boolean true if the group defined by that value is expanded.
  		*/
  var isExpanded: js.UndefOr[js.Function1[/* groupName */ js.UndefOr[String], Boolean]] = js.undefined
  /** [Config Option] (String) */
  var showGroupsText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var startCollapsed: js.UndefOr[Boolean] = js.undefined
}

object IGrouping {
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
    collapse: (/* groupName */ js.UndefOr[String], /* focus */ js.UndefOr[Boolean]) => Callback = null,
    collapseAll: js.UndefOr[Callback] = js.undefined,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    config: js.Any = null,
    depthToIndent: Int | Double = null,
    disable: js.UndefOr[Callback] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enable: js.UndefOr[Callback] = js.undefined,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    enableGroupingMenu: js.UndefOr[Boolean] = js.undefined,
    enableNoGroups: js.UndefOr[Boolean] = js.undefined,
    eventPrefix: String = null,
    eventSelector: String = null,
    expand: (/* groupName */ js.UndefOr[String], /* focus */ js.UndefOr[Boolean]) => Callback = null,
    expandAll: js.UndefOr[Callback] = js.undefined,
    extend: String = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    fireEventArgs: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array]) => CallbackTo[Boolean] = null,
    getFireEventArgs: (/* eventName */ js.UndefOr[js.Any], /* view */ js.UndefOr[js.Any], /* featureTarget */ js.UndefOr[js.Any], /* e */ js.UndefOr[js.Any]) => Callback = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getRecordGroup: /* record */ js.UndefOr[IModel] => CallbackTo[js.Any] = null,
    grid: IPanel = null,
    groupByText: String = null,
    groupHeaderTpl: js.Any = null,
    hasFeatureEvent: js.UndefOr[Boolean] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    hasListeners: js.Any = null,
    hideGroupedHeader: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IGrouping] = null,
    isExpanded: /* groupName */ js.UndefOr[String] => CallbackTo[Boolean] = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[String]) => CallbackTo[js.Any] = null,
    remoteRoot: String = null,
    removeListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Callback = null,
    resumeEvents: js.UndefOr[Callback] = js.undefined,
    self: IClass = null,
    showGroupsText: String = null,
    showSummaryRow: js.UndefOr[Boolean] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    startCollapsed: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Callback = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Callback = null,
    toggleSummaryRow: /* visible */ js.UndefOr[Boolean] => Callback = null,
    un: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null,
    view: ITable = null
  ): IGrouping = {
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
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction2((t0: /* groupName */ js.UndefOr[java.lang.String], t1: /* focus */ js.UndefOr[scala.Boolean]) => collapse(t0, t1).runNow()))
    collapseAll.foreach(p => __obj.updateDynamic("collapseAll")(p.toJsFn))
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (depthToIndent != null) __obj.updateDynamic("depthToIndent")(depthToIndent.asInstanceOf[js.Any])
    disable.foreach(p => __obj.updateDynamic("disable")(p.toJsFn))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    enable.foreach(p => __obj.updateDynamic("enable")(p.toJsFn))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (!js.isUndefined(enableGroupingMenu)) __obj.updateDynamic("enableGroupingMenu")(enableGroupingMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(enableNoGroups)) __obj.updateDynamic("enableNoGroups")(enableNoGroups.asInstanceOf[js.Any])
    if (eventPrefix != null) __obj.updateDynamic("eventPrefix")(eventPrefix.asInstanceOf[js.Any])
    if (eventSelector != null) __obj.updateDynamic("eventSelector")(eventSelector.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction2((t0: /* groupName */ js.UndefOr[java.lang.String], t1: /* focus */ js.UndefOr[scala.Boolean]) => expand(t0, t1).runNow()))
    expandAll.foreach(p => __obj.updateDynamic("expandAll")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => fireEventArgs(t0, t1).runNow()))
    if (getFireEventArgs != null) __obj.updateDynamic("getFireEventArgs")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* view */ js.UndefOr[js.Any], t2: /* featureTarget */ js.UndefOr[js.Any], t3: /* e */ js.UndefOr[js.Any]) => getFireEventArgs(t0, t1, t2, t3).runNow()))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getRecordGroup != null) __obj.updateDynamic("getRecordGroup")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel]) => getRecordGroup(t0).runNow()))
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (groupByText != null) __obj.updateDynamic("groupByText")(groupByText.asInstanceOf[js.Any])
    if (groupHeaderTpl != null) __obj.updateDynamic("groupHeaderTpl")(groupHeaderTpl.asInstanceOf[js.Any])
    if (!js.isUndefined(hasFeatureEvent)) __obj.updateDynamic("hasFeatureEvent")(hasFeatureEvent.asInstanceOf[js.Any])
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    if (!js.isUndefined(hideGroupedHeader)) __obj.updateDynamic("hideGroupedHeader")(hideGroupedHeader.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (isExpanded != null) __obj.updateDynamic("isExpanded")(js.Any.fromFunction1((t0: /* groupName */ js.UndefOr[java.lang.String]) => isExpanded(t0).runNow()))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => on(t0, t1, t2, t3).runNow()))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3((t0: /* origin */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t2: /* prefix */ js.UndefOr[java.lang.String]) => relayEvents(t0, t1, t2).runNow()))
    if (remoteRoot != null) __obj.updateDynamic("remoteRoot")(remoteRoot.asInstanceOf[js.Any])
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => removeListener(t0, t1, t2).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => resumeEvent(t0).runNow()))
    resumeEvents.foreach(p => __obj.updateDynamic("resumeEvents")(p.toJsFn))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (showGroupsText != null) __obj.updateDynamic("showGroupsText")(showGroupsText.asInstanceOf[js.Any])
    if (!js.isUndefined(showSummaryRow)) __obj.updateDynamic("showSummaryRow")(showSummaryRow.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (!js.isUndefined(startCollapsed)) __obj.updateDynamic("startCollapsed")(startCollapsed.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => suspendEvent(t0).runNow()))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1((t0: /* queueSuspended */ js.UndefOr[scala.Boolean]) => suspendEvents(t0).runNow()))
    if (toggleSummaryRow != null) __obj.updateDynamic("toggleSummaryRow")(js.Any.fromFunction1((t0: /* visible */ js.UndefOr[scala.Boolean]) => toggleSummaryRow(t0).runNow()))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => un(t0, t1, t2).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGrouping]
  }
}

