package typingsJapgolly.extjs.Ext.tree

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.dd.IDragSource
import typingsJapgolly.extjs.Ext.view.IDropZone
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewDropZone extends IDropZone {
  /** [Config Option] (Boolean) */
  var allowContainerDrop: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var allowParentInserts: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var appendOnly: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var expandDelay: js.UndefOr[Double] = js.undefined
  /** [Method] Moved out of the DropZone without dropping  */
  @JSName("notifyOut")
  var notifyOut_IViewDropZone: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] The mouse is no longer over a tree node so dropping is not valid
  		* @param n Object
  		* @param dd Object
  		* @param e Object
  		* @param data Object
  		*/
  @JSName("onNodeOut")
  var onNodeOut_IViewDropZone: js.UndefOr[
    js.Function4[
      /* n */ js.UndefOr[js.Any], 
      /* dd */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
}

object IViewDropZone {
  @scala.inline
  def apply(
    addInvalidHandleClass: /* cssClass */ js.UndefOr[String] => Callback = null,
    addInvalidHandleId: /* id */ js.UndefOr[String] => Callback = null,
    addInvalidHandleType: /* tagName */ js.UndefOr[String] => Callback = null,
    addToGroup: /* sGroup */ js.UndefOr[String] => Callback = null,
    alias: Array = null,
    allowContainerDrop: js.UndefOr[Boolean] = js.undefined,
    allowParentInserts: js.UndefOr[Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    appendOnly: js.UndefOr[Boolean] = js.undefined,
    applyConfig: js.UndefOr[Callback] = js.undefined,
    available: js.UndefOr[Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clearConstraints: js.UndefOr[Callback] = js.undefined,
    clearTicks: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    constrainTo: (/* constrainTo */ js.UndefOr[js.Any], /* pad */ js.UndefOr[js.Any], /* inContent */ js.UndefOr[Boolean]) => Callback = null,
    ddGroup: String = null,
    defaultPadding: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    dropAllowed: String = null,
    dropNotAllowed: String = null,
    endDrag: /* e */ js.UndefOr[Event_] => Callback = null,
    expandDelay: Int | Double = null,
    extend: String = null,
    getDragEl: js.UndefOr[CallbackTo[HTMLElement]] = js.undefined,
    getEl: js.UndefOr[CallbackTo[HTMLElement]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getTargetFromEvent: /* e */ js.UndefOr[Event_] => CallbackTo[js.Any] = null,
    groups: js.Any = null,
    hasOuterHandles: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    ignoreSelf: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    init: (/* id */ js.UndefOr[String], /* sGroup */ js.UndefOr[String], /* config */ js.UndefOr[js.Any]) => Callback = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IViewDropZone] = null,
    initTarget: (/* id */ js.UndefOr[String], /* sGroup */ js.UndefOr[String], /* config */ js.UndefOr[js.Any]) => Callback = null,
    invalidHandleClasses: Array = null,
    invalidHandleIds: js.Any = null,
    invalidHandleTypes: js.Any = null,
    isLocked: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isTarget: js.UndefOr[Boolean] = js.undefined,
    isValidHandleChild: /* node */ js.UndefOr[HTMLElement] => CallbackTo[Boolean] = null,
    lock: js.UndefOr[Callback] = js.undefined,
    maintainOffset: js.UndefOr[Boolean] = js.undefined,
    mixins: js.Any = null,
    moveOnly: js.UndefOr[Boolean] = js.undefined,
    notifyDrop: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event_], /* data */ js.UndefOr[js.Any]) => CallbackTo[Boolean] = null,
    notifyEnter: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event_], /* data */ js.UndefOr[js.Any]) => CallbackTo[String] = null,
    notifyOut: js.UndefOr[Callback] = js.undefined,
    notifyOver: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event_], /* data */ js.UndefOr[js.Any]) => CallbackTo[String] = null,
    onAvailable: js.UndefOr[Callback] = js.undefined,
    onContainerDrop: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event_], /* data */ js.UndefOr[js.Any]) => CallbackTo[Boolean] = null,
    onContainerOver: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event_], /* data */ js.UndefOr[js.Any]) => CallbackTo[String] = null,
    onDrag: /* e */ js.UndefOr[Event_] => Callback = null,
    onDragDrop: (/* e */ js.UndefOr[Event_], /* id */ js.UndefOr[js.Any]) => Callback = null,
    onDragEnter: (/* e */ js.UndefOr[Event_], /* id */ js.UndefOr[js.Any]) => Callback = null,
    onDragOut: (/* e */ js.UndefOr[Event_], /* id */ js.UndefOr[js.Any]) => Callback = null,
    onDragOver: (/* e */ js.UndefOr[Event_], /* id */ js.UndefOr[js.Any]) => Callback = null,
    onInvalidDrop: /* e */ js.UndefOr[Event_] => Callback = null,
    onMouseDown: /* e */ js.UndefOr[Event_] => Callback = null,
    onMouseUp: /* e */ js.UndefOr[Event_] => Callback = null,
    onNodeDrop: (/* nodeData */ js.UndefOr[js.Any], /* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event_], /* data */ js.UndefOr[js.Any]) => CallbackTo[Boolean] = null,
    onNodeEnter: (/* nodeData */ js.UndefOr[js.Any], /* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event_], /* data */ js.UndefOr[js.Any]) => Callback = null,
    onNodeOut: (/* n */ js.UndefOr[js.Any], /* dd */ js.UndefOr[js.Any], /* e */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any]) => Callback = null,
    onNodeOver: (/* nodeData */ js.UndefOr[js.Any], /* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event_], /* data */ js.UndefOr[js.Any]) => CallbackTo[String] = null,
    overClass: String = null,
    padding: Array = null,
    primaryButtonOnly: js.UndefOr[Boolean] = js.undefined,
    removeFromGroup: /* sGroup */ js.UndefOr[String] => Callback = null,
    removeInvalidHandleClass: /* cssClass */ js.UndefOr[String] => Callback = null,
    removeInvalidHandleId: /* id */ js.UndefOr[String] => Callback = null,
    removeInvalidHandleType: /* tagName */ js.UndefOr[String] => Callback = null,
    requires: Array = null,
    resetConstraints: /* maintainOffset */ js.UndefOr[Boolean] => Callback = null,
    self: IClass = null,
    setDragElId: /* id */ js.UndefOr[String] => Callback = null,
    setHandleElId: /* id */ js.UndefOr[String] => Callback = null,
    setInitPosition: (/* diffX */ js.UndefOr[Double], /* diffY */ js.UndefOr[Double]) => Callback = null,
    setOuterHandleElId: /* id */ js.UndefOr[String] => Callback = null,
    setPadding: (/* iTop */ js.UndefOr[Double], /* iRight */ js.UndefOr[Double], /* iBot */ js.UndefOr[Double], /* iLeft */ js.UndefOr[Double]) => Callback = null,
    setXConstraint: (/* iLeft */ js.UndefOr[Double], /* iRight */ js.UndefOr[Double], /* iTickSize */ js.UndefOr[Double]) => Callback = null,
    setYConstraint: (/* iUp */ js.UndefOr[Double], /* iDown */ js.UndefOr[Double], /* iTickSize */ js.UndefOr[Double]) => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    startDrag: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback = null,
    statics: js.Any = null,
    toString: js.UndefOr[CallbackTo[String]] = js.undefined,
    unlock: js.UndefOr[Callback] = js.undefined,
    unreg: js.UndefOr[Callback] = js.undefined,
    uses: Array = null,
    xTicks: Array = null,
    yTicks: Array = null
  ): IViewDropZone = {
    val __obj = js.Dynamic.literal()
    if (addInvalidHandleClass != null) __obj.updateDynamic("addInvalidHandleClass")(js.Any.fromFunction1((t0: /* cssClass */ js.UndefOr[java.lang.String]) => addInvalidHandleClass(t0).runNow()))
    if (addInvalidHandleId != null) __obj.updateDynamic("addInvalidHandleId")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[java.lang.String]) => addInvalidHandleId(t0).runNow()))
    if (addInvalidHandleType != null) __obj.updateDynamic("addInvalidHandleType")(js.Any.fromFunction1((t0: /* tagName */ js.UndefOr[java.lang.String]) => addInvalidHandleType(t0).runNow()))
    if (addToGroup != null) __obj.updateDynamic("addToGroup")(js.Any.fromFunction1((t0: /* sGroup */ js.UndefOr[java.lang.String]) => addToGroup(t0).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(allowContainerDrop)) __obj.updateDynamic("allowContainerDrop")(allowContainerDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(allowParentInserts)) __obj.updateDynamic("allowParentInserts")(allowParentInserts.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(appendOnly)) __obj.updateDynamic("appendOnly")(appendOnly.asInstanceOf[js.Any])
    applyConfig.foreach(p => __obj.updateDynamic("applyConfig")(p.toJsFn))
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clearConstraints.foreach(p => __obj.updateDynamic("clearConstraints")(p.toJsFn))
    clearTicks.foreach(p => __obj.updateDynamic("clearTicks")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (constrainTo != null) __obj.updateDynamic("constrainTo")(js.Any.fromFunction3((t0: /* constrainTo */ js.UndefOr[js.Any], t1: /* pad */ js.UndefOr[js.Any], t2: /* inContent */ js.UndefOr[scala.Boolean]) => constrainTo(t0, t1, t2).runNow()))
    if (ddGroup != null) __obj.updateDynamic("ddGroup")(ddGroup.asInstanceOf[js.Any])
    if (defaultPadding != null) __obj.updateDynamic("defaultPadding")(defaultPadding.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (dropAllowed != null) __obj.updateDynamic("dropAllowed")(dropAllowed.asInstanceOf[js.Any])
    if (dropNotAllowed != null) __obj.updateDynamic("dropNotAllowed")(dropNotAllowed.asInstanceOf[js.Any])
    if (endDrag != null) __obj.updateDynamic("endDrag")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_]) => endDrag(t0).runNow()))
    if (expandDelay != null) __obj.updateDynamic("expandDelay")(expandDelay.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getDragEl.foreach(p => __obj.updateDynamic("getDragEl")(p.toJsFn))
    getEl.foreach(p => __obj.updateDynamic("getEl")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getTargetFromEvent != null) __obj.updateDynamic("getTargetFromEvent")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_]) => getTargetFromEvent(t0).runNow()))
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(hasOuterHandles)) __obj.updateDynamic("hasOuterHandles")(hasOuterHandles.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSelf)) __obj.updateDynamic("ignoreSelf")(ignoreSelf.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction3((t0: /* id */ js.UndefOr[java.lang.String], t1: /* sGroup */ js.UndefOr[java.lang.String], t2: /* config */ js.UndefOr[js.Any]) => init(t0, t1, t2).runNow()))
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (initTarget != null) __obj.updateDynamic("initTarget")(js.Any.fromFunction3((t0: /* id */ js.UndefOr[java.lang.String], t1: /* sGroup */ js.UndefOr[java.lang.String], t2: /* config */ js.UndefOr[js.Any]) => initTarget(t0, t1, t2).runNow()))
    if (invalidHandleClasses != null) __obj.updateDynamic("invalidHandleClasses")(invalidHandleClasses.asInstanceOf[js.Any])
    if (invalidHandleIds != null) __obj.updateDynamic("invalidHandleIds")(invalidHandleIds.asInstanceOf[js.Any])
    if (invalidHandleTypes != null) __obj.updateDynamic("invalidHandleTypes")(invalidHandleTypes.asInstanceOf[js.Any])
    isLocked.foreach(p => __obj.updateDynamic("isLocked")(p.toJsFn))
    if (!js.isUndefined(isTarget)) __obj.updateDynamic("isTarget")(isTarget.asInstanceOf[js.Any])
    if (isValidHandleChild != null) __obj.updateDynamic("isValidHandleChild")(js.Any.fromFunction1((t0: /* node */ js.UndefOr[org.scalajs.dom.raw.HTMLElement]) => isValidHandleChild(t0).runNow()))
    lock.foreach(p => __obj.updateDynamic("lock")(p.toJsFn))
    if (!js.isUndefined(maintainOffset)) __obj.updateDynamic("maintainOffset")(maintainOffset.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (!js.isUndefined(moveOnly)) __obj.updateDynamic("moveOnly")(moveOnly.asInstanceOf[js.Any])
    if (notifyDrop != null) __obj.updateDynamic("notifyDrop")(js.Any.fromFunction3((t0: /* source */ js.UndefOr[typingsJapgolly.extjs.Ext.dd.IDragSource], t1: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t2: /* data */ js.UndefOr[js.Any]) => notifyDrop(t0, t1, t2).runNow()))
    if (notifyEnter != null) __obj.updateDynamic("notifyEnter")(js.Any.fromFunction3((t0: /* source */ js.UndefOr[typingsJapgolly.extjs.Ext.dd.IDragSource], t1: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t2: /* data */ js.UndefOr[js.Any]) => notifyEnter(t0, t1, t2).runNow()))
    notifyOut.foreach(p => __obj.updateDynamic("notifyOut")(p.toJsFn))
    if (notifyOver != null) __obj.updateDynamic("notifyOver")(js.Any.fromFunction3((t0: /* source */ js.UndefOr[typingsJapgolly.extjs.Ext.dd.IDragSource], t1: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t2: /* data */ js.UndefOr[js.Any]) => notifyOver(t0, t1, t2).runNow()))
    onAvailable.foreach(p => __obj.updateDynamic("onAvailable")(p.toJsFn))
    if (onContainerDrop != null) __obj.updateDynamic("onContainerDrop")(js.Any.fromFunction3((t0: /* source */ js.UndefOr[typingsJapgolly.extjs.Ext.dd.IDragSource], t1: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t2: /* data */ js.UndefOr[js.Any]) => onContainerDrop(t0, t1, t2).runNow()))
    if (onContainerOver != null) __obj.updateDynamic("onContainerOver")(js.Any.fromFunction3((t0: /* source */ js.UndefOr[typingsJapgolly.extjs.Ext.dd.IDragSource], t1: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t2: /* data */ js.UndefOr[js.Any]) => onContainerOver(t0, t1, t2).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_]) => onDrag(t0).runNow()))
    if (onDragDrop != null) __obj.updateDynamic("onDragDrop")(js.Any.fromFunction2((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t1: /* id */ js.UndefOr[js.Any]) => onDragDrop(t0, t1).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction2((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t1: /* id */ js.UndefOr[js.Any]) => onDragEnter(t0, t1).runNow()))
    if (onDragOut != null) __obj.updateDynamic("onDragOut")(js.Any.fromFunction2((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t1: /* id */ js.UndefOr[js.Any]) => onDragOut(t0, t1).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction2((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t1: /* id */ js.UndefOr[js.Any]) => onDragOver(t0, t1).runNow()))
    if (onInvalidDrop != null) __obj.updateDynamic("onInvalidDrop")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_]) => onInvalidDrop(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_]) => onMouseDown(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_]) => onMouseUp(t0).runNow()))
    if (onNodeDrop != null) __obj.updateDynamic("onNodeDrop")(js.Any.fromFunction4((t0: /* nodeData */ js.UndefOr[js.Any], t1: /* source */ js.UndefOr[typingsJapgolly.extjs.Ext.dd.IDragSource], t2: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t3: /* data */ js.UndefOr[js.Any]) => onNodeDrop(t0, t1, t2, t3).runNow()))
    if (onNodeEnter != null) __obj.updateDynamic("onNodeEnter")(js.Any.fromFunction4((t0: /* nodeData */ js.UndefOr[js.Any], t1: /* source */ js.UndefOr[typingsJapgolly.extjs.Ext.dd.IDragSource], t2: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t3: /* data */ js.UndefOr[js.Any]) => onNodeEnter(t0, t1, t2, t3).runNow()))
    if (onNodeOut != null) __obj.updateDynamic("onNodeOut")(js.Any.fromFunction4((t0: /* n */ js.UndefOr[js.Any], t1: /* dd */ js.UndefOr[js.Any], t2: /* e */ js.UndefOr[js.Any], t3: /* data */ js.UndefOr[js.Any]) => onNodeOut(t0, t1, t2, t3).runNow()))
    if (onNodeOver != null) __obj.updateDynamic("onNodeOver")(js.Any.fromFunction4((t0: /* nodeData */ js.UndefOr[js.Any], t1: /* source */ js.UndefOr[typingsJapgolly.extjs.Ext.dd.IDragSource], t2: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t3: /* data */ js.UndefOr[js.Any]) => onNodeOver(t0, t1, t2, t3).runNow()))
    if (overClass != null) __obj.updateDynamic("overClass")(overClass.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryButtonOnly)) __obj.updateDynamic("primaryButtonOnly")(primaryButtonOnly.asInstanceOf[js.Any])
    if (removeFromGroup != null) __obj.updateDynamic("removeFromGroup")(js.Any.fromFunction1((t0: /* sGroup */ js.UndefOr[java.lang.String]) => removeFromGroup(t0).runNow()))
    if (removeInvalidHandleClass != null) __obj.updateDynamic("removeInvalidHandleClass")(js.Any.fromFunction1((t0: /* cssClass */ js.UndefOr[java.lang.String]) => removeInvalidHandleClass(t0).runNow()))
    if (removeInvalidHandleId != null) __obj.updateDynamic("removeInvalidHandleId")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[java.lang.String]) => removeInvalidHandleId(t0).runNow()))
    if (removeInvalidHandleType != null) __obj.updateDynamic("removeInvalidHandleType")(js.Any.fromFunction1((t0: /* tagName */ js.UndefOr[java.lang.String]) => removeInvalidHandleType(t0).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resetConstraints != null) __obj.updateDynamic("resetConstraints")(js.Any.fromFunction1((t0: /* maintainOffset */ js.UndefOr[scala.Boolean]) => resetConstraints(t0).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDragElId != null) __obj.updateDynamic("setDragElId")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[java.lang.String]) => setDragElId(t0).runNow()))
    if (setHandleElId != null) __obj.updateDynamic("setHandleElId")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[java.lang.String]) => setHandleElId(t0).runNow()))
    if (setInitPosition != null) __obj.updateDynamic("setInitPosition")(js.Any.fromFunction2((t0: /* diffX */ js.UndefOr[scala.Double], t1: /* diffY */ js.UndefOr[scala.Double]) => setInitPosition(t0, t1).runNow()))
    if (setOuterHandleElId != null) __obj.updateDynamic("setOuterHandleElId")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[java.lang.String]) => setOuterHandleElId(t0).runNow()))
    if (setPadding != null) __obj.updateDynamic("setPadding")(js.Any.fromFunction4((t0: /* iTop */ js.UndefOr[scala.Double], t1: /* iRight */ js.UndefOr[scala.Double], t2: /* iBot */ js.UndefOr[scala.Double], t3: /* iLeft */ js.UndefOr[scala.Double]) => setPadding(t0, t1, t2, t3).runNow()))
    if (setXConstraint != null) __obj.updateDynamic("setXConstraint")(js.Any.fromFunction3((t0: /* iLeft */ js.UndefOr[scala.Double], t1: /* iRight */ js.UndefOr[scala.Double], t2: /* iTickSize */ js.UndefOr[scala.Double]) => setXConstraint(t0, t1, t2).runNow()))
    if (setYConstraint != null) __obj.updateDynamic("setYConstraint")(js.Any.fromFunction3((t0: /* iUp */ js.UndefOr[scala.Double], t1: /* iDown */ js.UndefOr[scala.Double], t2: /* iTickSize */ js.UndefOr[scala.Double]) => setYConstraint(t0, t1, t2).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (startDrag != null) __obj.updateDynamic("startDrag")(js.Any.fromFunction2((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double]) => startDrag(t0, t1).runNow()))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    toString.foreach(p => __obj.updateDynamic("toString")(p.toJsFn))
    unlock.foreach(p => __obj.updateDynamic("unlock")(p.toJsFn))
    unreg.foreach(p => __obj.updateDynamic("unreg")(p.toJsFn))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (xTicks != null) __obj.updateDynamic("xTicks")(xTicks.asInstanceOf[js.Any])
    if (yTicks != null) __obj.updateDynamic("yTicks")(yTicks.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewDropZone]
  }
}

