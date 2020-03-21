package typingsJapgolly.extjs.Ext.dd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragZone extends IDragSource {
  /** [Config Option] (Object/Boolean) */
  var containerScroll: js.UndefOr[js.Any] = js.undefined
  /** [Method] Called when a mousedown occurs in this container
  		* @param e Event The mouse down event
  		* @returns Object The dragData
  		*/
  @JSName("getDragData")
  var getDragData_IDragZone: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event_], _]] = js.undefined
  /** [Method] Called before a repair of an invalid drop to get the XY to animate to
  		* @param e Event The mouse up event
  		* @returns Number[] The xy location (e.g. [100, 200])
  		*/
  var getRepairXY: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event_], Array]] = js.undefined
  /** [Method] Called once drag threshold has been reached to initialize the proxy element
  		* @param x Number The x position of the click on the dragged object
  		* @param y Number The y position of the click on the dragged object
  		* @returns Boolean true to continue the drag, false to cancel
  		*/
  var onInitDrag: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Boolean]] = js.undefined
  /** [Config Option] (String/HTMLElement/Ext.dom.Element) */
  var scrollEl: js.UndefOr[js.Any] = js.undefined
}

object IDragZone {
  @scala.inline
  def apply(
    addInvalidHandleClass: /* cssClass */ js.UndefOr[String] => Callback = null,
    addInvalidHandleId: /* id */ js.UndefOr[String] => Callback = null,
    addInvalidHandleType: /* tagName */ js.UndefOr[String] => Callback = null,
    addToGroup: /* sGroup */ js.UndefOr[String] => Callback = null,
    afterDragDrop: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Callback = null,
    afterDragEnter: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Callback = null,
    afterDragOut: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Callback = null,
    afterDragOver: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Callback = null,
    afterInvalidDrop: (/* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Callback = null,
    afterValidDrop: (/* target */ js.UndefOr[js.Any], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => Callback = null,
    alias: Array = null,
    alignElWithMouse: js.UndefOr[Callback] = js.undefined,
    alternateClassName: js.Any = null,
    animRepair: js.UndefOr[Boolean] = js.undefined,
    applyConfig: js.UndefOr[Callback] = js.undefined,
    autoOffset: (/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double]) => Callback = null,
    available: js.UndefOr[Boolean] = js.undefined,
    b4Drag: /* e */ js.UndefOr[js.Any] => Callback = null,
    b4MouseDown: /* e */ js.UndefOr[js.Any] => Callback = null,
    beforeDragDrop: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => CallbackTo[Boolean] = null,
    beforeDragEnter: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => CallbackTo[Boolean] = null,
    beforeDragOut: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => CallbackTo[Boolean] = null,
    beforeDragOver: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => CallbackTo[Boolean] = null,
    beforeInvalidDrop: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event_], /* id */ js.UndefOr[String]) => CallbackTo[Boolean] = null,
    cachePosition: (/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double]) => Callback = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    centerFrame: js.UndefOr[Boolean] = js.undefined,
    clearConstraints: js.UndefOr[Callback] = js.undefined,
    clearTicks: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    constrainTo: (/* constrainTo */ js.UndefOr[js.Any], /* pad */ js.UndefOr[js.Any], /* inContent */ js.UndefOr[Boolean]) => Callback = null,
    containerScroll: js.Any = null,
    createFrame: js.UndefOr[Callback] = js.undefined,
    ddGroup: String = null,
    defaultPadding: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    dragData: js.Any = null,
    dragElId: String = null,
    dropAllowed: String = null,
    dropNotAllowed: String = null,
    endDrag: /* e */ js.UndefOr[js.Any] => Callback = null,
    extend: String = null,
    getDragData: /* e */ js.UndefOr[Event_] => CallbackTo[js.Any] = null,
    getDragEl: js.UndefOr[CallbackTo[HTMLElement]] = js.undefined,
    getEl: js.UndefOr[CallbackTo[HTMLElement]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getProxy: js.UndefOr[CallbackTo[IStatusProxy]] = js.undefined,
    getRepairXY: /* e */ js.UndefOr[Event_] => CallbackTo[Array] = null,
    groups: js.Any = null,
    hasOuterHandles: js.UndefOr[Boolean] = js.undefined,
    hideProxy: js.UndefOr[Callback] = js.undefined,
    id: String = null,
    ignoreSelf: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    init: (/* id */ js.UndefOr[String], /* sGroup */ js.UndefOr[String], /* config */ js.UndefOr[js.Any]) => Callback = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IDragZone] = null,
    initFrame: js.UndefOr[Callback] = js.undefined,
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
    onAvailable: js.UndefOr[Callback] = js.undefined,
    onBeforeDrag: (/* data */ js.UndefOr[js.Any], /* e */ js.UndefOr[Event_]) => CallbackTo[Boolean] = null,
    onDrag: /* e */ js.UndefOr[Event_] => Callback = null,
    onDragDrop: (/* e */ js.UndefOr[Event_], /* id */ js.UndefOr[js.Any]) => Callback = null,
    onDragEnter: (/* e */ js.UndefOr[Event_], /* id */ js.UndefOr[js.Any]) => Callback = null,
    onDragOut: (/* e */ js.UndefOr[Event_], /* id */ js.UndefOr[js.Any]) => Callback = null,
    onDragOver: (/* e */ js.UndefOr[Event_], /* id */ js.UndefOr[js.Any]) => Callback = null,
    onInitDrag: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => CallbackTo[Boolean] = null,
    onInvalidDrop: /* e */ js.UndefOr[Event_] => Callback = null,
    onMouseDown: /* e */ js.UndefOr[Event_] => Callback = null,
    onMouseUp: /* e */ js.UndefOr[Event_] => Callback = null,
    onStartDrag: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback = null,
    padding: Array = null,
    primaryButtonOnly: js.UndefOr[Boolean] = js.undefined,
    removeFromGroup: /* sGroup */ js.UndefOr[String] => Callback = null,
    removeInvalidHandleClass: /* cssClass */ js.UndefOr[String] => Callback = null,
    removeInvalidHandleId: /* id */ js.UndefOr[String] => Callback = null,
    removeInvalidHandleType: /* tagName */ js.UndefOr[String] => Callback = null,
    repairHighlightColor: String = null,
    requires: Array = null,
    resetConstraints: /* maintainOffset */ js.UndefOr[Boolean] => Callback = null,
    resizeFrame: js.UndefOr[Boolean] = js.undefined,
    scroll: js.UndefOr[Boolean] = js.undefined,
    scrollEl: js.Any = null,
    self: IClass = null,
    setDelta: (/* iDeltaX */ js.UndefOr[Double], /* iDeltaY */ js.UndefOr[Double]) => Callback = null,
    setDragElId: /* id */ js.UndefOr[String] => Callback = null,
    setDragElPos: (/* iPageX */ js.UndefOr[Double], /* iPageY */ js.UndefOr[Double]) => Callback = null,
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
  ): IDragZone = {
    val __obj = js.Dynamic.literal()
    if (addInvalidHandleClass != null) __obj.updateDynamic("addInvalidHandleClass")(js.Any.fromFunction1((t0: /* cssClass */ js.UndefOr[java.lang.String]) => addInvalidHandleClass(t0).runNow()))
    if (addInvalidHandleId != null) __obj.updateDynamic("addInvalidHandleId")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[java.lang.String]) => addInvalidHandleId(t0).runNow()))
    if (addInvalidHandleType != null) __obj.updateDynamic("addInvalidHandleType")(js.Any.fromFunction1((t0: /* tagName */ js.UndefOr[java.lang.String]) => addInvalidHandleType(t0).runNow()))
    if (addToGroup != null) __obj.updateDynamic("addToGroup")(js.Any.fromFunction1((t0: /* sGroup */ js.UndefOr[java.lang.String]) => addToGroup(t0).runNow()))
    if (afterDragDrop != null) __obj.updateDynamic("afterDragDrop")(js.Any.fromFunction3((t0: /* target */ js.UndefOr[typingsJapgolly.extjs.Ext.dd.IDragDrop], t1: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t2: /* id */ js.UndefOr[java.lang.String]) => afterDragDrop(t0, t1, t2).runNow()))
    if (afterDragEnter != null) __obj.updateDynamic("afterDragEnter")(js.Any.fromFunction3((t0: /* target */ js.UndefOr[typingsJapgolly.extjs.Ext.dd.IDragDrop], t1: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t2: /* id */ js.UndefOr[java.lang.String]) => afterDragEnter(t0, t1, t2).runNow()))
    if (afterDragOut != null) __obj.updateDynamic("afterDragOut")(js.Any.fromFunction3((t0: /* target */ js.UndefOr[typingsJapgolly.extjs.Ext.dd.IDragDrop], t1: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t2: /* id */ js.UndefOr[java.lang.String]) => afterDragOut(t0, t1, t2).runNow()))
    if (afterDragOver != null) __obj.updateDynamic("afterDragOver")(js.Any.fromFunction3((t0: /* target */ js.UndefOr[typingsJapgolly.extjs.Ext.dd.IDragDrop], t1: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t2: /* id */ js.UndefOr[java.lang.String]) => afterDragOver(t0, t1, t2).runNow()))
    if (afterInvalidDrop != null) __obj.updateDynamic("afterInvalidDrop")(js.Any.fromFunction2((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t1: /* id */ js.UndefOr[java.lang.String]) => afterInvalidDrop(t0, t1).runNow()))
    if (afterValidDrop != null) __obj.updateDynamic("afterValidDrop")(js.Any.fromFunction3((t0: /* target */ js.UndefOr[js.Any], t1: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t2: /* id */ js.UndefOr[java.lang.String]) => afterValidDrop(t0, t1, t2).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    alignElWithMouse.foreach(p => __obj.updateDynamic("alignElWithMouse")(p.toJsFn))
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(animRepair)) __obj.updateDynamic("animRepair")(animRepair.asInstanceOf[js.Any])
    applyConfig.foreach(p => __obj.updateDynamic("applyConfig")(p.toJsFn))
    if (autoOffset != null) __obj.updateDynamic("autoOffset")(js.Any.fromFunction2((t0: /* iPageX */ js.UndefOr[scala.Double], t1: /* iPageY */ js.UndefOr[scala.Double]) => autoOffset(t0, t1).runNow()))
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available.asInstanceOf[js.Any])
    if (b4Drag != null) __obj.updateDynamic("b4Drag")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[js.Any]) => b4Drag(t0).runNow()))
    if (b4MouseDown != null) __obj.updateDynamic("b4MouseDown")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[js.Any]) => b4MouseDown(t0).runNow()))
    if (beforeDragDrop != null) __obj.updateDynamic("beforeDragDrop")(js.Any.fromFunction3((t0: /* target */ js.UndefOr[typingsJapgolly.extjs.Ext.dd.IDragDrop], t1: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t2: /* id */ js.UndefOr[java.lang.String]) => beforeDragDrop(t0, t1, t2).runNow()))
    if (beforeDragEnter != null) __obj.updateDynamic("beforeDragEnter")(js.Any.fromFunction3((t0: /* target */ js.UndefOr[typingsJapgolly.extjs.Ext.dd.IDragDrop], t1: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t2: /* id */ js.UndefOr[java.lang.String]) => beforeDragEnter(t0, t1, t2).runNow()))
    if (beforeDragOut != null) __obj.updateDynamic("beforeDragOut")(js.Any.fromFunction3((t0: /* target */ js.UndefOr[typingsJapgolly.extjs.Ext.dd.IDragDrop], t1: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t2: /* id */ js.UndefOr[java.lang.String]) => beforeDragOut(t0, t1, t2).runNow()))
    if (beforeDragOver != null) __obj.updateDynamic("beforeDragOver")(js.Any.fromFunction3((t0: /* target */ js.UndefOr[typingsJapgolly.extjs.Ext.dd.IDragDrop], t1: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t2: /* id */ js.UndefOr[java.lang.String]) => beforeDragOver(t0, t1, t2).runNow()))
    if (beforeInvalidDrop != null) __obj.updateDynamic("beforeInvalidDrop")(js.Any.fromFunction3((t0: /* target */ js.UndefOr[typingsJapgolly.extjs.Ext.dd.IDragDrop], t1: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t2: /* id */ js.UndefOr[java.lang.String]) => beforeInvalidDrop(t0, t1, t2).runNow()))
    if (cachePosition != null) __obj.updateDynamic("cachePosition")(js.Any.fromFunction2((t0: /* iPageX */ js.UndefOr[scala.Double], t1: /* iPageY */ js.UndefOr[scala.Double]) => cachePosition(t0, t1).runNow()))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (!js.isUndefined(centerFrame)) __obj.updateDynamic("centerFrame")(centerFrame.asInstanceOf[js.Any])
    clearConstraints.foreach(p => __obj.updateDynamic("clearConstraints")(p.toJsFn))
    clearTicks.foreach(p => __obj.updateDynamic("clearTicks")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (constrainTo != null) __obj.updateDynamic("constrainTo")(js.Any.fromFunction3((t0: /* constrainTo */ js.UndefOr[js.Any], t1: /* pad */ js.UndefOr[js.Any], t2: /* inContent */ js.UndefOr[scala.Boolean]) => constrainTo(t0, t1, t2).runNow()))
    if (containerScroll != null) __obj.updateDynamic("containerScroll")(containerScroll.asInstanceOf[js.Any])
    createFrame.foreach(p => __obj.updateDynamic("createFrame")(p.toJsFn))
    if (ddGroup != null) __obj.updateDynamic("ddGroup")(ddGroup.asInstanceOf[js.Any])
    if (defaultPadding != null) __obj.updateDynamic("defaultPadding")(defaultPadding.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (dragData != null) __obj.updateDynamic("dragData")(dragData.asInstanceOf[js.Any])
    if (dragElId != null) __obj.updateDynamic("dragElId")(dragElId.asInstanceOf[js.Any])
    if (dropAllowed != null) __obj.updateDynamic("dropAllowed")(dropAllowed.asInstanceOf[js.Any])
    if (dropNotAllowed != null) __obj.updateDynamic("dropNotAllowed")(dropNotAllowed.asInstanceOf[js.Any])
    if (endDrag != null) __obj.updateDynamic("endDrag")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[js.Any]) => endDrag(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getDragData != null) __obj.updateDynamic("getDragData")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_]) => getDragData(t0).runNow()))
    getDragEl.foreach(p => __obj.updateDynamic("getDragEl")(p.toJsFn))
    getEl.foreach(p => __obj.updateDynamic("getEl")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getProxy.foreach(p => __obj.updateDynamic("getProxy")(p.toJsFn))
    if (getRepairXY != null) __obj.updateDynamic("getRepairXY")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_]) => getRepairXY(t0).runNow()))
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(hasOuterHandles)) __obj.updateDynamic("hasOuterHandles")(hasOuterHandles.asInstanceOf[js.Any])
    hideProxy.foreach(p => __obj.updateDynamic("hideProxy")(p.toJsFn))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSelf)) __obj.updateDynamic("ignoreSelf")(ignoreSelf.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction3((t0: /* id */ js.UndefOr[java.lang.String], t1: /* sGroup */ js.UndefOr[java.lang.String], t2: /* config */ js.UndefOr[js.Any]) => init(t0, t1, t2).runNow()))
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    initFrame.foreach(p => __obj.updateDynamic("initFrame")(p.toJsFn))
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
    onAvailable.foreach(p => __obj.updateDynamic("onAvailable")(p.toJsFn))
    if (onBeforeDrag != null) __obj.updateDynamic("onBeforeDrag")(js.Any.fromFunction2((t0: /* data */ js.UndefOr[js.Any], t1: /* e */ js.UndefOr[typingsJapgolly.std.Event_]) => onBeforeDrag(t0, t1).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_]) => onDrag(t0).runNow()))
    if (onDragDrop != null) __obj.updateDynamic("onDragDrop")(js.Any.fromFunction2((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t1: /* id */ js.UndefOr[js.Any]) => onDragDrop(t0, t1).runNow()))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction2((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t1: /* id */ js.UndefOr[js.Any]) => onDragEnter(t0, t1).runNow()))
    if (onDragOut != null) __obj.updateDynamic("onDragOut")(js.Any.fromFunction2((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t1: /* id */ js.UndefOr[js.Any]) => onDragOut(t0, t1).runNow()))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction2((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_], t1: /* id */ js.UndefOr[js.Any]) => onDragOver(t0, t1).runNow()))
    if (onInitDrag != null) __obj.updateDynamic("onInitDrag")(js.Any.fromFunction2((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double]) => onInitDrag(t0, t1).runNow()))
    if (onInvalidDrop != null) __obj.updateDynamic("onInvalidDrop")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_]) => onInvalidDrop(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_]) => onMouseDown(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.std.Event_]) => onMouseUp(t0).runNow()))
    if (onStartDrag != null) __obj.updateDynamic("onStartDrag")(js.Any.fromFunction2((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double]) => onStartDrag(t0, t1).runNow()))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryButtonOnly)) __obj.updateDynamic("primaryButtonOnly")(primaryButtonOnly.asInstanceOf[js.Any])
    if (removeFromGroup != null) __obj.updateDynamic("removeFromGroup")(js.Any.fromFunction1((t0: /* sGroup */ js.UndefOr[java.lang.String]) => removeFromGroup(t0).runNow()))
    if (removeInvalidHandleClass != null) __obj.updateDynamic("removeInvalidHandleClass")(js.Any.fromFunction1((t0: /* cssClass */ js.UndefOr[java.lang.String]) => removeInvalidHandleClass(t0).runNow()))
    if (removeInvalidHandleId != null) __obj.updateDynamic("removeInvalidHandleId")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[java.lang.String]) => removeInvalidHandleId(t0).runNow()))
    if (removeInvalidHandleType != null) __obj.updateDynamic("removeInvalidHandleType")(js.Any.fromFunction1((t0: /* tagName */ js.UndefOr[java.lang.String]) => removeInvalidHandleType(t0).runNow()))
    if (repairHighlightColor != null) __obj.updateDynamic("repairHighlightColor")(repairHighlightColor.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resetConstraints != null) __obj.updateDynamic("resetConstraints")(js.Any.fromFunction1((t0: /* maintainOffset */ js.UndefOr[scala.Boolean]) => resetConstraints(t0).runNow()))
    if (!js.isUndefined(resizeFrame)) __obj.updateDynamic("resizeFrame")(resizeFrame.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (scrollEl != null) __obj.updateDynamic("scrollEl")(scrollEl.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDelta != null) __obj.updateDynamic("setDelta")(js.Any.fromFunction2((t0: /* iDeltaX */ js.UndefOr[scala.Double], t1: /* iDeltaY */ js.UndefOr[scala.Double]) => setDelta(t0, t1).runNow()))
    if (setDragElId != null) __obj.updateDynamic("setDragElId")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[java.lang.String]) => setDragElId(t0).runNow()))
    if (setDragElPos != null) __obj.updateDynamic("setDragElPos")(js.Any.fromFunction2((t0: /* iPageX */ js.UndefOr[scala.Double], t1: /* iPageY */ js.UndefOr[scala.Double]) => setDragElPos(t0, t1).runNow()))
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
    __obj.asInstanceOf[IDragZone]
  }
}

